package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class Route
{
  final Address address;
  final InetSocketAddress inetSocketAddress;
  final boolean modernTls;
  final Proxy proxy;
  
  public Route(Address paramAddress, Proxy paramProxy, InetSocketAddress paramInetSocketAddress, boolean paramBoolean)
  {
    if (paramAddress == null) {
      throw new NullPointerException("address == null");
    }
    if (paramProxy == null) {
      throw new NullPointerException("proxy == null");
    }
    if (paramInetSocketAddress == null) {
      throw new NullPointerException("inetSocketAddress == null");
    }
    this.address = paramAddress;
    this.proxy = paramProxy;
    this.inetSocketAddress = paramInetSocketAddress;
    this.modernTls = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof Route))
    {
      paramObject = (Route)paramObject;
      bool1 = bool2;
      if (this.address.equals(((Route)paramObject).address))
      {
        bool1 = bool2;
        if (this.proxy.equals(((Route)paramObject).proxy))
        {
          bool1 = bool2;
          if (this.inetSocketAddress.equals(((Route)paramObject).inetSocketAddress))
          {
            bool1 = bool2;
            if (this.modernTls == ((Route)paramObject).modernTls) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  Route flipTlsMode()
  {
    Address localAddress = this.address;
    Proxy localProxy = this.proxy;
    InetSocketAddress localInetSocketAddress = this.inetSocketAddress;
    if (this.modernTls) {}
    for (boolean bool = false;; bool = true) {
      return new Route(localAddress, localProxy, localInetSocketAddress, bool);
    }
  }
  
  public Address getAddress()
  {
    return this.address;
  }
  
  public Proxy getProxy()
  {
    return this.proxy;
  }
  
  public InetSocketAddress getSocketAddress()
  {
    return this.inetSocketAddress;
  }
  
  public int hashCode()
  {
    int i = this.address.hashCode();
    int j = this.proxy.hashCode();
    j = this.inetSocketAddress.hashCode() + ((i + 527) * 31 + j) * 31;
    if (this.modernTls) {}
    for (i = j * 31;; i = 0) {
      return i + j;
    }
  }
  
  public boolean isModernTls()
  {
    return this.modernTls;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Route.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */