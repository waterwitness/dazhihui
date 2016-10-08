package com.tencent.open.utils;

import android.content.Context;
import android.os.Bundle;
import com.tencent.open.a.f;

final class Util$1
  extends Thread
{
  Util$1(Context paramContext, Bundle paramBundle) {}
  
  public void run()
  {
    try
    {
      HttpUtils.openUrl2(this.a, "http://cgi.qplus.com/report/report", "GET", this.b);
      return;
    }
    catch (Exception localException)
    {
      f.e("openSDK_LOG.Util", "reportBernoulli has exception: " + localException.getMessage());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\Util$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */