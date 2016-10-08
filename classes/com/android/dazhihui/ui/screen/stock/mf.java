package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.df;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.d.n;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.q;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.NewsTabPageIndicator;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;
import java.util.Map;

public class mf
  extends e
  implements q
{
  private NewsTabPageIndicator a;
  private MyViewPager b;
  private View c;
  private List<MenuConfigVo.FirstMenuItem> d;
  private List<MenuConfigVo.SecondMenuItem> e;
  private int f = 0;
  private PageLoadTip g;
  private DzhMainHeader h;
  private df i = new mj(this);
  
  private void c()
  {
    if (this.f != this.b.getCurrentItem()) {
      this.a.setCurrentItem(this.f);
    }
    if ((this.e != null) && (this.e.size() != 0)) {
      n.a("", ((MenuConfigVo.SecondMenuItem)this.e.get(this.b.getCurrentItem())).countid);
    }
    a(this.e);
    changeLookFace(this.mLookFace);
  }
  
  private void d()
  {
    this.a = ((NewsTabPageIndicator)this.c.findViewById(2131558856));
    this.a.setTabDisplayNumber(5);
    this.b = ((MyViewPager)this.c.findViewById(2131559648));
    mm localmm = new mm(this, getChildFragmentManager());
    this.b.setAdapter(localmm);
    this.a.setViewPager(this.b);
    this.a.setChangeSelectedTextSize(false);
    this.a.setOnPageChangeListener(this.i);
    this.a.setOnTabReselectedListener(new mi(this));
  }
  
  public void a()
  {
    Fragment localFragment = ((mm)this.b.getAdapter()).a();
    if (localFragment != null)
    {
      if (!(localFragment instanceof lp)) {
        break label34;
      }
      ((lp)localFragment).b(true);
    }
    label34:
    do
    {
      return;
      if ((localFragment instanceof i))
      {
        ((i)localFragment).c(true);
        return;
      }
    } while (!(localFragment instanceof mn));
    ((mn)localFragment).a(true);
  }
  
  public void a(String paramString, int paramInt)
  {
    if (paramInt == ah.m) {
      a(this.e);
    }
  }
  
  public void a(List<MenuConfigVo.SecondMenuItem> paramList)
  {
    if ((this.h == null) || (paramList == null)) {
      return;
    }
    int j = 0;
    if (j < paramList.size())
    {
      int k = ((MenuConfigVo.SecondMenuItem)paramList.get(j)).countid;
      if (ah.d.containsKey(String.valueOf(k))) {
        this.a.a(j, 1);
      }
      for (;;)
      {
        j += 1;
        break;
        this.a.a(j, 0);
      }
    }
    ah.a().b(10003);
  }
  
  public void b()
  {
    if ((this.b == null) || (this.b.getAdapter() == null) || (getActivity() == null) || (getActivity().isFinishing())) {}
    Fragment localFragment;
    do
    {
      do
      {
        return;
        localFragment = ((mm)this.b.getAdapter()).a();
      } while (localFragment == null);
      if ((localFragment instanceof i))
      {
        ((i)localFragment).refresh();
        return;
      }
    } while (!(localFragment instanceof lp));
    ((lp)localFragment).refresh();
  }
  
  public void beforeHidden()
  {
    if (this.b == null) {
      return;
    }
    Fragment localFragment = ((mm)this.b.getAdapter()).a();
    if ((localFragment != null) && ((localFragment instanceof e))) {
      ((e)localFragment).beforeHidden();
    }
    if (this.h != null) {
      this.h.f();
    }
    super.beforeHidden();
  }
  
  public void changeLookFace(y paramy)
  {
    this.h.a();
    this.a.a();
    if ((this.b != null) && (this.b.getAdapter() != null) && ((this.b.getAdapter() instanceof mm)))
    {
      paramy = ((mm)this.b.getAdapter()).a();
      if ((paramy != null) && ((paramy instanceof a)) && (paramy.isVisible())) {
        ((a)paramy).fragmentChanged(false);
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    DzhPushService.a(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.d = MenuManager.getInstance().getNewsMenu();
    if ((this.d != null) && (this.d.size() > 0)) {
      this.e = ((MenuConfigVo.FirstMenuItem)this.d.get(0)).subnames;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 2131296296)).inflate(2130903238, paramViewGroup, false);
    this.g = ((PageLoadTip)this.c.findViewById(2131558569));
    this.h = ((DzhMainHeader)this.c.findViewById(2131559251));
    this.h.a(getActivity(), 3, null);
    this.h.e();
    d();
    if (this.e == null)
    {
      this.a.setVisibility(4);
      this.g.a("数据读取失败,点击重试!", new mg(this));
    }
    for (;;)
    {
      return this.c;
      c();
    }
  }
  
  public void onDestroyView()
  {
    DzhPushService.b(this);
    super.onDestroyView();
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if (this.b != null)
    {
      if ((paramInt1 == -1) || (paramInt2 == -1)) {
        return;
      }
      try
      {
        if ((paramInt1 == this.b.getCurrentItem()) && (this.e != null) && (this.e.size() != 0)) {
          n.a("", ((MenuConfigVo.SecondMenuItem)this.e.get(paramInt1)).countid);
        }
        this.a.setCurrentItem(paramInt1);
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
    }
    this.f = paramInt1;
  }
  
  public void show()
  {
    if (this.b == null) {}
    do
    {
      return;
      Fragment localFragment = ((mm)this.b.getAdapter()).a();
      if ((localFragment != null) && ((localFragment instanceof e)))
      {
        ((e)localFragment).show();
        if ((this.b.getCurrentItem() >= 0) && (this.e != null) && (this.e.size() != 0)) {
          n.a("", ((MenuConfigVo.SecondMenuItem)this.e.get(this.b.getCurrentItem())).countid);
        }
      }
      super.show();
    } while (this.h == null);
    this.h.a();
    this.h.e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */