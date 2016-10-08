package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.handmark.pulltorefresh.library.a.f;
import com.handmark.pulltorefresh.library.a.i;
import com.handmark.pulltorefresh.library.p;

public class n
  extends f
{
  private final Animation l;
  private final Matrix m;
  private float n;
  private float o;
  private final boolean p;
  
  public n(Context paramContext, com.handmark.pulltorefresh.library.j paramj, p paramp, TypedArray paramTypedArray)
  {
    super(paramContext);
    this.g = paramj;
    this.h = paramp;
    LayoutInflater.from(paramContext).inflate(2130903101, this);
    this.b = ((FrameLayout)findViewById(2131558835));
    this.e = ((TextView)this.b.findViewById(2131558837));
    this.f = ((TextView)this.b.findViewById(2131558838));
    this.c = ((ImageView)this.b.findViewById(2131558836));
    paramj = new FrameLayout.LayoutParams(-2, -2);
    this.c.setLayoutParams(paramj);
    paramj = (FrameLayout.LayoutParams)this.b.getLayoutParams();
    int i;
    if (paramp == p.a)
    {
      i = 48;
      paramj.gravity = i;
      this.i = paramContext.getString(2131165187);
      this.j = paramContext.getString(2131165188);
      this.k = paramContext.getString(2131165189);
      this.p = paramTypedArray.getBoolean(15, true);
      this.c.setScaleType(ImageView.ScaleType.MATRIX);
      this.m = new Matrix();
      this.c.setImageMatrix(this.m);
      this.l = new RotateAnimation(0.0F, 720.0F, 1, 0.5F, 1, 0.5F);
      this.l.setInterpolator(a);
      this.l.setDuration(1200L);
      this.l.setRepeatCount(-1);
      this.l.setRepeatMode(1);
      if (paramTypedArray.hasValue(1))
      {
        paramj = paramTypedArray.getDrawable(1);
        if (paramj != null) {
          com.handmark.pulltorefresh.library.a.j.a(this, paramj);
        }
      }
      if (paramTypedArray.hasValue(10))
      {
        paramj = new TypedValue();
        paramTypedArray.getValue(10, paramj);
        setTextAppearance(paramj.data);
      }
      if (paramTypedArray.hasValue(11))
      {
        paramj = new TypedValue();
        paramTypedArray.getValue(11, paramj);
        setSubTextAppearance(paramj.data);
      }
      if (paramTypedArray.hasValue(2))
      {
        paramj = paramTypedArray.getColorStateList(2);
        if (paramj != null) {
          setTextColor(paramj);
        }
      }
      if (paramTypedArray.hasValue(3))
      {
        paramj = paramTypedArray.getColorStateList(3);
        if (paramj != null) {
          setSubTextColor(paramj);
        }
      }
      paramj = null;
      if (paramTypedArray.hasValue(6)) {
        paramj = paramTypedArray.getDrawable(6);
      }
      if (!paramTypedArray.hasValue(7)) {
        break label500;
      }
      paramj = paramTypedArray.getDrawable(7);
      label448:
      if (!paramTypedArray.hasValue(8)) {
        break label528;
      }
      paramj = paramTypedArray.getDrawable(8);
    }
    for (;;)
    {
      paramp = paramj;
      if (paramj == null) {
        paramp = paramContext.getResources().getDrawable(getDefaultDrawableResId());
      }
      setLoadingDrawable(paramp);
      j();
      return;
      i = 3;
      break;
      label500:
      if (!paramTypedArray.hasValue(17)) {
        break label448;
      }
      i.a("ptrDrawableTop", "ptrDrawableStart");
      paramj = paramTypedArray.getDrawable(17);
      break label448;
      label528:
      if (paramTypedArray.hasValue(18))
      {
        i.a("ptrDrawableBottom", "ptrDrawableEnd");
        paramj = paramTypedArray.getDrawable(18);
      }
    }
  }
  
  private void k()
  {
    if (this.m != null)
    {
      this.m.reset();
      this.c.setImageMatrix(this.m);
    }
  }
  
  protected void a() {}
  
  protected void a(float paramFloat)
  {
    if (this.p) {}
    for (paramFloat = 90.0F * paramFloat;; paramFloat = Math.max(0.0F, Math.min(180.0F, 360.0F * paramFloat - 180.0F)))
    {
      this.m.setRotate(paramFloat, this.n, this.o);
      this.c.setImageMatrix(this.m);
      return;
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      this.n = Math.round(paramDrawable.getIntrinsicWidth() / 2.0F);
      this.o = Math.round(paramDrawable.getIntrinsicHeight() / 2.0F);
    }
  }
  
  protected void b()
  {
    this.c.startAnimation(this.l);
  }
  
  protected void c() {}
  
  protected void d()
  {
    this.c.clearAnimation();
    k();
  }
  
  public void e()
  {
    if (4 == this.e.getVisibility()) {
      this.e.setVisibility(0);
    }
    if (4 == this.c.getVisibility()) {
      this.c.setVisibility(0);
    }
    if (4 == this.f.getVisibility()) {
      this.f.setVisibility(0);
    }
  }
  
  public void f()
  {
    if (this.e.getVisibility() == 0) {
      this.e.setVisibility(4);
    }
    if (this.c.getVisibility() == 0) {
      this.c.setVisibility(4);
    }
    if (this.f.getVisibility() == 0) {
      this.f.setVisibility(4);
    }
  }
  
  protected int getDefaultDrawableResId()
  {
    return 2130837682;
  }
  
  public void setTextFooterColor(int paramInt)
  {
    this.e.setTextColor(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */