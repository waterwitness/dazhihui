package com.iflytek.thirdparty;

import android.content.Context;
import android.os.SystemClock;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.util.Date;

public class p
  extends w
{
  private MSCSessionInfo c = new MSCSessionInfo();
  private MSCSessionInfo d = new MSCSessionInfo();
  private MSCSessionInfo e = new MSCSessionInfo();
  private byte[] f = null;
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = MSC.QISVAudioWrite(this.a, null, paramArrayOfByte, paramInt1, paramInt2, this.c);
      if (paramInt1 != 0) {
        throw new SpeechError(paramInt1);
      }
    }
    finally {}
  }
  
  public int a(Context paramContext, v paramv)
  {
    long l = SystemClock.elapsedRealtime();
    String str2 = paramv.v().e("vid");
    String str1 = ac.b(paramContext, paramv);
    X.a("sendRequest enter ");
    Y.a("LastDataFlag", null);
    int i;
    if (str2 == null)
    {
      paramContext = null;
      paramContext = MSC.QISVQueDelModel(paramContext, str1.getBytes(paramv.p()), this.e);
      Y.a("GetNotifyResult", null);
      MSC.QISVQueDelModelRelease(paramContext);
      if (this.e.errorcode == 0) {
        break label121;
      }
      i = this.e.errorcode;
    }
    for (;;)
    {
      if ((i == 0) || (-1 == i)) {
        break label155;
      }
      throw new SpeechError(i);
      paramContext = str2.getBytes(paramv.p());
      break;
      label121:
      if ("true".equals(new String(this.e.buffer))) {
        i = 0;
      } else {
        i = -1;
      }
    }
    label155:
    X.a("sendRequest leavel:" + i + " time:" + (SystemClock.elapsedRealtime() - l));
    return i;
  }
  
  public int a(Context paramContext, String paramString, v paramv)
  {
    paramContext = ac.b(paramContext, paramv);
    long l = SystemClock.elapsedRealtime();
    Y.a("MSCSessionBegin", null);
    byte[] arrayOfByte = paramContext.getBytes(paramv.p());
    if (paramString == null) {}
    for (paramContext = null;; paramContext = paramString.getBytes(paramv.p()))
    {
      this.a = MSC.QISVSessionBegin(arrayOfByte, paramContext, this.c);
      Y.a("SessionBeginEnd", null);
      X.a("sessionBegin ErrCode:" + this.c.errorcode + " time:" + (SystemClock.elapsedRealtime() - l));
      int i = this.c.errorcode;
      if ((i == 0) || (i == 10129) || (i == 10113) || (i == 10132)) {
        break;
      }
      throw new SpeechError(i);
    }
    return 0;
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
    if (MSC.QISVSessionEnd(this.a, paramString.getBytes()) == 0) {}
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
          if (MSC.QISVGetParam(this.a, paramString.getBytes(), this.c) != 0) {
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
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/iflytek/thirdparty/p:c	Lcom/iflytek/msc/MSCSessionInfo;
    //   6: getfield 183	com/iflytek/msc/MSCSessionInfo:epstatues	I
    //   9: istore_2
    //   10: iload_2
    //   11: iconst_3
    //   12: if_icmplt +9 -> 21
    //   15: iconst_1
    //   16: istore_3
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_3
    //   20: ireturn
    //   21: iconst_0
    //   22: istore_3
    //   23: goto -6 -> 17
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	p
    //   26	4	1	localObject	Object
    //   9	4	2	i	int
    //   16	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	10	26	finally
  }
  
  /* Error */
  public int c()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 31	com/iflytek/thirdparty/p:a	[C
    //   8: ldc -70
    //   10: invokevirtual 160	java/lang/String:getBytes	()[B
    //   13: aload_0
    //   14: getfield 21	com/iflytek/thirdparty/p:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   17: invokestatic 179	com/iflytek/msc/MSC:QISVGetParam	([C[BLcom/iflytek/msc/MSCSessionInfo;)I
    //   20: istore_2
    //   21: iload_2
    //   22: ifne +36 -> 58
    //   25: new 88	java/lang/String
    //   28: dup
    //   29: new 88	java/lang/String
    //   32: dup
    //   33: aload_0
    //   34: getfield 21	com/iflytek/thirdparty/p:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   37: getfield 111	com/iflytek/msc/MSCSessionInfo:buffer	[B
    //   40: invokespecial 114	java/lang/String:<init>	([B)V
    //   43: invokespecial 188	java/lang/String:<init>	(Ljava/lang/String;)V
    //   46: invokestatic 194	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   49: istore 4
    //   51: iload 4
    //   53: istore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: iload_2
    //   57: ireturn
    //   58: ldc -60
    //   60: invokestatic 75	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   63: iload_3
    //   64: istore_2
    //   65: goto -11 -> 54
    //   68: astore_1
    //   69: new 120	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   76: ldc -58
    //   78: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: iload_2
    //   82: invokevirtual 130	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 75	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   91: iload_3
    //   92: istore_2
    //   93: goto -39 -> 54
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    //   101: astore_1
    //   102: iconst_0
    //   103: istore_2
    //   104: goto -35 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	p
    //   68	1	1	localException1	Exception
    //   96	4	1	localObject	Object
    //   101	1	1	localException2	Exception
    //   20	84	2	i	int
    //   1	91	3	j	int
    //   49	3	4	k	int
    // Exception table:
    //   from	to	target	type
    //   25	51	68	java/lang/Exception
    //   58	63	68	java/lang/Exception
    //   4	21	96	finally
    //   25	51	96	finally
    //   58	63	96	finally
    //   69	91	96	finally
    //   4	21	101	java/lang/Exception
  }
  
  public byte[] d()
  {
    return this.f;
  }
  
  public w.a e()
  {
    Date localDate1 = new Date();
    this.f = MSC.QISVGetResult(this.a, null, this.c);
    Date localDate2 = new Date();
    StringBuilder localStringBuilder = new StringBuilder().append("QISVGetResult leavel:");
    boolean bool;
    int i;
    if (this.f != null)
    {
      bool = true;
      X.a(bool + " time:" + (localDate2.getTime() - localDate1.getTime()));
      i = this.c.errorcode;
      if (i != 0) {
        break label226;
      }
      i = this.c.rsltstatus;
      switch (i)
      {
      }
    }
    do
    {
      return w.a.c;
      bool = false;
      break;
      X.a("ResultStatus: noResult" + i);
      throw new SpeechError(20005);
    } while (this.f == null);
    X.a("ResultStatus: hasResult" + i);
    return w.a.a;
    label226:
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */