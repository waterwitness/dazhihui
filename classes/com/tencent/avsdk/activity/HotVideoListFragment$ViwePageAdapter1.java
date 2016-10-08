package com.tencent.avsdk.activity;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotVideoListFragment$ViwePageAdapter1
  extends ax
{
  private at mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private ad mFragmentManager;
  private ArrayList<Fragment> mFragments = new ArrayList();
  private ArrayList<Fragment.SavedState> mSavedState = new ArrayList();
  
  public HotVideoListFragment$ViwePageAdapter1(HotVideoListFragment paramHotVideoListFragment, ad paramad)
  {
    this.mFragmentManager = paramad;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (Fragment)paramObject;
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    while (this.mSavedState.size() <= paramInt) {
      this.mSavedState.add(null);
    }
    this.mSavedState.set(paramInt, this.mFragmentManager.a(paramViewGroup));
    this.mFragments.set(paramInt, null);
    this.mCurTransaction.a(paramViewGroup);
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
    if (this.mFragments.size() > paramInt)
    {
      localFragment = (Fragment)this.mFragments.get(paramInt);
      if (localFragment != null) {
        return localFragment;
      }
    }
    if (this.mCurTransaction == null) {
      this.mCurTransaction = this.mFragmentManager.a();
    }
    Fragment localFragment = getItem(paramInt);
    if (this.mSavedState.size() > paramInt)
    {
      Fragment.SavedState localSavedState = (Fragment.SavedState)this.mSavedState.get(paramInt);
      if (localSavedState != null) {
        localFragment.setInitialSavedState(localSavedState);
      }
    }
    while (this.mFragments.size() <= paramInt) {
      this.mFragments.add(null);
    }
    localFragment.setMenuVisibility(false);
    localFragment.setUserVisibleHint(false);
    this.mFragments.set(paramInt, localFragment);
    this.mCurTransaction.a(paramViewGroup.getId(), localFragment);
    return localFragment;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }
  
  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      paramParcelable = (Bundle)paramParcelable;
      paramParcelable.setClassLoader(paramClassLoader);
      paramClassLoader = paramParcelable.getParcelableArray("states");
      this.mSavedState.clear();
      this.mFragments.clear();
      int i;
      if (paramClassLoader != null)
      {
        i = 0;
        while (i < paramClassLoader.length)
        {
          this.mSavedState.add((Fragment.SavedState)paramClassLoader[i]);
          i += 1;
        }
      }
      paramClassLoader = paramParcelable.keySet().iterator();
      while (paramClassLoader.hasNext())
      {
        Object localObject = (String)paramClassLoader.next();
        if (((String)localObject).startsWith("f"))
        {
          i = Integer.parseInt(((String)localObject).substring(1));
          localObject = this.mFragmentManager.a(paramParcelable, (String)localObject);
          if (localObject != null)
          {
            while (this.mFragments.size() <= i) {
              this.mFragments.add(null);
            }
            ((Fragment)localObject).setMenuVisibility(false);
            this.mFragments.set(i, localObject);
          }
        }
      }
    }
  }
  
  public Parcelable saveState()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.mSavedState.size() > 0)
    {
      localObject1 = new Bundle();
      localObject2 = new Fragment.SavedState[this.mSavedState.size()];
      this.mSavedState.toArray((Object[])localObject2);
      ((Bundle)localObject1).putParcelableArray("states", (Parcelable[])localObject2);
    }
    int i = 0;
    while (i < this.mFragments.size())
    {
      Fragment localFragment = (Fragment)this.mFragments.get(i);
      localObject2 = localObject1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        if (localFragment.isAdded())
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Bundle();
          }
          localObject1 = "f" + i;
          this.mFragmentManager.a((Bundle)localObject2, (String)localObject1, localFragment);
        }
      }
      i += 1;
      localObject1 = localObject2;
    }
    return (Parcelable)localObject1;
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
      HotVideoListFragment.access$900(this.this$0).requestLayout();
      HotVideoListFragment.access$100(this.this$0).post(HotVideoListFragment.access$1100(this.this$0));
      if (HotVideoListFragment.access$100(this.this$0) != null) {
        HotVideoListFragment.access$100(this.this$0).setLastPage(false);
      }
      this.mCurrentPrimaryItem = paramViewGroup;
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$ViwePageAdapter1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */