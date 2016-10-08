package com.iflytek.thirdparty;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;

public class q
  extends w
{
  private MSCSessionInfo c = new MSCSessionInfo();
  private MSCSessionInfo d = new MSCSessionInfo();
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt2 = MSC.QIVWAudioWrite(this.a, paramArrayOfByte, paramInt1, paramInt2, this.d);
      this.c.sesstatus = this.d.sesstatus;
      X.a("QIVWAudioWrite length:" + paramInt1);
      if (paramInt2 != 0) {
        throw new SpeechError(this.d.errorcode);
      }
    }
    finally {}
  }
  
  public int a(Context paramContext, String paramString, v paramv)
  {
    paramContext = ac.b(paramContext, paramString, paramv);
    paramString = paramv.v().e("cloud_grammar");
    long l = SystemClock.elapsedRealtime();
    Y.a("MSCSessionBegin", null);
    if (TextUtils.isEmpty(paramString)) {}
    int i;
    for (this.a = MSC.QIVWSessionBegin(null, paramContext.getBytes(paramv.p()), this.c);; this.a = MSC.QIVWSessionBegin(paramString.getBytes(paramv.p()), paramContext.getBytes(paramv.p()), this.c))
    {
      Y.a("SessionBeginEnd", null);
      X.a("sessionBegin ErrCode:" + this.c.errorcode + " time:" + (SystemClock.elapsedRealtime() - l));
      i = this.c.errorcode;
      if ((i == 0) || (i == 10129) || (i == 10113) || (i == 10132)) {
        break;
      }
      throw new SpeechError(i);
    }
    return i;
  }
  
  public void a()
  {
    try
    {
      Y.a("LastDataFlag", null);
      a(new byte[0], 0, 4);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    X.a("sessionEnd enter ");
    long l = System.currentTimeMillis();
    if (MSC.QIVWSessionEnd(this.a, paramString.getBytes()) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      X.a("sessionEnd leavel:" + bool + " time:" + (System.currentTimeMillis() - l));
      this.a = null;
      this.b = null;
      return;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      a(paramArrayOfByte, paramInt, 2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */