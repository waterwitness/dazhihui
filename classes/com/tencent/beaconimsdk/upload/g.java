package com.tencent.beaconimsdk.upload;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.beaconimsdk.b.a.b;
import com.tencent.beaconimsdk.b.a.c;
import java.util.ArrayList;
import java.util.List;

public final class g
  implements f
{
  private static g a = null;
  private SparseArray<e> b = new SparseArray(5);
  private List<UploadHandleListener> c = new ArrayList(5);
  private d d;
  private Context e = null;
  private boolean f = true;
  
  private g(Context paramContext)
  {
    if (paramContext != null) {
      localContext = paramContext.getApplicationContext();
    }
    if (localContext != null) {}
    for (this.e = localContext;; this.e = paramContext)
    {
      this.d = d.a(this.e);
      return;
    }
  }
  
  private static c a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        Object localObject = com.tencent.beaconimsdk.a.b.d.a();
        if (localObject == null) {
          break label85;
        }
        int i = ((com.tencent.beaconimsdk.a.b.d)localObject).h();
        paramArrayOfByte = com.tencent.beaconimsdk.a.e.b(paramArrayOfByte, ((com.tencent.beaconimsdk.a.b.d)localObject).i(), i, ((com.tencent.beaconimsdk.a.b.d)localObject).l());
        if (paramArrayOfByte != null)
        {
          localObject = new com.tencent.beaconimsdk.d.d();
          ((com.tencent.beaconimsdk.d.d)localObject).a(paramArrayOfByte);
          paramArrayOfByte = new c();
          com.tencent.beaconimsdk.c.a.b(" covert to ResponsePackage ", new Object[0]);
          paramArrayOfByte = (c)((com.tencent.beaconimsdk.d.d)localObject).b("detail", paramArrayOfByte);
          return paramArrayOfByte;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
      }
      return null;
      label85:
      paramArrayOfByte = null;
    }
  }
  
  public static g a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        a = new g(paramContext);
        com.tencent.beaconimsdk.c.a.h(" create uphandler up:true", new Object[0]);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    UploadHandleListener[] arrayOfUploadHandleListener = b();
    if (arrayOfUploadHandleListener != null)
    {
      int j = arrayOfUploadHandleListener.length;
      int i = 0;
      while (i < j)
      {
        arrayOfUploadHandleListener[i].onUploadEnd(paramInt1, paramInt2, 0L, 0L, paramBoolean, paramString);
        i += 1;
      }
    }
  }
  
  private static boolean a(SparseArray<e> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramSparseArray == null) || (paramArrayOfByte == null)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      paramSparseArray = (e)paramSparseArray.get(paramInt);
      if (paramSparseArray == null)
      {
        com.tencent.beaconimsdk.c.a.c(" no handler key:%d", new Object[] { Integer.valueOf(paramInt) });
        return false;
      }
      break;
    case 103: 
      return true;
    }
    try
    {
      com.tencent.beaconimsdk.c.a.b(" key:%d  handler: %s", new Object[] { Integer.valueOf(paramInt), paramSparseArray.getClass().toString() });
      paramSparseArray.a(paramInt, paramArrayOfByte, true);
      return true;
    }
    catch (Throwable paramSparseArray)
    {
      com.tencent.beaconimsdk.c.a.a(paramSparseArray);
      com.tencent.beaconimsdk.c.a.d(" handle error key:%d", new Object[] { Integer.valueOf(paramInt) });
    }
    return false;
  }
  
  private static byte[] b(a parama)
  {
    if (parama != null) {
      try
      {
        Object localObject1 = parama.a();
        if (localObject1 != null)
        {
          com.tencent.beaconimsdk.c.a.b(" RequestPackage info appkey:%s sdkid:%s appVersion:%s cmd: %d", new Object[] { ((b)localObject1).b, ((b)localObject1).d, ((b)localObject1).c, Integer.valueOf(((b)localObject1).f) });
          Object localObject2 = new com.tencent.beaconimsdk.d.d();
          ((com.tencent.beaconimsdk.d.d)localObject2).a();
          ((com.tencent.beaconimsdk.d.d)localObject2).b("test");
          ((com.tencent.beaconimsdk.d.d)localObject2).a("test");
          ((com.tencent.beaconimsdk.d.d)localObject2).a("detail", localObject1);
          localObject1 = ((com.tencent.beaconimsdk.d.d)localObject2).b();
          localObject2 = com.tencent.beaconimsdk.a.b.d.a();
          if (localObject2 != null)
          {
            int i = ((com.tencent.beaconimsdk.a.b.d)localObject2).h();
            localObject1 = com.tencent.beaconimsdk.a.e.a((byte[])localObject1, ((com.tencent.beaconimsdk.a.b.d)localObject2).i(), i, ((com.tencent.beaconimsdk.a.b.d)localObject2).l());
            return (byte[])localObject1;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        com.tencent.beaconimsdk.c.a.d(" parseSendDatas error", new Object[0]);
        com.tencent.beaconimsdk.c.a.a(localThrowable);
        parama.b();
      }
    }
    return null;
  }
  
  /* Error */
  private UploadHandleListener[] b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/tencent/beaconimsdk/upload/g:c	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 41	com/tencent/beaconimsdk/upload/g:c	Ljava/util/List;
    //   13: invokeinterface 207 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 41	com/tencent/beaconimsdk/upload/g:c	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 119	com/tencent/beaconimsdk/upload/UploadHandleListener
    //   29: invokeinterface 211 2 0
    //   34: checkcast 213	[Lcom/tencent/beaconimsdk/upload/UploadHandleListener;
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
    //   0	52	0	this	g
    //   37	7	1	arrayOfUploadHandleListener	UploadHandleListener[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  private d c()
  {
    try
    {
      d locald = this.d;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private SparseArray<e> d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/tencent/beaconimsdk/upload/g:b	Landroid/util/SparseArray;
    //   6: ifnull +33 -> 39
    //   9: aload_0
    //   10: getfield 36	com/tencent/beaconimsdk/upload/g:b	Landroid/util/SparseArray;
    //   13: invokevirtual 216	android/util/SparseArray:size	()I
    //   16: ifle +23 -> 39
    //   19: new 218	com/tencent/beaconimsdk/c/b
    //   22: dup
    //   23: invokespecial 219	com/tencent/beaconimsdk/c/b:<init>	()V
    //   26: pop
    //   27: aload_0
    //   28: getfield 36	com/tencent/beaconimsdk/upload/g:b	Landroid/util/SparseArray;
    //   31: invokestatic 222	com/tencent/beaconimsdk/c/b:a	(Landroid/util/SparseArray;)Landroid/util/SparseArray;
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
    //   0	49	0	this	g
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
    //   1: invokevirtual 227	com/tencent/beaconimsdk/upload/g:a	()Z
    //   4: ifne +61 -> 65
    //   7: aload_1
    //   8: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   11: iconst_2
    //   12: if_icmpne +17 -> 29
    //   15: ldc -25
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: aload_1
    //   25: iconst_0
    //   26: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   29: aload_1
    //   30: getfield 236	com/tencent/beaconimsdk/upload/a:b	I
    //   33: ifeq +23 -> 56
    //   36: ldc -18
    //   38: iconst_1
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: aload_1
    //   45: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   48: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: aastore
    //   52: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: return
    //   56: ldc -16
    //   58: iconst_0
    //   59: anewarray 4	java/lang/Object
    //   62: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_0
    //   66: getfield 43	com/tencent/beaconimsdk/upload/g:e	Landroid/content/Context;
    //   69: invokestatic 244	com/tencent/beaconimsdk/a/e:m	(Landroid/content/Context;)Z
    //   72: ifne +26 -> 98
    //   75: ldc -10
    //   77: iconst_0
    //   78: anewarray 4	java/lang/Object
    //   81: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_1
    //   85: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   88: iconst_2
    //   89: if_icmpne -34 -> 55
    //   92: aload_1
    //   93: iconst_0
    //   94: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   97: return
    //   98: aload_1
    //   99: ifnonnull +13 -> 112
    //   102: ldc -8
    //   104: iconst_0
    //   105: anewarray 4	java/lang/Object
    //   108: invokestatic 158	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: return
    //   112: aload_1
    //   113: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   116: istore 9
    //   118: aload_1
    //   119: invokevirtual 250	com/tencent/beaconimsdk/upload/a:e	()Ljava/lang/String;
    //   122: astore 4
    //   124: aload 4
    //   126: ifnull +16 -> 142
    //   129: ldc -4
    //   131: aload 4
    //   133: invokevirtual 257	java/lang/String:trim	()Ljava/lang/String;
    //   136: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   139: ifeq +38 -> 177
    //   142: ldc_w 263
    //   145: iconst_0
    //   146: anewarray 4	java/lang/Object
    //   149: invokestatic 158	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_1
    //   153: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   156: iconst_2
    //   157: if_icmpne +8 -> 165
    //   160: aload_1
    //   161: iconst_0
    //   162: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   165: aload_0
    //   166: iload 9
    //   168: iconst_m1
    //   169: iconst_0
    //   170: ldc_w 265
    //   173: invokespecial 267	com/tencent/beaconimsdk/upload/g:a	(IIZLjava/lang/String;)V
    //   176: return
    //   177: aload_1
    //   178: invokestatic 269	com/tencent/beaconimsdk/upload/g:b	(Lcom/tencent/beaconimsdk/upload/a;)[B
    //   181: astore 5
    //   183: aload_1
    //   184: invokevirtual 271	com/tencent/beaconimsdk/upload/a:d	()Ljava/lang/String;
    //   187: astore_3
    //   188: aconst_null
    //   189: astore_2
    //   190: aload_3
    //   191: ifnull +21 -> 212
    //   194: new 273	java/lang/StringBuilder
    //   197: dup
    //   198: ldc_w 275
    //   201: invokespecial 277	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   204: aload_3
    //   205: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: invokevirtual 282	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: astore_2
    //   212: invokestatic 66	com/tencent/beaconimsdk/a/b/d:a	()Lcom/tencent/beaconimsdk/a/b/d;
    //   215: astore 6
    //   217: aload_2
    //   218: astore_3
    //   219: aload 6
    //   221: ifnull +52 -> 273
    //   224: aload 6
    //   226: invokevirtual 284	com/tencent/beaconimsdk/a/b/d:m	()Ljava/lang/String;
    //   229: astore 6
    //   231: aload_2
    //   232: astore_3
    //   233: aload 6
    //   235: ifnull +38 -> 273
    //   238: aload_2
    //   239: astore_3
    //   240: ldc -4
    //   242: aload 6
    //   244: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   247: ifne +26 -> 273
    //   250: aload_2
    //   251: ifnonnull +105 -> 356
    //   254: new 273	java/lang/StringBuilder
    //   257: dup
    //   258: ldc_w 286
    //   261: invokespecial 277	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   264: aload 6
    //   266: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 282	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: astore_3
    //   273: aload_3
    //   274: ifnull +1127 -> 1401
    //   277: new 273	java/lang/StringBuilder
    //   280: dup
    //   281: invokespecial 287	java/lang/StringBuilder:<init>	()V
    //   284: aload 4
    //   286: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: aload_3
    //   290: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: invokevirtual 282	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   296: astore_2
    //   297: ldc_w 289
    //   300: iconst_3
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: iload 9
    //   308: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: aload_2
    //   315: aastore
    //   316: dup
    //   317: iconst_2
    //   318: aload_1
    //   319: invokevirtual 146	java/lang/Object:getClass	()Ljava/lang/Class;
    //   322: invokevirtual 151	java/lang/Class:toString	()Ljava/lang/String;
    //   325: aastore
    //   326: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: aload 5
    //   331: ifnonnull +54 -> 385
    //   334: ldc_w 291
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: aload_0
    //   345: iload 9
    //   347: iconst_m1
    //   348: iconst_0
    //   349: ldc_w 293
    //   352: invokespecial 267	com/tencent/beaconimsdk/upload/g:a	(IIZLjava/lang/String;)V
    //   355: return
    //   356: new 273	java/lang/StringBuilder
    //   359: dup
    //   360: invokespecial 287	java/lang/StringBuilder:<init>	()V
    //   363: aload_2
    //   364: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: ldc_w 295
    //   370: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload 6
    //   375: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: invokevirtual 282	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: astore_3
    //   382: goto -109 -> 273
    //   385: aload_0
    //   386: invokespecial 297	com/tencent/beaconimsdk/upload/g:c	()Lcom/tencent/beaconimsdk/upload/d;
    //   389: astore 4
    //   391: aload 4
    //   393: ifnonnull +25 -> 418
    //   396: ldc_w 299
    //   399: iconst_0
    //   400: anewarray 4	java/lang/Object
    //   403: invokestatic 158	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: aload_0
    //   407: iload 9
    //   409: iconst_m1
    //   410: iconst_0
    //   411: ldc_w 301
    //   414: invokespecial 267	com/tencent/beaconimsdk/upload/g:a	(IIZLjava/lang/String;)V
    //   417: return
    //   418: aload_0
    //   419: getfield 43	com/tencent/beaconimsdk/upload/g:e	Landroid/content/Context;
    //   422: invokestatic 304	com/tencent/beaconimsdk/a/e:f	(Landroid/content/Context;)Ljava/lang/String;
    //   425: pop
    //   426: invokestatic 309	com/tencent/beaconimsdk/a/c:m	()Lcom/tencent/beaconimsdk/a/c;
    //   429: invokevirtual 312	com/tencent/beaconimsdk/a/c:h	()J
    //   432: pop2
    //   433: new 314	java/util/Date
    //   436: dup
    //   437: invokespecial 315	java/util/Date:<init>	()V
    //   440: invokevirtual 318	java/util/Date:getTime	()J
    //   443: pop2
    //   444: aload 4
    //   446: aload_2
    //   447: aload 5
    //   449: aload_1
    //   450: invokevirtual 321	com/tencent/beaconimsdk/upload/d:a	(Ljava/lang/String;[BLcom/tencent/beaconimsdk/upload/a;)[B
    //   453: astore_3
    //   454: aload_3
    //   455: ifnonnull +941 -> 1396
    //   458: iload 9
    //   460: bipush 100
    //   462: if_icmpne +934 -> 1396
    //   465: ldc_w 323
    //   468: aload_2
    //   469: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   472: ifne +924 -> 1396
    //   475: aload 4
    //   477: ldc_w 323
    //   480: aload 5
    //   482: aload_1
    //   483: invokevirtual 321	com/tencent/beaconimsdk/upload/d:a	(Ljava/lang/String;[BLcom/tencent/beaconimsdk/upload/a;)[B
    //   486: astore_2
    //   487: aload_2
    //   488: invokestatic 325	com/tencent/beaconimsdk/upload/g:a	([B)Lcom/tencent/beaconimsdk/b/a/c;
    //   491: astore_2
    //   492: aload_2
    //   493: ifnull +894 -> 1387
    //   496: aload_2
    //   497: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   500: istore 8
    //   502: aload_2
    //   503: getfield 329	com/tencent/beaconimsdk/b/a/c:a	B
    //   506: istore 7
    //   508: iload 7
    //   510: ifne +81 -> 591
    //   513: iconst_1
    //   514: istore 12
    //   516: iload 8
    //   518: istore 7
    //   520: iload 12
    //   522: istore 14
    //   524: iload 12
    //   526: istore 13
    //   528: ldc_w 331
    //   531: iconst_2
    //   532: anewarray 4	java/lang/Object
    //   535: dup
    //   536: iconst_0
    //   537: aload_2
    //   538: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   541: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   544: aastore
    //   545: dup
    //   546: iconst_1
    //   547: aload_2
    //   548: getfield 329	com/tencent/beaconimsdk/b/a/c:a	B
    //   551: invokestatic 336	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   554: aastore
    //   555: invokestatic 98	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   558: goto +849 -> 1407
    //   561: iload 8
    //   563: istore 7
    //   565: iload 12
    //   567: istore 14
    //   569: iload 12
    //   571: istore 13
    //   573: aload_0
    //   574: iload 9
    //   576: iload 8
    //   578: iload 12
    //   580: aconst_null
    //   581: invokespecial 267	com/tencent/beaconimsdk/upload/g:a	(IIZLjava/lang/String;)V
    //   584: aload_1
    //   585: iload 12
    //   587: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   590: return
    //   591: iconst_0
    //   592: istore 12
    //   594: goto -78 -> 516
    //   597: iload 8
    //   599: istore 7
    //   601: iload 12
    //   603: istore 14
    //   605: iload 12
    //   607: istore 13
    //   609: invokestatic 309	com/tencent/beaconimsdk/a/c:m	()Lcom/tencent/beaconimsdk/a/c;
    //   612: astore_3
    //   613: aload_3
    //   614: ifnull +131 -> 745
    //   617: iload 8
    //   619: istore 7
    //   621: iload 12
    //   623: istore 14
    //   625: iload 12
    //   627: istore 13
    //   629: aload_2
    //   630: getfield 337	com/tencent/beaconimsdk/b/a/c:d	Ljava/lang/String;
    //   633: ifnull +26 -> 659
    //   636: iload 8
    //   638: istore 7
    //   640: iload 12
    //   642: istore 14
    //   644: iload 12
    //   646: istore 13
    //   648: aload_3
    //   649: aload_2
    //   650: getfield 337	com/tencent/beaconimsdk/b/a/c:d	Ljava/lang/String;
    //   653: invokevirtual 257	java/lang/String:trim	()Ljava/lang/String;
    //   656: invokevirtual 338	com/tencent/beaconimsdk/a/c:b	(Ljava/lang/String;)V
    //   659: iload 8
    //   661: istore 7
    //   663: iload 12
    //   665: istore 14
    //   667: iload 12
    //   669: istore 13
    //   671: new 314	java/util/Date
    //   674: dup
    //   675: invokespecial 315	java/util/Date:<init>	()V
    //   678: astore 4
    //   680: iload 8
    //   682: istore 7
    //   684: iload 12
    //   686: istore 14
    //   688: iload 12
    //   690: istore 13
    //   692: aload_3
    //   693: aload_2
    //   694: getfield 341	com/tencent/beaconimsdk/b/a/c:e	J
    //   697: aload 4
    //   699: invokevirtual 318	java/util/Date:getTime	()J
    //   702: lsub
    //   703: invokevirtual 344	com/tencent/beaconimsdk/a/c:a	(J)V
    //   706: iload 8
    //   708: istore 7
    //   710: iload 12
    //   712: istore 14
    //   714: iload 12
    //   716: istore 13
    //   718: ldc_w 346
    //   721: iconst_2
    //   722: anewarray 4	java/lang/Object
    //   725: dup
    //   726: iconst_0
    //   727: aload_3
    //   728: invokevirtual 349	com/tencent/beaconimsdk/a/c:g	()Ljava/lang/String;
    //   731: aastore
    //   732: dup
    //   733: iconst_1
    //   734: aload_3
    //   735: invokevirtual 312	com/tencent/beaconimsdk/a/c:h	()J
    //   738: invokestatic 354	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   741: aastore
    //   742: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   745: iload 8
    //   747: istore 7
    //   749: iload 12
    //   751: istore 14
    //   753: iload 12
    //   755: istore 13
    //   757: aload_2
    //   758: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   761: bipush 101
    //   763: if_icmpeq +45 -> 808
    //   766: iload 8
    //   768: istore 7
    //   770: iload 12
    //   772: istore 14
    //   774: iload 12
    //   776: istore 13
    //   778: aload_2
    //   779: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   782: bipush 103
    //   784: if_icmpeq +24 -> 808
    //   787: iload 8
    //   789: istore 7
    //   791: iload 12
    //   793: istore 14
    //   795: iload 12
    //   797: istore 13
    //   799: aload_2
    //   800: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   803: bipush 105
    //   805: if_icmpne +114 -> 919
    //   808: iload 8
    //   810: istore 7
    //   812: iload 12
    //   814: istore 14
    //   816: iload 12
    //   818: istore 13
    //   820: aload_0
    //   821: getfield 43	com/tencent/beaconimsdk/upload/g:e	Landroid/content/Context;
    //   824: invokestatic 359	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   827: invokevirtual 361	com/tencent/beaconimsdk/a/b/b:e	()Lcom/tencent/beaconimsdk/a/b/d;
    //   830: astore_3
    //   831: aload_3
    //   832: ifnull +87 -> 919
    //   835: iload 8
    //   837: istore 7
    //   839: iload 12
    //   841: istore 14
    //   843: iload 12
    //   845: istore 13
    //   847: aload_3
    //   848: invokevirtual 364	com/tencent/beaconimsdk/a/b/d:j	()Ljava/lang/String;
    //   851: ifnull +48 -> 899
    //   854: iload 8
    //   856: istore 7
    //   858: iload 12
    //   860: istore 14
    //   862: iload 12
    //   864: istore 13
    //   866: aload_2
    //   867: getfield 366	com/tencent/beaconimsdk/b/a/c:f	Ljava/lang/String;
    //   870: ifnull +49 -> 919
    //   873: iload 8
    //   875: istore 7
    //   877: iload 12
    //   879: istore 14
    //   881: iload 12
    //   883: istore 13
    //   885: aload_3
    //   886: invokevirtual 364	com/tencent/beaconimsdk/a/b/d:j	()Ljava/lang/String;
    //   889: aload_2
    //   890: getfield 366	com/tencent/beaconimsdk/b/a/c:f	Ljava/lang/String;
    //   893: invokevirtual 261	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   896: ifne +23 -> 919
    //   899: iload 8
    //   901: istore 7
    //   903: iload 12
    //   905: istore 14
    //   907: iload 12
    //   909: istore 13
    //   911: aload_3
    //   912: aload_2
    //   913: getfield 366	com/tencent/beaconimsdk/b/a/c:f	Ljava/lang/String;
    //   916: invokevirtual 367	com/tencent/beaconimsdk/a/b/d:b	(Ljava/lang/String;)V
    //   919: iload 8
    //   921: istore 7
    //   923: iload 12
    //   925: istore 14
    //   927: iload 12
    //   929: istore 13
    //   931: aload_2
    //   932: getfield 370	com/tencent/beaconimsdk/b/a/c:c	[B
    //   935: astore_3
    //   936: aload_3
    //   937: ifnonnull +78 -> 1015
    //   940: iload 8
    //   942: istore 7
    //   944: iload 12
    //   946: istore 14
    //   948: iload 12
    //   950: istore 13
    //   952: ldc_w 372
    //   955: iconst_0
    //   956: anewarray 4	java/lang/Object
    //   959: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   962: goto -401 -> 561
    //   965: astore_2
    //   966: iload 14
    //   968: istore 12
    //   970: iload 12
    //   972: istore 13
    //   974: aload_0
    //   975: iload 9
    //   977: iload 7
    //   979: iconst_0
    //   980: aload_2
    //   981: invokevirtual 373	java/lang/Throwable:toString	()Ljava/lang/String;
    //   984: invokespecial 267	com/tencent/beaconimsdk/upload/g:a	(IIZLjava/lang/String;)V
    //   987: iload 12
    //   989: istore 13
    //   991: ldc_w 375
    //   994: iconst_1
    //   995: anewarray 4	java/lang/Object
    //   998: dup
    //   999: iconst_0
    //   1000: aload_2
    //   1001: invokevirtual 373	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1004: aastore
    //   1005: invokestatic 158	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1008: aload_1
    //   1009: iload 12
    //   1011: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   1014: return
    //   1015: iload 8
    //   1017: istore 7
    //   1019: iload 12
    //   1021: istore 14
    //   1023: iload 12
    //   1025: istore 13
    //   1027: aload_0
    //   1028: invokespecial 377	com/tencent/beaconimsdk/upload/g:d	()Landroid/util/SparseArray;
    //   1031: astore 4
    //   1033: aload 4
    //   1035: ifnull +23 -> 1058
    //   1038: iload 8
    //   1040: istore 7
    //   1042: iload 12
    //   1044: istore 14
    //   1046: iload 12
    //   1048: istore 13
    //   1050: aload 4
    //   1052: invokevirtual 216	android/util/SparseArray:size	()I
    //   1055: ifgt +37 -> 1092
    //   1058: iload 8
    //   1060: istore 7
    //   1062: iload 12
    //   1064: istore 14
    //   1066: iload 12
    //   1068: istore 13
    //   1070: ldc_w 379
    //   1073: iconst_0
    //   1074: anewarray 4	java/lang/Object
    //   1077: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1080: goto -519 -> 561
    //   1083: astore_2
    //   1084: aload_1
    //   1085: iload 13
    //   1087: invokevirtual 234	com/tencent/beaconimsdk/upload/a:b	(Z)V
    //   1090: aload_2
    //   1091: athrow
    //   1092: iload 8
    //   1094: istore 7
    //   1096: iload 12
    //   1098: istore 14
    //   1100: iload 12
    //   1102: istore 13
    //   1104: aload_1
    //   1105: invokevirtual 229	com/tencent/beaconimsdk/upload/a:c	()I
    //   1108: istore 10
    //   1110: iload 8
    //   1112: istore 7
    //   1114: iload 12
    //   1116: istore 14
    //   1118: iload 12
    //   1120: istore 13
    //   1122: aload_2
    //   1123: getfield 326	com/tencent/beaconimsdk/b/a/c:b	I
    //   1126: istore 11
    //   1128: iload 11
    //   1130: ifne +288 -> 1418
    //   1133: iload 8
    //   1135: istore 7
    //   1137: iload 12
    //   1139: istore 14
    //   1141: iload 12
    //   1143: istore 13
    //   1145: ldc_w 381
    //   1148: iconst_0
    //   1149: anewarray 4	java/lang/Object
    //   1152: invokestatic 113	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1155: goto -594 -> 561
    //   1158: iload 8
    //   1160: istore 7
    //   1162: iload 12
    //   1164: istore 14
    //   1166: iload 12
    //   1168: istore 13
    //   1170: ldc_w 383
    //   1173: iconst_1
    //   1174: anewarray 4	java/lang/Object
    //   1177: dup
    //   1178: iconst_0
    //   1179: iload 10
    //   1181: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1184: aastore
    //   1185: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1188: goto -627 -> 561
    //   1191: iload 11
    //   1193: bipush 101
    //   1195: if_icmpeq +140 -> 1335
    //   1198: iload 8
    //   1200: istore 7
    //   1202: iload 12
    //   1204: istore 14
    //   1206: iload 12
    //   1208: istore 13
    //   1210: ldc_w 385
    //   1213: iconst_2
    //   1214: anewarray 4	java/lang/Object
    //   1217: dup
    //   1218: iconst_0
    //   1219: iload 10
    //   1221: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1224: aastore
    //   1225: dup
    //   1226: iconst_1
    //   1227: iload 11
    //   1229: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1232: aastore
    //   1233: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1236: goto -675 -> 561
    //   1239: iload 11
    //   1241: bipush 105
    //   1243: if_icmpeq +92 -> 1335
    //   1246: iload 8
    //   1248: istore 7
    //   1250: iload 12
    //   1252: istore 14
    //   1254: iload 12
    //   1256: istore 13
    //   1258: ldc_w 385
    //   1261: iconst_2
    //   1262: anewarray 4	java/lang/Object
    //   1265: dup
    //   1266: iconst_0
    //   1267: iload 10
    //   1269: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1272: aastore
    //   1273: dup
    //   1274: iconst_1
    //   1275: iload 11
    //   1277: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1280: aastore
    //   1281: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1284: goto -723 -> 561
    //   1287: iload 11
    //   1289: bipush 103
    //   1291: if_icmpeq +44 -> 1335
    //   1294: iload 8
    //   1296: istore 7
    //   1298: iload 12
    //   1300: istore 14
    //   1302: iload 12
    //   1304: istore 13
    //   1306: ldc_w 387
    //   1309: iconst_2
    //   1310: anewarray 4	java/lang/Object
    //   1313: dup
    //   1314: iconst_0
    //   1315: iload 10
    //   1317: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1320: aastore
    //   1321: dup
    //   1322: iconst_1
    //   1323: iload 11
    //   1325: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1328: aastore
    //   1329: invokestatic 140	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1332: goto -771 -> 561
    //   1335: iload 8
    //   1337: istore 7
    //   1339: iload 12
    //   1341: istore 14
    //   1343: iload 12
    //   1345: istore 13
    //   1347: aload 4
    //   1349: iload 11
    //   1351: aload_3
    //   1352: invokestatic 389	com/tencent/beaconimsdk/upload/g:a	(Landroid/util/SparseArray;I[B)Z
    //   1355: pop
    //   1356: goto -795 -> 561
    //   1359: astore_2
    //   1360: iconst_0
    //   1361: istore 13
    //   1363: goto -279 -> 1084
    //   1366: astore_2
    //   1367: iconst_m1
    //   1368: istore 7
    //   1370: iconst_0
    //   1371: istore 12
    //   1373: goto -403 -> 970
    //   1376: astore_2
    //   1377: iconst_0
    //   1378: istore 12
    //   1380: iload 8
    //   1382: istore 7
    //   1384: goto -414 -> 970
    //   1387: iconst_m1
    //   1388: istore 8
    //   1390: iconst_0
    //   1391: istore 12
    //   1393: goto +14 -> 1407
    //   1396: aload_3
    //   1397: astore_2
    //   1398: goto -911 -> 487
    //   1401: aload 4
    //   1403: astore_2
    //   1404: goto -1107 -> 297
    //   1407: aload_1
    //   1408: ifnull -847 -> 561
    //   1411: aload_2
    //   1412: ifnonnull -815 -> 597
    //   1415: goto -854 -> 561
    //   1418: iload 10
    //   1420: lookupswitch	default:+36->1456, 4:+-181->1239, 100:+-229->1191, 102:+-133->1287
    //   1456: goto -298 -> 1158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1459	0	this	g
    //   0	1459	1	parama	a
    //   189	743	2	localObject1	Object
    //   965	36	2	localThrowable1	Throwable
    //   1083	40	2	localObject2	Object
    //   1359	1	2	localObject3	Object
    //   1366	1	2	localThrowable2	Throwable
    //   1376	1	2	localThrowable3	Throwable
    //   1397	15	2	localObject4	Object
    //   187	1210	3	localObject5	Object
    //   122	1280	4	localObject6	Object
    //   181	300	5	arrayOfByte	byte[]
    //   215	159	6	localObject7	Object
    //   506	877	7	i	int
    //   500	889	8	j	int
    //   116	860	9	k	int
    //   1108	311	10	m	int
    //   1126	224	11	n	int
    //   514	878	12	bool1	boolean
    //   526	836	13	bool2	boolean
    //   522	820	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   528	558	965	java/lang/Throwable
    //   573	584	965	java/lang/Throwable
    //   609	613	965	java/lang/Throwable
    //   629	636	965	java/lang/Throwable
    //   648	659	965	java/lang/Throwable
    //   671	680	965	java/lang/Throwable
    //   692	706	965	java/lang/Throwable
    //   718	745	965	java/lang/Throwable
    //   757	766	965	java/lang/Throwable
    //   778	787	965	java/lang/Throwable
    //   799	808	965	java/lang/Throwable
    //   820	831	965	java/lang/Throwable
    //   847	854	965	java/lang/Throwable
    //   866	873	965	java/lang/Throwable
    //   885	899	965	java/lang/Throwable
    //   911	919	965	java/lang/Throwable
    //   931	936	965	java/lang/Throwable
    //   952	962	965	java/lang/Throwable
    //   1027	1033	965	java/lang/Throwable
    //   1050	1058	965	java/lang/Throwable
    //   1070	1080	965	java/lang/Throwable
    //   1104	1110	965	java/lang/Throwable
    //   1122	1128	965	java/lang/Throwable
    //   1145	1155	965	java/lang/Throwable
    //   1170	1188	965	java/lang/Throwable
    //   1210	1236	965	java/lang/Throwable
    //   1258	1284	965	java/lang/Throwable
    //   1306	1332	965	java/lang/Throwable
    //   1347	1356	965	java/lang/Throwable
    //   528	558	1083	finally
    //   573	584	1083	finally
    //   609	613	1083	finally
    //   629	636	1083	finally
    //   648	659	1083	finally
    //   671	680	1083	finally
    //   692	706	1083	finally
    //   718	745	1083	finally
    //   757	766	1083	finally
    //   778	787	1083	finally
    //   799	808	1083	finally
    //   820	831	1083	finally
    //   847	854	1083	finally
    //   866	873	1083	finally
    //   885	899	1083	finally
    //   911	919	1083	finally
    //   931	936	1083	finally
    //   952	962	1083	finally
    //   974	987	1083	finally
    //   991	1008	1083	finally
    //   1027	1033	1083	finally
    //   1050	1058	1083	finally
    //   1070	1080	1083	finally
    //   1104	1110	1083	finally
    //   1122	1128	1083	finally
    //   1145	1155	1083	finally
    //   1170	1188	1083	finally
    //   1210	1236	1083	finally
    //   1258	1284	1083	finally
    //   1306	1332	1083	finally
    //   1347	1356	1083	finally
    //   444	454	1359	finally
    //   465	487	1359	finally
    //   487	492	1359	finally
    //   496	502	1359	finally
    //   502	508	1359	finally
    //   444	454	1366	java/lang/Throwable
    //   465	487	1366	java/lang/Throwable
    //   487	492	1366	java/lang/Throwable
    //   496	502	1366	java/lang/Throwable
    //   502	508	1376	java/lang/Throwable
  }
  
  public final void a(boolean paramBoolean)
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
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	com/tencent/beaconimsdk/upload/g:e	Landroid/content/Context;
    //   6: invokestatic 391	com/tencent/beaconimsdk/a/e:l	(Landroid/content/Context;)Z
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
    //   21: getfield 45	com/tencent/beaconimsdk/upload/g:f	Z
    //   24: istore_2
    //   25: goto -9 -> 16
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	g
    //   28	4	1	localObject	Object
    //   9	16	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	10	28	finally
    //   20	25	28	finally
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
  
  public final boolean a(e parame)
  {
    boolean bool;
    if (parame == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        this.b.append(101, parame);
        bool = true;
      }
      finally {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */