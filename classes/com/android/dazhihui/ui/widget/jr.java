package com.android.dazhihui.ui.widget;

import android.view.SurfaceHolder;

class jr
  extends Thread
{
  ParticleView a;
  SurfaceHolder b;
  boolean c = true;
  int d = 2;
  
  public jr(ParticleView paramParticleView1, ParticleView paramParticleView2, SurfaceHolder paramSurfaceHolder)
  {
    this.a = paramParticleView2;
    this.b = paramSurfaceHolder;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 24	com/android/dazhihui/ui/widget/jr:c	Z
    //   6: ifeq +34 -> 40
    //   9: aload_0
    //   10: getfield 17	com/android/dazhihui/ui/widget/jr:e	Lcom/android/dazhihui/ui/widget/ParticleView;
    //   13: getfield 37	com/android/dazhihui/ui/widget/ParticleView:b	Lcom/android/dazhihui/ui/widget/ju;
    //   16: getfield 42	com/android/dazhihui/ui/widget/ju:a	Ljava/util/ArrayList;
    //   19: invokevirtual 48	java/util/ArrayList:size	()I
    //   22: ifne +19 -> 41
    //   25: aload_0
    //   26: getfield 17	com/android/dazhihui/ui/widget/jr:e	Lcom/android/dazhihui/ui/widget/ParticleView;
    //   29: invokestatic 51	com/android/dazhihui/ui/widget/ParticleView:a	(Lcom/android/dazhihui/ui/widget/ParticleView;)Z
    //   32: ifeq +9 -> 41
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield 24	com/android/dazhihui/ui/widget/jr:c	Z
    //   40: return
    //   41: aload_0
    //   42: getfield 28	com/android/dazhihui/ui/widget/jr:b	Landroid/view/SurfaceHolder;
    //   45: invokeinterface 57 1 0
    //   50: astore_2
    //   51: aload_2
    //   52: astore_1
    //   53: aload_1
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 28	com/android/dazhihui/ui/widget/jr:b	Landroid/view/SurfaceHolder;
    //   59: astore_3
    //   60: aload_1
    //   61: astore_2
    //   62: aload_3
    //   63: monitorenter
    //   64: aload_0
    //   65: getfield 26	com/android/dazhihui/ui/widget/jr:a	Lcom/android/dazhihui/ui/widget/ParticleView;
    //   68: aload_1
    //   69: invokestatic 60	com/android/dazhihui/ui/widget/ParticleView:a	(Lcom/android/dazhihui/ui/widget/ParticleView;Landroid/graphics/Canvas;)V
    //   72: aload_3
    //   73: monitorexit
    //   74: aload_1
    //   75: astore_2
    //   76: aload_1
    //   77: ifnull +96 -> 173
    //   80: aload_0
    //   81: getfield 28	com/android/dazhihui/ui/widget/jr:b	Landroid/view/SurfaceHolder;
    //   84: aload_1
    //   85: invokeinterface 64 2 0
    //   90: aload_0
    //   91: getfield 22	com/android/dazhihui/ui/widget/jr:d	I
    //   94: i2l
    //   95: invokestatic 68	java/lang/Thread:sleep	(J)V
    //   98: goto -96 -> 2
    //   101: astore_2
    //   102: aload_2
    //   103: invokevirtual 71	java/lang/Exception:printStackTrace	()V
    //   106: goto -104 -> 2
    //   109: astore 4
    //   111: aload_3
    //   112: monitorexit
    //   113: aload_1
    //   114: astore_2
    //   115: aload 4
    //   117: athrow
    //   118: astore_3
    //   119: aload_1
    //   120: astore_2
    //   121: aload_3
    //   122: invokevirtual 71	java/lang/Exception:printStackTrace	()V
    //   125: aload_1
    //   126: astore_2
    //   127: aload_1
    //   128: ifnull +45 -> 173
    //   131: aload_0
    //   132: getfield 28	com/android/dazhihui/ui/widget/jr:b	Landroid/view/SurfaceHolder;
    //   135: aload_1
    //   136: invokeinterface 64 2 0
    //   141: goto -51 -> 90
    //   144: astore_3
    //   145: aload_2
    //   146: astore_1
    //   147: aload_3
    //   148: astore_2
    //   149: aload_1
    //   150: ifnull +13 -> 163
    //   153: aload_0
    //   154: getfield 28	com/android/dazhihui/ui/widget/jr:b	Landroid/view/SurfaceHolder;
    //   157: aload_1
    //   158: invokeinterface 64 2 0
    //   163: aload_2
    //   164: athrow
    //   165: astore_2
    //   166: goto -17 -> 149
    //   169: astore_3
    //   170: goto -51 -> 119
    //   173: aload_2
    //   174: astore_1
    //   175: goto -85 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	jr
    //   1	174	1	localObject1	Object
    //   50	26	2	localObject2	Object
    //   101	2	2	localException1	Exception
    //   114	50	2	localObject3	Object
    //   165	9	2	localObject4	Object
    //   59	53	3	localSurfaceHolder	SurfaceHolder
    //   118	4	3	localException2	Exception
    //   144	4	3	localObject5	Object
    //   169	1	3	localException3	Exception
    //   109	7	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   90	98	101	java/lang/Exception
    //   64	74	109	finally
    //   111	113	109	finally
    //   55	60	118	java/lang/Exception
    //   62	64	118	java/lang/Exception
    //   115	118	118	java/lang/Exception
    //   55	60	144	finally
    //   62	64	144	finally
    //   115	118	144	finally
    //   121	125	144	finally
    //   41	51	165	finally
    //   41	51	169	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */