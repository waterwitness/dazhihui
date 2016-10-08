package com.tencent.beacon.a.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.beacon.e.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{
  private long a = -1L;
  private int b = -1;
  private int c = -1;
  private long d = -1L;
  private byte[] e = null;
  private long f = 0L;
  
  public a() {}
  
  public a(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramLong;
    this.e = paramArrayOfByte;
    if (paramArrayOfByte != null) {
      this.f = paramArrayOfByte.length;
    }
  }
  
  /* Error */
  public static int a(Context paramContext, int[] paramArrayOfInt, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc 38
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: ifnonnull +14 -> 27
    //   16: ldc 45
    //   18: iconst_0
    //   19: anewarray 4	java/lang/Object
    //   22: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: iconst_m1
    //   26: ireturn
    //   27: lload_2
    //   28: lload 4
    //   30: lcmp
    //   31: ifle +5 -> 36
    //   34: iconst_0
    //   35: ireturn
    //   36: new 49	java/lang/StringBuilder
    //   39: dup
    //   40: ldc 51
    //   42: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   45: lload_2
    //   46: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   49: ldc 60
    //   51: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: ldc 65
    //   56: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: lload 4
    //   61: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   64: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 8
    //   69: aload_1
    //   70: ifnull +359 -> 429
    //   73: aload_1
    //   74: arraylength
    //   75: ifle +354 -> 429
    //   78: ldc 71
    //   80: astore 6
    //   82: iconst_0
    //   83: istore 9
    //   85: iload 9
    //   87: aload_1
    //   88: arraylength
    //   89: if_icmpge +41 -> 130
    //   92: new 49	java/lang/StringBuilder
    //   95: dup
    //   96: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   99: aload 6
    //   101: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: ldc 74
    //   106: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload_1
    //   110: iload 9
    //   112: iaload
    //   113: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   116: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: astore 6
    //   121: iload 9
    //   123: iconst_1
    //   124: iadd
    //   125: istore 9
    //   127: goto -42 -> 85
    //   130: aload 6
    //   132: iconst_4
    //   133: invokevirtual 83	java/lang/String:substring	(I)Ljava/lang/String;
    //   136: astore_1
    //   137: new 49	java/lang/StringBuilder
    //   140: dup
    //   141: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   144: aload 8
    //   146: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: ldc 85
    //   151: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_1
    //   155: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: ldc 87
    //   160: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: astore_1
    //   167: new 49	java/lang/StringBuilder
    //   170: dup
    //   171: ldc 89
    //   173: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   176: aload_1
    //   177: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_0
    //   191: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   194: astore_0
    //   195: aload_0
    //   196: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   199: astore 6
    //   201: aload 6
    //   203: ldc 100
    //   205: aload_1
    //   206: aconst_null
    //   207: invokevirtual 106	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   210: istore 9
    //   212: new 49	java/lang/StringBuilder
    //   215: dup
    //   216: ldc 108
    //   218: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: iload 9
    //   223: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   226: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: iconst_0
    //   230: anewarray 4	java/lang/Object
    //   233: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: aload 6
    //   238: ifnull +16 -> 254
    //   241: aload 6
    //   243: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   246: ifeq +8 -> 254
    //   249: aload 6
    //   251: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   254: aload_0
    //   255: ifnull +7 -> 262
    //   258: aload_0
    //   259: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   262: ldc 118
    //   264: iconst_0
    //   265: anewarray 4	java/lang/Object
    //   268: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: iload 9
    //   273: ireturn
    //   274: astore 6
    //   276: aconst_null
    //   277: astore_0
    //   278: aload 7
    //   280: astore_1
    //   281: aload 6
    //   283: astore 7
    //   285: aload 7
    //   287: invokevirtual 121	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   290: iconst_0
    //   291: anewarray 4	java/lang/Object
    //   294: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   297: aload_0
    //   298: ifnull +14 -> 312
    //   301: aload_0
    //   302: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   305: ifeq +7 -> 312
    //   308: aload_0
    //   309: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   312: aload_1
    //   313: ifnull +7 -> 320
    //   316: aload_1
    //   317: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   320: ldc 118
    //   322: iconst_0
    //   323: anewarray 4	java/lang/Object
    //   326: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: iconst_m1
    //   330: istore 9
    //   332: goto -61 -> 271
    //   335: astore_1
    //   336: aconst_null
    //   337: astore 6
    //   339: aconst_null
    //   340: astore_0
    //   341: aload 6
    //   343: ifnull +16 -> 359
    //   346: aload 6
    //   348: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   351: ifeq +8 -> 359
    //   354: aload 6
    //   356: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   359: aload_0
    //   360: ifnull +7 -> 367
    //   363: aload_0
    //   364: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   367: ldc 118
    //   369: iconst_0
    //   370: anewarray 4	java/lang/Object
    //   373: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   376: aload_1
    //   377: athrow
    //   378: astore_1
    //   379: aconst_null
    //   380: astore 6
    //   382: goto -41 -> 341
    //   385: astore_1
    //   386: goto -45 -> 341
    //   389: astore 6
    //   391: aload_1
    //   392: astore 7
    //   394: aload 6
    //   396: astore_1
    //   397: aload_0
    //   398: astore 6
    //   400: aload 7
    //   402: astore_0
    //   403: goto -62 -> 341
    //   406: astore 7
    //   408: aconst_null
    //   409: astore 6
    //   411: aload_0
    //   412: astore_1
    //   413: aload 6
    //   415: astore_0
    //   416: goto -131 -> 285
    //   419: astore 7
    //   421: aload_0
    //   422: astore_1
    //   423: aload 6
    //   425: astore_0
    //   426: goto -141 -> 285
    //   429: aload 8
    //   431: astore_1
    //   432: goto -265 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	435	0	paramContext	Context
    //   0	435	1	paramArrayOfInt	int[]
    //   0	435	2	paramLong1	long
    //   0	435	4	paramLong2	long
    //   80	170	6	localObject1	Object
    //   274	8	6	localThrowable1	Throwable
    //   337	44	6	localObject2	Object
    //   389	6	6	localObject3	Object
    //   398	26	6	localContext	Context
    //   1	400	7	localObject4	Object
    //   406	1	7	localThrowable2	Throwable
    //   419	1	7	localThrowable3	Throwable
    //   67	363	8	str	String
    //   83	248	9	i	int
    // Exception table:
    //   from	to	target	type
    //   190	195	274	java/lang/Throwable
    //   190	195	335	finally
    //   195	201	378	finally
    //   201	236	385	finally
    //   285	297	389	finally
    //   195	201	406	java/lang/Throwable
    //   201	236	419	java/lang/Throwable
  }
  
  /* Error */
  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: ldc 124
    //   2: iconst_0
    //   3: anewarray 4	java/lang/Object
    //   6: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc 126
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: iconst_m1
    //   23: ireturn
    //   24: aload_1
    //   25: ifnull +8 -> 33
    //   28: aload_1
    //   29: arraylength
    //   30: ifgt +5 -> 35
    //   33: iconst_0
    //   34: ireturn
    //   35: aload_0
    //   36: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   44: astore_3
    //   45: aload_3
    //   46: astore 5
    //   48: aload_2
    //   49: astore 4
    //   51: new 130	java/lang/StringBuffer
    //   54: dup
    //   55: invokespecial 131	java/lang/StringBuffer:<init>	()V
    //   58: astore_0
    //   59: iconst_0
    //   60: istore 8
    //   62: iconst_0
    //   63: istore 6
    //   65: aload_3
    //   66: astore 5
    //   68: aload_2
    //   69: astore 4
    //   71: iload 6
    //   73: istore 7
    //   75: iload 8
    //   77: aload_1
    //   78: arraylength
    //   79: if_icmpge +192 -> 271
    //   82: aload_3
    //   83: astore 5
    //   85: aload_2
    //   86: astore 4
    //   88: iload 6
    //   90: istore 7
    //   92: aload_1
    //   93: iload 8
    //   95: aaload
    //   96: invokevirtual 137	java/lang/Long:longValue	()J
    //   99: lstore 9
    //   101: aload_3
    //   102: astore 5
    //   104: aload_2
    //   105: astore 4
    //   107: iload 6
    //   109: istore 7
    //   111: aload_0
    //   112: new 49	java/lang/StringBuilder
    //   115: dup
    //   116: ldc -117
    //   118: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: lload 9
    //   123: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   126: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: invokevirtual 142	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   132: pop
    //   133: iload 6
    //   135: istore 7
    //   137: iload 8
    //   139: ifle +419 -> 558
    //   142: iload 6
    //   144: istore 7
    //   146: iload 8
    //   148: bipush 25
    //   150: irem
    //   151: ifne +407 -> 558
    //   154: aload_3
    //   155: astore 5
    //   157: aload_2
    //   158: astore 4
    //   160: iload 6
    //   162: istore 7
    //   164: new 49	java/lang/StringBuilder
    //   167: dup
    //   168: ldc -112
    //   170: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   173: iload 8
    //   175: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   178: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: iconst_0
    //   182: anewarray 4	java/lang/Object
    //   185: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload_3
    //   189: astore 5
    //   191: aload_2
    //   192: astore 4
    //   194: iload 6
    //   196: istore 7
    //   198: iload 6
    //   200: aload_3
    //   201: ldc 100
    //   203: aload_0
    //   204: iconst_4
    //   205: invokevirtual 145	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   208: aconst_null
    //   209: invokevirtual 106	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   212: iadd
    //   213: istore 6
    //   215: aload_3
    //   216: astore 5
    //   218: aload_2
    //   219: astore 4
    //   221: iload 6
    //   223: istore 7
    //   225: aload_0
    //   226: iconst_0
    //   227: invokevirtual 149	java/lang/StringBuffer:setLength	(I)V
    //   230: aload_3
    //   231: astore 5
    //   233: aload_2
    //   234: astore 4
    //   236: iload 6
    //   238: istore 7
    //   240: new 49	java/lang/StringBuilder
    //   243: dup
    //   244: ldc -105
    //   246: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   249: iload 6
    //   251: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   254: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: iload 6
    //   266: istore 7
    //   268: goto +290 -> 558
    //   271: iload 6
    //   273: istore 8
    //   275: aload_3
    //   276: astore 5
    //   278: aload_2
    //   279: astore 4
    //   281: iload 6
    //   283: istore 7
    //   285: aload_0
    //   286: invokevirtual 155	java/lang/StringBuffer:length	()I
    //   289: ifle +49 -> 338
    //   292: aload_3
    //   293: astore 5
    //   295: aload_2
    //   296: astore 4
    //   298: iload 6
    //   300: istore 7
    //   302: aload_3
    //   303: ldc 100
    //   305: aload_0
    //   306: iconst_4
    //   307: invokevirtual 145	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   310: aconst_null
    //   311: invokevirtual 106	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   314: istore 8
    //   316: iload 8
    //   318: iload 6
    //   320: iadd
    //   321: istore 6
    //   323: aload_3
    //   324: astore 5
    //   326: aload_2
    //   327: astore 4
    //   329: aload_0
    //   330: iconst_0
    //   331: invokevirtual 149	java/lang/StringBuffer:setLength	(I)V
    //   334: iload 6
    //   336: istore 8
    //   338: aload_3
    //   339: astore 5
    //   341: aload_2
    //   342: astore 4
    //   344: iload 8
    //   346: istore 7
    //   348: new 49	java/lang/StringBuilder
    //   351: dup
    //   352: ldc -99
    //   354: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   357: iload 8
    //   359: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   362: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: iconst_0
    //   366: anewarray 4	java/lang/Object
    //   369: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: aload_3
    //   373: ifnull +14 -> 387
    //   376: aload_3
    //   377: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   380: ifeq +7 -> 387
    //   383: aload_3
    //   384: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   387: aload_2
    //   388: ifnull +7 -> 395
    //   391: aload_2
    //   392: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   395: ldc -97
    //   397: iconst_0
    //   398: anewarray 4	java/lang/Object
    //   401: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: iload 8
    //   406: ireturn
    //   407: astore_0
    //   408: aconst_null
    //   409: astore_1
    //   410: aconst_null
    //   411: astore_2
    //   412: iconst_0
    //   413: istore 6
    //   415: aload_1
    //   416: astore 5
    //   418: aload_2
    //   419: astore 4
    //   421: aload_0
    //   422: invokevirtual 121	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   425: iconst_0
    //   426: anewarray 4	java/lang/Object
    //   429: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: aload_1
    //   433: ifnull +14 -> 447
    //   436: aload_1
    //   437: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   440: ifeq +7 -> 447
    //   443: aload_1
    //   444: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   447: aload_2
    //   448: ifnull +7 -> 455
    //   451: aload_2
    //   452: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   455: ldc -97
    //   457: iconst_0
    //   458: anewarray 4	java/lang/Object
    //   461: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   464: iload 6
    //   466: ireturn
    //   467: astore_0
    //   468: aconst_null
    //   469: astore 5
    //   471: aconst_null
    //   472: astore_2
    //   473: aload 5
    //   475: ifnull +16 -> 491
    //   478: aload 5
    //   480: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   483: ifeq +8 -> 491
    //   486: aload 5
    //   488: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   491: aload_2
    //   492: ifnull +7 -> 499
    //   495: aload_2
    //   496: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   499: ldc -97
    //   501: iconst_0
    //   502: anewarray 4	java/lang/Object
    //   505: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   508: aload_0
    //   509: athrow
    //   510: astore_0
    //   511: aconst_null
    //   512: astore 5
    //   514: goto -41 -> 473
    //   517: astore_0
    //   518: aload 4
    //   520: astore_2
    //   521: goto -48 -> 473
    //   524: astore_0
    //   525: aconst_null
    //   526: astore_1
    //   527: iconst_0
    //   528: istore 6
    //   530: goto -115 -> 415
    //   533: astore_0
    //   534: iconst_0
    //   535: istore 6
    //   537: aload_3
    //   538: astore_1
    //   539: goto -124 -> 415
    //   542: astore_0
    //   543: iload 7
    //   545: istore 6
    //   547: aload_3
    //   548: astore_1
    //   549: goto -134 -> 415
    //   552: astore_0
    //   553: aload_3
    //   554: astore_1
    //   555: goto -140 -> 415
    //   558: iload 8
    //   560: iconst_1
    //   561: iadd
    //   562: istore 8
    //   564: iload 7
    //   566: istore 6
    //   568: goto -503 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	571	0	paramContext	Context
    //   0	571	1	paramArrayOfLong	Long[]
    //   39	482	2	localObject1	Object
    //   44	510	3	localSQLiteDatabase	SQLiteDatabase
    //   49	470	4	localObject2	Object
    //   46	467	5	localObject3	Object
    //   63	504	6	i	int
    //   73	492	7	j	int
    //   60	503	8	k	int
    //   99	23	9	l	long
    // Exception table:
    //   from	to	target	type
    //   35	40	407	java/lang/Throwable
    //   35	40	467	finally
    //   40	45	510	finally
    //   51	59	517	finally
    //   75	82	517	finally
    //   92	101	517	finally
    //   111	133	517	finally
    //   164	188	517	finally
    //   198	215	517	finally
    //   225	230	517	finally
    //   240	264	517	finally
    //   285	292	517	finally
    //   302	316	517	finally
    //   329	334	517	finally
    //   348	372	517	finally
    //   421	432	517	finally
    //   40	45	524	java/lang/Throwable
    //   51	59	533	java/lang/Throwable
    //   75	82	542	java/lang/Throwable
    //   92	101	542	java/lang/Throwable
    //   111	133	542	java/lang/Throwable
    //   164	188	542	java/lang/Throwable
    //   198	215	542	java/lang/Throwable
    //   225	230	542	java/lang/Throwable
    //   240	264	542	java/lang/Throwable
    //   285	292	542	java/lang/Throwable
    //   302	316	542	java/lang/Throwable
    //   348	372	542	java/lang/Throwable
    //   329	334	552	java/lang/Throwable
  }
  
  public static ContentValues a(a parama)
  {
    ContentValues localContentValues = new ContentValues();
    if (parama.a > 0L) {
      localContentValues.put("_id", Long.valueOf(parama.a));
    }
    localContentValues.put("_prority", Integer.valueOf(parama.c));
    localContentValues.put("_time", Long.valueOf(parama.d));
    localContentValues.put("_type", Integer.valueOf(parama.b));
    localContentValues.put("_datas", parama.e);
    localContentValues.put("_length", Long.valueOf(parama.f));
    return localContentValues;
  }
  
  /* Error */
  public static List a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: ldc -57
    //   7: iconst_0
    //   8: anewarray 4	java/lang/Object
    //   11: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   14: aload_0
    //   15: ifnonnull +14 -> 29
    //   18: ldc -55
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aconst_null
    //   28: areturn
    //   29: aload_0
    //   30: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   33: astore_0
    //   34: aload_0
    //   35: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore_1
    //   39: aload_1
    //   40: ldc -53
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: ldc -51
    //   49: ldc -49
    //   51: invokevirtual 211	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_2
    //   55: aload_2
    //   56: invokeinterface 216 1 0
    //   61: ifeq +423 -> 484
    //   64: new 218	java/util/ArrayList
    //   67: dup
    //   68: invokespecial 219	java/util/ArrayList:<init>	()V
    //   71: astore 4
    //   73: aload 4
    //   75: astore_3
    //   76: aload 4
    //   78: aload_2
    //   79: aload_2
    //   80: ldc -91
    //   82: invokeinterface 223 2 0
    //   87: invokeinterface 227 2 0
    //   92: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: invokeinterface 233 2 0
    //   100: pop
    //   101: aload 4
    //   103: astore_3
    //   104: aload 4
    //   106: aload_2
    //   107: aload_2
    //   108: ldc -21
    //   110: invokeinterface 223 2 0
    //   115: invokeinterface 238 2 0
    //   120: invokeinterface 233 2 0
    //   125: pop
    //   126: aload 4
    //   128: astore_3
    //   129: aload 4
    //   131: aload_2
    //   132: aload_2
    //   133: ldc -71
    //   135: invokeinterface 223 2 0
    //   140: invokeinterface 242 2 0
    //   145: invokestatic 169	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   148: invokeinterface 233 2 0
    //   153: pop
    //   154: aload 4
    //   156: astore_3
    //   157: aload 4
    //   159: aload_2
    //   160: aload_2
    //   161: ldc -67
    //   163: invokeinterface 223 2 0
    //   168: invokeinterface 246 2 0
    //   173: invokeinterface 233 2 0
    //   178: pop
    //   179: aload 4
    //   181: astore_3
    //   182: aload 4
    //   184: aload_2
    //   185: aload_2
    //   186: ldc -8
    //   188: invokeinterface 223 2 0
    //   193: invokeinterface 227 2 0
    //   198: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   201: invokeinterface 233 2 0
    //   206: pop
    //   207: aload 4
    //   209: ifnull +15 -> 224
    //   212: aload 4
    //   214: astore_3
    //   215: ldc -6
    //   217: iconst_0
    //   218: anewarray 4	java/lang/Object
    //   221: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: aload_2
    //   225: ifnull +18 -> 243
    //   228: aload_2
    //   229: invokeinterface 253 1 0
    //   234: ifne +9 -> 243
    //   237: aload_2
    //   238: invokeinterface 254 1 0
    //   243: aload_1
    //   244: ifnull +14 -> 258
    //   247: aload_1
    //   248: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   251: ifeq +7 -> 258
    //   254: aload_1
    //   255: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   258: aload_0
    //   259: ifnull +7 -> 266
    //   262: aload_0
    //   263: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   266: ldc_w 256
    //   269: iconst_0
    //   270: anewarray 4	java/lang/Object
    //   273: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: aload 4
    //   278: areturn
    //   279: astore_0
    //   280: aconst_null
    //   281: astore_0
    //   282: aconst_null
    //   283: astore_1
    //   284: aconst_null
    //   285: astore_2
    //   286: aload_3
    //   287: ifnull +18 -> 305
    //   290: aload_3
    //   291: invokeinterface 253 1 0
    //   296: ifne +9 -> 305
    //   299: aload_3
    //   300: invokeinterface 254 1 0
    //   305: aload_1
    //   306: ifnull +14 -> 320
    //   309: aload_1
    //   310: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   313: ifeq +7 -> 320
    //   316: aload_1
    //   317: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   320: aload_2
    //   321: ifnull +7 -> 328
    //   324: aload_2
    //   325: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   328: ldc_w 256
    //   331: iconst_0
    //   332: anewarray 4	java/lang/Object
    //   335: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   338: aload_0
    //   339: areturn
    //   340: astore_1
    //   341: aconst_null
    //   342: astore_2
    //   343: aconst_null
    //   344: astore_0
    //   345: aload 4
    //   347: astore_3
    //   348: aload_2
    //   349: ifnull +18 -> 367
    //   352: aload_2
    //   353: invokeinterface 253 1 0
    //   358: ifne +9 -> 367
    //   361: aload_2
    //   362: invokeinterface 254 1 0
    //   367: aload_3
    //   368: ifnull +14 -> 382
    //   371: aload_3
    //   372: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   375: ifeq +7 -> 382
    //   378: aload_3
    //   379: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   382: aload_0
    //   383: ifnull +7 -> 390
    //   386: aload_0
    //   387: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   390: ldc_w 256
    //   393: iconst_0
    //   394: anewarray 4	java/lang/Object
    //   397: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: aload_1
    //   401: athrow
    //   402: astore_1
    //   403: aconst_null
    //   404: astore_2
    //   405: aload 4
    //   407: astore_3
    //   408: goto -60 -> 348
    //   411: astore 4
    //   413: aconst_null
    //   414: astore_2
    //   415: aload_1
    //   416: astore_3
    //   417: aload 4
    //   419: astore_1
    //   420: goto -72 -> 348
    //   423: astore 4
    //   425: aload_1
    //   426: astore_3
    //   427: aload 4
    //   429: astore_1
    //   430: goto -82 -> 348
    //   433: astore_1
    //   434: aconst_null
    //   435: astore 4
    //   437: aconst_null
    //   438: astore_1
    //   439: aload_0
    //   440: astore_2
    //   441: aload 4
    //   443: astore_0
    //   444: goto -158 -> 286
    //   447: astore_2
    //   448: aload_0
    //   449: astore_2
    //   450: aconst_null
    //   451: astore_0
    //   452: goto -166 -> 286
    //   455: astore_3
    //   456: aconst_null
    //   457: astore 4
    //   459: aload_2
    //   460: astore_3
    //   461: aload_0
    //   462: astore_2
    //   463: aload 4
    //   465: astore_0
    //   466: goto -180 -> 286
    //   469: astore 4
    //   471: aload_2
    //   472: astore 4
    //   474: aload_0
    //   475: astore_2
    //   476: aload_3
    //   477: astore_0
    //   478: aload 4
    //   480: astore_3
    //   481: goto -195 -> 286
    //   484: aconst_null
    //   485: astore 4
    //   487: goto -280 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	490	0	paramContext	Context
    //   38	279	1	localSQLiteDatabase	SQLiteDatabase
    //   340	61	1	localObject1	Object
    //   402	14	1	localObject2	Object
    //   419	11	1	localObject3	Object
    //   433	1	1	localException1	Exception
    //   438	1	1	localObject4	Object
    //   54	387	2	localObject5	Object
    //   447	1	2	localException2	Exception
    //   449	27	2	localContext	Context
    //   4	423	3	localObject6	Object
    //   455	1	3	localException3	Exception
    //   460	21	3	localObject7	Object
    //   1	405	4	localArrayList	ArrayList
    //   411	7	4	localObject8	Object
    //   423	5	4	localObject9	Object
    //   435	29	4	localObject10	Object
    //   469	1	4	localException4	Exception
    //   472	14	4	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   29	34	279	java/lang/Exception
    //   29	34	340	finally
    //   34	39	402	finally
    //   39	55	411	finally
    //   55	73	423	finally
    //   76	101	423	finally
    //   104	126	423	finally
    //   129	154	423	finally
    //   157	179	423	finally
    //   182	207	423	finally
    //   215	224	423	finally
    //   34	39	433	java/lang/Exception
    //   39	55	447	java/lang/Exception
    //   55	73	455	java/lang/Exception
    //   76	101	469	java/lang/Exception
    //   104	126	469	java/lang/Exception
    //   129	154	469	java/lang/Exception
    //   157	179	469	java/lang/Exception
    //   182	207	469	java/lang/Exception
    //   215	224	469	java/lang/Exception
  }
  
  /* Error */
  public static List<a> a(Context paramContext, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc_w 259
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +42 -> 53
    //   14: lload 11
    //   16: lconst_0
    //   17: lcmp
    //   18: ifle +11 -> 29
    //   21: lload 9
    //   23: lload 11
    //   25: lcmp
    //   26: ifgt +27 -> 53
    //   29: iload 6
    //   31: ifle +10 -> 41
    //   34: iload 5
    //   36: iload 6
    //   38: if_icmpgt +15 -> 53
    //   41: iload 8
    //   43: ifle +22 -> 65
    //   46: iload 7
    //   48: iload 8
    //   50: if_icmple +15 -> 65
    //   53: ldc_w 261
    //   56: iconst_0
    //   57: anewarray 4	java/lang/Object
    //   60: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: aconst_null
    //   64: areturn
    //   65: aload_1
    //   66: ifnull +866 -> 932
    //   69: aload_1
    //   70: arraylength
    //   71: ifle +861 -> 932
    //   74: ldc 71
    //   76: astore 13
    //   78: iconst_0
    //   79: istore 5
    //   81: iload 5
    //   83: aload_1
    //   84: arraylength
    //   85: if_icmpge +41 -> 126
    //   88: new 49	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   95: aload 13
    //   97: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: ldc 74
    //   102: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_1
    //   106: iload 5
    //   108: iaload
    //   109: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   112: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 13
    //   117: iload 5
    //   119: iconst_1
    //   120: iadd
    //   121: istore 5
    //   123: goto -42 -> 81
    //   126: new 49	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   133: ldc 71
    //   135: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload 13
    //   140: iconst_4
    //   141: invokevirtual 83	java/lang/String:substring	(I)Ljava/lang/String;
    //   144: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: astore_1
    //   151: aload_1
    //   152: invokevirtual 262	java/lang/String:length	()I
    //   155: ifle +429 -> 584
    //   158: new 49	java/lang/StringBuilder
    //   161: dup
    //   162: ldc_w 264
    //   165: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   168: aload_1
    //   169: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: ldc_w 266
    //   175: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: astore 13
    //   183: aload 13
    //   185: astore_1
    //   186: lload 9
    //   188: lconst_0
    //   189: lcmp
    //   190: iflt +55 -> 245
    //   193: new 49	java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   200: aload 13
    //   202: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: astore 14
    //   207: aload 13
    //   209: invokevirtual 262	java/lang/String:length	()I
    //   212: ifle +379 -> 591
    //   215: ldc_w 268
    //   218: astore_1
    //   219: aload 14
    //   221: aload_1
    //   222: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: ldc 51
    //   227: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: lload 9
    //   232: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   235: ldc_w 270
    //   238: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: astore_1
    //   245: aload_1
    //   246: astore 13
    //   248: lload 11
    //   250: lconst_0
    //   251: lcmp
    //   252: iflt +55 -> 307
    //   255: new 49	java/lang/StringBuilder
    //   258: dup
    //   259: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   262: aload_1
    //   263: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: astore 13
    //   268: aload_1
    //   269: invokevirtual 262	java/lang/String:length	()I
    //   272: ifle +325 -> 597
    //   275: ldc_w 268
    //   278: astore_1
    //   279: aload 13
    //   281: aload_1
    //   282: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: ldc_w 272
    //   288: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: lload 11
    //   293: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   296: ldc_w 270
    //   299: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: astore 13
    //   307: ldc 71
    //   309: astore_1
    //   310: iload_2
    //   311: tableswitch	default:+21->332, 1:+292->603, 2:+317->628
    //   332: iload_3
    //   333: tableswitch	default:+23->356, 1:+320->653, 2:+344->677
    //   356: aload_1
    //   357: ldc_w 274
    //   360: invokevirtual 278	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   363: ifeq +563 -> 926
    //   366: aload_1
    //   367: iconst_0
    //   368: aload_1
    //   369: invokevirtual 262	java/lang/String:length	()I
    //   372: iconst_3
    //   373: isub
    //   374: invokevirtual 281	java/lang/String:substring	(II)Ljava/lang/String;
    //   377: astore 14
    //   379: ldc_w 283
    //   382: iconst_1
    //   383: anewarray 4	java/lang/Object
    //   386: dup
    //   387: iconst_0
    //   388: aload 13
    //   390: aastore
    //   391: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   394: aload_0
    //   395: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   398: astore_0
    //   399: aload_0
    //   400: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   403: astore_1
    //   404: iload 4
    //   406: iflt +294 -> 700
    //   409: new 49	java/lang/StringBuilder
    //   412: dup
    //   413: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   416: iload 4
    //   418: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   421: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   424: astore 15
    //   426: aload_1
    //   427: ldc 100
    //   429: aconst_null
    //   430: aload 13
    //   432: aconst_null
    //   433: aconst_null
    //   434: aconst_null
    //   435: aload 14
    //   437: aload 15
    //   439: invokevirtual 211	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   442: astore 15
    //   444: new 49	java/lang/StringBuilder
    //   447: dup
    //   448: ldc_w 285
    //   451: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   454: aload 15
    //   456: invokeinterface 288 1 0
    //   461: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   464: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: iconst_0
    //   468: anewarray 4	java/lang/Object
    //   471: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   474: aload 15
    //   476: invokeinterface 288 1 0
    //   481: ifle +439 -> 920
    //   484: aload 15
    //   486: invokestatic 291	com/tencent/beacon/a/a/a:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   489: astore 13
    //   491: aload 13
    //   493: ifnull +33 -> 526
    //   496: new 49	java/lang/StringBuilder
    //   499: dup
    //   500: ldc_w 293
    //   503: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   506: aload 13
    //   508: invokeinterface 296 1 0
    //   513: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   516: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   519: iconst_0
    //   520: anewarray 4	java/lang/Object
    //   523: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   526: aload 15
    //   528: ifnull +20 -> 548
    //   531: aload 15
    //   533: invokeinterface 253 1 0
    //   538: ifne +10 -> 548
    //   541: aload 15
    //   543: invokeinterface 254 1 0
    //   548: aload_1
    //   549: ifnull +14 -> 563
    //   552: aload_1
    //   553: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   556: ifeq +7 -> 563
    //   559: aload_1
    //   560: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   563: aload_0
    //   564: ifnull +7 -> 571
    //   567: aload_0
    //   568: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   571: ldc_w 298
    //   574: iconst_0
    //   575: anewarray 4	java/lang/Object
    //   578: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   581: aload 13
    //   583: areturn
    //   584: ldc 71
    //   586: astore 13
    //   588: goto -405 -> 183
    //   591: ldc 71
    //   593: astore_1
    //   594: goto -375 -> 219
    //   597: ldc 71
    //   599: astore_1
    //   600: goto -321 -> 279
    //   603: new 49	java/lang/StringBuilder
    //   606: dup
    //   607: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   610: ldc 71
    //   612: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: ldc_w 300
    //   618: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   624: astore_1
    //   625: goto -293 -> 332
    //   628: new 49	java/lang/StringBuilder
    //   631: dup
    //   632: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   635: ldc 71
    //   637: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   640: ldc_w 302
    //   643: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   649: astore_1
    //   650: goto -318 -> 332
    //   653: new 49	java/lang/StringBuilder
    //   656: dup
    //   657: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   660: aload_1
    //   661: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: ldc_w 304
    //   667: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   673: astore_1
    //   674: goto -318 -> 356
    //   677: new 49	java/lang/StringBuilder
    //   680: dup
    //   681: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   684: aload_1
    //   685: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: ldc -51
    //   690: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   693: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   696: astore_1
    //   697: goto -341 -> 356
    //   700: aconst_null
    //   701: astore 15
    //   703: goto -277 -> 426
    //   706: astore 14
    //   708: aconst_null
    //   709: astore 15
    //   711: aconst_null
    //   712: astore_1
    //   713: aconst_null
    //   714: astore_0
    //   715: aconst_null
    //   716: astore 13
    //   718: aload 14
    //   720: invokevirtual 121	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   723: iconst_0
    //   724: anewarray 4	java/lang/Object
    //   727: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   730: aload 15
    //   732: ifnull +20 -> 752
    //   735: aload 15
    //   737: invokeinterface 253 1 0
    //   742: ifne +10 -> 752
    //   745: aload 15
    //   747: invokeinterface 254 1 0
    //   752: aload_1
    //   753: ifnull +14 -> 767
    //   756: aload_1
    //   757: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   760: ifeq +7 -> 767
    //   763: aload_1
    //   764: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   767: aload_0
    //   768: ifnull +7 -> 775
    //   771: aload_0
    //   772: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   775: ldc_w 298
    //   778: iconst_0
    //   779: anewarray 4	java/lang/Object
    //   782: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   785: aload 13
    //   787: areturn
    //   788: astore 13
    //   790: aconst_null
    //   791: astore_0
    //   792: aconst_null
    //   793: astore 15
    //   795: aconst_null
    //   796: astore_1
    //   797: aload 15
    //   799: ifnull +20 -> 819
    //   802: aload 15
    //   804: invokeinterface 253 1 0
    //   809: ifne +10 -> 819
    //   812: aload 15
    //   814: invokeinterface 254 1 0
    //   819: aload_1
    //   820: ifnull +14 -> 834
    //   823: aload_1
    //   824: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   827: ifeq +7 -> 834
    //   830: aload_1
    //   831: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   834: aload_0
    //   835: ifnull +7 -> 842
    //   838: aload_0
    //   839: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   842: ldc_w 298
    //   845: iconst_0
    //   846: anewarray 4	java/lang/Object
    //   849: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   852: aload 13
    //   854: athrow
    //   855: astore 13
    //   857: aconst_null
    //   858: astore 15
    //   860: aconst_null
    //   861: astore_1
    //   862: goto -65 -> 797
    //   865: astore 13
    //   867: aconst_null
    //   868: astore 15
    //   870: goto -73 -> 797
    //   873: astore 13
    //   875: goto -78 -> 797
    //   878: astore 13
    //   880: goto -83 -> 797
    //   883: astore 14
    //   885: aconst_null
    //   886: astore 15
    //   888: aconst_null
    //   889: astore_1
    //   890: aconst_null
    //   891: astore 13
    //   893: goto -175 -> 718
    //   896: astore 14
    //   898: aconst_null
    //   899: astore 15
    //   901: aconst_null
    //   902: astore 13
    //   904: goto -186 -> 718
    //   907: astore 14
    //   909: aconst_null
    //   910: astore 13
    //   912: goto -194 -> 718
    //   915: astore 14
    //   917: goto -199 -> 718
    //   920: aconst_null
    //   921: astore 13
    //   923: goto -432 -> 491
    //   926: aload_1
    //   927: astore 14
    //   929: goto -550 -> 379
    //   932: ldc 71
    //   934: astore_1
    //   935: goto -784 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	938	0	paramContext	Context
    //   0	938	1	paramArrayOfInt	int[]
    //   0	938	2	paramInt1	int
    //   0	938	3	paramInt2	int
    //   0	938	4	paramInt3	int
    //   0	938	5	paramInt4	int
    //   0	938	6	paramInt5	int
    //   0	938	7	paramInt6	int
    //   0	938	8	paramInt7	int
    //   0	938	9	paramLong1	long
    //   0	938	11	paramLong2	long
    //   76	710	13	localObject1	Object
    //   788	65	13	localObject2	Object
    //   855	1	13	localObject3	Object
    //   865	1	13	localObject4	Object
    //   873	1	13	localObject5	Object
    //   878	1	13	localObject6	Object
    //   891	31	13	localObject7	Object
    //   205	231	14	localObject8	Object
    //   706	13	14	localThrowable1	Throwable
    //   883	1	14	localThrowable2	Throwable
    //   896	1	14	localThrowable3	Throwable
    //   907	1	14	localThrowable4	Throwable
    //   915	1	14	localThrowable5	Throwable
    //   927	1	14	arrayOfInt	int[]
    //   424	476	15	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   394	399	706	java/lang/Throwable
    //   394	399	788	finally
    //   399	404	855	finally
    //   409	426	865	finally
    //   426	444	865	finally
    //   444	491	873	finally
    //   496	526	873	finally
    //   718	730	878	finally
    //   399	404	883	java/lang/Throwable
    //   409	426	896	java/lang/Throwable
    //   426	444	896	java/lang/Throwable
    //   444	491	907	java/lang/Throwable
    //   496	526	915	java/lang/Throwable
  }
  
  protected static List<a> a(Cursor paramCursor)
  {
    b.b(" in AnalyticsDAO.paserCursor() start", new Object[0]);
    if (paramCursor == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramCursor.getColumnIndex("_id");
    int j = paramCursor.getColumnIndex("_prority");
    int k = paramCursor.getColumnIndex("_time");
    int m = paramCursor.getColumnIndex("_type");
    int n = paramCursor.getColumnIndex("_datas");
    int i1 = paramCursor.getColumnIndex("_length");
    while (paramCursor.moveToNext())
    {
      a locala = new a();
      locala.a = paramCursor.getLong(i);
      locala.e = paramCursor.getBlob(n);
      locala.c = paramCursor.getInt(j);
      locala.d = paramCursor.getLong(k);
      locala.b = paramCursor.getInt(m);
      locala.f = paramCursor.getLong(i1);
      localArrayList.add(locala);
    }
    b.b(" in AnalyticsDAO.paserCursor() end", new Object[0]);
    return localArrayList;
  }
  
  /* Error */
  public static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 8
    //   3: aconst_null
    //   4: astore_2
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 4
    //   11: aconst_null
    //   12: astore_3
    //   13: ldc_w 315
    //   16: iconst_0
    //   17: anewarray 4	java/lang/Object
    //   20: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: aload_0
    //   24: ifnonnull +14 -> 38
    //   27: ldc 45
    //   29: iconst_0
    //   30: anewarray 4	java/lang/Object
    //   33: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   36: iconst_0
    //   37: ireturn
    //   38: aload_1
    //   39: ifnull -3 -> 36
    //   42: aload_1
    //   43: invokevirtual 318	java/lang/String:trim	()Ljava/lang/String;
    //   46: ldc 71
    //   48: invokevirtual 321	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   51: ifne -15 -> 36
    //   54: new 49	java/lang/StringBuilder
    //   57: dup
    //   58: ldc_w 323
    //   61: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_1
    //   65: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc_w 325
    //   71: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore 6
    //   79: new 49	java/lang/StringBuilder
    //   82: dup
    //   83: ldc 89
    //   85: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload 6
    //   90: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: iconst_0
    //   97: anewarray 4	java/lang/Object
    //   100: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_0
    //   104: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   107: astore_0
    //   108: aload_0
    //   109: astore_2
    //   110: aload 5
    //   112: astore_0
    //   113: aload_2
    //   114: astore_1
    //   115: aload 4
    //   117: astore_3
    //   118: aload_2
    //   119: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   122: astore 4
    //   124: aload 4
    //   126: astore_0
    //   127: aload_2
    //   128: astore_1
    //   129: aload 4
    //   131: astore_3
    //   132: aload 4
    //   134: ldc -53
    //   136: aload 6
    //   138: aconst_null
    //   139: invokevirtual 106	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   142: istore 7
    //   144: aload 4
    //   146: astore_0
    //   147: aload_2
    //   148: astore_1
    //   149: aload 4
    //   151: astore_3
    //   152: new 49	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 108
    //   158: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: iload 7
    //   163: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: iconst_0
    //   170: anewarray 4	java/lang/Object
    //   173: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: iload 7
    //   178: iconst_1
    //   179: if_icmpne +152 -> 331
    //   182: aload 4
    //   184: ifnull +16 -> 200
    //   187: aload 4
    //   189: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   192: ifeq +8 -> 200
    //   195: aload 4
    //   197: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   200: aload_2
    //   201: ifnull +7 -> 208
    //   204: aload_2
    //   205: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   208: ldc_w 327
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: iload 8
    //   220: ireturn
    //   221: astore 4
    //   223: aconst_null
    //   224: astore_2
    //   225: aload_3
    //   226: astore_0
    //   227: aload_2
    //   228: astore_1
    //   229: aload 4
    //   231: invokevirtual 121	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   234: iconst_0
    //   235: anewarray 4	java/lang/Object
    //   238: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: aload_3
    //   242: ifnull +14 -> 256
    //   245: aload_3
    //   246: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   249: ifeq +7 -> 256
    //   252: aload_3
    //   253: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   256: aload_2
    //   257: ifnull +7 -> 264
    //   260: aload_2
    //   261: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   264: ldc_w 327
    //   267: iconst_0
    //   268: anewarray 4	java/lang/Object
    //   271: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: iconst_0
    //   275: istore 8
    //   277: goto -59 -> 218
    //   280: astore_3
    //   281: aconst_null
    //   282: astore_1
    //   283: aload_2
    //   284: astore_0
    //   285: aload_3
    //   286: astore_2
    //   287: aload_0
    //   288: ifnull +14 -> 302
    //   291: aload_0
    //   292: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   295: ifeq +7 -> 302
    //   298: aload_0
    //   299: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   302: aload_1
    //   303: ifnull +7 -> 310
    //   306: aload_1
    //   307: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   310: ldc_w 327
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   320: aload_2
    //   321: athrow
    //   322: astore_2
    //   323: goto -36 -> 287
    //   326: astore 4
    //   328: goto -103 -> 225
    //   331: iconst_0
    //   332: istore 8
    //   334: goto -152 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	paramContext	Context
    //   0	337	1	paramString	String
    //   4	317	2	localObject1	Object
    //   322	1	2	localObject2	Object
    //   12	241	3	localSQLiteDatabase1	SQLiteDatabase
    //   280	6	3	localObject3	Object
    //   9	187	4	localSQLiteDatabase2	SQLiteDatabase
    //   221	9	4	localThrowable1	Throwable
    //   326	1	4	localThrowable2	Throwable
    //   6	105	5	localObject4	Object
    //   77	60	6	str	String
    //   142	38	7	i	int
    //   1	332	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   103	108	221	java/lang/Throwable
    //   103	108	280	finally
    //   118	124	322	finally
    //   132	144	322	finally
    //   152	176	322	finally
    //   229	241	322	finally
    //   118	124	326	java/lang/Throwable
    //   132	144	326	java/lang/Throwable
    //   152	176	326	java/lang/Throwable
  }
  
  /* Error */
  public static boolean a(Context paramContext, List<a> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 330
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: ifnull +7 -> 20
    //   16: aload_1
    //   17: ifnonnull +15 -> 32
    //   20: ldc_w 332
    //   23: iconst_0
    //   24: anewarray 4	java/lang/Object
    //   27: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: iconst_0
    //   31: ireturn
    //   32: aload_1
    //   33: invokeinterface 296 1 0
    //   38: ifgt +15 -> 53
    //   41: ldc_w 334
    //   44: iconst_0
    //   45: anewarray 4	java/lang/Object
    //   48: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: iconst_1
    //   52: ireturn
    //   53: aload_0
    //   54: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   57: astore_0
    //   58: aload_0
    //   59: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   62: astore_3
    //   63: aload_3
    //   64: astore_2
    //   65: aload_2
    //   66: invokevirtual 337	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   69: iconst_0
    //   70: istore 4
    //   72: iload 4
    //   74: aload_1
    //   75: invokeinterface 296 1 0
    //   80: if_icmpge +61 -> 141
    //   83: aload_1
    //   84: iload 4
    //   86: invokeinterface 341 2 0
    //   91: checkcast 2	com/tencent/beacon/a/a/a
    //   94: astore_3
    //   95: aload_2
    //   96: ldc 100
    //   98: ldc -91
    //   100: aload_3
    //   101: invokestatic 343	com/tencent/beacon/a/a/a:a	(Lcom/tencent/beacon/a/a/a;)Landroid/content/ContentValues;
    //   104: invokevirtual 347	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   107: lstore 5
    //   109: lload 5
    //   111: lconst_0
    //   112: lcmp
    //   113: ifge +13 -> 126
    //   116: ldc_w 349
    //   119: iconst_0
    //   120: anewarray 4	java/lang/Object
    //   123: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: aload_3
    //   127: lload 5
    //   129: putfield 21	com/tencent/beacon/a/a/a:a	J
    //   132: iload 4
    //   134: iconst_1
    //   135: iadd
    //   136: istore 4
    //   138: goto -66 -> 72
    //   141: aload_2
    //   142: invokevirtual 352	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   145: aload_2
    //   146: ifnull +18 -> 164
    //   149: aload_2
    //   150: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   153: ifeq +11 -> 164
    //   156: aload_2
    //   157: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   160: aload_2
    //   161: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   164: aload_0
    //   165: ifnull +7 -> 172
    //   168: aload_0
    //   169: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   172: ldc_w 357
    //   175: iconst_0
    //   176: anewarray 4	java/lang/Object
    //   179: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: iconst_1
    //   183: istore 7
    //   185: iload 7
    //   187: ireturn
    //   188: astore_0
    //   189: aconst_null
    //   190: astore_0
    //   191: aload_2
    //   192: astore_1
    //   193: ldc_w 359
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload_1
    //   204: ifnull +18 -> 222
    //   207: aload_1
    //   208: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   211: ifeq +11 -> 222
    //   214: aload_1
    //   215: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   218: aload_1
    //   219: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   222: aload_0
    //   223: ifnull +7 -> 230
    //   226: aload_0
    //   227: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   230: ldc_w 357
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: iconst_0
    //   241: istore 7
    //   243: goto -58 -> 185
    //   246: astore_1
    //   247: aconst_null
    //   248: astore_2
    //   249: aconst_null
    //   250: astore_0
    //   251: aload_2
    //   252: ifnull +18 -> 270
    //   255: aload_2
    //   256: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   259: ifeq +11 -> 270
    //   262: aload_2
    //   263: invokevirtual 355	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   266: aload_2
    //   267: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   270: aload_0
    //   271: ifnull +7 -> 278
    //   274: aload_0
    //   275: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   278: ldc_w 357
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: aload_1
    //   289: athrow
    //   290: astore_1
    //   291: aconst_null
    //   292: astore_2
    //   293: goto -42 -> 251
    //   296: astore_1
    //   297: goto -46 -> 251
    //   300: astore_2
    //   301: aload_1
    //   302: astore_3
    //   303: aload_2
    //   304: astore_1
    //   305: aload_3
    //   306: astore_2
    //   307: goto -56 -> 251
    //   310: astore_1
    //   311: aload_2
    //   312: astore_1
    //   313: goto -120 -> 193
    //   316: astore_1
    //   317: aload_2
    //   318: astore_1
    //   319: goto -126 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	322	0	paramContext	Context
    //   0	322	1	paramList	List<a>
    //   1	292	2	localObject1	Object
    //   300	4	2	localObject2	Object
    //   306	12	2	localObject3	Object
    //   62	244	3	localObject4	Object
    //   70	67	4	i	int
    //   107	21	5	l	long
    //   183	59	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   53	58	188	java/lang/Throwable
    //   53	58	246	finally
    //   58	63	290	finally
    //   65	69	296	finally
    //   72	109	296	finally
    //   116	126	296	finally
    //   126	132	296	finally
    //   141	145	296	finally
    //   193	203	300	finally
    //   58	63	310	java/lang/Throwable
    //   65	69	316	java/lang/Throwable
    //   72	109	316	java/lang/Throwable
    //   116	126	316	java/lang/Throwable
    //   126	132	316	java/lang/Throwable
    //   141	145	316	java/lang/Throwable
  }
  
  /* Error */
  public static boolean a(Context paramContext, byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 363
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: aload_0
    //   14: ifnull +11 -> 25
    //   17: aload_1
    //   18: ifnull +7 -> 25
    //   21: aload_2
    //   22: ifnonnull +15 -> 37
    //   25: ldc_w 365
    //   28: iconst_0
    //   29: anewarray 4	java/lang/Object
    //   32: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   41: astore_0
    //   42: aload_0
    //   43: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   46: astore 5
    //   48: aload 5
    //   50: astore 4
    //   52: new 162	android/content/ContentValues
    //   55: dup
    //   56: invokespecial 163	android/content/ContentValues:<init>	()V
    //   59: astore 5
    //   61: aload 5
    //   63: ldc -21
    //   65: aload_2
    //   66: invokevirtual 368	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: aload 5
    //   71: ldc -71
    //   73: new 370	java/util/Date
    //   76: dup
    //   77: invokespecial 371	java/util/Date:<init>	()V
    //   80: invokevirtual 374	java/util/Date:getTime	()J
    //   83: invokestatic 169	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   86: invokevirtual 173	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   89: aload 5
    //   91: ldc -8
    //   93: iload_3
    //   94: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: invokevirtual 183	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   100: aload 5
    //   102: ldc -67
    //   104: aload_1
    //   105: invokevirtual 192	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   108: aload 4
    //   110: ldc -53
    //   112: aconst_null
    //   113: aload 5
    //   115: invokevirtual 347	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   118: lconst_0
    //   119: lcmp
    //   120: ifge +55 -> 175
    //   123: ldc_w 376
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 128	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: iconst_0
    //   134: istore 6
    //   136: aload 4
    //   138: ifnull +16 -> 154
    //   141: aload 4
    //   143: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   146: ifeq +8 -> 154
    //   149: aload 4
    //   151: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   154: aload_0
    //   155: ifnull +7 -> 162
    //   158: aload_0
    //   159: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   162: ldc_w 378
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: iload 6
    //   174: ireturn
    //   175: iconst_1
    //   176: istore 6
    //   178: goto -42 -> 136
    //   181: astore_0
    //   182: aconst_null
    //   183: astore_0
    //   184: aload 4
    //   186: astore_1
    //   187: ldc_w 380
    //   190: iconst_0
    //   191: anewarray 4	java/lang/Object
    //   194: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: aload_1
    //   198: ifnull +14 -> 212
    //   201: aload_1
    //   202: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   205: ifeq +7 -> 212
    //   208: aload_1
    //   209: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   212: aload_0
    //   213: ifnull +7 -> 220
    //   216: aload_0
    //   217: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   220: ldc_w 378
    //   223: iconst_0
    //   224: anewarray 4	java/lang/Object
    //   227: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: iconst_0
    //   231: ireturn
    //   232: astore_1
    //   233: aconst_null
    //   234: astore_0
    //   235: aconst_null
    //   236: astore_2
    //   237: aload_2
    //   238: ifnull +14 -> 252
    //   241: aload_2
    //   242: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   245: ifeq +7 -> 252
    //   248: aload_2
    //   249: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   252: aload_0
    //   253: ifnull +7 -> 260
    //   256: aload_0
    //   257: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   260: ldc_w 378
    //   263: iconst_0
    //   264: anewarray 4	java/lang/Object
    //   267: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: aload_1
    //   271: athrow
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_2
    //   275: goto -38 -> 237
    //   278: astore_1
    //   279: aload 4
    //   281: astore_2
    //   282: goto -45 -> 237
    //   285: astore 4
    //   287: aload_1
    //   288: astore_2
    //   289: aload 4
    //   291: astore_1
    //   292: goto -55 -> 237
    //   295: astore_1
    //   296: aload 4
    //   298: astore_1
    //   299: goto -112 -> 187
    //   302: astore_1
    //   303: aload 4
    //   305: astore_1
    //   306: goto -119 -> 187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramContext	Context
    //   0	309	1	paramArrayOfByte	byte[]
    //   0	309	2	paramString	String
    //   0	309	3	paramInt	int
    //   1	279	4	localObject1	Object
    //   285	19	4	localObject2	Object
    //   46	68	5	localObject3	Object
    //   134	43	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   37	42	181	java/lang/Throwable
    //   37	42	232	finally
    //   42	48	272	finally
    //   52	133	278	finally
    //   187	197	285	finally
    //   42	48	295	java/lang/Throwable
    //   52	133	302	java/lang/Throwable
  }
  
  /* Error */
  public static int b(Context paramContext, int[] paramArrayOfInt, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc_w 382
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnonnull +15 -> 26
    //   14: ldc_w 384
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 47	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: iconst_m1
    //   25: ireturn
    //   26: ldc2_w 18
    //   29: ldc2_w 385
    //   32: lcmp
    //   33: ifle +5 -> 38
    //   36: iconst_0
    //   37: ireturn
    //   38: new 49	java/lang/StringBuilder
    //   41: dup
    //   42: ldc 51
    //   44: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: ldc2_w 18
    //   50: invokevirtual 58	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   53: ldc 60
    //   55: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: ldc_w 388
    //   61: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 7
    //   69: aload 7
    //   71: astore 6
    //   73: aload_1
    //   74: ifnull +102 -> 176
    //   77: aload 7
    //   79: astore 6
    //   81: aload_1
    //   82: arraylength
    //   83: ifle +93 -> 176
    //   86: ldc 71
    //   88: astore 6
    //   90: iconst_0
    //   91: istore 10
    //   93: iload 10
    //   95: aload_1
    //   96: arraylength
    //   97: if_icmpge +41 -> 138
    //   100: new 49	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   107: aload 6
    //   109: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: ldc 74
    //   114: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload_1
    //   118: iload 10
    //   120: iaload
    //   121: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   124: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: astore 6
    //   129: iload 10
    //   131: iconst_1
    //   132: iadd
    //   133: istore 10
    //   135: goto -42 -> 93
    //   138: aload 6
    //   140: iconst_4
    //   141: invokevirtual 83	java/lang/String:substring	(I)Ljava/lang/String;
    //   144: astore_1
    //   145: new 49	java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   152: aload 7
    //   154: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc 85
    //   159: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_1
    //   163: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc 87
    //   168: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: astore 6
    //   176: new 49	java/lang/StringBuilder
    //   179: dup
    //   180: ldc_w 390
    //   183: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload 6
    //   188: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: iconst_0
    //   195: anewarray 4	java/lang/Object
    //   198: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aconst_null
    //   202: astore 9
    //   204: aconst_null
    //   205: astore 7
    //   207: aconst_null
    //   208: astore 8
    //   210: aload_0
    //   211: invokestatic 94	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   214: astore_0
    //   215: aload_0
    //   216: invokevirtual 98	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   219: astore_1
    //   220: aload_1
    //   221: ldc 100
    //   223: iconst_1
    //   224: anewarray 79	java/lang/String
    //   227: dup
    //   228: iconst_0
    //   229: ldc_w 392
    //   232: aastore
    //   233: aload 6
    //   235: aconst_null
    //   236: aconst_null
    //   237: aconst_null
    //   238: aconst_null
    //   239: invokevirtual 395	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   242: astore 6
    //   244: aload 6
    //   246: invokeinterface 216 1 0
    //   251: pop
    //   252: aload 6
    //   254: aload 6
    //   256: ldc_w 397
    //   259: invokeinterface 223 2 0
    //   264: invokeinterface 227 2 0
    //   269: istore 10
    //   271: new 49	java/lang/StringBuilder
    //   274: dup
    //   275: ldc_w 399
    //   278: invokespecial 54	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   281: iload 10
    //   283: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: iconst_0
    //   290: anewarray 4	java/lang/Object
    //   293: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   296: aload 6
    //   298: ifnull +20 -> 318
    //   301: aload 6
    //   303: invokeinterface 253 1 0
    //   308: ifne +10 -> 318
    //   311: aload 6
    //   313: invokeinterface 254 1 0
    //   318: aload_1
    //   319: ifnull +14 -> 333
    //   322: aload_1
    //   323: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   326: ifeq +7 -> 333
    //   329: aload_1
    //   330: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   333: aload_0
    //   334: ifnull +7 -> 341
    //   337: aload_0
    //   338: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   341: ldc_w 401
    //   344: iconst_0
    //   345: anewarray 4	java/lang/Object
    //   348: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   351: iload 10
    //   353: ireturn
    //   354: astore 7
    //   356: aconst_null
    //   357: astore_1
    //   358: aload 9
    //   360: astore_0
    //   361: aload 8
    //   363: astore 6
    //   365: aload 7
    //   367: invokevirtual 121	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   370: iconst_0
    //   371: anewarray 4	java/lang/Object
    //   374: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: aload_1
    //   378: ifnull +18 -> 396
    //   381: aload_1
    //   382: invokeinterface 253 1 0
    //   387: ifne +9 -> 396
    //   390: aload_1
    //   391: invokeinterface 254 1 0
    //   396: aload 6
    //   398: ifnull +16 -> 414
    //   401: aload 6
    //   403: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   406: ifeq +8 -> 414
    //   409: aload 6
    //   411: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   414: aload_0
    //   415: ifnull +7 -> 422
    //   418: aload_0
    //   419: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   422: ldc_w 401
    //   425: iconst_0
    //   426: anewarray 4	java/lang/Object
    //   429: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: iconst_m1
    //   433: ireturn
    //   434: astore_1
    //   435: aconst_null
    //   436: astore_0
    //   437: aconst_null
    //   438: astore 6
    //   440: aload 6
    //   442: ifnull +20 -> 462
    //   445: aload 6
    //   447: invokeinterface 253 1 0
    //   452: ifne +10 -> 462
    //   455: aload 6
    //   457: invokeinterface 254 1 0
    //   462: aload 7
    //   464: ifnull +16 -> 480
    //   467: aload 7
    //   469: invokevirtual 112	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   472: ifeq +8 -> 480
    //   475: aload 7
    //   477: invokevirtual 115	android/database/sqlite/SQLiteDatabase:close	()V
    //   480: aload_0
    //   481: ifnull +7 -> 488
    //   484: aload_0
    //   485: invokevirtual 116	com/tencent/beacon/a/a/d:close	()V
    //   488: ldc_w 401
    //   491: iconst_0
    //   492: anewarray 4	java/lang/Object
    //   495: invokestatic 43	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   498: aload_1
    //   499: athrow
    //   500: astore_1
    //   501: aconst_null
    //   502: astore 6
    //   504: goto -64 -> 440
    //   507: astore 6
    //   509: aconst_null
    //   510: astore 8
    //   512: aload_1
    //   513: astore 7
    //   515: aload 6
    //   517: astore_1
    //   518: aload 8
    //   520: astore 6
    //   522: goto -82 -> 440
    //   525: astore 8
    //   527: aload_1
    //   528: astore 7
    //   530: aload 8
    //   532: astore_1
    //   533: goto -93 -> 440
    //   536: astore 7
    //   538: aload_1
    //   539: astore 8
    //   541: aload 7
    //   543: astore_1
    //   544: aload 6
    //   546: astore 7
    //   548: aload 8
    //   550: astore 6
    //   552: goto -112 -> 440
    //   555: astore 7
    //   557: aconst_null
    //   558: astore_1
    //   559: aload 8
    //   561: astore 6
    //   563: goto -198 -> 365
    //   566: astore 7
    //   568: aconst_null
    //   569: astore 8
    //   571: aload_1
    //   572: astore 6
    //   574: aload 8
    //   576: astore_1
    //   577: goto -212 -> 365
    //   580: astore 7
    //   582: aload 6
    //   584: astore 8
    //   586: aload_1
    //   587: astore 6
    //   589: aload 8
    //   591: astore_1
    //   592: goto -227 -> 365
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	595	0	paramContext	Context
    //   0	595	1	paramArrayOfInt	int[]
    //   0	595	2	paramLong1	long
    //   0	595	4	paramLong2	long
    //   71	432	6	localObject1	Object
    //   507	9	6	localObject2	Object
    //   520	68	6	localObject3	Object
    //   67	139	7	str	String
    //   354	122	7	localThrowable1	Throwable
    //   513	16	7	arrayOfInt	int[]
    //   536	6	7	localObject4	Object
    //   546	1	7	localObject5	Object
    //   555	1	7	localThrowable2	Throwable
    //   566	1	7	localThrowable3	Throwable
    //   580	1	7	localThrowable4	Throwable
    //   208	311	8	localObject6	Object
    //   525	6	8	localObject7	Object
    //   539	51	8	localObject8	Object
    //   202	157	9	localObject9	Object
    //   91	261	10	i	int
    // Exception table:
    //   from	to	target	type
    //   210	215	354	java/lang/Throwable
    //   210	215	434	finally
    //   215	220	500	finally
    //   220	244	507	finally
    //   244	296	525	finally
    //   365	377	536	finally
    //   215	220	555	java/lang/Throwable
    //   220	244	566	java/lang/Throwable
    //   244	296	580	java/lang/Throwable
  }
  
  public static boolean b(Context paramContext, List<a> paramList)
  {
    b.b(" insertOrUpdate alyticsBeans start!", new Object[0]);
    if ((paramContext == null) || (paramList == null) || (paramList.size() <= 0))
    {
      b.d(" context == null || list == null|| list.size() <= 0 ? pls check!", new Object[0]);
      return false;
    }
    localObject = null;
    localContext = null;
    boolean bool3 = true;
    bool1 = true;
    bool2 = bool3;
    for (;;)
    {
      try
      {
        paramContext = d.a(paramContext).getWritableDatabase();
        bool2 = bool3;
        localContext = paramContext;
        localObject = paramContext;
        paramList = paramList.iterator();
      }
      catch (Throwable paramContext)
      {
        a locala;
        ContentValues localContentValues;
        long l;
        localObject = localContext;
        paramContext.printStackTrace();
        if ((localContext == null) || (!localContext.isOpen())) {
          continue;
        }
        localContext.close();
        b.b(" insertOrUpdate alyticsBeans end", new Object[0]);
        return bool2;
        bool1 = false;
        continue;
        if ((paramContext == null) || (!paramContext.isOpen())) {
          continue;
        }
        paramContext.close();
        b.b(" insertOrUpdate alyticsBeans end", new Object[0]);
        return bool1;
      }
      finally
      {
        if ((localObject == null) || (!((SQLiteDatabase)localObject).isOpen())) {
          continue;
        }
        ((SQLiteDatabase)localObject).close();
        b.b(" insertOrUpdate alyticsBeans end", new Object[0]);
      }
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      if (!paramList.hasNext()) {
        continue;
      }
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      locala = (a)paramList.next();
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      localContentValues = a(locala);
      if (localContentValues == null) {
        continue;
      }
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      l = paramContext.replace("t_event", "_id", localContentValues);
      if (l <= 0L) {
        continue;
      }
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      b.b(" result id:" + l, new Object[0]);
      bool2 = bool1;
      localContext = paramContext;
      localObject = paramContext;
      locala.a = l;
    }
  }
  
  public final long a()
  {
    return this.a;
  }
  
  public final a a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }
  
  public final byte[] b()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */