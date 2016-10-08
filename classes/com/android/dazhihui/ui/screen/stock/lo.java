package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;

public class lo
  extends ax
{
  private ad a;
  private at b = null;
  private Fragment c = null;
  private Bundle d;
  
  public lo(ad paramad, Bundle paramBundle)
  {
    this.a = paramad;
    this.d = paramBundle;
  }
  
  private String c(int paramInt)
  {
    return "dzh:newsDetail:" + paramInt;
  }
  
  public Fragment a()
  {
    return this.c;
  }
  
  public Fragment a(int paramInt)
  {
    if (paramInt == 0) {
      return kz.a(this.d);
    }
    return ju.a(this.d);
  }
  
  public Fragment b(int paramInt)
  {
    String str = c(paramInt);
    return this.a.a(str);
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.b == null) {
      this.b = this.a.a();
    }
    this.b.d((Fragment)paramObject);
  }
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    if (this.b != null)
    {
      this.b.b();
      this.b = null;
      this.a.b();
    }
  }
  
  public int getCount()
  {
    return 2;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.b == null) {
      this.b = this.a.a();
    }
    String str = c(paramInt);
    Fragment localFragment = this.a.a(str);
    if (localFragment != null)
    {
      this.b.e(localFragment);
      return localFragment;
    }
    localFragment = a(paramInt);
    if (localFragment != null)
    {
      localFragment.setMenuVisibility(false);
      localFragment.setUserVisibleHint(false);
    }
    this.b.a(paramViewGroup.getId(), localFragment, str);
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
    if (paramViewGroup != this.c)
    {
      if (this.c != null)
      {
        this.c.setMenuVisibility(false);
        this.c.setUserVisibleHint(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(true);
        paramViewGroup.setUserVisibleHint(true);
      }
      this.c = paramViewGroup;
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */