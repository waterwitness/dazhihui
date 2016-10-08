package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.http.HttpAuthenticator;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpTransport;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.SpdyTransport;
import com.squareup.okhttp.internal.spdy.SpdyConnection;
import com.squareup.okhttp.internal.spdy.SpdyConnection.Builder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class Connection
  implements Closeable
{
  private static final byte[] HTTP_11 = { 104, 116, 116, 112, 47, 49, 46, 49 };
  private static final byte[] NPN_PROTOCOLS = { 6, 115, 112, 100, 121, 47, 51, 8, 104, 116, 116, 112, 47, 49, 46, 49 };
  private static final byte[] SPDY3 = { 115, 112, 100, 121, 47, 51 };
  private boolean connected = false;
  private int httpMinorVersion = 1;
  private long idleStartTimeNs;
  private InputStream in;
  private OutputStream out;
  private final Route route;
  private Socket socket;
  private SpdyConnection spdyConnection;
  
  public Connection(Route paramRoute)
  {
    this.route = paramRoute;
  }
  
  private void makeTunnel(TunnelRequest paramTunnelRequest)
  {
    RawHeaders localRawHeaders1 = paramTunnelRequest.getRequestHeaders();
    RawHeaders localRawHeaders2;
    URL localURL;
    do
    {
      this.out.write(localRawHeaders1.toBytes());
      localRawHeaders2 = RawHeaders.fromBytes(this.in);
      switch (localRawHeaders2.getResponseCode())
      {
      default: 
        throw new IOException("Unexpected response code for CONNECT: " + localRawHeaders2.getResponseCode());
      case 407: 
        localRawHeaders1 = new RawHeaders(localRawHeaders1);
        localURL = new URL("https", paramTunnelRequest.host, paramTunnelRequest.port, "/");
      }
    } while (HttpAuthenticator.processAuthHeader(this.route.address.authenticator, 407, localRawHeaders2, localRawHeaders1, this.route.proxy, localURL));
    throw new IOException("Failed to authenticate with proxy");
  }
  
  private void streamWrapper()
  {
    this.in = new BufferedInputStream(this.in, 4096);
    this.out = new BufferedOutputStream(this.out, 256);
  }
  
  private void upgradeToTls(TunnelRequest paramTunnelRequest)
  {
    Object localObject = Platform.get();
    if (requiresTunnel()) {
      makeTunnel(paramTunnelRequest);
    }
    this.socket = this.route.address.sslSocketFactory.createSocket(this.socket, this.route.address.uriHost, this.route.address.uriPort, true);
    paramTunnelRequest = (SSLSocket)this.socket;
    if (this.route.modernTls)
    {
      ((Platform)localObject).enableTlsExtensions(paramTunnelRequest, this.route.address.uriHost);
      if ((!this.route.modernTls) || (!this.route.address.transports.contains("spdy/3"))) {
        break label217;
      }
    }
    label217:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        ((Platform)localObject).setNpnProtocols(paramTunnelRequest, NPN_PROTOCOLS);
      }
      paramTunnelRequest.startHandshake();
      if (this.route.address.hostnameVerifier.verify(this.route.address.uriHost, paramTunnelRequest.getSession())) {
        break label222;
      }
      throw new IOException("Hostname '" + this.route.address.uriHost + "' was not verified");
      ((Platform)localObject).supportTlsIntolerantServer(paramTunnelRequest);
      break;
    }
    label222:
    this.out = paramTunnelRequest.getOutputStream();
    this.in = paramTunnelRequest.getInputStream();
    streamWrapper();
    if (i != 0)
    {
      localObject = ((Platform)localObject).getNpnSelectedProtocol(paramTunnelRequest);
      if (localObject != null)
      {
        if (!Arrays.equals((byte[])localObject, SPDY3)) {
          break label312;
        }
        paramTunnelRequest.setSoTimeout(0);
        this.spdyConnection = new SpdyConnection.Builder(this.route.address.getUriHost(), true, this.in, this.out).build();
        this.spdyConnection.sendConnectionHeader();
      }
    }
    label312:
    while (Arrays.equals((byte[])localObject, HTTP_11)) {
      return;
    }
    throw new IOException("Unexpected NPN transport " + new String((byte[])localObject, "ISO-8859-1"));
  }
  
  public void close()
  {
    this.socket.close();
  }
  
  public void connect(int paramInt1, int paramInt2, TunnelRequest paramTunnelRequest)
  {
    if (this.connected) {
      throw new IllegalStateException("already connected");
    }
    Socket localSocket;
    if (this.route.proxy.type() != Proxy.Type.HTTP)
    {
      localSocket = new Socket(this.route.proxy);
      this.socket = localSocket;
      Platform.get().connectSocket(this.socket, this.route.inetSocketAddress, paramInt1);
      this.socket.setSoTimeout(paramInt2);
      this.in = this.socket.getInputStream();
      this.out = this.socket.getOutputStream();
      if (this.route.address.sslSocketFactory == null) {
        break label140;
      }
      upgradeToTls(paramTunnelRequest);
    }
    for (;;)
    {
      this.connected = true;
      return;
      localSocket = new Socket();
      break;
      label140:
      streamWrapper();
    }
  }
  
  public int getHttpMinorVersion()
  {
    return this.httpMinorVersion;
  }
  
  public long getIdleStartTimeNs()
  {
    if (this.spdyConnection == null) {
      return this.idleStartTimeNs;
    }
    return this.spdyConnection.getIdleStartTimeNs();
  }
  
  public Route getRoute()
  {
    return this.route;
  }
  
  public Socket getSocket()
  {
    return this.socket;
  }
  
  public SpdyConnection getSpdyConnection()
  {
    return this.spdyConnection;
  }
  
  public boolean isAlive()
  {
    return (!this.socket.isClosed()) && (!this.socket.isInputShutdown()) && (!this.socket.isOutputShutdown());
  }
  
  public boolean isConnected()
  {
    return this.connected;
  }
  
  public boolean isExpired(long paramLong)
  {
    return getIdleStartTimeNs() < System.nanoTime() - paramLong;
  }
  
  public boolean isIdle()
  {
    return (this.spdyConnection == null) || (this.spdyConnection.isIdle());
  }
  
  public boolean isReadable()
  {
    if (!(this.in instanceof BufferedInputStream)) {
      return true;
    }
    if (isSpdy()) {
      return true;
    }
    BufferedInputStream localBufferedInputStream = (BufferedInputStream)this.in;
    try
    {
      int i = this.socket.getSoTimeout();
      try
      {
        this.socket.setSoTimeout(1);
        localBufferedInputStream.mark(1);
        int j = localBufferedInputStream.read();
        if (j == -1) {
          return false;
        }
        localBufferedInputStream.reset();
        return true;
      }
      finally
      {
        this.socket.setSoTimeout(i);
      }
      return false;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      return true;
    }
    catch (IOException localIOException) {}
  }
  
  public boolean isSpdy()
  {
    return this.spdyConnection != null;
  }
  
  public Object newTransport(HttpEngine paramHttpEngine)
  {
    if (this.spdyConnection != null) {
      return new SpdyTransport(paramHttpEngine, this.spdyConnection);
    }
    return new HttpTransport(paramHttpEngine, this.out, this.in);
  }
  
  public boolean requiresTunnel()
  {
    return (this.route.address.sslSocketFactory != null) && (this.route.proxy.type() == Proxy.Type.HTTP);
  }
  
  public void resetIdleStartTime()
  {
    if (this.spdyConnection != null) {
      throw new IllegalStateException("spdyConnection != null");
    }
    this.idleStartTimeNs = System.nanoTime();
  }
  
  public void setHttpMinorVersion(int paramInt)
  {
    this.httpMinorVersion = paramInt;
  }
  
  public void updateReadTimeout(int paramInt)
  {
    if (!this.connected) {
      throw new IllegalStateException("updateReadTimeout - not connected");
    }
    this.socket.setSoTimeout(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Connection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */