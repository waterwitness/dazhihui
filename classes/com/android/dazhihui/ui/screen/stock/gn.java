package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import com.android.dazhihui.ui.screen.i;
import com.tencent.avsdk.activity.IlvbRoomChildFragment;
import java.util.List;

public class gn
  extends ax
{
  private ad b;
  private at c = null;
  private Fragment d = null;
  
  public gn(gg paramgg, ad paramad)
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
    Object localObject = null;
    Bundle localBundle;
    if (gg.c(this.a) != null)
    {
      localObject = (LivebarConfigVo.topConfig)gg.c(this.a).get(paramInt);
      ((LivebarConfigVo.topConfig)localObject).getsName();
      paramInt = ((LivebarConfigVo.topConfig)localObject).getType();
      if (paramInt == 4)
      {
        localBundle = new Bundle();
        localBundle.putString("nexturl", ((LivebarConfigVo.topConfig)localObject).getUrl());
        localBundle.putBoolean("ISSHOWTITLE", false);
        localBundle.putInt("BACK_GROUND_COLOR", 1);
        localObject = i.a(localBundle);
      }
    }
    else
    {
      return (Fragment)localObject;
    }
    if (paramInt == 1)
    {
      localBundle = new Bundle();
      localBundle.putString("nexturl", ((LivebarConfigVo.topConfig)localObject).getUrl());
      localBundle.putString("ShowName", ((LivebarConfigVo.topConfig)localObject).getsName());
      return go.a(localBundle);
    }
    return IlvbRoomChildFragment.newInstance(((LivebarConfigVo.topConfig)localObject).getType(), ((LivebarConfigVo.topConfig)localObject).getUrl(), ((LivebarConfigVo.topConfig)localObject).getsName());
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
    if (gg.c(this.a) == null) {
      return 0;
    }
    return gg.c(this.a).size();
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ((LivebarConfigVo.topConfig)gg.c(this.a).get(paramInt)).getsName();
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = b(paramInt);
    String str = a(paramViewGroup.getId(), l, paramInt);
    Fragment localFragment = this.b.a(str);
    if (localFragment != null) {
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */