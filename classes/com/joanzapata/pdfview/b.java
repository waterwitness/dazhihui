package com.joanzapata.pdfview;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class b
  implements ValueAnimator.AnimatorUpdateListener
{
  b(a parama) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    a.a(this.a).a(f, a.a(this.a).getCurrentYOffset());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */