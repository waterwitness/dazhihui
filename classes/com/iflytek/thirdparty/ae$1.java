package com.iflytek.thirdparty;

import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechError;
import org.json.JSONObject;

class ae$1
  implements P.a
{
  ae$1(ae paramae) {}
  
  public void a(SpeechError paramSpeechError)
  {
    if (paramSpeechError != null) {
      X.b("upload error. please check net state:" + paramSpeechError.getErrorCode());
    }
    for (;;)
    {
      if (ae.a(this.a) != null) {
        ae.a(this.a).onCompleted(paramSpeechError);
      }
      return;
      X.a("upload succeed");
    }
  }
  
  public void a(P paramP, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramP = new String(paramArrayOfByte, "utf-8");
        X.a(paramP);
        int i = Integer.parseInt(new JSONObject(paramP).getString("ret"));
        if (i != 0)
        {
          a(new SpeechError(i, "wfr"));
          return;
        }
        if (ae.a(this.a) != null)
        {
          Y.a("GetNotifyResult", null);
          ae.a(this.a).onBufferReceived(paramArrayOfByte);
        }
        a(null);
        return;
      }
      catch (Exception paramP)
      {
        a(new SpeechError(20004));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ae$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */