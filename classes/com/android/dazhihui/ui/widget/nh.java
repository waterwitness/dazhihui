package com.android.dazhihui.ui.widget;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ax;
import android.view.View;
import java.util.List;

public class nh
  extends ax
{
  private List<View> a;
  
  public nh(List<View> paramList)
  {
    this.a = paramList;
  }
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    ((ViewPager)paramView).removeView((View)this.a.get(paramInt));
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public int getItemPosition(Object paramObject)
  {
    return super.getItemPosition(paramObject);
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    ((ViewPager)paramView).addView((View)this.a.get(paramInt));
    return this.a.get(paramInt);
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */