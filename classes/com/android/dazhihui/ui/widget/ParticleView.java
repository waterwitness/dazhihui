package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.util.ArrayList;

public class ParticleView
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  jr a;
  ju b;
  jv c;
  Paint d = new Paint();
  Bitmap e;
  public int f;
  public int g;
  jt h = jt.a;
  int i;
  int j;
  int k;
  int l;
  int m;
  int n;
  int o;
  public int p = 10;
  private long q;
  
  public ParticleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public ParticleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    getHolder().addCallback(this);
    this.a = new jr(this, this, getHolder());
    this.b = new ju(this);
    this.c = new jv(this, this);
    setZOrderOnTop(true);
    getHolder().setFormat(-2);
    if (this.d == null) {
      this.d = new Paint();
    }
    this.e = ((BitmapDrawable)getResources().getDrawable(2130838088)).getBitmap();
    b();
  }
  
  private void a(Canvas paramCanvas)
  {
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    ArrayList localArrayList = this.b.a;
    int i1 = 0;
    while (i1 < localArrayList.size())
    {
      Object localObject = (js)localArrayList.get(i1);
      float f1 = ((js)localObject).f;
      float f2 = ((js)localObject).g;
      float f3 = ((js)localObject).f;
      float f4 = ((js)localObject).a * 2;
      float f5 = ((js)localObject).g;
      localObject = new RectF(f1, f2, f3 + f4, ((js)localObject).a * 2 + f5);
      paramCanvas.drawBitmap(this.e, null, (RectF)localObject, this.d);
      i1 += 1;
    }
  }
  
  private void b()
  {
    switch (jq.a[this.h.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.j = 10;
      this.k = 10;
      this.l = 5;
      this.m = 20;
      this.n = -5;
      this.o = 10;
      this.i = 20;
      return;
    }
    this.j = 20;
    this.k = 0;
    this.l = 100;
    this.m = 200;
    this.n = 0;
    this.o = 0;
    this.i = 20;
  }
  
  private boolean c()
  {
    boolean bool = false;
    if (System.currentTimeMillis() - this.q > this.p * 1000) {
      bool = true;
    }
    return bool;
  }
  
  public void a()
  {
    this.a.c = false;
    this.a = null;
    this.c.a = false;
    this.c = null;
  }
  
  public void setAnimationDuration(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void setBitmap(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
  }
  
  public void setIncreaseNumPerSecond(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void setParticleMode(jt paramjt)
  {
    if (this.h != paramjt)
    {
      this.h = paramjt;
      b();
    }
  }
  
  public void setRadius(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setRadiusRange(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void setSpeedHorizontal(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void setSpeedHorizontalRange(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void setSpeedVertical(int paramInt)
  {
    this.l = paramInt;
  }
  
  public void setSpeedVerticalRange(int paramInt)
  {
    this.m = paramInt;
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
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {}
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ParticleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */