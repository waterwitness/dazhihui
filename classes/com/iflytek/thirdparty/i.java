package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.util.Date;

public class i
  extends w
{
  private MSCSessionInfo c = new MSCSessionInfo();
  private MSCSessionInfo d = new MSCSessionInfo();
  private byte[] e = null;
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      X.a("QISEAudioWrite enter");
      paramInt2 = MSC.QISEAudioWrite(this.a, paramArrayOfByte, paramInt1, paramInt2, this.d);
      X.a("QISEAudioWrite leavel:" + paramInt2);
      this.c.sesstatus = this.d.sesstatus;
      X.a("QISEAudioWrite length:" + paramInt1);
      if (paramInt2 != 0) {
        throw new SpeechError(this.d.errorcode);
      }
    }
    finally {}
  }
  
  public int a(Context paramContext, String paramString, v paramv)
  {
    this.a = null;
    paramContext = ac.e(paramContext, paramv);
    Y.a("MSCSessionBegin", null);
    if (TextUtils.isEmpty(paramString)) {
      this.a = MSC.QISESessionBegin(paramContext.getBytes(paramv.p()), null, this.c);
    }
    int i;
    for (;;)
    {
      Y.a("SessionBeginEnd", null);
      i = this.c.errorcode;
      if ((i == 0) || (i == 10129) || (i == 10113) || (i == 10132)) {
        break;
      }
      throw new SpeechError(i);
      this.a = MSC.QISESessionBegin(paramContext.getBytes(paramv.p()), paramString.getBytes(paramv.p()), this.c);
      X.a("sessionBegin userModelId:" + paramString);
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
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "unknown";
    }
    X.a("ISESessionEnd enter ");
    long l = System.currentTimeMillis();
    int i = MSC.QISESessionEnd(this.a, str.getBytes());
    X.a("ISESessionEnd leavel:" + i + " time:" + (System.currentTimeMillis() - l));
    this.a = null;
    this.b = null;
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
  
  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      X.a("QISETextPut enter");
      int i = MSC.QISETextPut(this.a, paramArrayOfByte1, paramArrayOfByte2);
      X.a("QISETextPut leavel:" + i);
      if (i != 0) {
        throw new SpeechError(i);
      }
    }
    finally {}
  }
  
  public int b()
  {
    try
    {
      int i = this.d.epstatues;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String b(String paramString)
  {
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        localObject1 = this.a;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = localObject2;
      }
      finally
      {
        try
        {
          if (MSC.QISEGetParam(this.a, paramString.getBytes(), this.c) != 0) {
            continue;
          }
          localObject1 = new String(this.c.buffer);
        }
        catch (Exception paramString)
        {
          Object localObject1 = localObject2;
        }
        paramString = finally;
      }
      return (String)localObject1;
      localObject1 = localObject2;
    }
  }
  
  public int c()
  {
    int j = 0;
    for (;;)
    {
      try
      {
        char[] arrayOfChar = this.a;
        if (arrayOfChar == null)
        {
          i = j;
          return i;
        }
      }
      finally {}
      try
      {
        i = MSC.QISEGetParam(this.a, "volume".getBytes(), this.d);
        if (i == 0) {}
        try
        {
          int k = Integer.parseInt(new String(new String(this.d.buffer)));
          i = k;
        }
        catch (Exception localException1) {}
        X.a("VAD CHECK FALSE");
        i = j;
      }
      catch (Exception localException2)
      {
        i = 0;
        continue;
      }
      X.a("getAudioVolume Exception vadret = " + i);
      i = j;
    }
  }
  
  public byte[] d()
  {
    return this.e;
  }
  
  public w.a e()
  {
    Date localDate1 = new Date();
    this.e = MSC.QISEGetResult(this.a, this.c);
    Date localDate2 = new Date();
    StringBuilder localStringBuilder = new StringBuilder().append("QISRGetResult leavel:");
    if (this.e != null) {}
    int i;
    for (boolean bool = true;; bool = false)
    {
      X.a(bool + " time:" + (localDate2.getTime() - localDate1.getTime()));
      i = this.c.errorcode;
      if (i != 0) {
        break;
      }
      i = this.c.rsltstatus;
      switch (i)
      {
      case 1: 
      case 3: 
      case 4: 
      default: 
        return w.a.c;
      }
    }
    X.a("ResultStatus: hasResult" + i);
    return w.a.a;
    X.a("ResultStatus: noResult" + i);
    return w.a.c;
    X.a("ResultStatus: resultOver" + i);
    return w.a.f;
    X.a("Result: error errorcode is " + i);
    throw new SpeechError(i);
  }
  
  protected String f()
  {
    if (this.b == null) {
      this.b = b("sid");
    }
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */