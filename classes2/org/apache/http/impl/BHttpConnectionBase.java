package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ChunkedOutputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.ContentLengthOutputStream;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.impl.io.IdentityOutputStream;
import org.apache.http.impl.io.SessionInputBufferImpl;
import org.apache.http.impl.io.SessionOutputBufferImpl;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.NetUtils;

@NotThreadSafe
public class BHttpConnectionBase
  implements HttpConnection, HttpInetConnection
{
  private final HttpConnectionMetricsImpl connMetrics;
  private final SessionInputBufferImpl inbuffer;
  private final ContentLengthStrategy incomingContentStrategy;
  private volatile boolean open;
  private final SessionOutputBufferImpl outbuffer;
  private final ContentLengthStrategy outgoingContentStrategy;
  private volatile Socket socket;
  
  protected BHttpConnectionBase(int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2)
  {
    Args.positive(paramInt1, "Buffer size");
    HttpTransportMetricsImpl localHttpTransportMetricsImpl1 = new HttpTransportMetricsImpl();
    HttpTransportMetricsImpl localHttpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
    if (paramMessageConstraints != null)
    {
      this.inbuffer = new SessionInputBufferImpl(localHttpTransportMetricsImpl1, paramInt1, -1, paramMessageConstraints, paramCharsetDecoder);
      this.outbuffer = new SessionOutputBufferImpl(localHttpTransportMetricsImpl2, paramInt1, paramInt2, paramCharsetEncoder);
      this.connMetrics = new HttpConnectionMetricsImpl(localHttpTransportMetricsImpl1, localHttpTransportMetricsImpl2);
      if (paramContentLengthStrategy1 == null) {
        break label115;
      }
      label89:
      this.incomingContentStrategy = paramContentLengthStrategy1;
      if (paramContentLengthStrategy2 == null) {
        break label123;
      }
    }
    for (;;)
    {
      this.outgoingContentStrategy = paramContentLengthStrategy2;
      return;
      paramMessageConstraints = MessageConstraints.DEFAULT;
      break;
      label115:
      paramContentLengthStrategy1 = LaxContentLengthStrategy.INSTANCE;
      break label89;
      label123:
      paramContentLengthStrategy2 = StrictContentLengthStrategy.INSTANCE;
    }
  }
  
  private int fillInputBuffer(int paramInt)
  {
    int i = this.socket.getSoTimeout();
    try
    {
      this.socket.setSoTimeout(paramInt);
      paramInt = this.inbuffer.fillBuffer();
      return paramInt;
    }
    finally
    {
      this.socket.setSoTimeout(i);
    }
  }
  
  protected boolean awaitInput(int paramInt)
  {
    if (this.inbuffer.hasBufferedData()) {
      return true;
    }
    fillInputBuffer(paramInt);
    return this.inbuffer.hasBufferedData();
  }
  
  protected void bind(Socket paramSocket)
  {
    Args.notNull(paramSocket, "Socket");
    this.socket = paramSocket;
    this.open = true;
    this.inbuffer.bind(null);
    this.outbuffer.bind(null);
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 116	org/apache/http/impl/BHttpConnectionBase:open	Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield 116	org/apache/http/impl/BHttpConnectionBase:open	Z
    //   13: aload_0
    //   14: getfield 85	org/apache/http/impl/BHttpConnectionBase:socket	Ljava/net/Socket;
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 45	org/apache/http/impl/BHttpConnectionBase:inbuffer	Lorg/apache/http/impl/io/SessionInputBufferImpl;
    //   22: invokevirtual 130	org/apache/http/impl/io/SessionInputBufferImpl:clear	()V
    //   25: aload_0
    //   26: getfield 52	org/apache/http/impl/BHttpConnectionBase:outbuffer	Lorg/apache/http/impl/io/SessionOutputBufferImpl;
    //   29: invokevirtual 133	org/apache/http/impl/io/SessionOutputBufferImpl:flush	()V
    //   32: aload_1
    //   33: invokevirtual 136	java/net/Socket:shutdownOutput	()V
    //   36: aload_1
    //   37: invokevirtual 139	java/net/Socket:shutdownInput	()V
    //   40: aload_1
    //   41: invokevirtual 141	java/net/Socket:close	()V
    //   44: return
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 141	java/net/Socket:close	()V
    //   50: aload_2
    //   51: athrow
    //   52: astore_2
    //   53: goto -17 -> 36
    //   56: astore_2
    //   57: goto -17 -> 40
    //   60: astore_2
    //   61: goto -21 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	BHttpConnectionBase
    //   17	30	1	localSocket	Socket
    //   45	6	2	localObject	Object
    //   52	1	2	localIOException1	IOException
    //   56	1	2	localIOException2	IOException
    //   60	1	2	localUnsupportedOperationException	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   18	32	45	finally
    //   32	36	45	finally
    //   36	40	45	finally
    //   32	36	52	java/io/IOException
    //   36	40	56	java/io/IOException
    //   32	36	60	java/lang/UnsupportedOperationException
    //   36	40	60	java/lang/UnsupportedOperationException
  }
  
  protected InputStream createInputStream(long paramLong, SessionInputBuffer paramSessionInputBuffer)
  {
    if (paramLong == -2L) {
      return new ChunkedInputStream(paramSessionInputBuffer);
    }
    if (paramLong == -1L) {
      return new IdentityInputStream(paramSessionInputBuffer);
    }
    return new ContentLengthInputStream(paramSessionInputBuffer, paramLong);
  }
  
  protected OutputStream createOutputStream(long paramLong, SessionOutputBuffer paramSessionOutputBuffer)
  {
    if (paramLong == -2L) {
      return new ChunkedOutputStream(2048, paramSessionOutputBuffer);
    }
    if (paramLong == -1L) {
      return new IdentityOutputStream(paramSessionOutputBuffer);
    }
    return new ContentLengthOutputStream(paramSessionOutputBuffer, paramLong);
  }
  
  protected void doFlush()
  {
    this.outbuffer.flush();
  }
  
  protected void ensureOpen()
  {
    Asserts.check(this.open, "Connection is not open");
    if (!this.inbuffer.isBound()) {
      this.inbuffer.bind(getSocketInputStream(this.socket));
    }
    if (!this.outbuffer.isBound()) {
      this.outbuffer.bind(getSocketOutputStream(this.socket));
    }
  }
  
  public InetAddress getLocalAddress()
  {
    if (this.socket != null) {
      return this.socket.getLocalAddress();
    }
    return null;
  }
  
  public int getLocalPort()
  {
    if (this.socket != null) {
      return this.socket.getLocalPort();
    }
    return -1;
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return this.connMetrics;
  }
  
  public InetAddress getRemoteAddress()
  {
    if (this.socket != null) {
      return this.socket.getInetAddress();
    }
    return null;
  }
  
  public int getRemotePort()
  {
    if (this.socket != null) {
      return this.socket.getPort();
    }
    return -1;
  }
  
  protected SessionInputBuffer getSessionInputBuffer()
  {
    return this.inbuffer;
  }
  
  protected SessionOutputBuffer getSessionOutputBuffer()
  {
    return this.outbuffer;
  }
  
  protected Socket getSocket()
  {
    return this.socket;
  }
  
  protected InputStream getSocketInputStream(Socket paramSocket)
  {
    return paramSocket.getInputStream();
  }
  
  protected OutputStream getSocketOutputStream(Socket paramSocket)
  {
    return paramSocket.getOutputStream();
  }
  
  public int getSocketTimeout()
  {
    int i = -1;
    if (this.socket != null) {}
    try
    {
      i = this.socket.getSoTimeout();
      return i;
    }
    catch (SocketException localSocketException) {}
    return -1;
  }
  
  protected void incrementRequestCount()
  {
    this.connMetrics.incrementRequestCount();
  }
  
  protected void incrementResponseCount()
  {
    this.connMetrics.incrementResponseCount();
  }
  
  public boolean isOpen()
  {
    return this.open;
  }
  
  public boolean isStale()
  {
    if (!isOpen()) {}
    for (;;)
    {
      return true;
      try
      {
        int i = fillInputBuffer(1);
        if (i >= 0) {
          return false;
        }
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        return false;
      }
      catch (IOException localIOException) {}
    }
    return true;
  }
  
  protected HttpEntity prepareInput(HttpMessage paramHttpMessage)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    long l = this.incomingContentStrategy.determineLength(paramHttpMessage);
    Object localObject = createInputStream(l, this.inbuffer);
    if (l == -2L)
    {
      localBasicHttpEntity.setChunked(true);
      localBasicHttpEntity.setContentLength(-1L);
      localBasicHttpEntity.setContent((InputStream)localObject);
    }
    for (;;)
    {
      localObject = paramHttpMessage.getFirstHeader("Content-Type");
      if (localObject != null) {
        localBasicHttpEntity.setContentType((Header)localObject);
      }
      paramHttpMessage = paramHttpMessage.getFirstHeader("Content-Encoding");
      if (paramHttpMessage != null) {
        localBasicHttpEntity.setContentEncoding(paramHttpMessage);
      }
      return localBasicHttpEntity;
      if (l == -1L)
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(-1L);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
      else
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(l);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
    }
  }
  
  protected OutputStream prepareOutput(HttpMessage paramHttpMessage)
  {
    return createOutputStream(this.outgoingContentStrategy.determineLength(paramHttpMessage), this.outbuffer);
  }
  
  public void setSocketTimeout(int paramInt)
  {
    if (this.socket != null) {}
    try
    {
      this.socket.setSoTimeout(paramInt);
      return;
    }
    catch (SocketException localSocketException) {}
  }
  
  public void shutdown()
  {
    this.open = false;
    Socket localSocket = this.socket;
    if (localSocket != null) {
      localSocket.close();
    }
  }
  
  public String toString()
  {
    if (this.socket != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      SocketAddress localSocketAddress1 = this.socket.getRemoteSocketAddress();
      SocketAddress localSocketAddress2 = this.socket.getLocalSocketAddress();
      if ((localSocketAddress1 != null) && (localSocketAddress2 != null))
      {
        NetUtils.formatAddress(localStringBuilder, localSocketAddress2);
        localStringBuilder.append("<->");
        NetUtils.formatAddress(localStringBuilder, localSocketAddress1);
      }
      return localStringBuilder.toString();
    }
    return "[Not bound]";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\BHttpConnectionBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */