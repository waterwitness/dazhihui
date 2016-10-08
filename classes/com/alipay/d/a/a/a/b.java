package com.alipay.d.a.a.a;

public final class b
{
  /* Error */
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 12	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 16	java/lang/StringBuilder:<init>	()V
    //   9: astore_3
    //   10: new 18	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 21	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: astore_0
    //   20: aload_0
    //   21: invokevirtual 25	java/io/File:exists	()Z
    //   24: ifne +5 -> 29
    //   27: aconst_null
    //   28: areturn
    //   29: new 27	java/io/BufferedReader
    //   32: dup
    //   33: new 29	java/io/InputStreamReader
    //   36: dup
    //   37: new 31	java/io/FileInputStream
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: ldc 36
    //   47: invokespecial 39	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   50: invokespecial 42	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore_0
    //   54: aload_0
    //   55: invokevirtual 46	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   58: astore_1
    //   59: aload_1
    //   60: ifnull +26 -> 86
    //   63: aload_3
    //   64: aload_1
    //   65: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: goto -15 -> 54
    //   72: astore_1
    //   73: aload_0
    //   74: ifnull +7 -> 81
    //   77: aload_0
    //   78: invokevirtual 53	java/io/BufferedReader:close	()V
    //   81: aload_3
    //   82: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: areturn
    //   86: aload_0
    //   87: invokevirtual 53	java/io/BufferedReader:close	()V
    //   90: goto -9 -> 81
    //   93: astore_0
    //   94: goto -13 -> 81
    //   97: astore_1
    //   98: aconst_null
    //   99: astore_0
    //   100: aload_0
    //   101: ifnull +7 -> 108
    //   104: aload_0
    //   105: invokevirtual 53	java/io/BufferedReader:close	()V
    //   108: aload_1
    //   109: athrow
    //   110: astore_0
    //   111: goto -30 -> 81
    //   114: astore_0
    //   115: goto -7 -> 108
    //   118: astore_1
    //   119: goto -19 -> 100
    //   122: astore_0
    //   123: aload_2
    //   124: astore_0
    //   125: goto -52 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramString1	String
    //   0	128	1	paramString2	String
    //   1	123	2	localObject	Object
    //   9	73	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   54	59	72	java/io/IOException
    //   63	69	72	java/io/IOException
    //   86	90	93	java/lang/Throwable
    //   10	27	97	finally
    //   29	54	97	finally
    //   77	81	110	java/lang/Throwable
    //   104	108	114	java/lang/Throwable
    //   54	59	118	finally
    //   63	69	118	finally
    //   10	27	122	java/io/IOException
    //   29	54	122	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */