package com.android.dazhihui.ui.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

class jg
  implements View.OnClickListener
{
  jg(NewsTabPageIndicator paramNewsTabPageIndicator) {}
  
  public void onClick(View paramView)
  {
    paramView = (TabTextView)paramView;
    NewsTabPageIndicator.a(this.a).getCurrentItem();
    int i = paramView.getIndex();
    if (NewsTabPageIndicator.b(this.a) != null) {
      NewsTabPageIndicator.b(this.a).a(i);
    }
    NewsTabPageIndicator.a(this.a).setCurrentItem(i, NewsTabPageIndicator.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */