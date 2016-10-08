package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class bc
  extends Animation
{
  bc(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.b(this.a, paramFloat);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */