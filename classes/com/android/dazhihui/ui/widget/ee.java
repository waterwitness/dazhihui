package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import java.io.PrintStream;
import java.util.ArrayList;

class ee
  implements Animation.AnimationListener
{
  ee(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    HotVideoViewFlow.f(this.a).clearAnimation();
    if (HotVideoViewFlow.b(this.a).size() <= 1) {
      return;
    }
    paramAnimation = (HotVideoPushStockVo)HotVideoViewFlow.b(this.a).get(0);
    if ((HotVideoViewFlow.b(this.a).size() == 5) && (((HotVideoPushStockVo)HotVideoViewFlow.b(this.a).get(4)).getOwnerName().equals("更多"))) {}
    for (int i = 1;; i = 0)
    {
      HotVideoViewFlow.b(this.a).remove(0);
      if (i != 0)
      {
        HotVideoViewFlow.b(this.a).add(3, paramAnimation);
        HotVideoViewFlow.g(this.a).clear();
        HotVideoViewFlow.g(this.a).add(HotVideoViewFlow.b(this.a).get(0));
        HotVideoViewFlow.c(this.a).setAllHotData(HotVideoViewFlow.b(this.a));
        HotVideoViewFlow.c(this.a).setHotData(HotVideoViewFlow.g(this.a));
        paramAnimation = ((HotVideoPushStockVo)HotVideoViewFlow.b(this.a).get(0)).getOwnerPeriod();
        if (TextUtils.isEmpty(paramAnimation)) {
          break label269;
        }
      }
      for (;;)
      {
        try
        {
          i = Integer.parseInt(paramAnimation);
          if (HotVideoViewFlow.b(this.a).size() <= 1) {
            break;
          }
          HotVideoViewFlow.h(this.a).sendMessageDelayed(HotVideoViewFlow.h(this.a).obtainMessage(HotVideoViewFlow.b), i);
          return;
          HotVideoViewFlow.b(this.a).add(paramAnimation);
        }
        catch (NumberFormatException paramAnimation)
        {
          i = 5000;
          continue;
        }
        label269:
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
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */