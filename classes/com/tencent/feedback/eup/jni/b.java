package com.tencent.feedback.eup.jni;

import android.content.Context;
import com.tencent.feedback.common.a;
import com.tencent.feedback.common.c;

public final class b
  implements NativeExceptionHandler
{
  private static b b;
  private Context a;
  private String c;
  
  private b(Context paramContext)
  {
    this.a = paramContext;
  }
  
  protected static com.tencent.feedback.eup.e a(Context paramContext, long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, String paramString5, int paramInt2, byte[] paramArrayOfByte, String paramString6, String paramString7)
  {
    if (paramString3 == null) {
      paramString3 = null;
    }
    for (;;)
    {
      String str1 = a.h(paramContext);
      String str2 = Thread.currentThread().getName();
      c localc = c.a(paramContext);
      paramString1 = com.tencent.feedback.eup.b.a(paramContext, localc.h(), localc.p(), localc.k(), localc.y(), str1, str2, paramString2, paramString1, paramString1, paramString3, paramLong, paramString6, paramArrayOfByte);
      if (paramString1 != null) {
        break;
      }
      return null;
      int i = paramString3.indexOf("java.lang.Thread.getStackTrace");
      if (i >= 0)
      {
        int j = paramString3.indexOf("\n", i);
        if (j >= 0)
        {
          str1 = paramString3.substring(0, i);
          paramString3 = paramString3.substring(j);
          paramString3 = str1 + paramString3;
        }
      }
    }
    if (paramInt1 > 0)
    {
      paramString1.a(paramString1.e() + "(" + paramString5 + ")");
      paramString1.o("kernel");
    }
    for (;;)
    {
      com.tencent.feedback.common.e.a("etype:%s,sType:%s,sPN:%s", new Object[] { paramString1.e(), paramString1.D(), paramString1.C() });
      paramString1.a(true);
      paramString1.c(true);
      paramString1.h(paramString4);
      paramString1.p(paramString7);
      return paramString1;
      paramString1.o(paramString5);
      if (paramInt2 > 0) {
        paramString1.n(a.a(paramContext, paramInt2));
      } else {
        paramString1.n("unknown" + paramInt2);
      }
    }
  }
  
  public static b a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new b(paramContext);
      }
      paramContext = b;
      return paramContext;
    }
    finally {}
  }
  
  private String a()
  {
    try
    {
      String str = this.c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.c = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void handleNativeException(int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    handleNativeException(paramInt1, paramInt2, paramLong1, paramLong2, paramString1, paramString2, paramString3, paramString4, -1234567890, "", -1, -1, -1, "", "unknown");
  }
  
  /* Error */
  public final void handleNativeException(int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, String paramString5, int paramInt4, int paramInt5, int paramInt6, String paramString6, String paramString7)
  {
    // Byte code:
    //   0: ldc -95
    //   2: bipush 15
    //   4: anewarray 4	java/lang/Object
    //   7: dup
    //   8: iconst_0
    //   9: iload_1
    //   10: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: iload_2
    //   17: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: aastore
    //   21: dup
    //   22: iconst_2
    //   23: lload_3
    //   24: invokestatic 172	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   27: aastore
    //   28: dup
    //   29: iconst_3
    //   30: lload 5
    //   32: invokestatic 172	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   35: aastore
    //   36: dup
    //   37: iconst_4
    //   38: aload 7
    //   40: aastore
    //   41: dup
    //   42: iconst_5
    //   43: aload 8
    //   45: aastore
    //   46: dup
    //   47: bipush 6
    //   49: aload 9
    //   51: aastore
    //   52: dup
    //   53: bipush 7
    //   55: aload 10
    //   57: aastore
    //   58: dup
    //   59: bipush 8
    //   61: iload 11
    //   63: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: dup
    //   68: bipush 9
    //   70: aload 12
    //   72: aastore
    //   73: dup
    //   74: bipush 10
    //   76: iload 13
    //   78: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: aastore
    //   82: dup
    //   83: bipush 11
    //   85: iload 14
    //   87: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   90: aastore
    //   91: dup
    //   92: bipush 12
    //   94: iload 15
    //   96: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: aastore
    //   100: dup
    //   101: bipush 13
    //   103: aload 16
    //   105: aastore
    //   106: dup
    //   107: bipush 14
    //   109: aload 17
    //   111: aastore
    //   112: invokestatic 174	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: ldc -80
    //   117: ldc -78
    //   119: invokestatic 183	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: ldc -80
    //   125: aload 9
    //   127: invokestatic 183	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   130: pop
    //   131: aconst_null
    //   132: astore 16
    //   134: aconst_null
    //   135: astore 21
    //   137: aconst_null
    //   138: astore 20
    //   140: ldc2_w 184
    //   143: lload_3
    //   144: lmul
    //   145: lload 5
    //   147: ldc2_w 184
    //   150: ldiv
    //   151: ladd
    //   152: lstore_3
    //   153: invokestatic 190	com/tencent/feedback/eup/f:k	()Lcom/tencent/feedback/eup/f;
    //   156: astore 18
    //   158: aload 18
    //   160: ifnonnull +142 -> 302
    //   163: ldc -64
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 194	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aconst_null
    //   173: astore 18
    //   175: aload 20
    //   177: astore 19
    //   179: aload 18
    //   181: ifnull +76 -> 257
    //   184: ldc -60
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokestatic 198	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload 18
    //   195: iconst_1
    //   196: invokeinterface 203 2 0
    //   201: ldc -51
    //   203: iconst_0
    //   204: anewarray 4	java/lang/Object
    //   207: invokestatic 198	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: aload 18
    //   212: iconst_1
    //   213: aload 7
    //   215: aload 8
    //   217: aload 9
    //   219: iload 11
    //   221: lload_3
    //   222: invokeinterface 209 8 0
    //   227: astore 16
    //   229: ldc -45
    //   231: iconst_0
    //   232: anewarray 4	java/lang/Object
    //   235: invokestatic 198	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload 18
    //   240: iconst_1
    //   241: aload 7
    //   243: aload 8
    //   245: aload 9
    //   247: iload 11
    //   249: lload_3
    //   250: invokeinterface 215 8 0
    //   255: astore 19
    //   257: aload_0
    //   258: getfield 19	com/tencent/feedback/eup/jni/b:a	Landroid/content/Context;
    //   261: lload_3
    //   262: aload 7
    //   264: aload 8
    //   266: aload 9
    //   268: aload 10
    //   270: iload 11
    //   272: aload 12
    //   274: iload 13
    //   276: aload 16
    //   278: aload 19
    //   280: aload 17
    //   282: invokestatic 217	com/tencent/feedback/eup/jni/b:a	(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I[BLjava/lang/String;Ljava/lang/String;)Lcom/tencent/feedback/eup/e;
    //   285: astore 10
    //   287: aload 10
    //   289: ifnonnull +112 -> 401
    //   292: ldc -37
    //   294: iconst_0
    //   295: anewarray 4	java/lang/Object
    //   298: invokestatic 194	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: return
    //   302: aload 18
    //   304: invokevirtual 223	com/tencent/feedback/eup/f:q	()Lcom/tencent/feedback/eup/CrashHandleListener;
    //   307: astore 18
    //   309: goto -134 -> 175
    //   312: astore 16
    //   314: ldc -31
    //   316: iconst_1
    //   317: anewarray 4	java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: aload 16
    //   324: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload 16
    //   333: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   336: goto -135 -> 201
    //   339: astore 16
    //   341: ldc -22
    //   343: iconst_1
    //   344: anewarray 4	java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload 16
    //   351: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   354: aastore
    //   355: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: aload 16
    //   360: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   363: aload 21
    //   365: astore 16
    //   367: goto -138 -> 229
    //   370: astore 19
    //   372: ldc -20
    //   374: iconst_1
    //   375: anewarray 4	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: aload 19
    //   382: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   385: aastore
    //   386: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   389: aload 19
    //   391: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   394: aload 20
    //   396: astore 19
    //   398: goto -141 -> 257
    //   401: aload 18
    //   403: ifnull +174 -> 577
    //   406: ldc -18
    //   408: iconst_0
    //   409: anewarray 4	java/lang/Object
    //   412: invokestatic 174	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   415: aload 18
    //   417: iconst_1
    //   418: aload 7
    //   420: aload 8
    //   422: aload 9
    //   424: iload 11
    //   426: lload_3
    //   427: aload 10
    //   429: invokevirtual 241	com/tencent/feedback/eup/e:m	()Ljava/lang/String;
    //   432: aload 10
    //   434: invokevirtual 244	com/tencent/feedback/eup/e:G	()Ljava/lang/String;
    //   437: aload 10
    //   439: invokevirtual 247	com/tencent/feedback/eup/e:x	()Ljava/lang/String;
    //   442: invokeinterface 251 11 0
    //   447: istore 22
    //   449: iload 22
    //   451: ifeq +160 -> 611
    //   454: aload_0
    //   455: getfield 19	com/tencent/feedback/eup/jni/b:a	Landroid/content/Context;
    //   458: invokestatic 256	com/tencent/feedback/eup/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/eup/c;
    //   461: astore 7
    //   463: aload 7
    //   465: ifnull +36 -> 501
    //   468: ldc_w 258
    //   471: iconst_1
    //   472: anewarray 4	java/lang/Object
    //   475: dup
    //   476: iconst_0
    //   477: aload 7
    //   479: aload 10
    //   481: invokestatic 264	com/tencent/feedback/eup/CrashReport:getCrashRuntimeStrategy	()Lcom/tencent/feedback/eup/CrashStrategyBean;
    //   484: invokevirtual 267	com/tencent/feedback/eup/c:a	(Lcom/tencent/feedback/eup/e;Lcom/tencent/feedback/eup/CrashStrategyBean;)Z
    //   487: invokestatic 272	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   490: aastore
    //   491: invokestatic 174	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   494: aload_0
    //   495: invokespecial 274	com/tencent/feedback/eup/jni/b:a	()Ljava/lang/String;
    //   498: invokestatic 277	com/tencent/feedback/eup/jni/c:a	(Ljava/lang/String;)V
    //   501: aload 18
    //   503: ifnull -202 -> 301
    //   506: ldc_w 279
    //   509: iconst_0
    //   510: anewarray 4	java/lang/Object
    //   513: invokestatic 198	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   516: aload 18
    //   518: iconst_1
    //   519: invokeinterface 283 2 0
    //   524: pop
    //   525: return
    //   526: astore 7
    //   528: ldc_w 285
    //   531: iconst_1
    //   532: anewarray 4	java/lang/Object
    //   535: dup
    //   536: iconst_0
    //   537: aload 7
    //   539: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   542: aastore
    //   543: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   546: aload 7
    //   548: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   551: return
    //   552: astore 7
    //   554: ldc_w 287
    //   557: iconst_1
    //   558: anewarray 4	java/lang/Object
    //   561: dup
    //   562: iconst_0
    //   563: aload 7
    //   565: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   568: aastore
    //   569: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   572: aload 7
    //   574: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   577: iconst_1
    //   578: istore 22
    //   580: goto -131 -> 449
    //   583: astore 7
    //   585: ldc_w 289
    //   588: iconst_1
    //   589: anewarray 4	java/lang/Object
    //   592: dup
    //   593: iconst_0
    //   594: aload 7
    //   596: invokevirtual 226	java/lang/Throwable:toString	()Ljava/lang/String;
    //   599: aastore
    //   600: invokestatic 229	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: aload 7
    //   605: invokevirtual 232	java/lang/Throwable:printStackTrace	()V
    //   608: goto -107 -> 501
    //   611: ldc_w 291
    //   614: iconst_0
    //   615: anewarray 4	java/lang/Object
    //   618: invokestatic 194	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   621: goto -120 -> 501
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	624	0	this	b
    //   0	624	1	paramInt1	int
    //   0	624	2	paramInt2	int
    //   0	624	3	paramLong1	long
    //   0	624	5	paramLong2	long
    //   0	624	7	paramString1	String
    //   0	624	8	paramString2	String
    //   0	624	9	paramString3	String
    //   0	624	10	paramString4	String
    //   0	624	11	paramInt3	int
    //   0	624	12	paramString5	String
    //   0	624	13	paramInt4	int
    //   0	624	14	paramInt5	int
    //   0	624	15	paramInt6	int
    //   0	624	16	paramString6	String
    //   0	624	17	paramString7	String
    //   156	361	18	localObject1	Object
    //   177	102	19	localObject2	Object
    //   370	20	19	localThrowable	Throwable
    //   396	1	19	localObject3	Object
    //   138	257	20	localObject4	Object
    //   135	229	21	localObject5	Object
    //   447	132	22	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   184	201	312	java/lang/Throwable
    //   201	229	339	java/lang/Throwable
    //   229	257	370	java/lang/Throwable
    //   506	525	526	java/lang/Throwable
    //   415	449	552	java/lang/Throwable
    //   454	463	583	java/lang/Throwable
    //   468	501	583	java/lang/Throwable
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\jni\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */