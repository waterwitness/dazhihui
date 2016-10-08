package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.android.dazhihui.ui.screen.y;

class mi
  extends View
  implements mb
{
  private Paint b;
  private float c = 0.0F;
  private Drawable d;
  private Bitmap e = null;
  private Bitmap f = null;
  private Bitmap g = null;
  private Bitmap h = null;
  private int i;
  private Bitmap j = null;
  private Drawable k;
  
  public mi(TableLayoutGroup paramTableLayoutGroup, Context paramContext)
  {
    super(paramContext);
    if (TableLayoutGroup.f(paramTableLayoutGroup) != 0) {}
    for (this.d = getResources().getDrawable(TableLayoutGroup.f(paramTableLayoutGroup));; this.d = new ColorDrawable(getResources().getColor(2131493544)))
    {
      this.f = BitmapFactory.decodeResource(getResources(), TableLayoutGroup.g(paramTableLayoutGroup));
      paramTableLayoutGroup = new Matrix();
      paramTableLayoutGroup.postRotate(180.0F);
      this.e = Bitmap.createBitmap(this.f, 0, 0, this.f.getWidth(), this.f.getHeight(), paramTableLayoutGroup, true);
      this.g = BitmapFactory.decodeResource(getResources(), 2130838059);
      this.h = BitmapFactory.decodeResource(getResources(), 2130838058);
      this.i = getResources().getColor(2131493545);
      paramTableLayoutGroup = new Matrix();
      paramTableLayoutGroup.postRotate(90.0F);
      this.j = Bitmap.createBitmap(this.f, 0, 0, this.f.getWidth(), this.f.getHeight(), paramTableLayoutGroup, true);
      this.c = getResources().getDimension(2131230898);
      this.b = new Paint(1);
      this.b.setTextSize(this.c);
      setBackgroundDrawable(this.d);
      return;
    }
  }
  
  public void a(float paramFloat)
  {
    this.c = paramFloat;
    this.b.setTextSize(this.c);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    paramInt2 = 0;
    if (TableLayoutGroup.o(this.a) == null) {}
    for (;;)
    {
      return;
      int m = TableLayoutGroup.f(this.a, paramInt1);
      if ((TableLayoutGroup.v(this.a) != null) && (TableLayoutGroup.v(this.a).length > 0) && (TableLayoutGroup.o(this.a) != null) && (TableLayoutGroup.o(this.a).length > 0) && (TableLayoutGroup.o(this.a)[0] != 0) && (paramInt1 > 0) && (paramInt1 < TableLayoutGroup.v(this.a)[0])) {}
      for (paramInt1 = paramInt2; (paramInt1 >= 0) && (paramInt1 < TableLayoutGroup.v(this.a).length) && (TableLayoutGroup.o(this.a)[paramInt1] != 0) && (TableLayoutGroup.z(this.a) != null); paramInt1 = m)
      {
        TableLayoutGroup.z(this.a).a(paramInt1);
        return;
      }
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    this.k = paramDrawable;
    invalidate();
  }
  
  public void a(y paramy)
  {
    if (paramy == y.b)
    {
      this.d = new ColorDrawable(getResources().getColor(2131493607));
      TableLayoutGroup.h(this.a, -10066330);
    }
    for (this.i = getResources().getColor(2131493608);; this.i = getResources().getColor(2131493545))
    {
      setBackgroundDrawable(this.d);
      return;
      this.d = new ColorDrawable(getResources().getColor(2131493544));
      TableLayoutGroup.h(this.a, -5392698);
    }
  }
  
  public void a(String[] paramArrayOfString)
  {
    int m = 0;
    if (paramArrayOfString == null) {}
    for (;;)
    {
      return;
      TableLayoutGroup.c(this.a, 0);
      if ((TableLayoutGroup.v(this.a) == null) || (TableLayoutGroup.v(this.a).length != paramArrayOfString.length)) {
        TableLayoutGroup.a(this.a, new int[paramArrayOfString.length]);
      }
      TableLayoutGroup.a(this.a, paramArrayOfString);
      if (TableLayoutGroup.h(this.a).length <= 3)
      {
        TableLayoutGroup.c(this.a, getWidth());
        while (m < TableLayoutGroup.h(this.a).length)
        {
          TableLayoutGroup.v(this.a)[m] = (TableLayoutGroup.w(this.a) / 3);
          m += 1;
        }
      }
      else
      {
        int n = 0;
        while (n < TableLayoutGroup.h(this.a).length)
        {
          int i1 = (int)this.b.measureText(TableLayoutGroup.h(this.a)[n]);
          m = i1;
          if (n == 0)
          {
            m = i1;
            if (i1 < TableLayoutGroup.x(this.a)) {
              m = TableLayoutGroup.x(this.a);
            }
            TableLayoutGroup.d(this.a, m);
          }
          if ((TableLayoutGroup.w(this.a) < getWidth()) && (TableLayoutGroup.w(this.a) + m > getWidth()) && (n > 1) && (TableLayoutGroup.h(this.a).length > 4))
          {
            int i2 = (getWidth() - TableLayoutGroup.w(this.a)) / n;
            i1 = 0;
            while (i1 < n)
            {
              paramArrayOfString = TableLayoutGroup.v(this.a);
              paramArrayOfString[i1] += i2;
              i1 += 1;
            }
            TableLayoutGroup.e(this.a, getWidth() - TableLayoutGroup.w(this.a));
          }
          TableLayoutGroup.v(this.a)[n] = Math.max(m + TableLayoutGroup.y(this.a) * 2, TableLayoutGroup.v(this.a)[n]);
          TableLayoutGroup.e(this.a, TableLayoutGroup.v(this.a)[n]);
          n += 1;
        }
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    TableLayoutGroup.g(this.a, TableLayoutGroup.f(this.a, paramInt1));
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    int i2 = TableLayoutGroup.a(this.a, 0);
    int m = TableLayoutGroup.b(this.a, TableLayoutGroup.h(this.a).length);
    int n = getHeight();
    this.b.setTextSize(this.c);
    int i1;
    if (TableLayoutGroup.i(this.a))
    {
      this.b.setColor(this.i);
      i1 = getHeight() / 5;
    }
    paramCanvas.clipRect(new Rect(i2, 0, m + i2, n));
    n = TableLayoutGroup.j(this.a) + 1;
    label289:
    String str;
    int i5;
    int i3;
    int i4;
    if ((n >= TableLayoutGroup.h(this.a).length) || (n > TableLayoutGroup.h(this.a).length - 1))
    {
      paramCanvas.restore();
      paramCanvas.save();
      if (TableLayoutGroup.r(this.a) == Paint.Align.LEFT)
      {
        this.a.a(TableLayoutGroup.h(this.a)[0], TableLayoutGroup.s(this.a), getHeight() - (int)this.c >> 1, Paint.Align.LEFT, paramCanvas, this.b);
        if ((TableLayoutGroup.o(this.a) != null) && (TableLayoutGroup.o(this.a)[0] != 0))
        {
          m = (int)this.b.measureText(TableLayoutGroup.h(this.a)[0]);
          paramCanvas.drawBitmap(this.j, m + TableLayoutGroup.s(this.a) + 6, getHeight() + 3 - this.j.getHeight() >> 1, this.b);
        }
        paramCanvas.restore();
        paramCanvas.save();
        if (TableLayoutGroup.t(this.a) < TableLayoutGroup.h(this.a).length - 1) {
          paramCanvas.drawBitmap(this.f, getWidth() - 2 - this.f.getWidth(), getHeight() - this.f.getHeight() >> 1, this.b);
        }
        if (this.a.a < 0) {
          paramCanvas.drawBitmap(this.e, i2 + 2, getHeight() - this.e.getHeight() >> 1, this.b);
        }
        paramCanvas.restore();
        if (this.k != null)
        {
          paramCanvas.save();
          this.k.setBounds(TableLayoutGroup.s(this.a), getHeight() - 1, getWidth(), getHeight());
          this.k.draw(paramCanvas);
          paramCanvas.restore();
        }
        if (TableLayoutGroup.u(this.a) == y.b)
        {
          this.b.setColor(-3618616);
          this.b.setStrokeWidth(1.0F);
          paramCanvas.drawLine(0.0F, getHeight() - 1, getWidth(), getHeight() - 1, this.b);
        }
      }
    }
    else
    {
      str = TableLayoutGroup.h(this.a)[n];
      i5 = (int)this.b.measureText(str);
      m = this.a.a;
      i3 = TableLayoutGroup.a(this.a, 0) + m;
      i4 = TableLayoutGroup.b(this.a, n - 1) - i2;
      this.b.setColor(TableLayoutGroup.k(this.a));
      if (TableLayoutGroup.l(this.a) == n)
      {
        TableLayoutGroup.m(this.a).setBounds(i3 + i4, 0, this.a.a + TableLayoutGroup.b(this.a, n), getHeight());
        TableLayoutGroup.m(this.a).draw(paramCanvas);
      }
      if (TableLayoutGroup.n(this.a) == n) {
        if ((TableLayoutGroup.o(this.a) != null) && (TableLayoutGroup.o(this.a)[n] != 0))
        {
          i1 = (TableLayoutGroup.a(this.a, n) - i5 - this.h.getWidth() >> 1) + i5;
          if (TableLayoutGroup.p(this.a) == Paint.Align.RIGHT)
          {
            m = TableLayoutGroup.a(this.a, n) - this.h.getWidth() - 5;
            label745:
            i1 = m + (i3 + i4);
            if (!TableLayoutGroup.q(this.a)) {
              break label983;
            }
            paramCanvas.drawBitmap(this.g, i1, getHeight() + 3 - this.g.getHeight() >> 1, this.b);
            label796:
            if (TableLayoutGroup.p(this.a) != Paint.Align.RIGHT) {
              break label1018;
            }
            m = i1 - 2;
          }
        }
      }
    }
    for (;;)
    {
      if (TableLayoutGroup.i(this.a))
      {
        i1 = i3 + i4 - 2;
        this.b.setColor(this.i);
        i3 = getHeight() / 5;
        paramCanvas.drawRect(i1, i3 + 0, i1 + 2, getHeight() - i3, this.b);
      }
      this.b.setColor(TableLayoutGroup.k(this.a));
      this.a.a(str, m, getHeight() - (int)this.c >> 1, TableLayoutGroup.p(this.a), paramCanvas, this.b);
      n += 1;
      break;
      if (TableLayoutGroup.p(this.a) == Paint.Align.LEFT)
      {
        m = i5 + 7;
        break label745;
      }
      m = i1;
      if (TableLayoutGroup.p(this.a) != Paint.Align.CENTER) {
        break label745;
      }
      m = i1 + 2;
      break label745;
      label983:
      paramCanvas.drawBitmap(this.h, i1, getHeight() + 3 - this.h.getHeight() >> 1, this.b);
      break label796;
      label1018:
      if (TableLayoutGroup.p(this.a) == Paint.Align.LEFT)
      {
        m = i1 - (i5 + 2);
      }
      else
      {
        m = i1;
        if (TableLayoutGroup.p(this.a) == Paint.Align.CENTER)
        {
          m = i1 - (i5 / 2 + 2);
          continue;
          if (TableLayoutGroup.p(this.a) == Paint.Align.LEFT)
          {
            m = i3 + i4 + 5;
          }
          else if (TableLayoutGroup.p(this.a) == Paint.Align.CENTER)
          {
            m = i3 + i4 + (TableLayoutGroup.a(this.a, n) >> 1);
          }
          else
          {
            if (TableLayoutGroup.p(this.a) == Paint.Align.RIGHT)
            {
              m = i3 + i4 + TableLayoutGroup.a(this.a, n) - 5;
              continue;
              if (TableLayoutGroup.p(this.a) == Paint.Align.LEFT)
              {
                m = i3 + i4 + 5;
                continue;
              }
              if (TableLayoutGroup.p(this.a) == Paint.Align.CENTER)
              {
                m = i3 + i4 + (TableLayoutGroup.a(this.a, n) >> 1);
                continue;
              }
              if (TableLayoutGroup.p(this.a) == Paint.Align.RIGHT)
              {
                m = i3 + i4 + TableLayoutGroup.a(this.a, n) - 5;
                continue;
                if (TableLayoutGroup.r(this.a) == Paint.Align.CENTER)
                {
                  m = i2 / 2;
                  this.a.a(TableLayoutGroup.h(this.a)[0], m, getHeight() - (int)this.c >> 1, Paint.Align.CENTER, paramCanvas, this.b);
                  if ((TableLayoutGroup.o(this.a) == null) || (TableLayoutGroup.o(this.a)[0] == 0)) {
                    break label289;
                  }
                  n = (int)this.b.measureText(TableLayoutGroup.h(this.a)[0]);
                  paramCanvas.drawBitmap(this.j, n / 2 + m + 6, getHeight() + 3 - this.j.getHeight() >> 1, this.b);
                  break label289;
                }
                if (TableLayoutGroup.r(this.a) != Paint.Align.RIGHT) {
                  break label289;
                }
                this.a.a(TableLayoutGroup.h(this.a)[0], i2 - 2, getHeight() - (int)this.c >> 1, Paint.Align.RIGHT, paramCanvas, this.b);
                break label289;
              }
            }
            m = 0;
          }
        }
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = 0;
    int n = 0;
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (TableLayoutGroup.h(this.a) != null)
    {
      if (TableLayoutGroup.h(this.a).length <= 3)
      {
        TableLayoutGroup.c(this.a, paramInt1);
        paramInt1 = n;
        while (paramInt1 < TableLayoutGroup.h(this.a).length)
        {
          TableLayoutGroup.v(this.a)[paramInt1] = (TableLayoutGroup.w(this.a) / 3);
          paramInt1 += 1;
        }
      }
      if (TableLayoutGroup.w(this.a) >= paramInt1) {
        break label167;
      }
      paramInt3 = (paramInt1 - TableLayoutGroup.w(this.a)) / TableLayoutGroup.h(this.a).length;
      paramInt2 = m;
      while (paramInt2 < TableLayoutGroup.v(this.a).length)
      {
        int[] arrayOfInt = TableLayoutGroup.v(this.a);
        arrayOfInt[paramInt2] += paramInt3;
        paramInt2 += 1;
      }
      TableLayoutGroup.c(this.a, paramInt1);
    }
    for (;;)
    {
      return;
      label167:
      TableLayoutGroup.c(this.a, TableLayoutGroup.v(this.a)[0]);
      paramInt1 = 1;
      while (paramInt1 < TableLayoutGroup.h(this.a).length)
      {
        TableLayoutGroup.e(this.a, TableLayoutGroup.v(this.a)[paramInt1]);
        paramInt1 += 1;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return TableLayoutGroup.a(this.a, this, paramMotionEvent);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    TableLayoutGroup.a(this.a, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */