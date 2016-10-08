package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.dazhihui.d.n;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.q;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.a.aa;
import com.android.dazhihui.ui.screen.stock.a.ab;
import com.android.dazhihui.ui.screen.stock.a.af;
import com.android.dazhihui.ui.screen.stock.a.ao;
import com.android.dazhihui.ui.screen.stock.a.au;
import com.android.dazhihui.ui.screen.stock.a.az;
import com.android.dazhihui.ui.screen.stock.a.bb;
import com.android.dazhihui.ui.screen.stock.a.l;
import com.android.dazhihui.ui.screen.stock.a.x;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.TabPageIndicator;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;

public class xe
  extends e
  implements q
{
  private View a;
  private String[] b;
  private TabPageIndicator c;
  private MyViewPager d;
  private xk e;
  private e[] f;
  private List<MenuConfigVo.SecondMenuItem> g;
  private ad h;
  private int i = 0;
  private MenuConfigVo.FirstMenuItem j;
  private int k = -1;
  private int l = 0;
  private LinearLayout m;
  private LinearLayout n;
  
  public static xe a(Bundle paramBundle)
  {
    xe localxe = new xe();
    localxe.setArguments(paramBundle);
    return localxe;
  }
  
  private void a()
  {
    if (((this.h != null) && (this.h.e())) || (getActivity() == null) || (getActivity().isFinishing())) {}
    label547:
    do
    {
      do
      {
        return;
      } while ((this.j == null) || (this.j.subnames == null) || (this.j.subnames.size() <= 0));
      if ((this.f != null) && (this.h != null) && (this.e != null)) {
        this.e.a();
      }
      this.g = this.j.subnames;
      int i2 = this.g.size();
      this.b = new String[i2];
      int i1 = 0;
      while (i1 < i2)
      {
        this.b[i1] = ((MenuConfigVo.SecondMenuItem)this.g.get(i1)).name;
        i1 += 1;
      }
      this.f = new e[this.b.length];
      i1 = 0;
      if (i1 < this.f.length)
      {
        if (this.f[i1] == null)
        {
          if ((this.g == null) || (this.g.size() <= 0) || (i1 >= this.g.size()) || (this.g.get(i1) == null)) {
            break label547;
          }
          MenuConfigVo.SecondMenuItem localSecondMenuItem = (MenuConfigVo.SecondMenuItem)this.g.get(i1);
          this.f[i1] = MarketManager.get().createFragmentByMarketType(localSecondMenuItem);
          if ((this.k == 0) && (i1 < 4)) {
            switch (i1)
            {
            }
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          if ((this.f[i1] instanceof l))
          {
            ((l)this.f[i1]).f(116);
          }
          else if ((this.f[i1] instanceof lp))
          {
            ((lp)this.f[i1]).a(116);
            continue;
            if ((this.f[i1] instanceof l))
            {
              ((l)this.f[i1]).f(124);
            }
            else if ((this.f[i1] instanceof lp))
            {
              ((lp)this.f[i1]).a(124);
              continue;
              if ((this.f[i1] instanceof l))
              {
                ((l)this.f[i1]).f(125);
              }
              else if ((this.f[i1] instanceof lp))
              {
                ((lp)this.f[i1]).a(125);
                continue;
                if ((this.f[i1] instanceof l))
                {
                  ((l)this.f[i1]).f(126);
                }
                else if ((this.f[i1] instanceof lp))
                {
                  ((lp)this.f[i1]).a(126);
                  continue;
                  Log.e("GUH", "Market Config Menu ERROR");
                  this.f[i1] = ao.a(null);
                }
              }
            }
          }
        }
      }
      if (this.e != null) {
        this.d.addOnPageChangeListener(new xg(this));
      }
      if (this.e != null) {
        this.e.notifyDataSetChanged();
      }
      this.d.requestLayout();
      this.d.postInvalidate();
      if (this.c != null) {
        this.c.c();
      }
      if ((this.g != null) && (this.c != null))
      {
        i1 = 0;
        if ((i1 < this.g.size()) && (this.g.get(i1) != null))
        {
          if ("2".equals(Integer.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(i1)).menuflag))) {
            this.c.a(i1, 2);
          }
          for (;;)
          {
            i1 += 1;
            break;
            if ("3".equals(Integer.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(i1)).menuflag))) {
              if (!ah.c(15, MenuManager.getInstance().getVs() + ((MenuConfigVo.SecondMenuItem)this.g.get(i1)).countid + ((MenuConfigVo.SecondMenuItem)this.g.get(i1)).name)) {
                this.c.a(i1, 3);
              } else {
                this.c.a(i1);
              }
            }
          }
        }
      }
    } while ((this.i == this.d.getCurrentItem()) || (this.f == null) || (this.i < 0) || (this.i >= this.f.length));
    this.d.setCurrentItem(this.i, false);
  }
  
  private void a(int paramInt)
  {
    if ((this.f == null) || (paramInt < 0) || (paramInt >= this.f.length)) {}
    do
    {
      return;
      if ((this.f[paramInt] instanceof aa))
      {
        n.a("", 1246);
        return;
      }
      if ((this.f[paramInt] instanceof az))
      {
        n.a("", 1384);
        return;
      }
      if ((this.f[paramInt] instanceof au))
      {
        n.a("", 1250);
        return;
      }
      if ((this.f[paramInt] instanceof x))
      {
        n.a("", 1249);
        return;
      }
      if ((this.f[paramInt] instanceof af))
      {
        n.a("", 20000);
        return;
      }
      if ((this.f[paramInt] instanceof bb))
      {
        n.a("", 1248);
        return;
      }
      if ((this.f[paramInt] instanceof com.android.dazhihui.ui.screen.stock.a.y))
      {
        n.a("", 1247);
        return;
      }
      if ((this.f[paramInt] instanceof ab))
      {
        n.a("", 1246);
        return;
      }
    } while ((this.g == null) || (paramInt >= this.g.size()) || (this.g.get(paramInt) == null));
    n.a("", ((MenuConfigVo.SecondMenuItem)this.g.get(paramInt)).countid);
  }
  
  public void a(String paramString, int paramInt) {}
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if ((this.d != null) && (this.f != null))
    {
      int i1 = this.d.getCurrentItem();
      if ((i1 >= 0) && (i1 < this.f.length)) {
        this.f[i1].beforeHidden();
      }
    }
  }
  
  public void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null))
    {
      this.c.a();
      switch (xj.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      if ((this.d != null) && (this.f != null))
      {
        int i1 = this.d.getCurrentItem();
        if ((i1 >= 0) && (i1 < this.f.length))
        {
          this.f[i1].changeLookFace(paramy);
          if (((this.f[i1] instanceof com.android.dazhihui.ui.screen.a)) && (this.f[i1].isVisible())) {
            ((com.android.dazhihui.ui.screen.a)this.f[i1]).fragmentChanged(false);
          }
        }
      }
      return;
      this.mLookFace = com.android.dazhihui.ui.screen.y.a;
      if (this.d != null)
      {
        this.d.setBackgroundColor(getActivity().getResources().getColor(2131493540));
        continue;
        this.mLookFace = com.android.dazhihui.ui.screen.y.b;
        if (this.d != null) {
          this.d.setBackgroundColor(getActivity().getResources().getColor(2131493603));
        }
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.h = getChildFragmentManager();
    this.e = new xk(this, this.h);
    this.d.setAdapter(this.e);
    this.d.setOffscreenPageLimit(4);
    this.c.setViewPagerScrollSmooth(false);
    this.c.setViewPager(this.d);
    if (this.f == null) {
      a();
    }
    a(0);
    DzhPushService.a(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if (paramBundle != null)
    {
      this.k = paramBundle.getInt("FirstMenuItem", -1);
      paramBundle = MenuManager.getInstance().getTradeMenu();
      if ((paramBundle != null) && (this.k >= 0) && (this.k < paramBundle.size())) {
        this.j = ((MenuConfigVo.FirstMenuItem)paramBundle.get(this.k));
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 2131296269)).inflate(2130903502, paramViewGroup, false);
    this.d = ((MyViewPager)this.a.findViewById(2131559820));
    this.c = ((TabPageIndicator)this.a.findViewById(2131559819));
    this.c.setIsOnlyShowWhite(true);
    this.c.b();
    this.c.setTabDisplayNumber(5);
    this.n = ((LinearLayout)this.a.findViewById(2131560859));
    this.m = ((LinearLayout)this.a.findViewById(2131560860));
    this.m.setOnClickListener(new xf(this));
    if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0)) {
      this.n.setVisibility(8);
    }
    for (;;)
    {
      changeLookFace(this.mLookFace);
      return this.a;
      this.n.setVisibility(8);
    }
  }
  
  public void onDestroyView()
  {
    DzhPushService.b(this);
    super.onDestroyView();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    super.refresh();
    e locale;
    if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0))
    {
      this.n.setVisibility(8);
      if ((this.d != null) && (this.e != null) && (this.f != null))
      {
        int i1 = this.d.getCurrentItem();
        if ((i1 >= 0) && (i1 < this.f.length))
        {
          locale = this.f[i1];
          if (!(locale instanceof sk)) {
            break label102;
          }
          ((sk)locale).b();
        }
      }
    }
    label102:
    do
    {
      return;
      this.n.setVisibility(8);
      break;
      if ((locale instanceof l))
      {
        ((l)locale).a(false);
        return;
      }
    } while (!(locale instanceof e));
    locale.refresh();
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if (paramInt1 > -1)
    {
      this.i = paramInt1;
      if (this.c != null) {
        this.c.setCurrentItem(paramInt1);
      }
    }
  }
  
  public void show()
  {
    super.show();
    if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0)) {
      this.n.setVisibility(8);
    }
    for (;;)
    {
      if ((this.d != null) && (this.f != null))
      {
        int i1 = this.d.getCurrentItem();
        if ((i1 >= 0) && (i1 < this.f.length))
        {
          this.f[i1].show();
          a(i1);
        }
      }
      return;
      this.n.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */