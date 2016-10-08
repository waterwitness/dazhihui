package com.android.dazhihui.richscan.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;

public final class c
{
  static final int a;
  private static final String b = c.class.getSimpleName();
  private static int c = 240;
  private static int d = 240;
  private static int e = 1080;
  private static int f = 1080;
  private static c g;
  private final Context h;
  private final b i;
  private Camera j;
  private Rect k;
  private Rect l;
  private boolean m;
  private boolean n;
  private final boolean o;
  private final f p;
  private final a q;
  
  static
  {
    try
    {
      i1 = Build.VERSION.SDK_INT;
      a = i1;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        int i1 = 10000;
      }
    }
  }
  
  private c(Context paramContext)
  {
    this.h = paramContext;
    this.i = new b(paramContext);
    if (Build.VERSION.SDK_INT > 3) {}
    for (boolean bool = true;; bool = false)
    {
      this.o = bool;
      this.p = new f(this.i, this.o);
      this.q = new a();
      return;
    }
  }
  
  public static c a()
  {
    return g;
  }
  
  public static void a(Context paramContext)
  {
    if (g == null) {
      g = new c(paramContext);
    }
  }
  
  public e a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Rect localRect = g();
    int i1 = this.i.c();
    String str = this.i.d();
    switch (i1)
    {
    default: 
      if ("yuv420p".equals(str)) {
        return new e(paramArrayOfByte, paramInt1, paramInt2, localRect.left, localRect.top, localRect.width(), localRect.height());
      }
      break;
    case 16: 
    case 17: 
      return new e(paramArrayOfByte, paramInt1, paramInt2, localRect.left, localRect.top, localRect.width(), localRect.height());
    }
    throw new IllegalArgumentException("Unsupported picture format: " + i1 + '/' + str);
  }
  
  public void a(Handler paramHandler, int paramInt)
  {
    if ((this.j != null) && (this.n))
    {
      this.p.a(paramHandler, paramInt);
      if (this.o) {
        this.j.setOneShotPreviewCallback(this.p);
      }
    }
    else
    {
      return;
    }
    this.j.setPreviewCallback(this.p);
  }
  
  public void a(SurfaceHolder paramSurfaceHolder)
  {
    if (this.j == null)
    {
      this.j = Camera.open();
      if (this.j == null) {
        throw new IOException();
      }
      this.j.setPreviewDisplay(paramSurfaceHolder);
      if (!this.m)
      {
        this.m = true;
        this.i.a(this.j);
      }
      this.i.b(this.j);
      d.a();
    }
  }
  
  public void b(Handler paramHandler, int paramInt)
  {
    if ((this.j != null) && (this.n))
    {
      this.q.a(paramHandler, paramInt);
      this.j.autoFocus(this.q);
    }
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 151	com/android/dazhihui/richscan/a/c:j	Landroid/hardware/Camera;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	c
    //   6	2	1	localCamera	Camera
    //   22	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void c()
  {
    if (this.j != null)
    {
      d.b();
      this.j.release();
      this.j = null;
    }
  }
  
  public void d()
  {
    if ((this.j != null) && (!this.n))
    {
      this.j.startPreview();
      this.n = true;
    }
  }
  
  public void e()
  {
    if ((this.j != null) && (this.n))
    {
      if (!this.o) {
        this.j.setPreviewCallback(null);
      }
      this.j.stopPreview();
      this.p.a(null, 0);
      this.q.a(null, 0);
      this.n = false;
    }
  }
  
  public Rect f()
  {
    Point localPoint;
    int i2;
    int i1;
    if (this.k == null)
    {
      localPoint = this.i.b();
      if (this.j == null) {
        return null;
      }
      i2 = localPoint.x * 2 / 3;
      if (i2 >= c) {
        break label118;
      }
      i1 = c;
    }
    for (;;)
    {
      i2 = (localPoint.x - i1) / 2;
      int i3 = (localPoint.y - i1) / 3;
      this.k = new Rect(i2, i3, i2 + i1, i1 + i3);
      Log.d(b, "Calculated framing rect: " + this.k);
      return this.k;
      label118:
      i1 = i2;
      if (i2 > e) {
        i1 = e;
      }
    }
  }
  
  public Rect g()
  {
    if (this.l == null)
    {
      Rect localRect = new Rect(f());
      Point localPoint1 = this.i.a();
      Point localPoint2 = this.i.b();
      localRect.left = (localRect.left * localPoint1.y / localPoint2.x);
      localRect.right = (localRect.right * localPoint1.y / localPoint2.x);
      localRect.top = (localRect.top * localPoint1.x / localPoint2.y);
      int i1 = localRect.bottom;
      localRect.bottom = (localPoint1.x * i1 / localPoint2.y);
      this.l = localRect;
    }
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */