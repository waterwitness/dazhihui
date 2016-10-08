package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechError;
import java.io.File;
import org.json.JSONObject;

class am$c
  implements RequestListener
{
  private RequestListener b = null;
  private final int c = 0;
  private final int d = 1;
  private final int e = 2;
  private boolean f = false;
  private Handler g = new am.c.1(this, Looper.getMainLooper());
  
  public am$c(am paramam, boolean paramBoolean, RequestListener paramRequestListener)
  {
    this.f = paramBoolean;
    this.b = paramRequestListener;
  }
  
  public void onBufferReceived(byte[] paramArrayOfByte)
  {
    X.a("onCompleted");
    try
    {
      int i = am.a(this.a).a("ivw_net_mode", 0);
      if ((!this.f) && ((2 == i) || ((4 == i) && (Q.a(am.b(this.a))))))
      {
        JSONObject localJSONObject = new JSONObject(new String(paramArrayOfByte, "utf-8"));
        String str1 = localJSONObject.getString("dlurl");
        String str2 = localJSONObject.getString("md5");
        String str3 = str1.substring(str1.lastIndexOf(File.separator) + 1, str1.lastIndexOf("."));
        X.a("resName:" + str3);
        str3 = M.a(am.c(this.a), str3);
        X.a("auto download path:" + str3);
        this.a.a(str1, str3, str2, this.f, null);
        am.d(this.a).a("cfg_threstemp", localJSONObject.getString("thresholder"));
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        onCompleted(new SpeechError(20014));
      }
    }
    paramArrayOfByte = this.g.obtainMessage(1, paramArrayOfByte);
    this.g.sendMessage(paramArrayOfByte);
  }
  
  public void onCompleted(SpeechError paramSpeechError)
  {
    Y.a("RequestResult", null);
    paramSpeechError = this.g.obtainMessage(2, paramSpeechError);
    this.g.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt, Bundle paramBundle)
  {
    Y.a("RequestResult", null);
    paramBundle = this.g.obtainMessage(0, paramInt, 0, paramBundle);
    this.g.sendMessage(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */