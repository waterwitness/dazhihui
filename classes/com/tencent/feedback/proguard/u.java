package com.tencent.feedback.proguard;

import android.content.Context;
import com.tencent.feedback.common.b;
import com.tencent.feedback.common.c;
import com.tencent.feedback.common.g;
import com.tencent.feedback.upload.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class u
  implements Runnable
{
  private static long a = 0L;
  private Context b = null;
  
  public u(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private static long a()
  {
    try
    {
      long l = a;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void a(long paramLong)
  {
    try
    {
      a = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(long paramLong1, long paramLong2)
  {
    com.tencent.feedback.upload.e locale = t.a();
    Object localObject2 = y.a(this.b, b.b(), locale);
    boolean bool = ((y)localObject2).b();
    if (!bool) {
      ((y)localObject2).a(60000L);
    }
    if (new Date().getTime() < paramLong1 + paramLong2)
    {
      com.tencent.feedback.common.e.a("lastUpdate:%d ,return not query", new Object[] { Long.valueOf(paramLong1) });
      return;
    }
    int i = 0;
    for (;;)
    {
      if (locale == null)
      {
        i += 1;
        if (i < 5)
        {
          com.tencent.feedback.common.e.e("rqdp{  wait uphandler:} %d", new Object[] { Integer.valueOf(200) });
          try
          {
            Thread.sleep(200L);
            locale = t.a();
          }
          catch (InterruptedException localInterruptedException1)
          {
            for (;;)
            {
              localInterruptedException1.printStackTrace();
            }
          }
        }
      }
    }
    if ((locale != null) && (g.b(this.b)))
    {
      B localB = null;
      if (!bool) {}
      for (;;)
      {
        try
        {
          if (((y)localObject2).b(com.tencent.feedback.common.a.h(this.b)) <= 0) {
            com.tencent.feedback.common.e.e("rqdp{  wait lanch record:} %d", new Object[] { Integer.valueOf(500) });
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          Object localObject1 = null;
          continue;
          i = ((Y)localObject2).f.size();
          continue;
        }
        try
        {
          Thread.sleep(500L);
          localObject2 = A.a(this.b, (y)localObject2, (byte)2);
          if (localObject2 != null)
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put(Integer.valueOf(110), ((Y)localObject2).a());
            localB = new B();
            localB.a = localHashMap;
            if (((Y)localObject2).f == null)
            {
              i = 0;
              com.tencent.feedback.common.e.b("rqdp{ common query add uin} %d", new Object[] { Integer.valueOf(i) });
            }
          }
          else
          {
            locale.a(new v(this.b, 1111, 200, localB));
            return;
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          localInterruptedException2.printStackTrace();
        }
      }
    }
    com.tencent.feedback.common.e.h("rqdp{  no uphandler or offline ,not query!!}", new Object[0]);
  }
  
  private long b()
  {
    z localz = a.a(this.b, 300);
    if ((localz != null) && (localz.b() == 300) && (localz.c() != null)) {
      try
      {
        d locald = t.a(this.b).c();
        if (locald != null)
        {
          locald.a(300, localz.c(), false);
          com.tencent.feedback.common.e.e("rqdp{  common strategy setted by history}", new Object[0]);
        }
        long l = localz.d();
        return l;
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
      }
    }
    return -1L;
  }
  
  private void c()
  {
    com.tencent.feedback.common.e.e("rqdp{  AppFirstRun } %s", new Object[] { c.a(this.b).l() });
    com.tencent.feedback.common.e.e("rqdp{  clear ao count} %d", new Object[] { Integer.valueOf(l.a(this.b, null, -1L, Long.MAX_VALUE, -1, -1)) });
    synchronized (t.a(this.b))
    {
      s[] arrayOfs = ???.d();
      t.a(this.b).a(true);
      if (arrayOfs != null)
      {
        int j = arrayOfs.length;
        int i = 0;
        if (i < j)
        {
          arrayOfs[i].f();
          i += 1;
        }
      }
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 228	com/tencent/feedback/proguard/u:b	()J
    //   4: lstore 11
    //   6: aload_0
    //   7: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   10: invokestatic 179	com/tencent/feedback/proguard/t:a	(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 231	com/tencent/feedback/proguard/t:b	()Lcom/tencent/feedback/proguard/w;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +160 -> 180
    //   23: ldc2_w 194
    //   26: lstore 9
    //   28: aload_3
    //   29: invokevirtual 233	com/tencent/feedback/proguard/t:e	()I
    //   32: ifne +78 -> 110
    //   35: ldc -21
    //   37: iconst_0
    //   38: anewarray 4	java/lang/Object
    //   41: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: aload_3
    //   45: iconst_1
    //   46: invokevirtual 238	com/tencent/feedback/proguard/t:a	(I)V
    //   49: aload_0
    //   50: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   53: aload_0
    //   54: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   57: invokestatic 202	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   60: invokevirtual 240	com/tencent/feedback/common/c:c	()Ljava/lang/String;
    //   63: invokestatic 243	com/tencent/feedback/common/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   66: astore 4
    //   68: aload 4
    //   70: ifnull +14 -> 84
    //   73: aload 4
    //   75: invokevirtual 248	java/lang/String:trim	()Ljava/lang/String;
    //   78: invokevirtual 251	java/lang/String:length	()I
    //   81: ifne +117 -> 198
    //   84: ldc -3
    //   86: iconst_1
    //   87: anewarray 4	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload 4
    //   94: aastore
    //   95: invokestatic 255	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: iconst_0
    //   99: istore 17
    //   101: iload 17
    //   103: ifeq +678 -> 781
    //   106: aload_0
    //   107: invokespecial 257	com/tencent/feedback/proguard/u:c	()V
    //   110: ldc_w 259
    //   113: iconst_0
    //   114: anewarray 4	java/lang/Object
    //   117: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload_3
    //   121: monitorenter
    //   122: aload_3
    //   123: invokevirtual 218	com/tencent/feedback/proguard/t:d	()[Lcom/tencent/feedback/proguard/s;
    //   126: astore_1
    //   127: aload_3
    //   128: iconst_2
    //   129: invokevirtual 238	com/tencent/feedback/proguard/t:a	(I)V
    //   132: aload_3
    //   133: monitorexit
    //   134: aload_1
    //   135: ifnull +697 -> 832
    //   138: ldc_w 261
    //   141: iconst_0
    //   142: anewarray 4	java/lang/Object
    //   145: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload_1
    //   149: arraylength
    //   150: istore 8
    //   152: iconst_0
    //   153: istore 7
    //   155: iload 7
    //   157: iload 8
    //   159: if_icmpge +673 -> 832
    //   162: aload_1
    //   163: iload 7
    //   165: aaload
    //   166: invokeinterface 263 1 0
    //   171: iload 7
    //   173: iconst_1
    //   174: iadd
    //   175: istore 7
    //   177: goto -22 -> 155
    //   180: aload_1
    //   181: invokevirtual 267	com/tencent/feedback/proguard/w:c	()I
    //   184: sipush 3600
    //   187: imul
    //   188: sipush 1000
    //   191: imul
    //   192: i2l
    //   193: lstore 9
    //   195: goto -167 -> 28
    //   198: new 269	java/io/File
    //   201: dup
    //   202: aload 4
    //   204: invokespecial 272	java/io/File:<init>	(Ljava/lang/String;)V
    //   207: astore_1
    //   208: aload_1
    //   209: invokevirtual 275	java/io/File:exists	()Z
    //   212: ifeq +10 -> 222
    //   215: aload_1
    //   216: invokevirtual 278	java/io/File:canRead	()Z
    //   219: ifne +24 -> 243
    //   222: ldc_w 280
    //   225: iconst_1
    //   226: anewarray 4	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload 4
    //   233: aastore
    //   234: invokestatic 255	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: iconst_0
    //   238: istore 17
    //   240: goto -139 -> 101
    //   243: aload_1
    //   244: invokevirtual 283	java/io/File:lastModified	()J
    //   247: lstore 13
    //   249: aload_1
    //   250: invokevirtual 285	java/io/File:length	()J
    //   253: lstore 15
    //   255: aload_0
    //   256: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   259: invokestatic 202	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   262: invokevirtual 288	com/tencent/feedback/common/c:B	()Ljava/lang/String;
    //   265: astore 5
    //   267: aload_0
    //   268: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   271: aload 4
    //   273: iconst_0
    //   274: bipush 10
    //   276: invokestatic 291	com/tencent/feedback/proguard/l:a	(Landroid/content/Context;Ljava/lang/String;II)Ljava/util/List;
    //   279: astore 6
    //   281: aconst_null
    //   282: astore_2
    //   283: aload_2
    //   284: astore_1
    //   285: aload 6
    //   287: ifnull +27 -> 314
    //   290: aload_2
    //   291: astore_1
    //   292: aload 6
    //   294: invokeinterface 294 1 0
    //   299: ifle +15 -> 314
    //   302: aload 6
    //   304: iconst_0
    //   305: invokeinterface 298 2 0
    //   310: checkcast 300	com/tencent/feedback/proguard/o
    //   313: astore_1
    //   314: aload_0
    //   315: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   318: invokestatic 202	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   321: astore_2
    //   322: aload_1
    //   323: ifnonnull +105 -> 428
    //   326: new 154	java/util/ArrayList
    //   329: dup
    //   330: invokespecial 301	java/util/ArrayList:<init>	()V
    //   333: astore_1
    //   334: new 300	com/tencent/feedback/proguard/o
    //   337: dup
    //   338: invokespecial 302	com/tencent/feedback/proguard/o:<init>	()V
    //   341: astore 6
    //   343: aload 6
    //   345: iconst_0
    //   346: invokevirtual 303	com/tencent/feedback/proguard/o:a	(I)V
    //   349: aload 6
    //   351: aload 4
    //   353: invokevirtual 305	com/tencent/feedback/proguard/o:a	(Ljava/lang/String;)V
    //   356: aload 6
    //   358: aload_2
    //   359: invokevirtual 308	com/tencent/feedback/common/c:m	()Ljava/lang/String;
    //   362: invokevirtual 310	com/tencent/feedback/proguard/o:b	(Ljava/lang/String;)V
    //   365: aload 6
    //   367: aload 5
    //   369: invokevirtual 312	com/tencent/feedback/proguard/o:c	(Ljava/lang/String;)V
    //   372: aload 6
    //   374: lload 13
    //   376: invokevirtual 314	com/tencent/feedback/proguard/o:b	(J)V
    //   379: aload 6
    //   381: lload 15
    //   383: invokevirtual 316	com/tencent/feedback/proguard/o:c	(J)V
    //   386: aload_1
    //   387: aload 6
    //   389: invokeinterface 320 2 0
    //   394: pop
    //   395: aload_0
    //   396: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   399: aload_1
    //   400: invokestatic 323	com/tencent/feedback/proguard/l:c	(Landroid/content/Context;Ljava/util/List;)I
    //   403: pop
    //   404: ldc_w 325
    //   407: iconst_1
    //   408: anewarray 4	java/lang/Object
    //   411: dup
    //   412: iconst_0
    //   413: aload 6
    //   415: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   418: aastore
    //   419: invokestatic 330	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   422: iconst_1
    //   423: istore 17
    //   425: goto -324 -> 101
    //   428: aload_2
    //   429: invokevirtual 333	com/tencent/feedback/common/c:n	()Z
    //   432: ifeq +135 -> 567
    //   435: aload_2
    //   436: invokevirtual 308	com/tencent/feedback/common/c:m	()Ljava/lang/String;
    //   439: aload_1
    //   440: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   443: invokevirtual 336	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   446: ifeq +9 -> 455
    //   449: iconst_0
    //   450: istore 17
    //   452: goto -351 -> 101
    //   455: aload_0
    //   456: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   459: aload 6
    //   461: invokestatic 338	com/tencent/feedback/proguard/l:d	(Landroid/content/Context;Ljava/util/List;)I
    //   464: pop
    //   465: new 154	java/util/ArrayList
    //   468: dup
    //   469: invokespecial 301	java/util/ArrayList:<init>	()V
    //   472: astore_1
    //   473: new 300	com/tencent/feedback/proguard/o
    //   476: dup
    //   477: invokespecial 302	com/tencent/feedback/proguard/o:<init>	()V
    //   480: astore 6
    //   482: aload 6
    //   484: iconst_0
    //   485: invokevirtual 303	com/tencent/feedback/proguard/o:a	(I)V
    //   488: aload 6
    //   490: aload 4
    //   492: invokevirtual 305	com/tencent/feedback/proguard/o:a	(Ljava/lang/String;)V
    //   495: aload 6
    //   497: aload_2
    //   498: invokevirtual 308	com/tencent/feedback/common/c:m	()Ljava/lang/String;
    //   501: invokevirtual 310	com/tencent/feedback/proguard/o:b	(Ljava/lang/String;)V
    //   504: aload 6
    //   506: aload 5
    //   508: invokevirtual 312	com/tencent/feedback/proguard/o:c	(Ljava/lang/String;)V
    //   511: aload 6
    //   513: lload 13
    //   515: invokevirtual 314	com/tencent/feedback/proguard/o:b	(J)V
    //   518: aload 6
    //   520: lload 15
    //   522: invokevirtual 316	com/tencent/feedback/proguard/o:c	(J)V
    //   525: aload_1
    //   526: aload 6
    //   528: invokeinterface 320 2 0
    //   533: pop
    //   534: aload_0
    //   535: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   538: aload_1
    //   539: invokestatic 323	com/tencent/feedback/proguard/l:c	(Landroid/content/Context;Ljava/util/List;)I
    //   542: pop
    //   543: ldc_w 325
    //   546: iconst_1
    //   547: anewarray 4	java/lang/Object
    //   550: dup
    //   551: iconst_0
    //   552: aload 6
    //   554: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   557: aastore
    //   558: invokestatic 330	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   561: iconst_1
    //   562: istore 17
    //   564: goto -463 -> 101
    //   567: aload_1
    //   568: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   571: ifnull +55 -> 626
    //   574: aload 5
    //   576: aload_1
    //   577: invokevirtual 340	com/tencent/feedback/proguard/o:f	()Ljava/lang/String;
    //   580: invokevirtual 336	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   583: ifeq +43 -> 626
    //   586: lload 13
    //   588: aload_1
    //   589: invokevirtual 341	com/tencent/feedback/proguard/o:b	()J
    //   592: lcmp
    //   593: ifne +33 -> 626
    //   596: lload 15
    //   598: aload_1
    //   599: invokevirtual 343	com/tencent/feedback/proguard/o:c	()J
    //   602: lcmp
    //   603: ifne +23 -> 626
    //   606: aload_0
    //   607: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   610: invokestatic 202	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   613: aload_1
    //   614: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   617: invokevirtual 345	com/tencent/feedback/common/c:d	(Ljava/lang/String;)V
    //   620: iconst_0
    //   621: istore 17
    //   623: goto -522 -> 101
    //   626: aload_0
    //   627: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   630: invokestatic 202	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   633: invokevirtual 308	com/tencent/feedback/common/c:m	()Ljava/lang/String;
    //   636: astore_2
    //   637: aload_2
    //   638: ifnonnull +19 -> 657
    //   641: ldc_w 347
    //   644: iconst_0
    //   645: anewarray 4	java/lang/Object
    //   648: invokestatic 255	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   651: iconst_0
    //   652: istore 17
    //   654: goto -553 -> 101
    //   657: aload_2
    //   658: aload_1
    //   659: invokevirtual 327	com/tencent/feedback/proguard/o:d	()Ljava/lang/String;
    //   662: invokevirtual 336	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   665: istore 17
    //   667: aload_0
    //   668: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   671: aload 6
    //   673: invokestatic 338	com/tencent/feedback/proguard/l:d	(Landroid/content/Context;Ljava/util/List;)I
    //   676: pop
    //   677: new 154	java/util/ArrayList
    //   680: dup
    //   681: invokespecial 301	java/util/ArrayList:<init>	()V
    //   684: astore_1
    //   685: new 300	com/tencent/feedback/proguard/o
    //   688: dup
    //   689: invokespecial 302	com/tencent/feedback/proguard/o:<init>	()V
    //   692: astore 6
    //   694: aload 6
    //   696: iconst_0
    //   697: invokevirtual 303	com/tencent/feedback/proguard/o:a	(I)V
    //   700: aload 6
    //   702: aload 4
    //   704: invokevirtual 305	com/tencent/feedback/proguard/o:a	(Ljava/lang/String;)V
    //   707: aload 6
    //   709: aload_2
    //   710: invokevirtual 310	com/tencent/feedback/proguard/o:b	(Ljava/lang/String;)V
    //   713: aload 6
    //   715: aload 5
    //   717: invokevirtual 312	com/tencent/feedback/proguard/o:c	(Ljava/lang/String;)V
    //   720: aload 6
    //   722: lload 13
    //   724: invokevirtual 314	com/tencent/feedback/proguard/o:b	(J)V
    //   727: aload 6
    //   729: lload 15
    //   731: invokevirtual 316	com/tencent/feedback/proguard/o:c	(J)V
    //   734: aload_1
    //   735: aload 6
    //   737: invokeinterface 320 2 0
    //   742: pop
    //   743: aload_0
    //   744: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   747: aload_1
    //   748: invokestatic 323	com/tencent/feedback/proguard/l:c	(Landroid/content/Context;Ljava/util/List;)I
    //   751: pop
    //   752: ldc_w 349
    //   755: iconst_2
    //   756: anewarray 4	java/lang/Object
    //   759: dup
    //   760: iconst_0
    //   761: iload 17
    //   763: invokestatic 354	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   766: aastore
    //   767: dup
    //   768: iconst_1
    //   769: aload 6
    //   771: invokevirtual 357	com/tencent/feedback/proguard/o:toString	()Ljava/lang/String;
    //   774: aastore
    //   775: invokestatic 330	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   778: goto -677 -> 101
    //   781: invokestatic 359	com/tencent/feedback/proguard/u:a	()J
    //   784: lstore 13
    //   786: lload 13
    //   788: lconst_0
    //   789: lcmp
    //   790: ifle -680 -> 110
    //   793: ldc_w 361
    //   796: iconst_1
    //   797: anewarray 4	java/lang/Object
    //   800: dup
    //   801: iconst_0
    //   802: lload 13
    //   804: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   807: aastore
    //   808: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   811: lload 13
    //   813: invokestatic 87	java/lang/Thread:sleep	(J)V
    //   816: goto -706 -> 110
    //   819: astore_1
    //   820: aload_1
    //   821: invokevirtual 90	java/lang/InterruptedException:printStackTrace	()V
    //   824: goto -714 -> 110
    //   827: astore_1
    //   828: aload_3
    //   829: monitorexit
    //   830: aload_1
    //   831: athrow
    //   832: aload_0
    //   833: lload 11
    //   835: lload 9
    //   837: invokespecial 363	com/tencent/feedback/proguard/u:a	(JJ)V
    //   840: ldc_w 365
    //   843: iconst_0
    //   844: anewarray 4	java/lang/Object
    //   847: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   850: aload_3
    //   851: monitorenter
    //   852: aload_3
    //   853: invokevirtual 218	com/tencent/feedback/proguard/t:d	()[Lcom/tencent/feedback/proguard/s;
    //   856: astore_1
    //   857: aload_3
    //   858: iconst_3
    //   859: invokevirtual 238	com/tencent/feedback/proguard/t:a	(I)V
    //   862: aload_3
    //   863: monitorexit
    //   864: aload_1
    //   865: ifnull +50 -> 915
    //   868: ldc_w 367
    //   871: iconst_0
    //   872: anewarray 4	java/lang/Object
    //   875: invokestatic 80	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   878: aload_1
    //   879: arraylength
    //   880: istore 8
    //   882: iconst_0
    //   883: istore 7
    //   885: iload 7
    //   887: iload 8
    //   889: if_icmpge +26 -> 915
    //   892: aload_1
    //   893: iload 7
    //   895: aaload
    //   896: invokeinterface 369 1 0
    //   901: iload 7
    //   903: iconst_1
    //   904: iadd
    //   905: istore 7
    //   907: goto -22 -> 885
    //   910: astore_1
    //   911: aload_3
    //   912: monitorexit
    //   913: aload_1
    //   914: athrow
    //   915: lload 9
    //   917: lconst_0
    //   918: lcmp
    //   919: ifgt +22 -> 941
    //   922: ldc_w 371
    //   925: iconst_1
    //   926: anewarray 4	java/lang/Object
    //   929: dup
    //   930: iconst_0
    //   931: lload 9
    //   933: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   936: aastore
    //   937: invokestatic 373	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   940: return
    //   941: lload 9
    //   943: lconst_0
    //   944: lcmp
    //   945: ifle +43 -> 988
    //   948: invokestatic 38	com/tencent/feedback/common/b:b	()Lcom/tencent/feedback/common/b;
    //   951: aload_0
    //   952: lload 9
    //   954: invokevirtual 376	com/tencent/feedback/common/b:a	(Ljava/lang/Runnable;J)Z
    //   957: pop
    //   958: ldc_w 378
    //   961: iconst_1
    //   962: anewarray 4	java/lang/Object
    //   965: dup
    //   966: iconst_0
    //   967: lload 9
    //   969: invokestatic 65	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   972: aastore
    //   973: invokestatic 162	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   976: aload_0
    //   977: getfield 21	com/tencent/feedback/proguard/u:b	Landroid/content/Context;
    //   980: invokestatic 179	com/tencent/feedback/proguard/t:a	(Landroid/content/Context;)Lcom/tencent/feedback/proguard/t;
    //   983: iconst_4
    //   984: invokevirtual 238	com/tencent/feedback/proguard/t:a	(I)V
    //   987: return
    //   988: ldc_w 380
    //   991: iconst_0
    //   992: anewarray 4	java/lang/Object
    //   995: invokestatic 162	com/tencent/feedback/common/e:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   998: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	999	0	this	u
    //   18	730	1	localObject1	Object
    //   819	2	1	localInterruptedException	InterruptedException
    //   827	4	1	localObject2	Object
    //   856	37	1	arrayOfs	s[]
    //   910	4	1	localObject3	Object
    //   282	428	2	localObject4	Object
    //   13	899	3	localt	t
    //   66	637	4	str1	String
    //   265	451	5	str2	String
    //   279	491	6	localObject5	Object
    //   153	753	7	i	int
    //   150	740	8	j	int
    //   26	942	9	l1	long
    //   4	830	11	l2	long
    //   247	565	13	l3	long
    //   253	477	15	l4	long
    //   99	663	17	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   811	816	819	java/lang/InterruptedException
    //   122	134	827	finally
    //   852	864	910	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */