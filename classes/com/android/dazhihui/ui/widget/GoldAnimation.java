package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;

public class GoldAnimation
  extends FrameLayout
{
  ScaleAnimation a;
  View b;
  int c = 100;
  private View d;
  private TextView e;
  private View f;
  private AnimationSet g;
  private dv h;
  private View i;
  private View j;
  private View k;
  private View l;
  private TranslateAnimation m;
  private TranslateAnimation n;
  private TranslateAnimation o;
  
  public GoldAnimation(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public GoldAnimation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public GoldAnimation(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.d = LayoutInflater.from(getContext()).inflate(2130903153, this, true);
    this.e = ((TextView)this.d.findViewById(2131559193));
    this.f = this.d.findViewById(2131559191);
    this.b = this.d.findViewById(2131559192);
    this.i = this.d.findViewById(2131559194);
    this.j = this.d.findViewById(2131559189);
    this.k = this.d.findViewById(2131559188);
    this.l = this.d.findViewById(2131559190);
    this.k.setVisibility(8);
    this.l.setVisibility(8);
    this.f.setVisibility(8);
    this.h = new dv(this, 100);
    this.g = new AnimationSet(true);
    Object localObject = new AlphaAnimation(0.0F, 1.0F);
    ((AlphaAnimation)localObject).setDuration(1500L);
    this.g.addAnimation((Animation)localObject);
    localObject = new ScaleAnimation(0.0F, 1.4F, 0.0F, 1.4F, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setDuration(2000L);
    this.g.addAnimation((Animation)localObject);
    this.m = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 2, 0.65F);
    this.m.setDuration(400L);
    this.m.setRepeatCount(100);
    this.n = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 2, 0.65F);
    this.n.setDuration(400L);
    this.n.setRepeatCount(100);
    this.o = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 2, 0.65F);
    this.o.setDuration(400L);
    this.o.setRepeatCount(1000);
    this.a = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    this.a.setDuration(3000L);
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
    this.f.setVisibility(0);
    this.f.startAnimation(this.g);
    this.h.a();
    this.j.setVisibility(0);
    this.j.startAnimation(this.m);
    postDelayed(new dt(this), 300L);
    postDelayed(new du(this), 600L);
    this.i.startAnimation(this.a);
  }
  
  public void setOnBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.b != null) {
      this.b.setOnClickListener(paramOnClickListener);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\GoldAnimation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */