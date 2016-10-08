package com.android.dazhihui.ui.screen.stock;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.ao;
import android.support.v4.app.at;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.ui.widget.eg;

class xk
  extends ao
  implements eg
{
  private ad b;
  private at c = null;
  private Fragment d = null;
  
  public xk(xe paramxe, ad paramad)
  {
    super(paramad);
    this.b = paramad;
  }
  
  private String a(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public int a(int paramInt)
  {
    if ((xe.c(this.a) != null) && (paramInt == xe.c(this.a).length - 1)) {}
    return 0;
  }
  
  public void a()
  {
    if ((xe.c(this.a) != null) && (this.b != null))
    {
      at localat = this.b.a();
      int i = 0;
      while (i < xe.c(this.a).length)
      {
        if (xe.c(this.a)[i] != null)
        {
          if ((xe.c(this.a)[i] instanceof sk)) {}
          localat.a(xe.c(this.a)[i]);
        }
        i += 1;
      }
      localat.b();
      this.b.b();
    }
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
    if (xe.c(this.a) == null) {
      return 0;
    }
    return xe.c(this.a).length;
  }
  
  public Fragment getItem(int paramInt)
  {
    return xe.c(this.a)[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemPosition(Object paramObject)
  {
    return -2;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    if ((xe.f(this.a) == null) || (xe.f(this.a).length == 0) || (paramInt < 0) || (paramInt >= xe.f(this.a).length)) {
      return "";
    }
    return xe.f(this.a)[paramInt];
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = getItemId(paramInt);
    Object localObject = a(paramViewGroup.getId(), l);
    localObject = this.b.a((String)localObject);
    if (localObject != null) {}
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.d)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = getItem(paramInt);
      this.c.a(paramViewGroup.getId(), (Fragment)localObject, a(paramViewGroup.getId(), l));
    }
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */