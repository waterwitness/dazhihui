package com.android.dazhihui.ui.widget.dzhrefresh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.jni.DzhNative;
import com.handmark.pulltorefresh.library.a.i;
import com.handmark.pulltorefresh.library.p;

public class f
  extends com.handmark.pulltorefresh.library.a.f
{
  private static Bitmap m;
  private RelativeLayout l;
  private final ValueAnimator n;
  
  public f(Context paramContext, com.handmark.pulltorefresh.library.j paramj, p paramp, TypedArray paramTypedArray)
  {
    super(paramContext);
    this.g = paramj;
    this.h = paramp;
    LayoutInflater.from(paramContext).inflate(2130903101, this);
    this.b = ((FrameLayout)findViewById(2131558835));
    this.e = ((TextView)this.b.findViewById(2131558837));
    this.f = ((TextView)this.b.findViewById(2131558838));
    this.c = ((ImageView)this.b.findViewById(2131558836));
    this.c.setBackgroundResource(2130837703);
    ((FrameLayout.LayoutParams)this.b.getLayoutParams()).gravity = 80;
    this.i = paramContext.getString(2131165184);
    this.j = paramContext.getString(2131165185);
    this.k = paramContext.getString(2131165186);
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
    if (paramTypedArray.hasValue(7)) {
      paramj = paramTypedArray.getDrawable(7);
    }
    for (;;)
    {
      paramp = paramj;
      if (paramj == null) {
        paramp = paramContext.getResources().getDrawable(getDefaultDrawableResId());
      }
      setLoadingDrawable(paramp);
      this.l = ((RelativeLayout)this.b.findViewById(2131558839));
      if (m == null)
      {
        m = BitmapFactory.decodeResource(getResources(), 2130837702);
        int i = getResources().getDimensionPixelSize(2131230824);
        m = Bitmap.createScaledBitmap(m, i, i, false);
      }
      this.n = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.n.setInterpolator(a);
      this.n.setDuration(800L);
      this.n.setRepeatCount(-1);
      this.n.setRepeatMode(1);
      this.n.addUpdateListener(new g(this));
      j();
      return;
      if (paramTypedArray.hasValue(17))
      {
        i.a("ptrDrawableTop", "ptrDrawableStart");
        paramj = paramTypedArray.getDrawable(17);
      }
    }
  }
  
  private void c(float paramFloat)
  {
    Bitmap localBitmap = Bitmap.createBitmap(m.getWidth(), m.getHeight(), Bitmap.Config.ARGB_8888);
    DzhNative.getInstance().clipLeftImage(m, localBitmap, paramFloat);
    this.c.setImageBitmap(localBitmap);
  }
  
  protected void a()
  {
    this.k = q.a().b();
  }
  
  protected void a(float paramFloat)
  {
    if (paramFloat < 1.0F)
    {
      if (this.l.getVisibility() == 0)
      {
        this.l.setScaleX(paramFloat);
        this.l.setScaleY(paramFloat);
      }
      if (paramFloat - 0.5F > 0.0F)
      {
        c((paramFloat - 0.5F) / 0.5F);
        return;
      }
      this.c.setImageBitmap(null);
      return;
    }
    if (this.l.getVisibility() == 0)
    {
      this.l.setScaleX(1.0F);
      this.l.setScaleY(1.0F);
    }
    this.c.setImageBitmap(m);
  }
  
  protected void a(Drawable paramDrawable) {}
  
  protected void b()
  {
    this.n.cancel();
    this.n.start();
  }
  
  protected void c() {}
  
  protected void d()
  {
    this.n.cancel();
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
    return 2130837703;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */