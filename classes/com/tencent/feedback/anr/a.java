package com.tencent.feedback.anr;

import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private String a;
  private long b;
  private String c;
  private String d;
  private int e;
  
  protected static String a(BufferedReader paramBufferedReader)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < 3)
    {
      String str = paramBufferedReader.readLine();
      if (str == null) {
        return null;
      }
      localStringBuffer.append(str + "\n");
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  /* Error */
  public static void a(String paramString, e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: aload_1
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: new 50	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 53	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 57	java/io/File:exists	()Z
    //   22: ifeq -14 -> 8
    //   25: aload_2
    //   26: invokevirtual 61	java/io/File:lastModified	()J
    //   29: pop2
    //   30: aload_2
    //   31: invokevirtual 64	java/io/File:length	()J
    //   34: pop2
    //   35: aconst_null
    //   36: astore_0
    //   37: new 23	java/io/BufferedReader
    //   40: dup
    //   41: new 66	java/io/FileReader
    //   44: dup
    //   45: aload_2
    //   46: invokespecial 69	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   49: invokespecial 72	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   52: astore_2
    //   53: ldc 74
    //   55: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   58: astore_0
    //   59: ldc 82
    //   61: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   64: astore_3
    //   65: ldc 84
    //   67: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   70: astore 4
    //   72: ldc 86
    //   74: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   77: astore 5
    //   79: new 88	java/text/SimpleDateFormat
    //   82: dup
    //   83: ldc 90
    //   85: getstatic 96	java/util/Locale:US	Ljava/util/Locale;
    //   88: invokespecial 99	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   91: astore 6
    //   93: aload_2
    //   94: iconst_1
    //   95: anewarray 76	java/util/regex/Pattern
    //   98: dup
    //   99: iconst_0
    //   100: aload_0
    //   101: aastore
    //   102: invokestatic 102	com/tencent/feedback/anr/a:a	(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;
    //   105: astore 7
    //   107: aload 7
    //   109: ifnull +372 -> 481
    //   112: aload 7
    //   114: iconst_1
    //   115: aaload
    //   116: invokevirtual 103	java/lang/Object:toString	()Ljava/lang/String;
    //   119: ldc 105
    //   121: invokevirtual 111	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   124: astore 7
    //   126: aload 7
    //   128: iconst_2
    //   129: aaload
    //   130: invokestatic 117	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   133: lstore 9
    //   135: aload 6
    //   137: new 29	java/lang/StringBuilder
    //   140: dup
    //   141: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   144: aload 7
    //   146: iconst_4
    //   147: aaload
    //   148: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: ldc 119
    //   153: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload 7
    //   158: iconst_5
    //   159: aaload
    //   160: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokevirtual 123	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   169: invokevirtual 128	java/util/Date:getTime	()J
    //   172: lstore 11
    //   174: aload_2
    //   175: iconst_1
    //   176: anewarray 76	java/util/regex/Pattern
    //   179: dup
    //   180: iconst_0
    //   181: aload 4
    //   183: aastore
    //   184: invokestatic 102	com/tencent/feedback/anr/a:a	(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;
    //   187: astore 7
    //   189: aload 7
    //   191: ifnonnull +14 -> 205
    //   194: aload_2
    //   195: invokevirtual 131	java/io/BufferedReader:close	()V
    //   198: return
    //   199: astore_0
    //   200: aload_0
    //   201: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   204: return
    //   205: aload 4
    //   207: aload 7
    //   209: iconst_1
    //   210: aaload
    //   211: invokevirtual 103	java/lang/Object:toString	()Ljava/lang/String;
    //   214: invokevirtual 138	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   217: astore 7
    //   219: aload 7
    //   221: invokevirtual 143	java/util/regex/Matcher:find	()Z
    //   224: pop
    //   225: aload 7
    //   227: iconst_1
    //   228: invokevirtual 147	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   231: pop
    //   232: aload_1
    //   233: lload 9
    //   235: lload 11
    //   237: aload 7
    //   239: iconst_1
    //   240: invokevirtual 147	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   243: invokeinterface 152 6 0
    //   248: istore 13
    //   250: iload 13
    //   252: ifne +14 -> 266
    //   255: aload_2
    //   256: invokevirtual 131	java/io/BufferedReader:close	()V
    //   259: return
    //   260: astore_0
    //   261: aload_0
    //   262: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   265: return
    //   266: aload_2
    //   267: iconst_2
    //   268: anewarray 76	java/util/regex/Pattern
    //   271: dup
    //   272: iconst_0
    //   273: aload 5
    //   275: aastore
    //   276: dup
    //   277: iconst_1
    //   278: aload_3
    //   279: aastore
    //   280: invokestatic 102	com/tencent/feedback/anr/a:a	(Ljava/io/BufferedReader;[Ljava/util/regex/Pattern;)[Ljava/lang/Object;
    //   283: astore 7
    //   285: aload 7
    //   287: ifnull -194 -> 93
    //   290: aload 7
    //   292: iconst_0
    //   293: aaload
    //   294: aload 5
    //   296: if_acmpne +144 -> 440
    //   299: aload 7
    //   301: iconst_1
    //   302: aaload
    //   303: invokevirtual 103	java/lang/Object:toString	()Ljava/lang/String;
    //   306: astore 7
    //   308: ldc -102
    //   310: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   313: aload 7
    //   315: invokevirtual 138	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   318: astore 8
    //   320: aload 8
    //   322: invokevirtual 143	java/util/regex/Matcher:find	()Z
    //   325: pop
    //   326: aload 8
    //   328: invokevirtual 156	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   331: astore 8
    //   333: aload 8
    //   335: iconst_1
    //   336: aload 8
    //   338: invokevirtual 159	java/lang/String:length	()I
    //   341: iconst_1
    //   342: isub
    //   343: invokevirtual 163	java/lang/String:substring	(II)Ljava/lang/String;
    //   346: astore 8
    //   348: aload 7
    //   350: ldc -91
    //   352: invokevirtual 169	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   355: pop
    //   356: ldc -85
    //   358: invokestatic 80	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   361: aload 7
    //   363: invokevirtual 138	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   366: astore 7
    //   368: aload 7
    //   370: invokevirtual 143	java/util/regex/Matcher:find	()Z
    //   373: pop
    //   374: aload 7
    //   376: invokevirtual 156	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   379: astore 7
    //   381: aload_1
    //   382: aload 8
    //   384: aload 7
    //   386: aload 7
    //   388: ldc -83
    //   390: invokevirtual 177	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   393: iconst_1
    //   394: iadd
    //   395: invokevirtual 179	java/lang/String:substring	(I)Ljava/lang/String;
    //   398: invokestatic 184	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   401: aload_2
    //   402: invokestatic 186	com/tencent/feedback/anr/a:a	(Ljava/io/BufferedReader;)Ljava/lang/String;
    //   405: aload_2
    //   406: invokestatic 188	com/tencent/feedback/anr/a:b	(Ljava/io/BufferedReader;)Ljava/lang/String;
    //   409: invokeinterface 191 5 0
    //   414: pop
    //   415: goto -149 -> 266
    //   418: astore_1
    //   419: aload_2
    //   420: astore_0
    //   421: aload_1
    //   422: invokevirtual 192	java/lang/Exception:printStackTrace	()V
    //   425: aload_0
    //   426: ifnull -418 -> 8
    //   429: aload_0
    //   430: invokevirtual 131	java/io/BufferedReader:close	()V
    //   433: return
    //   434: astore_0
    //   435: aload_0
    //   436: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   439: return
    //   440: aload_1
    //   441: aload 7
    //   443: iconst_1
    //   444: aaload
    //   445: invokevirtual 103	java/lang/Object:toString	()Ljava/lang/String;
    //   448: ldc 105
    //   450: invokevirtual 111	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   453: iconst_2
    //   454: aaload
    //   455: invokestatic 117	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   458: invokeinterface 195 3 0
    //   463: istore 13
    //   465: iload 13
    //   467: ifne -374 -> 93
    //   470: aload_2
    //   471: invokevirtual 131	java/io/BufferedReader:close	()V
    //   474: return
    //   475: astore_0
    //   476: aload_0
    //   477: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   480: return
    //   481: aload_2
    //   482: invokevirtual 131	java/io/BufferedReader:close	()V
    //   485: return
    //   486: astore_0
    //   487: aload_0
    //   488: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   491: return
    //   492: astore_0
    //   493: aconst_null
    //   494: astore_1
    //   495: aload_1
    //   496: ifnull +7 -> 503
    //   499: aload_1
    //   500: invokevirtual 131	java/io/BufferedReader:close	()V
    //   503: aload_0
    //   504: athrow
    //   505: astore_1
    //   506: aload_1
    //   507: invokevirtual 134	java/io/IOException:printStackTrace	()V
    //   510: goto -7 -> 503
    //   513: astore_0
    //   514: aload_2
    //   515: astore_1
    //   516: goto -21 -> 495
    //   519: astore_2
    //   520: aload_0
    //   521: astore_1
    //   522: aload_2
    //   523: astore_0
    //   524: goto -29 -> 495
    //   527: astore_1
    //   528: goto -107 -> 421
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	531	0	paramString	String
    //   0	531	1	parame	e
    //   17	498	2	localObject1	Object
    //   519	4	2	localObject2	Object
    //   64	215	3	localPattern1	Pattern
    //   70	136	4	localPattern2	Pattern
    //   77	218	5	localPattern3	Pattern
    //   91	45	6	localSimpleDateFormat	java.text.SimpleDateFormat
    //   105	337	7	localObject3	Object
    //   318	65	8	localObject4	Object
    //   133	101	9	l1	long
    //   172	64	11	l2	long
    //   248	218	13	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   194	198	199	java/io/IOException
    //   255	259	260	java/io/IOException
    //   53	93	418	java/lang/Exception
    //   93	107	418	java/lang/Exception
    //   112	189	418	java/lang/Exception
    //   205	250	418	java/lang/Exception
    //   266	285	418	java/lang/Exception
    //   299	415	418	java/lang/Exception
    //   440	465	418	java/lang/Exception
    //   429	433	434	java/io/IOException
    //   470	474	475	java/io/IOException
    //   481	485	486	java/io/IOException
    //   37	53	492	finally
    //   499	503	505	java/io/IOException
    //   53	93	513	finally
    //   93	107	513	finally
    //   112	189	513	finally
    //   205	250	513	finally
    //   266	285	513	finally
    //   299	415	513	finally
    //   440	465	513	finally
    //   421	425	519	finally
    //   37	53	527	java/lang/Exception
  }
  
  protected static Object[] a(BufferedReader paramBufferedReader, Pattern... paramVarArgs)
  {
    if ((paramBufferedReader == null) || (paramVarArgs == null)) {
      return null;
    }
    for (;;)
    {
      String str = paramBufferedReader.readLine();
      if (str == null) {
        break;
      }
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        Pattern localPattern = paramVarArgs[i];
        if (localPattern.matcher(str).matches()) {
          return new Object[] { localPattern, str };
        }
        i += 1;
      }
    }
  }
  
  protected static String b(BufferedReader paramBufferedReader)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (;;)
    {
      String str = paramBufferedReader.readLine();
      if ((str == null) || (str.trim().length() <= 0)) {
        break;
      }
      localStringBuffer.append(str + "\n");
    }
    return localStringBuffer.toString();
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public final void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public final void a(String paramString)
  {
    this.a = paramString;
  }
  
  public final long b()
  {
    return this.b;
  }
  
  public final void b(String paramString)
  {
    this.c = paramString;
  }
  
  public final int c()
  {
    return this.e;
  }
  
  public final void c(String paramString)
  {
    this.d = paramString;
  }
  
  public final String d()
  {
    return this.c;
  }
  
  public final String e()
  {
    return this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\anr\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */