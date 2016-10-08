package com.baidu.location.b;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class u
  extends Thread
{
  u(n paramn) {}
  
  public void run()
  {
    this.a.c = l.b();
    n.a(this.a);
    this.a.a();
    int j = this.a.d;
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
        Object localObject5;
        ByteArrayOutputStream localByteArrayOutputStream;
        Object localObject2;
        continue;
      }
      catch (Exception localException3)
      {
        continue;
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
        localHttpPost.setHeader("Host", "loc.map.baidu.com");
        k = i;
        m = i;
        localHttpPost.addHeader("Accept-Encoding", "gzip");
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
          break label722;
        }
        k = i;
        m = i;
        localObject5 = new HttpHost(n.h(), n.i(), "http");
        k = i;
        m = i;
        ((HttpClient)localObject1).getParams().setParameter("http.route.default-proxy", localObject5);
        break label722;
        k = i;
        m = i;
        localObject5 = ((HttpClient)localObject1).execute(localHttpPost);
        k = i;
        m = i;
        if (((HttpResponse)localObject5).getStatusLine().getStatusCode() == 200)
        {
          k = i;
          m = i;
          localObject1 = ((HttpResponse)localObject5).getEntity().getContent();
          k = i;
          m = i;
          localObject5 = ((HttpResponse)localObject5).getFirstHeader("Content-Encoding");
          if (localObject5 == null) {
            continue;
          }
          k = i;
          m = i;
          if (!((Header)localObject5).getValue().equalsIgnoreCase("gzip")) {
            continue;
          }
          k = i;
          m = i;
          localObject1 = new GZIPInputStream(new BufferedInputStream((InputStream)localObject1));
          k = i;
          m = i;
          localByteArrayOutputStream = new ByteArrayOutputStream();
          k = i;
          m = i;
          int n = ((InputStream)localObject1).read();
          if (n != -1)
          {
            k = i;
            m = i;
            localByteArrayOutputStream.write(n);
            continue;
          }
        }
      }
      catch (Exception localException1)
      {
        localObject2 = localHttpPost;
        i = k;
        ((HttpPost)localObject2).abort();
        Log.d(f.a, "NetworkCommunicationException!");
        j -= 1;
        break;
        i = 0;
        continue;
        k = i;
        m = i;
        localObject5 = localByteArrayOutputStream.toString();
        if (localObject2 != null) {
          m = i;
        }
        try
        {
          ((InputStream)localObject2).close();
          if (localByteArrayOutputStream != null)
          {
            m = i;
            localByteArrayOutputStream.close();
          }
        }
        catch (Exception localException2)
        {
          Object localObject3;
          continue;
        }
        k = i;
        m = i;
        this.a.e = new StringEntity((String)localObject5, "UTF-8");
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
          k = i;
          m = i;
          localHttpPost.abort();
          localObject2 = localHttpPost;
          continue;
        }
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
      Object localObject4 = null;
      i = 0;
      break;
      label722:
      if (i == 0) {
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */