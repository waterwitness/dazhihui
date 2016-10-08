package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.d.n;

public class nh
  extends ax
{
  private ad b;
  private at c = null;
  private Fragment d = null;
  
  public nh(ne paramne, ad paramad)
  {
    this.b = paramad;
  }
  
  private String a(int paramInt1, long paramLong, int paramInt2)
  {
    return "android:switcher:" + paramInt1 + ":" + paramLong;
  }
  
  public Fragment a()
  {
    return this.d;
  }
  
  public Fragment a(int paramInt)
  {
    String str1;
    if (paramInt == 0)
    {
      str1 = ne.b(this.a).getString("code");
      return lp.a(4, this.a.a(str1, "list/1.json"), "", false, str1);
    }
    String str2;
    if (paramInt == 1)
    {
      str1 = ne.c(this.a).getString("code");
      str2 = this.a.a(str1, "gsgg/1.json");
      n.a(ne.d(this.a), 1412);
      return lp.a(4, str2, "", false, str1);
    }
    if (paramInt == 2)
    {
      str1 = ne.e(this.a).getString("code");
      str2 = this.a.a(str1, "yjbg/1.json");
      n.a(ne.d(this.a), 1413);
      return lp.a(4, str2, "", false, str1);
    }
    return null;
  }
  
  public long b(int paramInt)
  {
    return paramInt;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    this.c.d((Fragment)paramObject);
  }
  
  public void finishUpdate(ViewGroup paramViewGroup)
  {
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
      this.b.b();
    }
  }
  
  public int getCount()
  {
    if (ne.a(this.a) == null) {
      return 0;
    }
    return ne.a(this.a).length;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ne.a(this.a)[paramInt];
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = b(paramInt);
    String str = a(paramViewGroup.getId(), l, paramInt);
    Fragment localFragment = this.b.a(str);
    if (localFragment != null)
    {
      this.c.e(localFragment);
      return localFragment;
    }
    localFragment = a(paramInt);
    if (localFragment != null)
    {
      localFragment.setMenuVisibility(false);
      localFragment.setUserVisibleHint(false);
    }
    this.c.a(paramViewGroup.getId(), localFragment, str);
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
    if (paramViewGroup != this.d)
    {
      if (this.d != null)
      {
        this.d.setMenuVisibility(false);
        this.d.setUserVisibleHint(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(true);
        paramViewGroup.setUserVisibleHint(true);
      }
      this.d = paramViewGroup;
    }
  }
  
  public void startUpdate(ViewGroup paramViewGroup) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */