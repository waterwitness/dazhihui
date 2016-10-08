package com.android.dazhihui.ui.widget;

import android.support.v4.view.ViewPager;
import android.support.v4.view.df;
import android.widget.ImageView;
import java.util.ArrayList;

class kn
  implements df
{
  kn(km paramkm) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    km.a(this.a, paramInt - 1);
    this.a.a(paramInt);
    if ((paramInt == km.a(this.a).size() - 1) || (paramInt == 0))
    {
      if (paramInt == 0)
      {
        km.b(this.a).setCurrentItem(paramInt + 1);
        ((ImageView)km.a(this.a).get(1)).setBackgroundResource(2130838104);
      }
    }
    else {
      return;
    }
    km.b(this.a).setCurrentItem(paramInt - 1);
    ((ImageView)km.a(this.a).get(paramInt - 1)).setBackgroundResource(2130838104);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */