package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThumbUpAnimationView
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  mm a;
  mo b;
  mp c;
  Paint d = new Paint();
  List<Bitmap> e = new ArrayList();
  public int f;
  public int g;
  int h;
  int i;
  int j;
  int k;
  int l;
  RectF m = new RectF();
  private int n;
  private int o;
  private int[] p = { 2130838172, 2130838173, 2130838174, 2130838175, 2130838176, 2130838177, 2130838178 };
  private PaintFlagsDrawFilter q;
  private int r = -1;
  private ArrayList<mn> s;
  private Handler t = new Handler(new ml(this));
  
  public ThumbUpAnimationView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public ThumbUpAnimationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public ThumbUpAnimationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    getHolder().addCallback(this);
    this.b = new mo(this);
    setZOrderOnTop(true);
    getHolder().setFormat(-2);
    if (this.d == null) {
      this.d = new Paint();
    }
    this.q = new PaintFlagsDrawFilter(0, 3);
    this.d.setAntiAlias(true);
    int i1 = 0;
    while (i1 < this.p.length)
    {
      this.e.add(((BitmapDrawable)getResources().getDrawable(this.p[i1])).getBitmap());
      i1 += 1;
    }
    this.o = getResources().getDimensionPixelSize(2131230780);
    c();
  }
  
  private void a(Canvas paramCanvas)
  {
    if (paramCanvas != null) {
      try
      {
        paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if ((this.b.a != null) && (this.b.a.size() > 0))
        {
          this.s = new ArrayList(this.b.a);
          paramCanvas.setDrawFilter(this.q);
          Iterator localIterator = this.s.iterator();
          while (localIterator.hasNext())
          {
            mn localmn = (mn)localIterator.next();
            this.m.set(localmn.f, localmn.g, localmn.f + localmn.a * 2, localmn.g + localmn.a * 2);
            this.d.setAlpha(localmn.i);
            paramCanvas.drawBitmap((Bitmap)this.e.get(localmn.j), null, this.m, this.d);
          }
        }
        return;
      }
      catch (Exception paramCanvas)
      {
        paramCanvas.printStackTrace();
      }
    }
  }
  
  private void c()
  {
    this.h = 0;
    this.i = 30;
    this.j = 90;
    this.k = -50;
    this.l = 40;
  }
  
  public void a()
  {
    if ((this.a != null) && (this.a.isAlive()) && (this.c != null) && (this.c.isAlive())) {
      try
      {
        notifyAll();
        return;
      }
      finally {}
    }
    this.a = new mm(this, this, getHolder());
    this.c = new mp(this, this);
    this.a.start();
    this.c.start();
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      if ((this.c != null) && (this.c.isAlive())) {
        this.c.a(paramInt, paramBoolean);
      }
    }
    for (;;)
    {
      try
      {
        notifyAll();
        return;
      }
      finally {}
      if ((this.c != null) && (this.c.isAlive()) && (paramInt > 0)) {
        this.c.a(1, false);
      }
      this.n += paramInt;
      paramInt = this.n - 1;
      this.n = paramInt;
      if (paramInt > 0)
      {
        this.t.removeMessages(0);
        this.t.sendEmptyMessage(0);
      }
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   4: ifnull +28 -> 32
    //   7: aload_0
    //   8: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   11: invokevirtual 257	com/android/dazhihui/ui/widget/mm:isAlive	()Z
    //   14: ifeq +18 -> 32
    //   17: aload_0
    //   18: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   21: iconst_0
    //   22: putfield 290	com/android/dazhihui/ui/widget/mm:c	Z
    //   25: aload_0
    //   26: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   29: invokevirtual 293	com/android/dazhihui/ui/widget/mm:interrupt	()V
    //   32: aload_0
    //   33: getfield 259	com/android/dazhihui/ui/widget/ThumbUpAnimationView:c	Lcom/android/dazhihui/ui/widget/mp;
    //   36: ifnull +28 -> 64
    //   39: aload_0
    //   40: getfield 259	com/android/dazhihui/ui/widget/ThumbUpAnimationView:c	Lcom/android/dazhihui/ui/widget/mp;
    //   43: invokevirtual 262	com/android/dazhihui/ui/widget/mp:isAlive	()Z
    //   46: ifeq +18 -> 64
    //   49: aload_0
    //   50: getfield 259	com/android/dazhihui/ui/widget/ThumbUpAnimationView:c	Lcom/android/dazhihui/ui/widget/mp;
    //   53: iconst_0
    //   54: putfield 295	com/android/dazhihui/ui/widget/mp:a	Z
    //   57: aload_0
    //   58: getfield 259	com/android/dazhihui/ui/widget/ThumbUpAnimationView:c	Lcom/android/dazhihui/ui/widget/mp;
    //   61: invokevirtual 296	com/android/dazhihui/ui/widget/mp:interrupt	()V
    //   64: aload_0
    //   65: monitorenter
    //   66: aload_0
    //   67: invokevirtual 267	java/lang/Object:notifyAll	()V
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_0
    //   73: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   76: ifnull +13 -> 89
    //   79: aload_0
    //   80: getfield 252	com/android/dazhihui/ui/widget/ThumbUpAnimationView:a	Lcom/android/dazhihui/ui/widget/mm;
    //   83: ldc2_w 297
    //   86: invokevirtual 302	com/android/dazhihui/ui/widget/mm:join	(J)V
    //   89: return
    //   90: astore_1
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_1
    //   94: athrow
    //   95: astore_1
    //   96: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	ThumbUpAnimationView
    //   90	4	1	localObject	Object
    //   95	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   66	72	90	finally
    //   91	93	90	finally
    //   79	89	95	java/lang/Exception
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 != 0) {
      this.f = paramInt2;
    }
    if (paramInt3 != 0) {
      this.g = paramInt3;
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    Log.d("ThumbUpAnimationView", "ThumbUpAnimationView : surfaceCreated()");
    a();
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    Log.d("ThumbUpAnimationView", "ThumbUpAnimationView : surfaceDestroyed()");
    b();
    this.t.removeMessages(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ThumbUpAnimationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */