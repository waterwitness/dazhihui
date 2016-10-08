package com.android.dazhihui.c.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;

public class c
{
  public static File a(Context paramContext)
  {
    if (a()) {}
    for (paramContext = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "Android/data/" + ".dzh");; paramContext = new File(paramContext.getFilesDir().getPath() + File.separator + ".dzh"))
    {
      paramContext.mkdirs();
      return paramContext;
    }
  }
  
  public static File a(Context paramContext, String paramString)
  {
    if ((("mounted".equals(Environment.getExternalStorageState())) || (!b())) && (b(paramContext) != null))
    {
      paramContext = b(paramContext).getPath();
      if (TextUtils.isEmpty(paramString)) {
        break label89;
      }
    }
    label89:
    for (paramContext = new File(paramContext + File.separator + paramString);; paramContext = new File(paramContext))
    {
      paramContext.mkdirs();
      return paramContext;
      paramContext = paramContext.getCacheDir().getPath();
      break;
    }
  }
  
  public static boolean a()
  {
    int i;
    if (("mounted".equals(Environment.getExternalStorageState())) || (!b())) {
      i = 1;
    }
    while (i != 0) {
      if (Environment.getExternalStorageDirectory() != null)
      {
        return true;
        i = 0;
      }
      else
      {
        return false;
      }
    }
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    return a(new File(a(paramContext), paramString1), paramString2.getBytes());
  }
  
  /* Error */
  public static boolean a(File paramFile, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: new 99	java/io/FileOutputStream
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 102	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   11: astore_3
    //   12: aload_3
    //   13: astore_2
    //   14: aload_3
    //   15: aload_1
    //   16: iconst_0
    //   17: aload_1
    //   18: arraylength
    //   19: invokevirtual 106	java/io/FileOutputStream:write	([BII)V
    //   22: aload_3
    //   23: astore_2
    //   24: aload_3
    //   25: invokevirtual 109	java/io/FileOutputStream:flush	()V
    //   28: aload_3
    //   29: astore_2
    //   30: aload_3
    //   31: invokevirtual 112	java/io/FileOutputStream:close	()V
    //   34: iconst_1
    //   35: istore 5
    //   37: iconst_0
    //   38: ifeq +11 -> 49
    //   41: new 114	java/lang/NullPointerException
    //   44: dup
    //   45: invokespecial 115	java/lang/NullPointerException:<init>	()V
    //   48: athrow
    //   49: iload 5
    //   51: ireturn
    //   52: astore_0
    //   53: aload_0
    //   54: invokevirtual 118	java/io/IOException:printStackTrace	()V
    //   57: iconst_1
    //   58: ireturn
    //   59: astore 4
    //   61: aconst_null
    //   62: astore_1
    //   63: aload_1
    //   64: astore_2
    //   65: aload 4
    //   67: invokevirtual 119	java/lang/Exception:printStackTrace	()V
    //   70: aload_1
    //   71: astore_2
    //   72: aload_0
    //   73: invokevirtual 122	java/io/File:delete	()Z
    //   76: pop
    //   77: aload_1
    //   78: ifnull -29 -> 49
    //   81: aload_1
    //   82: invokevirtual 112	java/io/FileOutputStream:close	()V
    //   85: iconst_0
    //   86: ireturn
    //   87: astore_0
    //   88: aload_0
    //   89: invokevirtual 118	java/io/IOException:printStackTrace	()V
    //   92: iconst_0
    //   93: ireturn
    //   94: astore_0
    //   95: aconst_null
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +7 -> 105
    //   101: aload_2
    //   102: invokevirtual 112	java/io/FileOutputStream:close	()V
    //   105: aload_0
    //   106: athrow
    //   107: astore_1
    //   108: aload_1
    //   109: invokevirtual 118	java/io/IOException:printStackTrace	()V
    //   112: goto -7 -> 105
    //   115: astore_0
    //   116: goto -19 -> 97
    //   119: astore 4
    //   121: aload_3
    //   122: astore_1
    //   123: goto -60 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramFile	File
    //   0	126	1	paramArrayOfByte	byte[]
    //   13	89	2	localObject	Object
    //   11	111	3	localFileOutputStream	java.io.FileOutputStream
    //   59	7	4	localException1	Exception
    //   119	1	4	localException2	Exception
    //   1	49	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   41	49	52	java/io/IOException
    //   3	12	59	java/lang/Exception
    //   81	85	87	java/io/IOException
    //   3	12	94	finally
    //   101	105	107	java/io/IOException
    //   14	22	115	finally
    //   24	28	115	finally
    //   30	34	115	finally
    //   65	70	115	finally
    //   72	77	115	finally
    //   14	22	119	java/lang/Exception
    //   24	28	119	java/lang/Exception
    //   30	34	119	java/lang/Exception
  }
  
  /* Error */
  public static byte[] a(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 126	java/io/File:exists	()Z
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 128	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 129	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: astore_1
    //   18: aload_1
    //   19: astore_0
    //   20: bipush 100
    //   22: newarray <illegal type>
    //   24: astore_2
    //   25: aload_1
    //   26: astore_0
    //   27: new 131	org/apache/http/util/ByteArrayBuffer
    //   30: dup
    //   31: iconst_0
    //   32: invokespecial 134	org/apache/http/util/ByteArrayBuffer:<init>	(I)V
    //   35: astore_3
    //   36: aload_1
    //   37: astore_0
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual 138	java/io/FileInputStream:read	([B)I
    //   43: istore 4
    //   45: iload 4
    //   47: iconst_m1
    //   48: if_icmpeq +33 -> 81
    //   51: aload_1
    //   52: astore_0
    //   53: aload_3
    //   54: aload_2
    //   55: iconst_0
    //   56: iload 4
    //   58: invokevirtual 140	org/apache/http/util/ByteArrayBuffer:append	([BII)V
    //   61: goto -25 -> 36
    //   64: astore_2
    //   65: aload_1
    //   66: astore_0
    //   67: aload_2
    //   68: invokevirtual 119	java/lang/Exception:printStackTrace	()V
    //   71: aconst_null
    //   72: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   75: aload_1
    //   76: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   79: aconst_null
    //   80: areturn
    //   81: aload_1
    //   82: astore_0
    //   83: aload_3
    //   84: invokevirtual 148	org/apache/http/util/ByteArrayBuffer:toByteArray	()[B
    //   87: astore_2
    //   88: aconst_null
    //   89: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   92: aload_1
    //   93: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   96: aload_2
    //   97: areturn
    //   98: astore_1
    //   99: aconst_null
    //   100: astore_0
    //   101: aconst_null
    //   102: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   105: aload_0
    //   106: invokestatic 145	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   109: aload_1
    //   110: athrow
    //   111: astore_1
    //   112: goto -11 -> 101
    //   115: astore_2
    //   116: aconst_null
    //   117: astore_1
    //   118: goto -53 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramFile	File
    //   17	76	1	localFileInputStream	java.io.FileInputStream
    //   98	12	1	localObject1	Object
    //   111	1	1	localObject2	Object
    //   117	1	1	localObject3	Object
    //   24	31	2	arrayOfByte1	byte[]
    //   64	4	2	localException1	Exception
    //   87	10	2	arrayOfByte2	byte[]
    //   115	1	2	localException2	Exception
    //   35	49	3	localByteArrayBuffer	org.apache.http.util.ByteArrayBuffer
    //   43	14	4	i	int
    // Exception table:
    //   from	to	target	type
    //   20	25	64	java/lang/Exception
    //   27	36	64	java/lang/Exception
    //   38	45	64	java/lang/Exception
    //   53	61	64	java/lang/Exception
    //   83	88	64	java/lang/Exception
    //   9	18	98	finally
    //   20	25	111	finally
    //   27	36	111	finally
    //   38	45	111	finally
    //   53	61	111	finally
    //   67	71	111	finally
    //   83	88	111	finally
    //   9	18	115	java/lang/Exception
  }
  
  private static File b(Context paramContext)
  {
    if (c()) {
      return paramContext.getExternalFilesDir("");
    }
    paramContext = "/Android/data/" + paramContext.getPackageName() + "/files";
    return new File(Environment.getExternalStorageDirectory().getPath() + paramContext);
  }
  
  public static String b(Context paramContext, String paramString)
  {
    if (a())
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), paramString);
      if (localFile != null)
      {
        if (((localFile.exists()) && (localFile.canWrite())) || ((!localFile.exists()) && (localFile.mkdirs())))
        {
          paramContext = localFile.getAbsolutePath();
          Log.i("GUH", "getExternalRootPath =" + paramContext);
          return paramContext;
        }
        return a(paramContext, paramString).getAbsolutePath();
      }
    }
    return a(paramContext, paramString).getAbsolutePath();
  }
  
  private static boolean b()
  {
    if (d()) {
      return Environment.isExternalStorageRemovable();
    }
    return true;
  }
  
  private static boolean c()
  {
    return Build.VERSION.SDK_INT >= 8;
  }
  
  public static byte[] c(Context paramContext, String paramString)
  {
    return a(new File(a(paramContext), paramString));
  }
  
  private static boolean d()
  {
    return Build.VERSION.SDK_INT >= 9;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */