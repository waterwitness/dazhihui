package com.android.dazhihui.ui.widget.roundedratioimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.dazhihui.f;

public class RoundedRatioImageView
  extends ImageView
{
  public static final Shader.TileMode a;
  private static final ImageView.ScaleType[] h;
  private float c = -1.0F;
  private boolean d;
  private boolean e;
  private float f = -1.0F;
  private float g = -1.0F;
  private final float[] i = { 0.0F, 0.0F, 0.0F, 0.0F };
  private Drawable j;
  private ColorStateList k = ColorStateList.valueOf(-16777216);
  private float l = 0.0F;
  private ColorFilter m = null;
  private boolean n = false;
  private Drawable o;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private int s;
  private ImageView.ScaleType t = ImageView.ScaleType.FIT_CENTER;
  private Shader.TileMode u = a;
  private Shader.TileMode v = a;
  
  static
  {
    if (!RoundedRatioImageView.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      a = Shader.TileMode.CLAMP;
      h = new ImageView.ScaleType[] { ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE };
      return;
    }
  }
  
  public RoundedRatioImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RoundedRatioImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RoundedRatioImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
    if (getDrawable() != null) {
      this.c = (1.0F * getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight());
    }
  }
  
  private static Shader.TileMode a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return Shader.TileMode.CLAMP;
    case 1: 
      return Shader.TileMode.REPEAT;
    }
    return Shader.TileMode.MIRROR;
  }
  
  private Drawable a()
  {
    Object localObject3 = null;
    Resources localResources = getResources();
    if (localResources == null) {
      return null;
    }
    Object localObject1 = localObject3;
    if (this.s != 0) {}
    try
    {
      localObject1 = localResources.getDrawable(this.s);
      return a.a((Drawable)localObject1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.w("RoundedRatioImageView", "Unable to find resource: " + this.s, localException);
        this.s = 0;
        Object localObject2 = localObject3;
      }
    }
  }
  
  private void a(Drawable paramDrawable)
  {
    if (paramDrawable == null) {}
    for (;;)
    {
      return;
      if ((paramDrawable instanceof a))
      {
        ((a)paramDrawable).a(this.t).a(this.l).a(this.k).a(this.q).a(this.u).b(this.v);
        if (this.i != null) {
          ((a)paramDrawable).a(this.i[0], this.i[1], this.i[2], this.i[3]);
        }
        c();
        return;
      }
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i2 = paramDrawable.getNumberOfLayers();
        int i1 = 0;
        while (i1 < i2)
        {
          a(paramDrawable.getDrawable(i1));
          i1 += 1;
        }
      }
    }
  }
  
  private void a(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, f.RoundedRatioImageView);
    this.d = paramAttributeSet.getBoolean(1, this.d);
    this.e = paramAttributeSet.getBoolean(2, this.e);
    this.g = paramAttributeSet.getFloat(3, this.g);
    this.f = paramAttributeSet.getFloat(4, this.f);
    int i1 = paramAttributeSet.getInt(0, -1);
    float f1;
    int i2;
    if (i1 >= 0)
    {
      setScaleType(h[i1]);
      f1 = paramAttributeSet.getDimensionPixelSize(5, -1);
      this.i[0] = paramAttributeSet.getDimensionPixelSize(6, -1);
      this.i[1] = paramAttributeSet.getDimensionPixelSize(7, -1);
      this.i[2] = paramAttributeSet.getDimensionPixelSize(9, -1);
      this.i[3] = paramAttributeSet.getDimensionPixelSize(8, -1);
      int i3 = this.i.length;
      i1 = 0;
      i2 = 0;
      label160:
      if (i1 >= i3) {
        break label207;
      }
      if (this.i[i1] >= 0.0F) {
        break label201;
      }
      this.i[i1] = 0.0F;
    }
    for (;;)
    {
      i1 += 1;
      break label160;
      setScaleType(ImageView.ScaleType.FIT_CENTER);
      break;
      label201:
      i2 = 1;
    }
    label207:
    if (i2 == 0)
    {
      if (f1 >= 0.0F) {
        break label414;
      }
      f1 = 0.0F;
    }
    label414:
    for (;;)
    {
      i2 = this.i.length;
      i1 = 0;
      while (i1 < i2)
      {
        this.i[i1] = f1;
        i1 += 1;
      }
      this.l = paramAttributeSet.getDimensionPixelSize(10, -1);
      if (this.l < 0.0F) {
        this.l = 0.0F;
      }
      this.k = paramAttributeSet.getColorStateList(11);
      if (this.k == null) {
        this.k = ColorStateList.valueOf(-16777216);
      }
      this.r = paramAttributeSet.getBoolean(12, false);
      this.q = paramAttributeSet.getBoolean(13, false);
      i1 = paramAttributeSet.getInt(14, -2);
      if (i1 != -2)
      {
        setTileModeX(a(i1));
        setTileModeY(a(i1));
      }
      i1 = paramAttributeSet.getInt(15, -2);
      if (i1 != -2) {
        setTileModeX(a(i1));
      }
      i1 = paramAttributeSet.getInt(16, -2);
      if (i1 != -2) {
        setTileModeY(a(i1));
      }
      b();
      a(true);
      paramAttributeSet.recycle();
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.r)
    {
      if (paramBoolean) {
        this.j = a.a(this.j);
      }
      a(this.j);
    }
  }
  
  private void b()
  {
    a(this.o);
  }
  
  private void c()
  {
    if ((this.o != null) && (this.n))
    {
      this.o = this.o.mutate();
      if (this.p) {
        this.o.setColorFilter(this.m);
      }
    }
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((this.i[0] == paramFloat1) && (this.i[1] == paramFloat2) && (this.i[2] == paramFloat4) && (this.i[3] == paramFloat3)) {
      return;
    }
    this.i[0] = paramFloat1;
    this.i[1] = paramFloat2;
    this.i[3] = paramFloat3;
    this.i[2] = paramFloat4;
    b();
    a(false);
    invalidate();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  public int getBorderColor()
  {
    return this.k.getDefaultColor();
  }
  
  public ColorStateList getBorderColors()
  {
    return this.k;
  }
  
  public float getBorderWidth()
  {
    return this.l;
  }
  
  public float getCornerRadius()
  {
    return getMaxCornerRadius();
  }
  
  public float getMaxCornerRadius()
  {
    float f1 = 0.0F;
    float[] arrayOfFloat = this.i;
    int i2 = arrayOfFloat.length;
    int i1 = 0;
    while (i1 < i2)
    {
      f1 = Math.max(arrayOfFloat[i1], f1);
      i1 += 1;
    }
    return f1;
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return this.t;
  }
  
  public Shader.TileMode getTileModeX()
  {
    return this.u;
  }
  
  public Shader.TileMode getTileModeY()
  {
    return this.v;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Exception paramCanvas)
    {
      paramCanvas.printStackTrace();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.g > 0.0F) && (this.f > 0.0F)) {
      throw new RuntimeException("高度和宽度不能同时设置百分比！！");
    }
    if (this.f > 0.0F)
    {
      paramInt1 = View.MeasureSpec.getSize(paramInt2);
      super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * this.f), 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824));
      return;
    }
    if (this.g > 0.0F)
    {
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * this.g), 1073741824));
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setBackground(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  @Deprecated
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.j = paramDrawable;
    a(true);
    super.setBackgroundDrawable(this.j);
  }
  
  public void setBorderColor(int paramInt)
  {
    setBorderColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setBorderColor(ColorStateList paramColorStateList)
  {
    if (this.k.equals(paramColorStateList)) {
      return;
    }
    if (paramColorStateList != null) {}
    for (;;)
    {
      this.k = paramColorStateList;
      b();
      a(false);
      if (this.l <= 0.0F) {
        break;
      }
      invalidate();
      return;
      paramColorStateList = ColorStateList.valueOf(-16777216);
    }
  }
  
  public void setBorderWidth(float paramFloat)
  {
    if (this.l == paramFloat) {
      return;
    }
    this.l = paramFloat;
    b();
    a(false);
    invalidate();
  }
  
  public void setBorderWidth(int paramInt)
  {
    setBorderWidth(getResources().getDimension(paramInt));
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.m != paramColorFilter)
    {
      this.m = paramColorFilter;
      this.p = true;
      this.n = true;
      c();
      invalidate();
    }
  }
  
  public void setCornerRadius(float paramFloat)
  {
    a(paramFloat, paramFloat, paramFloat, paramFloat);
  }
  
  public void setCornerRadiusDimen(int paramInt)
  {
    float f1 = getResources().getDimension(paramInt);
    a(f1, f1, f1, f1);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.s = 0;
    this.o = a.a(paramBitmap);
    b();
    super.setImageDrawable(this.o);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    this.s = 0;
    this.o = a.a(paramDrawable);
    b();
    super.setImageDrawable(this.o);
    if (getDrawable() != null)
    {
      this.c = (1.0F * getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight());
      if ((this.c > 0.0F) && ((this.d) || (this.e))) {
        requestLayout();
      }
    }
  }
  
  public void setImageResource(int paramInt)
  {
    if (this.s != paramInt)
    {
      this.s = paramInt;
      this.o = a();
      b();
      super.setImageDrawable(this.o);
      if (getDrawable() != null)
      {
        this.c = (1.0F * getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight());
        if ((this.c > 0.0F) && ((this.d) || (this.e))) {
          requestLayout();
        }
      }
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    setImageDrawable(getDrawable());
  }
  
  public void setOval(boolean paramBoolean)
  {
    this.q = paramBoolean;
    b();
    a(false);
    invalidate();
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if ((!b) && (paramScaleType == null)) {
      throw new AssertionError();
    }
    if (this.t != paramScaleType)
    {
      this.t = paramScaleType;
      switch (c.a[paramScaleType.ordinal()])
      {
      default: 
        super.setScaleType(paramScaleType);
      }
    }
    for (;;)
    {
      b();
      a(false);
      invalidate();
      return;
      super.setScaleType(ImageView.ScaleType.FIT_XY);
    }
  }
  
  public void setTileModeX(Shader.TileMode paramTileMode)
  {
    if (this.u == paramTileMode) {
      return;
    }
    this.u = paramTileMode;
    b();
    a(false);
    invalidate();
  }
  
  public void setTileModeY(Shader.TileMode paramTileMode)
  {
    if (this.v == paramTileMode) {
      return;
    }
    this.v = paramTileMode;
    b();
    a(false);
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\roundedratioimageview\RoundedRatioImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */