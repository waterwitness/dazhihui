package com.iflytek.thirdparty;

import android.content.Context;
import android.os.SystemClock;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;

public class t
  extends w
{
  private MSCSessionInfo c = new MSCSessionInfo();
  private MSCSessionInfo d = new MSCSessionInfo();
  private byte[] e = null;
  
  private void a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      int i = MSC.QMFVDataWrite(this.a, paramString.getBytes(), paramArrayOfByte, paramInt, this.d);
      this.c.sesstatus = this.d.sesstatus;
      X.a("QISRAudioWrite length:" + paramInt);
      if (i != 0) {
        throw new SpeechError(this.d.errorcode);
      }
    }
    finally {}
  }
  
  /* Error */
  public int a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 28	com/iflytek/thirdparty/t:a	[C
    //   8: ldc 78
    //   10: invokevirtual 34	java/lang/String:getBytes	()[B
    //   13: aload_0
    //   14: getfield 20	com/iflytek/thirdparty/t:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   17: invokestatic 82	com/iflytek/msc/MSC:QMFVGetParam	([C[BLcom/iflytek/msc/MSCSessionInfo;)I
    //   20: istore_2
    //   21: iload_2
    //   22: ifne +36 -> 58
    //   25: new 30	java/lang/String
    //   28: dup
    //   29: new 30	java/lang/String
    //   32: dup
    //   33: aload_0
    //   34: getfield 20	com/iflytek/thirdparty/t:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   37: getfield 85	com/iflytek/msc/MSCSessionInfo:buffer	[B
    //   40: invokespecial 88	java/lang/String:<init>	([B)V
    //   43: invokespecial 90	java/lang/String:<init>	(Ljava/lang/String;)V
    //   46: invokestatic 96	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   49: istore 4
    //   51: iload 4
    //   53: istore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: iload_2
    //   57: ireturn
    //   58: ldc 98
    //   60: invokestatic 65	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   63: iload_3
    //   64: istore_2
    //   65: goto -11 -> 54
    //   68: astore_1
    //   69: new 46	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 47	java/lang/StringBuilder:<init>	()V
    //   76: ldc 100
    //   78: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: iload_2
    //   82: invokevirtual 56	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 65	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
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
    //   0	107	0	this	t
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
  
  public int a(Context paramContext, String paramString, v paramv)
  {
    paramContext = ac.c(paramContext, paramString, paramv);
    X.c("sessionBegin Params:" + paramContext);
    long l = SystemClock.elapsedRealtime();
    Y.a("MSCSessionBegin", null);
    int i;
    try
    {
      this.a = MSC.QMFVSessionBegin(paramContext.getBytes(paramv.p()), this.c);
      Y.a("SessionBeginEnd", null);
      X.a("sessionBegin ErrCode:" + this.c.errorcode + " time:" + (SystemClock.elapsedRealtime() - l));
      i = this.c.errorcode;
      if ((i != 0) && (i != 10129) && (i != 10113) && (i != 10132)) {
        throw new SpeechError(i);
      }
    }
    finally {}
    return i;
  }
  
  public void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    X.a("sessionEnd enter ");
    long l = System.currentTimeMillis();
    if (MSC.QMFVSessionEnd(this.a, paramString.getBytes()) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      X.a("sessionEnd leavel:" + bool + " time:" + (System.currentTimeMillis() - l));
      this.a = null;
      this.b = null;
      return;
    }
  }
  
  /* Error */
  public void a(StringBuffer paramStringBuffer, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 167	java/lang/StringBuffer
    //   5: dup
    //   6: aload_1
    //   7: invokevirtual 168	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   10: invokespecial 169	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: aload_1
    //   15: ldc -85
    //   17: invokevirtual 174	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   20: pop
    //   21: iload 4
    //   23: ifeq +47 -> 70
    //   26: aload_1
    //   27: iconst_1
    //   28: invokevirtual 177	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   31: pop
    //   32: new 46	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 47	java/lang/StringBuilder:<init>	()V
    //   39: ldc -77
    //   41: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_1
    //   45: invokevirtual 168	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   48: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 110	com/iflytek/thirdparty/X:c	(Ljava/lang/String;)V
    //   57: aload_0
    //   58: aload_1
    //   59: invokevirtual 168	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   62: aload_2
    //   63: iload_3
    //   64: invokespecial 181	com/iflytek/thirdparty/t:a	(Ljava/lang/String;[BI)V
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: aload_1
    //   71: iconst_2
    //   72: invokevirtual 177	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   75: pop
    //   76: goto -44 -> 32
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	t
    //   0	84	1	paramStringBuffer	StringBuffer
    //   0	84	2	paramArrayOfByte	byte[]
    //   0	84	3	paramInt	int
    //   0	84	4	paramBoolean	boolean
    // Exception table:
    //   from	to	target	type
    //   2	21	79	finally
    //   26	32	79	finally
    //   32	67	79	finally
    //   70	76	79	finally
  }
  
  /* Error */
  public boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: monitorenter
    //   5: iload 6
    //   7: istore 5
    //   9: aload_1
    //   10: invokestatic 190	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: ifne +27 -> 40
    //   16: iload 6
    //   18: istore 5
    //   20: aload_2
    //   21: invokestatic 190	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   24: ifne +16 -> 40
    //   27: aload_0
    //   28: getfield 28	com/iflytek/thirdparty/t:a	[C
    //   31: astore_3
    //   32: aload_3
    //   33: ifnonnull +12 -> 45
    //   36: iload 6
    //   38: istore 5
    //   40: aload_0
    //   41: monitorexit
    //   42: iload 5
    //   44: ireturn
    //   45: aload_0
    //   46: getfield 28	com/iflytek/thirdparty/t:a	[C
    //   49: aload_1
    //   50: ldc -64
    //   52: invokevirtual 131	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   55: aload_2
    //   56: ldc -64
    //   58: invokevirtual 131	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   61: invokestatic 196	com/iflytek/msc/MSC:QMFVSetParam	([C[B[B)I
    //   64: istore 4
    //   66: iload 6
    //   68: istore 5
    //   70: iload 4
    //   72: ifne -32 -> 40
    //   75: iconst_1
    //   76: istore 5
    //   78: goto -38 -> 40
    //   81: astore_1
    //   82: aload_1
    //   83: invokestatic 199	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   86: iconst_m1
    //   87: istore 4
    //   89: goto -23 -> 66
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	t
    //   0	97	1	paramString1	String
    //   0	97	2	paramString2	String
    //   31	2	3	arrayOfChar	char[]
    //   64	24	4	i	int
    //   7	70	5	bool1	boolean
    //   1	66	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   45	66	81	java/io/UnsupportedEncodingException
    //   9	16	92	finally
    //   20	32	92	finally
    //   45	66	92	finally
    //   82	86	92	finally
  }
  
  protected String b()
  {
    if (this.b == null) {
      this.b = d("sid");
    }
    return this.b;
  }
  
  public void b(String paramString)
  {
    try
    {
      Y.a("LastDataFlag", null);
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("ssub=" + paramString);
      localStringBuffer.append(",data_status=4");
      X.a("pushEndFlag, param:" + localStringBuffer.toString());
      a(localStringBuffer.toString(), new byte[0], 0);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public int c(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 28	com/iflytek/thirdparty/t:a	[C
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull +10 -> 21
    //   14: iload 4
    //   16: istore_3
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_3
    //   20: ireturn
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 204	com/iflytek/thirdparty/t:d	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore_1
    //   27: iload 4
    //   29: istore_3
    //   30: aload_1
    //   31: invokestatic 190	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   34: ifne -17 -> 17
    //   37: new 30	java/lang/String
    //   40: dup
    //   41: aload_1
    //   42: invokespecial 90	java/lang/String:<init>	(Ljava/lang/String;)V
    //   45: invokestatic 96	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   48: istore_3
    //   49: goto -32 -> 17
    //   52: astore_1
    //   53: aload_1
    //   54: invokestatic 199	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   57: iload 4
    //   59: istore_3
    //   60: goto -43 -> 17
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	t
    //   0	68	1	paramString	String
    //   9	2	2	arrayOfChar	char[]
    //   16	44	3	i	int
    //   1	57	4	j	int
    // Exception table:
    //   from	to	target	type
    //   21	27	52	java/lang/Exception
    //   30	49	52	java/lang/Exception
    //   5	10	63	finally
    //   21	27	63	finally
    //   30	49	63	finally
    //   53	57	63	finally
  }
  
  public String d(String paramString)
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
          if (MSC.QMFVGetParam(this.a, paramString.getBytes(), this.c) != 0) {
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */