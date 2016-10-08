package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.net.Proxy;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class Address
{
  final OkAuthenticator authenticator;
  final HostnameVerifier hostnameVerifier;
  final Proxy proxy;
  final SSLSocketFactory sslSocketFactory;
  final List<String> transports;
  final String uriHost;
  final int uriPort;
  
  public Address(String paramString, int paramInt, SSLSocketFactory paramSSLSocketFactory, HostnameVerifier paramHostnameVerifier, OkAuthenticator paramOkAuthenticator, Proxy paramProxy, List<String> paramList)
  {
    if (paramString == null) {
      throw new NullPointerException("uriHost == null");
    }
    if (paramInt <= 0) {
      throw new IllegalArgumentException("uriPort <= 0: " + paramInt);
    }
    if (paramOkAuthenticator == null) {
      throw new IllegalArgumentException("authenticator == null");
    }
    if (paramList == null) {
      throw new IllegalArgumentException("transports == null");
    }
    this.proxy = paramProxy;
    this.uriHost = paramString;
    this.uriPort = paramInt;
    this.sslSocketFactory = paramSSLSocketFactory;
    this.hostnameVerifier = paramHostnameVerifier;
    this.authenticator = paramOkAuthenticator;
    this.transports = Util.immutableList(paramList);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof Address))
    {
      paramObject = (Address)paramObject;
      bool1 = bool2;
      if (Util.equal(this.proxy, ((Address)paramObject).proxy))
      {
        bool1 = bool2;
        if (this.uriHost.equals(((Address)paramObject).uriHost))
        {
          bool1 = bool2;
          if (this.uriPort == ((Address)paramObject).uriPort)
          {
            bool1 = bool2;
            if (Util.equal(this.sslSocketFactory, ((Address)paramObject).sslSocketFactory))
            {
              bool1 = bool2;
              if (Util.equal(this.hostnameVerifier, ((Address)paramObject).hostnameVerifier))
              {
                bool1 = bool2;
                if (Util.equal(this.authenticator, ((Address)paramObject).authenticator))
                {
                  bool1 = bool2;
                  if (Util.equal(this.transports, ((Address)paramObject).transports)) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public OkAuthenticator getAuthenticator()
  {
    return this.authenticator;
  }
  
  public HostnameVerifier getHostnameVerifier()
  {
    return this.hostnameVerifier;
  }
  
  public Proxy getProxy()
  {
    return this.proxy;
  }
  
  public SSLSocketFactory getSslSocketFactory()
  {
    return this.sslSocketFactory;
  }
  
  public List<String> getTransports()
  {
    return this.transports;
  }
  
  public String getUriHost()
  {
    return this.uriHost;
  }
  
  public int getUriPort()
  {
    return this.uriPort;
  }
  
  public int hashCode()
  {
    int m = 0;
    int n = this.uriHost.hashCode();
    int i1 = this.uriPort;
    int i;
    int j;
    if (this.sslSocketFactory != null)
    {
      i = this.sslSocketFactory.hashCode();
      if (this.hostnameVerifier == null) {
        break label131;
      }
      j = this.hostnameVerifier.hashCode();
      label48:
      if (this.authenticator == null) {
        break label136;
      }
    }
    label131:
    label136:
    for (int k = this.authenticator.hashCode();; k = 0)
    {
      if (this.proxy != null) {
        m = this.proxy.hashCode();
      }
      return ((k + (j + (i + ((n + 527) * 31 + i1) * 31) * 31) * 31) * 31 + m) * 31 + this.transports.hashCode();
      i = 0;
      break;
      j = 0;
      break label48;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Address.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */