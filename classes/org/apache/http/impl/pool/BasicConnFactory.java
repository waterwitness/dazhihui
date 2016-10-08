package org.apache.http.impl.pool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Immutable;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnectionFactory;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.ConnFactory;
import org.apache.http.util.Args;

@Immutable
public class BasicConnFactory
  implements ConnFactory<HttpHost, HttpClientConnection>
{
  private final HttpConnectionFactory<? extends HttpClientConnection> connFactory;
  private final int connectTimeout;
  private final SocketFactory plainfactory;
  private final SocketConfig sconfig;
  private final SSLSocketFactory sslfactory;
  
  public BasicConnFactory()
  {
    this(null, null, 0, SocketConfig.DEFAULT, ConnectionConfig.DEFAULT);
  }
  
  public BasicConnFactory(int paramInt, SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this(null, null, paramInt, paramSocketConfig, paramConnectionConfig);
  }
  
  public BasicConnFactory(SocketFactory paramSocketFactory, SSLSocketFactory paramSSLSocketFactory, int paramInt, SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this.plainfactory = paramSocketFactory;
    this.sslfactory = paramSSLSocketFactory;
    this.connectTimeout = paramInt;
    if (paramSocketConfig != null)
    {
      this.sconfig = paramSocketConfig;
      if (paramConnectionConfig == null) {
        break label57;
      }
    }
    for (;;)
    {
      this.connFactory = new DefaultBHttpClientConnectionFactory(paramConnectionConfig);
      return;
      paramSocketConfig = SocketConfig.DEFAULT;
      break;
      label57:
      paramConnectionConfig = ConnectionConfig.DEFAULT;
    }
  }
  
  @Deprecated
  public BasicConnFactory(SSLSocketFactory paramSSLSocketFactory, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP params");
    this.plainfactory = null;
    this.sslfactory = paramSSLSocketFactory;
    this.connectTimeout = paramHttpParams.getIntParameter("http.connection.timeout", 0);
    this.sconfig = HttpParamConfig.getSocketConfig(paramHttpParams);
    this.connFactory = new DefaultBHttpClientConnectionFactory(HttpParamConfig.getConnectionConfig(paramHttpParams));
  }
  
  public BasicConnFactory(SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this(null, null, 0, paramSocketConfig, paramConnectionConfig);
  }
  
  @Deprecated
  public BasicConnFactory(HttpParams paramHttpParams)
  {
    this(null, paramHttpParams);
  }
  
  @Deprecated
  protected HttpClientConnection create(Socket paramSocket, HttpParams paramHttpParams)
  {
    paramHttpParams = new DefaultBHttpClientConnection(paramHttpParams.getIntParameter("http.socket.buffer-size", 8192));
    paramHttpParams.bind(paramSocket);
    return paramHttpParams;
  }
  
  public HttpClientConnection create(HttpHost paramHttpHost)
  {
    String str = paramHttpHost.getSchemeName();
    Object localObject = null;
    if ("http".equalsIgnoreCase(str))
    {
      if (this.plainfactory != null) {
        localObject = this.plainfactory.createSocket();
      }
    }
    else
    {
      if (!"https".equalsIgnoreCase(str)) {
        break label268;
      }
      if (this.sslfactory == null) {
        break label99;
      }
      localObject = this.sslfactory;
      label52:
      localObject = ((SocketFactory)localObject).createSocket();
    }
    label99:
    label262:
    label268:
    for (;;)
    {
      if (localObject == null)
      {
        throw new IOException(str + " scheme is not supported");
        localObject = new Socket();
        break;
        localObject = SSLSocketFactory.getDefault();
        break label52;
      }
      str = paramHttpHost.getHostName();
      int j = paramHttpHost.getPort();
      int i = j;
      if (j == -1)
      {
        if (paramHttpHost.getSchemeName().equalsIgnoreCase("http")) {
          i = 80;
        }
      }
      else
      {
        ((Socket)localObject).setSoTimeout(this.sconfig.getSoTimeout());
        ((Socket)localObject).connect(new InetSocketAddress(str, i), this.connectTimeout);
        ((Socket)localObject).setTcpNoDelay(this.sconfig.isTcpNoDelay());
        i = this.sconfig.getSoLinger();
        if (i >= 0) {
          if (i <= 0) {
            break label262;
          }
        }
      }
      for (boolean bool = true;; bool = false)
      {
        ((Socket)localObject).setSoLinger(bool, i);
        ((Socket)localObject).setKeepAlive(this.sconfig.isSoKeepAlive());
        return (HttpClientConnection)this.connFactory.createConnection((Socket)localObject);
        i = j;
        if (!paramHttpHost.getSchemeName().equalsIgnoreCase("https")) {
          break;
        }
        i = 443;
        break;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\impl\pool\BasicConnFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */