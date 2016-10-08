package com.iflytek.thirdparty;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.iflytek.cloud.SpeechError;
import org.apache.http.util.EncodingUtils;
import org.json.JSONObject;

class Z$3
  implements P.a
{
  Z$3(Z paramZ) {}
  
  public void a(SpeechError paramSpeechError)
  {
    Z.b(this.a, false);
    X.c("CollectInfo", "" + paramSpeechError.getErrorCode());
  }
  
  public void a(P paramP, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        paramP = new JSONObject(EncodingUtils.getString(K.c(paramArrayOfByte), "utf-8"));
        X.c("CollectInfo", "策略请求结果： " + paramP.toString());
        if (!"yes".equalsIgnoreCase(paramP.optString("is_collect"))) {
          continue;
        }
        Z.a(this.a, true);
        Z.a(this.a, (Double.parseDouble(paramP.optString("ti_request")) * 3600.0D));
        Z.b(this.a, (Double.parseDouble(paramP.optString("ti_app_list")) * 3600.0D));
        Z.c(this.a, (Double.parseDouble(paramP.optString("ti_app_active")) * 3600.0D));
        paramP = Z.c().edit();
        paramP.putBoolean("is_collect", Z.c(this.a));
        paramP.putLong("ti_request", Z.d(this.a));
        paramP.putLong("ti_app_list", Z.e(this.a));
        paramP.putLong("ti_app_active", Z.f(this.a));
        paramP.commit();
        paramP = this.a;
      }
      catch (Throwable paramP)
      {
        X.b(paramP);
        paramP = this.a;
        continue;
      }
      finally
      {
        Z.b(this.a, false);
      }
      Z.b(paramP, false);
      return;
      Z.a(this.a, false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\Z$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */