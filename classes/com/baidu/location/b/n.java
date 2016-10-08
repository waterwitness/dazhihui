package com.baidu.location.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import java.security.KeyStore;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public abstract class n
{
  public static int b = f.g;
  protected static int j = 0;
  private static String k = "10.0.0.172";
  private static int l = 80;
  private boolean a = false;
  public String c = null;
  public int d = 3;
  public HttpEntity e = null;
  public List f = null;
  public String g = null;
  public byte[] h = null;
  public String i = null;
  
  private static int a(Context paramContext, NetworkInfo paramNetworkInfo)
  {
    if ((paramNetworkInfo != null) && (paramNetworkInfo.getExtraInfo() != null))
    {
      paramContext = paramNetworkInfo.getExtraInfo().toLowerCase();
      if (paramContext != null)
      {
        if ((paramContext.startsWith("cmwap")) || (paramContext.startsWith("uniwap")) || (paramContext.startsWith("3gwap")))
        {
          paramContext = Proxy.getDefaultHost();
          if ((paramContext != null) && (!paramContext.equals("")) && (!paramContext.equals("null"))) {}
          for (;;)
          {
            k = paramContext;
            return f.d;
            paramContext = "10.0.0.172";
          }
        }
        if (paramContext.startsWith("ctwap"))
        {
          paramContext = Proxy.getDefaultHost();
          if ((paramContext != null) && (!paramContext.equals("")) && (!paramContext.equals("null"))) {}
          for (;;)
          {
            k = paramContext;
            return f.d;
            paramContext = "10.0.0.200";
          }
        }
        if ((paramContext.startsWith("cmnet")) || (paramContext.startsWith("uninet")) || (paramContext.startsWith("ctnet")) || (paramContext.startsWith("3gnet"))) {
          return f.e;
        }
      }
    }
    paramContext = Proxy.getDefaultHost();
    if ((paramContext != null) && (paramContext.length() > 0))
    {
      if ("10.0.0.172".equals(paramContext.trim()))
      {
        k = "10.0.0.172";
        return f.d;
      }
      if ("10.0.0.200".equals(paramContext.trim()))
      {
        k = "10.0.0.200";
        return f.d;
      }
    }
    return f.e;
  }
  
  public static HttpClient a(HttpParams paramHttpParams)
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new o((KeyStore)localObject);
      ((SSLSocketFactory)localObject).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      HttpProtocolParams.setVersion(paramHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(paramHttpParams, "UTF-8");
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", (SocketFactory)localObject, 443));
      localObject = new DefaultHttpClient(new ThreadSafeClientConnManager(paramHttpParams, localSchemeRegistry), paramHttpParams);
      return (HttpClient)localObject;
    }
    catch (Exception localException) {}
    return new DefaultHttpClient(paramHttpParams);
  }
  
  private void b()
  {
    b = c();
  }
  
  private int c()
  {
    Object localObject1 = com.baidu.location.f.b();
    try
    {
      Object localObject2 = (ConnectivityManager)((Context)localObject1).getSystemService("connectivity");
      if (localObject2 == null) {
        return f.g;
      }
      localObject2 = ((ConnectivityManager)localObject2).getActiveNetworkInfo();
      if ((localObject2 == null) || (!((NetworkInfo)localObject2).isAvailable())) {
        return f.g;
      }
      if (((NetworkInfo)localObject2).getType() == 1)
      {
        localObject1 = Proxy.getDefaultHost();
        if ((localObject1 != null) && (((String)localObject1).length() > 0)) {
          return f.h;
        }
        return f.f;
      }
      int m = a((Context)localObject1, (NetworkInfo)localObject2);
      return m;
    }
    catch (Exception localException) {}
    return f.g;
  }
  
  public abstract void a();
  
  public abstract void a(boolean paramBoolean);
  
  public void d()
  {
    new s(this).start();
  }
  
  public void e()
  {
    new t(this).start();
  }
  
  public void f()
  {
    new u(this).start();
  }
  
  public void g()
  {
    new v(this).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */