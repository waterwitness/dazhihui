package com.android.dazhihui.ui.widget;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

class mm
  extends Thread
{
  WeakReference<ThumbUpAnimationView> a;
  SurfaceHolder b;
  boolean c = true;
  int d = 10;
  long e;
  
  public mm(ThumbUpAnimationView paramThumbUpAnimationView1, ThumbUpAnimationView paramThumbUpAnimationView2, SurfaceHolder paramSurfaceHolder)
  {
    this.a = new WeakReference(paramThumbUpAnimationView2);
    this.b = paramSurfaceHolder;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 28	com/android/dazhihui/ui/widget/mm:c	Z
    //   6: ifeq +20 -> 26
    //   9: aload_0
    //   10: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   13: ifnull +13 -> 26
    //   16: aload_0
    //   17: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   20: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   23: ifnonnull +104 -> 127
    //   26: aload_0
    //   27: getfield 21	com/android/dazhihui/ui/widget/mm:f	Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;
    //   30: getfield 52	com/android/dazhihui/ui/widget/ThumbUpAnimationView:b	Lcom/android/dazhihui/ui/widget/mo;
    //   33: getfield 57	com/android/dazhihui/ui/widget/mo:a	Ljava/util/ArrayList;
    //   36: invokevirtual 62	java/util/ArrayList:clear	()V
    //   39: aload_0
    //   40: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   43: invokeinterface 68 1 0
    //   48: astore_2
    //   49: aload_2
    //   50: astore_1
    //   51: aload_0
    //   52: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   55: astore_3
    //   56: aload_2
    //   57: astore_1
    //   58: aload_3
    //   59: monitorenter
    //   60: aload_0
    //   61: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   64: ifnull +27 -> 91
    //   67: aload_0
    //   68: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   71: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   74: ifnull +17 -> 91
    //   77: aload_0
    //   78: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   81: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   84: checkcast 49	com/android/dazhihui/ui/widget/ThumbUpAnimationView
    //   87: aload_2
    //   88: invokestatic 71	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	(Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;Landroid/graphics/Canvas;)V
    //   91: aload_3
    //   92: monitorexit
    //   93: aload_2
    //   94: ifnull +13 -> 107
    //   97: aload_0
    //   98: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   101: aload_2
    //   102: invokeinterface 75 2 0
    //   107: aload_0
    //   108: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   111: ifnull +15 -> 126
    //   114: aload_0
    //   115: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   118: invokevirtual 76	java/lang/ref/WeakReference:clear	()V
    //   121: aload_0
    //   122: aconst_null
    //   123: putfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   126: return
    //   127: aload_1
    //   128: astore_2
    //   129: aload_0
    //   130: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   133: invokeinterface 68 1 0
    //   138: astore_3
    //   139: aload_3
    //   140: astore_1
    //   141: aload_0
    //   142: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   145: astore_2
    //   146: aload_2
    //   147: monitorenter
    //   148: aload_0
    //   149: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   152: ifnull +27 -> 179
    //   155: aload_0
    //   156: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   159: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   162: ifnull +17 -> 179
    //   165: aload_0
    //   166: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   169: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   172: checkcast 49	com/android/dazhihui/ui/widget/ThumbUpAnimationView
    //   175: aload_1
    //   176: invokestatic 71	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	(Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;Landroid/graphics/Canvas;)V
    //   179: aload_2
    //   180: monitorexit
    //   181: aload_1
    //   182: ifnull +446 -> 628
    //   185: aload_0
    //   186: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   189: aload_1
    //   190: invokeinterface 75 2 0
    //   195: aload_1
    //   196: astore_2
    //   197: aload_0
    //   198: getfield 21	com/android/dazhihui/ui/widget/mm:f	Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;
    //   201: getfield 52	com/android/dazhihui/ui/widget/ThumbUpAnimationView:b	Lcom/android/dazhihui/ui/widget/mo;
    //   204: getfield 57	com/android/dazhihui/ui/widget/mo:a	Ljava/util/ArrayList;
    //   207: invokevirtual 80	java/util/ArrayList:size	()I
    //   210: ifne +266 -> 476
    //   213: aload_0
    //   214: getfield 21	com/android/dazhihui/ui/widget/mm:f	Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;
    //   217: invokestatic 83	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	(Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;)I
    //   220: iconst_1
    //   221: if_icmpge +255 -> 476
    //   224: aload_2
    //   225: astore_1
    //   226: aload_0
    //   227: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   230: invokeinterface 68 1 0
    //   235: astore_3
    //   236: aload_3
    //   237: astore_1
    //   238: aload_0
    //   239: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   242: astore_2
    //   243: aload_2
    //   244: monitorenter
    //   245: aload_0
    //   246: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   249: ifnull +27 -> 276
    //   252: aload_0
    //   253: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   256: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   259: ifnull +17 -> 276
    //   262: aload_0
    //   263: getfield 35	com/android/dazhihui/ui/widget/mm:a	Ljava/lang/ref/WeakReference;
    //   266: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   269: checkcast 49	com/android/dazhihui/ui/widget/ThumbUpAnimationView
    //   272: aload_1
    //   273: invokestatic 71	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	(Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;Landroid/graphics/Canvas;)V
    //   276: aload_2
    //   277: monitorexit
    //   278: aload_1
    //   279: ifnull +346 -> 625
    //   282: aload_0
    //   283: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   286: aload_1
    //   287: invokeinterface 75 2 0
    //   292: aload_0
    //   293: getfield 21	com/android/dazhihui/ui/widget/mm:f	Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;
    //   296: astore_2
    //   297: aload_2
    //   298: monitorenter
    //   299: aload_0
    //   300: getfield 21	com/android/dazhihui/ui/widget/mm:f	Lcom/android/dazhihui/ui/widget/ThumbUpAnimationView;
    //   303: invokevirtual 88	java/lang/Object:wait	()V
    //   306: aload_2
    //   307: monitorexit
    //   308: goto -306 -> 2
    //   311: astore_1
    //   312: aload_2
    //   313: monitorexit
    //   314: aload_1
    //   315: athrow
    //   316: astore_3
    //   317: aload_2
    //   318: monitorexit
    //   319: aload_3
    //   320: athrow
    //   321: astore_3
    //   322: aload_1
    //   323: astore_2
    //   324: aload_3
    //   325: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   328: aload_1
    //   329: astore_2
    //   330: aload_1
    //   331: ifnull -134 -> 197
    //   334: aload_0
    //   335: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   338: aload_1
    //   339: invokeinterface 75 2 0
    //   344: aload_1
    //   345: astore_2
    //   346: goto -149 -> 197
    //   349: astore_2
    //   350: aload_2
    //   351: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   354: aload_1
    //   355: astore_2
    //   356: goto -159 -> 197
    //   359: astore_2
    //   360: aload_2
    //   361: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   364: aload_1
    //   365: astore_2
    //   366: goto -169 -> 197
    //   369: astore_3
    //   370: aload_1
    //   371: astore_2
    //   372: aload_3
    //   373: astore_1
    //   374: aload_2
    //   375: ifnull +13 -> 388
    //   378: aload_0
    //   379: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   382: aload_2
    //   383: invokeinterface 75 2 0
    //   388: aload_1
    //   389: athrow
    //   390: astore_2
    //   391: aload_2
    //   392: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   395: goto -7 -> 388
    //   398: astore_3
    //   399: aload_2
    //   400: monitorexit
    //   401: aload_3
    //   402: athrow
    //   403: astore_3
    //   404: aload_1
    //   405: astore_2
    //   406: aload_2
    //   407: astore_1
    //   408: aload_3
    //   409: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   412: aload_2
    //   413: astore_1
    //   414: aload_2
    //   415: ifnull -123 -> 292
    //   418: aload_0
    //   419: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   422: aload_2
    //   423: invokeinterface 75 2 0
    //   428: aload_2
    //   429: astore_1
    //   430: goto -138 -> 292
    //   433: astore_1
    //   434: aload_1
    //   435: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   438: aload_2
    //   439: astore_1
    //   440: goto -148 -> 292
    //   443: astore_2
    //   444: aload_2
    //   445: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   448: goto -156 -> 292
    //   451: astore_2
    //   452: aload_1
    //   453: ifnull +13 -> 466
    //   456: aload_0
    //   457: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   460: aload_1
    //   461: invokeinterface 75 2 0
    //   466: aload_2
    //   467: athrow
    //   468: astore_1
    //   469: aload_1
    //   470: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   473: goto -7 -> 466
    //   476: aload_2
    //   477: astore_1
    //   478: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   481: aload_0
    //   482: getfield 99	com/android/dazhihui/ui/widget/mm:e	J
    //   485: lsub
    //   486: aload_0
    //   487: getfield 26	com/android/dazhihui/ui/widget/mm:d	I
    //   490: i2l
    //   491: lcmp
    //   492: ifle -490 -> 2
    //   495: aload_0
    //   496: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   499: putfield 99	com/android/dazhihui/ui/widget/mm:e	J
    //   502: aload_0
    //   503: getfield 26	com/android/dazhihui/ui/widget/mm:d	I
    //   506: i2l
    //   507: invokestatic 103	java/lang/Thread:sleep	(J)V
    //   510: aload_2
    //   511: astore_1
    //   512: goto -510 -> 2
    //   515: astore_1
    //   516: aload_2
    //   517: astore_1
    //   518: goto -516 -> 2
    //   521: astore 4
    //   523: aload_3
    //   524: monitorexit
    //   525: aload_2
    //   526: astore_1
    //   527: aload 4
    //   529: athrow
    //   530: astore_3
    //   531: aload_2
    //   532: astore_1
    //   533: aload_3
    //   534: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   537: aload_2
    //   538: ifnull -431 -> 107
    //   541: aload_0
    //   542: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   545: aload_2
    //   546: invokeinterface 75 2 0
    //   551: goto -444 -> 107
    //   554: astore_1
    //   555: aload_1
    //   556: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   559: goto -452 -> 107
    //   562: astore_1
    //   563: aload_1
    //   564: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   567: goto -460 -> 107
    //   570: astore_2
    //   571: aload_1
    //   572: ifnull +13 -> 585
    //   575: aload_0
    //   576: getfield 37	com/android/dazhihui/ui/widget/mm:b	Landroid/view/SurfaceHolder;
    //   579: aload_1
    //   580: invokeinterface 75 2 0
    //   585: aload_2
    //   586: athrow
    //   587: astore_1
    //   588: aload_1
    //   589: invokevirtual 91	java/lang/Exception:printStackTrace	()V
    //   592: goto -7 -> 585
    //   595: astore_2
    //   596: goto -25 -> 571
    //   599: astore_3
    //   600: aload_1
    //   601: astore_2
    //   602: goto -71 -> 531
    //   605: astore_3
    //   606: goto -300 -> 306
    //   609: astore_2
    //   610: goto -158 -> 452
    //   613: astore_3
    //   614: goto -208 -> 406
    //   617: astore_1
    //   618: goto -244 -> 374
    //   621: astore_3
    //   622: goto -300 -> 322
    //   625: goto -333 -> 292
    //   628: aload_1
    //   629: astore_2
    //   630: goto -433 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	633	0	this	mm
    //   1	286	1	localObject1	Object
    //   311	60	1	localCanvas1	android.graphics.Canvas
    //   373	57	1	localObject2	Object
    //   433	2	1	localException1	Exception
    //   439	22	1	localObject3	Object
    //   468	2	1	localException2	Exception
    //   477	35	1	localObject4	Object
    //   515	1	1	localException3	Exception
    //   517	16	1	localObject5	Object
    //   554	2	1	localException4	Exception
    //   562	18	1	localException5	Exception
    //   587	14	1	localException6	Exception
    //   617	12	1	localObject6	Object
    //   349	2	2	localException7	Exception
    //   355	1	2	localCanvas2	android.graphics.Canvas
    //   359	2	2	localException8	Exception
    //   365	18	2	localCanvas3	android.graphics.Canvas
    //   390	10	2	localException9	Exception
    //   405	34	2	localObject8	Object
    //   443	2	2	localException10	Exception
    //   451	95	2	localCanvas4	android.graphics.Canvas
    //   570	16	2	localObject9	Object
    //   595	1	2	localObject10	Object
    //   601	1	2	localException11	Exception
    //   609	1	2	localObject11	Object
    //   629	1	2	localObject12	Object
    //   55	182	3	localObject13	Object
    //   316	4	3	localObject14	Object
    //   321	4	3	localException12	Exception
    //   369	4	3	localObject15	Object
    //   398	4	3	localObject16	Object
    //   403	121	3	localException13	Exception
    //   530	4	3	localException14	Exception
    //   599	1	3	localException15	Exception
    //   605	1	3	localInterruptedException	InterruptedException
    //   613	1	3	localException16	Exception
    //   621	1	3	localException17	Exception
    //   521	7	4	localObject17	Object
    // Exception table:
    //   from	to	target	type
    //   299	306	311	finally
    //   306	308	311	finally
    //   312	314	311	finally
    //   148	179	316	finally
    //   179	181	316	finally
    //   317	319	316	finally
    //   141	148	321	java/lang/Exception
    //   319	321	321	java/lang/Exception
    //   334	344	349	java/lang/Exception
    //   185	195	359	java/lang/Exception
    //   141	148	369	finally
    //   319	321	369	finally
    //   378	388	390	java/lang/Exception
    //   245	276	398	finally
    //   276	278	398	finally
    //   399	401	398	finally
    //   238	245	403	java/lang/Exception
    //   401	403	403	java/lang/Exception
    //   418	428	433	java/lang/Exception
    //   282	292	443	java/lang/Exception
    //   226	236	451	finally
    //   408	412	451	finally
    //   456	466	468	java/lang/Exception
    //   502	510	515	java/lang/Exception
    //   60	91	521	finally
    //   91	93	521	finally
    //   523	525	521	finally
    //   51	56	530	java/lang/Exception
    //   58	60	530	java/lang/Exception
    //   527	530	530	java/lang/Exception
    //   541	551	554	java/lang/Exception
    //   97	107	562	java/lang/Exception
    //   39	49	570	finally
    //   575	585	587	java/lang/Exception
    //   51	56	595	finally
    //   58	60	595	finally
    //   527	530	595	finally
    //   533	537	595	finally
    //   39	49	599	java/lang/Exception
    //   299	306	605	java/lang/InterruptedException
    //   238	245	609	finally
    //   401	403	609	finally
    //   226	236	613	java/lang/Exception
    //   129	139	617	finally
    //   324	328	617	finally
    //   129	139	621	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */