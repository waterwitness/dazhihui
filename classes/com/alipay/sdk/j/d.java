package com.alipay.sdk.j;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;

public class d
{
  public Activity a;
  private com.alipay.b.a.a b;
  private final Object c = com.alipay.b.a.a.class;
  private boolean d;
  private e e;
  private ServiceConnection f = new f(this);
  private com.alipay.b.a.d g = new g(this);
  
  public d(Activity paramActivity, e parame)
  {
    this.a = paramActivity;
    this.e = parame;
  }
  
  /* Error */
  private String b(String paramString)
  {
    // Byte code:
    //   0: new 56	android/content/Intent
    //   3: dup
    //   4: invokespecial 57	android/content/Intent:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: ldc 59
    //   11: invokevirtual 63	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   14: pop
    //   15: aload_3
    //   16: ldc 65
    //   18: invokevirtual 68	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   21: pop
    //   22: aload_0
    //   23: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   26: invokestatic 73	com/alipay/sdk/j/j:g	(Landroid/content/Context;)Ljava/lang/String;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   34: invokevirtual 79	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   37: aload_3
    //   38: aload_0
    //   39: getfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   42: iconst_1
    //   43: invokevirtual 85	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   46: pop
    //   47: aload_0
    //   48: getfield 27	com/alipay/sdk/j/d:c	Ljava/lang/Object;
    //   51: astore_3
    //   52: aload_3
    //   53: monitorenter
    //   54: aload_0
    //   55: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   58: astore 4
    //   60: aload 4
    //   62: ifnonnull +17 -> 79
    //   65: aload_0
    //   66: getfield 27	com/alipay/sdk/j/d:c	Ljava/lang/Object;
    //   69: invokestatic 90	com/alipay/sdk/c/a:b	()Lcom/alipay/sdk/c/a;
    //   72: invokevirtual 93	com/alipay/sdk/c/a:a	()I
    //   75: i2l
    //   76: invokevirtual 97	java/lang/Object:wait	(J)V
    //   79: aload_3
    //   80: monitorexit
    //   81: aload_0
    //   82: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   85: ifnonnull +157 -> 242
    //   88: aload_0
    //   89: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   92: invokestatic 73	com/alipay/sdk/j/j:g	(Landroid/content/Context;)Ljava/lang/String;
    //   95: astore_1
    //   96: aload_0
    //   97: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   100: invokestatic 100	com/alipay/sdk/j/j:h	(Landroid/content/Context;)Ljava/lang/String;
    //   103: astore_3
    //   104: ldc 102
    //   106: ldc 104
    //   108: new 106	java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial 107	java/lang/StringBuilder:<init>	()V
    //   115: aload_2
    //   116: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: ldc 113
    //   121: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_1
    //   125: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 113
    //   130: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: aload_3
    //   134: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 122	com/alipay/sdk/app/a/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   143: ldc 124
    //   145: astore_2
    //   146: aload_0
    //   147: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   150: aload_0
    //   151: getfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   154: invokeinterface 127 2 0
    //   159: aload_0
    //   160: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   163: aload_0
    //   164: getfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   167: invokevirtual 131	android/app/Activity:unbindService	(Landroid/content/ServiceConnection;)V
    //   170: aload_0
    //   171: aconst_null
    //   172: putfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   175: aload_0
    //   176: aconst_null
    //   177: putfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   180: aload_0
    //   181: aconst_null
    //   182: putfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   185: aload_2
    //   186: astore_1
    //   187: aload_0
    //   188: getfield 133	com/alipay/sdk/j/d:d	Z
    //   191: ifeq +18 -> 209
    //   194: aload_0
    //   195: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   198: iconst_0
    //   199: invokevirtual 137	android/app/Activity:setRequestedOrientation	(I)V
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield 133	com/alipay/sdk/j/d:d	Z
    //   207: aload_2
    //   208: astore_1
    //   209: aload_1
    //   210: areturn
    //   211: astore_1
    //   212: ldc 102
    //   214: ldc -117
    //   216: aload_1
    //   217: invokestatic 142	com/alipay/sdk/app/a/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   220: ldc 124
    //   222: areturn
    //   223: astore 4
    //   225: ldc 102
    //   227: ldc -112
    //   229: aload 4
    //   231: invokestatic 142	com/alipay/sdk/app/a/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   234: goto -155 -> 79
    //   237: astore_1
    //   238: aload_3
    //   239: monitorexit
    //   240: aload_1
    //   241: athrow
    //   242: aload_0
    //   243: getfield 43	com/alipay/sdk/j/d:e	Lcom/alipay/sdk/j/e;
    //   246: ifnull +12 -> 258
    //   249: aload_0
    //   250: getfield 43	com/alipay/sdk/j/d:e	Lcom/alipay/sdk/j/e;
    //   253: invokeinterface 148 1 0
    //   258: aload_0
    //   259: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   262: invokevirtual 151	android/app/Activity:getRequestedOrientation	()I
    //   265: ifne +16 -> 281
    //   268: aload_0
    //   269: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   272: iconst_1
    //   273: invokevirtual 137	android/app/Activity:setRequestedOrientation	(I)V
    //   276: aload_0
    //   277: iconst_1
    //   278: putfield 133	com/alipay/sdk/j/d:d	Z
    //   281: aload_0
    //   282: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   285: aload_0
    //   286: getfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   289: invokeinterface 153 2 0
    //   294: aload_0
    //   295: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   298: aload_1
    //   299: invokeinterface 155 2 0
    //   304: astore_2
    //   305: aload_0
    //   306: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   309: aload_0
    //   310: getfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   313: invokeinterface 127 2 0
    //   318: aload_0
    //   319: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   322: aload_0
    //   323: getfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   326: invokevirtual 131	android/app/Activity:unbindService	(Landroid/content/ServiceConnection;)V
    //   329: aload_0
    //   330: aconst_null
    //   331: putfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   334: aload_0
    //   335: aconst_null
    //   336: putfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   339: aload_0
    //   340: aconst_null
    //   341: putfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   344: aload_2
    //   345: astore_1
    //   346: aload_0
    //   347: getfield 133	com/alipay/sdk/j/d:d	Z
    //   350: ifeq -141 -> 209
    //   353: aload_0
    //   354: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   357: iconst_0
    //   358: invokevirtual 137	android/app/Activity:setRequestedOrientation	(I)V
    //   361: aload_0
    //   362: iconst_0
    //   363: putfield 133	com/alipay/sdk/j/d:d	Z
    //   366: aload_2
    //   367: areturn
    //   368: astore_1
    //   369: ldc 102
    //   371: ldc -99
    //   373: aload_1
    //   374: invokestatic 142	com/alipay/sdk/app/a/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   377: invokestatic 161	com/alipay/sdk/app/i:a	()Ljava/lang/String;
    //   380: astore_2
    //   381: aload_0
    //   382: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   385: aload_0
    //   386: getfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   389: invokeinterface 127 2 0
    //   394: aload_0
    //   395: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   398: aload_0
    //   399: getfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   402: invokevirtual 131	android/app/Activity:unbindService	(Landroid/content/ServiceConnection;)V
    //   405: aload_0
    //   406: aconst_null
    //   407: putfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   410: aload_0
    //   411: aconst_null
    //   412: putfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   415: aload_0
    //   416: aconst_null
    //   417: putfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   420: aload_2
    //   421: astore_1
    //   422: aload_0
    //   423: getfield 133	com/alipay/sdk/j/d:d	Z
    //   426: ifeq -217 -> 209
    //   429: aload_0
    //   430: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   433: iconst_0
    //   434: invokevirtual 137	android/app/Activity:setRequestedOrientation	(I)V
    //   437: aload_0
    //   438: iconst_0
    //   439: putfield 133	com/alipay/sdk/j/d:d	Z
    //   442: aload_2
    //   443: areturn
    //   444: astore_1
    //   445: aload_0
    //   446: getfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   449: aload_0
    //   450: getfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   453: invokeinterface 127 2 0
    //   458: aload_0
    //   459: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   462: aload_0
    //   463: getfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   466: invokevirtual 131	android/app/Activity:unbindService	(Landroid/content/ServiceConnection;)V
    //   469: aload_0
    //   470: aconst_null
    //   471: putfield 39	com/alipay/sdk/j/d:g	Lcom/alipay/b/a/d;
    //   474: aload_0
    //   475: aconst_null
    //   476: putfield 34	com/alipay/sdk/j/d:f	Landroid/content/ServiceConnection;
    //   479: aload_0
    //   480: aconst_null
    //   481: putfield 47	com/alipay/sdk/j/d:b	Lcom/alipay/b/a/a;
    //   484: aload_0
    //   485: getfield 133	com/alipay/sdk/j/d:d	Z
    //   488: ifeq +16 -> 504
    //   491: aload_0
    //   492: getfield 41	com/alipay/sdk/j/d:a	Landroid/app/Activity;
    //   495: iconst_0
    //   496: invokevirtual 137	android/app/Activity:setRequestedOrientation	(I)V
    //   499: aload_0
    //   500: iconst_0
    //   501: putfield 133	com/alipay/sdk/j/d:d	Z
    //   504: aload_1
    //   505: athrow
    //   506: astore_2
    //   507: goto -38 -> 469
    //   510: astore_2
    //   511: goto -53 -> 458
    //   514: astore_1
    //   515: goto -110 -> 405
    //   518: astore_1
    //   519: goto -125 -> 394
    //   522: astore_1
    //   523: goto -194 -> 329
    //   526: astore_1
    //   527: goto -209 -> 318
    //   530: astore_1
    //   531: goto -361 -> 170
    //   534: astore_1
    //   535: goto -376 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	538	0	this	d
    //   0	538	1	paramString	String
    //   29	414	2	str	String
    //   506	1	2	localThrowable1	Throwable
    //   510	1	2	localThrowable2	Throwable
    //   7	232	3	localObject	Object
    //   58	3	4	locala	com.alipay.b.a.a
    //   223	7	4	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   30	47	211	java/lang/Throwable
    //   65	79	223	java/lang/InterruptedException
    //   54	60	237	finally
    //   65	79	237	finally
    //   79	81	237	finally
    //   225	234	237	finally
    //   81	143	368	java/lang/Throwable
    //   242	258	368	java/lang/Throwable
    //   258	281	368	java/lang/Throwable
    //   281	305	368	java/lang/Throwable
    //   81	143	444	finally
    //   242	258	444	finally
    //   258	281	444	finally
    //   281	305	444	finally
    //   369	381	444	finally
    //   458	469	506	java/lang/Throwable
    //   445	458	510	java/lang/Throwable
    //   394	405	514	java/lang/Throwable
    //   381	394	518	java/lang/Throwable
    //   318	329	522	java/lang/Throwable
    //   305	318	526	java/lang/Throwable
    //   159	170	530	java/lang/Throwable
    //   146	159	534	java/lang/Throwable
  }
  
  public final String a(String paramString)
  {
    for (;;)
    {
      try
      {
        localObject = j.a(this.a, "com.eg.android.AlipayGphone");
        if (((k)localObject).a()) {
          return "failed";
        }
        if (localObject != null)
        {
          int i = ((k)localObject).b;
          if (i > 78) {
            continue;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject;
        com.alipay.sdk.app.a.a.a("biz", "CheckClientSignEx", localThrowable);
        continue;
      }
      return b(paramString);
      localObject = new Intent();
      ((Intent)localObject).setClassName("com.eg.android.AlipayGphone", "com.alipay.android.app.TransProcessPayActivity");
      this.a.startActivity((Intent)localObject);
      Thread.sleep(200L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */