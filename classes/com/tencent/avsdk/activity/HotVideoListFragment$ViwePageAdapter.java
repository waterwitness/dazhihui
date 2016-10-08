package com.tencent.avsdk.activity;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import java.util.List;

public class HotVideoListFragment$ViwePageAdapter
  extends ax
{
  private at mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private ad mFragmentManager;
  
  public HotVideoListFragment$ViwePageAdapter(HotVideoListFragment paramHotVideoListFragment, ad paramad)
  {
    this.mFragmentManager = paramad;
  }
  
  private String makeFragmentName(int paramInt1, long paramLong, int paramInt2)
  {
    return "android:switcher:" + paramInt1 + ":" + paramLong;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    this.mCurTransaction.d((Fragment)paramObject);
  }
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    if (this.mCurTransaction != null)
    {
      this.mCurTransaction.b();
      this.mCurTransaction = null;
      this.mFragmentManager.b();
    }
  }
  
  public int getCount()
  {
    if (HotVideoListFragment.access$300(this.this$0) == null) {
      return 0;
    }
    return HotVideoListFragment.access$300(this.this$0).size();
  }
  
  public Fragment getCurrentFrament()
  {
    return this.mCurrentPrimaryItem;
  }
  
  public Fragment getItem(int paramInt)
  {
    Object localObject = null;
    if (HotVideoListFragment.access$300(this.this$0) != null)
    {
      localObject = (LivebarConfigVo.topConfig)HotVideoListFragment.access$300(this.this$0).get(paramInt);
      localObject = IlvbRoomChildFragment.newInstance(((LivebarConfigVo.topConfig)localObject).getType(), ((LivebarConfigVo.topConfig)localObject).getUrl(), ((LivebarConfigVo.topConfig)localObject).getsName());
    }
    return (Fragment)localObject;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ((LivebarConfigVo.topConfig)HotVideoListFragment.access$300(this.this$0).get(paramInt)).getsName();
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    long l = getItemId(paramInt);
    String str = makeFragmentName(paramViewGroup.getId(), l, paramInt);
    Fragment localFragment = this.mFragmentManager.a(str);
    if (localFragment != null)
    {
      this.mCurTransaction.e(localFragment);
      return localFragment;
    }
    localFragment = getItem(paramInt);
    if (localFragment != null)
    {
      localFragment.setMenuVisibility(false);
      localFragment.setUserVisibleHint(false);
    }
    this.mCurTransaction.a(paramViewGroup.getId(), localFragment, str);
    return localFragment;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable saveState()
  {
    return null;
  }
  
  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (Fragment)paramObject;
    if (paramViewGroup != this.mCurrentPrimaryItem)
    {
      if (this.mCurrentPrimaryItem != null)
      {
        this.mCurrentPrimaryItem.setMenuVisibility(false);
        this.mCurrentPrimaryItem.setUserVisibleHint(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(true);
        paramViewGroup.setUserVisibleHint(true);
      }
      if ((paramViewGroup instanceof IlvbRoomChildFragment)) {
        ((IlvbRoomChildFragment)paramViewGroup).setParent(this.this$0);
      }
      HotVideoListFragment.access$100(this.this$0).post(HotVideoListFragment.access$1100(this.this$0));
      if (HotVideoListFragment.access$100(this.this$0) != null) {
        HotVideoListFragment.access$100(this.this$0).setLastPage(false);
      }
      this.mCurrentPrimaryItem = paramViewGroup;
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$ViwePageAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */