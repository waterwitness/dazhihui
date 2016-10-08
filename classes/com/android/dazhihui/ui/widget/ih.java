package com.android.dazhihui.ui.widget;

import android.support.v4.view.df;
import java.util.List;

class ih
  implements df
{
  ih(MyViewPager paramMyViewPager) {}
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (MyViewPager.a(this.a) != null) {
      MyViewPager.a(this.a).onPageScrollStateChanged(paramInt);
    }
    if (MyViewPager.b(this.a) != null)
    {
      int j = MyViewPager.b(this.a).size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)MyViewPager.b(this.a).get(i);
        if (localdf != null) {
          localdf.onPageScrollStateChanged(paramInt);
        }
        i += 1;
      }
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (MyViewPager.a(this.a) != null) {
      MyViewPager.a(this.a).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    if (MyViewPager.b(this.a) != null)
    {
      int j = MyViewPager.b(this.a).size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)MyViewPager.b(this.a).get(i);
        if (localdf != null) {
          localdf.onPageScrolled(paramInt1, paramFloat, paramInt2);
        }
        i += 1;
      }
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    if (MyViewPager.a(this.a) != null) {
      MyViewPager.a(this.a).onPageSelected(paramInt);
    }
    if (MyViewPager.b(this.a) != null)
    {
      int j = MyViewPager.b(this.a).size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)MyViewPager.b(this.a).get(i);
        if (localdf != null) {
          localdf.onPageSelected(paramInt);
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */