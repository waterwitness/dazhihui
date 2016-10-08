package com.alipay.sdk.h;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.a.a;
import com.h.a.c.c;
import java.io.File;

public final class b
{
  private static b b;
  public Context a;
  
  public static b a()
  {
    if (b == null) {
      b = new b();
    }
    return b;
  }
  
  /* Error */
  private static String a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: new 24	java/lang/ProcessBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 27	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   8: astore_0
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual 31	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
    //   14: pop
    //   15: aload_0
    //   16: invokevirtual 35	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   19: astore_0
    //   20: new 37	java/io/DataOutputStream
    //   23: dup
    //   24: aload_0
    //   25: invokevirtual 43	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   28: invokespecial 46	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   31: astore_2
    //   32: new 48	java/io/DataInputStream
    //   35: dup
    //   36: aload_0
    //   37: invokevirtual 52	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   40: invokespecial 55	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: invokevirtual 59	java/io/DataInputStream:readLine	()Ljava/lang/String;
    //   46: astore_1
    //   47: aload_2
    //   48: ldc 61
    //   50: invokevirtual 65	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   53: aload_2
    //   54: invokevirtual 68	java/io/DataOutputStream:flush	()V
    //   57: aload_0
    //   58: invokevirtual 72	java/lang/Process:waitFor	()I
    //   61: pop
    //   62: aload_0
    //   63: invokevirtual 75	java/lang/Process:destroy	()V
    //   66: aload_1
    //   67: areturn
    //   68: astore_0
    //   69: aconst_null
    //   70: astore_0
    //   71: ldc 77
    //   73: astore_1
    //   74: aload_0
    //   75: invokevirtual 75	java/lang/Process:destroy	()V
    //   78: aload_1
    //   79: areturn
    //   80: astore_0
    //   81: aload_1
    //   82: areturn
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_0
    //   86: aload_0
    //   87: invokevirtual 75	java/lang/Process:destroy	()V
    //   90: aload_1
    //   91: athrow
    //   92: astore_0
    //   93: aload_1
    //   94: areturn
    //   95: astore_0
    //   96: goto -6 -> 90
    //   99: astore_1
    //   100: goto -14 -> 86
    //   103: astore_1
    //   104: ldc 77
    //   106: astore_1
    //   107: goto -33 -> 74
    //   110: astore_2
    //   111: goto -37 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramArrayOfString	String[]
    //   46	36	1	str1	String
    //   83	11	1	str2	String
    //   99	1	1	localObject	Object
    //   103	1	1	localThrowable1	Throwable
    //   106	1	1	str3	String
    //   31	23	2	localDataOutputStream	java.io.DataOutputStream
    //   110	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	20	68	java/lang/Throwable
    //   74	78	80	java/lang/Exception
    //   0	20	83	finally
    //   62	66	92	java/lang/Exception
    //   86	90	95	java/lang/Exception
    //   20	47	99	finally
    //   47	62	99	finally
    //   20	47	103	java/lang/Throwable
    //   47	62	110	java/lang/Throwable
  }
  
  public static boolean b()
  {
    boolean bool = true;
    int i = 0;
    while (i < 5) {
      try
      {
        String str = new String[] { "/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/" }[i] + "su";
        if (new File(str).exists())
        {
          str = a(new String[] { "ls", "-l", str });
          if (!TextUtils.isEmpty(str))
          {
            i = str.indexOf("root");
            int j = str.lastIndexOf("root");
            if (i != j) {}
          }
          else
          {
            bool = false;
          }
          return bool;
        }
        i += 1;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public final void a(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public final String c()
  {
    try
    {
      String str = c.a(this.a);
      return str;
    }
    catch (Throwable localThrowable)
    {
      a.a("third", "GetUtdidEx", localThrowable);
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */