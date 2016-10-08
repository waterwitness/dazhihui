package com.tencent.avsdk.widget;

import android.view.animation.Interpolator;

final class ViewDragHelper$1
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ViewDragHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */