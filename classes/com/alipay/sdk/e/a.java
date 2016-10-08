package com.alipay.sdk.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

public final class a
{
  public String a;
  private Context b;
  
  public a(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.a = paramString;
  }
  
  private URL a()
  {
    try
    {
      URL localURL = new URL(this.a);
      return localURL;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private NetworkInfo b()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)this.b.getSystemService("connectivity")).getActiveNetworkInfo();
      return localNetworkInfo;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private String c()
  {
    try
    {
      Object localObject = b();
      if ((localObject != null) && (((NetworkInfo)localObject).isAvailable()))
      {
        if (((NetworkInfo)localObject).getType() == 1) {
          return "wifi";
        }
        localObject = ((NetworkInfo)localObject).getExtraInfo().toLowerCase();
        return (String)localObject;
      }
      return "none";
    }
    catch (Exception localException) {}
    return "none";
  }
  
  public final HttpResponse a(byte[] paramArrayOfByte, List<Header> paramList)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    new StringBuilder("requestUrl : ").append(this.a);
    b localb = b.a();
    if (localb == null) {
      paramArrayOfByte = (byte[])localObject1;
    }
    label180:
    label248:
    label317:
    do
    {
      do
      {
        do
        {
          return paramArrayOfByte;
          for (;;)
          {
            try
            {
              HttpParams localHttpParams = localb.b.getParams();
              if (Build.VERSION.SDK_INT < 11) {
                break label248;
              }
              localObject1 = c();
              if ((localObject1 == null) || (((String)localObject1).contains("wap"))) {
                break label180;
              }
              localObject1 = localObject2;
              if (localObject1 != null) {
                localHttpParams.setParameter("http.route.default-proxy", localObject1);
              }
              if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0)) {
                break label317;
              }
              paramArrayOfByte = new HttpGet(this.a);
              if (paramList == null) {
                break;
              }
              paramList = paramList.iterator();
              if (!paramList.hasNext()) {
                break;
              }
              paramArrayOfByte.addHeader((Header)paramList.next());
              continue;
              try
              {
                paramList = localb.b.getConnectionManager();
                if (paramList != null)
                {
                  paramList.shutdown();
                  b.a = null;
                }
              }
              catch (Throwable paramList)
              {
                Object localObject3;
                String str;
                int i;
                for (;;) {}
              }
            }
            catch (Throwable paramArrayOfByte)
            {
              if (localb == null) {}
            }
            throw paramArrayOfByte;
            localObject3 = a();
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              "https".equalsIgnoreCase(((URL)localObject3).getProtocol());
              localObject3 = System.getProperty("https.proxyHost");
              str = System.getProperty("https.proxyPort");
              localObject1 = localObject2;
              if (!TextUtils.isEmpty((CharSequence)localObject3))
              {
                localObject1 = new HttpHost((String)localObject3, Integer.parseInt(str));
                continue;
                localObject3 = b();
                localObject1 = localObject2;
                if (localObject3 != null)
                {
                  localObject1 = localObject2;
                  if (((NetworkInfo)localObject3).isAvailable())
                  {
                    localObject1 = localObject2;
                    if (((NetworkInfo)localObject3).getType() == 0)
                    {
                      localObject3 = Proxy.getDefaultHost();
                      i = Proxy.getDefaultPort();
                      localObject1 = localObject2;
                      if (localObject3 != null)
                      {
                        localObject1 = new HttpHost((String)localObject3, i);
                        continue;
                        localObject1 = new HttpPost(this.a);
                        paramArrayOfByte = new ByteArrayEntity(paramArrayOfByte);
                        paramArrayOfByte.setContentType("application/octet-stream;binary/octet-stream");
                        ((HttpPost)localObject1).setEntity(paramArrayOfByte);
                        ((HttpUriRequest)localObject1).addHeader("Accept-Charset", "UTF-8");
                        ((HttpUriRequest)localObject1).addHeader("Connection", "Keep-Alive");
                        ((HttpUriRequest)localObject1).addHeader("Keep-Alive", "timeout=180, max=100");
                        paramArrayOfByte = (byte[])localObject1;
                      }
                    }
                  }
                }
              }
            }
          }
          paramList = localb.a(paramArrayOfByte);
          paramArrayOfByte = paramList.getHeaders("X-Hostname");
          if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0) && (paramArrayOfByte[0] != null)) {
            paramList.getHeaders("X-Hostname")[0].toString();
          }
          localObject1 = paramList.getHeaders("X-ExecuteTime");
          paramArrayOfByte = paramList;
        } while (localObject1 == null);
        paramArrayOfByte = paramList;
      } while (localObject1.length <= 0);
      paramArrayOfByte = paramList;
    } while (localObject1[0] == null);
    paramList.getHeaders("X-ExecuteTime")[0].toString();
    return paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */