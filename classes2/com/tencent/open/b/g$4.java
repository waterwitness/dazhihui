package com.tencent.open.b;

import android.os.Bundle;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.OpenConfig;
import com.tencent.open.utils.Util;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;

class g$4
  implements Runnable
{
  g$4(g paramg) {}
  
  public void run()
  {
    int k = 0;
    for (;;)
    {
      int i;
      int m;
      try
      {
        localBundle = this.a.c();
        if (localBundle == null) {
          return;
        }
        i = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_HttpRetryCount");
        if (i == 0)
        {
          i = 3;
          com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, retryCount: " + i);
          j = 0;
          m = j + 1;
        }
      }
      catch (Exception localException1)
      {
        Bundle localBundle;
        HttpClient localHttpClient;
        HttpPost localHttpPost;
        int n;
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception out.", localException1);
        return;
      }
      try
      {
        localHttpClient = HttpUtils.getHttpClient(Global.getContext(), null, "http://wspeed.qq.com/w.cgi");
        localHttpPost = new HttpPost("http://wspeed.qq.com/w.cgi");
        localHttpPost.addHeader("Accept-Encoding", "gzip");
        localHttpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        localHttpPost.setEntity(new ByteArrayEntity(Util.getBytesUTF8(HttpUtils.encodeUrl(localBundle))));
        n = localHttpClient.execute(localHttpPost).getStatusLine().getStatusCode();
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, statusCode: " + n);
        j = k;
        if (n == 200)
        {
          f.a().b("report_cgi");
          j = 1;
        }
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", localConnectTimeoutException);
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", localSocketTimeoutException);
      }
      catch (Exception localException2)
      {
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", localException2);
        j = k;
        continue;
      }
      if (j == 0) {
        f.a().a("report_cgi", this.a.c);
      }
      this.a.c.clear();
      return;
      continue;
      int j = m;
      if (m >= i) {
        j = k;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b\g$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */