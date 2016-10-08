package com.android.dazhihui.ui.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

class lk
  implements View.OnClickListener
{
  lk(TabPageIndicator paramTabPageIndicator) {}
  
  public void onClick(View paramView)
  {
    paramView = (TabTextView)paramView;
    TabPageIndicator.a(this.a).getCurrentItem();
    int i = paramView.getIndex();
    if (TabPageIndicator.b(this.a) != null) {
      TabPageIndicator.b(this.a).a(i);
    }
    TabPageIndicator.a(this.a).setCurrentItem(i, TabPageIndicator.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */