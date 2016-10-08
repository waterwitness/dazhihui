package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class MinuteTradeVolumeView
  extends View
{
  private int a;
  private int[] b = null;
  private int c;
  private int d;
  private int[] e;
  private int f;
  private int g;
  private int h = 241;
  @Deprecated
  private et i;
  private boolean j;
  private float k;
  private float l;
  private int m;
  private int n;
  private int o;
  private boolean p;
  private Paint q = new Paint(1);
  private Paint.FontMetrics r;
  private Rect s = new Rect();
  private int t = -409087;
  private Runnable u = new hr(this);
  private Handler v = new hs(this);
  
  public MinuteTradeVolumeView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MinuteTradeVolumeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinuteTradeVolumeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.m = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.n = paramContext.getResources().getDimensionPixelSize(2131231088);
    this.o = getResources().getColor(2131493296);
  }
  
  private int b(int paramInt)
  {
    paramInt = (int)(paramInt * 1.0F / this.a * (this.g - 4));
    if (this.a == 0) {
      return this.g - 2;
    }
    return this.g - 2 - paramInt;
  }
  
  private void b()
  {
    if (g.a().b() == y.a)
    {
      this.o = getResources().getColor(2131493296);
      this.t = -409087;
      return;
    }
    this.o = getResources().getColor(2131493297);
    this.t = -16777216;
  }
  
  public int a(int paramInt)
  {
    if (paramInt >= 0) {
      return -1099463;
    }
    return -11753174;
  }
  
  public void a()
  {
    this.a = 0;
    this.c = 0;
    this.b = null;
    this.e = null;
  }
  
  public void a(Canvas paramCanvas)
  {
    this.q.setColor(this.o);
    this.q.setStrokeWidth(2.0F);
    this.q.setStyle(Paint.Style.STROKE);
    paramCanvas.drawRect(1.0F, 1.0F, this.f - 1, this.g - 1, this.q);
    int i1 = 3;
    while (i1 < this.f)
    {
      paramCanvas.drawLine(i1, this.g / 2, i1, this.g / 2 + 1, this.q);
      i1 += 6;
    }
  }
  
  public void a(y paramy)
  {
    b();
    postInvalidate();
  }
  
  public void b(Canvas paramCanvas)
  {
    if (this.b == null) {
      return;
    }
    int i1 = 0;
    label10:
    int i3;
    int i4;
    if (i1 < this.c)
    {
      i3 = (this.f - 4) * i1 / this.h + 3;
      i4 = b(this.b[i1]);
      if (i1 != 0) {
        break label114;
      }
    }
    label114:
    for (int i2 = a(this.e[0] - this.d);; i2 = a(this.e[i1] - this.e[(i1 - 1)]))
    {
      this.q.setColor(i2);
      this.q.setStrokeWidth(2.0F);
      paramCanvas.drawLine(i3, i4, i3, this.g - 2, this.q);
      i1 += 1;
      break label10;
      break;
    }
  }
  
  public void c(Canvas paramCanvas)
  {
    if ((this.b == null) || (this.b.length == 0)) {}
    int i1;
    do
    {
      return;
      this.q.setTextSize(this.n);
      this.q.setStyle(Paint.Style.FILL);
      this.q.setAntiAlias(true);
      this.q.setColor(this.t);
      this.q.setTextAlign(Paint.Align.LEFT);
      this.r = this.q.getFontMetrics();
      paramCanvas.drawText(this.a + "", 2.0F, 2.0F - this.r.ascent, this.q);
      this.q.getTextBounds(this.a + "", 0, (this.a + "").length(), this.s);
      i1 = this.s.width() + 15;
    } while ((this.c - 1 > this.b.length) || (this.c <= 0));
    paramCanvas.drawText("量:", i1 + 8, 2.0F - this.r.ascent, this.q);
    this.q.getTextBounds("量:", 0, "量:".length(), this.s);
    int i2 = this.s.width();
    if (this.b[(this.c - 1)] < 0) {
      this.b[(this.c - 1)] = 0;
    }
    paramCanvas.drawText(this.b[(this.c - 1)] + "", i1 + i2 + 16, 2.0F - this.r.ascent, this.q);
  }
  
  public void getMaxValue()
  {
    if ((this.b != null) && (this.b.length >= 0))
    {
      int i1 = 0;
      while (i1 < this.b.length)
      {
        if (this.b[i1] > this.a) {
          this.a = this.b[i1];
        }
        i1 += 1;
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    getMaxValue();
    b(paramCanvas);
    c(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f2 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    if (this.i == null) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      this.k = f2;
      this.l = f1;
      postDelayed(this.u, ViewConfiguration.getLongPressTimeout());
      getParent().requestDisallowInterceptTouchEvent(true);
      return true;
    case 2: 
      f2 = paramMotionEvent.getX();
      int i3 = (int)(-this.k + f2);
      int i4 = (int)(f1 + -this.l);
      int i2 = (int)f2 * this.h / (this.f - 1);
      int i1 = i2;
      if (i2 < 0) {
        i1 = 0;
      }
      i2 = i1;
      if (i1 >= this.c - 1) {
        i2 = this.c - 1;
      }
      if (this.j) {
        this.i.a(i2);
      }
      for (;;)
      {
        return true;
        if (((Math.abs(i3) > this.m) || (Math.abs(i4) > this.m)) && (paramMotionEvent.getEventTime() - paramMotionEvent.getDownTime() < 350L))
        {
          removeCallbacks(this.u);
          getParent().requestDisallowInterceptTouchEvent(false);
          this.v.sendEmptyMessageDelayed(1, 0L);
          this.p = true;
        }
        else
        {
          this.p = false;
        }
      }
    }
    removeCallbacks(this.u);
    if ((!this.j) && (!this.p) && (this.i != null)) {
      this.i.a();
    }
    this.j = false;
    this.v.sendEmptyMessageDelayed(1, 1500L);
    getParent().requestDisallowInterceptTouchEvent(false);
    return true;
  }
  
  public void set2942TotalPoint(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void setClosePrice(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setData(int[] paramArrayOfInt)
  {
    this.e = paramArrayOfInt;
  }
  
  public void setLength(int paramInt)
  {
    this.c = paramInt;
  }
  
  @Deprecated
  public void setOnTouchListener(et paramet)
  {
    this.i = paramet;
  }
  
  public void setTradeData(int[] paramArrayOfInt)
  {
    this.b = paramArrayOfInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteTradeVolumeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */