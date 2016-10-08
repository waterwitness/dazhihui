package com.cairh.app.sjkh.util;

import android.content.Context;
import android.util.Log;
import com.e.a.a.b;
import com.e.a.a.t;
import com.e.a.a.v;
import com.e.a.a.z;
import java.security.KeyStore;
import java.util.Calendar;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.HttpParams;

public class HttpRequestUtil
{
  private static String Tag = "HttpRequestUtil";
  private static b client = new b();
  private HttpRequestUtil.IHttpRequest mContext;
  
  public HttpRequestUtil(HttpRequestUtil.IHttpRequest paramIHttpRequest)
  {
    this.mContext = paramIHttpRequest;
  }
  
  public static SSLSocketFactory createSSLSocketFactory()
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new t((KeyStore)localObject);
      return (SSLSocketFactory)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static CookieStore parseCookie(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramContext = new v(paramContext);
    int i;
    if (paramString3 != null)
    {
      paramString3 = paramString3.split(";");
      if (paramString3 != null)
      {
        int j = paramString3.length;
        i = 0;
        if (i < j) {
          break label40;
        }
      }
    }
    return paramContext;
    label40:
    Object localObject = paramString3[i];
    if (localObject == null) {}
    for (;;)
    {
      i += 1;
      break;
      localObject = ((String)localObject).split("=");
      if ((localObject != null) && (localObject.length > 1))
      {
        localObject = new BasicClientCookie(localObject[0], localObject[1]);
        ((BasicClientCookie)localObject).setDomain(paramString1);
        ((BasicClientCookie)localObject).setPath(paramString2);
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.add(12, 5);
        ((BasicClientCookie)localObject).setExpiryDate(localCalendar.getTime());
        ((BasicClientCookie)localObject).setVersion(0);
        paramContext.addCookie((Cookie)localObject);
      }
    }
  }
  
  public void httpPost(String paramString, z paramz, CookieStore paramCookieStore)
  {
    if (paramString == null) {
      Log.e(Tag, "url is nothing...");
    }
    Log.i(Tag, paramString);
    Log.i(Tag, "uploading...");
    if ((paramString.startsWith("https")) || (paramString.startsWith("HTTPS")))
    {
      SSLSocketFactory localSSLSocketFactory = createSSLSocketFactory();
      if (localSSLSocketFactory != null) {
        client.a(localSSLSocketFactory);
      }
    }
    client.a().getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
    if (paramCookieStore != null) {
      client.a(paramCookieStore);
    }
    client.a(120000);
    client.b(paramString, paramz, new HttpRequestUtil.1(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\HttpRequestUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */