package com.baidu.location.b;

import android.util.Log;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class s
  extends Thread
{
  s(n paramn) {}
  
  public void run()
  {
    this.a.c = l.b();
    this.a.a();
    int j = this.a.d;
    n.a(this.a);
    int i;
    int k;
    if (n.b == f.d)
    {
      i = 1;
      if (j > 0) {
        k = i;
      }
    }
    for (;;)
    {
      try
      {
        localHttpGet = new HttpGet(this.a.c);
        k = i;
        localHttpGet.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        k = i;
        localHttpGet.setHeader("Accept-Charset", "UTF-8;");
        k = i;
        localObject = new DefaultHttpClient();
        k = i;
        ((HttpClient)localObject).getParams().setParameter("http.connection.timeout", Integer.valueOf(f.b));
        k = i;
        ((HttpClient)localObject).getParams().setParameter("http.socket.timeout", Integer.valueOf(f.b));
        k = i;
        HttpProtocolParams.setUseExpectContinue(((HttpClient)localObject).getParams(), false);
        if (i == 0) {
          break label368;
        }
        k = i;
        HttpHost localHttpHost = new HttpHost(n.h(), n.i(), "http");
        k = i;
        ((HttpClient)localObject).getParams().setParameter("http.route.default-proxy", localHttpHost);
      }
      catch (Exception localException)
      {
        HttpGet localHttpGet;
        Object localObject;
        Log.d(f.a, "NetworkCommunicationException!");
        i = k;
        continue;
        n.j = 0;
        continue;
      }
      k = i;
      localObject = ((HttpClient)localObject).execute(localHttpGet);
      k = i;
      if (((HttpResponse)localObject).getStatusLine().getStatusCode() == 200)
      {
        k = i;
        this.a.e = ((HttpResponse)localObject).getEntity();
        k = i;
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
        localHttpGet.abort();
        j -= 1;
        break;
      }
      i = 0;
      break;
      label368:
      if (i == 0) {
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */