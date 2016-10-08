package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.List;

class mf
  extends View
  implements mb
{
  private Paint b;
  private float c = 0.0F;
  private float d = 0.0F;
  private float e = 0.0F;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private boolean i = false;
  private boolean j = false;
  private int k;
  private int l;
  private int m = -2849024;
  private Drawable n;
  
  public mf(TableLayoutGroup paramTableLayoutGroup, Context paramContext)
  {
    super(paramContext);
    TableLayoutGroup.a(paramTableLayoutGroup, this.c);
    this.b = new Paint(1);
    this.b.setTextSize(this.c);
    paramTableLayoutGroup = this.b.getFontMetrics();
    this.h = ((int)(paramTableLayoutGroup.descent - paramTableLayoutGroup.ascent) + (int)getResources().getDimension(2131230837) * 5);
    this.k = getResources().getColor(2131493563);
    this.l = getResources().getColor(2131493562);
    this.n = new ColorDrawable(getResources().getColor(2131493543));
    b();
  }
  
  private List<String> a(String paramString, int paramInt, Paint paramPaint)
  {
    int i2 = 0;
    ArrayList localArrayList = new ArrayList();
    if (paramPaint.measureText(paramString) <= paramInt)
    {
      localArrayList.add(paramString);
      return localArrayList;
    }
    int i3 = paramInt / (int)paramPaint.measureText(paramString.substring(0, 1));
    int i1;
    if (i3 > paramString.length()) {
      i1 = paramString.length();
    }
    for (;;)
    {
      int i4 = (int)paramPaint.measureText(paramString.substring(i2, i1));
      if (i4 > paramInt)
      {
        i1 -= 1;
      }
      else if (i4 <= paramInt)
      {
        if (i1 + 1 > paramString.length())
        {
          localArrayList.add(paramString.substring(i2));
          return localArrayList;
        }
        if ((int)paramPaint.measureText(paramString.substring(i2, i1 + 1)) >= paramInt)
        {
          localArrayList.add(paramString.substring(i2, i1));
          i4 = i1 + i3;
          if (i4 > paramString.length())
          {
            i4 = paramString.length();
            i2 = i1;
            i1 = i4;
          }
        }
        else
        {
          i1 += 1;
          continue;
        }
        i2 = i1;
        i1 = i4;
        continue;
        i1 = i3;
      }
    }
  }
  
  private void a(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, Paint.Align paramAlign, int paramInt4)
  {
    if (paramString == null) {
      return;
    }
    this.b.setFakeBoldText(false);
    this.b.setColor(paramInt4);
    this.b.setTextSize(this.c);
    paramString = a(paramString, paramInt3, this.b);
    int i2 = paramInt2 + (this.h - (int)this.c * paramString.size() - (paramString.size() - 1) * 5) / 2;
    int i1 = 0;
    paramInt4 = paramInt1;
    label86:
    String str;
    if (i1 < paramString.size())
    {
      str = (String)paramString.get(i1);
      if (paramAlign != Paint.Align.CENTER) {
        break label170;
      }
      paramInt4 = paramInt1 + paramInt3 / 2;
      this.a.a(str, paramInt4, i2, Paint.Align.CENTER, paramCanvas, this.b);
    }
    for (;;)
    {
      i2 = (int)(i2 + (this.c + 5.0F));
      i1 += 1;
      break label86;
      break;
      label170:
      if (paramAlign == Paint.Align.RIGHT)
      {
        paramInt4 = paramInt1 + paramInt3 - 5;
        this.a.a(str, paramInt4, paramInt2 + (this.h - (int)this.c) / 2, Paint.Align.RIGHT, paramCanvas, this.b);
      }
      else
      {
        this.a.a(str, paramInt4, paramInt2 + (this.h - (int)this.c) / 2, Paint.Align.LEFT, paramCanvas, this.b);
      }
    }
  }
  
  private void a(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, Paint.Align paramAlign, int paramInt4, boolean paramBoolean)
  {
    if (paramString == null) {}
    do
    {
      do
      {
        return;
        this.b.setFakeBoldText(false);
        this.b.setColor(paramInt4);
        this.b.setTextSize(this.c);
        if (paramAlign == Paint.Align.CENTER)
        {
          paramInt3 /= 2;
          this.a.a(paramString, paramInt1 + paramInt3, paramInt2 + (this.h - (int)this.c) / 2, Paint.Align.CENTER, paramCanvas, this.b);
          return;
        }
        if (paramAlign == Paint.Align.RIGHT)
        {
          this.a.a(paramString, paramInt1 + paramInt3 - 5, paramInt2 + (this.h - (int)this.c) / 2, Paint.Align.RIGHT, paramCanvas, this.b);
          return;
        }
      } while (paramAlign != Paint.Align.LEFT);
      this.b.setTextSize(TableLayoutGroup.F(this.a));
      this.a.a(paramString, paramInt1, paramInt2 + (this.h - (int)this.c) / 2, Paint.Align.LEFT, paramCanvas, this.b);
    } while (!paramBoolean);
    this.b.setColor(this.m);
    this.a.a("*", (int)this.b.measureText(paramString) + paramInt1 + 5, (this.h - (int)this.c) / 2 + paramInt2, Paint.Align.LEFT, paramCanvas, this.b);
  }
  
  private void a(Canvas paramCanvas, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, Paint.Align paramAlign, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramString1 == null) {}
    float f1;
    do
    {
      do
      {
        return;
        String str = paramString2;
        if (paramString2 == null) {
          str = "--";
        }
        paramString2 = str;
        if (str.equals("null")) {
          paramString2 = "";
        }
        this.b.setFakeBoldText(false);
        if (paramAlign == Paint.Align.CENTER)
        {
          paramInt1 += paramInt3 / 2;
          this.b.setColor(paramInt4);
          this.b.setTextSize(this.c);
          this.a.a(paramString1, paramInt1, paramInt2 + (this.h - (int)(this.c + this.d)) * 2 / 5, Paint.Align.CENTER, paramCanvas, this.b);
          this.b.setColor(paramInt5);
          this.b.setTextSize(this.d);
          this.a.a(paramString2, paramInt1, (this.h * 3 - (int)this.c) / 5 + paramInt2 + 5, Paint.Align.CENTER, paramCanvas, this.b);
          return;
        }
        if (paramAlign == Paint.Align.RIGHT)
        {
          paramInt1 = paramInt1 + paramInt3 - 5;
          this.b.setColor(paramInt4);
          this.b.setTextSize(this.c);
          this.a.a(paramString1, paramInt1, paramInt2 + (this.h - (int)(this.c + this.d)) * 2 / 5, Paint.Align.RIGHT, paramCanvas, this.b);
          this.b.setColor(paramInt5);
          this.b.setTextSize(this.d);
          this.a.a(paramString2, paramInt1, (this.h * 3 - (int)this.c) / 5 + paramInt2 + 5, Paint.Align.RIGHT, paramCanvas, this.b);
          return;
        }
      } while (paramAlign != Paint.Align.LEFT);
      this.b.setTextAlign(Paint.Align.LEFT);
      this.b.setTextSize(this.e);
      paramInt1 = Math.max((int)this.b.measureText("R"), (int)-this.b.ascent()) + 2;
      this.b.setTextSize(TableLayoutGroup.F(this.a));
      int i1 = (int)this.b.measureText(paramString1);
      paramInt3 = (int)(this.b.descent() - this.b.ascent());
      this.b.setTextSize(this.d);
      int i2 = (int)this.b.measureText(paramString2);
      i2 = (int)(this.b.descent() - this.b.ascent());
      this.b.setTextSize(TableLayoutGroup.F(this.a));
      f1 = paramInt2 + (this.h - (TableLayoutGroup.F(this.a) + this.d)) * 2.0F / 5.0F;
      this.b.setColor(paramInt4);
      paramCanvas.drawText(paramString1, 0 + paramInt1, f1 - this.b.ascent(), this.b);
      if (paramBoolean2)
      {
        this.b.setColor(this.m);
        paramCanvas.drawText("*", i1 + (0 + paramInt1) + 3, f1 - this.b.ascent() + 3.0F, this.b);
      }
      this.b.setTextSize(this.d);
      paramInt4 = (this.h * 3 - (int)this.c) / 5;
      this.b.setColor(paramInt5);
      paramCanvas.drawText(paramString2, 0 + paramInt1, paramInt4 + paramInt2 + 5 - this.b.ascent(), this.b);
    } while ((!paramBoolean1) && (!paramBoolean3));
    this.b.setColor(this.m);
    paramString1 = this.b.getStyle();
    this.b.setStyle(Paint.Style.FILL_AND_STROKE);
    this.b.setTextSize(this.e);
    this.b.setTextAlign(Paint.Align.CENTER);
    f1 += paramInt3 / 2 - paramInt1 / 2;
    float f2 = f1 + (paramInt1 / 2 - (this.b.descent() + this.b.ascent()) / 2.0F);
    paramCanvas.drawRect(0, f1, 0 + paramInt1, f1 + paramInt1, this.b);
    if (TableLayoutGroup.u(this.a) == y.b)
    {
      this.b.setColor(-1);
      if (!paramBoolean1) {
        break label852;
      }
      paramCanvas.drawText("R", paramInt1 / 2 + 0, f2, this.b);
    }
    for (;;)
    {
      this.b.setTextSize(this.d);
      this.b.setTextAlign(Paint.Align.LEFT);
      this.b.setStyle(paramString1);
      return;
      this.b.setColor(-16777216);
      break;
      label852:
      paramCanvas.drawText("Q", paramInt1 / 2 + 0, f2, this.b);
    }
  }
  
  private void a(List<mh> paramList)
  {
    int i4 = 0;
    if ((paramList != null) && (paramList.size() > 0) && ((TableLayoutGroup.v(this.a) == null) || (TableLayoutGroup.v(this.a).length != ((mh)paramList.get(0)).a.length))) {
      TableLayoutGroup.a(this.a, new int[((mh)paramList.get(0)).a.length]);
    }
    if (TableLayoutGroup.h(this.a).length > 3)
    {
      TableLayoutGroup.c(this.a, 0);
      int i2 = 0;
      int i1;
      for (;;)
      {
        i1 = i4;
        if (i2 >= paramList.size()) {
          break;
        }
        String[] arrayOfString = ((mh)paramList.get(i2)).a;
        int i3 = 1;
        if (i3 < arrayOfString.length)
        {
          int i5 = (int)this.b.measureText(arrayOfString[i3]) + TableLayoutGroup.y(this.a) * 2;
          i1 = i5;
          Object localObject;
          String str;
          if (TableLayoutGroup.D(this.a) != null)
          {
            i1 = i5;
            if (i3 < TableLayoutGroup.D(this.a).length)
            {
              i1 = i5;
              if (TableLayoutGroup.D(this.a)[i3] != 0)
              {
                i1 = i5;
                if (arrayOfString[i3].contains("#"))
                {
                  localObject = arrayOfString[i3].split("#");
                  str = localObject[0];
                  localObject = localObject[1] + " " + localObject[2];
                  if (this.b.measureText(str) <= this.b.measureText((String)localObject)) {
                    break label353;
                  }
                }
              }
            }
          }
          label353:
          for (i1 = (int)this.b.measureText(str) + TableLayoutGroup.y(this.a) * 2;; i1 = (int)this.b.measureText((String)localObject) + TableLayoutGroup.y(this.a) * 2)
          {
            TableLayoutGroup.v(this.a)[i3] = Math.max(TableLayoutGroup.v(this.a)[i3], i1);
            i3 += 1;
            break;
          }
        }
        i2 += 1;
      }
      while (i1 < TableLayoutGroup.v(this.a).length)
      {
        TableLayoutGroup.e(this.a, TableLayoutGroup.v(this.a)[i1]);
        i1 += 1;
      }
    }
  }
  
  private void d()
  {
    TableLayoutGroup.i(this.a, TableLayoutGroup.c(this.a).size() * this.h);
  }
  
  public int a()
  {
    return this.h;
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = (paramInt2 - this.a.b) / this.h;
    paramInt1 = i1;
    if ((paramInt2 - this.a.b) % this.h != 0) {
      paramInt1 = i1 + 1;
    }
    paramInt1 -= 1;
    if ((paramInt1 >= 0) && (paramInt1 < TableLayoutGroup.c(this.a).size()) && (TableLayoutGroup.z(this.a) != null))
    {
      mh localmh = (mh)TableLayoutGroup.c(this.a).get(paramInt1);
      TableLayoutGroup.z(this.a).a(localmh, paramInt1);
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    this.n = paramDrawable;
    invalidate();
  }
  
  public void a(y paramy)
  {
    switch (ls.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.k = getResources().getColor(2131493563);
      this.l = getResources().getColor(2131493562);
      this.n = new ColorDrawable(getResources().getColor(2131493543));
      this.m = -2849024;
      return;
    }
    this.k = getResources().getColor(2131493626);
    this.l = getResources().getColor(2131493625);
    this.n = new ColorDrawable(getResources().getColor(2131493606));
    this.m = 34816;
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
    invalidate();
  }
  
  public void b()
  {
    if (this.a.b > 0)
    {
      this.f = 0;
      i1 = getHeight();
      if ((i1 - this.a.b) % this.h != 0) {
        break label200;
      }
    }
    label200:
    for (int i1 = (i1 - this.a.b) / this.h - 1;; i1 = (i1 - this.a.b) / this.h)
    {
      this.g = i1;
      TableLayoutGroup.j(this.a, TableLayoutGroup.I(this.a));
      TableLayoutGroup.k(this.a, TableLayoutGroup.J(this.a));
      this.a.invalidate();
      if ((TableLayoutGroup.K(this.a)) && (TableLayoutGroup.L(this.a)) && (TableLayoutGroup.c(this.a).size() > 0) && (this.g + 20 > TableLayoutGroup.c(this.a).size()))
      {
        removeCallbacks(TableLayoutGroup.M(this.a));
        post(TableLayoutGroup.M(this.a));
      }
      return;
      this.f = (Math.abs(this.a.b) / this.h);
      break;
    }
  }
  
  public void b(int paramInt)
  {
    this.k = paramInt;
    invalidate();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    TableLayoutGroup.l(this.a, (paramInt2 - this.a.b) / this.h);
    if ((paramInt2 - this.a.b) % this.h != 0) {
      TableLayoutGroup.N(this.a);
    }
    TableLayoutGroup.O(this.a);
  }
  
  public void b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    invalidate();
  }
  
  public int c()
  {
    return this.h;
  }
  
  public void c(int paramInt)
  {
    this.l = paramInt;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if ((TableLayoutGroup.c(this.a) == null) || (TableLayoutGroup.c(this.a).size() == 0)) {
      return;
    }
    int i5 = TableLayoutGroup.a(this.a, 0);
    int i1 = this.g;
    if (i1 > TableLayoutGroup.c(this.a).size() - 1) {
      i1 = TableLayoutGroup.c(this.a).size() - 1;
    }
    for (;;)
    {
      Object localObject1;
      int i3;
      int i4;
      if ((TableLayoutGroup.E(this.a) != -1) && (TableLayoutGroup.E(this.a) >= this.f) && (TableLayoutGroup.E(this.a) <= i1))
      {
        i2 = this.f;
        if (i2 <= i1)
        {
          if (i2 != TableLayoutGroup.E(this.a)) {
            break label313;
          }
          localObject1 = TableLayoutGroup.m(this.a);
          i3 = this.a.b;
          i4 = this.h;
          i6 = getWidth();
          int i7 = this.a.b;
          ((Drawable)localObject1).setBounds(0, i3 + i4 * i2, i6, (i2 + 1) * this.h + i7);
          TableLayoutGroup.m(this.a).draw(paramCanvas);
        }
      }
      int i6 = getHeight();
      this.b.setTextSize(this.c);
      paramCanvas.clipRect(0, 0, 0 + i5, i6);
      int i2 = this.f;
      label261:
      Object localObject2;
      label313:
      label401:
      float f1;
      if (i2 <= i1)
      {
        localObject2 = (mh)TableLayoutGroup.c(this.a).get(i2);
        if ((((mh)localObject2).a == null) || (((mh)localObject2).a.length <= 0)) {}
        for (;;)
        {
          i2 += 1;
          break label261;
          i2 += 1;
          break;
          localObject1 = localObject2.a[0];
          i3 = 0;
          if (TableLayoutGroup.C(this.a) == Paint.Align.LEFT) {
            i3 = TableLayoutGroup.s(this.a);
          }
          if (!this.i) {
            break label401;
          }
          a(paramCanvas, (String)localObject1, i3, this.a.b + this.h * i2, i5, TableLayoutGroup.C(this.a), this.k);
        }
        this.b.setTextSize(this.c);
        f1 = this.b.measureText((String)localObject1);
        TableLayoutGroup.a(this.a, this.c);
        i4 = 0;
        while ((i4 < 5) && (this.e + f1 > TableLayoutGroup.x(this.a)))
        {
          TableLayoutGroup.a(this.a, TableLayoutGroup.F(this.a) - 2.0F);
          this.b.setTextSize(TableLayoutGroup.F(this.a));
          f1 = this.b.measureText((String)localObject1);
          i4 += 1;
        }
      }
      for (;;)
      {
        if (f1 + this.e > TableLayoutGroup.x(this.a))
        {
          localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
          f1 = this.b.measureText((String)localObject1 + "..");
          i4 = 1;
        }
        else
        {
          if (i4 != 0) {
            localObject1 = (String)localObject1 + "..";
          }
          for (;;)
          {
            if ((((mh)localObject2).c) && (((mh)localObject2).d != null))
            {
              if (this.j)
              {
                a(paramCanvas, (String)localObject1, ((mh)localObject2).d, i3, this.a.b + this.h * i2, i5, TableLayoutGroup.C(this.a), localObject2.b[0], localObject2.b[0], ((mh)localObject2).h, ((mh)localObject2).i, ((mh)localObject2).j);
                break;
              }
              a(paramCanvas, (String)localObject1, ((mh)localObject2).d, i3, this.a.b + this.h * i2, i5, TableLayoutGroup.C(this.a), this.k, this.l, ((mh)localObject2).h, ((mh)localObject2).i, ((mh)localObject2).j);
              break;
            }
            if (this.j)
            {
              a(paramCanvas, (String)localObject1, i3, this.a.b + this.h * i2, i5, TableLayoutGroup.C(this.a), localObject2.b[0], ((mh)localObject2).i);
              break;
            }
            a(paramCanvas, (String)localObject1, i3, this.a.b + this.h * i2, i5, TableLayoutGroup.C(this.a), this.k, ((mh)localObject2).i);
            break;
            paramCanvas.restore();
            paramCanvas.save();
            i3 = getWidth();
            paramCanvas.clipRect(0, 0, i3, i6);
            i2 = this.f;
            while ((i2 <= i1) && (i1 >= 0))
            {
              this.n.setBounds(TableLayoutGroup.s(this.a), this.a.b + this.h * (i2 + 1), i3, this.a.b + this.h * (i2 + 1) + 1);
              this.n.draw(paramCanvas);
              i2 += 1;
            }
            paramCanvas.restore();
            paramCanvas.save();
            paramCanvas.clipRect(i5, 0, TableLayoutGroup.b(this.a, TableLayoutGroup.h(this.a).length) + i5, i6);
            i2 = TableLayoutGroup.j(this.a) + 1;
            while (i2 <= TableLayoutGroup.t(this.a)) {
              if (i2 == 0)
              {
                i2 += 1;
              }
              else
              {
                i3 = this.f;
                label1045:
                if (i3 <= i1)
                {
                  localObject1 = (mh)TableLayoutGroup.c(this.a).get(i3);
                  if (((mh)localObject1).a.length > 0) {
                    break label1087;
                  }
                }
                for (;;)
                {
                  i3 += 1;
                  break label1045;
                  break;
                  label1087:
                  String str = localObject1.a[i2];
                  i5 = localObject1.b[i2];
                  i4 = i5;
                  if (TableLayoutGroup.u(this.a) == y.b) {
                    if ((i5 != -1) && (i5 != 65280))
                    {
                      i4 = i5;
                      if (i5 != -16711681) {}
                    }
                    else
                    {
                      i4 = -16777216;
                    }
                  }
                  if ((TableLayoutGroup.D(this.a) != null) && (i2 < TableLayoutGroup.D(this.a).length) && (TableLayoutGroup.D(this.a)[i2] != 0))
                  {
                    if (TableLayoutGroup.G(this.a) != null)
                    {
                      TableLayoutGroup.H(this.a).left = (this.a.a + TableLayoutGroup.b(this.a, i2 - 1));
                      TableLayoutGroup.H(this.a).top = (this.a.b + this.h * i3);
                      TableLayoutGroup.H(this.a).right = (TableLayoutGroup.H(this.a).left + TableLayoutGroup.a(this.a, i2));
                      TableLayoutGroup.H(this.a).bottom = (TableLayoutGroup.H(this.a).top + this.h);
                      TableLayoutGroup.G(this.a).a(paramCanvas, this.b, TableLayoutGroup.H(this.a), str, i4);
                    }
                  }
                  else
                  {
                    localObject2 = TableLayoutGroup.p(this.a);
                    localObject1 = localObject2;
                    if (TableLayoutGroup.h(this.a) != null)
                    {
                      localObject1 = localObject2;
                      if (TableLayoutGroup.h(this.a).length <= 3) {
                        localObject1 = Paint.Align.CENTER;
                      }
                    }
                    a(paramCanvas, str, this.a.a + TableLayoutGroup.b(this.a, i2 - 1), this.a.b + this.h * i3, TableLayoutGroup.a(this.a, i2), (Paint.Align)localObject1, i4, false);
                  }
                }
              }
            }
            paramCanvas.restore();
            return;
          }
          i4 = 0;
        }
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return TableLayoutGroup.a(this.a, this, paramMotionEvent);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {
      TableLayoutGroup.a(this.a, md.b);
    }
    for (;;)
    {
      this.a.a += paramInt1;
      this.a.b += paramInt2;
      b();
      this.a.invalidate();
      return;
      if (paramInt2 < 0) {
        TableLayoutGroup.a(this.a, md.a);
      } else if (paramInt1 > 0) {
        TableLayoutGroup.a(this.a, md.d);
      } else {
        TableLayoutGroup.a(this.a, md.c);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */