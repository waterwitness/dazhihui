package com.tencent.feedback.upload;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.feedback.proguard.B;
import com.tencent.feedback.proguard.C;
import com.tencent.feedback.proguard.D;
import com.tencent.feedback.proguard.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f
  implements e
{
  private static f a = null;
  private SparseArray<d> b = new SparseArray(5);
  private List<UploadHandleListener> c = new ArrayList(5);
  private c d;
  private Context e = null;
  private boolean f = true;
  private int g = 0;
  
  private f(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null) {}
    for (;;)
    {
      this.e = paramContext;
      this.f = paramBoolean;
      this.d = c.a(this.e);
      return;
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        paramContext = localContext;
      }
    }
  }
  
  private int a()
  {
    try
    {
      int i = this.g;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static D a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        com.tencent.feedback.proguard.d locald = new com.tencent.feedback.proguard.d();
        locald.d();
        locald.a(paramArrayOfByte);
        paramArrayOfByte = locald.b("detail", new D());
        if (D.class.isInstance(paramArrayOfByte))
        {
          com.tencent.feedback.common.e.b("rqdp{  covert to ResponsePackage}", new Object[0]);
          paramArrayOfByte = (D)D.class.cast(paramArrayOfByte);
          return paramArrayOfByte;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
      }
    }
    return null;
  }
  
  public static f a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        a = new f(paramContext, true);
        com.tencent.feedback.common.e.h("rqdp{  create uphandler up:true}", new Object[0]);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static f a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      if (a == null)
      {
        a = new f(paramContext, paramBoolean);
        com.tencent.feedback.common.e.h("rqdp{  create uphandler up:}%b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      if (a.e() != paramBoolean)
      {
        a.a(paramBoolean);
        com.tencent.feedback.common.e.h("rqdp{  change uphandler up:}%b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.g = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, String paramString)
  {
    UploadHandleListener[] arrayOfUploadHandleListener = b();
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
  
  private void a(boolean paramBoolean)
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
  
  private boolean a(SparseArray<d> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramSparseArray == null) || (paramArrayOfByte == null)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      paramSparseArray = (d)paramSparseArray.get(paramInt);
      if (paramSparseArray == null)
      {
        com.tencent.feedback.common.e.c("rqdp{  no handler key:}%d", new Object[] { Integer.valueOf(paramInt) });
        return false;
      }
      break;
    case 305: 
      paramArrayOfByte = b(paramArrayOfByte);
      if (paramArrayOfByte == null)
      {
        com.tencent.feedback.common.e.c("rqdp{  mix error}", new Object[0]);
        return false;
      }
      paramArrayOfByte = paramArrayOfByte.a;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
      {
        Iterator localIterator = paramArrayOfByte.keySet().iterator();
        while (localIterator.hasNext())
        {
          paramInt = ((Integer)localIterator.next()).intValue();
          a(paramSparseArray, paramInt, (byte[])paramArrayOfByte.get(Integer.valueOf(paramInt)));
        }
      }
      return true;
    case 304: 
      paramArrayOfByte = b(paramArrayOfByte);
      if (paramArrayOfByte == null)
      {
        com.tencent.feedback.common.e.c("rqdp{  mix error}", new Object[0]);
        return false;
      }
      paramArrayOfByte = paramArrayOfByte.a;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
      {
        if (paramArrayOfByte.containsKey(Integer.valueOf(301))) {
          a(paramSparseArray, 301, (byte[])paramArrayOfByte.get(Integer.valueOf(301)));
        }
        if (paramArrayOfByte.containsKey(Integer.valueOf(303))) {
          a(paramSparseArray, 303, (byte[])paramArrayOfByte.get(Integer.valueOf(303)));
        }
      }
      return true;
    }
    try
    {
      com.tencent.feedback.common.e.b("rqdp{  key:}%d rqdp{  handler: }%s", new Object[] { Integer.valueOf(paramInt), paramSparseArray.getClass().toString() });
      paramSparseArray.a(paramInt, paramArrayOfByte, true);
      return true;
    }
    catch (Throwable paramSparseArray)
    {
      paramSparseArray.printStackTrace();
      com.tencent.feedback.common.e.d("rqdp{  handle error key:}%d", new Object[] { Integer.valueOf(paramInt) });
    }
    return false;
  }
  
  private static B b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      B localB = new B();
      localB.a(new h(paramArrayOfByte));
      return localB;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  private static byte[] b(AbstractUploadDatas paramAbstractUploadDatas)
  {
    if (paramAbstractUploadDatas != null) {
      try
      {
        paramAbstractUploadDatas = paramAbstractUploadDatas.a();
        if (paramAbstractUploadDatas != null)
        {
          com.tencent.feedback.common.e.b("rqdp{  [pid:}%s rqdp{  \nbid:}%s_%s rqdp{  \nsid:}%s_%s \n]", new Object[] { paramAbstractUploadDatas.b, paramAbstractUploadDatas.n, paramAbstractUploadDatas.c, paramAbstractUploadDatas.d, paramAbstractUploadDatas.e });
          com.tencent.feedback.proguard.d locald = new com.tencent.feedback.proguard.d();
          locald.d();
          locald.a(1);
          locald.d("test");
          locald.e("test");
          locald.a("detail", paramAbstractUploadDatas);
          paramAbstractUploadDatas = locald.a();
          return paramAbstractUploadDatas;
        }
      }
      catch (Throwable paramAbstractUploadDatas)
      {
        paramAbstractUploadDatas.printStackTrace();
        AbstractUploadDatas.d();
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
    //   3: getfield 43	com/tencent/feedback/upload/f:c	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 43	com/tencent/feedback/upload/f:c	Ljava/util/List;
    //   13: invokeinterface 266 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 43	com/tencent/feedback/upload/f:c	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 133	com/tencent/feedback/upload/UploadHandleListener
    //   29: invokeinterface 270 2 0
    //   34: checkcast 272	[Lcom/tencent/feedback/upload/UploadHandleListener;
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
    //   0	52	0	this	f
    //   37	7	1	arrayOfUploadHandleListener	UploadHandleListener[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  private c c()
  {
    try
    {
      c localc = this.d;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private SparseArray<d> d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/tencent/feedback/upload/f:b	Landroid/util/SparseArray;
    //   6: ifnull +33 -> 39
    //   9: aload_0
    //   10: getfield 38	com/tencent/feedback/upload/f:b	Landroid/util/SparseArray;
    //   13: invokevirtual 275	android/util/SparseArray:size	()I
    //   16: ifle +23 -> 39
    //   19: new 277	com/tencent/feedback/common/j
    //   22: dup
    //   23: invokespecial 278	com/tencent/feedback/common/j:<init>	()V
    //   26: pop
    //   27: aload_0
    //   28: getfield 38	com/tencent/feedback/upload/f:b	Landroid/util/SparseArray;
    //   31: invokestatic 281	com/tencent/feedback/common/j:a	(Landroid/util/SparseArray;)Landroid/util/SparseArray;
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
    //   0	49	0	this	f
    //   34	7	1	localSparseArray	SparseArray
    //   44	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	35	44	finally
  }
  
  private boolean e()
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
  
  /* Error */
  public final void a(AbstractUploadDatas paramAbstractUploadDatas)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 7
    //   3: lconst_0
    //   4: lstore 15
    //   6: iconst_0
    //   7: istore 21
    //   9: iconst_0
    //   10: istore 22
    //   12: iconst_0
    //   13: istore 20
    //   15: aload_0
    //   16: invokespecial 122	com/tencent/feedback/upload/f:e	()Z
    //   19: ifne +73 -> 92
    //   22: aload_1
    //   23: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   26: bipush 11
    //   28: if_icmpne +23 -> 51
    //   31: ldc_w 287
    //   34: iconst_0
    //   35: anewarray 4	java/lang/Object
    //   38: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: aload_1
    //   42: invokevirtual 231	com/tencent/feedback/upload/AbstractUploadDatas:a	()Lcom/tencent/feedback/proguard/C;
    //   45: pop
    //   46: aload_1
    //   47: iconst_0
    //   48: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   51: aload_1
    //   52: getfield 292	com/tencent/feedback/upload/AbstractUploadDatas:b	I
    //   55: sipush 1111
    //   58: if_icmpeq +24 -> 82
    //   61: ldc_w 294
    //   64: iconst_1
    //   65: anewarray 4	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_1
    //   71: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   74: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: aastore
    //   78: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: return
    //   82: ldc_w 296
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_0
    //   93: getfield 45	com/tencent/feedback/upload/f:e	Landroid/content/Context;
    //   96: invokestatic 301	com/tencent/feedback/common/g:b	(Landroid/content/Context;)Z
    //   99: ifne +28 -> 127
    //   102: ldc_w 303
    //   105: iconst_0
    //   106: anewarray 4	java/lang/Object
    //   109: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: aload_1
    //   113: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   116: bipush 11
    //   118: if_icmpne -37 -> 81
    //   121: aload_1
    //   122: iconst_0
    //   123: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   126: return
    //   127: aload_0
    //   128: aload_0
    //   129: getfield 45	com/tencent/feedback/upload/f:e	Landroid/content/Context;
    //   132: invokestatic 308	com/tencent/feedback/common/f:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/f;
    //   135: invokevirtual 311	com/tencent/feedback/upload/f:a	(Lcom/tencent/feedback/upload/UploadHandleListener;)Z
    //   138: pop
    //   139: aload_1
    //   140: ifnonnull +14 -> 154
    //   143: ldc_w 313
    //   146: iconst_0
    //   147: anewarray 4	java/lang/Object
    //   150: invokestatic 215	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: return
    //   154: aload_1
    //   155: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   158: istore 9
    //   160: aload_0
    //   161: invokespecial 131	com/tencent/feedback/upload/f:b	()[Lcom/tencent/feedback/upload/UploadHandleListener;
    //   164: astore_2
    //   165: aload_2
    //   166: ifnull +37 -> 203
    //   169: aload_2
    //   170: arraylength
    //   171: istore 8
    //   173: iconst_0
    //   174: istore 6
    //   176: iload 6
    //   178: iload 8
    //   180: if_icmpge +23 -> 203
    //   183: aload_2
    //   184: iload 6
    //   186: aaload
    //   187: iload 9
    //   189: invokeinterface 316 2 0
    //   194: iload 6
    //   196: iconst_1
    //   197: iadd
    //   198: istore 6
    //   200: goto -24 -> 176
    //   203: aload_1
    //   204: invokevirtual 318	com/tencent/feedback/upload/AbstractUploadDatas:c	()Ljava/lang/String;
    //   207: astore_3
    //   208: aload_3
    //   209: ifnonnull +41 -> 250
    //   212: ldc_w 320
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 215	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: aload_1
    //   223: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   226: bipush 11
    //   228: if_icmpne +8 -> 236
    //   231: aload_1
    //   232: iconst_0
    //   233: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   236: aload_0
    //   237: iload 9
    //   239: iconst_m1
    //   240: lconst_0
    //   241: lconst_0
    //   242: iconst_0
    //   243: ldc_w 322
    //   246: invokespecial 324	com/tencent/feedback/upload/f:a	(IIJJZLjava/lang/String;)V
    //   249: return
    //   250: ldc_w 326
    //   253: iconst_3
    //   254: anewarray 4	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: iload 9
    //   261: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   264: aastore
    //   265: dup
    //   266: iconst_1
    //   267: aload_3
    //   268: aastore
    //   269: dup
    //   270: iconst_2
    //   271: aload_1
    //   272: invokevirtual 204	java/lang/Object:getClass	()Ljava/lang/Class;
    //   275: invokevirtual 208	java/lang/Class:toString	()Ljava/lang/String;
    //   278: aastore
    //   279: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload_1
    //   283: invokestatic 328	com/tencent/feedback/upload/f:b	(Lcom/tencent/feedback/upload/AbstractUploadDatas;)[B
    //   286: astore 4
    //   288: aload 4
    //   290: ifnonnull +27 -> 317
    //   293: ldc_w 330
    //   296: iconst_0
    //   297: anewarray 4	java/lang/Object
    //   300: invokestatic 215	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: aload_0
    //   304: iload 9
    //   306: iconst_m1
    //   307: lconst_0
    //   308: lconst_0
    //   309: iconst_0
    //   310: ldc_w 332
    //   313: invokespecial 324	com/tencent/feedback/upload/f:a	(IIJJZLjava/lang/String;)V
    //   316: return
    //   317: aload_0
    //   318: invokespecial 334	com/tencent/feedback/upload/f:c	()Lcom/tencent/feedback/upload/c;
    //   321: astore 5
    //   323: aload 5
    //   325: ifnonnull +27 -> 352
    //   328: ldc_w 336
    //   331: iconst_0
    //   332: anewarray 4	java/lang/Object
    //   335: invokestatic 215	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   338: aload_0
    //   339: iload 9
    //   341: iconst_m1
    //   342: lconst_0
    //   343: lconst_0
    //   344: iconst_0
    //   345: ldc_w 338
    //   348: invokespecial 324	com/tencent/feedback/upload/f:a	(IIJJZLjava/lang/String;)V
    //   351: return
    //   352: iload 20
    //   354: istore 18
    //   356: new 340	com/tencent/feedback/upload/b
    //   359: dup
    //   360: invokespecial 341	com/tencent/feedback/upload/b:<init>	()V
    //   363: astore_2
    //   364: iload 20
    //   366: istore 18
    //   368: aload 5
    //   370: aload_3
    //   371: aload 4
    //   373: aload_2
    //   374: invokevirtual 344	com/tencent/feedback/upload/c:a	(Ljava/lang/String;[BLcom/tencent/feedback/upload/b;)[B
    //   377: astore_3
    //   378: aload_3
    //   379: ifnonnull +155 -> 534
    //   382: iload 20
    //   384: istore 18
    //   386: aload_0
    //   387: aload_0
    //   388: invokespecial 346	com/tencent/feedback/upload/f:a	()I
    //   391: iconst_1
    //   392: iadd
    //   393: invokespecial 347	com/tencent/feedback/upload/f:a	(I)V
    //   396: iload 20
    //   398: istore 18
    //   400: aload_2
    //   401: invokevirtual 350	com/tencent/feedback/upload/b:a	()J
    //   404: lstore 11
    //   406: iload 20
    //   408: istore 18
    //   410: aload_2
    //   411: invokevirtual 352	com/tencent/feedback/upload/b:b	()J
    //   414: lstore 13
    //   416: iload 20
    //   418: istore 18
    //   420: iload 7
    //   422: istore 6
    //   424: iload 22
    //   426: istore 19
    //   428: aload_3
    //   429: invokestatic 354	com/tencent/feedback/upload/f:a	([B)Lcom/tencent/feedback/proguard/D;
    //   432: astore_2
    //   433: iload 7
    //   435: istore 8
    //   437: iload 21
    //   439: istore 17
    //   441: aload_2
    //   442: ifnull +942 -> 1384
    //   445: iload 20
    //   447: istore 18
    //   449: iload 7
    //   451: istore 6
    //   453: iload 22
    //   455: istore 19
    //   457: aload_2
    //   458: getfield 355	com/tencent/feedback/proguard/D:b	I
    //   461: istore 7
    //   463: iload 20
    //   465: istore 18
    //   467: iload 7
    //   469: istore 8
    //   471: iload 21
    //   473: istore 17
    //   475: iload 7
    //   477: istore 6
    //   479: iload 22
    //   481: istore 19
    //   483: aload_2
    //   484: getfield 358	com/tencent/feedback/proguard/D:a	B
    //   487: ifne +897 -> 1384
    //   490: iconst_1
    //   491: istore 17
    //   493: iload 7
    //   495: istore 8
    //   497: goto +887 -> 1384
    //   500: iload 17
    //   502: istore 18
    //   504: iload 8
    //   506: istore 6
    //   508: iload 17
    //   510: istore 19
    //   512: aload_0
    //   513: iload 9
    //   515: iload 8
    //   517: lload 11
    //   519: lload 13
    //   521: iload 17
    //   523: aconst_null
    //   524: invokespecial 324	com/tencent/feedback/upload/f:a	(IIJJZLjava/lang/String;)V
    //   527: aload_1
    //   528: iload 17
    //   530: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   533: return
    //   534: iload 20
    //   536: istore 18
    //   538: aload_0
    //   539: iconst_0
    //   540: invokespecial 347	com/tencent/feedback/upload/f:a	(I)V
    //   543: goto -147 -> 396
    //   546: astore_2
    //   547: iconst_0
    //   548: istore 17
    //   550: lconst_0
    //   551: lstore 13
    //   553: lload 15
    //   555: lstore 11
    //   557: iload 7
    //   559: istore 6
    //   561: aload_2
    //   562: invokevirtual 102	java/lang/Throwable:printStackTrace	()V
    //   565: aload_0
    //   566: iload 9
    //   568: iload 6
    //   570: lload 11
    //   572: lload 13
    //   574: iconst_0
    //   575: aload_2
    //   576: invokevirtual 359	java/lang/Throwable:toString	()Ljava/lang/String;
    //   579: invokespecial 324	com/tencent/feedback/upload/f:a	(IIJJZLjava/lang/String;)V
    //   582: ldc_w 361
    //   585: iconst_1
    //   586: anewarray 4	java/lang/Object
    //   589: dup
    //   590: iconst_0
    //   591: aload_2
    //   592: invokevirtual 359	java/lang/Throwable:toString	()Ljava/lang/String;
    //   595: aastore
    //   596: invokestatic 215	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   599: aload_1
    //   600: iload 17
    //   602: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   605: return
    //   606: iload 17
    //   608: istore 18
    //   610: iload 8
    //   612: istore 6
    //   614: iload 17
    //   616: istore 19
    //   618: aload_0
    //   619: getfield 45	com/tencent/feedback/upload/f:e	Landroid/content/Context;
    //   622: invokestatic 366	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   625: astore_3
    //   626: aload_3
    //   627: ifnull +109 -> 736
    //   630: iload 17
    //   632: istore 18
    //   634: iload 8
    //   636: istore 6
    //   638: iload 17
    //   640: istore 19
    //   642: aload_3
    //   643: aload_2
    //   644: getfield 367	com/tencent/feedback/proguard/D:d	Ljava/lang/String;
    //   647: invokevirtual 369	com/tencent/feedback/common/c:c	(Ljava/lang/String;)V
    //   650: iload 17
    //   652: istore 18
    //   654: iload 8
    //   656: istore 6
    //   658: iload 17
    //   660: istore 19
    //   662: new 371	java/util/Date
    //   665: dup
    //   666: invokespecial 372	java/util/Date:<init>	()V
    //   669: astore 4
    //   671: iload 17
    //   673: istore 18
    //   675: iload 8
    //   677: istore 6
    //   679: iload 17
    //   681: istore 19
    //   683: aload_3
    //   684: aload_2
    //   685: getfield 375	com/tencent/feedback/proguard/D:g	J
    //   688: aload 4
    //   690: invokevirtual 378	java/util/Date:getTime	()J
    //   693: lsub
    //   694: invokevirtual 381	com/tencent/feedback/common/c:a	(J)V
    //   697: iload 17
    //   699: istore 18
    //   701: iload 8
    //   703: istore 6
    //   705: iload 17
    //   707: istore 19
    //   709: ldc_w 383
    //   712: iconst_2
    //   713: anewarray 4	java/lang/Object
    //   716: dup
    //   717: iconst_0
    //   718: aload_3
    //   719: invokevirtual 386	com/tencent/feedback/common/c:j	()Ljava/lang/String;
    //   722: aastore
    //   723: dup
    //   724: iconst_1
    //   725: aload_3
    //   726: invokevirtual 389	com/tencent/feedback/common/c:k	()J
    //   729: invokestatic 394	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   732: aastore
    //   733: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   736: iload 17
    //   738: istore 18
    //   740: iload 8
    //   742: istore 6
    //   744: iload 17
    //   746: istore 19
    //   748: aload_2
    //   749: getfield 396	com/tencent/feedback/proguard/D:c	[B
    //   752: astore_3
    //   753: aload_3
    //   754: ifnonnull +28 -> 782
    //   757: iload 17
    //   759: istore 18
    //   761: iload 8
    //   763: istore 6
    //   765: iload 17
    //   767: istore 19
    //   769: ldc_w 398
    //   772: iconst_0
    //   773: anewarray 4	java/lang/Object
    //   776: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   779: goto -279 -> 500
    //   782: iload 17
    //   784: istore 18
    //   786: iload 8
    //   788: istore 6
    //   790: iload 17
    //   792: istore 19
    //   794: aload_3
    //   795: aload_2
    //   796: getfield 400	com/tencent/feedback/proguard/D:f	B
    //   799: aload_2
    //   800: getfield 402	com/tencent/feedback/proguard/D:e	B
    //   803: aload_0
    //   804: getfield 45	com/tencent/feedback/upload/f:e	Landroid/content/Context;
    //   807: invokestatic 407	com/tencent/feedback/proguard/t:a	(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
    //   810: invokevirtual 410	com/tencent/feedback/proguard/t:b	()Lcom/tencent/feedback/proguard/w;
    //   813: invokevirtual 414	com/tencent/feedback/proguard/w:e	()Ljava/lang/String;
    //   816: invokestatic 419	com/tencent/feedback/proguard/a:b	([BIILjava/lang/String;)[B
    //   819: astore_3
    //   820: iload 17
    //   822: istore 18
    //   824: iload 8
    //   826: istore 6
    //   828: iload 17
    //   830: istore 19
    //   832: aload_0
    //   833: invokespecial 421	com/tencent/feedback/upload/f:d	()Landroid/util/SparseArray;
    //   836: astore 4
    //   838: aload 4
    //   840: ifnull +23 -> 863
    //   843: iload 17
    //   845: istore 18
    //   847: iload 8
    //   849: istore 6
    //   851: iload 17
    //   853: istore 19
    //   855: aload 4
    //   857: invokevirtual 275	android/util/SparseArray:size	()I
    //   860: ifgt +37 -> 897
    //   863: iload 17
    //   865: istore 18
    //   867: iload 8
    //   869: istore 6
    //   871: iload 17
    //   873: istore 19
    //   875: ldc_w 423
    //   878: iconst_0
    //   879: anewarray 4	java/lang/Object
    //   882: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   885: goto -385 -> 500
    //   888: astore_2
    //   889: aload_1
    //   890: iload 18
    //   892: invokevirtual 290	com/tencent/feedback/upload/AbstractUploadDatas:done	(Z)V
    //   895: aload_2
    //   896: athrow
    //   897: iload 17
    //   899: istore 18
    //   901: iload 8
    //   903: istore 6
    //   905: iload 17
    //   907: istore 19
    //   909: aload_1
    //   910: invokevirtual 285	com/tencent/feedback/upload/AbstractUploadDatas:b	()I
    //   913: istore 7
    //   915: iload 17
    //   917: istore 18
    //   919: iload 8
    //   921: istore 6
    //   923: iload 17
    //   925: istore 19
    //   927: aload_2
    //   928: getfield 355	com/tencent/feedback/proguard/D:b	I
    //   931: istore 10
    //   933: iload 10
    //   935: ifne +468 -> 1403
    //   938: iload 17
    //   940: istore 18
    //   942: iload 8
    //   944: istore 6
    //   946: iload 17
    //   948: istore 19
    //   950: ldc_w 425
    //   953: iconst_0
    //   954: anewarray 4	java/lang/Object
    //   957: invokestatic 110	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   960: goto -460 -> 500
    //   963: iload 17
    //   965: istore 18
    //   967: iload 8
    //   969: istore 6
    //   971: iload 17
    //   973: istore 19
    //   975: ldc_w 427
    //   978: iconst_1
    //   979: anewarray 4	java/lang/Object
    //   982: dup
    //   983: iconst_0
    //   984: iload 7
    //   986: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   989: aastore
    //   990: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   993: goto -493 -> 500
    //   996: iload 10
    //   998: sipush 305
    //   1001: if_icmpeq +336 -> 1337
    //   1004: iload 17
    //   1006: istore 18
    //   1008: iload 8
    //   1010: istore 6
    //   1012: iload 17
    //   1014: istore 19
    //   1016: ldc_w 429
    //   1019: iconst_2
    //   1020: anewarray 4	java/lang/Object
    //   1023: dup
    //   1024: iconst_0
    //   1025: iload 7
    //   1027: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1030: aastore
    //   1031: dup
    //   1032: iconst_1
    //   1033: iload 10
    //   1035: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1038: aastore
    //   1039: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1042: goto -542 -> 500
    //   1045: iload 10
    //   1047: sipush 302
    //   1050: if_icmpeq +287 -> 1337
    //   1053: iload 17
    //   1055: istore 18
    //   1057: iload 8
    //   1059: istore 6
    //   1061: iload 17
    //   1063: istore 19
    //   1065: ldc_w 429
    //   1068: iconst_2
    //   1069: anewarray 4	java/lang/Object
    //   1072: dup
    //   1073: iconst_0
    //   1074: iload 7
    //   1076: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1079: aastore
    //   1080: dup
    //   1081: iconst_1
    //   1082: iload 10
    //   1084: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1087: aastore
    //   1088: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1091: goto -591 -> 500
    //   1094: iload 10
    //   1096: sipush 304
    //   1099: if_icmpeq +238 -> 1337
    //   1102: iload 17
    //   1104: istore 18
    //   1106: iload 8
    //   1108: istore 6
    //   1110: iload 17
    //   1112: istore 19
    //   1114: ldc_w 429
    //   1117: iconst_2
    //   1118: anewarray 4	java/lang/Object
    //   1121: dup
    //   1122: iconst_0
    //   1123: iload 7
    //   1125: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1128: aastore
    //   1129: dup
    //   1130: iconst_1
    //   1131: iload 10
    //   1133: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1136: aastore
    //   1137: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1140: goto -640 -> 500
    //   1143: iload 10
    //   1145: sipush 301
    //   1148: if_icmpeq +189 -> 1337
    //   1151: iload 17
    //   1153: istore 18
    //   1155: iload 8
    //   1157: istore 6
    //   1159: iload 17
    //   1161: istore 19
    //   1163: ldc_w 429
    //   1166: iconst_2
    //   1167: anewarray 4	java/lang/Object
    //   1170: dup
    //   1171: iconst_0
    //   1172: iload 7
    //   1174: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1177: aastore
    //   1178: dup
    //   1179: iconst_1
    //   1180: iload 10
    //   1182: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1185: aastore
    //   1186: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1189: goto -689 -> 500
    //   1192: iload 10
    //   1194: sipush 303
    //   1197: if_icmpeq +140 -> 1337
    //   1200: iload 17
    //   1202: istore 18
    //   1204: iload 8
    //   1206: istore 6
    //   1208: iload 17
    //   1210: istore 19
    //   1212: ldc_w 429
    //   1215: iconst_2
    //   1216: anewarray 4	java/lang/Object
    //   1219: dup
    //   1220: iconst_0
    //   1221: iload 7
    //   1223: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1226: aastore
    //   1227: dup
    //   1228: iconst_1
    //   1229: iload 10
    //   1231: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1234: aastore
    //   1235: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1238: goto -738 -> 500
    //   1241: iload 10
    //   1243: bipush 11
    //   1245: if_icmpeq +92 -> 1337
    //   1248: iload 17
    //   1250: istore 18
    //   1252: iload 8
    //   1254: istore 6
    //   1256: iload 17
    //   1258: istore 19
    //   1260: ldc_w 429
    //   1263: iconst_2
    //   1264: anewarray 4	java/lang/Object
    //   1267: dup
    //   1268: iconst_0
    //   1269: iload 7
    //   1271: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1274: aastore
    //   1275: dup
    //   1276: iconst_1
    //   1277: iload 10
    //   1279: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1282: aastore
    //   1283: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1286: goto -786 -> 500
    //   1289: iload 10
    //   1291: bipush 15
    //   1293: if_icmpeq +44 -> 1337
    //   1296: iload 17
    //   1298: istore 18
    //   1300: iload 8
    //   1302: istore 6
    //   1304: iload 17
    //   1306: istore 19
    //   1308: ldc_w 429
    //   1311: iconst_2
    //   1312: anewarray 4	java/lang/Object
    //   1315: dup
    //   1316: iconst_0
    //   1317: iload 7
    //   1319: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1322: aastore
    //   1323: dup
    //   1324: iconst_1
    //   1325: iload 10
    //   1327: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1330: aastore
    //   1331: invokestatic 152	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1334: goto -834 -> 500
    //   1337: iload 17
    //   1339: istore 18
    //   1341: iload 8
    //   1343: istore 6
    //   1345: iload 17
    //   1347: istore 19
    //   1349: aload_0
    //   1350: aload 4
    //   1352: iload 10
    //   1354: aload_3
    //   1355: invokespecial 195	com/tencent/feedback/upload/f:a	(Landroid/util/SparseArray;I[B)Z
    //   1358: pop
    //   1359: goto -859 -> 500
    //   1362: astore_2
    //   1363: iload 17
    //   1365: istore 18
    //   1367: goto -478 -> 889
    //   1370: astore_2
    //   1371: lconst_0
    //   1372: lstore 13
    //   1374: iconst_0
    //   1375: istore 17
    //   1377: iload 7
    //   1379: istore 6
    //   1381: goto -820 -> 561
    //   1384: aload_1
    //   1385: ifnull -885 -> 500
    //   1388: aload_2
    //   1389: ifnonnull -783 -> 606
    //   1392: goto -892 -> 500
    //   1395: astore_2
    //   1396: iload 19
    //   1398: istore 17
    //   1400: goto -839 -> 561
    //   1403: iload 7
    //   1405: lookupswitch	default:+99->1504, 8:+-164->1241, 12:+-164->1241, 15:+-116->1289, 200:+-409->996, 201:+-262->1143, 202:+-360->1045, 203:+-213->1192, 204:+-311->1094, 205:+-213->1192, 206:+-360->1045, 207:+-311->1094
    //   1504: goto -541 -> 963
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1507	0	this	f
    //   0	1507	1	paramAbstractUploadDatas	AbstractUploadDatas
    //   164	320	2	localObject1	Object
    //   546	254	2	localThrowable1	Throwable
    //   888	40	2	localObject2	Object
    //   1362	1	2	localObject3	Object
    //   1370	19	2	localThrowable2	Throwable
    //   1395	1	2	localThrowable3	Throwable
    //   207	1148	3	localObject4	Object
    //   286	1065	4	localObject5	Object
    //   321	48	5	localc	c
    //   174	1206	6	i	int
    //   1	1403	7	j	int
    //   171	1171	8	k	int
    //   158	409	9	m	int
    //   931	422	10	n	int
    //   404	167	11	l1	long
    //   414	959	13	l2	long
    //   4	550	15	l3	long
    //   439	960	17	bool1	boolean
    //   354	1012	18	bool2	boolean
    //   426	971	19	bool3	boolean
    //   13	522	20	bool4	boolean
    //   7	465	21	bool5	boolean
    //   10	470	22	bool6	boolean
    // Exception table:
    //   from	to	target	type
    //   356	364	546	java/lang/Throwable
    //   368	378	546	java/lang/Throwable
    //   386	396	546	java/lang/Throwable
    //   400	406	546	java/lang/Throwable
    //   538	543	546	java/lang/Throwable
    //   356	364	888	finally
    //   368	378	888	finally
    //   386	396	888	finally
    //   400	406	888	finally
    //   410	416	888	finally
    //   428	433	888	finally
    //   457	463	888	finally
    //   483	490	888	finally
    //   512	527	888	finally
    //   538	543	888	finally
    //   618	626	888	finally
    //   642	650	888	finally
    //   662	671	888	finally
    //   683	697	888	finally
    //   709	736	888	finally
    //   748	753	888	finally
    //   769	779	888	finally
    //   794	820	888	finally
    //   832	838	888	finally
    //   855	863	888	finally
    //   875	885	888	finally
    //   909	915	888	finally
    //   927	933	888	finally
    //   950	960	888	finally
    //   975	993	888	finally
    //   1016	1042	888	finally
    //   1065	1091	888	finally
    //   1114	1140	888	finally
    //   1163	1189	888	finally
    //   1212	1238	888	finally
    //   1260	1286	888	finally
    //   1308	1334	888	finally
    //   1349	1359	888	finally
    //   561	599	1362	finally
    //   410	416	1370	java/lang/Throwable
    //   428	433	1395	java/lang/Throwable
    //   457	463	1395	java/lang/Throwable
    //   483	490	1395	java/lang/Throwable
    //   512	527	1395	java/lang/Throwable
    //   618	626	1395	java/lang/Throwable
    //   642	650	1395	java/lang/Throwable
    //   662	671	1395	java/lang/Throwable
    //   683	697	1395	java/lang/Throwable
    //   709	736	1395	java/lang/Throwable
    //   748	753	1395	java/lang/Throwable
    //   769	779	1395	java/lang/Throwable
    //   794	820	1395	java/lang/Throwable
    //   832	838	1395	java/lang/Throwable
    //   855	863	1395	java/lang/Throwable
    //   875	885	1395	java/lang/Throwable
    //   909	915	1395	java/lang/Throwable
    //   927	933	1395	java/lang/Throwable
    //   950	960	1395	java/lang/Throwable
    //   975	993	1395	java/lang/Throwable
    //   1016	1042	1395	java/lang/Throwable
    //   1065	1091	1395	java/lang/Throwable
    //   1114	1140	1395	java/lang/Throwable
    //   1163	1189	1395	java/lang/Throwable
    //   1212	1238	1395	java/lang/Throwable
    //   1260	1286	1395	java/lang/Throwable
    //   1308	1334	1395	java/lang/Throwable
    //   1349	1359	1395	java/lang/Throwable
  }
  
  public final boolean a(int paramInt, d paramd)
  {
    boolean bool;
    if (paramd == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        this.b.append(paramInt, paramd);
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\upload\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */