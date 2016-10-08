package com.android.dazhihui.ui.screen.stock;

import android.support.v4.view.df;
import android.view.inputmethod.InputMethodManager;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.MyViewPager;

class ln
  implements df
{
  ln(NewsDetailInfo paramNewsDetailInfo) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.a.b.getWindowToken(), 0);
    if (paramInt == 1) {
      n.a("", 20088);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */