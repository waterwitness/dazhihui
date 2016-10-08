package com.tencent.avsdk.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class HotVideoListFragment$13
  implements AdapterView.OnItemSelectedListener
{
  HotVideoListFragment$13(HotVideoListFragment paramHotVideoListFragment) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt;
    if (this.this$0.getMyHongBaoShow()) {
      i = paramInt + 1;
    }
    HotVideoListFragment.access$900(this.this$0).setCurrentItem(i);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */