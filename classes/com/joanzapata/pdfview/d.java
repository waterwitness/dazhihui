package com.joanzapata.pdfview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;

class d
  implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener
{
  d(a parama) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a.a(this.a).b();
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    a.a(this.a).a(f, new PointF(a.a(this.a).getWidth() / 2, a.a(this.a).getHeight() / 2));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */