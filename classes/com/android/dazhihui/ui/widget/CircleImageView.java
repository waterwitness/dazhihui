package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.dazhihui.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class CircleImageView
  extends ImageView
{
  private static final ImageView.ScaleType a = ImageView.ScaleType.CENTER_CROP;
  private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
  private final RectF c = new RectF();
  private final RectF d = new RectF();
  private final Matrix e = new Matrix();
  private final Paint f = new Paint();
  private final Paint g = new Paint();
  private final Paint h = new Paint();
  private int i = -16777216;
  private int j = 0;
  private int k = 0;
  private Bitmap l;
  private BitmapShader m;
  private int n;
  private int o;
  private float p;
  private float q;
  private float r;
  private ColorFilter s;
  private boolean t;
  private boolean u;
  private boolean v;
  private boolean w = false;
  private int x = -65536;
  private int y;
  
  public CircleImageView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, f.CircleImageView, paramInt, 0);
    this.r = paramContext.getResources().getDimensionPixelOffset(2131230822);
    this.y = paramContext.getResources().getDimensionPixelOffset(2131230823);
    this.j = paramAttributeSet.getDimensionPixelSize(0, 0);
    this.i = paramAttributeSet.getColor(1, -16777216);
    this.v = paramAttributeSet.getBoolean(2, false);
    this.k = paramAttributeSet.getColor(3, 0);
    paramAttributeSet.recycle();
    a();
  }
  
  private Bitmap a(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable)) {
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
    try
    {
      if ((paramDrawable instanceof ColorDrawable)) {}
      for (Bitmap localBitmap = Bitmap.createBitmap(2, 2, b);; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), b))
      {
        Canvas localCanvas = new Canvas(localBitmap);
        paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
        paramDrawable.draw(localCanvas);
        return localBitmap;
      }
      return null;
    }
    catch (Exception paramDrawable)
    {
      paramDrawable.printStackTrace();
    }
  }
  
  private void a()
  {
    super.setScaleType(a);
    this.t = true;
    if (this.u)
    {
      b();
      this.u = false;
    }
  }
  
  private void b()
  {
    if (!this.t) {
      this.u = true;
    }
    while ((getWidth() == 0) && (getHeight() == 0)) {
      return;
    }
    if (this.l == null)
    {
      invalidate();
      return;
    }
    this.m = new BitmapShader(this.l, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.f.setAntiAlias(true);
    this.f.setShader(this.m);
    this.g.setStyle(Paint.Style.STROKE);
    this.g.setAntiAlias(true);
    this.g.setColor(this.i);
    this.g.setStrokeWidth(this.j);
    this.h.setStyle(Paint.Style.FILL);
    this.h.setAntiAlias(true);
    this.h.setColor(this.k);
    this.o = this.l.getHeight();
    this.n = this.l.getWidth();
    this.d.set(0.0F, 0.0F, getWidth(), getHeight());
    this.q = Math.min((this.d.height() - this.j) / 2.0F, (this.d.width() - this.j) / 2.0F);
    this.c.set(this.d);
    if (!this.v) {
      this.c.inset(this.j, this.j);
    }
    this.p = Math.min(this.c.height() / 2.0F, this.c.width() / 2.0F);
    c();
    invalidate();
  }
  
  private void c()
  {
    float f1 = 0.0F;
    this.e.set(null);
    float f3;
    float f2;
    if (this.n * this.c.height() > this.c.width() * this.o)
    {
      f3 = this.c.height() / this.o;
      f2 = (this.c.width() - this.n * f3) * 0.5F;
    }
    for (;;)
    {
      this.e.setScale(f3, f3);
      this.e.postTranslate((int)(f2 + 0.5F) + this.c.left, (int)(f1 + 0.5F) + this.c.top);
      this.m.setLocalMatrix(this.e);
      return;
      f3 = this.c.width() / this.n;
      f1 = this.c.height();
      float f4 = this.o;
      f2 = 0.0F;
      f1 = (f1 - f4 * f3) * 0.5F;
    }
  }
  
  public int getBorderColor()
  {
    return this.i;
  }
  
  public int getBorderWidth()
  {
    return this.j;
  }
  
  public int getFillColor()
  {
    return this.k;
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return a;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.l == null) {}
    do
    {
      return;
      this.g.setStyle(Paint.Style.STROKE);
      this.g.setColor(this.i);
      if (this.k != 0) {
        paramCanvas.drawCircle(getWidth() / 2.0F, getHeight() / 2.0F, this.p, this.h);
      }
      paramCanvas.drawCircle(getWidth() / 2.0F, getHeight() / 2.0F, this.p, this.f);
      if (this.j != 0) {
        paramCanvas.drawCircle(getWidth() / 2.0F, getHeight() / 2.0F, this.q, this.g);
      }
    } while (!this.w);
    this.g.setStyle(Paint.Style.FILL);
    if (g.a().b() == y.b) {
      this.g.setColor(15987703);
    }
    for (;;)
    {
      paramCanvas.drawCircle(getWidth() / 2.0F + (int)((this.p + 3.0F) / 1.414D), getHeight() / 2.0F + (int)((this.p + 3.0F) / 1.414D), this.y, this.g);
      this.g.setColor(this.x);
      paramCanvas.drawCircle(getWidth() / 2.0F + (int)((this.p + 3.0F) / 1.414D), getHeight() / 2.0F + (int)((this.p + 3.0F) / 1.414D), this.r, this.g);
      return;
      this.g.setColor(1385012);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b();
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
  }
  
  public void setBorderColor(int paramInt)
  {
    if (paramInt == this.i) {
      return;
    }
    this.i = paramInt;
    this.g.setColor(this.i);
    invalidate();
  }
  
  public void setBorderColorResource(int paramInt)
  {
    setBorderColor(getContext().getResources().getColor(paramInt));
  }
  
  public void setBorderOverlay(boolean paramBoolean)
  {
    if (paramBoolean == this.v) {
      return;
    }
    this.v = paramBoolean;
    b();
  }
  
  public void setBorderWidth(int paramInt)
  {
    if (paramInt == this.j) {
      return;
    }
    this.j = paramInt;
    b();
  }
  
  public void setCirlCleColor(int paramInt)
  {
    this.x = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (paramColorFilter == this.s) {
      return;
    }
    this.s = paramColorFilter;
    this.f.setColorFilter(this.s);
    invalidate();
  }
  
  public void setFillColor(int paramInt)
  {
    if (paramInt == this.k) {
      return;
    }
    this.k = paramInt;
    this.h.setColor(paramInt);
    invalidate();
  }
  
  public void setFillColorResource(int paramInt)
  {
    setFillColor(getContext().getResources().getColor(paramInt));
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.l = paramBitmap;
    b();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    this.l = a(paramDrawable);
    b();
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    this.l = a(getDrawable());
    b();
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    if (paramUri != null) {}
    for (paramUri = a(getDrawable());; paramUri = null)
    {
      this.l = paramUri;
      b();
      return;
    }
  }
  
  public void setIsHasCirlCle(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType != a) {
      throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CircleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */