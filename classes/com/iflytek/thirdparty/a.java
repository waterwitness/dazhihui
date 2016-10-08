package com.iflytek.thirdparty;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;

public final class a
{
  private static char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  /* Error */
  public static String a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 36	com/iflytek/thirdparty/a:b	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_0
    //   5: ldc 38
    //   7: invokestatic 44	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   10: astore_2
    //   11: new 46	java/io/FileInputStream
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 50	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: astore_1
    //   20: aload_1
    //   21: astore_0
    //   22: sipush 2048
    //   25: newarray <illegal type>
    //   27: astore_3
    //   28: aload_1
    //   29: astore_0
    //   30: aload_1
    //   31: aload_3
    //   32: invokevirtual 54	java/io/FileInputStream:read	([B)I
    //   35: istore 4
    //   37: iload 4
    //   39: iconst_m1
    //   40: if_icmpne +19 -> 59
    //   43: aload_1
    //   44: astore_0
    //   45: aload_2
    //   46: invokevirtual 58	java/security/MessageDigest:digest	()[B
    //   49: invokestatic 61	com/iflytek/thirdparty/a:a	([B)Ljava/lang/String;
    //   52: astore_2
    //   53: aload_1
    //   54: invokevirtual 64	java/io/FileInputStream:close	()V
    //   57: aload_2
    //   58: areturn
    //   59: aload_1
    //   60: astore_0
    //   61: aload_2
    //   62: aload_3
    //   63: iconst_0
    //   64: iload 4
    //   66: invokevirtual 68	java/security/MessageDigest:update	([BII)V
    //   69: goto -41 -> 28
    //   72: astore_2
    //   73: aload_1
    //   74: astore_0
    //   75: aload_2
    //   76: invokevirtual 71	java/lang/Exception:printStackTrace	()V
    //   79: aload_1
    //   80: invokevirtual 64	java/io/FileInputStream:close	()V
    //   83: aconst_null
    //   84: areturn
    //   85: astore_0
    //   86: aload_0
    //   87: invokevirtual 72	java/io/IOException:printStackTrace	()V
    //   90: aconst_null
    //   91: areturn
    //   92: astore_0
    //   93: aload_0
    //   94: invokevirtual 72	java/io/IOException:printStackTrace	()V
    //   97: aload_2
    //   98: areturn
    //   99: astore_1
    //   100: aconst_null
    //   101: astore_0
    //   102: aload_0
    //   103: invokevirtual 64	java/io/FileInputStream:close	()V
    //   106: aload_1
    //   107: athrow
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 72	java/io/IOException:printStackTrace	()V
    //   113: goto -7 -> 106
    //   116: astore_1
    //   117: goto -15 -> 102
    //   120: astore_2
    //   121: aconst_null
    //   122: astore_1
    //   123: goto -50 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramContext	Context
    //   19	61	1	localFileInputStream	java.io.FileInputStream
    //   99	8	1	localObject1	Object
    //   116	1	1	localObject2	Object
    //   122	1	1	localObject3	Object
    //   10	52	2	localObject4	Object
    //   72	26	2	localException1	Exception
    //   120	1	2	localException2	Exception
    //   27	36	3	arrayOfByte	byte[]
    //   35	30	4	i	int
    // Exception table:
    //   from	to	target	type
    //   22	28	72	java/lang/Exception
    //   30	37	72	java/lang/Exception
    //   45	53	72	java/lang/Exception
    //   61	69	72	java/lang/Exception
    //   79	83	85	java/io/IOException
    //   53	57	92	java/io/IOException
    //   5	20	99	finally
    //   102	106	108	java/io/IOException
    //   22	28	116	finally
    //   30	37	116	finally
    //   45	53	116	finally
    //   61	69	116	finally
    //   75	79	116	finally
    //   5	20	120	java/lang/Exception
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    int i = 0;
    char[] arrayOfChar = new char[32];
    int j = 0;
    for (;;)
    {
      if (i >= 16) {
        return new String(arrayOfChar);
      }
      int k = paramArrayOfByte[i];
      int m = j + 1;
      arrayOfChar[j] = a[(k >>> 4 & 0xF)];
      j = m + 1;
      arrayOfChar[m] = a[(k & 0xF)];
      i += 1;
    }
  }
  
  private static File b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0).sourceDir;
      Log.i("MainActivity", paramContext);
      paramContext = new File(paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */