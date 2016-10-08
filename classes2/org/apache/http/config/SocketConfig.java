package org.apache.http.config;

import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class SocketConfig
  implements Cloneable
{
  public static final SocketConfig DEFAULT = new SocketConfig.Builder().build();
  private final boolean soKeepAlive;
  private final int soLinger;
  private final boolean soReuseAddress;
  private final int soTimeout;
  private final boolean tcpNoDelay;
  
  SocketConfig(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.soTimeout = paramInt1;
    this.soReuseAddress = paramBoolean1;
    this.soLinger = paramInt2;
    this.soKeepAlive = paramBoolean2;
    this.tcpNoDelay = paramBoolean3;
  }
  
  public static SocketConfig.Builder copy(SocketConfig paramSocketConfig)
  {
    Args.notNull(paramSocketConfig, "Socket config");
    return new SocketConfig.Builder().setSoTimeout(paramSocketConfig.getSoTimeout()).setSoReuseAddress(paramSocketConfig.isSoReuseAddress()).setSoLinger(paramSocketConfig.getSoLinger()).setSoKeepAlive(paramSocketConfig.isSoKeepAlive()).setTcpNoDelay(paramSocketConfig.isTcpNoDelay());
  }
  
  public static SocketConfig.Builder custom()
  {
    return new SocketConfig.Builder();
  }
  
  protected SocketConfig clone()
  {
    return (SocketConfig)super.clone();
  }
  
  public int getSoLinger()
  {
    return this.soLinger;
  }
  
  public int getSoTimeout()
  {
    return this.soTimeout;
  }
  
  public boolean isSoKeepAlive()
  {
    return this.soKeepAlive;
  }
  
  public boolean isSoReuseAddress()
  {
    return this.soReuseAddress;
  }
  
  public boolean isTcpNoDelay()
  {
    return this.tcpNoDelay;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[soTimeout=").append(this.soTimeout).append(", soReuseAddress=").append(this.soReuseAddress).append(", soLinger=").append(this.soLinger).append(", soKeepAlive=").append(this.soKeepAlive).append(", tcpNoDelay=").append(this.tcpNoDelay).append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\config\SocketConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */