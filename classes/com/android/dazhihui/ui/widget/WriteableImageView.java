package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class WriteableImageView
  extends ImageView
{
  Point A;
  Point B;
  private Paint C;
  Context a;
  boolean b;
  String c;
  String d;
  int e;
  Paint f;
  Paint g;
  boolean h = false;
  boolean i = false;
  boolean j = false;
  Bitmap k;
  Bitmap l;
  Paint m;
  Rect n;
  Rect o;
  Rect p;
  Rect q;
  Bitmap r;
  Paint s;
  Rect t;
  Rect u;
  boolean v;
  String w;
  Paint x;
  Paint y;
  Point z;
  
  public WriteableImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.f = new Paint();
    this.f.setStyle(Paint.Style.FILL_AND_STROKE);
    this.f.setAntiAlias(true);
    this.f.setColor(-1);
    this.f.setTextAlign(Paint.Align.CENTER);
    this.f.setTextSize(a(16));
    this.e = a(16);
    this.g = new Paint();
    this.g.setStyle(Paint.Style.FILL_AND_STROKE);
    this.g.setAntiAlias(true);
    this.g.setColor(-1);
    this.g.setTextAlign(Paint.Align.CENTER);
    this.g.setTextSize((float)(a(16) / 1.2D));
    this.C = new Paint();
    this.C.setStyle(Paint.Style.STROKE);
    this.C.setAntiAlias(true);
    this.C.setColor(39936);
    this.C.setTextSize((float)(a(16) / 1.2D));
    this.x = new Paint();
    this.x.setStyle(Paint.Style.FILL_AND_STROKE);
    this.x.setAntiAlias(true);
    this.x.setColor(-1);
    this.x.setTextAlign(Paint.Align.CENTER);
    this.x.setTextSize(a(12));
    this.y = new Paint();
    this.y.setFlags(1);
    this.y.setColor(-65536);
    this.z = new Point();
    this.A = new Point();
    this.B = new Point();
    this.k = BitmapFactory.decodeResource(getResources(), 2130837695);
    this.l = BitmapFactory.decodeResource(getResources(), 2130837696);
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.n = new Rect(0, 0, this.k.getWidth(), this.k.getHeight());
    this.o = new Rect(0, 0, 0, 0);
    this.p = new Rect(0, 0, this.l.getWidth(), this.l.getHeight());
    this.q = new Rect(0, 0, 0, 0);
    this.r = BitmapFactory.decodeResource(getResources(), 2130837695);
    this.s = new Paint();
    this.s.setAntiAlias(true);
    this.t = new Rect(0, 0, this.r.getWidth(), this.r.getHeight());
    this.u = new Rect(0, 0, 0, 0);
  }
  
  private int a(int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, this.a.getResources().getDisplayMetrics());
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(this.d)) {
      this.z.x = (paramInt1 / 2);
    }
    int i1;
    for (this.z.y = ((int)(paramInt2 / 2 - (this.f.descent() + this.f.ascent()) / 2.0F));; this.z.y = ((int)((paramInt2 - i1 - a(2)) / 2 - this.f.ascent())))
    {
      this.B.x = (paramInt1 / 4 * 3);
      this.B.y = (paramInt2 / 4);
      this.A.x = this.B.x;
      this.A.y = ((int)(this.B.y + (-this.x.descent() - this.x.ascent()) / 2.0F));
      Rect localRect;
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      if (!TextUtils.isEmpty(this.c))
      {
        i1 = (int)this.f.measureText(this.c);
        this.o.set(paramInt1 / 2 + i1 / 2, paramInt2 / 2 - a(10) / 2, paramInt1 / 2 + i1 / 2 + a(10), paramInt2 / 2 + a(10) / 2);
        localRect = this.q;
        i2 = paramInt1 / 2;
        i3 = i1 / 2;
        i4 = paramInt2 / 2;
        i5 = a(10) / 2;
        i6 = paramInt1 / 2;
        localRect.set(i2 + i3, i4 - i5, i1 / 2 + i6 + a(10), paramInt2 / 2 + a(10) / 2);
      }
      if (!TextUtils.isEmpty(this.d))
      {
        int i8 = (int)this.g.measureText(this.d);
        i1 = (int)this.f.getTextSize();
        i2 = (int)this.g.getTextSize();
        localRect = this.u;
        i3 = paramInt1 / 2;
        i4 = i8 / 2;
        i5 = paramInt2 / 2;
        i6 = i2 / 2;
        int i7 = i1 / 2;
        paramInt1 /= 2;
        i8 /= 2;
        paramInt2 /= 2;
        int i9 = i2 / 2;
        localRect.set(i3 + i4 + 1, i5 - i6 + i7, i8 + paramInt1 + i2 + 1, i1 / 2 + (i9 + paramInt2));
      }
      return;
      this.z.x = (paramInt1 / 2);
      i1 = (int)(this.f.getTextSize() + this.g.getTextSize());
    }
  }
  
  public void a()
  {
    this.b = false;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    int i1 = 0;
    String str = this.a.getString(paramInt);
    if (paramBoolean) {}
    for (paramInt = 2;; paramInt = 0)
    {
      a(str, paramInt);
      paramInt = i1;
      if (this.i) {
        paramInt = 4;
      }
      a(str, paramInt);
      return;
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    if ((paramInt & 0x1) == 1)
    {
      bool = true;
      this.j = bool;
      if ((paramInt & 0x2) != 2) {
        break label111;
      }
      bool = true;
      label26:
      this.h = bool;
      if ((paramInt & 0x4) != 4) {
        break label117;
      }
    }
    String str;
    label111:
    label117:
    for (boolean bool = true;; bool = false)
    {
      this.i = bool;
      str = paramString;
      if (TextUtils.isEmpty(paramString)) {
        str = "";
      }
      if (!str.contains("\n")) {
        break label123;
      }
      paramString = str.substring(0, str.indexOf("\n"));
      str = str.substring(str.indexOf("\n") + 1);
      a(this.h, paramString, str);
      return;
      bool = false;
      break;
      bool = false;
      break label26;
    }
    label123:
    setTextSize(this.e);
    this.c = str;
    this.d = null;
    a(getWidth(), getHeight());
    setImageBitmap(null);
    this.b = true;
  }
  
  public void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    setTextSize(this.e);
    this.c = paramString1;
    if ((!TextUtils.isEmpty(this.c)) && (TextUtils.isEmpty(this.d)))
    {
      this.d = paramString2;
      a(getWidth(), getHeight());
    }
    for (;;)
    {
      setImageBitmap(null);
      this.b = true;
      this.h = paramBoolean;
      return;
      this.d = paramString2;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.b)
    {
      paramCanvas.drawText(this.c, this.z.x, this.z.y, this.f);
      int i1;
      if (!TextUtils.isEmpty(this.d))
      {
        i1 = (int)(this.z.y + this.g.getTextSize() + a(2));
        paramCanvas.drawText(this.d, this.z.x, i1, this.g);
      }
      Rect localRect;
      if (this.h)
      {
        i1 = a(1);
        localRect = new Rect(this.o.left + i1 * 2, this.o.top + i1, this.o.right, this.o.bottom - i1);
        paramCanvas.drawBitmap(this.k, this.n, localRect, this.m);
      }
      if (this.i)
      {
        i1 = a(1);
        localRect = new Rect(this.q.left + i1 * 2, this.q.top + i1, this.q.right, this.q.bottom - i1);
        paramCanvas.drawBitmap(this.l, this.p, localRect, this.m);
      }
      if (this.j)
      {
        this.g.setColor(39936);
        float f1 = this.g.getTextSize();
        this.C.setTextSize(f1 - 4.0F);
        this.g.setTextSize(f1 - 4.0F);
        paramCanvas.drawText("融", this.u.left + this.u.width() / 2, this.u.bottom - 3, this.g);
        paramCanvas.drawRect(this.u, this.C);
        this.g.setColor(-1);
        this.g.setTextSize(f1);
      }
    }
    if (this.v)
    {
      paramCanvas.drawCircle(this.B.x, this.B.y, a(8), this.y);
      paramCanvas.drawText(this.w, this.A.x, this.A.y, this.x);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.c == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i4 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = (int)(this.f.measureText(this.c) + a(10) * 0.5D);
    paramInt1 = paramInt2;
    if (!TextUtils.isEmpty(this.d)) {
      paramInt1 = Math.max(paramInt2, (int)this.g.measureText(this.d) + a(10) * 2);
    }
    if (i4 == 1073741824) {
      paramInt2 = i2;
    }
    while (paramInt1 > paramInt2)
    {
      paramInt1 = (int)(this.f.getTextSize() / 1.1D);
      this.f.setTextSize(paramInt1);
      this.g.setTextSize((float)(paramInt1 / 1.3D));
      i2 = (int)this.f.measureText(this.c) + a(10) * 2;
      paramInt1 = i2;
      if (!TextUtils.isEmpty(this.d))
      {
        paramInt1 = Math.max(i2, (int)this.g.measureText(this.d) + a(10) * 2);
        continue;
        paramInt2 = Math.min(paramInt1, i2);
      }
    }
    if (i3 == 1073741824) {}
    for (paramInt1 = i1;; paramInt1 = Math.min(paramInt1, i1))
    {
      setMeasuredDimension(paramInt2, paramInt1);
      return;
      i2 = (int)this.f.getTextSize();
      paramInt1 = i2;
      if (!TextUtils.isEmpty(this.d)) {
        paramInt1 = i2 + (int)this.g.getTextSize() + a(2);
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt1, paramInt2);
  }
  
  public void setCount(String paramString)
  {
    if (paramString == null) {}
    for (this.w = "";; this.w = paramString)
    {
      this.v = true;
      return;
    }
  }
  
  public void setHasText(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void setTextSize(int paramInt)
  {
    this.f.setTextSize(paramInt);
    this.g.setTextSize((float)(paramInt / 1.2D));
    this.e = paramInt;
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\WriteableImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */