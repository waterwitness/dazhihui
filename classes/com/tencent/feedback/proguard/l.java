package com.tencent.feedback.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.feedback.common.e;
import java.util.ArrayList;
import java.util.List;

public class l
{
  private long a = -1L;
  private int b = -1;
  private int c = -1;
  private long d = -1L;
  private byte[] e = null;
  private long f = 0L;
  private String g = null;
  private int h = 0;
  private int i = 0;
  private int j = -1;
  
  public l() {}
  
  public l(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
  {
    this.b = paramInt1;
    this.c = 0;
    this.d = paramLong;
    this.e = paramArrayOfByte;
    if (paramArrayOfByte != null) {
      this.f = paramArrayOfByte.length;
    }
  }
  
  /* Error */
  public static int a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +14 -> 15
    //   4: ldc 51
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: invokestatic 56	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: iconst_m1
    //   14: ireturn
    //   15: ldc 58
    //   17: iconst_1
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: iconst_1
    //   24: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: aastore
    //   28: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: new 68	com/tencent/feedback/proguard/n
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   39: astore_3
    //   40: aload_3
    //   41: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   44: astore_0
    //   45: aload_0
    //   46: ifnonnull +58 -> 104
    //   49: ldc 77
    //   51: iconst_0
    //   52: anewarray 4	java/lang/Object
    //   55: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: ldc 81
    //   60: iconst_0
    //   61: anewarray 4	java/lang/Object
    //   64: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_0
    //   68: ifnull +14 -> 82
    //   71: aload_0
    //   72: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   75: ifeq +7 -> 82
    //   78: aload_0
    //   79: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   82: aload_3
    //   83: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   86: ldc 95
    //   88: iconst_1
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: iconst_0
    //   95: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: iconst_m1
    //   103: ireturn
    //   104: new 97	java/lang/StringBuilder
    //   107: dup
    //   108: ldc 99
    //   110: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   113: iconst_1
    //   114: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   117: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: astore 4
    //   122: aload_0
    //   123: ldc 112
    //   125: aload 4
    //   127: aconst_null
    //   128: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   131: istore_1
    //   132: aload 4
    //   134: astore_2
    //   135: aload 4
    //   137: ifnonnull +6 -> 143
    //   140: ldc 118
    //   142: astore_2
    //   143: iload_1
    //   144: istore 6
    //   146: aload_0
    //   147: astore 5
    //   149: aload_3
    //   150: astore 4
    //   152: ldc 120
    //   154: iconst_2
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: iload_1
    //   161: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload_2
    //   168: aastore
    //   169: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_0
    //   173: ifnull +14 -> 187
    //   176: aload_0
    //   177: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   180: ifeq +7 -> 187
    //   183: aload_0
    //   184: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   187: aload_3
    //   188: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   191: ldc 95
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: iload_1
    //   200: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: iload_1
    //   208: ireturn
    //   209: astore_2
    //   210: aconst_null
    //   211: astore_0
    //   212: aconst_null
    //   213: astore_3
    //   214: iconst_0
    //   215: istore_1
    //   216: iload_1
    //   217: istore 6
    //   219: aload_0
    //   220: astore 5
    //   222: aload_3
    //   223: astore 4
    //   225: ldc 122
    //   227: iconst_0
    //   228: anewarray 4	java/lang/Object
    //   231: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: iload_1
    //   235: istore 6
    //   237: aload_0
    //   238: astore 5
    //   240: aload_3
    //   241: astore 4
    //   243: ldc 124
    //   245: iconst_1
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload_2
    //   252: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   255: aastore
    //   256: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: iload_1
    //   260: istore 6
    //   262: aload_0
    //   263: astore 5
    //   265: aload_3
    //   266: astore 4
    //   268: aload_2
    //   269: invokevirtual 130	java/lang/Throwable:printStackTrace	()V
    //   272: aload_0
    //   273: ifnull +14 -> 287
    //   276: aload_0
    //   277: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   280: ifeq +7 -> 287
    //   283: aload_0
    //   284: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   287: aload_3
    //   288: ifnull +7 -> 295
    //   291: aload_3
    //   292: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   295: ldc 95
    //   297: iconst_1
    //   298: anewarray 4	java/lang/Object
    //   301: dup
    //   302: iconst_0
    //   303: iload_1
    //   304: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: aastore
    //   308: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: iload_1
    //   312: ireturn
    //   313: astore_2
    //   314: aconst_null
    //   315: astore_0
    //   316: aconst_null
    //   317: astore_3
    //   318: iconst_0
    //   319: istore_1
    //   320: aload_0
    //   321: ifnull +14 -> 335
    //   324: aload_0
    //   325: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   328: ifeq +7 -> 335
    //   331: aload_0
    //   332: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   335: aload_3
    //   336: ifnull +7 -> 343
    //   339: aload_3
    //   340: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   343: ldc 95
    //   345: iconst_1
    //   346: anewarray 4	java/lang/Object
    //   349: dup
    //   350: iconst_0
    //   351: iload_1
    //   352: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   355: aastore
    //   356: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   359: aload_2
    //   360: athrow
    //   361: astore_2
    //   362: aconst_null
    //   363: astore_0
    //   364: iconst_0
    //   365: istore_1
    //   366: goto -46 -> 320
    //   369: astore_2
    //   370: iconst_0
    //   371: istore_1
    //   372: goto -52 -> 320
    //   375: astore_2
    //   376: iload 6
    //   378: istore_1
    //   379: aload 5
    //   381: astore_0
    //   382: aload 4
    //   384: astore_3
    //   385: goto -65 -> 320
    //   388: astore_2
    //   389: aconst_null
    //   390: astore_0
    //   391: iconst_0
    //   392: istore_1
    //   393: goto -177 -> 216
    //   396: astore_2
    //   397: iconst_0
    //   398: istore_1
    //   399: goto -183 -> 216
    //   402: astore_2
    //   403: goto -187 -> 216
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	406	0	paramContext	Context
    //   0	406	1	paramInt	int
    //   134	34	2	localObject1	Object
    //   209	60	2	localThrowable1	Throwable
    //   313	47	2	localObject2	Object
    //   361	1	2	localObject3	Object
    //   369	1	2	localObject4	Object
    //   375	1	2	localObject5	Object
    //   388	1	2	localThrowable2	Throwable
    //   396	1	2	localThrowable3	Throwable
    //   402	1	2	localThrowable4	Throwable
    //   39	346	3	localObject6	Object
    //   120	263	4	localObject7	Object
    //   147	233	5	localContext	Context
    //   144	233	6	k	int
    // Exception table:
    //   from	to	target	type
    //   31	40	209	java/lang/Throwable
    //   31	40	313	finally
    //   40	45	361	finally
    //   49	67	369	finally
    //   104	132	369	finally
    //   152	172	375	finally
    //   225	234	375	finally
    //   243	259	375	finally
    //   268	272	375	finally
    //   40	45	388	java/lang/Throwable
    //   49	67	396	java/lang/Throwable
    //   104	132	396	java/lang/Throwable
    //   152	172	402	java/lang/Throwable
  }
  
  public static int a(Context paramContext, int[] paramArrayOfInt, long paramLong1, long paramLong2)
  {
    return a(paramContext, paramArrayOfInt, paramLong1, paramLong2, -1, -1);
  }
  
  /* Error */
  public static int a(Context paramContext, int[] paramArrayOfInt, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 10
    //   3: iconst_0
    //   4: istore 11
    //   6: ldc -120
    //   8: iconst_0
    //   9: anewarray 4	java/lang/Object
    //   12: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: aload_0
    //   16: ifnonnull +18 -> 34
    //   19: ldc -118
    //   21: iconst_0
    //   22: anewarray 4	java/lang/Object
    //   25: invokestatic 140	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: iconst_m1
    //   29: istore 11
    //   31: iload 11
    //   33: ireturn
    //   34: lload_2
    //   35: lload 4
    //   37: lcmp
    //   38: ifgt -7 -> 31
    //   41: new 97	java/lang/StringBuilder
    //   44: dup
    //   45: ldc -114
    //   47: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   50: lload_2
    //   51: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   54: ldc -109
    //   56: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: ldc -104
    //   61: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: lload 4
    //   66: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   69: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: astore 8
    //   74: aload 8
    //   76: astore 9
    //   78: iload 6
    //   80: iflt +30 -> 110
    //   83: new 97	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   90: aload 8
    //   92: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc -101
    //   97: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: iload 6
    //   102: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   105: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: astore 9
    //   110: aload 9
    //   112: astore 8
    //   114: iload 7
    //   116: iflt +30 -> 146
    //   119: new 97	java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   126: aload 9
    //   128: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: ldc -99
    //   133: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: iload 7
    //   138: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   141: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: astore 8
    //   146: aload_1
    //   147: ifnull +344 -> 491
    //   150: aload_1
    //   151: arraylength
    //   152: ifle +339 -> 491
    //   155: ldc -97
    //   157: astore 9
    //   159: iconst_0
    //   160: istore 6
    //   162: iload 6
    //   164: aload_1
    //   165: arraylength
    //   166: if_icmpge +41 -> 207
    //   169: new 97	java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   176: aload 9
    //   178: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: ldc -95
    //   183: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: aload_1
    //   187: iload 6
    //   189: iaload
    //   190: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   193: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   196: astore 9
    //   198: iload 6
    //   200: iconst_1
    //   201: iadd
    //   202: istore 6
    //   204: goto -42 -> 162
    //   207: aload 9
    //   209: iconst_4
    //   210: invokevirtual 167	java/lang/String:substring	(I)Ljava/lang/String;
    //   213: astore_1
    //   214: new 97	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   221: aload 8
    //   223: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc -87
    //   228: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_1
    //   232: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: ldc -85
    //   237: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   243: astore_1
    //   244: new 97	java/lang/StringBuilder
    //   247: dup
    //   248: ldc -83
    //   250: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   253: aload_1
    //   254: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: iconst_0
    //   261: anewarray 4	java/lang/Object
    //   264: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: new 68	com/tencent/feedback/proguard/n
    //   270: dup
    //   271: aload_0
    //   272: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   275: astore 8
    //   277: aload 8
    //   279: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   282: astore_0
    //   283: aload_0
    //   284: ldc -81
    //   286: aload_1
    //   287: aconst_null
    //   288: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   291: istore 6
    //   293: new 97	java/lang/StringBuilder
    //   296: dup
    //   297: ldc -79
    //   299: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: iload 6
    //   304: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   307: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: iconst_0
    //   311: anewarray 4	java/lang/Object
    //   314: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: aload_0
    //   318: ifnull +14 -> 332
    //   321: aload_0
    //   322: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   325: ifeq +7 -> 332
    //   328: aload_0
    //   329: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   332: aload 8
    //   334: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   337: ldc -77
    //   339: iconst_0
    //   340: anewarray 4	java/lang/Object
    //   343: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   346: iload 6
    //   348: ireturn
    //   349: astore 8
    //   351: aconst_null
    //   352: astore_0
    //   353: aload 10
    //   355: astore_1
    //   356: aload 8
    //   358: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   361: iconst_0
    //   362: anewarray 4	java/lang/Object
    //   365: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   368: aload_0
    //   369: ifnull +14 -> 383
    //   372: aload_0
    //   373: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   376: ifeq +7 -> 383
    //   379: aload_0
    //   380: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   383: aload_1
    //   384: ifnull +7 -> 391
    //   387: aload_1
    //   388: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   391: ldc -77
    //   393: iconst_0
    //   394: anewarray 4	java/lang/Object
    //   397: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: iconst_m1
    //   401: ireturn
    //   402: astore_1
    //   403: aconst_null
    //   404: astore_0
    //   405: aconst_null
    //   406: astore 8
    //   408: aload_0
    //   409: ifnull +14 -> 423
    //   412: aload_0
    //   413: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   416: ifeq +7 -> 423
    //   419: aload_0
    //   420: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   423: aload 8
    //   425: ifnull +8 -> 433
    //   428: aload 8
    //   430: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   433: ldc -77
    //   435: iconst_0
    //   436: anewarray 4	java/lang/Object
    //   439: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: aload_1
    //   443: athrow
    //   444: astore_1
    //   445: aconst_null
    //   446: astore_0
    //   447: goto -39 -> 408
    //   450: astore_1
    //   451: goto -43 -> 408
    //   454: astore 9
    //   456: aload_1
    //   457: astore 8
    //   459: aload 9
    //   461: astore_1
    //   462: goto -54 -> 408
    //   465: astore 9
    //   467: aconst_null
    //   468: astore_0
    //   469: aload 8
    //   471: astore_1
    //   472: aload 9
    //   474: astore 8
    //   476: goto -120 -> 356
    //   479: astore 9
    //   481: aload 8
    //   483: astore_1
    //   484: aload 9
    //   486: astore 8
    //   488: goto -132 -> 356
    //   491: aload 8
    //   493: astore_1
    //   494: goto -250 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	paramContext	Context
    //   0	497	1	paramArrayOfInt	int[]
    //   0	497	2	paramLong1	long
    //   0	497	4	paramLong2	long
    //   0	497	6	paramInt1	int
    //   0	497	7	paramInt2	int
    //   72	261	8	localObject1	Object
    //   349	8	8	localThrowable1	Throwable
    //   406	86	8	localObject2	Object
    //   76	132	9	localObject3	Object
    //   454	6	9	localObject4	Object
    //   465	8	9	localThrowable2	Throwable
    //   479	6	9	localThrowable3	Throwable
    //   1	353	10	localObject5	Object
    //   4	28	11	k	int
    // Exception table:
    //   from	to	target	type
    //   267	277	349	java/lang/Throwable
    //   267	277	402	finally
    //   277	283	444	finally
    //   283	317	450	finally
    //   356	368	454	finally
    //   277	283	465	java/lang/Throwable
    //   283	317	479	java/lang/Throwable
  }
  
  /* Error */
  public static int a(Context paramContext, int[] paramArrayOfInt, long paramLong1, long paramLong2, String paramString)
  {
    // Byte code:
    //   0: ldc -74
    //   2: iconst_0
    //   3: anewarray 4	java/lang/Object
    //   6: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc -72
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 140	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: iconst_m1
    //   23: ireturn
    //   24: lload_2
    //   25: lload 4
    //   27: lcmp
    //   28: ifle +5 -> 33
    //   31: iconst_0
    //   32: ireturn
    //   33: new 97	java/lang/StringBuilder
    //   36: dup
    //   37: ldc -114
    //   39: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: lload_2
    //   43: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   46: ldc -109
    //   48: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc -104
    //   53: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: lload 4
    //   58: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   61: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: astore 8
    //   66: aload 8
    //   68: astore 7
    //   70: aload_1
    //   71: ifnull +102 -> 173
    //   74: aload 8
    //   76: astore 7
    //   78: aload_1
    //   79: arraylength
    //   80: ifle +93 -> 173
    //   83: ldc -97
    //   85: astore 7
    //   87: iconst_0
    //   88: istore 10
    //   90: iload 10
    //   92: aload_1
    //   93: arraylength
    //   94: if_icmpge +41 -> 135
    //   97: new 97	java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   104: aload 7
    //   106: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc -95
    //   111: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload_1
    //   115: iload 10
    //   117: iaload
    //   118: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   121: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore 7
    //   126: iload 10
    //   128: iconst_1
    //   129: iadd
    //   130: istore 10
    //   132: goto -42 -> 90
    //   135: aload 7
    //   137: iconst_4
    //   138: invokevirtual 167	java/lang/String:substring	(I)Ljava/lang/String;
    //   141: astore_1
    //   142: new 97	java/lang/StringBuilder
    //   145: dup
    //   146: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   149: aload 8
    //   151: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: ldc -87
    //   156: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload_1
    //   160: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: ldc -85
    //   165: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: astore 7
    //   173: aload 7
    //   175: astore_1
    //   176: aload 6
    //   178: ifnull +34 -> 212
    //   181: new 97	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   188: aload 7
    //   190: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: ldc -70
    //   195: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload 6
    //   200: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: ldc -68
    //   205: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: astore_1
    //   212: new 97	java/lang/StringBuilder
    //   215: dup
    //   216: ldc -66
    //   218: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: aload_1
    //   222: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: iconst_0
    //   229: anewarray 4	java/lang/Object
    //   232: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aconst_null
    //   236: astore 9
    //   238: aconst_null
    //   239: astore 7
    //   241: aconst_null
    //   242: astore 8
    //   244: new 68	com/tencent/feedback/proguard/n
    //   247: dup
    //   248: aload_0
    //   249: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   252: astore 6
    //   254: aload 6
    //   256: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   259: astore_0
    //   260: aload_0
    //   261: ldc -81
    //   263: iconst_1
    //   264: anewarray 163	java/lang/String
    //   267: dup
    //   268: iconst_0
    //   269: ldc -64
    //   271: aastore
    //   272: aload_1
    //   273: aconst_null
    //   274: aconst_null
    //   275: aconst_null
    //   276: aconst_null
    //   277: invokevirtual 196	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   280: astore_1
    //   281: aload_1
    //   282: invokeinterface 201 1 0
    //   287: pop
    //   288: aload_1
    //   289: aload_1
    //   290: ldc -53
    //   292: invokeinterface 207 2 0
    //   297: invokeinterface 211 2 0
    //   302: istore 10
    //   304: new 97	java/lang/StringBuilder
    //   307: dup
    //   308: ldc -43
    //   310: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   313: iload 10
    //   315: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   318: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: iconst_0
    //   322: anewarray 4	java/lang/Object
    //   325: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: aload_1
    //   329: ifnull +18 -> 347
    //   332: aload_1
    //   333: invokeinterface 216 1 0
    //   338: ifne +9 -> 347
    //   341: aload_1
    //   342: invokeinterface 217 1 0
    //   347: aload_0
    //   348: ifnull +14 -> 362
    //   351: aload_0
    //   352: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   355: ifeq +7 -> 362
    //   358: aload_0
    //   359: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   362: aload 6
    //   364: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   367: ldc -37
    //   369: iconst_0
    //   370: anewarray 4	java/lang/Object
    //   373: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   376: iload 10
    //   378: ireturn
    //   379: astore 7
    //   381: aconst_null
    //   382: astore_1
    //   383: aload 9
    //   385: astore_0
    //   386: aload 8
    //   388: astore 6
    //   390: aload 7
    //   392: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   395: iconst_0
    //   396: anewarray 4	java/lang/Object
    //   399: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: aload_1
    //   403: ifnull +18 -> 421
    //   406: aload_1
    //   407: invokeinterface 216 1 0
    //   412: ifne +9 -> 421
    //   415: aload_1
    //   416: invokeinterface 217 1 0
    //   421: aload 6
    //   423: ifnull +16 -> 439
    //   426: aload 6
    //   428: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   431: ifeq +8 -> 439
    //   434: aload 6
    //   436: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   439: aload_0
    //   440: ifnull +7 -> 447
    //   443: aload_0
    //   444: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   447: ldc -37
    //   449: iconst_0
    //   450: anewarray 4	java/lang/Object
    //   453: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: iconst_m1
    //   457: ireturn
    //   458: astore_0
    //   459: aconst_null
    //   460: astore 6
    //   462: aconst_null
    //   463: astore_1
    //   464: aload_1
    //   465: ifnull +18 -> 483
    //   468: aload_1
    //   469: invokeinterface 216 1 0
    //   474: ifne +9 -> 483
    //   477: aload_1
    //   478: invokeinterface 217 1 0
    //   483: aload 7
    //   485: ifnull +16 -> 501
    //   488: aload 7
    //   490: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   493: ifeq +8 -> 501
    //   496: aload 7
    //   498: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   501: aload 6
    //   503: ifnull +8 -> 511
    //   506: aload 6
    //   508: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   511: ldc -37
    //   513: iconst_0
    //   514: anewarray 4	java/lang/Object
    //   517: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   520: aload_0
    //   521: athrow
    //   522: astore_0
    //   523: aconst_null
    //   524: astore_1
    //   525: goto -61 -> 464
    //   528: astore_1
    //   529: aconst_null
    //   530: astore 8
    //   532: aload_0
    //   533: astore 7
    //   535: aload_1
    //   536: astore_0
    //   537: aload 8
    //   539: astore_1
    //   540: goto -76 -> 464
    //   543: astore 8
    //   545: aload_0
    //   546: astore 7
    //   548: aload 8
    //   550: astore_0
    //   551: goto -87 -> 464
    //   554: astore 7
    //   556: aload_0
    //   557: astore 8
    //   559: aload 7
    //   561: astore_0
    //   562: aload 6
    //   564: astore 7
    //   566: aload 8
    //   568: astore 6
    //   570: goto -106 -> 464
    //   573: astore 7
    //   575: aload 6
    //   577: astore_0
    //   578: aconst_null
    //   579: astore_1
    //   580: aload 8
    //   582: astore 6
    //   584: goto -194 -> 390
    //   587: astore 7
    //   589: aload 6
    //   591: astore_1
    //   592: aconst_null
    //   593: astore 8
    //   595: aload_0
    //   596: astore 6
    //   598: aload_1
    //   599: astore_0
    //   600: aload 8
    //   602: astore_1
    //   603: goto -213 -> 390
    //   606: astore 7
    //   608: aload 6
    //   610: astore 8
    //   612: aload_0
    //   613: astore 6
    //   615: aload 8
    //   617: astore_0
    //   618: goto -228 -> 390
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	621	0	paramContext	Context
    //   0	621	1	paramArrayOfInt	int[]
    //   0	621	2	paramLong1	long
    //   0	621	4	paramLong2	long
    //   0	621	6	paramString	String
    //   68	172	7	str1	String
    //   379	118	7	localThrowable1	Throwable
    //   533	14	7	localContext	Context
    //   554	6	7	localObject1	Object
    //   564	1	7	str2	String
    //   573	1	7	localThrowable2	Throwable
    //   587	1	7	localThrowable3	Throwable
    //   606	1	7	localThrowable4	Throwable
    //   64	474	8	str3	String
    //   543	6	8	localObject2	Object
    //   557	59	8	localObject3	Object
    //   236	148	9	localObject4	Object
    //   88	289	10	k	int
    // Exception table:
    //   from	to	target	type
    //   244	254	379	java/lang/Throwable
    //   244	254	458	finally
    //   254	260	522	finally
    //   260	281	528	finally
    //   281	328	543	finally
    //   390	402	554	finally
    //   254	260	573	java/lang/Throwable
    //   260	281	587	java/lang/Throwable
    //   281	328	606	java/lang/Throwable
  }
  
  /* Error */
  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_2
    //   5: aconst_null
    //   6: astore 6
    //   8: aconst_null
    //   9: astore_3
    //   10: ldc -34
    //   12: iconst_0
    //   13: anewarray 4	java/lang/Object
    //   16: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: aload_0
    //   20: ifnonnull +14 -> 34
    //   23: ldc -32
    //   25: iconst_0
    //   26: anewarray 4	java/lang/Object
    //   29: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: iconst_m1
    //   33: ireturn
    //   34: aload_1
    //   35: ifnull +8 -> 43
    //   38: aload_1
    //   39: arraylength
    //   40: ifgt +5 -> 45
    //   43: iconst_0
    //   44: ireturn
    //   45: new 68	com/tencent/feedback/proguard/n
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   53: astore 4
    //   55: aload_2
    //   56: astore_0
    //   57: aload 4
    //   59: astore_2
    //   60: aload 6
    //   62: astore_3
    //   63: aload 4
    //   65: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   68: astore 5
    //   70: aload 5
    //   72: astore_0
    //   73: aload 4
    //   75: astore_2
    //   76: aload 5
    //   78: astore_3
    //   79: new 226	java/lang/StringBuffer
    //   82: dup
    //   83: invokespecial 227	java/lang/StringBuffer:<init>	()V
    //   86: astore 6
    //   88: iconst_0
    //   89: istore 7
    //   91: iconst_0
    //   92: istore 8
    //   94: aload 5
    //   96: astore_0
    //   97: aload 4
    //   99: astore_2
    //   100: aload 5
    //   102: astore_3
    //   103: iload 8
    //   105: aload_1
    //   106: arraylength
    //   107: if_icmpge +186 -> 293
    //   110: aload 5
    //   112: astore_0
    //   113: aload 4
    //   115: astore_2
    //   116: aload 5
    //   118: astore_3
    //   119: aload_1
    //   120: iload 8
    //   122: aaload
    //   123: invokevirtual 233	java/lang/Long:longValue	()J
    //   126: lstore 10
    //   128: aload 5
    //   130: astore_0
    //   131: aload 4
    //   133: astore_2
    //   134: aload 5
    //   136: astore_3
    //   137: aload 6
    //   139: new 97	java/lang/StringBuilder
    //   142: dup
    //   143: ldc -21
    //   145: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   148: lload 10
    //   150: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   153: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   159: pop
    //   160: iload 7
    //   162: istore 9
    //   164: iload 8
    //   166: ifle +365 -> 531
    //   169: iload 7
    //   171: istore 9
    //   173: iload 8
    //   175: bipush 50
    //   177: irem
    //   178: ifne +353 -> 531
    //   181: aload 5
    //   183: astore_0
    //   184: aload 4
    //   186: astore_2
    //   187: aload 5
    //   189: astore_3
    //   190: new 97	java/lang/StringBuilder
    //   193: dup
    //   194: ldc -16
    //   196: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: iload 8
    //   201: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   204: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aload 5
    //   216: astore_0
    //   217: aload 4
    //   219: astore_2
    //   220: aload 5
    //   222: astore_3
    //   223: iload 7
    //   225: aload 5
    //   227: ldc -81
    //   229: aload 6
    //   231: iconst_4
    //   232: invokevirtual 241	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   235: aconst_null
    //   236: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   239: iadd
    //   240: istore 9
    //   242: aload 5
    //   244: astore_0
    //   245: aload 4
    //   247: astore_2
    //   248: aload 5
    //   250: astore_3
    //   251: aload 6
    //   253: iconst_0
    //   254: invokevirtual 245	java/lang/StringBuffer:setLength	(I)V
    //   257: aload 5
    //   259: astore_0
    //   260: aload 4
    //   262: astore_2
    //   263: aload 5
    //   265: astore_3
    //   266: new 97	java/lang/StringBuilder
    //   269: dup
    //   270: ldc -9
    //   272: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   275: iload 9
    //   277: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   280: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: iconst_0
    //   284: anewarray 4	java/lang/Object
    //   287: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: goto +241 -> 531
    //   293: iload 7
    //   295: istore 8
    //   297: aload 5
    //   299: astore_0
    //   300: aload 4
    //   302: astore_2
    //   303: aload 5
    //   305: astore_3
    //   306: aload 6
    //   308: invokevirtual 251	java/lang/StringBuffer:length	()I
    //   311: ifle +46 -> 357
    //   314: aload 5
    //   316: astore_0
    //   317: aload 4
    //   319: astore_2
    //   320: aload 5
    //   322: astore_3
    //   323: iload 7
    //   325: aload 5
    //   327: ldc -81
    //   329: aload 6
    //   331: iconst_4
    //   332: invokevirtual 241	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   335: aconst_null
    //   336: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   339: iadd
    //   340: istore 8
    //   342: aload 5
    //   344: astore_0
    //   345: aload 4
    //   347: astore_2
    //   348: aload 5
    //   350: astore_3
    //   351: aload 6
    //   353: iconst_0
    //   354: invokevirtual 245	java/lang/StringBuffer:setLength	(I)V
    //   357: aload 5
    //   359: astore_0
    //   360: aload 4
    //   362: astore_2
    //   363: aload 5
    //   365: astore_3
    //   366: new 97	java/lang/StringBuilder
    //   369: dup
    //   370: ldc -3
    //   372: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   375: iload 8
    //   377: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   380: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: iconst_0
    //   384: anewarray 4	java/lang/Object
    //   387: invokestatic 140	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   390: aload 5
    //   392: ifnull +16 -> 408
    //   395: aload 5
    //   397: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   400: ifeq +8 -> 408
    //   403: aload 5
    //   405: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   408: aload 4
    //   410: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   413: ldc -1
    //   415: iconst_0
    //   416: anewarray 4	java/lang/Object
    //   419: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   422: iload 8
    //   424: ireturn
    //   425: astore 5
    //   427: aconst_null
    //   428: astore_1
    //   429: aload_3
    //   430: astore_0
    //   431: aload_1
    //   432: astore_2
    //   433: aload 5
    //   435: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   438: iconst_0
    //   439: anewarray 4	java/lang/Object
    //   442: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   445: aload_3
    //   446: ifnull +14 -> 460
    //   449: aload_3
    //   450: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   453: ifeq +7 -> 460
    //   456: aload_3
    //   457: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   460: aload_1
    //   461: ifnull +7 -> 468
    //   464: aload_1
    //   465: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   468: ldc -1
    //   470: iconst_0
    //   471: anewarray 4	java/lang/Object
    //   474: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: iconst_m1
    //   478: ireturn
    //   479: astore_1
    //   480: aconst_null
    //   481: astore_2
    //   482: aload 5
    //   484: astore_0
    //   485: aload_0
    //   486: ifnull +14 -> 500
    //   489: aload_0
    //   490: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   493: ifeq +7 -> 500
    //   496: aload_0
    //   497: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   500: aload_2
    //   501: ifnull +7 -> 508
    //   504: aload_2
    //   505: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   508: ldc -1
    //   510: iconst_0
    //   511: anewarray 4	java/lang/Object
    //   514: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   517: aload_1
    //   518: athrow
    //   519: astore_1
    //   520: goto -35 -> 485
    //   523: astore 5
    //   525: aload 4
    //   527: astore_1
    //   528: goto -99 -> 429
    //   531: iload 8
    //   533: iconst_1
    //   534: iadd
    //   535: istore 8
    //   537: iload 9
    //   539: istore 7
    //   541: goto -447 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	544	0	paramContext	Context
    //   0	544	1	paramArrayOfLong	Long[]
    //   4	501	2	localObject1	Object
    //   9	448	3	localObject2	Object
    //   53	473	4	localn	n
    //   1	403	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   425	58	5	localThrowable1	Throwable
    //   523	1	5	localThrowable2	Throwable
    //   6	346	6	localStringBuffer	StringBuffer
    //   89	451	7	k	int
    //   92	444	8	m	int
    //   162	376	9	n	int
    //   126	23	10	l	long
    // Exception table:
    //   from	to	target	type
    //   45	55	425	java/lang/Throwable
    //   45	55	479	finally
    //   63	70	519	finally
    //   79	88	519	finally
    //   103	110	519	finally
    //   119	128	519	finally
    //   137	160	519	finally
    //   190	214	519	finally
    //   223	242	519	finally
    //   251	257	519	finally
    //   266	290	519	finally
    //   306	314	519	finally
    //   323	342	519	finally
    //   351	357	519	finally
    //   366	390	519	finally
    //   433	445	519	finally
    //   63	70	523	java/lang/Throwable
    //   79	88	523	java/lang/Throwable
    //   103	110	523	java/lang/Throwable
    //   119	128	523	java/lang/Throwable
    //   137	160	523	java/lang/Throwable
    //   190	214	523	java/lang/Throwable
    //   223	242	523	java/lang/Throwable
    //   251	257	523	java/lang/Throwable
    //   266	290	523	java/lang/Throwable
    //   306	314	523	java/lang/Throwable
    //   323	342	523	java/lang/Throwable
    //   351	357	523	java/lang/Throwable
    //   366	390	523	java/lang/Throwable
  }
  
  public static ContentValues a(l paraml)
  {
    ContentValues localContentValues = new ContentValues();
    if (paraml.a > 0L) {
      localContentValues.put("_id", Long.valueOf(paraml.a));
    }
    localContentValues.put("_prority", Integer.valueOf(paraml.c));
    localContentValues.put("_time", Long.valueOf(paraml.d));
    localContentValues.put("_type", Integer.valueOf(paraml.b));
    localContentValues.put("_datas", paraml.e);
    localContentValues.put("_length", Long.valueOf(paraml.f));
    localContentValues.put("_key", paraml.g);
    localContentValues.put("_count", Integer.valueOf(paraml.c()));
    localContentValues.put("_upCounts", Integer.valueOf(paraml.d()));
    localContentValues.put("_state", Integer.valueOf(paraml.e()));
    return localContentValues;
  }
  
  /* Error */
  public static List<o> a(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: iload_3
    //   5: ifne +22 -> 27
    //   8: ldc_w 304
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: iload_3
    //   18: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: aastore
    //   22: invokestatic 56	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aconst_null
    //   26: areturn
    //   27: aload_1
    //   28: ifnonnull +139 -> 167
    //   31: ldc_w 306
    //   34: astore 4
    //   36: ldc_w 308
    //   39: iconst_3
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: aload 4
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: iload_2
    //   51: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: aastore
    //   55: dup
    //   56: iconst_2
    //   57: iload_3
    //   58: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: aastore
    //   62: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aconst_null
    //   66: astore 7
    //   68: aconst_null
    //   69: astore 8
    //   71: new 68	com/tencent/feedback/proguard/n
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   79: astore 4
    //   81: aload 4
    //   83: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   86: astore_0
    //   87: aload_0
    //   88: ifnonnull +85 -> 173
    //   91: ldc_w 310
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: ldc_w 312
    //   104: iconst_0
    //   105: anewarray 4	java/lang/Object
    //   108: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: aload_0
    //   112: ifnull +14 -> 126
    //   115: aload_0
    //   116: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   119: ifeq +7 -> 126
    //   122: aload_0
    //   123: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   126: aload 4
    //   128: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   131: ldc_w 314
    //   134: iconst_1
    //   135: anewarray 4	java/lang/Object
    //   138: dup
    //   139: iconst_0
    //   140: iconst_m1
    //   141: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   144: aastore
    //   145: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: ldc_w 316
    //   151: iconst_1
    //   152: anewarray 4	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: iconst_m1
    //   158: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: aastore
    //   162: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aconst_null
    //   166: areturn
    //   167: aload_1
    //   168: astore 4
    //   170: goto -134 -> 36
    //   173: new 226	java/lang/StringBuffer
    //   176: dup
    //   177: invokespecial 227	java/lang/StringBuffer:<init>	()V
    //   180: astore 5
    //   182: aload_1
    //   183: ifnull +54 -> 237
    //   186: aload 5
    //   188: invokevirtual 251	java/lang/StringBuffer:length	()I
    //   191: ifle +12 -> 203
    //   194: aload 5
    //   196: ldc_w 318
    //   199: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: pop
    //   203: aload 5
    //   205: ldc_w 320
    //   208: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   211: pop
    //   212: aload 5
    //   214: ldc_w 322
    //   217: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   220: pop
    //   221: aload 5
    //   223: aload_1
    //   224: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   227: pop
    //   228: aload 5
    //   230: ldc_w 324
    //   233: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   236: pop
    //   237: iload_2
    //   238: iflt +45 -> 283
    //   241: aload 5
    //   243: invokevirtual 251	java/lang/StringBuffer:length	()I
    //   246: ifle +12 -> 258
    //   249: aload 5
    //   251: ldc_w 318
    //   254: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   257: pop
    //   258: aload 5
    //   260: ldc_w 326
    //   263: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   266: pop
    //   267: aload 5
    //   269: ldc_w 328
    //   272: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   275: pop
    //   276: aload 5
    //   278: iload_2
    //   279: invokevirtual 331	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   282: pop
    //   283: aload 5
    //   285: invokevirtual 251	java/lang/StringBuffer:length	()I
    //   288: ifle +266 -> 554
    //   291: aload 5
    //   293: invokevirtual 332	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   296: astore_1
    //   297: iload_3
    //   298: ifle +261 -> 559
    //   301: new 97	java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   308: iload_3
    //   309: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   312: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: astore 5
    //   317: aload_0
    //   318: ldc 112
    //   320: aconst_null
    //   321: aload_1
    //   322: aconst_null
    //   323: aconst_null
    //   324: aconst_null
    //   325: aconst_null
    //   326: aload 5
    //   328: invokevirtual 335	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   331: astore 6
    //   333: aload 6
    //   335: ifnull +574 -> 909
    //   338: new 337	java/util/ArrayList
    //   341: dup
    //   342: invokespecial 338	java/util/ArrayList:<init>	()V
    //   345: astore_1
    //   346: aload 6
    //   348: invokeinterface 201 1 0
    //   353: ifeq +212 -> 565
    //   356: aload 6
    //   358: invokestatic 341	com/tencent/feedback/proguard/l:b	(Landroid/database/Cursor;)Lcom/tencent/feedback/proguard/o;
    //   361: astore 5
    //   363: aload 5
    //   365: ifnull +200 -> 565
    //   368: ldc_w 343
    //   371: iconst_4
    //   372: anewarray 4	java/lang/Object
    //   375: dup
    //   376: iconst_0
    //   377: aload 5
    //   379: invokevirtual 347	com/tencent/feedback/proguard/o:a	()Ljava/lang/String;
    //   382: aastore
    //   383: dup
    //   384: iconst_1
    //   385: aload 5
    //   387: invokevirtual 349	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   390: aastore
    //   391: dup
    //   392: iconst_2
    //   393: aload 5
    //   395: invokevirtual 350	com/tencent/feedback/proguard/o:e	()I
    //   398: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   401: aastore
    //   402: dup
    //   403: iconst_3
    //   404: aload 5
    //   406: invokevirtual 352	com/tencent/feedback/proguard/o:f	()Ljava/lang/String;
    //   409: aastore
    //   410: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: aload_1
    //   414: aload 5
    //   416: invokeinterface 358 2 0
    //   421: pop
    //   422: goto -76 -> 346
    //   425: astore 5
    //   427: aload_1
    //   428: astore 7
    //   430: aload_0
    //   431: astore_1
    //   432: aload 7
    //   434: astore_0
    //   435: ldc_w 360
    //   438: iconst_0
    //   439: anewarray 4	java/lang/Object
    //   442: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   445: ldc_w 312
    //   448: iconst_0
    //   449: anewarray 4	java/lang/Object
    //   452: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   455: aload 5
    //   457: invokevirtual 130	java/lang/Throwable:printStackTrace	()V
    //   460: aload 6
    //   462: ifnull +20 -> 482
    //   465: aload 6
    //   467: invokeinterface 216 1 0
    //   472: ifne +10 -> 482
    //   475: aload 6
    //   477: invokeinterface 217 1 0
    //   482: aload_1
    //   483: ifnull +14 -> 497
    //   486: aload_1
    //   487: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   490: ifeq +7 -> 497
    //   493: aload_1
    //   494: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   497: aload 4
    //   499: ifnull +8 -> 507
    //   502: aload 4
    //   504: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   507: aload_0
    //   508: ifnull +151 -> 659
    //   511: aload_0
    //   512: invokeinterface 363 1 0
    //   517: istore_2
    //   518: ldc_w 314
    //   521: iconst_1
    //   522: anewarray 4	java/lang/Object
    //   525: dup
    //   526: iconst_0
    //   527: iload_2
    //   528: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   531: aastore
    //   532: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   535: ldc_w 316
    //   538: iconst_1
    //   539: anewarray 4	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: iload_2
    //   545: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   548: aastore
    //   549: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   552: aload_0
    //   553: areturn
    //   554: aconst_null
    //   555: astore_1
    //   556: goto -259 -> 297
    //   559: aconst_null
    //   560: astore 5
    //   562: goto -245 -> 317
    //   565: aload 6
    //   567: ifnull +20 -> 587
    //   570: aload 6
    //   572: invokeinterface 216 1 0
    //   577: ifne +10 -> 587
    //   580: aload 6
    //   582: invokeinterface 217 1 0
    //   587: aload_0
    //   588: ifnull +14 -> 602
    //   591: aload_0
    //   592: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   595: ifeq +7 -> 602
    //   598: aload_0
    //   599: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   602: aload 4
    //   604: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   607: aload_1
    //   608: ifnull +46 -> 654
    //   611: aload_1
    //   612: invokeinterface 363 1 0
    //   617: istore_2
    //   618: ldc_w 314
    //   621: iconst_1
    //   622: anewarray 4	java/lang/Object
    //   625: dup
    //   626: iconst_0
    //   627: iload_2
    //   628: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   631: aastore
    //   632: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   635: ldc_w 316
    //   638: iconst_1
    //   639: anewarray 4	java/lang/Object
    //   642: dup
    //   643: iconst_0
    //   644: iload_2
    //   645: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   648: aastore
    //   649: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   652: aload_1
    //   653: areturn
    //   654: iconst_m1
    //   655: istore_2
    //   656: goto -38 -> 618
    //   659: iconst_m1
    //   660: istore_2
    //   661: goto -143 -> 518
    //   664: astore_0
    //   665: aconst_null
    //   666: astore 4
    //   668: aconst_null
    //   669: astore_1
    //   670: aload 7
    //   672: astore 6
    //   674: aload 8
    //   676: astore 5
    //   678: aload 5
    //   680: ifnull +20 -> 700
    //   683: aload 5
    //   685: invokeinterface 216 1 0
    //   690: ifne +10 -> 700
    //   693: aload 5
    //   695: invokeinterface 217 1 0
    //   700: aload_1
    //   701: ifnull +14 -> 715
    //   704: aload_1
    //   705: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   708: ifeq +7 -> 715
    //   711: aload_1
    //   712: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   715: aload 4
    //   717: ifnull +8 -> 725
    //   720: aload 4
    //   722: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   725: aload 6
    //   727: ifnull +47 -> 774
    //   730: aload 6
    //   732: invokeinterface 363 1 0
    //   737: istore_2
    //   738: ldc_w 314
    //   741: iconst_1
    //   742: anewarray 4	java/lang/Object
    //   745: dup
    //   746: iconst_0
    //   747: iload_2
    //   748: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   751: aastore
    //   752: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   755: ldc_w 316
    //   758: iconst_1
    //   759: anewarray 4	java/lang/Object
    //   762: dup
    //   763: iconst_0
    //   764: iload_2
    //   765: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   768: aastore
    //   769: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   772: aload_0
    //   773: athrow
    //   774: iconst_m1
    //   775: istore_2
    //   776: goto -38 -> 738
    //   779: astore_0
    //   780: aconst_null
    //   781: astore_1
    //   782: aload 8
    //   784: astore 5
    //   786: aload 7
    //   788: astore 6
    //   790: goto -112 -> 678
    //   793: astore 5
    //   795: aload_0
    //   796: astore_1
    //   797: aload 5
    //   799: astore_0
    //   800: aload 8
    //   802: astore 5
    //   804: aload 7
    //   806: astore 6
    //   808: goto -130 -> 678
    //   811: astore 8
    //   813: aload 6
    //   815: astore 5
    //   817: aload_0
    //   818: astore_1
    //   819: aload 8
    //   821: astore_0
    //   822: aload 7
    //   824: astore 6
    //   826: goto -148 -> 678
    //   829: astore 7
    //   831: aload 6
    //   833: astore 5
    //   835: aload_1
    //   836: astore 6
    //   838: aload_0
    //   839: astore_1
    //   840: aload 7
    //   842: astore_0
    //   843: goto -165 -> 678
    //   846: astore 7
    //   848: aload 6
    //   850: astore 5
    //   852: aload_0
    //   853: astore 6
    //   855: aload 7
    //   857: astore_0
    //   858: goto -180 -> 678
    //   861: astore 5
    //   863: aconst_null
    //   864: astore_1
    //   865: aconst_null
    //   866: astore 4
    //   868: aconst_null
    //   869: astore 6
    //   871: aconst_null
    //   872: astore_0
    //   873: goto -438 -> 435
    //   876: astore 5
    //   878: aconst_null
    //   879: astore 6
    //   881: aconst_null
    //   882: astore_1
    //   883: aconst_null
    //   884: astore_0
    //   885: goto -450 -> 435
    //   888: astore 5
    //   890: aconst_null
    //   891: astore 6
    //   893: aload_0
    //   894: astore_1
    //   895: aconst_null
    //   896: astore_0
    //   897: goto -462 -> 435
    //   900: astore 5
    //   902: aload_0
    //   903: astore_1
    //   904: aconst_null
    //   905: astore_0
    //   906: goto -471 -> 435
    //   909: aconst_null
    //   910: astore_1
    //   911: goto -346 -> 565
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	914	0	paramContext	Context
    //   0	914	1	paramString	String
    //   0	914	2	paramInt1	int
    //   0	914	3	paramInt2	int
    //   34	833	4	localObject1	Object
    //   180	235	5	localObject2	Object
    //   425	31	5	localThrowable1	Throwable
    //   560	225	5	localObject3	Object
    //   793	5	5	localObject4	Object
    //   802	49	5	localObject5	Object
    //   861	1	5	localThrowable2	Throwable
    //   876	1	5	localThrowable3	Throwable
    //   888	1	5	localThrowable4	Throwable
    //   900	1	5	localThrowable5	Throwable
    //   331	561	6	localObject6	Object
    //   66	757	7	str	String
    //   829	12	7	localObject7	Object
    //   846	10	7	localObject8	Object
    //   69	732	8	localObject9	Object
    //   811	9	8	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   346	363	425	java/lang/Throwable
    //   368	422	425	java/lang/Throwable
    //   71	81	664	finally
    //   81	87	779	finally
    //   91	111	793	finally
    //   173	182	793	finally
    //   186	203	793	finally
    //   203	237	793	finally
    //   241	258	793	finally
    //   258	283	793	finally
    //   283	297	793	finally
    //   301	317	793	finally
    //   317	333	793	finally
    //   338	346	811	finally
    //   346	363	829	finally
    //   368	422	829	finally
    //   435	460	846	finally
    //   71	81	861	java/lang/Throwable
    //   81	87	876	java/lang/Throwable
    //   91	111	888	java/lang/Throwable
    //   173	182	888	java/lang/Throwable
    //   186	203	888	java/lang/Throwable
    //   203	237	888	java/lang/Throwable
    //   241	258	888	java/lang/Throwable
    //   258	283	888	java/lang/Throwable
    //   283	297	888	java/lang/Throwable
    //   301	317	888	java/lang/Throwable
    //   317	333	888	java/lang/Throwable
    //   338	346	900	java/lang/Throwable
  }
  
  public static List<l> a(Context paramContext, int[] paramArrayOfInt, int paramInt1, int paramInt2, long paramLong1, int paramInt3, String paramString, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong2, long paramLong3)
  {
    return a(paramContext, paramArrayOfInt, -1, -1, paramLong1, paramInt3, paramString, -1, -1, -1, -1, -1L, Long.MAX_VALUE, -1);
  }
  
  /* Error */
  public static List<l> a(Context paramContext, int[] paramArrayOfInt, int paramInt1, int paramInt2, long paramLong1, int paramInt3, String paramString, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong2, long paramLong3, int paramInt8)
  {
    // Byte code:
    //   0: ldc_w 374
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +49 -> 60
    //   14: lload 4
    //   16: lconst_0
    //   17: lcmp
    //   18: ifeq +42 -> 60
    //   21: lload 14
    //   23: lconst_0
    //   24: lcmp
    //   25: ifle +11 -> 36
    //   28: lload 12
    //   30: lload 14
    //   32: lcmp
    //   33: ifgt +27 -> 60
    //   36: iload 9
    //   38: ifle +10 -> 48
    //   41: iload 8
    //   43: iload 9
    //   45: if_icmpgt +15 -> 60
    //   48: iload 11
    //   50: ifle +22 -> 72
    //   53: iload 10
    //   55: iload 11
    //   57: if_icmple +15 -> 72
    //   60: ldc_w 376
    //   63: iconst_0
    //   64: anewarray 4	java/lang/Object
    //   67: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aconst_null
    //   71: areturn
    //   72: lload 4
    //   74: lstore 25
    //   76: lload 4
    //   78: lconst_0
    //   79: lcmp
    //   80: ifge +8 -> 88
    //   83: ldc2_w 367
    //   86: lstore 25
    //   88: aload_1
    //   89: ifnull +2090 -> 2179
    //   92: aload_1
    //   93: arraylength
    //   94: ifle +2085 -> 2179
    //   97: ldc -97
    //   99: astore 17
    //   101: iconst_0
    //   102: istore 24
    //   104: iload 24
    //   106: aload_1
    //   107: arraylength
    //   108: if_icmpge +41 -> 149
    //   111: new 97	java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   118: aload 17
    //   120: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc -95
    //   125: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload_1
    //   129: iload 24
    //   131: iaload
    //   132: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   135: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: astore 17
    //   140: iload 24
    //   142: iconst_1
    //   143: iadd
    //   144: istore 24
    //   146: goto -42 -> 104
    //   149: new 97	java/lang/StringBuilder
    //   152: dup
    //   153: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   156: ldc -97
    //   158: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 17
    //   163: iconst_4
    //   164: invokevirtual 167	java/lang/String:substring	(I)Ljava/lang/String;
    //   167: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: astore_1
    //   174: aload_1
    //   175: invokevirtual 377	java/lang/String:length	()I
    //   178: ifle +937 -> 1115
    //   181: new 97	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 379
    //   188: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: aload_1
    //   192: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: ldc_w 381
    //   198: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: astore 17
    //   206: aload 17
    //   208: astore_1
    //   209: aload 7
    //   211: ifnull +56 -> 267
    //   214: new 97	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   221: aload 17
    //   223: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: astore 18
    //   228: aload 17
    //   230: invokevirtual 377	java/lang/String:length	()I
    //   233: ifle +889 -> 1122
    //   236: ldc_w 318
    //   239: astore_1
    //   240: aload 18
    //   242: aload_1
    //   243: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: ldc_w 383
    //   249: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload 7
    //   254: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: ldc_w 324
    //   260: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   266: astore_1
    //   267: aload_1
    //   268: astore 7
    //   270: iload 8
    //   272: iflt +55 -> 327
    //   275: new 97	java/lang/StringBuilder
    //   278: dup
    //   279: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   282: aload_1
    //   283: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: astore 7
    //   288: aload_1
    //   289: invokevirtual 377	java/lang/String:length	()I
    //   292: ifle +836 -> 1128
    //   295: ldc_w 318
    //   298: astore_1
    //   299: aload 7
    //   301: aload_1
    //   302: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: ldc_w 385
    //   308: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: iload 8
    //   313: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   316: ldc_w 387
    //   319: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: astore 7
    //   327: aload 7
    //   329: astore_1
    //   330: iload 9
    //   332: iflt +56 -> 388
    //   335: new 97	java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   342: aload 7
    //   344: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: astore 17
    //   349: aload 7
    //   351: invokevirtual 377	java/lang/String:length	()I
    //   354: ifle +780 -> 1134
    //   357: ldc_w 318
    //   360: astore_1
    //   361: aload 17
    //   363: aload_1
    //   364: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: ldc_w 389
    //   370: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: iload 9
    //   375: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   378: ldc_w 387
    //   381: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   387: astore_1
    //   388: aload_1
    //   389: astore 7
    //   391: iload 10
    //   393: iflt +55 -> 448
    //   396: new 97	java/lang/StringBuilder
    //   399: dup
    //   400: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   403: aload_1
    //   404: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: astore 7
    //   409: aload_1
    //   410: invokevirtual 377	java/lang/String:length	()I
    //   413: ifle +727 -> 1140
    //   416: ldc_w 318
    //   419: astore_1
    //   420: aload 7
    //   422: aload_1
    //   423: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: ldc_w 391
    //   429: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: iload 10
    //   434: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   437: ldc_w 387
    //   440: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   446: astore 7
    //   448: aload 7
    //   450: astore_1
    //   451: iload 11
    //   453: iflt +56 -> 509
    //   456: new 97	java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   463: aload 7
    //   465: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: astore 17
    //   470: aload 7
    //   472: invokevirtual 377	java/lang/String:length	()I
    //   475: ifle +671 -> 1146
    //   478: ldc_w 318
    //   481: astore_1
    //   482: aload 17
    //   484: aload_1
    //   485: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: ldc_w 393
    //   491: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: iload 11
    //   496: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   499: ldc_w 387
    //   502: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   508: astore_1
    //   509: aload_1
    //   510: astore 7
    //   512: lload 12
    //   514: lconst_0
    //   515: lcmp
    //   516: iflt +54 -> 570
    //   519: new 97	java/lang/StringBuilder
    //   522: dup
    //   523: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   526: aload_1
    //   527: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: astore 7
    //   532: aload_1
    //   533: invokevirtual 377	java/lang/String:length	()I
    //   536: ifle +616 -> 1152
    //   539: ldc_w 318
    //   542: astore_1
    //   543: aload 7
    //   545: aload_1
    //   546: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: ldc -114
    //   551: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: lload 12
    //   556: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   559: ldc_w 387
    //   562: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   568: astore 7
    //   570: aload 7
    //   572: astore_1
    //   573: lload 14
    //   575: lconst_0
    //   576: lcmp
    //   577: iflt +56 -> 633
    //   580: new 97	java/lang/StringBuilder
    //   583: dup
    //   584: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   587: aload 7
    //   589: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: astore 17
    //   594: aload 7
    //   596: invokevirtual 377	java/lang/String:length	()I
    //   599: ifle +559 -> 1158
    //   602: ldc_w 318
    //   605: astore_1
    //   606: aload 17
    //   608: aload_1
    //   609: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: ldc_w 395
    //   615: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: lload 14
    //   620: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   623: ldc_w 387
    //   626: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   632: astore_1
    //   633: aload_1
    //   634: astore 7
    //   636: iload 16
    //   638: iflt +55 -> 693
    //   641: new 97	java/lang/StringBuilder
    //   644: dup
    //   645: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   648: aload_1
    //   649: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   652: astore 7
    //   654: aload_1
    //   655: invokevirtual 377	java/lang/String:length	()I
    //   658: ifle +506 -> 1164
    //   661: ldc_w 318
    //   664: astore_1
    //   665: aload 7
    //   667: aload_1
    //   668: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: ldc_w 397
    //   674: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   677: iload 16
    //   679: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   682: ldc_w 387
    //   685: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   691: astore 7
    //   693: ldc -97
    //   695: astore_1
    //   696: iload_2
    //   697: tableswitch	default:+23->720, 1:+473->1170, 2:+498->1195
    //   720: iload_3
    //   721: tableswitch	default:+23->744, 1:+499->1220, 2:+523->1244
    //   744: aload_1
    //   745: ldc_w 399
    //   748: invokevirtual 403	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   751: ifeq +1425 -> 2176
    //   754: aload_1
    //   755: iconst_0
    //   756: aload_1
    //   757: invokevirtual 377	java/lang/String:length	()I
    //   760: iconst_3
    //   761: isub
    //   762: invokevirtual 406	java/lang/String:substring	(II)Ljava/lang/String;
    //   765: astore_1
    //   766: ldc_w 408
    //   769: iconst_1
    //   770: anewarray 4	java/lang/Object
    //   773: dup
    //   774: iconst_0
    //   775: aload 7
    //   777: aastore
    //   778: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   781: aconst_null
    //   782: astore 20
    //   784: aconst_null
    //   785: astore 17
    //   787: aconst_null
    //   788: astore 19
    //   790: new 337	java/util/ArrayList
    //   793: dup
    //   794: invokespecial 338	java/util/ArrayList:<init>	()V
    //   797: astore 21
    //   799: new 68	com/tencent/feedback/proguard/n
    //   802: dup
    //   803: aload_0
    //   804: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   807: astore 18
    //   809: aload 18
    //   811: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   814: astore_0
    //   815: lload 25
    //   817: lconst_0
    //   818: lcmp
    //   819: ifle +1091 -> 1910
    //   822: aload_1
    //   823: astore 17
    //   825: aload_1
    //   826: invokevirtual 377	java/lang/String:length	()I
    //   829: ifle +25 -> 854
    //   832: new 97	java/lang/StringBuilder
    //   835: dup
    //   836: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   839: aload_1
    //   840: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: ldc_w 399
    //   846: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   849: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   852: astore 17
    //   854: new 97	java/lang/StringBuilder
    //   857: dup
    //   858: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   861: aload 17
    //   863: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   866: ldc_w 410
    //   869: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   872: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   875: astore 20
    //   877: iload 6
    //   879: iflt +389 -> 1268
    //   882: new 97	java/lang/StringBuilder
    //   885: dup
    //   886: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   889: iload 6
    //   891: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   894: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   897: astore_1
    //   898: aload_0
    //   899: ldc -81
    //   901: iconst_2
    //   902: anewarray 163	java/lang/String
    //   905: dup
    //   906: iconst_0
    //   907: ldc_w 261
    //   910: aastore
    //   911: dup
    //   912: iconst_1
    //   913: ldc_w 284
    //   916: aastore
    //   917: aload 7
    //   919: aconst_null
    //   920: aconst_null
    //   921: aconst_null
    //   922: aload 20
    //   924: aload_1
    //   925: invokevirtual 335	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   928: astore 17
    //   930: aload 17
    //   932: astore 7
    //   934: aload 17
    //   936: astore_1
    //   937: aload 17
    //   939: ldc_w 261
    //   942: invokeinterface 207 2 0
    //   947: istore_2
    //   948: aload 17
    //   950: astore 7
    //   952: aload 17
    //   954: astore_1
    //   955: aload 17
    //   957: ldc_w 284
    //   960: invokeinterface 207 2 0
    //   965: istore_3
    //   966: aload 17
    //   968: astore 7
    //   970: aload 17
    //   972: astore_1
    //   973: new 412	java/util/LinkedHashMap
    //   976: dup
    //   977: invokespecial 413	java/util/LinkedHashMap:<init>	()V
    //   980: astore 19
    //   982: aload 17
    //   984: astore 7
    //   986: aload 17
    //   988: astore_1
    //   989: aload 17
    //   991: invokeinterface 201 1 0
    //   996: ifeq +277 -> 1273
    //   999: aload 17
    //   1001: astore 7
    //   1003: aload 17
    //   1005: astore_1
    //   1006: aload 19
    //   1008: aload 17
    //   1010: iload_2
    //   1011: invokeinterface 417 2 0
    //   1016: invokestatic 264	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1019: aload 17
    //   1021: iload_3
    //   1022: invokeinterface 417 2 0
    //   1027: invokestatic 264	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1030: invokevirtual 420	java/util/LinkedHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1033: pop
    //   1034: goto -52 -> 982
    //   1037: astore_1
    //   1038: aload_0
    //   1039: astore 17
    //   1041: aload 18
    //   1043: astore_0
    //   1044: aload_1
    //   1045: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1048: iconst_0
    //   1049: anewarray 4	java/lang/Object
    //   1052: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1055: aload 7
    //   1057: ifnull +20 -> 1077
    //   1060: aload 7
    //   1062: invokeinterface 216 1 0
    //   1067: ifne +10 -> 1077
    //   1070: aload 7
    //   1072: invokeinterface 217 1 0
    //   1077: aload 17
    //   1079: ifnull +16 -> 1095
    //   1082: aload 17
    //   1084: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   1087: ifeq +8 -> 1095
    //   1090: aload 17
    //   1092: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   1095: aload_0
    //   1096: ifnull +7 -> 1103
    //   1099: aload_0
    //   1100: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   1103: ldc_w 422
    //   1106: iconst_0
    //   1107: anewarray 4	java/lang/Object
    //   1110: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1113: aconst_null
    //   1114: areturn
    //   1115: ldc -97
    //   1117: astore 17
    //   1119: goto -913 -> 206
    //   1122: ldc -97
    //   1124: astore_1
    //   1125: goto -885 -> 240
    //   1128: ldc -97
    //   1130: astore_1
    //   1131: goto -832 -> 299
    //   1134: ldc -97
    //   1136: astore_1
    //   1137: goto -776 -> 361
    //   1140: ldc -97
    //   1142: astore_1
    //   1143: goto -723 -> 420
    //   1146: ldc -97
    //   1148: astore_1
    //   1149: goto -667 -> 482
    //   1152: ldc -97
    //   1154: astore_1
    //   1155: goto -612 -> 543
    //   1158: ldc -97
    //   1160: astore_1
    //   1161: goto -555 -> 606
    //   1164: ldc -97
    //   1166: astore_1
    //   1167: goto -502 -> 665
    //   1170: new 97	java/lang/StringBuilder
    //   1173: dup
    //   1174: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   1177: ldc -97
    //   1179: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1182: ldc_w 424
    //   1185: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1188: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1191: astore_1
    //   1192: goto -472 -> 720
    //   1195: new 97	java/lang/StringBuilder
    //   1198: dup
    //   1199: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   1202: ldc -97
    //   1204: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1207: ldc_w 426
    //   1210: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1213: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1216: astore_1
    //   1217: goto -497 -> 720
    //   1220: new 97	java/lang/StringBuilder
    //   1223: dup
    //   1224: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   1227: aload_1
    //   1228: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1231: ldc_w 428
    //   1234: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1237: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1240: astore_1
    //   1241: goto -497 -> 744
    //   1244: new 97	java/lang/StringBuilder
    //   1247: dup
    //   1248: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   1251: aload_1
    //   1252: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1255: ldc_w 430
    //   1258: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1261: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1264: astore_1
    //   1265: goto -521 -> 744
    //   1268: aconst_null
    //   1269: astore_1
    //   1270: goto -372 -> 898
    //   1273: aload 17
    //   1275: astore 7
    //   1277: aload 17
    //   1279: astore_1
    //   1280: aload 17
    //   1282: invokeinterface 217 1 0
    //   1287: aload 17
    //   1289: astore 7
    //   1291: aload 17
    //   1293: astore_1
    //   1294: aload 19
    //   1296: lload 25
    //   1298: invokestatic 435	com/tencent/feedback/proguard/a:a	(Ljava/util/LinkedHashMap;J)[Ljava/lang/Long;
    //   1301: astore 19
    //   1303: aload 19
    //   1305: ifnull +551 -> 1856
    //   1308: aload 17
    //   1310: astore 7
    //   1312: aload 17
    //   1314: astore_1
    //   1315: aload 19
    //   1317: arraylength
    //   1318: ifle +538 -> 1856
    //   1321: aload 17
    //   1323: astore 7
    //   1325: aload 17
    //   1327: astore_1
    //   1328: new 97	java/lang/StringBuilder
    //   1331: dup
    //   1332: ldc_w 437
    //   1335: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1338: aload 19
    //   1340: arraylength
    //   1341: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1344: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1347: iconst_0
    //   1348: anewarray 4	java/lang/Object
    //   1351: invokestatic 140	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1354: aload 17
    //   1356: astore 7
    //   1358: aload 17
    //   1360: astore_1
    //   1361: new 226	java/lang/StringBuffer
    //   1364: dup
    //   1365: invokespecial 227	java/lang/StringBuffer:<init>	()V
    //   1368: astore 22
    //   1370: iconst_0
    //   1371: istore_2
    //   1372: aload 17
    //   1374: astore 7
    //   1376: aload 17
    //   1378: astore_1
    //   1379: iload_2
    //   1380: aload 19
    //   1382: arraylength
    //   1383: if_icmpge +215 -> 1598
    //   1386: aload 17
    //   1388: astore 7
    //   1390: aload 17
    //   1392: astore_1
    //   1393: aload 19
    //   1395: iload_2
    //   1396: aaload
    //   1397: invokevirtual 233	java/lang/Long:longValue	()J
    //   1400: lstore 4
    //   1402: aload 17
    //   1404: astore 7
    //   1406: aload 17
    //   1408: astore_1
    //   1409: aload 22
    //   1411: new 97	java/lang/StringBuilder
    //   1414: dup
    //   1415: ldc -21
    //   1417: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1420: lload 4
    //   1422: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1425: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1428: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1431: pop
    //   1432: iload_2
    //   1433: ifle +737 -> 2170
    //   1436: iload_2
    //   1437: bipush 50
    //   1439: irem
    //   1440: ifne +730 -> 2170
    //   1443: aload 17
    //   1445: astore 7
    //   1447: aload 17
    //   1449: astore_1
    //   1450: new 97	java/lang/StringBuilder
    //   1453: dup
    //   1454: ldc -16
    //   1456: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1459: iload_2
    //   1460: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1463: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1466: iconst_0
    //   1467: anewarray 4	java/lang/Object
    //   1470: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1473: aload 17
    //   1475: astore 7
    //   1477: aload 17
    //   1479: astore_1
    //   1480: aload 22
    //   1482: iconst_4
    //   1483: invokevirtual 241	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   1486: astore 23
    //   1488: aload 17
    //   1490: astore 7
    //   1492: aload 17
    //   1494: astore_1
    //   1495: aload 22
    //   1497: iconst_0
    //   1498: invokevirtual 245	java/lang/StringBuffer:setLength	(I)V
    //   1501: aload 17
    //   1503: astore 7
    //   1505: aload 17
    //   1507: astore_1
    //   1508: aload_0
    //   1509: ldc -81
    //   1511: aconst_null
    //   1512: aload 23
    //   1514: aconst_null
    //   1515: aconst_null
    //   1516: aconst_null
    //   1517: aload 20
    //   1519: invokevirtual 196	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1522: astore 17
    //   1524: aload 17
    //   1526: astore_1
    //   1527: aload_1
    //   1528: invokestatic 440	com/tencent/feedback/proguard/l:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   1531: astore 7
    //   1533: aload 7
    //   1535: ifnull +47 -> 1582
    //   1538: aload 7
    //   1540: invokeinterface 363 1 0
    //   1545: ifle +37 -> 1582
    //   1548: aload 21
    //   1550: aload 7
    //   1552: invokeinterface 444 2 0
    //   1557: pop
    //   1558: new 97	java/lang/StringBuilder
    //   1561: dup
    //   1562: ldc_w 446
    //   1565: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1568: iconst_0
    //   1569: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1572: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1575: iconst_0
    //   1576: anewarray 4	java/lang/Object
    //   1579: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1582: aload_1
    //   1583: invokeinterface 217 1 0
    //   1588: iload_2
    //   1589: iconst_1
    //   1590: iadd
    //   1591: istore_2
    //   1592: aload_1
    //   1593: astore 17
    //   1595: goto -223 -> 1372
    //   1598: aload 17
    //   1600: astore 7
    //   1602: aload 17
    //   1604: astore 19
    //   1606: aload 17
    //   1608: astore_1
    //   1609: aload 22
    //   1611: invokevirtual 251	java/lang/StringBuffer:length	()I
    //   1614: ifle +150 -> 1764
    //   1617: aload 17
    //   1619: astore 7
    //   1621: aload 17
    //   1623: astore_1
    //   1624: aload 22
    //   1626: iconst_4
    //   1627: invokevirtual 241	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   1630: astore 19
    //   1632: aload 17
    //   1634: astore 7
    //   1636: aload 17
    //   1638: astore_1
    //   1639: aload 22
    //   1641: iconst_0
    //   1642: invokevirtual 245	java/lang/StringBuffer:setLength	(I)V
    //   1645: aload 17
    //   1647: astore 7
    //   1649: aload 17
    //   1651: astore_1
    //   1652: aload_0
    //   1653: ldc -81
    //   1655: aconst_null
    //   1656: aload 19
    //   1658: aconst_null
    //   1659: aconst_null
    //   1660: aconst_null
    //   1661: aload 20
    //   1663: invokevirtual 196	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1666: astore 17
    //   1668: aload 17
    //   1670: astore 7
    //   1672: aload 17
    //   1674: astore_1
    //   1675: aload 17
    //   1677: invokestatic 440	com/tencent/feedback/proguard/l:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   1680: astore 20
    //   1682: aload 17
    //   1684: astore 19
    //   1686: aload 20
    //   1688: ifnull +76 -> 1764
    //   1691: aload 17
    //   1693: astore 7
    //   1695: aload 17
    //   1697: astore 19
    //   1699: aload 17
    //   1701: astore_1
    //   1702: aload 20
    //   1704: invokeinterface 363 1 0
    //   1709: ifle +55 -> 1764
    //   1712: aload 17
    //   1714: astore 7
    //   1716: aload 17
    //   1718: astore_1
    //   1719: aload 21
    //   1721: aload 20
    //   1723: invokeinterface 444 2 0
    //   1728: pop
    //   1729: aload 17
    //   1731: astore 7
    //   1733: aload 17
    //   1735: astore_1
    //   1736: new 97	java/lang/StringBuilder
    //   1739: dup
    //   1740: ldc_w 446
    //   1743: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1746: iconst_0
    //   1747: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1750: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1753: iconst_0
    //   1754: anewarray 4	java/lang/Object
    //   1757: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1760: aload 17
    //   1762: astore 19
    //   1764: aload 19
    //   1766: astore 7
    //   1768: aload 19
    //   1770: astore_1
    //   1771: new 97	java/lang/StringBuilder
    //   1774: dup
    //   1775: ldc_w 448
    //   1778: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1781: aload 21
    //   1783: invokeinterface 363 1 0
    //   1788: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1791: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1794: iconst_0
    //   1795: anewarray 4	java/lang/Object
    //   1798: invokestatic 140	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1801: aload 19
    //   1803: ifnull +20 -> 1823
    //   1806: aload 19
    //   1808: invokeinterface 216 1 0
    //   1813: ifne +10 -> 1823
    //   1816: aload 19
    //   1818: invokeinterface 217 1 0
    //   1823: aload_0
    //   1824: ifnull +14 -> 1838
    //   1827: aload_0
    //   1828: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   1831: ifeq +7 -> 1838
    //   1834: aload_0
    //   1835: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   1838: aload 18
    //   1840: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   1843: ldc_w 422
    //   1846: iconst_0
    //   1847: anewarray 4	java/lang/Object
    //   1850: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1853: aload 21
    //   1855: areturn
    //   1856: aload 17
    //   1858: ifnull +20 -> 1878
    //   1861: aload 17
    //   1863: invokeinterface 216 1 0
    //   1868: ifne +10 -> 1878
    //   1871: aload 17
    //   1873: invokeinterface 217 1 0
    //   1878: aload_0
    //   1879: ifnull +14 -> 1893
    //   1882: aload_0
    //   1883: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   1886: ifeq +7 -> 1893
    //   1889: aload_0
    //   1890: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   1893: aload 18
    //   1895: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   1898: ldc_w 422
    //   1901: iconst_0
    //   1902: anewarray 4	java/lang/Object
    //   1905: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1908: aconst_null
    //   1909: areturn
    //   1910: aload_0
    //   1911: ldc -81
    //   1913: aconst_null
    //   1914: aload 7
    //   1916: aconst_null
    //   1917: aconst_null
    //   1918: aconst_null
    //   1919: aload_1
    //   1920: invokevirtual 196	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1923: astore 17
    //   1925: aload 17
    //   1927: astore 7
    //   1929: aload 17
    //   1931: astore_1
    //   1932: aload 17
    //   1934: invokestatic 440	com/tencent/feedback/proguard/l:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   1937: astore 19
    //   1939: aload 17
    //   1941: ifnull +20 -> 1961
    //   1944: aload 17
    //   1946: invokeinterface 216 1 0
    //   1951: ifne +10 -> 1961
    //   1954: aload 17
    //   1956: invokeinterface 217 1 0
    //   1961: aload_0
    //   1962: ifnull +14 -> 1976
    //   1965: aload_0
    //   1966: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   1969: ifeq +7 -> 1976
    //   1972: aload_0
    //   1973: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   1976: aload 18
    //   1978: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   1981: ldc_w 422
    //   1984: iconst_0
    //   1985: anewarray 4	java/lang/Object
    //   1988: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1991: aload 19
    //   1993: areturn
    //   1994: astore_0
    //   1995: aconst_null
    //   1996: astore 18
    //   1998: aconst_null
    //   1999: astore_1
    //   2000: aload_1
    //   2001: ifnull +18 -> 2019
    //   2004: aload_1
    //   2005: invokeinterface 216 1 0
    //   2010: ifne +9 -> 2019
    //   2013: aload_1
    //   2014: invokeinterface 217 1 0
    //   2019: aload 17
    //   2021: ifnull +16 -> 2037
    //   2024: aload 17
    //   2026: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   2029: ifeq +8 -> 2037
    //   2032: aload 17
    //   2034: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   2037: aload 18
    //   2039: ifnull +8 -> 2047
    //   2042: aload 18
    //   2044: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   2047: ldc_w 422
    //   2050: iconst_0
    //   2051: anewarray 4	java/lang/Object
    //   2054: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   2057: aload_0
    //   2058: athrow
    //   2059: astore_0
    //   2060: aconst_null
    //   2061: astore_1
    //   2062: goto -62 -> 2000
    //   2065: astore 7
    //   2067: aconst_null
    //   2068: astore_1
    //   2069: aload_0
    //   2070: astore 17
    //   2072: aload 7
    //   2074: astore_0
    //   2075: goto -75 -> 2000
    //   2078: astore 7
    //   2080: aload_0
    //   2081: astore 17
    //   2083: aload 7
    //   2085: astore_0
    //   2086: goto -86 -> 2000
    //   2089: astore 7
    //   2091: aload_0
    //   2092: astore 17
    //   2094: aload 7
    //   2096: astore_0
    //   2097: goto -97 -> 2000
    //   2100: astore_1
    //   2101: aload_0
    //   2102: astore 18
    //   2104: aload_1
    //   2105: astore_0
    //   2106: aload 7
    //   2108: astore_1
    //   2109: goto -109 -> 2000
    //   2112: astore_1
    //   2113: aconst_null
    //   2114: astore 7
    //   2116: aload 20
    //   2118: astore_0
    //   2119: aload 19
    //   2121: astore 17
    //   2123: goto -1079 -> 1044
    //   2126: astore_1
    //   2127: aload 18
    //   2129: astore_0
    //   2130: aconst_null
    //   2131: astore 7
    //   2133: aload 19
    //   2135: astore 17
    //   2137: goto -1093 -> 1044
    //   2140: astore_1
    //   2141: aconst_null
    //   2142: astore 7
    //   2144: aload_0
    //   2145: astore 17
    //   2147: aload 18
    //   2149: astore_0
    //   2150: goto -1106 -> 1044
    //   2153: astore 19
    //   2155: aload_1
    //   2156: astore 7
    //   2158: aload_0
    //   2159: astore 17
    //   2161: aload 19
    //   2163: astore_1
    //   2164: aload 18
    //   2166: astore_0
    //   2167: goto -1123 -> 1044
    //   2170: aload 17
    //   2172: astore_1
    //   2173: goto -585 -> 1588
    //   2176: goto -1410 -> 766
    //   2179: ldc -97
    //   2181: astore_1
    //   2182: goto -2008 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2185	0	paramContext	Context
    //   0	2185	1	paramArrayOfInt	int[]
    //   0	2185	2	paramInt1	int
    //   0	2185	3	paramInt2	int
    //   0	2185	4	paramLong1	long
    //   0	2185	6	paramInt3	int
    //   0	2185	7	paramString	String
    //   0	2185	8	paramInt4	int
    //   0	2185	9	paramInt5	int
    //   0	2185	10	paramInt6	int
    //   0	2185	11	paramInt7	int
    //   0	2185	12	paramLong2	long
    //   0	2185	14	paramLong3	long
    //   0	2185	16	paramInt8	int
    //   99	2072	17	localObject1	Object
    //   226	1939	18	localObject2	Object
    //   788	1346	19	localObject3	Object
    //   2153	9	19	localThrowable	Throwable
    //   782	1335	20	localObject4	Object
    //   797	1057	21	localArrayList	ArrayList
    //   1368	272	22	localStringBuffer	StringBuffer
    //   1486	27	23	str	String
    //   102	43	24	k	int
    //   74	1223	25	l	long
    // Exception table:
    //   from	to	target	type
    //   937	948	1037	java/lang/Throwable
    //   955	966	1037	java/lang/Throwable
    //   973	982	1037	java/lang/Throwable
    //   989	999	1037	java/lang/Throwable
    //   1006	1034	1037	java/lang/Throwable
    //   1280	1287	1037	java/lang/Throwable
    //   1294	1303	1037	java/lang/Throwable
    //   1315	1321	1037	java/lang/Throwable
    //   1328	1354	1037	java/lang/Throwable
    //   1361	1370	1037	java/lang/Throwable
    //   1379	1386	1037	java/lang/Throwable
    //   1393	1402	1037	java/lang/Throwable
    //   1409	1432	1037	java/lang/Throwable
    //   1450	1473	1037	java/lang/Throwable
    //   1480	1488	1037	java/lang/Throwable
    //   1495	1501	1037	java/lang/Throwable
    //   1508	1524	1037	java/lang/Throwable
    //   1609	1617	1037	java/lang/Throwable
    //   1624	1632	1037	java/lang/Throwable
    //   1639	1645	1037	java/lang/Throwable
    //   1652	1668	1037	java/lang/Throwable
    //   1675	1682	1037	java/lang/Throwable
    //   1702	1712	1037	java/lang/Throwable
    //   1719	1729	1037	java/lang/Throwable
    //   1736	1760	1037	java/lang/Throwable
    //   1771	1801	1037	java/lang/Throwable
    //   1932	1939	1037	java/lang/Throwable
    //   799	809	1994	finally
    //   809	815	2059	finally
    //   825	854	2065	finally
    //   854	877	2065	finally
    //   882	898	2065	finally
    //   898	930	2065	finally
    //   1910	1925	2065	finally
    //   937	948	2078	finally
    //   955	966	2078	finally
    //   973	982	2078	finally
    //   989	999	2078	finally
    //   1006	1034	2078	finally
    //   1280	1287	2078	finally
    //   1294	1303	2078	finally
    //   1315	1321	2078	finally
    //   1328	1354	2078	finally
    //   1361	1370	2078	finally
    //   1379	1386	2078	finally
    //   1393	1402	2078	finally
    //   1409	1432	2078	finally
    //   1450	1473	2078	finally
    //   1480	1488	2078	finally
    //   1495	1501	2078	finally
    //   1508	1524	2078	finally
    //   1609	1617	2078	finally
    //   1624	1632	2078	finally
    //   1639	1645	2078	finally
    //   1652	1668	2078	finally
    //   1675	1682	2078	finally
    //   1702	1712	2078	finally
    //   1719	1729	2078	finally
    //   1736	1760	2078	finally
    //   1771	1801	2078	finally
    //   1932	1939	2078	finally
    //   1527	1533	2089	finally
    //   1538	1582	2089	finally
    //   1582	1588	2089	finally
    //   1044	1055	2100	finally
    //   799	809	2112	java/lang/Throwable
    //   809	815	2126	java/lang/Throwable
    //   825	854	2140	java/lang/Throwable
    //   854	877	2140	java/lang/Throwable
    //   882	898	2140	java/lang/Throwable
    //   898	930	2140	java/lang/Throwable
    //   1910	1925	2140	java/lang/Throwable
    //   1527	1533	2153	java/lang/Throwable
    //   1538	1582	2153	java/lang/Throwable
    //   1582	1588	2153	java/lang/Throwable
  }
  
  protected static List<l> a(Cursor paramCursor)
  {
    e.b("rqdp{  in AnalyticsDAO.paserCursor() start}", new Object[0]);
    if (paramCursor == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int k = paramCursor.getColumnIndex("_id");
    int m = paramCursor.getColumnIndex("_prority");
    int n = paramCursor.getColumnIndex("_time");
    int i1 = paramCursor.getColumnIndex("_type");
    int i2 = paramCursor.getColumnIndex("_datas");
    int i3 = paramCursor.getColumnIndex("_length");
    int i4 = paramCursor.getColumnIndex("_key");
    int i5 = paramCursor.getColumnIndex("_count");
    int i6 = paramCursor.getColumnIndex("_upCounts");
    int i7 = paramCursor.getColumnIndex("_state");
    while (paramCursor.moveToNext())
    {
      l locall = new l();
      locall.a = paramCursor.getLong(k);
      locall.e = paramCursor.getBlob(i2);
      locall.c = paramCursor.getInt(m);
      locall.d = paramCursor.getLong(n);
      locall.b = paramCursor.getInt(i1);
      locall.f = paramCursor.getLong(i3);
      locall.g = paramCursor.getString(i4);
      locall.a(paramCursor.getInt(i5));
      locall.b(paramCursor.getInt(i6));
      locall.c(paramCursor.getInt(i7));
      localArrayList.add(locall);
    }
    e.b("rqdp{  in AnalyticsDAO.paserCursor() end}", new Object[0]);
    return localArrayList;
  }
  
  /* Error */
  public static boolean a(Context paramContext, List<l> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 472
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: ifnull +7 -> 20
    //   16: aload_1
    //   17: ifnonnull +15 -> 32
    //   20: ldc_w 474
    //   23: iconst_0
    //   24: anewarray 4	java/lang/Object
    //   27: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: iconst_0
    //   31: ireturn
    //   32: aload_1
    //   33: invokeinterface 363 1 0
    //   38: ifgt +15 -> 53
    //   41: ldc_w 476
    //   44: iconst_0
    //   45: anewarray 4	java/lang/Object
    //   48: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: iconst_1
    //   52: ireturn
    //   53: new 68	com/tencent/feedback/proguard/n
    //   56: dup
    //   57: aload_0
    //   58: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   61: astore_2
    //   62: aload_2
    //   63: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   66: astore_0
    //   67: aload_0
    //   68: astore_3
    //   69: iconst_0
    //   70: istore 4
    //   72: iload 4
    //   74: aload_1
    //   75: invokeinterface 363 1 0
    //   80: if_icmpge +93 -> 173
    //   83: aload_1
    //   84: iload 4
    //   86: invokeinterface 480 2 0
    //   91: checkcast 2	com/tencent/feedback/proguard/l
    //   94: astore_0
    //   95: aload_3
    //   96: ldc -81
    //   98: ldc_w 261
    //   101: aload_0
    //   102: invokestatic 482	com/tencent/feedback/proguard/l:a	(Lcom/tencent/feedback/proguard/l;)Landroid/content/ContentValues;
    //   105: invokevirtual 486	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   108: lstore 5
    //   110: lload 5
    //   112: lconst_0
    //   113: lcmp
    //   114: ifge +44 -> 158
    //   117: ldc_w 488
    //   120: iconst_0
    //   121: anewarray 4	java/lang/Object
    //   124: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_3
    //   128: ifnull +14 -> 142
    //   131: aload_3
    //   132: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   135: ifeq +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   142: aload_2
    //   143: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   146: ldc_w 490
    //   149: iconst_0
    //   150: anewarray 4	java/lang/Object
    //   153: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: iconst_0
    //   157: ireturn
    //   158: aload_0
    //   159: lload 5
    //   161: putfield 26	com/tencent/feedback/proguard/l:a	J
    //   164: iload 4
    //   166: iconst_1
    //   167: iadd
    //   168: istore 4
    //   170: goto -98 -> 72
    //   173: aload_3
    //   174: ifnull +14 -> 188
    //   177: aload_3
    //   178: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   181: ifeq +7 -> 188
    //   184: aload_3
    //   185: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   188: aload_2
    //   189: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   192: ldc_w 490
    //   195: iconst_0
    //   196: anewarray 4	java/lang/Object
    //   199: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: iconst_1
    //   203: ireturn
    //   204: astore_0
    //   205: aconst_null
    //   206: astore_0
    //   207: aload_3
    //   208: astore_1
    //   209: ldc_w 492
    //   212: iconst_0
    //   213: anewarray 4	java/lang/Object
    //   216: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: aload_1
    //   220: ifnull +14 -> 234
    //   223: aload_1
    //   224: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   227: ifeq +7 -> 234
    //   230: aload_1
    //   231: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   234: aload_0
    //   235: ifnull +7 -> 242
    //   238: aload_0
    //   239: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   242: ldc_w 490
    //   245: iconst_0
    //   246: anewarray 4	java/lang/Object
    //   249: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: iconst_0
    //   253: ireturn
    //   254: astore_0
    //   255: aconst_null
    //   256: astore_1
    //   257: aconst_null
    //   258: astore_2
    //   259: aload_1
    //   260: ifnull +14 -> 274
    //   263: aload_1
    //   264: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   267: ifeq +7 -> 274
    //   270: aload_1
    //   271: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   274: aload_2
    //   275: ifnull +7 -> 282
    //   278: aload_2
    //   279: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   282: ldc_w 490
    //   285: iconst_0
    //   286: anewarray 4	java/lang/Object
    //   289: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: aconst_null
    //   296: astore_1
    //   297: goto -38 -> 259
    //   300: astore_0
    //   301: aload_3
    //   302: astore_1
    //   303: goto -44 -> 259
    //   306: astore_3
    //   307: aload_0
    //   308: astore_2
    //   309: aload_3
    //   310: astore_0
    //   311: goto -52 -> 259
    //   314: astore_0
    //   315: aload_2
    //   316: astore_0
    //   317: aload_3
    //   318: astore_1
    //   319: goto -110 -> 209
    //   322: astore_0
    //   323: aload_3
    //   324: astore_1
    //   325: aload_2
    //   326: astore_0
    //   327: goto -118 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	330	0	paramContext	Context
    //   0	330	1	paramList	List<l>
    //   61	265	2	localObject1	Object
    //   1	301	3	localContext	Context
    //   306	18	3	localObject2	Object
    //   70	99	4	k	int
    //   108	52	5	l	long
    // Exception table:
    //   from	to	target	type
    //   53	62	204	java/lang/Throwable
    //   53	62	254	finally
    //   62	67	294	finally
    //   72	110	300	finally
    //   117	127	300	finally
    //   158	164	300	finally
    //   209	219	306	finally
    //   62	67	314	java/lang/Throwable
    //   72	110	322	java/lang/Throwable
    //   117	127	322	java/lang/Throwable
    //   158	164	322	java/lang/Throwable
  }
  
  protected static o b(Cursor paramCursor)
  {
    if ((paramCursor == null) || (paramCursor.isBeforeFirst()) || (paramCursor.isAfterLast())) {
      return null;
    }
    o localo = new o();
    try
    {
      localo.a(paramCursor.getString(paramCursor.getColumnIndex("_n")));
      localo.b(paramCursor.getString(paramCursor.getColumnIndex("_sa")));
      localo.a(paramCursor.getInt(paramCursor.getColumnIndex("_id")));
      localo.a(paramCursor.getInt(paramCursor.getColumnIndex("_t")));
      localo.c(paramCursor.getLong(paramCursor.getColumnIndex("_sz")));
      localo.b(paramCursor.getLong(paramCursor.getColumnIndex("_ut")));
      localo.c(paramCursor.getString(paramCursor.getColumnIndex("_ac")));
      return localo;
    }
    catch (Throwable paramCursor)
    {
      paramCursor.printStackTrace();
      e.d("rqdp{  Error:getFileBean fail!}", new Object[0]);
      e.g("rqdp{  Error: getFileBean fail!}", new Object[0]);
    }
    return null;
  }
  
  /* Error */
  public static boolean b(Context paramContext, List<l> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 5
    //   5: aconst_null
    //   6: astore_2
    //   7: aconst_null
    //   8: astore 6
    //   10: ldc_w 529
    //   13: iconst_0
    //   14: anewarray 4	java/lang/Object
    //   17: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: aload_0
    //   21: ifnull +16 -> 37
    //   24: aload_1
    //   25: ifnull +12 -> 37
    //   28: aload_1
    //   29: invokeinterface 363 1 0
    //   34: ifgt +15 -> 49
    //   37: ldc_w 531
    //   40: iconst_0
    //   41: anewarray 4	java/lang/Object
    //   44: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: iconst_0
    //   48: ireturn
    //   49: new 68	com/tencent/feedback/proguard/n
    //   52: dup
    //   53: aload_0
    //   54: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   57: astore 4
    //   59: aload 6
    //   61: astore_3
    //   62: aload_2
    //   63: astore_0
    //   64: aload 4
    //   66: astore_2
    //   67: aload 4
    //   69: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   72: astore 5
    //   74: aload 5
    //   76: astore_3
    //   77: aload 5
    //   79: astore_0
    //   80: aload 4
    //   82: astore_2
    //   83: aload_1
    //   84: invokeinterface 535 1 0
    //   89: astore_1
    //   90: aload 5
    //   92: astore_3
    //   93: aload 5
    //   95: astore_0
    //   96: aload 4
    //   98: astore_2
    //   99: aload_1
    //   100: invokeinterface 540 1 0
    //   105: ifeq +267 -> 372
    //   108: aload 5
    //   110: astore_3
    //   111: aload 5
    //   113: astore_0
    //   114: aload 4
    //   116: astore_2
    //   117: aload_1
    //   118: invokeinterface 544 1 0
    //   123: checkcast 2	com/tencent/feedback/proguard/l
    //   126: astore 6
    //   128: aload 5
    //   130: astore_3
    //   131: aload 5
    //   133: astore_0
    //   134: aload 4
    //   136: astore_2
    //   137: aload 6
    //   139: invokestatic 482	com/tencent/feedback/proguard/l:a	(Lcom/tencent/feedback/proguard/l;)Landroid/content/ContentValues;
    //   142: astore 7
    //   144: aload 7
    //   146: ifnonnull +38 -> 184
    //   149: aload 5
    //   151: ifnull +16 -> 167
    //   154: aload 5
    //   156: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   159: ifeq +8 -> 167
    //   162: aload 5
    //   164: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   167: aload 4
    //   169: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   172: ldc_w 546
    //   175: iconst_0
    //   176: anewarray 4	java/lang/Object
    //   179: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: iconst_0
    //   183: ireturn
    //   184: aload 5
    //   186: astore_3
    //   187: aload 5
    //   189: astore_0
    //   190: aload 4
    //   192: astore_2
    //   193: aload 5
    //   195: ldc -81
    //   197: ldc_w 261
    //   200: aload 7
    //   202: invokevirtual 549	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   205: lstore 8
    //   207: lload 8
    //   209: lconst_0
    //   210: lcmp
    //   211: ifge +57 -> 268
    //   214: aload 5
    //   216: astore_3
    //   217: aload 5
    //   219: astore_0
    //   220: aload 4
    //   222: astore_2
    //   223: ldc_w 551
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload 5
    //   235: ifnull +16 -> 251
    //   238: aload 5
    //   240: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   243: ifeq +8 -> 251
    //   246: aload 5
    //   248: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   251: aload 4
    //   253: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   256: ldc_w 546
    //   259: iconst_0
    //   260: anewarray 4	java/lang/Object
    //   263: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: iconst_0
    //   267: ireturn
    //   268: aload 5
    //   270: astore_3
    //   271: aload 5
    //   273: astore_0
    //   274: aload 4
    //   276: astore_2
    //   277: new 97	java/lang/StringBuilder
    //   280: dup
    //   281: ldc_w 553
    //   284: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   287: lload 8
    //   289: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   292: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   295: iconst_0
    //   296: anewarray 4	java/lang/Object
    //   299: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: aload 5
    //   304: astore_3
    //   305: aload 5
    //   307: astore_0
    //   308: aload 4
    //   310: astore_2
    //   311: aload 6
    //   313: lload 8
    //   315: putfield 26	com/tencent/feedback/proguard/l:a	J
    //   318: goto -228 -> 90
    //   321: astore_0
    //   322: aload 4
    //   324: astore_1
    //   325: aload_0
    //   326: astore 4
    //   328: aload_3
    //   329: astore_0
    //   330: aload_1
    //   331: astore_2
    //   332: aload 4
    //   334: invokevirtual 130	java/lang/Throwable:printStackTrace	()V
    //   337: aload_3
    //   338: ifnull +14 -> 352
    //   341: aload_3
    //   342: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   345: ifeq +7 -> 352
    //   348: aload_3
    //   349: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   352: aload_1
    //   353: ifnull +7 -> 360
    //   356: aload_1
    //   357: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   360: ldc_w 546
    //   363: iconst_0
    //   364: anewarray 4	java/lang/Object
    //   367: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: iconst_0
    //   371: ireturn
    //   372: aload 5
    //   374: ifnull +16 -> 390
    //   377: aload 5
    //   379: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   382: ifeq +8 -> 390
    //   385: aload 5
    //   387: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   390: aload 4
    //   392: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   395: ldc_w 546
    //   398: iconst_0
    //   399: anewarray 4	java/lang/Object
    //   402: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: iconst_1
    //   406: ireturn
    //   407: astore_1
    //   408: aconst_null
    //   409: astore_2
    //   410: aload 5
    //   412: astore_0
    //   413: aload_0
    //   414: ifnull +14 -> 428
    //   417: aload_0
    //   418: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   421: ifeq +7 -> 428
    //   424: aload_0
    //   425: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   428: aload_2
    //   429: ifnull +7 -> 436
    //   432: aload_2
    //   433: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   436: ldc_w 546
    //   439: iconst_0
    //   440: anewarray 4	java/lang/Object
    //   443: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: aload_1
    //   447: athrow
    //   448: astore_1
    //   449: goto -36 -> 413
    //   452: astore 4
    //   454: aconst_null
    //   455: astore_1
    //   456: goto -128 -> 328
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	459	0	paramContext	Context
    //   0	459	1	paramList	List<l>
    //   6	427	2	localObject1	Object
    //   1	348	3	localObject2	Object
    //   57	334	4	localObject3	Object
    //   452	1	4	localThrowable	Throwable
    //   3	408	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   8	304	6	locall	l
    //   142	59	7	localContentValues	ContentValues
    //   205	109	8	l	long
    // Exception table:
    //   from	to	target	type
    //   67	74	321	java/lang/Throwable
    //   83	90	321	java/lang/Throwable
    //   99	108	321	java/lang/Throwable
    //   117	128	321	java/lang/Throwable
    //   137	144	321	java/lang/Throwable
    //   193	207	321	java/lang/Throwable
    //   223	233	321	java/lang/Throwable
    //   277	302	321	java/lang/Throwable
    //   311	318	321	java/lang/Throwable
    //   49	59	407	finally
    //   67	74	448	finally
    //   83	90	448	finally
    //   99	108	448	finally
    //   117	128	448	finally
    //   137	144	448	finally
    //   193	207	448	finally
    //   223	233	448	finally
    //   277	302	448	finally
    //   311	318	448	finally
    //   332	337	448	finally
    //   49	59	452	java/lang/Throwable
  }
  
  /* Error */
  public static int c(Context paramContext, List<o> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +16 -> 17
    //   4: aload_1
    //   5: ifnull +12 -> 17
    //   8: aload_1
    //   9: invokeinterface 363 1 0
    //   14: ifne +50 -> 64
    //   17: aload_1
    //   18: ifnonnull +23 -> 41
    //   21: ldc_w 556
    //   24: astore_0
    //   25: ldc_w 558
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_0
    //   35: aastore
    //   36: invokestatic 56	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: iconst_m1
    //   40: ireturn
    //   41: new 97	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   48: aload_1
    //   49: invokeinterface 363 1 0
    //   54: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   57: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore_0
    //   61: goto -36 -> 25
    //   64: ldc_w 560
    //   67: iconst_1
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload_1
    //   74: invokeinterface 363 1 0
    //   79: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aastore
    //   83: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: aconst_null
    //   87: astore_3
    //   88: aconst_null
    //   89: astore 5
    //   91: aconst_null
    //   92: astore_2
    //   93: aconst_null
    //   94: astore 6
    //   96: iconst_0
    //   97: istore 11
    //   99: iconst_0
    //   100: istore 10
    //   102: iconst_0
    //   103: istore 8
    //   105: iconst_0
    //   106: istore 12
    //   108: iconst_0
    //   109: istore 9
    //   111: new 68	com/tencent/feedback/proguard/n
    //   114: dup
    //   115: aload_0
    //   116: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   119: astore 4
    //   121: iload 11
    //   123: istore 10
    //   125: aload 6
    //   127: astore_3
    //   128: iload 12
    //   130: istore 8
    //   132: aload_2
    //   133: astore_0
    //   134: aload 4
    //   136: astore_2
    //   137: aload 4
    //   139: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   142: astore 5
    //   144: aload 5
    //   146: ifnonnull +99 -> 245
    //   149: iload 11
    //   151: istore 10
    //   153: aload 5
    //   155: astore_3
    //   156: iload 12
    //   158: istore 8
    //   160: aload 5
    //   162: astore_0
    //   163: aload 4
    //   165: astore_2
    //   166: ldc_w 310
    //   169: iconst_0
    //   170: anewarray 4	java/lang/Object
    //   173: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: iload 11
    //   178: istore 10
    //   180: aload 5
    //   182: astore_3
    //   183: iload 12
    //   185: istore 8
    //   187: aload 5
    //   189: astore_0
    //   190: aload 4
    //   192: astore_2
    //   193: ldc_w 562
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload 5
    //   205: ifnull +16 -> 221
    //   208: aload 5
    //   210: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   213: ifeq +8 -> 221
    //   216: aload 5
    //   218: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   221: aload 4
    //   223: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   226: ldc_w 564
    //   229: iconst_1
    //   230: anewarray 4	java/lang/Object
    //   233: dup
    //   234: iconst_0
    //   235: iconst_0
    //   236: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   239: aastore
    //   240: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: iconst_m1
    //   244: ireturn
    //   245: iload 11
    //   247: istore 10
    //   249: aload 5
    //   251: astore_3
    //   252: iload 12
    //   254: istore 8
    //   256: aload 5
    //   258: astore_0
    //   259: aload 4
    //   261: astore_2
    //   262: aload_1
    //   263: invokeinterface 535 1 0
    //   268: astore 6
    //   270: iload 9
    //   272: istore 10
    //   274: aload 5
    //   276: astore_3
    //   277: iload 9
    //   279: istore 8
    //   281: aload 5
    //   283: astore_0
    //   284: aload 4
    //   286: astore_2
    //   287: aload 6
    //   289: invokeinterface 540 1 0
    //   294: ifeq +527 -> 821
    //   297: iload 9
    //   299: istore 10
    //   301: aload 5
    //   303: astore_3
    //   304: iload 9
    //   306: istore 8
    //   308: aload 5
    //   310: astore_0
    //   311: aload 4
    //   313: astore_2
    //   314: aload 6
    //   316: invokeinterface 544 1 0
    //   321: checkcast 345	com/tencent/feedback/proguard/o
    //   324: astore 7
    //   326: aload 7
    //   328: ifnonnull +163 -> 491
    //   331: aconst_null
    //   332: astore_1
    //   333: iload 9
    //   335: istore 8
    //   337: aload_1
    //   338: ifnull +587 -> 925
    //   341: iload 9
    //   343: istore 10
    //   345: aload 5
    //   347: astore_3
    //   348: iload 9
    //   350: istore 8
    //   352: aload 5
    //   354: astore_0
    //   355: aload 4
    //   357: astore_2
    //   358: aload 5
    //   360: ldc 112
    //   362: ldc_w 261
    //   365: aload_1
    //   366: invokevirtual 486	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   369: lstore 13
    //   371: iload 9
    //   373: istore 10
    //   375: aload 5
    //   377: astore_3
    //   378: iload 9
    //   380: istore 8
    //   382: aload 5
    //   384: astore_0
    //   385: aload 4
    //   387: astore_2
    //   388: aload 7
    //   390: lload 13
    //   392: invokevirtual 509	com/tencent/feedback/proguard/o:a	(J)V
    //   395: lload 13
    //   397: lconst_0
    //   398: lcmp
    //   399: iflt +410 -> 809
    //   402: iconst_1
    //   403: istore 8
    //   405: iload 9
    //   407: iload 8
    //   409: iadd
    //   410: istore 9
    //   412: iload 9
    //   414: istore 10
    //   416: aload 5
    //   418: astore_3
    //   419: iload 9
    //   421: istore 8
    //   423: aload 5
    //   425: astore_0
    //   426: aload 4
    //   428: astore_2
    //   429: aload 7
    //   431: invokevirtual 347	com/tencent/feedback/proguard/o:a	()Ljava/lang/String;
    //   434: astore_1
    //   435: lload 13
    //   437: lconst_0
    //   438: lcmp
    //   439: iflt +376 -> 815
    //   442: iconst_1
    //   443: istore 15
    //   445: iload 9
    //   447: istore 10
    //   449: aload 5
    //   451: astore_3
    //   452: iload 9
    //   454: istore 8
    //   456: aload 5
    //   458: astore_0
    //   459: aload 4
    //   461: astore_2
    //   462: ldc_w 566
    //   465: iconst_2
    //   466: anewarray 4	java/lang/Object
    //   469: dup
    //   470: iconst_0
    //   471: aload_1
    //   472: aastore
    //   473: dup
    //   474: iconst_1
    //   475: iload 15
    //   477: invokestatic 571	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   480: aastore
    //   481: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   484: iload 9
    //   486: istore 8
    //   488: goto +437 -> 925
    //   491: iload 9
    //   493: istore 10
    //   495: aload 5
    //   497: astore_3
    //   498: iload 9
    //   500: istore 8
    //   502: aload 5
    //   504: astore_0
    //   505: aload 4
    //   507: astore_2
    //   508: new 258	android/content/ContentValues
    //   511: dup
    //   512: invokespecial 259	android/content/ContentValues:<init>	()V
    //   515: astore_1
    //   516: iload 9
    //   518: istore 10
    //   520: aload 5
    //   522: astore_3
    //   523: iload 9
    //   525: istore 8
    //   527: aload 5
    //   529: astore_0
    //   530: aload 4
    //   532: astore_2
    //   533: aload_1
    //   534: ldc_w 320
    //   537: aload 7
    //   539: invokevirtual 347	com/tencent/feedback/proguard/o:a	()Ljava/lang/String;
    //   542: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: iload 9
    //   547: istore 10
    //   549: aload 5
    //   551: astore_3
    //   552: iload 9
    //   554: istore 8
    //   556: aload 5
    //   558: astore_0
    //   559: aload 4
    //   561: astore_2
    //   562: aload_1
    //   563: ldc_w 504
    //   566: aload 7
    //   568: invokevirtual 349	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   571: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   574: iload 9
    //   576: istore 10
    //   578: aload 5
    //   580: astore_3
    //   581: iload 9
    //   583: istore 8
    //   585: aload 5
    //   587: astore_0
    //   588: aload 4
    //   590: astore_2
    //   591: aload_1
    //   592: ldc_w 513
    //   595: aload 7
    //   597: invokevirtual 573	com/tencent/feedback/proguard/o:c	()J
    //   600: invokestatic 264	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   603: invokevirtual 268	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   606: iload 9
    //   608: istore 10
    //   610: aload 5
    //   612: astore_3
    //   613: iload 9
    //   615: istore 8
    //   617: aload 5
    //   619: astore_0
    //   620: aload 4
    //   622: astore_2
    //   623: aload_1
    //   624: ldc_w 517
    //   627: aload 7
    //   629: invokevirtual 575	com/tencent/feedback/proguard/o:b	()J
    //   632: invokestatic 264	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   635: invokevirtual 268	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   638: iload 9
    //   640: istore 10
    //   642: aload 5
    //   644: astore_3
    //   645: iload 9
    //   647: istore 8
    //   649: aload 5
    //   651: astore_0
    //   652: aload 4
    //   654: astore_2
    //   655: aload_1
    //   656: ldc_w 326
    //   659: aload 7
    //   661: invokevirtual 350	com/tencent/feedback/proguard/o:e	()I
    //   664: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   667: invokevirtual 273	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   670: iload 9
    //   672: istore 10
    //   674: aload 5
    //   676: astore_3
    //   677: iload 9
    //   679: istore 8
    //   681: aload 5
    //   683: astore_0
    //   684: aload 4
    //   686: astore_2
    //   687: aload_1
    //   688: ldc_w 521
    //   691: aload 7
    //   693: invokevirtual 352	com/tencent/feedback/proguard/o:f	()Ljava/lang/String;
    //   696: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   699: goto -366 -> 333
    //   702: astore_0
    //   703: aload 4
    //   705: astore_1
    //   706: aload_0
    //   707: astore 4
    //   709: iload 10
    //   711: istore 8
    //   713: aload_3
    //   714: astore_0
    //   715: aload_1
    //   716: astore_2
    //   717: ldc 122
    //   719: iconst_0
    //   720: anewarray 4	java/lang/Object
    //   723: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   726: iload 10
    //   728: istore 8
    //   730: aload_3
    //   731: astore_0
    //   732: aload_1
    //   733: astore_2
    //   734: ldc_w 577
    //   737: iconst_1
    //   738: anewarray 4	java/lang/Object
    //   741: dup
    //   742: iconst_0
    //   743: aload 4
    //   745: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   748: aastore
    //   749: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   752: iload 10
    //   754: istore 8
    //   756: aload_3
    //   757: astore_0
    //   758: aload_1
    //   759: astore_2
    //   760: aload 4
    //   762: invokevirtual 130	java/lang/Throwable:printStackTrace	()V
    //   765: aload_3
    //   766: ifnull +14 -> 780
    //   769: aload_3
    //   770: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   773: ifeq +7 -> 780
    //   776: aload_3
    //   777: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   780: aload_1
    //   781: ifnull +7 -> 788
    //   784: aload_1
    //   785: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   788: ldc_w 564
    //   791: iconst_1
    //   792: anewarray 4	java/lang/Object
    //   795: dup
    //   796: iconst_0
    //   797: iload 10
    //   799: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   802: aastore
    //   803: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   806: iload 10
    //   808: ireturn
    //   809: iconst_0
    //   810: istore 8
    //   812: goto -407 -> 405
    //   815: iconst_0
    //   816: istore 15
    //   818: goto -373 -> 445
    //   821: aload 5
    //   823: ifnull +16 -> 839
    //   826: aload 5
    //   828: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   831: ifeq +8 -> 839
    //   834: aload 5
    //   836: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   839: aload 4
    //   841: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   844: ldc_w 564
    //   847: iconst_1
    //   848: anewarray 4	java/lang/Object
    //   851: dup
    //   852: iconst_0
    //   853: iload 9
    //   855: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   858: aastore
    //   859: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   862: iload 9
    //   864: ireturn
    //   865: astore_1
    //   866: aconst_null
    //   867: astore_2
    //   868: aload 5
    //   870: astore_0
    //   871: aload_0
    //   872: ifnull +14 -> 886
    //   875: aload_0
    //   876: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   879: ifeq +7 -> 886
    //   882: aload_0
    //   883: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   886: aload_2
    //   887: ifnull +7 -> 894
    //   890: aload_2
    //   891: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   894: ldc_w 564
    //   897: iconst_1
    //   898: anewarray 4	java/lang/Object
    //   901: dup
    //   902: iconst_0
    //   903: iload 8
    //   905: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   908: aastore
    //   909: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   912: aload_1
    //   913: athrow
    //   914: astore_1
    //   915: goto -44 -> 871
    //   918: astore 4
    //   920: aconst_null
    //   921: astore_1
    //   922: goto -213 -> 709
    //   925: iload 8
    //   927: istore 9
    //   929: goto -659 -> 270
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	932	0	paramContext	Context
    //   0	932	1	paramList	List<o>
    //   92	799	2	localObject1	Object
    //   87	690	3	localObject2	Object
    //   119	721	4	localObject3	Object
    //   918	1	4	localThrowable	Throwable
    //   89	780	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   94	221	6	localIterator	java.util.Iterator
    //   324	368	7	localo	o
    //   103	823	8	k	int
    //   109	819	9	m	int
    //   100	707	10	n	int
    //   97	149	11	i1	int
    //   106	147	12	i2	int
    //   369	67	13	l	long
    //   443	374	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   137	144	702	java/lang/Throwable
    //   166	176	702	java/lang/Throwable
    //   193	203	702	java/lang/Throwable
    //   262	270	702	java/lang/Throwable
    //   287	297	702	java/lang/Throwable
    //   314	326	702	java/lang/Throwable
    //   358	371	702	java/lang/Throwable
    //   388	395	702	java/lang/Throwable
    //   429	435	702	java/lang/Throwable
    //   462	484	702	java/lang/Throwable
    //   508	516	702	java/lang/Throwable
    //   533	545	702	java/lang/Throwable
    //   562	574	702	java/lang/Throwable
    //   591	606	702	java/lang/Throwable
    //   623	638	702	java/lang/Throwable
    //   655	670	702	java/lang/Throwable
    //   687	699	702	java/lang/Throwable
    //   111	121	865	finally
    //   137	144	914	finally
    //   166	176	914	finally
    //   193	203	914	finally
    //   262	270	914	finally
    //   287	297	914	finally
    //   314	326	914	finally
    //   358	371	914	finally
    //   388	395	914	finally
    //   429	435	914	finally
    //   462	484	914	finally
    //   508	516	914	finally
    //   533	545	914	finally
    //   562	574	914	finally
    //   591	606	914	finally
    //   623	638	914	finally
    //   655	670	914	finally
    //   687	699	914	finally
    //   717	726	914	finally
    //   734	752	914	finally
    //   760	765	914	finally
    //   111	121	918	java/lang/Throwable
  }
  
  /* Error */
  public static int d(Context paramContext, List<o> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 6
    //   11: aload_0
    //   12: ifnull +16 -> 28
    //   15: aload_1
    //   16: ifnull +12 -> 28
    //   19: aload_1
    //   20: invokeinterface 363 1 0
    //   25: ifne +50 -> 75
    //   28: aload_1
    //   29: ifnonnull +23 -> 52
    //   32: ldc_w 556
    //   35: astore_0
    //   36: ldc_w 580
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: aload_0
    //   46: aastore
    //   47: invokestatic 56	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: iconst_m1
    //   51: ireturn
    //   52: new 97	java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial 153	java/lang/StringBuilder:<init>	()V
    //   59: aload_1
    //   60: invokeinterface 363 1 0
    //   65: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   68: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore_0
    //   72: goto -36 -> 36
    //   75: ldc_w 582
    //   78: iconst_1
    //   79: anewarray 4	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload_1
    //   85: invokeinterface 363 1 0
    //   90: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: aastore
    //   94: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: new 68	com/tencent/feedback/proguard/n
    //   100: dup
    //   101: aload_0
    //   102: invokespecial 71	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   105: astore_2
    //   106: aload 6
    //   108: astore_3
    //   109: aload 5
    //   111: astore 4
    //   113: aload_2
    //   114: invokevirtual 75	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   117: astore_0
    //   118: aload_0
    //   119: ifnonnull +70 -> 189
    //   122: aload_0
    //   123: astore_3
    //   124: aload_0
    //   125: astore 4
    //   127: ldc 77
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_0
    //   137: astore_3
    //   138: aload_0
    //   139: astore 4
    //   141: ldc_w 584
    //   144: iconst_0
    //   145: anewarray 4	java/lang/Object
    //   148: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: ifnull +14 -> 166
    //   155: aload_0
    //   156: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   159: ifeq +7 -> 166
    //   162: aload_0
    //   163: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   166: aload_2
    //   167: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   170: ldc_w 586
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: iconst_0
    //   180: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   183: aastore
    //   184: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: iconst_m1
    //   188: ireturn
    //   189: aload_0
    //   190: astore_3
    //   191: aload_0
    //   192: astore 4
    //   194: new 226	java/lang/StringBuffer
    //   197: dup
    //   198: invokespecial 227	java/lang/StringBuffer:<init>	()V
    //   201: astore 5
    //   203: aload_0
    //   204: astore_3
    //   205: aload_0
    //   206: astore 4
    //   208: aload_1
    //   209: invokeinterface 535 1 0
    //   214: astore_1
    //   215: aload_0
    //   216: astore_3
    //   217: aload_0
    //   218: astore 4
    //   220: aload_1
    //   221: invokeinterface 540 1 0
    //   226: ifeq +260 -> 486
    //   229: aload_0
    //   230: astore_3
    //   231: aload_0
    //   232: astore 4
    //   234: aload_1
    //   235: invokeinterface 544 1 0
    //   240: checkcast 345	com/tencent/feedback/proguard/o
    //   243: astore 6
    //   245: aload_0
    //   246: astore_3
    //   247: aload_0
    //   248: astore 4
    //   250: aload 5
    //   252: ldc_w 588
    //   255: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   258: pop
    //   259: aload_0
    //   260: astore_3
    //   261: aload_0
    //   262: astore 4
    //   264: aload 5
    //   266: ldc_w 320
    //   269: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   272: pop
    //   273: aload_0
    //   274: astore_3
    //   275: aload_0
    //   276: astore 4
    //   278: aload 5
    //   280: ldc_w 322
    //   283: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   286: pop
    //   287: aload_0
    //   288: astore_3
    //   289: aload_0
    //   290: astore 4
    //   292: aload 5
    //   294: aload 6
    //   296: invokevirtual 347	com/tencent/feedback/proguard/o:a	()Ljava/lang/String;
    //   299: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   302: pop
    //   303: aload_0
    //   304: astore_3
    //   305: aload_0
    //   306: astore 4
    //   308: aload 5
    //   310: ldc_w 590
    //   313: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   316: pop
    //   317: aload_0
    //   318: astore_3
    //   319: aload_0
    //   320: astore 4
    //   322: aload 5
    //   324: ldc_w 326
    //   327: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   330: pop
    //   331: aload_0
    //   332: astore_3
    //   333: aload_0
    //   334: astore 4
    //   336: aload 5
    //   338: ldc_w 328
    //   341: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   344: pop
    //   345: aload_0
    //   346: astore_3
    //   347: aload_0
    //   348: astore 4
    //   350: aload 5
    //   352: aload 6
    //   354: invokevirtual 350	com/tencent/feedback/proguard/o:e	()I
    //   357: invokevirtual 331	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   360: pop
    //   361: aload_0
    //   362: astore_3
    //   363: aload_0
    //   364: astore 4
    //   366: aload 5
    //   368: ldc_w 381
    //   371: invokevirtual 238	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   374: pop
    //   375: goto -160 -> 215
    //   378: astore 4
    //   380: iconst_0
    //   381: istore 7
    //   383: aload_3
    //   384: astore_0
    //   385: iload 7
    //   387: istore 8
    //   389: aload_0
    //   390: astore_3
    //   391: aload_2
    //   392: astore_1
    //   393: aload 4
    //   395: invokevirtual 130	java/lang/Throwable:printStackTrace	()V
    //   398: iload 7
    //   400: istore 8
    //   402: aload_0
    //   403: astore_3
    //   404: aload_2
    //   405: astore_1
    //   406: ldc_w 592
    //   409: iconst_0
    //   410: anewarray 4	java/lang/Object
    //   413: invokestatic 79	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: iload 7
    //   418: istore 8
    //   420: aload_0
    //   421: astore_3
    //   422: aload_2
    //   423: astore_1
    //   424: ldc_w 594
    //   427: iconst_1
    //   428: anewarray 4	java/lang/Object
    //   431: dup
    //   432: iconst_0
    //   433: aload 4
    //   435: invokevirtual 127	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: aload_0
    //   443: ifnull +14 -> 457
    //   446: aload_0
    //   447: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   450: ifeq +7 -> 457
    //   453: aload_0
    //   454: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   457: aload_2
    //   458: ifnull +7 -> 465
    //   461: aload_2
    //   462: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   465: ldc_w 586
    //   468: iconst_1
    //   469: anewarray 4	java/lang/Object
    //   472: dup
    //   473: iconst_0
    //   474: iload 7
    //   476: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   479: aastore
    //   480: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   483: iload 7
    //   485: ireturn
    //   486: aload_0
    //   487: astore_3
    //   488: aload_0
    //   489: astore 4
    //   491: aload 5
    //   493: iconst_2
    //   494: invokevirtual 241	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   497: astore 5
    //   499: aload_0
    //   500: astore_3
    //   501: aload_0
    //   502: astore 4
    //   504: aload_0
    //   505: ldc 112
    //   507: aload 5
    //   509: aconst_null
    //   510: invokevirtual 116	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   513: istore 7
    //   515: iload 7
    //   517: istore 8
    //   519: aload_0
    //   520: astore_3
    //   521: aload_2
    //   522: astore_1
    //   523: ldc_w 596
    //   526: iconst_2
    //   527: anewarray 4	java/lang/Object
    //   530: dup
    //   531: iconst_0
    //   532: iload 7
    //   534: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   537: aastore
    //   538: dup
    //   539: iconst_1
    //   540: aload 5
    //   542: aastore
    //   543: invokestatic 83	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   546: aload_0
    //   547: ifnull +14 -> 561
    //   550: aload_0
    //   551: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   554: ifeq +7 -> 561
    //   557: aload_0
    //   558: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   561: aload_2
    //   562: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   565: ldc_w 586
    //   568: iconst_1
    //   569: anewarray 4	java/lang/Object
    //   572: dup
    //   573: iconst_0
    //   574: iload 7
    //   576: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   579: aastore
    //   580: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   583: iload 7
    //   585: ireturn
    //   586: astore_0
    //   587: iconst_0
    //   588: istore 7
    //   590: aconst_null
    //   591: astore_1
    //   592: aload 4
    //   594: astore_3
    //   595: aload_3
    //   596: ifnull +14 -> 610
    //   599: aload_3
    //   600: invokevirtual 89	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   603: ifeq +7 -> 610
    //   606: aload_3
    //   607: invokevirtual 92	android/database/sqlite/SQLiteDatabase:close	()V
    //   610: aload_1
    //   611: ifnull +7 -> 618
    //   614: aload_1
    //   615: invokevirtual 93	com/tencent/feedback/proguard/n:close	()V
    //   618: ldc_w 586
    //   621: iconst_1
    //   622: anewarray 4	java/lang/Object
    //   625: dup
    //   626: iconst_0
    //   627: iload 7
    //   629: invokestatic 64	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   632: aastore
    //   633: invokestatic 66	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   636: aload_0
    //   637: athrow
    //   638: astore_0
    //   639: iconst_0
    //   640: istore 7
    //   642: aload 4
    //   644: astore_3
    //   645: aload_2
    //   646: astore_1
    //   647: goto -52 -> 595
    //   650: astore_0
    //   651: iload 8
    //   653: istore 7
    //   655: goto -60 -> 595
    //   658: astore 4
    //   660: aconst_null
    //   661: astore_2
    //   662: iconst_0
    //   663: istore 7
    //   665: aload_3
    //   666: astore_0
    //   667: goto -282 -> 385
    //   670: astore 4
    //   672: goto -287 -> 385
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	675	0	paramContext	Context
    //   0	675	1	paramList	List<o>
    //   105	557	2	localn	n
    //   1	665	3	localObject1	Object
    //   3	362	4	localObject2	Object
    //   378	56	4	localThrowable1	Throwable
    //   489	154	4	localContext	Context
    //   658	1	4	localThrowable2	Throwable
    //   670	1	4	localThrowable3	Throwable
    //   6	535	5	localObject3	Object
    //   9	344	6	localo	o
    //   381	283	7	k	int
    //   387	265	8	m	int
    // Exception table:
    //   from	to	target	type
    //   113	118	378	java/lang/Throwable
    //   127	136	378	java/lang/Throwable
    //   141	151	378	java/lang/Throwable
    //   194	203	378	java/lang/Throwable
    //   208	215	378	java/lang/Throwable
    //   220	229	378	java/lang/Throwable
    //   234	245	378	java/lang/Throwable
    //   250	259	378	java/lang/Throwable
    //   264	273	378	java/lang/Throwable
    //   278	287	378	java/lang/Throwable
    //   292	303	378	java/lang/Throwable
    //   308	317	378	java/lang/Throwable
    //   322	331	378	java/lang/Throwable
    //   336	345	378	java/lang/Throwable
    //   350	361	378	java/lang/Throwable
    //   366	375	378	java/lang/Throwable
    //   491	499	378	java/lang/Throwable
    //   504	515	378	java/lang/Throwable
    //   97	106	586	finally
    //   113	118	638	finally
    //   127	136	638	finally
    //   141	151	638	finally
    //   194	203	638	finally
    //   208	215	638	finally
    //   220	229	638	finally
    //   234	245	638	finally
    //   250	259	638	finally
    //   264	273	638	finally
    //   278	287	638	finally
    //   292	303	638	finally
    //   308	317	638	finally
    //   322	331	638	finally
    //   336	345	638	finally
    //   350	361	638	finally
    //   366	375	638	finally
    //   491	499	638	finally
    //   504	515	638	finally
    //   393	398	650	finally
    //   406	416	650	finally
    //   424	442	650	finally
    //   523	546	650	finally
    //   97	106	658	java/lang/Throwable
    //   523	546	670	java/lang/Throwable
  }
  
  public final long a()
  {
    return this.a;
  }
  
  public final l a(int paramInt)
  {
    try
    {
      this.h = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final l a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }
  
  public final l a(String paramString)
  {
    this.g = paramString;
    return this;
  }
  
  public final l b(int paramInt)
  {
    try
    {
      this.i = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final byte[] b()
  {
    return this.e;
  }
  
  public final int c()
  {
    try
    {
      int k = this.h;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final l c(int paramInt)
  {
    try
    {
      this.j = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int d()
  {
    try
    {
      int k = this.i;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int e()
  {
    try
    {
      int k = this.j;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */