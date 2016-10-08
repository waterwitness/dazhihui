package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.d.n;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.q;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.screen.a;
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
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

public class hw
  extends e
  implements q
{
  private View a;
  private String[] b;
  private TabPageIndicator c;
  private MyViewPager d;
  private ic e;
  private e[] f;
  private List<MenuConfigVo.SecondMenuItem> g;
  private ad h;
  private int i = 0;
  private MenuConfigVo.FirstMenuItem j;
  private int k = -1;
  private int l = 0;
  private Handler m = new hx(this);
  
  public static hw a(Bundle paramBundle)
  {
    hw localhw = new hw();
    localhw.setArguments(paramBundle);
    return localhw;
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
      int i1 = this.g.size();
      this.b = new String[i1];
      int n = 0;
      while (n < i1)
      {
        this.b[n] = ((MenuConfigVo.SecondMenuItem)this.g.get(n)).name;
        n += 1;
      }
      this.f = new e[this.b.length];
      n = 0;
      if (n < this.f.length)
      {
        if (this.f[n] == null)
        {
          if ((this.g == null) || (this.g.size() <= 0) || (n >= this.g.size()) || (this.g.get(n) == null)) {
            break label547;
          }
          MenuConfigVo.SecondMenuItem localSecondMenuItem = (MenuConfigVo.SecondMenuItem)this.g.get(n);
          this.f[n] = MarketManager.get().createFragmentByMarketType(localSecondMenuItem);
          if ((this.k == 0) && (n < 4)) {
            switch (n)
            {
            }
          }
        }
        for (;;)
        {
          n += 1;
          break;
          if ((this.f[n] instanceof l))
          {
            ((l)this.f[n]).f(116);
          }
          else if ((this.f[n] instanceof lp))
          {
            ((lp)this.f[n]).a(116);
            continue;
            if ((this.f[n] instanceof l))
            {
              ((l)this.f[n]).f(124);
            }
            else if ((this.f[n] instanceof lp))
            {
              ((lp)this.f[n]).a(124);
              continue;
              if ((this.f[n] instanceof l))
              {
                ((l)this.f[n]).f(125);
              }
              else if ((this.f[n] instanceof lp))
              {
                ((lp)this.f[n]).a(125);
                continue;
                if ((this.f[n] instanceof l))
                {
                  ((l)this.f[n]).f(126);
                }
                else if ((this.f[n] instanceof lp))
                {
                  ((lp)this.f[n]).a(126);
                  continue;
                  Log.e("GUH", "Market Config Menu ERROR");
                  this.f[n] = ao.a(null);
                }
              }
            }
          }
        }
      }
      if (this.e != null) {
        this.d.addOnPageChangeListener(new hy(this));
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
        n = 0;
        if ((n < this.g.size()) && (this.g.get(n) != null))
        {
          if ("2".equals(Integer.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(n)).menuflag))) {
            this.c.a(n, 2);
          }
          for (;;)
          {
            b(n);
            n += 1;
            break;
            if ("3".equals(Integer.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(n)).menuflag))) {
              if (!ah.c(15, MenuManager.getInstance().getVs() + ((MenuConfigVo.SecondMenuItem)this.g.get(n)).countid + ((MenuConfigVo.SecondMenuItem)this.g.get(n)).name)) {
                this.c.a(n, 3);
              } else {
                this.c.a(n);
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
  
  private void b(int paramInt)
  {
    if ((this.c == null) || (this.g == null)) {
      return;
    }
    String str = ((MenuConfigVo.SecondMenuItem)this.g.get(paramInt)).name;
    str = String.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(paramInt)).countid);
    if (this.j.fname.equals("股票")) {
      if (ah.f.containsKey(str)) {
        this.c.a(paramInt, 1);
      }
    }
    for (;;)
    {
      ((io)getParentFragment()).a();
      return;
      if (this.j.fname.equals("理财"))
      {
        if (ah.g.containsKey(str)) {
          this.c.a(paramInt, 1);
        }
      }
      else if ((this.j.fname.equals("新三板")) && (ah.h.containsKey(str))) {
        this.c.a(paramInt, 1);
      }
    }
  }
  
  private void c(int paramInt)
  {
    if ((this.c == null) || (this.g == null)) {}
    do
    {
      String str;
      RedPointVo localRedPointVo;
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                str = ((MenuConfigVo.SecondMenuItem)this.g.get(paramInt)).name;
                str = String.valueOf(((MenuConfigVo.SecondMenuItem)this.g.get(paramInt)).countid);
                if (!this.j.fname.equals("股票")) {
                  break;
                }
              } while (!ah.f.containsKey(str));
              this.c.a(paramInt);
              localSharedPreferences = getActivity().getSharedPreferences(DzhPushService.h, 0);
              if (ah.f.containsKey(str))
              {
                localRedPointVo = (RedPointVo)ah.f.get(str);
                if (localRedPointVo != null) {
                  localSharedPreferences.edit().putString(str, localRedPointVo.getVs()).commit();
                }
                ah.f.remove(str);
              }
            } while (!ah.f.isEmpty());
            ((io)getParentFragment()).a();
            return;
            if (!this.j.fname.equals("理财")) {
              break;
            }
          } while (!ah.g.containsKey(str));
          this.c.a(paramInt);
          localSharedPreferences = getActivity().getSharedPreferences(DzhPushService.h, 0);
          if (ah.g.containsKey(str))
          {
            localRedPointVo = (RedPointVo)ah.g.get(str);
            if (localRedPointVo != null) {
              localSharedPreferences.edit().putString(str, localRedPointVo.getVs()).commit();
            }
            ah.g.remove(str);
          }
        } while (!ah.g.isEmpty());
        ((io)getParentFragment()).a();
        return;
      } while ((!this.j.fname.equals("新三板")) || (!ah.h.containsKey(str)));
      this.c.a(paramInt);
      SharedPreferences localSharedPreferences = getActivity().getSharedPreferences(DzhPushService.h, 0);
      if (ah.h.containsKey(str))
      {
        localRedPointVo = (RedPointVo)ah.h.get(str);
        if (localRedPointVo != null) {
          localSharedPreferences.edit().putString(str, localRedPointVo.getVs()).commit();
        }
        ah.h.remove(str);
      }
    } while (!ah.h.isEmpty());
    ((io)getParentFragment()).a();
  }
  
  public void a(String paramString, int paramInt)
  {
    System.out.println("----onCallBackRedpoint name = " + paramString + " type = " + paramInt);
    if ((paramInt != ah.j) && (paramInt != ah.k) && (paramInt != ah.l)) {}
    for (;;)
    {
      return;
      paramInt = 0;
      while ((paramInt < this.g.size()) && (this.g.get(paramInt) != null))
      {
        b(paramInt);
        paramInt += 1;
      }
    }
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if ((this.d != null) && (this.f != null))
    {
      int n = this.d.getCurrentItem();
      if ((n >= 0) && (n < this.f.length)) {
        this.f[n].beforeHidden();
      }
    }
  }
  
  public void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null))
    {
      this.c.a();
      switch (ib.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      if ((this.d != null) && (this.f != null))
      {
        int n = this.d.getCurrentItem();
        if ((n >= 0) && (n < this.f.length))
        {
          this.f[n].changeLookFace(paramy);
          if (((this.f[n] instanceof a)) && (this.f[n].isVisible())) {
            ((a)this.f[n]).fragmentChanged(false);
          }
        }
      }
      return;
      this.mLookFace = com.android.dazhihui.ui.screen.y.a;
      if (this.a != null)
      {
        this.a.setBackgroundColor(getActivity().getResources().getColor(2131493540));
        continue;
        this.mLookFace = com.android.dazhihui.ui.screen.y.b;
        if (this.a != null) {
          this.a.setBackgroundColor(getActivity().getResources().getColor(2131493603));
        }
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.h = getChildFragmentManager();
    this.e = new ic(this, this.h);
    this.d.setAdapter(this.e);
    this.d.setOffscreenPageLimit(4);
    this.c.setViewPagerScrollSmooth(false);
    this.c.setViewPager(this.d);
    if (this.f == null) {
      a();
    }
    a(0);
    if (this.k == 0) {
      this.m.sendEmptyMessageDelayed(0, 5500L);
    }
    DzhPushService.a(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if (paramBundle != null)
    {
      this.k = paramBundle.getInt("FirstMenuItem", -1);
      paramBundle = MarketManager.get().getFirstMenuItemList();
      if ((paramBundle != null) && (this.k >= 0) && (this.k < paramBundle.size())) {
        this.j = ((MenuConfigVo.FirstMenuItem)paramBundle.get(this.k));
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), 2131296269)).inflate(2130903271, paramViewGroup, false);
    this.d = ((MyViewPager)this.a.findViewById(2131559820));
    this.c = ((TabPageIndicator)this.a.findViewById(2131559819));
    this.c.setTabDisplayNumber(5);
    changeLookFace(this.mLookFace);
    return this.a;
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
    if ((this.d != null) && (this.e != null) && (this.f != null))
    {
      int n = this.d.getCurrentItem();
      if ((n >= 0) && (n < this.f.length))
      {
        locale = this.f[n];
        if (!(locale instanceof sk)) {
          break label68;
        }
        ((sk)locale).b();
      }
    }
    label68:
    do
    {
      return;
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
    if ((this.d != null) && (this.f != null))
    {
      int n = this.d.getCurrentItem();
      if ((n >= 0) && (n < this.f.length))
      {
        this.f[n].show();
        a(n);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */