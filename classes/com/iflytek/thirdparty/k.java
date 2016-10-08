package com.iflytek.thirdparty;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;

public class k
  extends w
{
  private static GrammarListener f;
  private static LexiconListener g;
  private MSCSessionInfo c = new MSCSessionInfo();
  private MSCSessionInfo d = new MSCSessionInfo();
  private byte[] e = null;
  private String h = "";
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt2 = MSC.QISRAudioWrite(this.a, paramArrayOfByte, paramInt1, paramInt2, this.d);
      this.c.sesstatus = this.d.sesstatus;
      X.a("QISRAudioWrite length:" + paramInt1);
      if (paramInt2 != 0) {
        throw new SpeechError(this.d.errorcode);
      }
    }
    finally {}
  }
  
  public int a(Context paramContext, String paramString, v paramv)
  {
    paramContext = ac.a(paramContext, paramString, paramv);
    long l = SystemClock.elapsedRealtime();
    try
    {
      Y.a("MSCSessionBegin", null);
      if (TextUtils.isEmpty(paramString))
      {
        X.a(paramContext);
        this.a = MSC.QISRSessionBegin(null, paramContext.getBytes(paramv.p()), this.c);
      }
      int i;
      for (;;)
      {
        Y.a("SessionBeginEnd", null);
        X.a("sessionBegin ErrCode:" + this.c.errorcode + " time:" + (SystemClock.elapsedRealtime() - l));
        i = this.c.errorcode;
        if ((i == 0) || (i == 10129) || (i == 10113) || (i == 10132)) {
          break;
        }
        throw new SpeechError(i);
        this.a = MSC.QISRSessionBegin(paramString.getBytes(paramv.p()), paramContext.getBytes(paramv.p()), this.c);
        X.a("sessionBegin grammarId:" + paramString);
      }
      return i;
    }
    finally {}
  }
  
  public int a(String paramString1, String paramString2, GrammarListener paramGrammarListener, aa paramaa)
  {
    f = paramGrammarListener;
    paramGrammarListener = paramaa.toString();
    String str = paramaa.b("text_encoding", "utf-8");
    paramaa = paramaa.b("pte", "utf-8");
    try
    {
      paramString2 = paramString2.getBytes(str);
      Y.a("LastDataFlag", null);
      int i = MSC.QISRBuildGrammar(paramString1.getBytes(paramaa), paramString2, paramString2.length, paramGrammarListener.getBytes(paramaa), "grammarCallBack", this);
      return i;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      X.a(paramString1);
    }
    return 20012;
  }
  
  public int a(String paramString1, String paramString2, LexiconListener paramLexiconListener, aa paramaa)
  {
    g = paramLexiconListener;
    this.h = paramString1;
    paramaa.a("text_encoding", "utf-8", false);
    String str = paramaa.b("text_encoding", "utf-8");
    paramLexiconListener = paramaa.b("pte", "utf-8");
    paramaa = paramaa.toString();
    try
    {
      paramString2 = paramString2.getBytes(str);
      Y.a("LastDataFlag", null);
      int i = MSC.QISRUpdateLexicon(paramString1.getBytes(paramLexiconListener), paramString2, paramString2.length, paramaa.getBytes(paramLexiconListener), "lexiconCallBack", this);
      return i;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      X.a(paramString1);
    }
    return 20012;
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
    if (MSC.QISRSessionEnd(this.a, paramString.getBytes()) == 0) {}
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
    //   10: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: ifne +27 -> 40
    //   16: iload 6
    //   18: istore 5
    //   20: aload_2
    //   21: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   24: ifne +16 -> 40
    //   27: aload_0
    //   28: getfield 38	com/iflytek/thirdparty/k:a	[C
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
    //   46: getfield 38	com/iflytek/thirdparty/k:a	[C
    //   49: aload_1
    //   50: ldc -116
    //   52: invokevirtual 113	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   55: aload_2
    //   56: ldc -116
    //   58: invokevirtual 113	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   61: invokestatic 197	com/iflytek/msc/MSC:QISRSetParam	([C[B[B)I
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
    //   83: invokestatic 157	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
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
    //   0	97	0	this	k
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
  
  /* Error */
  public int b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 38	com/iflytek/thirdparty/k:a	[C
    //   8: ldc -54
    //   10: invokevirtual 180	java/lang/String:getBytes	()[B
    //   13: aload_0
    //   14: getfield 26	com/iflytek/thirdparty/k:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   17: invokestatic 206	com/iflytek/msc/MSC:QISRGetParam	([C[BLcom/iflytek/msc/MSCSessionInfo;)I
    //   20: istore_2
    //   21: iload_2
    //   22: ifne +36 -> 58
    //   25: new 109	java/lang/String
    //   28: dup
    //   29: new 109	java/lang/String
    //   32: dup
    //   33: aload_0
    //   34: getfield 26	com/iflytek/thirdparty/k:d	Lcom/iflytek/msc/MSCSessionInfo;
    //   37: getfield 209	com/iflytek/msc/MSCSessionInfo:buffer	[B
    //   40: invokespecial 212	java/lang/String:<init>	([B)V
    //   43: invokespecial 214	java/lang/String:<init>	(Ljava/lang/String;)V
    //   46: invokestatic 220	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   49: istore 4
    //   51: iload 4
    //   53: istore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: iload_2
    //   57: ireturn
    //   58: ldc -34
    //   60: invokestatic 69	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   63: iload_3
    //   64: istore_2
    //   65: goto -11 -> 54
    //   68: astore_1
    //   69: new 50	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 51	java/lang/StringBuilder:<init>	()V
    //   76: ldc -32
    //   78: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: iload_2
    //   82: invokevirtual 60	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 69	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
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
    //   0	107	0	this	k
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
  
  /* Error */
  public int b(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 38	com/iflytek/thirdparty/k:a	[C
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
    //   23: invokevirtual 227	com/iflytek/thirdparty/k:c	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore_1
    //   27: iload 4
    //   29: istore_3
    //   30: aload_1
    //   31: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   34: ifne -17 -> 17
    //   37: new 109	java/lang/String
    //   40: dup
    //   41: aload_1
    //   42: invokespecial 214	java/lang/String:<init>	(Ljava/lang/String;)V
    //   45: invokestatic 220	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   48: istore_3
    //   49: goto -32 -> 17
    //   52: astore_1
    //   53: aload_1
    //   54: invokestatic 157	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
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
    //   0	68	0	this	k
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
  
  protected String c()
  {
    if (this.b == null) {
      this.b = c("sid");
    }
    return this.b;
  }
  
  public String c(String paramString)
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
          if (MSC.QISRGetParam(this.a, paramString.getBytes(), this.c) != 0) {
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
  
  protected String d()
  {
    return c("audio_url");
  }
  
  int grammarCallBack(int paramInt, char[] paramArrayOfChar)
  {
    Object localObject = null;
    Y.a("GetNotifyResult", null);
    if (f != null)
    {
      if (paramInt == 0) {
        break label53;
      }
      GrammarListener localGrammarListener = f;
      if (paramInt != 0) {
        break label41;
      }
      paramArrayOfChar = (char[])localObject;
      localGrammarListener.onBuildFinish("", paramArrayOfChar);
    }
    for (;;)
    {
      return 0;
      label41:
      paramArrayOfChar = new SpeechError(paramInt);
      break;
      label53:
      f.onBuildFinish(String.valueOf(paramArrayOfChar), null);
    }
  }
  
  int lexiconCallBack(int paramInt, char[] paramArrayOfChar)
  {
    paramArrayOfChar = null;
    Y.a("GetNotifyResult", null);
    if (g != null)
    {
      if (paramInt == 0) {
        break label55;
      }
      LexiconListener localLexiconListener = g;
      String str = this.h;
      if (paramInt != 0) {
        break label43;
      }
      localLexiconListener.onLexiconUpdated(str, paramArrayOfChar);
    }
    for (;;)
    {
      return 0;
      label43:
      paramArrayOfChar = new SpeechError(paramInt);
      break;
      label55:
      g.onLexiconUpdated(this.h, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */