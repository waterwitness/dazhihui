package com.android.dazhihui.ui.delegate.screen;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ax;
import android.view.View;
import java.util.ArrayList;

class ho
  extends ax
{
  ho(TransferMenuNew paramTransferMenuNew) {}
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    ((ViewPager)paramView).removeView((View)TransferMenuNew.d(this.a).get(paramInt));
  }
  
  public int getCount()
  {
    return TransferMenuNew.d(this.a).size();
  }
  
  public int getItemPosition(Object paramObject)
  {
    return super.getItemPosition(paramObject);
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    ((ViewPager)paramView).addView((View)TransferMenuNew.d(this.a).get(paramInt));
    return TransferMenuNew.d(this.a).get(paramInt);
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */