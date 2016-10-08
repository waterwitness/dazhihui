package com.squareup.okhttp.internal;

import java.net.InetAddress;

public abstract interface Dns
{
  public static final Dns DEFAULT = new Dns.1();
  
  public abstract InetAddress[] getAllByName(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\Dns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */