package com.tencent.wxop.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.wxop.stat.a.d;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.f;
import com.tencent.wxop.stat.b.l;
import com.tencent.wxop.stat.b.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class t
{
  private static b bZ = ;
  private static Context ca = null;
  private static t cb = null;
  volatile int aI = 0;
  private String ab = "";
  private ac bW = null;
  private ac bX = null;
  com.tencent.wxop.stat.b.c bY = null;
  private f be = null;
  private String bq = "";
  private int cc = 0;
  private ConcurrentHashMap<d, String> cd = null;
  private boolean ce = false;
  private HashMap<String, String> cf = new HashMap();
  
  private t(Context paramContext)
  {
    try
    {
      this.be = new f();
      ca = paramContext.getApplicationContext();
      this.cd = new ConcurrentHashMap();
      this.ab = l.J(paramContext);
      this.bq = ("pri_" + l.J(paramContext));
      this.bW = new ac(ca, this.ab);
      this.bX = new ac(ca, this.bq);
      b(true);
      b(false);
      aj();
      t(ca);
      I();
      an();
      return;
    }
    catch (Throwable paramContext)
    {
      bZ.b(paramContext);
    }
  }
  
  /* Error */
  private void I()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   4: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: ldc -114
    //   9: aconst_null
    //   10: aconst_null
    //   11: aconst_null
    //   12: aconst_null
    //   13: aconst_null
    //   14: aconst_null
    //   15: invokevirtual 148	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   18: astore_2
    //   19: aload_2
    //   20: astore_1
    //   21: aload_2
    //   22: invokeinterface 154 1 0
    //   27: ifeq +135 -> 162
    //   30: aload_2
    //   31: astore_1
    //   32: aload_2
    //   33: iconst_0
    //   34: invokeinterface 158 2 0
    //   39: istore 6
    //   41: aload_2
    //   42: astore_1
    //   43: aload_2
    //   44: iconst_1
    //   45: invokeinterface 162 2 0
    //   50: astore_3
    //   51: aload_2
    //   52: astore_1
    //   53: aload_2
    //   54: iconst_2
    //   55: invokeinterface 162 2 0
    //   60: astore 4
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: iconst_3
    //   66: invokeinterface 158 2 0
    //   71: istore 7
    //   73: aload_2
    //   74: astore_1
    //   75: new 164	com/tencent/wxop/stat/ah
    //   78: dup
    //   79: iload 6
    //   81: invokespecial 167	com/tencent/wxop/stat/ah:<init>	(I)V
    //   84: astore 5
    //   86: aload_2
    //   87: astore_1
    //   88: aload 5
    //   90: iload 6
    //   92: putfield 168	com/tencent/wxop/stat/ah:aI	I
    //   95: aload_2
    //   96: astore_1
    //   97: aload 5
    //   99: new 170	org/json/JSONObject
    //   102: dup
    //   103: aload_3
    //   104: invokespecial 171	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   107: putfield 175	com/tencent/wxop/stat/ah:df	Lorg/json/JSONObject;
    //   110: aload_2
    //   111: astore_1
    //   112: aload 5
    //   114: aload 4
    //   116: putfield 178	com/tencent/wxop/stat/ah:c	Ljava/lang/String;
    //   119: aload_2
    //   120: astore_1
    //   121: aload 5
    //   123: iload 7
    //   125: putfield 181	com/tencent/wxop/stat/ah:L	I
    //   128: aload_2
    //   129: astore_1
    //   130: getstatic 43	com/tencent/wxop/stat/t:ca	Landroid/content/Context;
    //   133: aload 5
    //   135: invokestatic 187	com/tencent/wxop/stat/c:a	(Landroid/content/Context;Lcom/tencent/wxop/stat/ah;)V
    //   138: goto -119 -> 19
    //   141: astore_3
    //   142: aload_2
    //   143: astore_1
    //   144: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   147: aload_3
    //   148: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   151: aload_2
    //   152: ifnull +9 -> 161
    //   155: aload_2
    //   156: invokeinterface 190 1 0
    //   161: return
    //   162: aload_2
    //   163: ifnull -2 -> 161
    //   166: aload_2
    //   167: invokeinterface 190 1 0
    //   172: return
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_1
    //   177: ifnull +9 -> 186
    //   180: aload_1
    //   181: invokeinterface 190 1 0
    //   186: aload_2
    //   187: athrow
    //   188: astore_2
    //   189: goto -13 -> 176
    //   192: astore_3
    //   193: aconst_null
    //   194: astore_2
    //   195: goto -53 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	t
    //   20	161	1	localCursor1	android.database.Cursor
    //   18	149	2	localCursor2	android.database.Cursor
    //   173	14	2	localObject1	Object
    //   188	1	2	localObject2	Object
    //   194	1	2	localObject3	Object
    //   50	54	3	str1	String
    //   141	7	3	localThrowable1	Throwable
    //   192	1	3	localThrowable2	Throwable
    //   60	55	4	str2	String
    //   84	50	5	localah	ah
    //   39	52	6	i	int
    //   71	53	7	j	int
    // Exception table:
    //   from	to	target	type
    //   21	30	141	java/lang/Throwable
    //   32	41	141	java/lang/Throwable
    //   43	51	141	java/lang/Throwable
    //   53	62	141	java/lang/Throwable
    //   64	73	141	java/lang/Throwable
    //   75	86	141	java/lang/Throwable
    //   88	95	141	java/lang/Throwable
    //   97	110	141	java/lang/Throwable
    //   112	119	141	java/lang/Throwable
    //   121	128	141	java/lang/Throwable
    //   130	138	141	java/lang/Throwable
    //   0	19	173	finally
    //   21	30	188	finally
    //   32	41	188	finally
    //   43	51	188	finally
    //   53	62	188	finally
    //   64	73	188	finally
    //   75	86	188	finally
    //   88	95	188	finally
    //   97	110	188	finally
    //   112	119	188	finally
    //   121	128	188	finally
    //   130	138	188	finally
    //   144	151	188	finally
    //   0	19	192	java/lang/Throwable
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if ((this.aI > 0) && (paramInt > 0))
        {
          boolean bool = e.a();
          if (!bool) {
            continue;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        ArrayList localArrayList;
        bZ.b(localThrowable);
        continue;
      }
      finally {}
      return;
      if (c.k()) {
        bZ.b("Load " + this.aI + " unsent events");
      }
      localArrayList = new ArrayList(paramInt);
      b(localArrayList, paramInt, paramBoolean);
      if (localArrayList.size() > 0)
      {
        if (c.k()) {
          bZ.b("Peek " + localArrayList.size() + " unsent events.");
        }
        a(localArrayList, 2, paramBoolean);
        ak.Z(ca).b(localArrayList, new aa(this, localArrayList, paramBoolean));
      }
    }
  }
  
  /* Error */
  private void a(d paramd, aj paramaj, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: invokestatic 243	com/tencent/wxop/stat/c:s	()I
    //   11: ifle +381 -> 392
    //   14: getstatic 246	com/tencent/wxop/stat/c:ay	I
    //   17: istore 10
    //   19: iload 10
    //   21: ifle +12 -> 33
    //   24: iload_3
    //   25: ifne +8 -> 33
    //   28: iload 4
    //   30: ifeq +491 -> 521
    //   33: aload_0
    //   34: iload_3
    //   35: invokespecial 249	com/tencent/wxop/stat/t:c	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore 7
    //   40: aload 7
    //   42: astore 5
    //   44: aload 7
    //   46: astore 6
    //   48: aload 7
    //   50: invokevirtual 252	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   53: iload_3
    //   54: ifne +71 -> 125
    //   57: aload 7
    //   59: astore 5
    //   61: aload 7
    //   63: astore 6
    //   65: aload_0
    //   66: getfield 66	com/tencent/wxop/stat/t:aI	I
    //   69: invokestatic 243	com/tencent/wxop/stat/c:s	()I
    //   72: if_icmple +53 -> 125
    //   75: aload 7
    //   77: astore 5
    //   79: aload 7
    //   81: astore 6
    //   83: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   86: ldc -2
    //   88: invokevirtual 257	com/tencent/wxop/stat/b/b:warn	(Ljava/lang/Object;)V
    //   91: aload 7
    //   93: astore 5
    //   95: aload 7
    //   97: astore 6
    //   99: aload_0
    //   100: aload_0
    //   101: getfield 66	com/tencent/wxop/stat/t:aI	I
    //   104: aload_0
    //   105: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   108: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   111: ldc_w 262
    //   114: ldc_w 264
    //   117: aconst_null
    //   118: invokevirtual 268	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   121: isub
    //   122: putfield 66	com/tencent/wxop/stat/t:aI	I
    //   125: aload 7
    //   127: astore 5
    //   129: aload 7
    //   131: astore 6
    //   133: new 270	android/content/ContentValues
    //   136: dup
    //   137: invokespecial 271	android/content/ContentValues:<init>	()V
    //   140: astore 8
    //   142: aload 7
    //   144: astore 5
    //   146: aload 7
    //   148: astore 6
    //   150: aload_1
    //   151: invokevirtual 276	com/tencent/wxop/stat/a/d:af	()Ljava/lang/String;
    //   154: astore 9
    //   156: aload 7
    //   158: astore 5
    //   160: aload 7
    //   162: astore 6
    //   164: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   167: ifeq +35 -> 202
    //   170: aload 7
    //   172: astore 5
    //   174: aload 7
    //   176: astore 6
    //   178: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   181: new 97	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 278
    //   188: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: aload 9
    //   193: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   202: aload 7
    //   204: astore 5
    //   206: aload 7
    //   208: astore 6
    //   210: aload 8
    //   212: ldc_w 280
    //   215: aload 9
    //   217: invokestatic 286	com/tencent/wxop/stat/b/r:q	(Ljava/lang/String;)Ljava/lang/String;
    //   220: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   223: aload 7
    //   225: astore 5
    //   227: aload 7
    //   229: astore 6
    //   231: aload 8
    //   233: ldc_w 292
    //   236: ldc_w 294
    //   239: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   242: aload 7
    //   244: astore 5
    //   246: aload 7
    //   248: astore 6
    //   250: aload 8
    //   252: ldc_w 296
    //   255: iconst_1
    //   256: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   259: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: aload 7
    //   264: astore 5
    //   266: aload 7
    //   268: astore 6
    //   270: aload 8
    //   272: ldc_w 302
    //   275: aload_1
    //   276: invokevirtual 306	com/tencent/wxop/stat/a/d:ad	()J
    //   279: invokestatic 312	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   282: invokevirtual 315	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   285: aload 7
    //   287: astore 5
    //   289: aload 7
    //   291: astore 6
    //   293: aload 7
    //   295: ldc_w 262
    //   298: aconst_null
    //   299: aload 8
    //   301: invokevirtual 319	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   304: lstore 11
    //   306: aload 7
    //   308: astore 5
    //   310: aload 7
    //   312: astore 6
    //   314: aload 7
    //   316: invokevirtual 322	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   319: lload 11
    //   321: lstore 13
    //   323: aload 7
    //   325: ifnull +343 -> 668
    //   328: aload 7
    //   330: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   333: lload 11
    //   335: lconst_0
    //   336: lcmp
    //   337: ifle +155 -> 492
    //   340: aload_0
    //   341: aload_0
    //   342: getfield 66	com/tencent/wxop/stat/t:aI	I
    //   345: iconst_1
    //   346: iadd
    //   347: putfield 66	com/tencent/wxop/stat/t:aI	I
    //   350: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   353: ifeq +29 -> 382
    //   356: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   359: new 97	java/lang/StringBuilder
    //   362: dup
    //   363: ldc_w 327
    //   366: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   369: aload_1
    //   370: invokevirtual 276	com/tencent/wxop/stat/a/d:af	()Ljava/lang/String;
    //   373: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: invokevirtual 330	com/tencent/wxop/stat/b/b:e	(Ljava/lang/Object;)V
    //   382: aload_2
    //   383: ifnull +9 -> 392
    //   386: aload_2
    //   387: invokeinterface 335 1 0
    //   392: aload_0
    //   393: monitorexit
    //   394: return
    //   395: astore 5
    //   397: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   400: aload 5
    //   402: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   405: goto -72 -> 333
    //   408: astore 7
    //   410: ldc2_w 336
    //   413: lstore 13
    //   415: aload 5
    //   417: astore 6
    //   419: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   422: aload 7
    //   424: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   427: aload 5
    //   429: ifnull +239 -> 668
    //   432: aload 5
    //   434: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   437: ldc2_w 336
    //   440: lstore 11
    //   442: goto -109 -> 333
    //   445: astore 5
    //   447: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   450: aload 5
    //   452: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   455: ldc2_w 336
    //   458: lstore 11
    //   460: goto -127 -> 333
    //   463: astore_1
    //   464: aload 6
    //   466: ifnull +8 -> 474
    //   469: aload 6
    //   471: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   474: aload_1
    //   475: athrow
    //   476: astore_1
    //   477: aload_0
    //   478: monitorexit
    //   479: aload_1
    //   480: athrow
    //   481: astore_2
    //   482: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   485: aload_2
    //   486: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   489: goto -15 -> 474
    //   492: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   495: new 97	java/lang/StringBuilder
    //   498: dup
    //   499: ldc_w 339
    //   502: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   505: aload_1
    //   506: invokevirtual 276	com/tencent/wxop/stat/a/d:af	()Ljava/lang/String;
    //   509: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: invokevirtual 342	com/tencent/wxop/stat/b/b:error	(Ljava/lang/Object;)V
    //   518: goto -126 -> 392
    //   521: getstatic 246	com/tencent/wxop/stat/c:ay	I
    //   524: ifle -132 -> 392
    //   527: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   530: ifeq +83 -> 613
    //   533: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   536: new 97	java/lang/StringBuilder
    //   539: dup
    //   540: ldc_w 344
    //   543: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   546: aload_0
    //   547: getfield 72	com/tencent/wxop/stat/t:cd	Ljava/util/concurrent/ConcurrentHashMap;
    //   550: invokevirtual 345	java/util/concurrent/ConcurrentHashMap:size	()I
    //   553: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   556: ldc_w 347
    //   559: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: getstatic 246	com/tencent/wxop/stat/c:ay	I
    //   565: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   568: ldc_w 349
    //   571: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: aload_0
    //   575: getfield 66	com/tencent/wxop/stat/t:aI	I
    //   578: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   581: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   584: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   587: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   590: new 97	java/lang/StringBuilder
    //   593: dup
    //   594: ldc_w 351
    //   597: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   600: aload_1
    //   601: invokevirtual 276	com/tencent/wxop/stat/a/d:af	()Ljava/lang/String;
    //   604: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   610: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   613: aload_0
    //   614: getfield 72	com/tencent/wxop/stat/t:cd	Ljava/util/concurrent/ConcurrentHashMap;
    //   617: aload_1
    //   618: ldc 60
    //   620: invokevirtual 354	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   623: pop
    //   624: aload_0
    //   625: getfield 72	com/tencent/wxop/stat/t:cd	Ljava/util/concurrent/ConcurrentHashMap;
    //   628: invokevirtual 345	java/util/concurrent/ConcurrentHashMap:size	()I
    //   631: getstatic 246	com/tencent/wxop/stat/c:ay	I
    //   634: if_icmplt +7 -> 641
    //   637: aload_0
    //   638: invokespecial 357	com/tencent/wxop/stat/t:am	()V
    //   641: aload_2
    //   642: ifnull -250 -> 392
    //   645: aload_0
    //   646: getfield 72	com/tencent/wxop/stat/t:cd	Ljava/util/concurrent/ConcurrentHashMap;
    //   649: invokevirtual 345	java/util/concurrent/ConcurrentHashMap:size	()I
    //   652: ifle +7 -> 659
    //   655: aload_0
    //   656: invokespecial 357	com/tencent/wxop/stat/t:am	()V
    //   659: aload_2
    //   660: invokeinterface 335 1 0
    //   665: goto -273 -> 392
    //   668: lload 13
    //   670: lstore 11
    //   672: goto -339 -> 333
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	675	0	this	t
    //   0	675	1	paramd	d
    //   0	675	2	paramaj	aj
    //   0	675	3	paramBoolean1	boolean
    //   0	675	4	paramBoolean2	boolean
    //   4	305	5	localObject1	Object
    //   395	38	5	localThrowable1	Throwable
    //   445	6	5	localThrowable2	Throwable
    //   1	469	6	localObject2	Object
    //   38	291	7	localSQLiteDatabase	SQLiteDatabase
    //   408	15	7	localThrowable3	Throwable
    //   140	160	8	localContentValues	ContentValues
    //   154	62	9	str	String
    //   17	3	10	i	int
    //   304	367	11	l1	long
    //   321	348	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   328	333	395	java/lang/Throwable
    //   33	40	408	java/lang/Throwable
    //   48	53	408	java/lang/Throwable
    //   65	75	408	java/lang/Throwable
    //   83	91	408	java/lang/Throwable
    //   99	125	408	java/lang/Throwable
    //   133	142	408	java/lang/Throwable
    //   150	156	408	java/lang/Throwable
    //   164	170	408	java/lang/Throwable
    //   178	202	408	java/lang/Throwable
    //   210	223	408	java/lang/Throwable
    //   231	242	408	java/lang/Throwable
    //   250	262	408	java/lang/Throwable
    //   270	285	408	java/lang/Throwable
    //   293	306	408	java/lang/Throwable
    //   314	319	408	java/lang/Throwable
    //   432	437	445	java/lang/Throwable
    //   33	40	463	finally
    //   48	53	463	finally
    //   65	75	463	finally
    //   83	91	463	finally
    //   99	125	463	finally
    //   133	142	463	finally
    //   150	156	463	finally
    //   164	170	463	finally
    //   178	202	463	finally
    //   210	223	463	finally
    //   231	242	463	finally
    //   250	262	463	finally
    //   270	285	463	finally
    //   293	306	463	finally
    //   314	319	463	finally
    //   419	427	463	finally
    //   8	19	476	finally
    //   328	333	476	finally
    //   340	382	476	finally
    //   386	392	476	finally
    //   397	405	476	finally
    //   432	437	476	finally
    //   447	455	476	finally
    //   469	474	476	finally
    //   474	476	476	finally
    //   482	489	476	finally
    //   492	518	476	finally
    //   521	613	476	finally
    //   613	641	476	finally
    //   645	659	476	finally
    //   659	665	476	finally
    //   469	474	481	java/lang/Throwable
  }
  
  /* Error */
  private void a(ah paramah)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield 175	com/tencent/wxop/stat/ah:df	Lorg/json/JSONObject;
    //   6: invokevirtual 361	org/json/JSONObject:toString	()Ljava/lang/String;
    //   9: astore 4
    //   11: aload 4
    //   13: invokestatic 363	com/tencent/wxop/stat/b/l:t	(Ljava/lang/String;)Ljava/lang/String;
    //   16: astore_2
    //   17: new 270	android/content/ContentValues
    //   20: dup
    //   21: invokespecial 271	android/content/ContentValues:<init>	()V
    //   24: astore 5
    //   26: aload 5
    //   28: ldc_w 280
    //   31: aload_1
    //   32: getfield 175	com/tencent/wxop/stat/ah:df	Lorg/json/JSONObject;
    //   35: invokevirtual 361	org/json/JSONObject:toString	()Ljava/lang/String;
    //   38: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: aload 5
    //   43: ldc_w 365
    //   46: aload_2
    //   47: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_1
    //   51: aload_2
    //   52: putfield 178	com/tencent/wxop/stat/ah:c	Ljava/lang/String;
    //   55: aload 5
    //   57: ldc_w 367
    //   60: aload_1
    //   61: getfield 181	com/tencent/wxop/stat/ah:L	I
    //   64: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: invokevirtual 373	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   70: aload_0
    //   71: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   74: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   77: ldc -114
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: aconst_null
    //   83: aconst_null
    //   84: aconst_null
    //   85: invokevirtual 148	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   88: astore_3
    //   89: aload_3
    //   90: astore_2
    //   91: aload_3
    //   92: invokeinterface 154 1 0
    //   97: ifeq +299 -> 396
    //   100: aload_3
    //   101: astore_2
    //   102: aload_3
    //   103: iconst_0
    //   104: invokeinterface 158 2 0
    //   109: aload_1
    //   110: getfield 168	com/tencent/wxop/stat/ah:aI	I
    //   113: if_icmpne -24 -> 89
    //   116: iconst_1
    //   117: istore 6
    //   119: aload_3
    //   120: astore_2
    //   121: aload_0
    //   122: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   125: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   128: invokevirtual 252	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   131: iconst_1
    //   132: iload 6
    //   134: if_icmpne +109 -> 243
    //   137: aload_3
    //   138: astore_2
    //   139: aload_0
    //   140: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   143: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   146: ldc -114
    //   148: aload 5
    //   150: ldc_w 375
    //   153: iconst_1
    //   154: anewarray 377	java/lang/String
    //   157: dup
    //   158: iconst_0
    //   159: aload_1
    //   160: getfield 168	com/tencent/wxop/stat/ah:aI	I
    //   163: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   166: aastore
    //   167: invokevirtual 381	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   170: i2l
    //   171: lstore 7
    //   173: lload 7
    //   175: ldc2_w 336
    //   178: lcmp
    //   179: ifne +103 -> 282
    //   182: aload_3
    //   183: astore_2
    //   184: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   187: new 97	java/lang/StringBuilder
    //   190: dup
    //   191: ldc_w 383
    //   194: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   197: aload 4
    //   199: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: invokevirtual 386	com/tencent/wxop/stat/b/b:d	(Ljava/lang/Object;)V
    //   208: aload_3
    //   209: astore_2
    //   210: aload_0
    //   211: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   214: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   217: invokevirtual 322	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   220: aload_3
    //   221: ifnull +9 -> 230
    //   224: aload_3
    //   225: invokeinterface 190 1 0
    //   230: aload_0
    //   231: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   234: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   237: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   240: aload_0
    //   241: monitorexit
    //   242: return
    //   243: aload_3
    //   244: astore_2
    //   245: aload 5
    //   247: ldc_w 388
    //   250: aload_1
    //   251: getfield 168	com/tencent/wxop/stat/ah:aI	I
    //   254: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   257: invokevirtual 373	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   260: aload_3
    //   261: astore_2
    //   262: aload_0
    //   263: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   266: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   269: ldc -114
    //   271: aconst_null
    //   272: aload 5
    //   274: invokevirtual 319	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   277: lstore 7
    //   279: goto -106 -> 173
    //   282: aload_3
    //   283: astore_2
    //   284: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   287: new 97	java/lang/StringBuilder
    //   290: dup
    //   291: ldc_w 390
    //   294: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   297: aload 4
    //   299: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   305: invokevirtual 330	com/tencent/wxop/stat/b/b:e	(Ljava/lang/Object;)V
    //   308: goto -100 -> 208
    //   311: astore_1
    //   312: aload_3
    //   313: astore_2
    //   314: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   317: aload_1
    //   318: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   321: aload_3
    //   322: ifnull +9 -> 331
    //   325: aload_3
    //   326: invokeinterface 190 1 0
    //   331: aload_0
    //   332: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   335: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   338: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   341: goto -101 -> 240
    //   344: astore_1
    //   345: goto -105 -> 240
    //   348: astore_1
    //   349: aconst_null
    //   350: astore_2
    //   351: aload_2
    //   352: ifnull +9 -> 361
    //   355: aload_2
    //   356: invokeinterface 190 1 0
    //   361: aload_0
    //   362: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   365: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   368: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   371: aload_1
    //   372: athrow
    //   373: astore_1
    //   374: aload_0
    //   375: monitorexit
    //   376: aload_1
    //   377: athrow
    //   378: astore_2
    //   379: goto -8 -> 371
    //   382: astore_1
    //   383: goto -32 -> 351
    //   386: astore_1
    //   387: aconst_null
    //   388: astore_3
    //   389: goto -77 -> 312
    //   392: astore_1
    //   393: goto -153 -> 240
    //   396: iconst_0
    //   397: istore 6
    //   399: goto -280 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	this	t
    //   0	402	1	paramah	ah
    //   16	340	2	localObject	Object
    //   378	1	2	localException	Exception
    //   88	301	3	localCursor	android.database.Cursor
    //   9	289	4	str	String
    //   24	249	5	localContentValues	ContentValues
    //   117	281	6	i	int
    //   171	107	7	l	long
    // Exception table:
    //   from	to	target	type
    //   91	100	311	java/lang/Throwable
    //   102	116	311	java/lang/Throwable
    //   121	131	311	java/lang/Throwable
    //   139	173	311	java/lang/Throwable
    //   184	208	311	java/lang/Throwable
    //   210	220	311	java/lang/Throwable
    //   245	260	311	java/lang/Throwable
    //   262	279	311	java/lang/Throwable
    //   284	308	311	java/lang/Throwable
    //   331	341	344	java/lang/Exception
    //   2	89	348	finally
    //   224	230	373	finally
    //   230	240	373	finally
    //   325	331	373	finally
    //   331	341	373	finally
    //   355	361	373	finally
    //   361	371	373	finally
    //   371	373	373	finally
    //   361	371	378	java/lang/Exception
    //   91	100	382	finally
    //   102	116	382	finally
    //   121	131	382	finally
    //   139	173	382	finally
    //   184	208	382	finally
    //   210	220	382	finally
    //   245	260	382	finally
    //   262	279	382	finally
    //   284	308	382	finally
    //   314	321	382	finally
    //   2	89	386	java/lang/Throwable
    //   230	240	392	java/lang/Exception
  }
  
  /* Error */
  private void a(List<ad> paramList, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 6
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_1
    //   9: invokeinterface 220 1 0
    //   14: istore 8
    //   16: iload 8
    //   18: ifne +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: iload_3
    //   25: ifne +208 -> 233
    //   28: invokestatic 434	com/tencent/wxop/stat/c:p	()I
    //   31: istore 8
    //   33: aload_0
    //   34: iload_3
    //   35: invokespecial 249	com/tencent/wxop/stat/t:c	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore 5
    //   40: iload_2
    //   41: iconst_2
    //   42: if_icmpne +199 -> 241
    //   45: aload 5
    //   47: astore 4
    //   49: new 97	java/lang/StringBuilder
    //   52: dup
    //   53: ldc_w 436
    //   56: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   59: iload_2
    //   60: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   63: ldc_w 438
    //   66: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_1
    //   70: invokestatic 441	com/tencent/wxop/stat/t:b	(Ljava/util/List;)Ljava/lang/String;
    //   73: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: astore 7
    //   81: aload 6
    //   83: astore_1
    //   84: aload 7
    //   86: astore 6
    //   88: aload 5
    //   90: astore 4
    //   92: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   95: ifeq +31 -> 126
    //   98: aload 5
    //   100: astore 4
    //   102: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   105: new 97	java/lang/StringBuilder
    //   108: dup
    //   109: ldc_w 443
    //   112: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: aload 6
    //   117: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   126: aload 5
    //   128: astore 4
    //   130: aload 5
    //   132: invokevirtual 252	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   135: aload 5
    //   137: astore 4
    //   139: aload 5
    //   141: aload 6
    //   143: invokevirtual 446	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   146: aload_1
    //   147: ifnull +48 -> 195
    //   150: aload 5
    //   152: astore 4
    //   154: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   157: new 97	java/lang/StringBuilder
    //   160: dup
    //   161: ldc_w 448
    //   164: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_1
    //   168: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   177: aload 5
    //   179: astore 4
    //   181: aload 5
    //   183: aload_1
    //   184: invokevirtual 446	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   187: aload 5
    //   189: astore 4
    //   191: aload_0
    //   192: invokespecial 122	com/tencent/wxop/stat/t:aj	()V
    //   195: aload 5
    //   197: astore 4
    //   199: aload 5
    //   201: invokevirtual 322	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   204: aload 5
    //   206: ifnull -185 -> 21
    //   209: aload 5
    //   211: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   214: goto -193 -> 21
    //   217: astore_1
    //   218: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   221: aload_1
    //   222: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   225: goto -204 -> 21
    //   228: astore_1
    //   229: aload_0
    //   230: monitorexit
    //   231: aload_1
    //   232: athrow
    //   233: invokestatic 451	com/tencent/wxop/stat/c:n	()I
    //   236: istore 8
    //   238: goto -205 -> 33
    //   241: aload 5
    //   243: astore 4
    //   245: new 97	java/lang/StringBuilder
    //   248: dup
    //   249: ldc_w 436
    //   252: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: iload_2
    //   256: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: ldc_w 453
    //   262: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: aload_1
    //   266: invokestatic 441	com/tencent/wxop/stat/t:b	(Ljava/util/List;)Ljava/lang/String;
    //   269: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: astore 6
    //   277: aload 7
    //   279: astore_1
    //   280: aload 5
    //   282: astore 4
    //   284: aload_0
    //   285: getfield 70	com/tencent/wxop/stat/t:cc	I
    //   288: iconst_3
    //   289: irem
    //   290: ifne +26 -> 316
    //   293: aload 5
    //   295: astore 4
    //   297: new 97	java/lang/StringBuilder
    //   300: dup
    //   301: ldc_w 455
    //   304: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   307: iload 8
    //   309: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   312: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: astore_1
    //   316: aload 5
    //   318: astore 4
    //   320: aload_0
    //   321: aload_0
    //   322: getfield 70	com/tencent/wxop/stat/t:cc	I
    //   325: iconst_1
    //   326: iadd
    //   327: putfield 70	com/tencent/wxop/stat/t:cc	I
    //   330: goto -242 -> 88
    //   333: astore_1
    //   334: aconst_null
    //   335: astore 5
    //   337: aload 5
    //   339: astore 4
    //   341: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   344: aload_1
    //   345: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   348: aload 5
    //   350: ifnull -329 -> 21
    //   353: aload 5
    //   355: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   358: goto -337 -> 21
    //   361: astore_1
    //   362: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   365: aload_1
    //   366: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   369: goto -348 -> 21
    //   372: astore_1
    //   373: aconst_null
    //   374: astore 4
    //   376: aload 4
    //   378: ifnull +8 -> 386
    //   381: aload 4
    //   383: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   386: aload_1
    //   387: athrow
    //   388: astore 4
    //   390: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   393: aload 4
    //   395: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   398: goto -12 -> 386
    //   401: astore_1
    //   402: goto -26 -> 376
    //   405: astore_1
    //   406: goto -69 -> 337
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	409	0	this	t
    //   0	409	1	paramList	List<ad>
    //   0	409	2	paramInt	int
    //   0	409	3	paramBoolean	boolean
    //   47	335	4	localSQLiteDatabase1	SQLiteDatabase
    //   388	6	4	localThrowable	Throwable
    //   38	316	5	localSQLiteDatabase2	SQLiteDatabase
    //   4	272	6	str1	String
    //   1	277	7	str2	String
    //   14	294	8	i	int
    // Exception table:
    //   from	to	target	type
    //   209	214	217	java/lang/Throwable
    //   8	16	228	finally
    //   28	33	228	finally
    //   209	214	228	finally
    //   218	225	228	finally
    //   233	238	228	finally
    //   353	358	228	finally
    //   362	369	228	finally
    //   381	386	228	finally
    //   386	388	228	finally
    //   390	398	228	finally
    //   33	40	333	java/lang/Throwable
    //   353	358	361	java/lang/Throwable
    //   33	40	372	finally
    //   381	386	388	java/lang/Throwable
    //   49	81	401	finally
    //   92	98	401	finally
    //   102	126	401	finally
    //   130	135	401	finally
    //   139	146	401	finally
    //   154	177	401	finally
    //   181	187	401	finally
    //   191	195	401	finally
    //   199	204	401	finally
    //   245	277	401	finally
    //   284	293	401	finally
    //   297	316	401	finally
    //   320	330	401	finally
    //   341	348	401	finally
    //   49	81	405	java/lang/Throwable
    //   92	98	405	java/lang/Throwable
    //   102	126	405	java/lang/Throwable
    //   130	135	405	java/lang/Throwable
    //   139	146	405	java/lang/Throwable
    //   154	177	405	java/lang/Throwable
    //   181	187	405	java/lang/Throwable
    //   191	195	405	java/lang/Throwable
    //   199	204	405	java/lang/Throwable
    //   245	277	405	java/lang/Throwable
    //   284	293	405	java/lang/Throwable
    //   297	316	405	java/lang/Throwable
    //   320	330	405	java/lang/Throwable
  }
  
  /* Error */
  private void a(List<ad> paramList, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_1
    //   8: invokeinterface 220 1 0
    //   13: istore 6
    //   15: iload 6
    //   17: ifne +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   26: ifeq +41 -> 67
    //   29: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   32: new 97	java/lang/StringBuilder
    //   35: dup
    //   36: ldc_w 459
    //   39: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_1
    //   43: invokeinterface 220 1 0
    //   48: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   51: ldc_w 461
    //   54: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: iload_2
    //   58: invokevirtual 410	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   61: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   67: new 97	java/lang/StringBuilder
    //   70: dup
    //   71: aload_1
    //   72: invokeinterface 220 1 0
    //   77: iconst_3
    //   78: imul
    //   79: invokespecial 462	java/lang/StringBuilder:<init>	(I)V
    //   82: astore 5
    //   84: aload 5
    //   86: ldc_w 464
    //   89: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_1
    //   94: invokeinterface 220 1 0
    //   99: istore 7
    //   101: aload_1
    //   102: invokeinterface 468 1 0
    //   107: astore_1
    //   108: iconst_0
    //   109: istore 6
    //   111: aload_1
    //   112: invokeinterface 473 1 0
    //   117: ifeq +42 -> 159
    //   120: aload 5
    //   122: aload_1
    //   123: invokeinterface 477 1 0
    //   128: checkcast 479	com/tencent/wxop/stat/ad
    //   131: getfield 482	com/tencent/wxop/stat/ad:K	J
    //   134: invokevirtual 485	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: iload 6
    //   140: iload 7
    //   142: iconst_1
    //   143: isub
    //   144: if_icmpeq +257 -> 401
    //   147: aload 5
    //   149: ldc_w 487
    //   152: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: goto +245 -> 401
    //   159: aload 5
    //   161: ldc_w 489
    //   164: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload 4
    //   170: astore_1
    //   171: aload_0
    //   172: iload_2
    //   173: invokespecial 249	com/tencent/wxop/stat/t:c	(Z)Landroid/database/sqlite/SQLiteDatabase;
    //   176: astore 4
    //   178: aload 4
    //   180: astore_1
    //   181: aload 4
    //   183: astore_3
    //   184: aload 4
    //   186: invokevirtual 252	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   189: aload 4
    //   191: astore_1
    //   192: aload 4
    //   194: astore_3
    //   195: aload 4
    //   197: ldc_w 262
    //   200: aload 5
    //   202: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: aconst_null
    //   206: invokevirtual 268	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   209: istore 6
    //   211: aload 4
    //   213: astore_1
    //   214: aload 4
    //   216: astore_3
    //   217: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   220: ifeq +58 -> 278
    //   223: aload 4
    //   225: astore_1
    //   226: aload 4
    //   228: astore_3
    //   229: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   232: new 97	java/lang/StringBuilder
    //   235: dup
    //   236: ldc_w 491
    //   239: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: iload 7
    //   244: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: ldc_w 493
    //   250: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: aload 5
    //   255: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc_w 495
    //   264: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: iload 6
    //   269: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   272: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   278: aload 4
    //   280: astore_1
    //   281: aload 4
    //   283: astore_3
    //   284: aload_0
    //   285: aload_0
    //   286: getfield 66	com/tencent/wxop/stat/t:aI	I
    //   289: iload 6
    //   291: isub
    //   292: putfield 66	com/tencent/wxop/stat/t:aI	I
    //   295: aload 4
    //   297: astore_1
    //   298: aload 4
    //   300: astore_3
    //   301: aload 4
    //   303: invokevirtual 322	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   306: aload 4
    //   308: astore_1
    //   309: aload 4
    //   311: astore_3
    //   312: aload_0
    //   313: invokespecial 122	com/tencent/wxop/stat/t:aj	()V
    //   316: aload 4
    //   318: ifnull -298 -> 20
    //   321: aload 4
    //   323: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   326: goto -306 -> 20
    //   329: astore_1
    //   330: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   333: aload_1
    //   334: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   337: goto -317 -> 20
    //   340: astore_1
    //   341: aload_0
    //   342: monitorexit
    //   343: aload_1
    //   344: athrow
    //   345: astore 4
    //   347: aload_1
    //   348: astore_3
    //   349: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   352: aload 4
    //   354: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   357: aload_1
    //   358: ifnull -338 -> 20
    //   361: aload_1
    //   362: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   365: goto -345 -> 20
    //   368: astore_1
    //   369: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   372: aload_1
    //   373: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   376: goto -356 -> 20
    //   379: astore_1
    //   380: aload_3
    //   381: ifnull +7 -> 388
    //   384: aload_3
    //   385: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   388: aload_1
    //   389: athrow
    //   390: astore_3
    //   391: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   394: aload_3
    //   395: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   398: goto -10 -> 388
    //   401: iload 6
    //   403: iconst_1
    //   404: iadd
    //   405: istore 6
    //   407: goto -296 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	410	0	this	t
    //   0	410	1	paramList	List<ad>
    //   0	410	2	paramBoolean	boolean
    //   1	384	3	localObject	Object
    //   390	5	3	localThrowable1	Throwable
    //   3	319	4	localSQLiteDatabase	SQLiteDatabase
    //   345	8	4	localThrowable2	Throwable
    //   82	172	5	localStringBuilder	StringBuilder
    //   13	393	6	i	int
    //   99	144	7	j	int
    // Exception table:
    //   from	to	target	type
    //   321	326	329	java/lang/Throwable
    //   7	15	340	finally
    //   23	67	340	finally
    //   67	108	340	finally
    //   111	138	340	finally
    //   147	156	340	finally
    //   159	168	340	finally
    //   321	326	340	finally
    //   330	337	340	finally
    //   361	365	340	finally
    //   369	376	340	finally
    //   384	388	340	finally
    //   388	390	340	finally
    //   391	398	340	finally
    //   171	178	345	java/lang/Throwable
    //   184	189	345	java/lang/Throwable
    //   195	211	345	java/lang/Throwable
    //   217	223	345	java/lang/Throwable
    //   229	278	345	java/lang/Throwable
    //   284	295	345	java/lang/Throwable
    //   301	306	345	java/lang/Throwable
    //   312	316	345	java/lang/Throwable
    //   361	365	368	java/lang/Throwable
    //   171	178	379	finally
    //   184	189	379	finally
    //   195	211	379	finally
    //   217	223	379	finally
    //   229	278	379	finally
    //   284	295	379	finally
    //   301	306	379	finally
    //   312	316	379	finally
    //   349	357	379	finally
    //   384	388	390	java/lang/Throwable
  }
  
  public static t ai()
  {
    return cb;
  }
  
  private void aj()
  {
    this.aI = (ak() + al());
  }
  
  private int ak()
  {
    return (int)DatabaseUtils.queryNumEntries(this.bW.getReadableDatabase(), "events");
  }
  
  private int al()
  {
    return (int)DatabaseUtils.queryNumEntries(this.bX.getReadableDatabase(), "events");
  }
  
  private void am()
  {
    localObject5 = null;
    Object localObject1 = null;
    if (this.ce) {
      return;
    }
    synchronized (this.cd)
    {
      if (this.cd.size() == 0) {
        return;
      }
    }
    this.ce = true;
    if (c.k()) {
      bZ.b("insert " + this.cd.size() + " events ,numEventsCachedInMemory:" + c.ay + ",numStoredEvents:" + this.aI);
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.bW.getWritableDatabase();
      Object localObject3 = localSQLiteDatabase;
      localObject5 = localSQLiteDatabase;
      localSQLiteDatabase.beginTransaction();
      localObject3 = localSQLiteDatabase;
      localObject5 = localSQLiteDatabase;
      Iterator localIterator = this.cd.entrySet().iterator();
      for (;;)
      {
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        d locald = (d)((Map.Entry)localIterator.next()).getKey();
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        ContentValues localContentValues = new ContentValues();
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        String str = locald.af();
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        if (c.k())
        {
          localObject3 = localSQLiteDatabase;
          localObject5 = localSQLiteDatabase;
          bZ.b("insert content:" + str);
        }
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localContentValues.put("content", r.q(str));
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localContentValues.put("send_count", "0");
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localContentValues.put("status", Integer.toString(1));
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localContentValues.put("timestamp", Long.valueOf(locald.ad()));
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localSQLiteDatabase.insert("events", null, localContentValues);
        localObject3 = localSQLiteDatabase;
        localObject5 = localSQLiteDatabase;
        localIterator.remove();
      }
      try
      {
        ((SQLiteDatabase)localObject5).endTransaction();
        aj();
        throw ((Throwable)localObject4);
      }
      catch (Throwable localThrowable3)
      {
        for (;;)
        {
          bZ.b(localThrowable3);
        }
      }
    }
    catch (Throwable localThrowable4)
    {
      localObject5 = localObject3;
      bZ.b(localThrowable4);
      if (localObject3 != null) {}
      try
      {
        ((SQLiteDatabase)localObject3).endTransaction();
        aj();
        for (;;)
        {
          this.ce = false;
          if (c.k()) {
            bZ.b("after insert, cacheEventsInMemory.size():" + this.cd.size() + ",numEventsCachedInMemory:" + c.ay + ",numStoredEvents:" + this.aI);
          }
          return;
          localObject3 = localThrowable4;
          localObject5 = localThrowable4;
          localThrowable4.setTransactionSuccessful();
          if (localThrowable4 != null) {
            try
            {
              localThrowable4.endTransaction();
              aj();
            }
            catch (Throwable localThrowable1)
            {
              bZ.b(localThrowable1);
            }
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        for (;;)
        {
          bZ.b(localThrowable2);
        }
      }
    }
    finally
    {
      if (localObject5 == null) {}
    }
  }
  
  /* Error */
  private void an()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   4: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: ldc_w 529
    //   10: aconst_null
    //   11: aconst_null
    //   12: aconst_null
    //   13: aconst_null
    //   14: aconst_null
    //   15: aconst_null
    //   16: invokevirtual 148	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: astore_1
    //   22: aload_2
    //   23: invokeinterface 154 1 0
    //   28: ifeq +51 -> 79
    //   31: aload_2
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 79	com/tencent/wxop/stat/t:cf	Ljava/util/HashMap;
    //   37: aload_2
    //   38: iconst_0
    //   39: invokeinterface 162 2 0
    //   44: aload_2
    //   45: iconst_1
    //   46: invokeinterface 162 2 0
    //   51: invokevirtual 530	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: goto -35 -> 20
    //   58: astore_3
    //   59: aload_2
    //   60: astore_1
    //   61: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   64: aload_3
    //   65: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   68: aload_2
    //   69: ifnull +9 -> 78
    //   72: aload_2
    //   73: invokeinterface 190 1 0
    //   78: return
    //   79: aload_2
    //   80: ifnull -2 -> 78
    //   83: aload_2
    //   84: invokeinterface 190 1 0
    //   89: return
    //   90: astore_2
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull +9 -> 103
    //   97: aload_1
    //   98: invokeinterface 190 1 0
    //   103: aload_2
    //   104: athrow
    //   105: astore_2
    //   106: goto -13 -> 93
    //   109: astore_3
    //   110: aconst_null
    //   111: astore_2
    //   112: goto -53 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	t
    //   21	77	1	localCursor1	android.database.Cursor
    //   19	65	2	localCursor2	android.database.Cursor
    //   90	14	2	localObject1	Object
    //   105	1	2	localObject2	Object
    //   111	1	2	localObject3	Object
    //   58	7	3	localThrowable1	Throwable
    //   109	1	3	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   22	31	58	java/lang/Throwable
    //   33	55	58	java/lang/Throwable
    //   0	20	90	finally
    //   22	31	105	finally
    //   33	55	105	finally
    //   61	68	105	finally
    //   0	20	109	java/lang/Throwable
  }
  
  private static String b(List<ad> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramList.size() * 3);
    localStringBuilder.append("event_id in (");
    int j = paramList.size();
    paramList = paramList.iterator();
    int i = 0;
    while (paramList.hasNext())
    {
      localStringBuilder.append(((ad)paramList.next()).K);
      if (i != j - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private void b(List<ad> paramList, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_3
    //   1: ifne +232 -> 233
    //   4: aload_0
    //   5: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   8: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 4
    //   13: iconst_1
    //   14: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   17: astore 5
    //   19: iload_2
    //   20: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   23: astore 6
    //   25: aload 4
    //   27: ldc_w 262
    //   30: aconst_null
    //   31: ldc_w 534
    //   34: iconst_1
    //   35: anewarray 377	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: aload 5
    //   42: aastore
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aload 6
    //   48: invokevirtual 537	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore 4
    //   53: aload 4
    //   55: invokeinterface 154 1 0
    //   60: ifeq +185 -> 245
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 541 2 0
    //   71: lstore 8
    //   73: aload 4
    //   75: iconst_1
    //   76: invokeinterface 162 2 0
    //   81: astore 6
    //   83: aload 6
    //   85: astore 5
    //   87: getstatic 543	com/tencent/wxop/stat/c:ad	Z
    //   90: ifne +10 -> 100
    //   93: aload 6
    //   95: invokestatic 544	com/tencent/wxop/stat/b/r:t	(Ljava/lang/String;)Ljava/lang/String;
    //   98: astore 5
    //   100: aload 4
    //   102: iconst_2
    //   103: invokeinterface 158 2 0
    //   108: istore_2
    //   109: aload 4
    //   111: iconst_3
    //   112: invokeinterface 158 2 0
    //   117: istore 7
    //   119: new 479	com/tencent/wxop/stat/ad
    //   122: dup
    //   123: lload 8
    //   125: aload 5
    //   127: iload_2
    //   128: iload 7
    //   130: invokespecial 547	com/tencent/wxop/stat/ad:<init>	(JLjava/lang/String;II)V
    //   133: astore 5
    //   135: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   138: ifeq +55 -> 193
    //   141: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   144: new 97	java/lang/StringBuilder
    //   147: dup
    //   148: ldc_w 549
    //   151: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   154: lload 8
    //   156: invokevirtual 485	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   159: ldc_w 551
    //   162: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: iload 7
    //   167: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   170: ldc_w 553
    //   173: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload 4
    //   178: iconst_4
    //   179: invokeinterface 541 2 0
    //   184: invokevirtual 485	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   187: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   193: aload_1
    //   194: aload 5
    //   196: invokeinterface 557 2 0
    //   201: pop
    //   202: goto -149 -> 53
    //   205: astore 5
    //   207: aload 4
    //   209: astore_1
    //   210: aload 5
    //   212: astore 4
    //   214: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   217: aload 4
    //   219: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   222: aload_1
    //   223: ifnull +9 -> 232
    //   226: aload_1
    //   227: invokeinterface 190 1 0
    //   232: return
    //   233: aload_0
    //   234: getfield 56	com/tencent/wxop/stat/t:bX	Lcom/tencent/wxop/stat/ac;
    //   237: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   240: astore 4
    //   242: goto -229 -> 13
    //   245: aload 4
    //   247: ifnull -15 -> 232
    //   250: aload 4
    //   252: invokeinterface 190 1 0
    //   257: return
    //   258: astore_1
    //   259: aconst_null
    //   260: astore 4
    //   262: aload 4
    //   264: ifnull +10 -> 274
    //   267: aload 4
    //   269: invokeinterface 190 1 0
    //   274: aload_1
    //   275: athrow
    //   276: astore_1
    //   277: goto -15 -> 262
    //   280: astore 5
    //   282: aload_1
    //   283: astore 4
    //   285: aload 5
    //   287: astore_1
    //   288: goto -26 -> 262
    //   291: astore 4
    //   293: aconst_null
    //   294: astore_1
    //   295: goto -81 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	298	0	this	t
    //   0	298	1	paramList	List<ad>
    //   0	298	2	paramInt	int
    //   0	298	3	paramBoolean	boolean
    //   11	273	4	localObject1	Object
    //   291	1	4	localThrowable1	Throwable
    //   17	178	5	localObject2	Object
    //   205	6	5	localThrowable2	Throwable
    //   280	6	5	localObject3	Object
    //   23	71	6	str	String
    //   117	49	7	i	int
    //   71	84	8	l	long
    // Exception table:
    //   from	to	target	type
    //   53	83	205	java/lang/Throwable
    //   87	100	205	java/lang/Throwable
    //   100	193	205	java/lang/Throwable
    //   193	202	205	java/lang/Throwable
    //   4	13	258	finally
    //   13	53	258	finally
    //   233	242	258	finally
    //   53	83	276	finally
    //   87	100	276	finally
    //   100	193	276	finally
    //   193	202	276	finally
    //   214	222	280	finally
    //   4	13	291	java/lang/Throwable
    //   13	53	291	java/lang/Throwable
    //   233	242	291	java/lang/Throwable
  }
  
  private void b(boolean paramBoolean)
  {
    Object localObject3 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localSQLiteDatabase = c(paramBoolean);
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        localSQLiteDatabase.beginTransaction();
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        ContentValues localContentValues = new ContentValues();
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        localContentValues.put("status", Integer.valueOf(1));
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        int i = localSQLiteDatabase.update("events", localContentValues, "status=?", new String[] { Long.toString(2L) });
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        if (c.k())
        {
          localObject1 = localSQLiteDatabase;
          localObject3 = localSQLiteDatabase;
          bZ.b("update " + i + " unsent events.");
        }
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        localSQLiteDatabase.setTransactionSuccessful();
      }
      catch (Throwable localThrowable4)
      {
        SQLiteDatabase localSQLiteDatabase;
        localObject3 = localThrowable1;
        bZ.b(localThrowable4);
        if (localThrowable1 == null) {
          continue;
        }
        try
        {
          localThrowable1.endTransaction();
          return;
        }
        catch (Throwable localThrowable2)
        {
          bZ.b(localThrowable2);
          return;
        }
      }
      finally
      {
        if (localObject3 == null) {
          break label206;
        }
      }
      try
      {
        localSQLiteDatabase.endTransaction();
        return;
      }
      catch (Throwable localThrowable1)
      {
        bZ.b(localThrowable1);
        return;
      }
    }
    try
    {
      ((SQLiteDatabase)localObject3).endTransaction();
      label206:
      throw ((Throwable)localObject2);
    }
    catch (Throwable localThrowable3)
    {
      for (;;)
      {
        bZ.b(localThrowable3);
      }
    }
  }
  
  private SQLiteDatabase c(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return this.bW.getWritableDatabase();
    }
    return this.bX.getWritableDatabase();
  }
  
  public static t s(Context paramContext)
  {
    if (cb == null) {}
    try
    {
      if (cb == null) {
        cb = new t(paramContext);
      }
      return cb;
    }
    finally {}
  }
  
  final void H()
  {
    if (!c.l()) {
      return;
    }
    try
    {
      this.be.a(new w(this));
      return;
    }
    catch (Throwable localThrowable)
    {
      bZ.b(localThrowable);
    }
  }
  
  final void b(int paramInt)
  {
    this.be.a(new ab(this, paramInt));
  }
  
  final void b(d paramd, aj paramaj, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.be != null) {
      this.be.a(new x(this, paramd, paramaj, paramBoolean1, paramBoolean2));
    }
  }
  
  final void b(ah paramah)
  {
    if (paramah == null) {
      return;
    }
    this.be.a(new y(this, paramah));
  }
  
  final void b(List<ad> paramList, boolean paramBoolean)
  {
    if (this.be != null) {
      this.be.a(new u(this, paramList, paramBoolean));
    }
  }
  
  final void c(List<ad> paramList, boolean paramBoolean)
  {
    if (this.be != null) {
      this.be.a(new v(this, paramList, paramBoolean));
    }
  }
  
  public final int r()
  {
    return this.aI;
  }
  
  /* Error */
  public final com.tencent.wxop.stat.b.c t(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/tencent/wxop/stat/t:bY	Lcom/tencent/wxop/stat/b/c;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 68	com/tencent/wxop/stat/t:bY	Lcom/tencent/wxop/stat/b/c;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: aload_0
    //   19: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   22: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: invokevirtual 252	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   28: invokestatic 198	com/tencent/wxop/stat/c:k	()Z
    //   31: ifeq +12 -> 43
    //   34: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   37: ldc_w 599
    //   40: invokevirtual 208	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   43: aload_0
    //   44: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   47: invokevirtual 140	com/tencent/wxop/stat/ac:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   50: ldc_w 601
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: aconst_null
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: invokevirtual 537	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   63: astore_3
    //   64: iconst_0
    //   65: istore 9
    //   67: aload_3
    //   68: invokeinterface 154 1 0
    //   73: ifeq +359 -> 432
    //   76: aload_3
    //   77: iconst_0
    //   78: invokeinterface 162 2 0
    //   83: astore 8
    //   85: aload 8
    //   87: invokestatic 544	com/tencent/wxop/stat/b/r:t	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore 4
    //   92: aload_3
    //   93: iconst_1
    //   94: invokeinterface 158 2 0
    //   99: istore 12
    //   101: aload_3
    //   102: iconst_2
    //   103: invokeinterface 162 2 0
    //   108: astore_2
    //   109: aload_3
    //   110: iconst_3
    //   111: invokeinterface 541 2 0
    //   116: lstore 13
    //   118: invokestatic 606	java/lang/System:currentTimeMillis	()J
    //   121: ldc2_w 607
    //   124: ldiv
    //   125: lstore 15
    //   127: iload 12
    //   129: iconst_1
    //   130: if_icmpeq +739 -> 869
    //   133: lload 13
    //   135: ldc2_w 607
    //   138: lmul
    //   139: invokestatic 610	com/tencent/wxop/stat/b/l:d	(J)Ljava/lang/String;
    //   142: ldc2_w 607
    //   145: lload 15
    //   147: lmul
    //   148: invokestatic 610	com/tencent/wxop/stat/b/l:d	(J)Ljava/lang/String;
    //   151: invokevirtual 613	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   154: ifne +715 -> 869
    //   157: iconst_1
    //   158: istore 9
    //   160: aload_2
    //   161: aload_1
    //   162: invokestatic 616	com/tencent/wxop/stat/b/l:G	(Landroid/content/Context;)Ljava/lang/String;
    //   165: invokevirtual 613	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +694 -> 862
    //   171: iload 9
    //   173: iconst_2
    //   174: ior
    //   175: istore 10
    //   177: aload 4
    //   179: ldc_w 487
    //   182: invokevirtual 620	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   185: astore 6
    //   187: iconst_0
    //   188: istore 11
    //   190: iconst_0
    //   191: istore 9
    //   193: aload 6
    //   195: ifnull +434 -> 629
    //   198: aload 6
    //   200: arraylength
    //   201: ifle +428 -> 629
    //   204: aload 6
    //   206: iconst_0
    //   207: aaload
    //   208: astore_2
    //   209: aload_2
    //   210: ifnull +12 -> 222
    //   213: aload_2
    //   214: invokevirtual 623	java/lang/String:length	()I
    //   217: bipush 11
    //   219: if_icmpge +630 -> 849
    //   222: aload_1
    //   223: invokestatic 625	com/tencent/wxop/stat/b/r:b	(Landroid/content/Context;)Ljava/lang/String;
    //   226: astore 5
    //   228: aload 5
    //   230: ifnull +612 -> 842
    //   233: aload 5
    //   235: invokevirtual 623	java/lang/String:length	()I
    //   238: bipush 10
    //   240: if_icmple +602 -> 842
    //   243: iconst_1
    //   244: istore 9
    //   246: aload 5
    //   248: astore_2
    //   249: goto +627 -> 876
    //   252: aload 6
    //   254: ifnull +389 -> 643
    //   257: aload 6
    //   259: arraylength
    //   260: iconst_2
    //   261: if_icmplt +382 -> 643
    //   264: aload 6
    //   266: iconst_1
    //   267: aaload
    //   268: astore 6
    //   270: new 97	java/lang/StringBuilder
    //   273: dup
    //   274: invokespecial 626	java/lang/StringBuilder:<init>	()V
    //   277: aload 4
    //   279: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: ldc_w 487
    //   285: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: aload 6
    //   290: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   296: astore 5
    //   298: iload 9
    //   300: istore 11
    //   302: aload_0
    //   303: new 628	com/tencent/wxop/stat/b/c
    //   306: dup
    //   307: aload 4
    //   309: aload 6
    //   311: iload 10
    //   313: invokespecial 631	com/tencent/wxop/stat/b/c:<init>	(Ljava/lang/String;Ljava/lang/String;I)V
    //   316: putfield 68	com/tencent/wxop/stat/t:bY	Lcom/tencent/wxop/stat/b/c;
    //   319: new 270	android/content/ContentValues
    //   322: dup
    //   323: invokespecial 271	android/content/ContentValues:<init>	()V
    //   326: astore_2
    //   327: aload_2
    //   328: ldc_w 633
    //   331: aload 5
    //   333: invokestatic 286	com/tencent/wxop/stat/b/r:q	(Ljava/lang/String;)Ljava/lang/String;
    //   336: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   339: aload_2
    //   340: ldc_w 635
    //   343: iload 10
    //   345: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   348: invokevirtual 373	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   351: aload_2
    //   352: ldc_w 637
    //   355: aload_1
    //   356: invokestatic 616	com/tencent/wxop/stat/b/l:G	(Landroid/content/Context;)Ljava/lang/String;
    //   359: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload_2
    //   363: ldc_w 639
    //   366: lload 15
    //   368: invokestatic 312	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   371: invokevirtual 315	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   374: iload 11
    //   376: ifeq +30 -> 406
    //   379: aload_0
    //   380: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   383: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   386: ldc_w 601
    //   389: aload_2
    //   390: ldc_w 641
    //   393: iconst_1
    //   394: anewarray 377	java/lang/String
    //   397: dup
    //   398: iconst_0
    //   399: aload 8
    //   401: aastore
    //   402: invokevirtual 381	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   405: pop
    //   406: iload 10
    //   408: iload 12
    //   410: if_icmpeq +479 -> 889
    //   413: aload_0
    //   414: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   417: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   420: ldc_w 601
    //   423: aconst_null
    //   424: aload_2
    //   425: invokevirtual 644	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   428: pop2
    //   429: goto +460 -> 889
    //   432: iload 9
    //   434: ifne +157 -> 591
    //   437: aload_1
    //   438: invokestatic 646	com/tencent/wxop/stat/b/l:c	(Landroid/content/Context;)Ljava/lang/String;
    //   441: astore 4
    //   443: aload_1
    //   444: invokestatic 649	com/tencent/wxop/stat/b/l:w	(Landroid/content/Context;)Ljava/lang/String;
    //   447: astore 5
    //   449: aload 5
    //   451: ifnull +385 -> 836
    //   454: aload 5
    //   456: invokevirtual 623	java/lang/String:length	()I
    //   459: ifle +377 -> 836
    //   462: new 97	java/lang/StringBuilder
    //   465: dup
    //   466: invokespecial 626	java/lang/StringBuilder:<init>	()V
    //   469: aload 4
    //   471: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: ldc_w 487
    //   477: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: aload 5
    //   482: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   488: astore_2
    //   489: invokestatic 606	java/lang/System:currentTimeMillis	()J
    //   492: ldc2_w 607
    //   495: ldiv
    //   496: lstore 13
    //   498: aload_1
    //   499: invokestatic 616	com/tencent/wxop/stat/b/l:G	(Landroid/content/Context;)Ljava/lang/String;
    //   502: astore_1
    //   503: new 270	android/content/ContentValues
    //   506: dup
    //   507: invokespecial 271	android/content/ContentValues:<init>	()V
    //   510: astore 6
    //   512: aload 6
    //   514: ldc_w 633
    //   517: aload_2
    //   518: invokestatic 286	com/tencent/wxop/stat/b/r:q	(Ljava/lang/String;)Ljava/lang/String;
    //   521: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   524: aload 6
    //   526: ldc_w 635
    //   529: iconst_0
    //   530: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   533: invokevirtual 373	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   536: aload 6
    //   538: ldc_w 637
    //   541: aload_1
    //   542: invokevirtual 290	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: aload 6
    //   547: ldc_w 639
    //   550: lload 13
    //   552: invokestatic 312	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   555: invokevirtual 315	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   558: aload_0
    //   559: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   562: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   565: ldc_w 601
    //   568: aconst_null
    //   569: aload 6
    //   571: invokevirtual 319	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   574: pop2
    //   575: aload_0
    //   576: new 628	com/tencent/wxop/stat/b/c
    //   579: dup
    //   580: aload 4
    //   582: aload 5
    //   584: iconst_0
    //   585: invokespecial 631	com/tencent/wxop/stat/b/c:<init>	(Ljava/lang/String;Ljava/lang/String;I)V
    //   588: putfield 68	com/tencent/wxop/stat/t:bY	Lcom/tencent/wxop/stat/b/c;
    //   591: aload_0
    //   592: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   595: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   598: invokevirtual 322	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   601: aload_3
    //   602: ifnull +9 -> 611
    //   605: aload_3
    //   606: invokeinterface 190 1 0
    //   611: aload_0
    //   612: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   615: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   618: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   621: aload_0
    //   622: getfield 68	com/tencent/wxop/stat/t:bY	Lcom/tencent/wxop/stat/b/c;
    //   625: astore_1
    //   626: goto -612 -> 14
    //   629: aload_1
    //   630: invokestatic 646	com/tencent/wxop/stat/b/l:c	(Landroid/content/Context;)Ljava/lang/String;
    //   633: astore_2
    //   634: iconst_1
    //   635: istore 9
    //   637: aload_2
    //   638: astore 4
    //   640: goto -388 -> 252
    //   643: aload_1
    //   644: invokestatic 649	com/tencent/wxop/stat/b/l:w	(Landroid/content/Context;)Ljava/lang/String;
    //   647: astore 7
    //   649: iload 9
    //   651: istore 11
    //   653: aload 7
    //   655: astore 6
    //   657: aload_2
    //   658: astore 5
    //   660: aload 7
    //   662: ifnull -360 -> 302
    //   665: iload 9
    //   667: istore 11
    //   669: aload 7
    //   671: astore 6
    //   673: aload_2
    //   674: astore 5
    //   676: aload 7
    //   678: invokevirtual 623	java/lang/String:length	()I
    //   681: ifle -379 -> 302
    //   684: new 97	java/lang/StringBuilder
    //   687: dup
    //   688: invokespecial 626	java/lang/StringBuilder:<init>	()V
    //   691: aload 4
    //   693: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: ldc_w 487
    //   699: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: aload 7
    //   704: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   710: astore 5
    //   712: iconst_1
    //   713: istore 11
    //   715: aload 7
    //   717: astore 6
    //   719: goto -417 -> 302
    //   722: astore_1
    //   723: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   726: aload_1
    //   727: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   730: goto -109 -> 621
    //   733: astore_1
    //   734: aload_0
    //   735: monitorexit
    //   736: aload_1
    //   737: athrow
    //   738: astore_2
    //   739: aconst_null
    //   740: astore_1
    //   741: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   744: aload_2
    //   745: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   748: aload_1
    //   749: ifnull +9 -> 758
    //   752: aload_1
    //   753: invokeinterface 190 1 0
    //   758: aload_0
    //   759: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   762: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   765: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   768: goto -147 -> 621
    //   771: astore_1
    //   772: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   775: aload_1
    //   776: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   779: goto -158 -> 621
    //   782: astore_1
    //   783: aconst_null
    //   784: astore_3
    //   785: aload_3
    //   786: ifnull +9 -> 795
    //   789: aload_3
    //   790: invokeinterface 190 1 0
    //   795: aload_0
    //   796: getfield 54	com/tencent/wxop/stat/t:bW	Lcom/tencent/wxop/stat/ac;
    //   799: invokevirtual 260	com/tencent/wxop/stat/ac:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   802: invokevirtual 325	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   805: aload_1
    //   806: athrow
    //   807: astore_2
    //   808: getstatic 41	com/tencent/wxop/stat/t:bZ	Lcom/tencent/wxop/stat/b/b;
    //   811: aload_2
    //   812: invokevirtual 136	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   815: goto -10 -> 805
    //   818: astore_1
    //   819: goto -34 -> 785
    //   822: astore_2
    //   823: aload_1
    //   824: astore_3
    //   825: aload_2
    //   826: astore_1
    //   827: goto -42 -> 785
    //   830: astore_2
    //   831: aload_3
    //   832: astore_1
    //   833: goto -92 -> 741
    //   836: aload 4
    //   838: astore_2
    //   839: goto -350 -> 489
    //   842: iload 11
    //   844: istore 9
    //   846: goto +30 -> 876
    //   849: aload_2
    //   850: astore 5
    //   852: aload 4
    //   854: astore_2
    //   855: aload 5
    //   857: astore 4
    //   859: goto -607 -> 252
    //   862: iload 9
    //   864: istore 10
    //   866: goto -689 -> 177
    //   869: iload 12
    //   871: istore 9
    //   873: goto -713 -> 160
    //   876: aload_2
    //   877: astore 5
    //   879: aload 4
    //   881: astore_2
    //   882: aload 5
    //   884: astore 4
    //   886: goto -634 -> 252
    //   889: iconst_1
    //   890: istore 9
    //   892: goto -460 -> 432
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	895	0	this	t
    //   0	895	1	paramContext	Context
    //   108	566	2	localObject1	Object
    //   738	7	2	localThrowable1	Throwable
    //   807	5	2	localThrowable2	Throwable
    //   822	4	2	localObject2	Object
    //   830	1	2	localThrowable3	Throwable
    //   838	44	2	localObject3	Object
    //   63	769	3	localObject4	Object
    //   90	795	4	localObject5	Object
    //   226	657	5	localObject6	Object
    //   185	533	6	localObject7	Object
    //   647	69	7	str1	String
    //   83	317	8	str2	String
    //   65	826	9	i	int
    //   175	690	10	j	int
    //   188	655	11	k	int
    //   99	771	12	m	int
    //   116	435	13	l1	long
    //   125	242	15	l2	long
    // Exception table:
    //   from	to	target	type
    //   605	611	722	java/lang/Throwable
    //   611	621	722	java/lang/Throwable
    //   2	14	733	finally
    //   605	611	733	finally
    //   611	621	733	finally
    //   621	626	733	finally
    //   723	730	733	finally
    //   752	758	733	finally
    //   758	768	733	finally
    //   772	779	733	finally
    //   789	795	733	finally
    //   795	805	733	finally
    //   805	807	733	finally
    //   808	815	733	finally
    //   18	43	738	java/lang/Throwable
    //   43	64	738	java/lang/Throwable
    //   752	758	771	java/lang/Throwable
    //   758	768	771	java/lang/Throwable
    //   18	43	782	finally
    //   43	64	782	finally
    //   789	795	807	java/lang/Throwable
    //   795	805	807	java/lang/Throwable
    //   67	127	818	finally
    //   133	157	818	finally
    //   160	171	818	finally
    //   177	187	818	finally
    //   198	204	818	finally
    //   213	222	818	finally
    //   222	228	818	finally
    //   233	243	818	finally
    //   257	264	818	finally
    //   270	298	818	finally
    //   302	374	818	finally
    //   379	406	818	finally
    //   413	429	818	finally
    //   437	449	818	finally
    //   454	489	818	finally
    //   489	591	818	finally
    //   591	601	818	finally
    //   629	634	818	finally
    //   643	649	818	finally
    //   676	712	818	finally
    //   741	748	822	finally
    //   67	127	830	java/lang/Throwable
    //   133	157	830	java/lang/Throwable
    //   160	171	830	java/lang/Throwable
    //   177	187	830	java/lang/Throwable
    //   198	204	830	java/lang/Throwable
    //   213	222	830	java/lang/Throwable
    //   222	228	830	java/lang/Throwable
    //   233	243	830	java/lang/Throwable
    //   257	264	830	java/lang/Throwable
    //   270	298	830	java/lang/Throwable
    //   302	374	830	java/lang/Throwable
    //   379	406	830	java/lang/Throwable
    //   413	429	830	java/lang/Throwable
    //   437	449	830	java/lang/Throwable
    //   454	489	830	java/lang/Throwable
    //   489	591	830	java/lang/Throwable
    //   591	601	830	java/lang/Throwable
    //   629	634	830	java/lang/Throwable
    //   643	649	830	java/lang/Throwable
    //   676	712	830	java/lang/Throwable
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */