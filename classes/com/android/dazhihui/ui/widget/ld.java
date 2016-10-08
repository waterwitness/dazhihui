package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import java.io.PrintStream;
import java.util.ArrayList;

class ld
  implements Animation.AnimationListener
{
  ld(StockChartViewflow paramStockChartViewflow) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    StockChartViewflow.a(this.a, false);
    System.out.println("动画结束...");
    StockChartViewflow.f(this.a).clearAnimation();
    if (StockChartViewflow.d(this.a).size() <= 1) {
      return;
    }
    paramAnimation = (HotVideoPushStockVo)StockChartViewflow.d(this.a).get(0);
    if ((StockChartViewflow.d(this.a).size() == 5) && (((HotVideoPushStockVo)StockChartViewflow.d(this.a).get(4)).getOwnerName().equals("更多"))) {}
    for (int i = 1;; i = 0)
    {
      StockChartViewflow.d(this.a).remove(0);
      if (i != 0)
      {
        StockChartViewflow.d(this.a).add(3, paramAnimation);
        this.a.a(0, StockChartViewflow.f(this.a));
        StockChartViewflow.c(this.a).setText(((HotVideoPushStockVo)StockChartViewflow.d(this.a).get(0)).getOwnerName());
        paramAnimation = ((HotVideoPushStockVo)StockChartViewflow.d(this.a).get(0)).getOwnerPeriod();
        if (TextUtils.isEmpty(paramAnimation)) {
          break label285;
        }
      }
      for (;;)
      {
        try
        {
          i = Integer.parseInt(paramAnimation);
          if ((StockChartViewflow.d(this.a).size() <= 1) || (this.a.getViewOpenStaus())) {
            break;
          }
          StockChartViewflow.g(this.a).removeMessages(StockChartViewflow.b);
          StockChartViewflow.g(this.a).sendMessageDelayed(StockChartViewflow.g(this.a).obtainMessage(StockChartViewflow.b), i);
          return;
          StockChartViewflow.d(this.a).add(paramAnimation);
        }
        catch (NumberFormatException paramAnimation)
        {
          i = 5000;
          continue;
        }
        label285:
        i = 5000;
      }
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    System.out.println("动画重复...");
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    System.out.println("动画开始...");
    StockChartViewflow.a(this.a, true);
    if ((StockChartViewflow.b(this.a) == null) || (StockChartViewflow.c(this.a) == null) || (StockChartViewflow.d(this.a).size() <= 1)) {
      return;
    }
    this.a.a(1, StockChartViewflow.b(this.a));
    StockChartViewflow.c(this.a).postDelayed(new le(this), 1500L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */