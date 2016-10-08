package com.joanzapata.pdfview;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class c
  implements ValueAnimator.AnimatorUpdateListener
{
  c(a parama) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    a.a(this.a).a(a.a(this.a).getCurrentXOffset(), f);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */