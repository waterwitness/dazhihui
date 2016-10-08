package com.android.dazhihui.ui.widget.dzhrefresh;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class g
  implements ValueAnimator.AnimatorUpdateListener
{
  g(f paramf) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    f.a(this.a, paramValueAnimator.getAnimatedFraction());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */