package com.squareup.okhttp;

import java.net.Proxy;
import java.net.URL;
import java.util.List;

public abstract interface OkAuthenticator
{
  public abstract OkAuthenticator.Credential authenticate(Proxy paramProxy, URL paramURL, List<OkAuthenticator.Challenge> paramList);
  
  public abstract OkAuthenticator.Credential authenticateProxy(Proxy paramProxy, URL paramURL, List<OkAuthenticator.Challenge> paramList);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\OkAuthenticator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */