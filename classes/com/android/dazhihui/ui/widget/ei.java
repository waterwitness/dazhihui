package com.android.dazhihui.ui.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

class ei
  implements View.OnClickListener
{
  ei(IlvbTabPageIndicator paramIlvbTabPageIndicator) {}
  
  public void onClick(View paramView)
  {
    paramView = (TabTextView)paramView;
    IlvbTabPageIndicator.a(this.a).getCurrentItem();
    int i = paramView.getIndex();
    if (IlvbTabPageIndicator.b(this.a) != null) {
      IlvbTabPageIndicator.b(this.a).a(i);
    }
    IlvbTabPageIndicator.a(this.a).setCurrentItem(i, IlvbTabPageIndicator.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */