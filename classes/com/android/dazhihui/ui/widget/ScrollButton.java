package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

public class ScrollButton
  extends View
{
  Paint a = new Paint();
  int b = 0;
  public kl c;
  private RectF d;
  private RectF e;
  private boolean f;
  private Handler g;
  private BitmapDrawable h;
  private BitmapDrawable i;
  private Rect j;
  private Rect k;
  private String l = "市场";
  private String m = "决策";
  private Paint n;
  private Paint o;
  private int p = -7434610;
  private int q = -1;
  private float r;
  private float s;
  private float t = 0.0F;
  private boolean u = false;
  private boolean v = false;
  private float w = 0.0F;
  private int x = 0;
  private int y;
  private final int z = 0;
  
  public ScrollButton(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public ScrollButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.s = TypedValue.applyDimension(1, 16.0F, paramContext.getResources().getDisplayMetrics());
    this.p = -7434610;
    this.r = TypedValue.applyDimension(1, 16.0F, paramContext.getResources().getDisplayMetrics());
    this.h = ((BitmapDrawable)getResources().getDrawable(2130837564));
    this.i = ((BitmapDrawable)getResources().getDrawable(2130837565));
    this.x = 0;
    a();
  }
  
  private void a()
  {
    this.j = new Rect();
    this.k = new Rect();
    this.d = new RectF();
    this.e = new RectF();
    this.o = new Paint();
    this.o.setStyle(Paint.Style.FILL_AND_STROKE);
    this.o.setAntiAlias(true);
    this.o.setColor(this.q);
    this.o.setTextSize(this.s);
    this.o.setTextAlign(Paint.Align.LEFT);
    this.n = new Paint();
    this.n.setColor(this.p);
    this.n.setAntiAlias(true);
    this.n.setStyle(Paint.Style.FILL_AND_STROKE);
    this.n.setTextSize(this.r);
    this.n.setTextAlign(Paint.Align.LEFT);
    this.g = new ki(this);
  }
  
  private void a(int paramInt)
  {
    this.y = paramInt;
    if (this.c != null) {
      this.c.a(paramInt);
    }
  }
  
  private void b()
  {
    new Thread(new kj(this)).start();
    this.f = true;
    a(0);
  }
  
  private void c()
  {
    new Thread(new kk(this)).start();
    this.f = true;
    a(1);
  }
  
  private void d()
  {
    a(this.d.width(), this.d.height(), true);
    a(0);
    invalidate();
  }
  
  private void e()
  {
    a(this.d.width(), this.d.height(), false);
    a(1);
    invalidate();
  }
  
  protected void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.e.set(paramFloat1 / 2.0F, 0.0F, paramFloat1, paramFloat2);
      return;
    }
    this.e.set(0.0F, 0.0F, paramFloat1 / 2.0F, paramFloat2);
  }
  
  public String getLeftText()
  {
    return this.l;
  }
  
  public String getRightText()
  {
    return this.m;
  }
  
  public int getSidePosition()
  {
    return this.y;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1;
    String str2;
    label31:
    Object localObject2;
    String str1;
    label76:
    label94:
    float f5;
    float f6;
    float f7;
    float f8;
    float f9;
    float f10;
    float f2;
    float f3;
    label272:
    float f4;
    if (this.y == 0)
    {
      localObject1 = this.m;
      if (this.y != 0) {
        break label447;
      }
      str2 = this.l;
      localObject2 = localObject1;
      str1 = str2;
      if (this.b == 2)
      {
        localObject2 = localObject1;
        str1 = str2;
        if (this.v)
        {
          if (this.y != 1) {
            break label456;
          }
          localObject1 = this.m;
          if (this.y != 1) {
            break label465;
          }
          str1 = this.l;
          localObject2 = localObject1;
        }
      }
      f5 = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2;
      f6 = (this.o.descent() + this.o.ascent()) / 2.0F;
      f7 = (getHeight() - getPaddingBottom() - getPaddingTop()) / 2;
      f8 = (this.n.descent() + this.n.ascent()) / 2.0F;
      f9 = this.e.left;
      f10 = (this.e.width() - this.o.measureText(str1)) / 2.0F;
      f1 = this.n.measureText(this.m);
      f2 = this.d.width() / 2.0F + (this.d.width() / 2.0F - f1) / 2.0F;
      f1 = this.n.measureText(this.l);
      f3 = (this.d.width() / 2.0F - f1) / 2.0F;
      if (this.y != 0) {
        break label478;
      }
      f1 = f2;
      f4 = f1;
      if (this.b == 2)
      {
        f4 = f1;
        if (this.v) {
          if (this.y != 1) {
            break label484;
          }
        }
      }
    }
    label447:
    label456:
    label465:
    label478:
    label484:
    for (float f1 = f2;; f1 = f3)
    {
      f4 = f1;
      localObject1 = this.i.getBitmap();
      this.j.set(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      paramCanvas.drawBitmap((Bitmap)localObject1, this.j, this.d, this.a);
      paramCanvas.drawText((String)localObject2, f4, f7 - f8 + 2.0F, this.n);
      localObject1 = this.h.getBitmap();
      this.k.set(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      paramCanvas.drawBitmap((Bitmap)localObject1, this.k, this.e, this.a);
      paramCanvas.drawText(str1, f9 + f10, f5 - f6, this.o);
      return;
      localObject1 = this.l;
      break;
      str2 = this.m;
      break label31;
      localObject1 = this.l;
      break label76;
      str1 = this.m;
      localObject2 = localObject1;
      break label94;
      f1 = f3;
      break label272;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.d.set(0.0F, 0.0F, paramInt1, paramInt2);
    this.t = Math.max(paramInt1 / 4, 2);
    float f1 = paramInt1;
    float f2 = paramInt2;
    if (this.x == 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(f1, f2, bool);
      invalidate();
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    if (!isEnabled()) {}
    float f1;
    float f2;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return true;
            } while (this.f);
            f1 = paramMotionEvent.getX();
            f2 = paramMotionEvent.getY();
            switch (paramMotionEvent.getAction() & 0xFF)
            {
            case 3: 
            default: 
              return true;
            case 0: 
              if ((this.d.contains(f1, f2)) && (!this.e.contains(f1, f2)))
              {
                if (f1 < this.d.width() / 2.0F)
                {
                  b();
                  return true;
                }
                c();
                return true;
              }
              if (!this.d.contains(f1, f2))
              {
                this.b = 0;
                return false;
              }
              this.b = 1;
              this.w = f1;
              if (this.w < this.d.width() / 2.0F) {
                bool1 = true;
              }
              this.u = bool1;
              return true;
            }
          } while (this.b != 2);
          this.b = 0;
          if (Math.abs(f1 - this.w) >= this.t)
          {
            if (this.u)
            {
              e();
              return true;
            }
            d();
            return true;
          }
          if (this.u)
          {
            d();
            return true;
          }
          e();
          return true;
        } while ((this.b != 1) && (this.b != 2));
        f2 = Math.abs(f1 - this.w);
        if ((!this.u) || (f1 <= this.w)) {
          break;
        }
      } while ((f2 <= 0.5D) || (f2 > this.d.width() / 2.0F));
      this.e.set(2.0F + f2, 2.0F, this.d.width() / 2.0F + f2, this.d.height() - 2.0F);
      bool1 = bool2;
      if (f2 >= this.t) {
        bool1 = true;
      }
      this.v = bool1;
      invalidate();
      this.b = 2;
      return true;
    } while ((this.u) || (f1 >= this.w) || (f2 <= 0.5D) || (f2 > this.d.width() / 2.0F));
    this.e.set(this.d.width() / 2.0F - f2, 2.0F, this.d.width() - 2.0F - f2, this.d.height() - 2.0F);
    bool1 = bool3;
    if (f2 >= this.t) {
      bool1 = true;
    }
    this.v = bool1;
    invalidate();
    this.b = 2;
    return true;
    this.b = 0;
    return true;
  }
  
  public void setBackDrawable(int paramInt)
  {
    this.i = ((BitmapDrawable)getResources().getDrawable(paramInt));
  }
  
  public void setBackFontSize(int paramInt)
  {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setBackTextColor(int paramInt)
  {
    this.p = paramInt;
    if (this.n != null) {
      this.n.setColor(this.p);
    }
  }
  
  public void setButtonSwitchListener(kl paramkl)
  {
    this.c = paramkl;
  }
  
  public void setFrontDrawable(int paramInt)
  {
    this.h = ((BitmapDrawable)getResources().getDrawable(paramInt));
  }
  
  public void setFrontFontSize(int paramInt)
  {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setFrontTextColor(int paramInt)
  {
    this.q = paramInt;
    if (this.o != null) {
      this.o.setColor(this.q);
    }
  }
  
  public void setInitialSelectedSide(int paramInt)
  {
    this.x = paramInt;
    invalidate();
  }
  
  public void setLeftText(String paramString)
  {
    this.l = paramString;
    requestLayout();
  }
  
  public void setRightText(String paramString)
  {
    this.m = paramString;
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ScrollButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */