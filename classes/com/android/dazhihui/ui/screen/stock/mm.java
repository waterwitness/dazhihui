package com.android.dazhihui.ui.screen.stock;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.view.ax;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.d.r;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.i;
import java.util.List;

public class mm
  extends ax
{
  private ad b;
  private at c = null;
  private Fragment d = null;
  
  public mm(mf parammf, ad paramad)
  {
    this.b = paramad;
  }
  
  private String b(int paramInt)
  {
    return "dzh:zhixun:" + paramInt;
  }
  
  public Fragment a()
  {
    return this.d;
  }
  
  public Fragment a(int paramInt)
  {
    MenuConfigVo.SecondMenuItem localSecondMenuItem = (MenuConfigVo.SecondMenuItem)mf.f(this.a).get(paramInt);
    int i = localSecondMenuItem.type;
    if (i == 8) {
      localObject1 = mn.a(localSecondMenuItem.name, true, DzhPushService.P);
    }
    Object localObject2;
    do
    {
      return (Fragment)localObject1;
      if (i == 9) {
        return mn.a(localSecondMenuItem.name, true, DzhPushService.Q);
      }
      if ((i != 4) && (i != 5)) {
        break;
      }
      localObject1 = r.a(localSecondMenuItem.urlPath, "");
      localObject2 = localObject1[1];
      Object localObject3 = localObject1[0];
      if (i == 5) {
        localObject1 = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector((String)localObject2);
      }
      for (;;)
      {
        localObject2 = new Fragment();
        if (!((String)localObject3).equals("0")) {
          break;
        }
        return (Fragment)localObject2;
        localObject1 = localObject2;
        if (i == 4)
        {
          localObject1 = localObject2;
          if (localSecondMenuItem.name.equals("新股")) {
            if (((String)localObject2).contains("?")) {
              localObject1 = (String)localObject2 + "&kjsg=1";
            } else {
              localObject1 = (String)localObject2 + "?kjsg=1";
            }
          }
        }
      }
      if (((String)localObject3).equals("1")) {
        return (Fragment)localObject2;
      }
      localObject2 = i.a((String)localObject1, localSecondMenuItem.name, null, 0, false);
      localObject1 = localObject2;
    } while (i != 5);
    ((i)localObject2).f = true;
    return (Fragment)localObject2;
    Object localObject1 = lp.a(i, localSecondMenuItem.urlPath, localSecondMenuItem.name, true);
    if (paramInt == 0) {
      paramInt = 120;
    }
    for (;;)
    {
      ((lp)localObject1).a(paramInt);
      return (Fragment)localObject1;
      if (paramInt == 1) {
        paramInt = 131;
      } else if (paramInt == 2) {
        paramInt = 132;
      } else if (paramInt == 3) {
        paramInt = 133;
      } else {
        paramInt = 0;
      }
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
    if (mf.f(this.a) == null) {
      return 0;
    }
    return mf.f(this.a).size();
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return ((MenuConfigVo.SecondMenuItem)mf.f(this.a).get(paramInt)).name;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.c == null) {
      this.c = this.b.a();
    }
    String str = b(paramInt);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */