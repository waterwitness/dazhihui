package com.handmark.pulltorefresh.library.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.handmark.pulltorefresh.library.a;
import com.handmark.pulltorefresh.library.ah;
import com.handmark.pulltorefresh.library.ai;
import com.handmark.pulltorefresh.library.aj;
import com.handmark.pulltorefresh.library.ak;
import com.handmark.pulltorefresh.library.p;

@SuppressLint({"ViewConstructor"})
public abstract class f
  extends FrameLayout
  implements a
{
  protected static final Interpolator a = new LinearInterpolator();
  protected FrameLayout b;
  protected ImageView c;
  protected ProgressBar d;
  protected TextView e;
  protected TextView f;
  protected com.handmark.pulltorefresh.library.j g;
  protected p h;
  protected CharSequence i;
  protected CharSequence j;
  protected CharSequence k;
  private boolean l;
  
  public f(Context paramContext)
  {
    super(paramContext);
  }
  
  public f(Context paramContext, com.handmark.pulltorefresh.library.j paramj, p paramp, TypedArray paramTypedArray)
  {
    super(paramContext);
    this.g = paramj;
    this.h = paramp;
    FrameLayout.LayoutParams localLayoutParams;
    int m;
    switch (g.a[paramp.ordinal()])
    {
    default: 
      LayoutInflater.from(paramContext).inflate(ai.pull_to_refresh_header_vertical, this);
      this.b = ((FrameLayout)findViewById(ah.fl_inner));
      this.e = ((TextView)this.b.findViewById(ah.pull_to_refresh_text));
      this.d = ((ProgressBar)this.b.findViewById(ah.pull_to_refresh_progress));
      this.f = ((TextView)this.b.findViewById(ah.pull_to_refresh_sub_text));
      this.c = ((ImageView)this.b.findViewById(ah.pull_to_refresh_image));
      localLayoutParams = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      switch (g.b[paramj.ordinal()])
      {
      default: 
        if (paramp == p.a)
        {
          m = 80;
          label183:
          localLayoutParams.gravity = m;
          this.i = paramContext.getString(aj.pull_to_refresh_pull_label);
          this.j = paramContext.getString(aj.pull_to_refresh_refreshing_label);
          this.k = paramContext.getString(aj.pull_to_refresh_release_label);
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrHeaderBackground))
          {
            paramp = paramTypedArray.getDrawable(ak.PullToRefresh_ptrHeaderBackground);
            if (paramp != null) {
              j.a(this, paramp);
            }
          }
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrHeaderTextAppearance))
          {
            paramp = new TypedValue();
            paramTypedArray.getValue(ak.PullToRefresh_ptrHeaderTextAppearance, paramp);
            setTextAppearance(paramp.data);
          }
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrSubHeaderTextAppearance))
          {
            paramp = new TypedValue();
            paramTypedArray.getValue(ak.PullToRefresh_ptrSubHeaderTextAppearance, paramp);
            setSubTextAppearance(paramp.data);
          }
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrHeaderTextColor))
          {
            paramp = paramTypedArray.getColorStateList(ak.PullToRefresh_ptrHeaderTextColor);
            if (paramp != null) {
              setTextColor(paramp);
            }
          }
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrHeaderSubTextColor))
          {
            paramp = paramTypedArray.getColorStateList(ak.PullToRefresh_ptrHeaderSubTextColor);
            if (paramp != null) {
              setSubTextColor(paramp);
            }
          }
          paramp = null;
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrDrawable)) {
            paramp = paramTypedArray.getDrawable(ak.PullToRefresh_ptrDrawable);
          }
          switch (g.b[paramj.ordinal()])
          {
          default: 
            if (paramTypedArray.hasValue(ak.PullToRefresh_ptrDrawableStart)) {
              paramj = paramTypedArray.getDrawable(ak.PullToRefresh_ptrDrawableStart);
            }
            break;
          }
        }
        break;
      }
      break;
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
      LayoutInflater.from(paramContext).inflate(ai.pull_to_refresh_header_horizontal, this);
      break;
      if (paramp == p.a) {}
      for (m = 48;; m = 3)
      {
        localLayoutParams.gravity = m;
        this.i = paramContext.getString(aj.pull_to_refresh_from_bottom_pull_label);
        this.j = paramContext.getString(aj.pull_to_refresh_from_bottom_refreshing_label);
        this.k = paramContext.getString(aj.pull_to_refresh_from_bottom_release_label);
        break;
      }
      m = 5;
      break label183;
      paramj = paramp;
      if (paramTypedArray.hasValue(ak.PullToRefresh_ptrDrawableTop))
      {
        i.a("ptrDrawableTop", "ptrDrawableStart");
        paramj = paramTypedArray.getDrawable(ak.PullToRefresh_ptrDrawableTop);
        continue;
        if (paramTypedArray.hasValue(ak.PullToRefresh_ptrDrawableEnd))
        {
          paramj = paramTypedArray.getDrawable(ak.PullToRefresh_ptrDrawableEnd);
        }
        else
        {
          paramj = paramp;
          if (paramTypedArray.hasValue(ak.PullToRefresh_ptrDrawableBottom))
          {
            i.a("ptrDrawableBottom", "ptrDrawableEnd");
            paramj = paramTypedArray.getDrawable(ak.PullToRefresh_ptrDrawableBottom);
          }
        }
      }
    }
  }
  
  private void setSubHeaderText(CharSequence paramCharSequence)
  {
    if (this.f != null)
    {
      if (!TextUtils.isEmpty(paramCharSequence)) {
        break label24;
      }
      this.f.setVisibility(8);
    }
    label24:
    do
    {
      return;
      this.f.setText(paramCharSequence);
    } while (8 != this.f.getVisibility());
    this.f.setVisibility(0);
  }
  
  protected abstract void a();
  
  protected abstract void a(float paramFloat);
  
  protected abstract void a(Drawable paramDrawable);
  
  protected abstract void b();
  
  public final void b(float paramFloat)
  {
    if (!this.l) {
      a(paramFloat);
    }
  }
  
  protected abstract void c();
  
  protected abstract void d();
  
  public void e()
  {
    if (4 == this.e.getVisibility()) {
      this.e.setVisibility(0);
    }
    if (4 == this.d.getVisibility()) {
      this.d.setVisibility(0);
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
    if (this.d.getVisibility() == 0) {
      this.d.setVisibility(4);
    }
    if (this.c.getVisibility() == 0) {
      this.c.setVisibility(4);
    }
    if (this.f.getVisibility() == 0) {
      this.f.setVisibility(4);
    }
  }
  
  public final void g()
  {
    if (this.e != null) {
      this.e.setText(this.i);
    }
    a();
  }
  
  public final int getContentSize()
  {
    switch (g.a[this.h.ordinal()])
    {
    default: 
      return this.b.getHeight();
    }
    return this.b.getWidth();
  }
  
  protected abstract int getDefaultDrawableResId();
  
  public final void h()
  {
    if (this.e != null) {
      this.e.setText(this.j);
    }
    if (this.l) {
      ((AnimationDrawable)this.c.getDrawable()).start();
    }
    for (;;)
    {
      if (this.f != null) {
        this.f.setVisibility(8);
      }
      return;
      b();
    }
  }
  
  public final void i()
  {
    if (this.e != null) {
      this.e.setText(this.k);
    }
    c();
  }
  
  public final void j()
  {
    if (this.e != null) {
      this.e.setText(this.i);
    }
    this.c.setVisibility(0);
    if (this.l) {
      ((AnimationDrawable)this.c.getDrawable()).stop();
    }
    for (;;)
    {
      if (this.f != null)
      {
        if (!TextUtils.isEmpty(this.f.getText())) {
          break;
        }
        this.f.setVisibility(8);
      }
      return;
      d();
    }
    this.f.setVisibility(0);
  }
  
  public final void setHeight(int paramInt)
  {
    getLayoutParams().height = paramInt;
    requestLayout();
  }
  
  public void setLastUpdatedLabel(CharSequence paramCharSequence)
  {
    setSubHeaderText(paramCharSequence);
  }
  
  public final void setLoadingDrawable(Drawable paramDrawable)
  {
    this.c.setImageDrawable(paramDrawable);
    this.l = (paramDrawable instanceof AnimationDrawable);
    a(paramDrawable);
  }
  
  public void setPullLabel(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
  }
  
  public void setRefreshingLabel(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
  }
  
  public void setReleaseLabel(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
  }
  
  protected void setSubTextAppearance(int paramInt)
  {
    if (this.f != null) {
      this.f.setTextAppearance(getContext(), paramInt);
    }
  }
  
  protected void setSubTextColor(ColorStateList paramColorStateList)
  {
    if (this.f != null) {
      this.f.setTextColor(paramColorStateList);
    }
  }
  
  protected void setTextAppearance(int paramInt)
  {
    if (this.e != null) {
      this.e.setTextAppearance(getContext(), paramInt);
    }
    if (this.f != null) {
      this.f.setTextAppearance(getContext(), paramInt);
    }
  }
  
  protected void setTextColor(ColorStateList paramColorStateList)
  {
    if (this.e != null) {
      this.e.setTextColor(paramColorStateList);
    }
    if (this.f != null) {
      this.f.setTextColor(paramColorStateList);
    }
  }
  
  public void setTextTypeface(Typeface paramTypeface)
  {
    this.e.setTypeface(paramTypeface);
  }
  
  public final void setWidth(int paramInt)
  {
    getLayoutParams().width = paramInt;
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */