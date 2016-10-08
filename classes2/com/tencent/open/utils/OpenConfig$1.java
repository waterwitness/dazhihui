package com.tencent.open.utils;

import android.os.Bundle;
import org.json.JSONObject;

class OpenConfig$1
  extends Thread
{
  OpenConfig$1(OpenConfig paramOpenConfig, Bundle paramBundle) {}
  
  public void run()
  {
    try
    {
      JSONObject localJSONObject = Util.parseJson(HttpUtils.openUrl2(OpenConfig.a(this.b), "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", "GET", this.a).response);
      OpenConfig.a(this.b, localJSONObject);
      OpenConfig.a(this.b, 0);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\OpenConfig$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */