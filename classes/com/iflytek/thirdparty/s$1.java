package com.iflytek.thirdparty;

import android.os.Bundle;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechError;
import org.json.JSONObject;

class s$1
  implements P.a
{
  s$1(s params) {}
  
  public void a(SpeechError paramSpeechError)
  {
    if (paramSpeechError != null) {
      X.b("query resource error. errorcode:" + paramSpeechError.getErrorCode());
    }
    for (;;)
    {
      if (s.c(this.a) != null) {
        s.c(this.a).onCompleted(paramSpeechError);
      }
      return;
      X.c("query resource succeed");
    }
  }
  
  public void a(P paramP, byte[] paramArrayOfByte)
  {
    try
    {
      paramP = new String(paramArrayOfByte, "utf-8");
      X.c("updateInfo:" + paramP);
      paramP = new JSONObject(paramP);
      try
      {
        int i = Integer.valueOf((String)paramP.remove(s.a(this.a))).intValue();
        H.a(s.b(this.a)).a("ivw_netval", i);
        i = paramP.getInt("ret");
        if (i != 0)
        {
          paramP = paramP.getString("sid");
          if (s.c(this.a) != null)
          {
            paramArrayOfByte = new Bundle();
            paramArrayOfByte.putString("session_id", paramP);
            s.c(this.a).onEvent(20001, paramArrayOfByte);
          }
          a(new SpeechError(i));
          return;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          X.a(localException);
        }
      }
      if (s.c(this.a) == null) {
        break label207;
      }
    }
    catch (Exception paramP)
    {
      X.a(paramP);
      a(new SpeechError(20004));
      return;
    }
    s.c(this.a).onBufferReceived(paramArrayOfByte);
    label207:
    a(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\s$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */