package com.android.dazhihui.ui.widget;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;

class kv
  extends ax
{
  private final ad b;
  private at c = null;
  private Fragment d = null;
  private int e = 2;
  
  public kv(SlideableFrame paramSlideableFrame, ad paramad)
  {
    this.b = paramad;
  }
  
  private String a(int paramInt1, long paramLong, int paramInt2)
  {
    if (paramInt2 == 1) {
      return SlideableFrame.b(this.a).c().getClass().getSimpleName();
    }
    return "android:switcher:" + paramInt1 + ":" + paramLong;
  }
  
  public long a(int paramInt)
  {
    return paramInt;
  }
  
  public Fragment b(int paramInt)
  {
    if (paramInt == 1) {
      return SlideableFrame.b(this.a).c();
    }
    return new kx(paramInt, this.a);
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
    return this.e;
  }
  
  public int getItemPosition(Object paramObject)
  {
    if ((paramObject instanceof kx)) {
      return -1;
    }
    return -2;
  }
  
  public float getPageWidth(int paramInt)
  {
    if (paramInt != 1) {
      return 0.8F;
    }
    return super.getPageWidth(paramInt);
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    long l = a(paramInt);
    a(paramViewGroup.getId(), l, paramInt);
    Fragment localFragment = b(paramInt);
    if (localFragment.isAdded()) {
      this.c.e(localFragment);
    }
    for (;;)
    {
      if (localFragment != this.d)
      {
        localFragment.setMenuVisibility(false);
        localFragment.setUserVisibleHint(false);
      }
      return localFragment;
      this.c.a(paramViewGroup.getId(), localFragment, a(paramViewGroup.getId(), l, paramInt));
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */