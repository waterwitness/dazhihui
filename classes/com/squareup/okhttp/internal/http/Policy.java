package com.squareup.okhttp.internal.http;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public abstract interface Policy
{
  public abstract int getChunkLength();
  
  public abstract long getFixedContentLength();
  
  public abstract HttpURLConnection getHttpConnectionToCache();
  
  public abstract long getIfModifiedSince();
  
  public abstract URL getURL();
  
  public abstract boolean getUseCaches();
  
  public abstract void setSelectedProxy(Proxy paramProxy);
  
  public abstract boolean usingProxy();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Policy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */