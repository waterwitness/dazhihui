package com.android.dazhihui.ui.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class lc
  implements Animation.AnimationListener
{
  lc(StockChartViewflow paramStockChartViewflow) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    StockChartViewflow.b(this.a).clearAnimation();
    StockChartViewflow.b(this.a).setVisibility(4);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    StockChartViewflow.b(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */