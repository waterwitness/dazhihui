package com.android.dazhihui.ui.widget;

import android.support.v4.view.df;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.fu;

class ku
  implements df
{
  ku(SlideableFrame paramSlideableFrame) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    if (paramInt == 0) {
      ((fu)SlideableFrame.a(this.a).b()).e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */