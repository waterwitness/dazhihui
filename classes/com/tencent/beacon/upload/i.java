package com.tencent.beacon.upload;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.beacon.c.a.c;
import com.tencent.beacon.event.p;
import java.util.ArrayList;
import java.util.List;

public final class i
  implements h
{
  private static i a = null;
  private SparseArray<g> b = new SparseArray(5);
  private List<UploadHandleListener> c = new ArrayList(5);
  private f d;
  private Context e = null;
  private boolean f = true;
  private boolean g = true;
  
  private i(Context paramContext, boolean paramBoolean)
  {
    if (paramContext != null) {
      localContext = paramContext.getApplicationContext();
    }
    if (localContext != null) {}
    for (this.e = localContext;; this.e = paramContext)
    {
      this.f = paramBoolean;
      this.d = f.a(this.e);
      return;
    }
  }
  
  private static c a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        Object localObject = com.tencent.beacon.a.h.b(2, paramArrayOfByte);
        paramArrayOfByte = new com.tencent.beacon.f.d();
        paramArrayOfByte.a((byte[])localObject);
        localObject = new c();
        com.tencent.beacon.e.b.b(" covert to ResponsePackage ", new Object[0]);
        paramArrayOfByte = (c)paramArrayOfByte.b("detail", localObject);
        return paramArrayOfByte;
      }
      catch (Throwable paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
      }
    }
    return null;
  }
  
  public static i a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        a = new i(paramContext, true);
        com.tencent.beacon.e.b.h(" create uphandler up:true", new Object[0]);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static i a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      if (a == null)
      {
        a = new i(paramContext, paramBoolean);
        com.tencent.beacon.e.b.h(" create uphandler up: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      if (a.a() != paramBoolean)
      {
        a.b(paramBoolean);
        com.tencent.beacon.e.b.h(" change uphandler up: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private void a(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, String paramString)
  {
    UploadHandleListener[] arrayOfUploadHandleListener = c();
    if (arrayOfUploadHandleListener != null)
    {
      int j = arrayOfUploadHandleListener.length;
      int i = 0;
      while (i < j)
      {
        arrayOfUploadHandleListener[i].onUploadEnd(paramInt1, paramInt2, paramLong1, paramLong2, paramBoolean, paramString);
        i += 1;
      }
    }
  }
  
  private static void a(int paramInt1, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt2, int paramInt3, String paramString1, String paramString2, int paramInt4, String paramString3)
  {
    if ((paramInt1 != 0) && (paramLong1 != 0L))
    {
      p localp = p.d();
      if ((localp != null) && (localp.c != null)) {
        localp.c.a(paramInt1, paramBoolean, paramLong2, paramLong1, paramInt2, paramInt3, paramString1, paramString2, paramInt4, paramString3);
      }
    }
  }
  
  private boolean a(SparseArray<g> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramSparseArray == null) || (paramArrayOfByte == null)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      paramSparseArray = (g)paramSparseArray.get(paramInt);
      if (paramSparseArray == null)
      {
        com.tencent.beacon.e.b.c(" no handler key:%d", new Object[] { Integer.valueOf(paramInt) });
        return false;
      }
      break;
    case 103: 
      try
      {
        com.tencent.beacon.e.b.a(" process CMD_RESPONSE_GEN_QIMEI", new Object[0]);
        paramSparseArray = new com.tencent.beacon.f.a(paramArrayOfByte);
        paramArrayOfByte = new com.tencent.beacon.c.c.a();
        paramArrayOfByte.a(paramSparseArray);
        if (paramArrayOfByte.a != null)
        {
          com.tencent.beacon.b.a.a(this.e).a(paramArrayOfByte.a);
          new com.tencent.beacon.e.d(this.e).a(paramArrayOfByte.a);
        }
        com.tencent.beacon.e.b.h(" Qimei:%s  imei:%s  imsi:%s  aid:%s  mac:%s ", new Object[] { paramArrayOfByte.a, paramArrayOfByte.b, paramArrayOfByte.d, paramArrayOfByte.e, paramArrayOfByte.c });
      }
      catch (Throwable paramSparseArray)
      {
        for (;;)
        {
          paramSparseArray.printStackTrace();
        }
      }
      return true;
    }
    try
    {
      com.tencent.beacon.e.b.b(" key:%d  handler: %s", new Object[] { Integer.valueOf(paramInt), paramSparseArray.getClass().toString() });
      paramSparseArray.a(paramInt, paramArrayOfByte, true);
      return true;
    }
    catch (Throwable paramSparseArray)
    {
      paramSparseArray.printStackTrace();
      com.tencent.beacon.e.b.d(" handle error key:%d", new Object[] { Integer.valueOf(paramInt) });
    }
    return false;
  }
  
  private void b(boolean paramBoolean)
  {
    try
    {
      this.f = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static byte[] b(a parama)
  {
    if (parama != null) {
      try
      {
        Object localObject = parama.a();
        if (localObject != null)
        {
          com.tencent.beacon.e.b.b(" RequestPackage info appkey:%s sdkid:%s appVersion:%s cmd: %d", new Object[] { ((com.tencent.beacon.c.a.b)localObject).b, ((com.tencent.beacon.c.a.b)localObject).d, ((com.tencent.beacon.c.a.b)localObject).c, Integer.valueOf(((com.tencent.beacon.c.a.b)localObject).f) });
          com.tencent.beacon.f.d locald = new com.tencent.beacon.f.d();
          locald.a(1);
          locald.b("test");
          locald.a("test");
          locald.a("detail", localObject);
          localObject = com.tencent.beacon.a.h.a(2, locald.a());
          return (byte[])localObject;
        }
      }
      catch (Throwable localThrowable)
      {
        com.tencent.beacon.e.b.d(" parseSendDatas error", new Object[0]);
        localThrowable.printStackTrace();
        parama.b();
      }
    }
    return null;
  }
  
  /* Error */
  private UploadHandleListener[] c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	com/tencent/beacon/upload/i:c	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 42	com/tencent/beacon/upload/i:c	Ljava/util/List;
    //   13: invokeinterface 260 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 42	com/tencent/beacon/upload/i:c	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 124	com/tencent/beacon/upload/UploadHandleListener
    //   29: invokeinterface 264 2 0
    //   34: checkcast 266	[Lcom/tencent/beacon/upload/UploadHandleListener;
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: aconst_null
    //   43: astore_1
    //   44: goto -6 -> 38
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	i
    //   37	7	1	arrayOfUploadHandleListener	UploadHandleListener[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  private f d()
  {
    try
    {
      f localf = this.d;
      return localf;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private SparseArray<g> e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	com/tencent/beacon/upload/i:b	Landroid/util/SparseArray;
    //   6: ifnull +33 -> 39
    //   9: aload_0
    //   10: getfield 37	com/tencent/beacon/upload/i:b	Landroid/util/SparseArray;
    //   13: invokevirtual 269	android/util/SparseArray:size	()I
    //   16: ifle +23 -> 39
    //   19: new 271	com/tencent/beacon/e/f
    //   22: dup
    //   23: invokespecial 272	com/tencent/beacon/e/f:<init>	()V
    //   26: pop
    //   27: aload_0
    //   28: getfield 37	com/tencent/beacon/upload/i:b	Landroid/util/SparseArray;
    //   31: invokestatic 275	com/tencent/beacon/e/f:a	(Landroid/util/SparseArray;)Landroid/util/SparseArray;
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: areturn
    //   39: aconst_null
    //   40: astore_1
    //   41: goto -6 -> 35
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	i
    //   34	7	1	localSparseArray	SparseArray
    //   44	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	35	44	finally
  }
  
  /* Error */
  public final void a(a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 113	com/tencent/beacon/upload/i:a	()Z
    //   4: ifeq +10 -> 14
    //   7: aload_0
    //   8: invokevirtual 281	com/tencent/beacon/upload/i:b	()Z
    //   11: ifne +64 -> 75
    //   14: aload_1
    //   15: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   18: iconst_2
    //   19: if_icmpne +18 -> 37
    //   22: ldc_w 285
    //   25: iconst_0
    //   26: anewarray 4	java/lang/Object
    //   29: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aload_1
    //   33: iconst_0
    //   34: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   37: aload_1
    //   38: getfield 288	com/tencent/beacon/upload/a:b	I
    //   41: ifeq +24 -> 65
    //   44: ldc_w 290
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   57: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: aastore
    //   61: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: return
    //   65: ldc_w 292
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_0
    //   76: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   79: invokestatic 297	com/tencent/beacon/e/c:b	(Landroid/content/Context;)Z
    //   82: ifne +27 -> 109
    //   85: ldc_w 299
    //   88: iconst_0
    //   89: anewarray 4	java/lang/Object
    //   92: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_1
    //   96: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   99: iconst_2
    //   100: if_icmpne -36 -> 64
    //   103: aload_1
    //   104: iconst_0
    //   105: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   108: return
    //   109: aload_0
    //   110: aload_0
    //   111: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   114: invokestatic 304	com/tencent/beacon/a/j:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/j;
    //   117: invokevirtual 307	com/tencent/beacon/upload/i:a	(Lcom/tencent/beacon/upload/UploadHandleListener;)Z
    //   120: pop
    //   121: aload_1
    //   122: ifnonnull +14 -> 136
    //   125: ldc_w 309
    //   128: iconst_0
    //   129: anewarray 4	java/lang/Object
    //   132: invokestatic 217	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: return
    //   136: aload_1
    //   137: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   140: istore 12
    //   142: iconst_0
    //   143: istore 24
    //   145: iconst_0
    //   146: istore 20
    //   148: iconst_0
    //   149: istore 23
    //   151: iconst_m1
    //   152: istore 11
    //   154: aload_1
    //   155: invokevirtual 311	com/tencent/beacon/upload/a:e	()Ljava/lang/String;
    //   158: astore_3
    //   159: aload_3
    //   160: ifnull +16 -> 176
    //   163: ldc_w 313
    //   166: aload_3
    //   167: invokevirtual 318	java/lang/String:trim	()Ljava/lang/String;
    //   170: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   173: ifeq +40 -> 213
    //   176: ldc_w 324
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 217	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_1
    //   187: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   190: iconst_2
    //   191: if_icmpne +8 -> 199
    //   194: aload_1
    //   195: iconst_0
    //   196: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   199: aload_0
    //   200: iload 12
    //   202: iconst_m1
    //   203: lconst_0
    //   204: lconst_0
    //   205: iconst_0
    //   206: ldc_w 326
    //   209: invokespecial 328	com/tencent/beacon/upload/i:a	(IIJJZLjava/lang/String;)V
    //   212: return
    //   213: aload_1
    //   214: invokestatic 330	com/tencent/beacon/upload/i:b	(Lcom/tencent/beacon/upload/a;)[B
    //   217: astore 6
    //   219: aload_1
    //   220: invokevirtual 332	com/tencent/beacon/upload/a:d	()Ljava/lang/String;
    //   223: astore 4
    //   225: aload_3
    //   226: astore_2
    //   227: aload 4
    //   229: ifnull +29 -> 258
    //   232: new 334	java/lang/StringBuilder
    //   235: dup
    //   236: invokespecial 335	java/lang/StringBuilder:<init>	()V
    //   239: aload_3
    //   240: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: ldc_w 341
    //   246: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: aload 4
    //   251: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: astore_2
    //   258: ldc_w 344
    //   261: iconst_3
    //   262: anewarray 4	java/lang/Object
    //   265: dup
    //   266: iconst_0
    //   267: iload 12
    //   269: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: aastore
    //   273: dup
    //   274: iconst_1
    //   275: aload_2
    //   276: aastore
    //   277: dup
    //   278: iconst_2
    //   279: aload_1
    //   280: invokevirtual 204	java/lang/Object:getClass	()Ljava/lang/Class;
    //   283: invokevirtual 210	java/lang/Class:toString	()Ljava/lang/String;
    //   286: aastore
    //   287: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: aload 6
    //   292: ifnonnull +27 -> 319
    //   295: ldc_w 346
    //   298: iconst_0
    //   299: anewarray 4	java/lang/Object
    //   302: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   305: aload_0
    //   306: iload 12
    //   308: iconst_m1
    //   309: lconst_0
    //   310: lconst_0
    //   311: iconst_0
    //   312: ldc_w 348
    //   315: invokespecial 328	com/tencent/beacon/upload/i:a	(IIJJZLjava/lang/String;)V
    //   318: return
    //   319: aload_0
    //   320: invokespecial 350	com/tencent/beacon/upload/i:d	()Lcom/tencent/beacon/upload/f;
    //   323: astore 7
    //   325: aload 7
    //   327: ifnonnull +27 -> 354
    //   330: ldc_w 352
    //   333: iconst_0
    //   334: anewarray 4	java/lang/Object
    //   337: invokestatic 217	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload_0
    //   341: iload 12
    //   343: iconst_m1
    //   344: lconst_0
    //   345: lconst_0
    //   346: iconst_0
    //   347: ldc_w 354
    //   350: invokespecial 328	com/tencent/beacon/upload/i:a	(IIJJZLjava/lang/String;)V
    //   353: return
    //   354: aload_0
    //   355: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   358: invokestatic 358	com/tencent/beacon/a/h:k	(Landroid/content/Context;)Ljava/lang/String;
    //   361: astore 4
    //   363: new 360	com/tencent/beacon/upload/e
    //   366: dup
    //   367: invokespecial 361	com/tencent/beacon/upload/e:<init>	()V
    //   370: astore 5
    //   372: invokestatic 367	com/tencent/beacon/a/f:m	()Lcom/tencent/beacon/a/f;
    //   375: invokevirtual 370	com/tencent/beacon/a/f:h	()J
    //   378: new 372	java/util/Date
    //   381: dup
    //   382: invokespecial 373	java/util/Date:<init>	()V
    //   385: invokevirtual 376	java/util/Date:getTime	()J
    //   388: ladd
    //   389: ldc2_w 377
    //   392: ldiv
    //   393: lstore 14
    //   395: iload 11
    //   397: istore 9
    //   399: iload 23
    //   401: istore 21
    //   403: iload 24
    //   405: istore 22
    //   407: aload 7
    //   409: aload_2
    //   410: aload 6
    //   412: aload 5
    //   414: aload_1
    //   415: invokevirtual 381	com/tencent/beacon/upload/f:a	(Ljava/lang/String;[BLcom/tencent/beacon/upload/e;Lcom/tencent/beacon/upload/a;)[B
    //   418: astore_3
    //   419: aload_3
    //   420: ifnonnull +1408 -> 1828
    //   423: iload 12
    //   425: bipush 100
    //   427: if_icmpne +1401 -> 1828
    //   430: iload 11
    //   432: istore 9
    //   434: iload 23
    //   436: istore 21
    //   438: iload 24
    //   440: istore 22
    //   442: ldc_w 383
    //   445: aload_2
    //   446: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   449: ifne +1379 -> 1828
    //   452: iload 11
    //   454: istore 9
    //   456: iload 23
    //   458: istore 21
    //   460: iload 24
    //   462: istore 22
    //   464: aload 7
    //   466: ldc_w 383
    //   469: aload 6
    //   471: aload 5
    //   473: aload_1
    //   474: invokevirtual 381	com/tencent/beacon/upload/f:a	(Ljava/lang/String;[BLcom/tencent/beacon/upload/e;Lcom/tencent/beacon/upload/a;)[B
    //   477: astore_2
    //   478: iload 11
    //   480: istore 9
    //   482: iload 23
    //   484: istore 21
    //   486: iload 24
    //   488: istore 22
    //   490: aload 5
    //   492: invokevirtual 385	com/tencent/beacon/upload/e:a	()J
    //   495: lstore 16
    //   497: iload 11
    //   499: istore 9
    //   501: iload 23
    //   503: istore 21
    //   505: iload 24
    //   507: istore 22
    //   509: aload 5
    //   511: invokevirtual 387	com/tencent/beacon/upload/e:b	()J
    //   514: lstore 18
    //   516: iload 11
    //   518: istore 9
    //   520: iload 23
    //   522: istore 21
    //   524: iload 24
    //   526: istore 22
    //   528: aload_2
    //   529: invokestatic 389	com/tencent/beacon/upload/i:a	([B)Lcom/tencent/beacon/c/a/c;
    //   532: astore_2
    //   533: iload 11
    //   535: istore 10
    //   537: aload_2
    //   538: ifnull +1295 -> 1833
    //   541: iload 11
    //   543: istore 9
    //   545: iload 23
    //   547: istore 21
    //   549: iload 24
    //   551: istore 22
    //   553: aload_2
    //   554: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   557: istore 10
    //   559: iload 10
    //   561: istore 9
    //   563: iload 23
    //   565: istore 21
    //   567: iload 24
    //   569: istore 22
    //   571: aload_2
    //   572: getfield 393	com/tencent/beacon/c/a/c:a	B
    //   575: ifne +147 -> 722
    //   578: iconst_1
    //   579: istore 20
    //   581: iload 10
    //   583: istore 9
    //   585: iload 20
    //   587: istore 21
    //   589: iload 20
    //   591: istore 22
    //   593: ldc_w 395
    //   596: iconst_2
    //   597: anewarray 4	java/lang/Object
    //   600: dup
    //   601: iconst_0
    //   602: aload_2
    //   603: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   606: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   609: aastore
    //   610: dup
    //   611: iconst_1
    //   612: aload_2
    //   613: getfield 393	com/tencent/beacon/c/a/c:a	B
    //   616: invokestatic 400	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   619: aastore
    //   620: invokestatic 85	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   623: goto +1210 -> 1833
    //   626: iload 10
    //   628: istore 9
    //   630: iload 20
    //   632: istore 21
    //   634: iload 20
    //   636: istore 22
    //   638: aload_0
    //   639: iload 12
    //   641: iload 10
    //   643: lload 16
    //   645: lload 18
    //   647: iload 20
    //   649: aconst_null
    //   650: invokespecial 328	com/tencent/beacon/upload/i:a	(IIJJZLjava/lang/String;)V
    //   653: iload 10
    //   655: istore 9
    //   657: iload 20
    //   659: istore 21
    //   661: iload 20
    //   663: istore 22
    //   665: iload 12
    //   667: lload 16
    //   669: iload 20
    //   671: lload 14
    //   673: aload 5
    //   675: invokevirtual 402	com/tencent/beacon/upload/e:d	()J
    //   678: l2i
    //   679: aload_1
    //   680: invokevirtual 404	com/tencent/beacon/upload/a:f	()I
    //   683: aload 4
    //   685: aload 5
    //   687: invokevirtual 405	com/tencent/beacon/upload/e:e	()Ljava/lang/String;
    //   690: aload 5
    //   692: invokevirtual 406	com/tencent/beacon/upload/e:c	()I
    //   695: new 334	java/lang/StringBuilder
    //   698: dup
    //   699: invokespecial 335	java/lang/StringBuilder:<init>	()V
    //   702: aload_2
    //   703: getfield 393	com/tencent/beacon/c/a/c:a	B
    //   706: invokevirtual 409	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   709: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   712: invokestatic 411	com/tencent/beacon/upload/i:a	(IJZJIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   715: aload_1
    //   716: iload 20
    //   718: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   721: return
    //   722: iconst_0
    //   723: istore 20
    //   725: goto -144 -> 581
    //   728: iload 10
    //   730: istore 9
    //   732: iload 20
    //   734: istore 21
    //   736: iload 20
    //   738: istore 22
    //   740: invokestatic 367	com/tencent/beacon/a/f:m	()Lcom/tencent/beacon/a/f;
    //   743: astore_3
    //   744: aload_3
    //   745: ifnull +131 -> 876
    //   748: iload 10
    //   750: istore 9
    //   752: iload 20
    //   754: istore 21
    //   756: iload 20
    //   758: istore 22
    //   760: aload_2
    //   761: getfield 412	com/tencent/beacon/c/a/c:d	Ljava/lang/String;
    //   764: ifnull +26 -> 790
    //   767: iload 10
    //   769: istore 9
    //   771: iload 20
    //   773: istore 21
    //   775: iload 20
    //   777: istore 22
    //   779: aload_3
    //   780: aload_2
    //   781: getfield 412	com/tencent/beacon/c/a/c:d	Ljava/lang/String;
    //   784: invokevirtual 318	java/lang/String:trim	()Ljava/lang/String;
    //   787: invokevirtual 413	com/tencent/beacon/a/f:b	(Ljava/lang/String;)V
    //   790: iload 10
    //   792: istore 9
    //   794: iload 20
    //   796: istore 21
    //   798: iload 20
    //   800: istore 22
    //   802: new 372	java/util/Date
    //   805: dup
    //   806: invokespecial 373	java/util/Date:<init>	()V
    //   809: astore 6
    //   811: iload 10
    //   813: istore 9
    //   815: iload 20
    //   817: istore 21
    //   819: iload 20
    //   821: istore 22
    //   823: aload_3
    //   824: aload_2
    //   825: getfield 416	com/tencent/beacon/c/a/c:g	J
    //   828: aload 6
    //   830: invokevirtual 376	java/util/Date:getTime	()J
    //   833: lsub
    //   834: invokevirtual 419	com/tencent/beacon/a/f:a	(J)V
    //   837: iload 10
    //   839: istore 9
    //   841: iload 20
    //   843: istore 21
    //   845: iload 20
    //   847: istore 22
    //   849: ldc_w 421
    //   852: iconst_2
    //   853: anewarray 4	java/lang/Object
    //   856: dup
    //   857: iconst_0
    //   858: aload_3
    //   859: invokevirtual 423	com/tencent/beacon/a/f:g	()Ljava/lang/String;
    //   862: aastore
    //   863: dup
    //   864: iconst_1
    //   865: aload_3
    //   866: invokevirtual 370	com/tencent/beacon/a/f:h	()J
    //   869: invokestatic 428	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   872: aastore
    //   873: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   876: iload 10
    //   878: istore 9
    //   880: iload 20
    //   882: istore 21
    //   884: iload 20
    //   886: istore 22
    //   888: aload_2
    //   889: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   892: bipush 101
    //   894: if_icmpeq +45 -> 939
    //   897: iload 10
    //   899: istore 9
    //   901: iload 20
    //   903: istore 21
    //   905: iload 20
    //   907: istore 22
    //   909: aload_2
    //   910: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   913: bipush 103
    //   915: if_icmpeq +24 -> 939
    //   918: iload 10
    //   920: istore 9
    //   922: iload 20
    //   924: istore 21
    //   926: iload 20
    //   928: istore 22
    //   930: aload_2
    //   931: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   934: bipush 105
    //   936: if_icmpne +200 -> 1136
    //   939: iload 10
    //   941: istore 9
    //   943: iload 20
    //   945: istore 21
    //   947: iload 20
    //   949: istore 22
    //   951: aload_0
    //   952: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   955: invokestatic 433	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   958: invokevirtual 436	com/tencent/beacon/a/b/c:d	()Lcom/tencent/beacon/a/b/e;
    //   961: astore_3
    //   962: aload_3
    //   963: ifnull +173 -> 1136
    //   966: iload 10
    //   968: istore 9
    //   970: iload 20
    //   972: istore 21
    //   974: iload 20
    //   976: istore 22
    //   978: aload_3
    //   979: invokevirtual 442	com/tencent/beacon/a/b/e:l	()B
    //   982: aload_2
    //   983: getfield 444	com/tencent/beacon/c/a/c:f	B
    //   986: if_icmpeq +23 -> 1009
    //   989: iload 10
    //   991: istore 9
    //   993: iload 20
    //   995: istore 21
    //   997: iload 20
    //   999: istore 22
    //   1001: aload_3
    //   1002: aload_2
    //   1003: getfield 444	com/tencent/beacon/c/a/c:f	B
    //   1006: invokevirtual 447	com/tencent/beacon/a/b/e:b	(B)V
    //   1009: iload 10
    //   1011: istore 9
    //   1013: iload 20
    //   1015: istore 21
    //   1017: iload 20
    //   1019: istore 22
    //   1021: aload_3
    //   1022: invokevirtual 449	com/tencent/beacon/a/b/e:k	()B
    //   1025: aload_2
    //   1026: getfield 451	com/tencent/beacon/c/a/c:e	B
    //   1029: if_icmpeq +23 -> 1052
    //   1032: iload 10
    //   1034: istore 9
    //   1036: iload 20
    //   1038: istore 21
    //   1040: iload 20
    //   1042: istore 22
    //   1044: aload_3
    //   1045: aload_2
    //   1046: getfield 451	com/tencent/beacon/c/a/c:e	B
    //   1049: invokevirtual 453	com/tencent/beacon/a/b/e:a	(B)V
    //   1052: iload 10
    //   1054: istore 9
    //   1056: iload 20
    //   1058: istore 21
    //   1060: iload 20
    //   1062: istore 22
    //   1064: aload_3
    //   1065: invokevirtual 455	com/tencent/beacon/a/b/e:m	()Ljava/lang/String;
    //   1068: ifnull +48 -> 1116
    //   1071: iload 10
    //   1073: istore 9
    //   1075: iload 20
    //   1077: istore 21
    //   1079: iload 20
    //   1081: istore 22
    //   1083: aload_2
    //   1084: getfield 457	com/tencent/beacon/c/a/c:h	Ljava/lang/String;
    //   1087: ifnull +49 -> 1136
    //   1090: iload 10
    //   1092: istore 9
    //   1094: iload 20
    //   1096: istore 21
    //   1098: iload 20
    //   1100: istore 22
    //   1102: aload_3
    //   1103: invokevirtual 455	com/tencent/beacon/a/b/e:m	()Ljava/lang/String;
    //   1106: aload_2
    //   1107: getfield 457	com/tencent/beacon/c/a/c:h	Ljava/lang/String;
    //   1110: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1113: ifne +23 -> 1136
    //   1116: iload 10
    //   1118: istore 9
    //   1120: iload 20
    //   1122: istore 21
    //   1124: iload 20
    //   1126: istore 22
    //   1128: aload_3
    //   1129: aload_2
    //   1130: getfield 457	com/tencent/beacon/c/a/c:h	Ljava/lang/String;
    //   1133: invokevirtual 458	com/tencent/beacon/a/b/e:b	(Ljava/lang/String;)V
    //   1136: iload 10
    //   1138: istore 9
    //   1140: iload 20
    //   1142: istore 21
    //   1144: iload 20
    //   1146: istore 22
    //   1148: aload_2
    //   1149: getfield 461	com/tencent/beacon/c/a/c:c	[B
    //   1152: astore_3
    //   1153: aload_3
    //   1154: ifnonnull +116 -> 1270
    //   1157: iload 10
    //   1159: istore 9
    //   1161: iload 20
    //   1163: istore 21
    //   1165: iload 20
    //   1167: istore 22
    //   1169: ldc_w 463
    //   1172: iconst_0
    //   1173: anewarray 4	java/lang/Object
    //   1176: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1179: goto -553 -> 626
    //   1182: astore_2
    //   1183: aload 5
    //   1185: invokevirtual 385	com/tencent/beacon/upload/e:a	()J
    //   1188: lstore 16
    //   1190: aload_0
    //   1191: iload 12
    //   1193: iload 9
    //   1195: lload 16
    //   1197: aload 5
    //   1199: invokevirtual 387	com/tencent/beacon/upload/e:b	()J
    //   1202: iconst_0
    //   1203: aload_2
    //   1204: invokevirtual 464	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1207: invokespecial 328	com/tencent/beacon/upload/i:a	(IIJJZLjava/lang/String;)V
    //   1210: iload 12
    //   1212: lload 16
    //   1214: iconst_0
    //   1215: lload 14
    //   1217: aload 5
    //   1219: invokevirtual 402	com/tencent/beacon/upload/e:d	()J
    //   1222: l2i
    //   1223: aload_1
    //   1224: invokevirtual 404	com/tencent/beacon/upload/a:f	()I
    //   1227: aload 4
    //   1229: aload 5
    //   1231: invokevirtual 405	com/tencent/beacon/upload/e:e	()Ljava/lang/String;
    //   1234: aload 5
    //   1236: invokevirtual 406	com/tencent/beacon/upload/e:c	()I
    //   1239: aload_2
    //   1240: invokevirtual 464	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1243: invokestatic 411	com/tencent/beacon/upload/i:a	(IJZJIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   1246: ldc_w 466
    //   1249: iconst_1
    //   1250: anewarray 4	java/lang/Object
    //   1253: dup
    //   1254: iconst_0
    //   1255: aload_2
    //   1256: invokevirtual 464	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1259: aastore
    //   1260: invokestatic 217	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1263: aload_1
    //   1264: iload 21
    //   1266: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   1269: return
    //   1270: iload 10
    //   1272: istore 9
    //   1274: iload 20
    //   1276: istore 21
    //   1278: iload 20
    //   1280: istore 22
    //   1282: aload_3
    //   1283: aload_2
    //   1284: getfield 444	com/tencent/beacon/c/a/c:f	B
    //   1287: aload_2
    //   1288: getfield 451	com/tencent/beacon/c/a/c:e	B
    //   1291: aload_2
    //   1292: getfield 469	com/tencent/beacon/c/a/c:i	Ljava/lang/String;
    //   1295: invokestatic 472	com/tencent/beacon/b/a:b	([BIILjava/lang/String;)[B
    //   1298: astore_3
    //   1299: iload 10
    //   1301: istore 9
    //   1303: iload 20
    //   1305: istore 21
    //   1307: iload 20
    //   1309: istore 22
    //   1311: aload_0
    //   1312: invokespecial 474	com/tencent/beacon/upload/i:e	()Landroid/util/SparseArray;
    //   1315: astore 6
    //   1317: aload 6
    //   1319: ifnull +23 -> 1342
    //   1322: iload 10
    //   1324: istore 9
    //   1326: iload 20
    //   1328: istore 21
    //   1330: iload 20
    //   1332: istore 22
    //   1334: aload 6
    //   1336: invokevirtual 269	android/util/SparseArray:size	()I
    //   1339: ifgt +37 -> 1376
    //   1342: iload 10
    //   1344: istore 9
    //   1346: iload 20
    //   1348: istore 21
    //   1350: iload 20
    //   1352: istore 22
    //   1354: ldc_w 476
    //   1357: iconst_0
    //   1358: anewarray 4	java/lang/Object
    //   1361: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1364: goto -738 -> 626
    //   1367: astore_2
    //   1368: aload_1
    //   1369: iload 22
    //   1371: invokevirtual 286	com/tencent/beacon/upload/a:b	(Z)V
    //   1374: aload_2
    //   1375: athrow
    //   1376: iload 10
    //   1378: istore 9
    //   1380: iload 20
    //   1382: istore 21
    //   1384: iload 20
    //   1386: istore 22
    //   1388: aload_1
    //   1389: invokevirtual 283	com/tencent/beacon/upload/a:c	()I
    //   1392: istore 11
    //   1394: iload 10
    //   1396: istore 9
    //   1398: iload 20
    //   1400: istore 21
    //   1402: iload 20
    //   1404: istore 22
    //   1406: aload_2
    //   1407: getfield 390	com/tencent/beacon/c/a/c:b	I
    //   1410: istore 13
    //   1412: iload 10
    //   1414: istore 9
    //   1416: iload 20
    //   1418: istore 21
    //   1420: iload 20
    //   1422: istore 22
    //   1424: aload_2
    //   1425: getfield 393	com/tencent/beacon/c/a/c:a	B
    //   1428: ifne +155 -> 1583
    //   1431: iload 11
    //   1433: ifle +150 -> 1583
    //   1436: iload 11
    //   1438: iconst_5
    //   1439: if_icmpgt +144 -> 1583
    //   1442: iload 10
    //   1444: istore 9
    //   1446: iload 20
    //   1448: istore 21
    //   1450: iload 20
    //   1452: istore 22
    //   1454: new 184	com/tencent/beacon/e/d
    //   1457: dup
    //   1458: aload_0
    //   1459: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   1462: invokespecial 187	com/tencent/beacon/e/d:<init>	(Landroid/content/Context;)V
    //   1465: astore 7
    //   1467: iload 10
    //   1469: istore 9
    //   1471: iload 20
    //   1473: istore 21
    //   1475: iload 20
    //   1477: istore 22
    //   1479: ldc_w 313
    //   1482: aload_0
    //   1483: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   1486: invokestatic 179	com/tencent/beacon/b/a:a	(Landroid/content/Context;)Lcom/tencent/beacon/b/a;
    //   1489: invokevirtual 478	com/tencent/beacon/b/a:b	()Ljava/lang/String;
    //   1492: invokevirtual 322	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1495: ifeq +88 -> 1583
    //   1498: iload 10
    //   1500: istore 9
    //   1502: iload 20
    //   1504: istore 21
    //   1506: iload 20
    //   1508: istore 22
    //   1510: invokestatic 480	com/tencent/beacon/a/b/e:a	()Lcom/tencent/beacon/a/b/e;
    //   1513: invokevirtual 483	com/tencent/beacon/a/b/e:j	()Z
    //   1516: ifne +67 -> 1583
    //   1519: iload 10
    //   1521: istore 9
    //   1523: iload 20
    //   1525: istore 21
    //   1527: iload 20
    //   1529: istore 22
    //   1531: new 485	com/tencent/beacon/upload/d
    //   1534: dup
    //   1535: aload_0
    //   1536: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   1539: invokespecial 486	com/tencent/beacon/upload/d:<init>	(Landroid/content/Context;)V
    //   1542: astore 8
    //   1544: iload 10
    //   1546: istore 9
    //   1548: iload 20
    //   1550: istore 21
    //   1552: iload 20
    //   1554: istore 22
    //   1556: invokestatic 489	com/tencent/beacon/a/b/c:b	()Lcom/tencent/beacon/upload/h;
    //   1559: aload 8
    //   1561: invokeinterface 491 2 0
    //   1566: iload 10
    //   1568: istore 9
    //   1570: iload 20
    //   1572: istore 21
    //   1574: iload 20
    //   1576: istore 22
    //   1578: aload 7
    //   1580: invokevirtual 493	com/tencent/beacon/e/d:c	()V
    //   1583: iload 13
    //   1585: ifne +259 -> 1844
    //   1588: iload 10
    //   1590: istore 9
    //   1592: iload 20
    //   1594: istore 21
    //   1596: iload 20
    //   1598: istore 22
    //   1600: ldc_w 495
    //   1603: iconst_0
    //   1604: anewarray 4	java/lang/Object
    //   1607: invokestatic 101	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1610: goto -984 -> 626
    //   1613: iload 10
    //   1615: istore 9
    //   1617: iload 20
    //   1619: istore 21
    //   1621: iload 20
    //   1623: istore 22
    //   1625: ldc_w 497
    //   1628: iconst_1
    //   1629: anewarray 4	java/lang/Object
    //   1632: dup
    //   1633: iconst_0
    //   1634: iload 11
    //   1636: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1639: aastore
    //   1640: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1643: goto -1017 -> 626
    //   1646: iload 13
    //   1648: bipush 101
    //   1650: if_icmpeq +140 -> 1790
    //   1653: iload 10
    //   1655: istore 9
    //   1657: iload 20
    //   1659: istore 21
    //   1661: iload 20
    //   1663: istore 22
    //   1665: ldc_w 499
    //   1668: iconst_2
    //   1669: anewarray 4	java/lang/Object
    //   1672: dup
    //   1673: iconst_0
    //   1674: iload 11
    //   1676: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1679: aastore
    //   1680: dup
    //   1681: iconst_1
    //   1682: iload 13
    //   1684: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1687: aastore
    //   1688: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1691: goto -1065 -> 626
    //   1694: iload 13
    //   1696: bipush 105
    //   1698: if_icmpeq +92 -> 1790
    //   1701: iload 10
    //   1703: istore 9
    //   1705: iload 20
    //   1707: istore 21
    //   1709: iload 20
    //   1711: istore 22
    //   1713: ldc_w 499
    //   1716: iconst_2
    //   1717: anewarray 4	java/lang/Object
    //   1720: dup
    //   1721: iconst_0
    //   1722: iload 11
    //   1724: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1727: aastore
    //   1728: dup
    //   1729: iconst_1
    //   1730: iload 13
    //   1732: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1735: aastore
    //   1736: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1739: goto -1113 -> 626
    //   1742: iload 13
    //   1744: bipush 103
    //   1746: if_icmpeq +44 -> 1790
    //   1749: iload 10
    //   1751: istore 9
    //   1753: iload 20
    //   1755: istore 21
    //   1757: iload 20
    //   1759: istore 22
    //   1761: ldc_w 501
    //   1764: iconst_2
    //   1765: anewarray 4	java/lang/Object
    //   1768: dup
    //   1769: iconst_0
    //   1770: iload 11
    //   1772: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1775: aastore
    //   1776: dup
    //   1777: iconst_1
    //   1778: iload 13
    //   1780: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1783: aastore
    //   1784: invokestatic 157	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1787: goto -1161 -> 626
    //   1790: iload 10
    //   1792: istore 9
    //   1794: iload 20
    //   1796: istore 21
    //   1798: iload 20
    //   1800: istore 22
    //   1802: aload_0
    //   1803: aload 6
    //   1805: iload 13
    //   1807: aload_3
    //   1808: invokespecial 503	com/tencent/beacon/upload/i:a	(Landroid/util/SparseArray;I[B)Z
    //   1811: pop
    //   1812: goto -1186 -> 626
    //   1815: astore_2
    //   1816: iload 21
    //   1818: istore 22
    //   1820: goto -452 -> 1368
    //   1823: astore 7
    //   1825: goto -242 -> 1583
    //   1828: aload_3
    //   1829: astore_2
    //   1830: goto -1352 -> 478
    //   1833: aload_1
    //   1834: ifnull -1208 -> 626
    //   1837: aload_2
    //   1838: ifnonnull -1110 -> 728
    //   1841: goto -1215 -> 626
    //   1844: iload 11
    //   1846: lookupswitch	default:+34->1880, 4:+-152->1694, 100:+-200->1646, 102:+-104->1742
    //   1880: goto -267 -> 1613
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1883	0	this	i
    //   0	1883	1	parama	a
    //   226	923	2	localObject1	Object
    //   1182	110	2	localThrowable	Throwable
    //   1367	58	2	localObject2	Object
    //   1815	1	2	localObject3	Object
    //   1829	9	2	localObject4	Object
    //   158	1671	3	localObject5	Object
    //   223	1005	4	str	String
    //   370	865	5	locale	e
    //   217	1587	6	localObject6	Object
    //   323	1256	7	localObject7	Object
    //   1823	1	7	localException	Exception
    //   1542	18	8	locald	d
    //   397	1396	9	i	int
    //   535	1256	10	j	int
    //   152	1693	11	k	int
    //   140	1071	12	m	int
    //   1410	396	13	n	int
    //   393	823	14	l1	long
    //   495	718	16	l2	long
    //   514	132	18	l3	long
    //   146	1653	20	bool1	boolean
    //   401	1416	21	bool2	boolean
    //   405	1414	22	bool3	boolean
    //   149	415	23	bool4	boolean
    //   143	425	24	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   407	419	1182	java/lang/Throwable
    //   442	452	1182	java/lang/Throwable
    //   464	478	1182	java/lang/Throwable
    //   490	497	1182	java/lang/Throwable
    //   509	516	1182	java/lang/Throwable
    //   528	533	1182	java/lang/Throwable
    //   553	559	1182	java/lang/Throwable
    //   571	578	1182	java/lang/Throwable
    //   593	623	1182	java/lang/Throwable
    //   638	653	1182	java/lang/Throwable
    //   665	715	1182	java/lang/Throwable
    //   740	744	1182	java/lang/Throwable
    //   760	767	1182	java/lang/Throwable
    //   779	790	1182	java/lang/Throwable
    //   802	811	1182	java/lang/Throwable
    //   823	837	1182	java/lang/Throwable
    //   849	876	1182	java/lang/Throwable
    //   888	897	1182	java/lang/Throwable
    //   909	918	1182	java/lang/Throwable
    //   930	939	1182	java/lang/Throwable
    //   951	962	1182	java/lang/Throwable
    //   978	989	1182	java/lang/Throwable
    //   1001	1009	1182	java/lang/Throwable
    //   1021	1032	1182	java/lang/Throwable
    //   1044	1052	1182	java/lang/Throwable
    //   1064	1071	1182	java/lang/Throwable
    //   1083	1090	1182	java/lang/Throwable
    //   1102	1116	1182	java/lang/Throwable
    //   1128	1136	1182	java/lang/Throwable
    //   1148	1153	1182	java/lang/Throwable
    //   1169	1179	1182	java/lang/Throwable
    //   1282	1299	1182	java/lang/Throwable
    //   1311	1317	1182	java/lang/Throwable
    //   1334	1342	1182	java/lang/Throwable
    //   1354	1364	1182	java/lang/Throwable
    //   1388	1394	1182	java/lang/Throwable
    //   1406	1412	1182	java/lang/Throwable
    //   1424	1431	1182	java/lang/Throwable
    //   1454	1467	1182	java/lang/Throwable
    //   1479	1498	1182	java/lang/Throwable
    //   1510	1519	1182	java/lang/Throwable
    //   1531	1544	1182	java/lang/Throwable
    //   1556	1566	1182	java/lang/Throwable
    //   1578	1583	1182	java/lang/Throwable
    //   1600	1610	1182	java/lang/Throwable
    //   1625	1643	1182	java/lang/Throwable
    //   1665	1691	1182	java/lang/Throwable
    //   1713	1739	1182	java/lang/Throwable
    //   1761	1787	1182	java/lang/Throwable
    //   1802	1812	1182	java/lang/Throwable
    //   407	419	1367	finally
    //   442	452	1367	finally
    //   464	478	1367	finally
    //   490	497	1367	finally
    //   509	516	1367	finally
    //   528	533	1367	finally
    //   553	559	1367	finally
    //   571	578	1367	finally
    //   593	623	1367	finally
    //   638	653	1367	finally
    //   665	715	1367	finally
    //   740	744	1367	finally
    //   760	767	1367	finally
    //   779	790	1367	finally
    //   802	811	1367	finally
    //   823	837	1367	finally
    //   849	876	1367	finally
    //   888	897	1367	finally
    //   909	918	1367	finally
    //   930	939	1367	finally
    //   951	962	1367	finally
    //   978	989	1367	finally
    //   1001	1009	1367	finally
    //   1021	1032	1367	finally
    //   1044	1052	1367	finally
    //   1064	1071	1367	finally
    //   1083	1090	1367	finally
    //   1102	1116	1367	finally
    //   1128	1136	1367	finally
    //   1148	1153	1367	finally
    //   1169	1179	1367	finally
    //   1282	1299	1367	finally
    //   1311	1317	1367	finally
    //   1334	1342	1367	finally
    //   1354	1364	1367	finally
    //   1388	1394	1367	finally
    //   1406	1412	1367	finally
    //   1424	1431	1367	finally
    //   1454	1467	1367	finally
    //   1479	1498	1367	finally
    //   1510	1519	1367	finally
    //   1531	1544	1367	finally
    //   1556	1566	1367	finally
    //   1578	1583	1367	finally
    //   1600	1610	1367	finally
    //   1625	1643	1367	finally
    //   1665	1691	1367	finally
    //   1713	1739	1367	finally
    //   1761	1787	1367	finally
    //   1802	1812	1367	finally
    //   1183	1263	1815	finally
    //   1479	1498	1823	java/lang/Exception
    //   1510	1519	1823	java/lang/Exception
    //   1531	1544	1823	java/lang/Exception
    //   1556	1566	1823	java/lang/Exception
    //   1578	1583	1823	java/lang/Exception
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.g = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a(int paramInt, g paramg)
  {
    boolean bool;
    if (paramg == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        this.b.append(paramInt, paramg);
        bool = true;
      }
      finally {}
    }
  }
  
  public final boolean a(UploadHandleListener paramUploadHandleListener)
  {
    boolean bool;
    if (paramUploadHandleListener == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        if (!this.c.contains(paramUploadHandleListener)) {
          this.c.add(paramUploadHandleListener);
        }
        bool = true;
      }
      finally {}
    }
  }
  
  /* Error */
  public final boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/tencent/beacon/upload/i:e	Landroid/content/Context;
    //   6: invokestatic 515	com/tencent/beacon/e/c:a	(Landroid/content/Context;)Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +9 -> 20
    //   14: iconst_1
    //   15: istore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: iload_2
    //   19: ireturn
    //   20: aload_0
    //   21: getfield 48	com/tencent/beacon/upload/i:g	Z
    //   24: istore_2
    //   25: goto -9 -> 16
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	i
    //   28	4	1	localObject	Object
    //   9	16	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	10	28	finally
    //   20	25	28	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */