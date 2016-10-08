package com.baidu.location.b;

import android.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class t
  extends Thread
{
  t(n paramn) {}
  
  public void run()
  {
    this.a.c = l.b();
    this.a.a();
    int j = this.a.d;
    n.a(this.a);
    Object localObject1;
    int i;
    if (n.b == f.d)
    {
      localObject1 = null;
      i = 1;
      if (j <= 0) {}
    }
    for (;;)
    {
      try
      {
        localHttpPost = new HttpPost(this.a.c);
        k = i;
        m = i;
      }
      catch (Error localError2)
      {
        HttpPost localHttpPost;
        int k;
        int m;
        HttpHost localHttpHost;
        Object localObject2;
        continue;
      }
      catch (Exception localException2)
      {
        continue;
      }
      try
      {
        localObject1 = new UrlEncodedFormEntity(this.a.f, "utf-8");
        k = i;
        m = i;
        localHttpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        k = i;
        m = i;
        localHttpPost.setHeader("Accept-Charset", "UTF-8;");
        k = i;
        m = i;
        localHttpPost.setEntity((HttpEntity)localObject1);
        k = i;
        m = i;
        localObject1 = new DefaultHttpClient();
        k = i;
        m = i;
        ((HttpClient)localObject1).getParams().setParameter("http.connection.timeout", Integer.valueOf(f.b));
        k = i;
        m = i;
        ((HttpClient)localObject1).getParams().setParameter("http.socket.timeout", Integer.valueOf(f.b));
        k = i;
        m = i;
        HttpProtocolParams.setUseExpectContinue(((HttpClient)localObject1).getParams(), false);
        if (i == 0) {
          break label497;
        }
        k = i;
        m = i;
        localHttpHost = new HttpHost(n.h(), n.i(), "http");
        k = i;
        m = i;
        ((HttpClient)localObject1).getParams().setParameter("http.route.default-proxy", localHttpHost);
      }
      catch (Exception localException1)
      {
        localObject2 = localHttpPost;
        i = k;
        ((HttpPost)localObject2).abort();
        Log.d(f.a, "NetworkCommunicationException!");
        continue;
      }
      catch (Error localError1)
      {
        localObject3 = localHttpPost;
        i = m;
        ((HttpPost)localObject3).abort();
        Log.d(f.a, "NetworkCommunicationException!");
        continue;
        n.j = 0;
        continue;
      }
      k = i;
      m = i;
      localObject1 = ((HttpClient)localObject1).execute(localHttpPost);
      k = i;
      m = i;
      if (((HttpResponse)localObject1).getStatusLine().getStatusCode() == 200)
      {
        k = i;
        m = i;
        this.a.e = ((HttpResponse)localObject1).getEntity();
        k = i;
        m = i;
        this.a.a(true);
        if (j <= 0)
        {
          n.j += 1;
          this.a.e = null;
          this.a.a(false);
          n.a(this.a, false);
          return;
          i = 0;
        }
      }
      else
      {
        k = i;
        m = i;
        localHttpPost.abort();
        localObject1 = localHttpPost;
        j -= 1;
        break;
      }
      Object localObject3 = null;
      i = 0;
      break;
      label497:
      if (i == 0) {
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */