package com.baidu.location.b;

import android.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class v
  extends Thread
{
  v(n paramn) {}
  
  public void run()
  {
    this.a.c = l.c();
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
        try
        {
          localObject1 = new StringEntity(this.a.i, "UTF-8");
          k = i;
          localHttpPost.setHeader("Content-Type", "text/xml");
          k = i;
          localHttpPost.setEntity((HttpEntity)localObject1);
          k = i;
          localObject1 = new BasicHttpParams();
          k = i;
          HttpConnectionParams.setConnectionTimeout((HttpParams)localObject1, f.b);
          k = i;
          HttpConnectionParams.setSoTimeout((HttpParams)localObject1, f.b);
          k = i;
          localObject1 = n.a((HttpParams)localObject1);
          k = i;
          HttpProtocolParams.setUseExpectContinue(((HttpClient)localObject1).getParams(), false);
          if (i == 0) {
            break label381;
          }
          k = i;
          HttpHost localHttpHost = new HttpHost(n.h(), n.i(), "http");
          k = i;
          ((HttpClient)localObject1).getParams().setParameter("http.route.default-proxy", localHttpHost);
        }
        catch (Exception localException1)
        {
          localObject2 = localHttpPost;
          i = k;
        }
        k = i;
        localObject1 = ((HttpClient)localObject1).execute(localHttpPost);
        k = i;
        if (((HttpResponse)localObject1).getStatusLine().getStatusCode() == 200)
        {
          k = i;
          this.a.e = ((HttpResponse)localObject1).getEntity();
          k = i;
          this.a.a(true);
          if (j > 0) {
            continue;
          }
          n.j += 1;
          this.a.e = null;
          this.a.a(false);
          n.a(this.a, false);
          return;
          i = 0;
          continue;
        }
        k = i;
        localHttpPost.abort();
        localObject1 = localHttpPost;
        j -= 1;
      }
      catch (Exception localException2)
      {
        HttpPost localHttpPost;
        int k;
        continue;
      }
      ((HttpPost)localObject2).abort();
      Log.d(f.a, "NetworkCommunicationException!");
      continue;
      n.j = 0;
      continue;
      Object localObject2 = null;
      i = 0;
      break;
      label381:
      if (i == 0) {
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */