package com.android.dazhihui.d;

import android.os.Environment;
import java.io.File;

public class d
{
  private static File a;
  private static boolean b = Environment.getExternalStorageState().equals("mounted");
  
  static
  {
    if (b)
    {
      String str = Environment.getExternalStorageDirectory().getAbsolutePath();
      a = new File(str + "/log_error_dzh.txt");
    }
  }
  
  /* Error */
  public static void a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 26	com/android/dazhihui/d/d:b	Z
    //   5: ifne +4 -> 9
    //   8: return
    //   9: new 61	java/io/BufferedWriter
    //   12: dup
    //   13: new 63	java/io/FileWriter
    //   16: dup
    //   17: getstatic 54	com/android/dazhihui/d/d:a	Ljava/io/File;
    //   20: iconst_1
    //   21: invokespecial 66	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   24: invokespecial 69	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   27: astore_1
    //   28: new 71	java/io/PrintWriter
    //   31: dup
    //   32: aload_1
    //   33: invokespecial 72	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   36: astore_2
    //   37: aload_2
    //   38: astore 4
    //   40: aload_1
    //   41: astore_3
    //   42: aload_2
    //   43: new 37	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   50: ldc 74
    //   52: invokestatic 80	java/lang/System:currentTimeMillis	()J
    //   55: invokestatic 86	android/text/format/DateFormat:format	(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;
    //   58: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: ldc 91
    //   63: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: invokevirtual 94	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   72: aload_2
    //   73: astore 4
    //   75: aload_1
    //   76: astore_3
    //   77: aload_2
    //   78: new 37	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   85: aload_0
    //   86: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: ldc 91
    //   91: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokevirtual 94	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   100: aload_1
    //   101: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   104: aload_2
    //   105: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   108: return
    //   109: astore_3
    //   110: aconst_null
    //   111: astore_0
    //   112: aload_2
    //   113: astore_1
    //   114: aload_3
    //   115: invokevirtual 102	java/io/FileNotFoundException:printStackTrace	()V
    //   118: aload_1
    //   119: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   122: aload_0
    //   123: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   126: return
    //   127: astore 5
    //   129: aconst_null
    //   130: astore_0
    //   131: aconst_null
    //   132: astore_1
    //   133: aload_0
    //   134: astore 4
    //   136: aload_1
    //   137: astore_3
    //   138: aload 5
    //   140: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   143: aload_1
    //   144: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   147: aload_0
    //   148: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   151: return
    //   152: astore_2
    //   153: aconst_null
    //   154: astore_0
    //   155: aconst_null
    //   156: astore_1
    //   157: aload_1
    //   158: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   161: aload_0
    //   162: invokestatic 99	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   165: aload_2
    //   166: athrow
    //   167: astore_2
    //   168: aconst_null
    //   169: astore_0
    //   170: goto -13 -> 157
    //   173: astore_2
    //   174: aload 4
    //   176: astore_0
    //   177: aload_3
    //   178: astore_1
    //   179: goto -22 -> 157
    //   182: astore_2
    //   183: goto -26 -> 157
    //   186: astore 5
    //   188: aconst_null
    //   189: astore_0
    //   190: goto -57 -> 133
    //   193: astore 5
    //   195: aload_2
    //   196: astore_0
    //   197: goto -64 -> 133
    //   200: astore_3
    //   201: aconst_null
    //   202: astore_0
    //   203: goto -89 -> 114
    //   206: astore_3
    //   207: aload_2
    //   208: astore_0
    //   209: goto -95 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramString	String
    //   27	152	1	localObject1	Object
    //   1	112	2	localPrintWriter	java.io.PrintWriter
    //   152	14	2	localObject2	Object
    //   167	1	2	localObject3	Object
    //   173	1	2	localObject4	Object
    //   182	26	2	localObject5	Object
    //   41	36	3	localObject6	Object
    //   109	6	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   137	41	3	localObject7	Object
    //   200	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   206	1	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   38	137	4	localObject8	Object
    //   127	12	5	localIOException1	java.io.IOException
    //   186	1	5	localIOException2	java.io.IOException
    //   193	1	5	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   9	28	109	java/io/FileNotFoundException
    //   9	28	127	java/io/IOException
    //   9	28	152	finally
    //   28	37	167	finally
    //   42	72	173	finally
    //   77	100	173	finally
    //   138	143	173	finally
    //   114	118	182	finally
    //   28	37	186	java/io/IOException
    //   42	72	193	java/io/IOException
    //   77	100	193	java/io/IOException
    //   28	37	200	java/io/FileNotFoundException
    //   42	72	206	java/io/FileNotFoundException
    //   77	100	206	java/io/FileNotFoundException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */