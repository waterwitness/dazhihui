package com.iflytek.thirdparty;

import com.iflytek.cloud.SpeechError;
import org.apache.http.util.EncodingUtils;

class Z$4
  implements P.a
{
  Z$4(Z paramZ) {}
  
  public void a(SpeechError paramSpeechError)
  {
    Z.c(this.a, false);
    X.c("CollectInfo", "" + paramSpeechError.getErrorCode());
  }
  
  public void a(P paramP, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    try
    {
      paramP = EncodingUtils.getString(K.c(paramArrayOfByte), "utf-8");
      X.c("CollectInfo", "上传数据结果返回： " + paramP);
      paramP = this.a;
    }
    catch (Throwable paramP)
    {
      for (;;)
      {
        X.b(paramP);
        paramP = this.a;
      }
    }
    finally
    {
      Z.c(this.a, false);
    }
    Z.c(paramP, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\Z$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */