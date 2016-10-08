package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.q;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.screen.hk.HKTradeMenu;
import com.android.dazhihui.ui.delegate.screen.hk.bb;
import com.android.dazhihui.ui.delegate.screen.margin.bi;
import com.android.dazhihui.ui.delegate.screen.xc.trade.bw;
import com.android.dazhihui.ui.delegate.view.TradeHeader;
import com.android.dazhihui.ui.model.stock.LeftMenuConfigManager;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.Header;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalDetailActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalMine;
import com.android.dazhihui.ui.screen.stock.xe;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.MyRadioButton;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.dd;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gc
  extends com.android.dazhihui.ui.screen.a
  implements q, com.android.dazhihui.ui.a.g, com.android.dazhihui.ui.delegate.r, com.android.dazhihui.ui.delegate.view.n, com.android.dazhihui.ui.delegate.view.o, dd
{
  public static int b = 0;
  View a;
  Dialog c;
  private int d = -1;
  private int e = -1;
  private List<MenuConfigVo.FirstMenuItem> f;
  private int g = 0;
  private TradeHeader h;
  private DzhMainHeader i;
  private ad j;
  private com.android.dazhihui.ui.screen.e k;
  private Bundle l;
  private int m;
  private boolean n;
  private boolean o = false;
  private boolean p = false;
  private boolean q = false;
  private String r;
  
  private com.android.dazhihui.ui.screen.e a(ad paramad, int paramInt)
  {
    paramInt = c(paramInt);
    com.android.dazhihui.ui.screen.e locale = (com.android.dazhihui.ui.screen.e)paramad.a(String.valueOf(paramInt));
    paramad = locale;
    if (locale == null) {
      paramad = b(paramInt);
    }
    return paramad;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    com.android.dazhihui.ui.screen.e locale1 = this.k;
    if (this.j == null) {}
    com.android.dazhihui.ui.screen.e locale2;
    do
    {
      return;
      locale2 = a(this.j, paramInt);
    } while (locale2 == null);
    this.k = locale2;
    at localat;
    if ((this.k instanceof bw))
    {
      this.i.b();
      this.i.setDoRefresh((bw)this.k);
      localat = this.j.a();
      if (paramBoolean)
      {
        if (this.d <= paramInt) {
          break label258;
        }
        localat.a(2130968632, 2130968633);
      }
      label97:
      if (locale1 != null)
      {
        locale1.beforeHidden();
        localat.b(locale1);
      }
      if (locale2.isAdded()) {
        break label271;
      }
      localat.a(2131560905, locale2, String.valueOf(c(paramInt)));
    }
    for (;;)
    {
      this.d = paramInt;
      localat.b();
      return;
      if ((this.k instanceof bi))
      {
        this.i.b();
        this.i.setDoRefresh((bi)this.k);
        break;
      }
      if ((this.k instanceof bb))
      {
        this.i.b();
        this.i.setDoRefresh((bb)this.k);
        break;
      }
      if (((this.k instanceof x)) || ((this.k instanceof HKTradeMenu)))
      {
        this.i.d();
        break;
      }
      this.i.c();
      break;
      label258:
      localat.a(2130968628, 2130968629);
      break label97;
      label271:
      localat.c(locale2);
      locale2.show();
    }
  }
  
  private void a(String paramString)
  {
    Log.d("trade", "reLoginSetDelegateDispatch:qsnamestr=" + paramString);
    if ((paramString == null) || (paramString.equals(""))) {}
    label360:
    for (;;)
    {
      return;
      int i2 = com.android.dazhihui.ui.a.e.a().j();
      if (com.android.dazhihui.c.a.a.i != null)
      {
        int i1 = 0;
        for (;;)
        {
          if (i1 >= com.android.dazhihui.c.a.a.i.length) {
            break label360;
          }
          if (com.android.dazhihui.c.a.a.i[i1][2].equals(paramString))
          {
            com.android.dazhihui.ui.a.e.a().a(i1);
            if ((i2 != -1) && (i2 == i1))
            {
              if (com.android.dazhihui.g.a().H() != null)
              {
                k();
                return;
              }
              if ((com.android.dazhihui.ui.delegate.b.o.l()) || (com.android.dazhihui.ui.delegate.b.o.m()))
              {
                k();
                return;
              }
              if (!TextUtils.isEmpty(com.android.dazhihui.c.a.a.B[i2][0]))
              {
                i1 = com.android.dazhihui.ui.a.e.a().j();
                com.android.dazhihui.g.a().a(com.android.dazhihui.c.a.a.B[i1], com.android.dazhihui.c.a.a.K[i1], null);
                l().show();
                com.android.dazhihui.ui.a.e.a().a(this);
                return;
              }
              paramString = com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.D[i2], null);
              if (TextUtils.isEmpty(paramString)) {
                break;
              }
              paramString = com.android.dazhihui.d.n.d(paramString);
              com.android.dazhihui.a.g.a().d(false);
              com.android.dazhihui.g.a().f(paramString[0]);
              com.android.dazhihui.g.a().h(Integer.parseInt(paramString[1]));
              k();
              return;
            }
            i1 = com.android.dazhihui.ui.a.e.a().j();
            if (!TextUtils.isEmpty(com.android.dazhihui.c.a.a.B[i1][0]))
            {
              com.android.dazhihui.g.a().a(com.android.dazhihui.c.a.a.B[i1], com.android.dazhihui.c.a.a.K[i1], null);
              l().show();
              com.android.dazhihui.ui.a.e.a().a(this);
              return;
            }
            if ((com.android.dazhihui.ui.delegate.b.o.l()) || (com.android.dazhihui.ui.delegate.b.o.m()))
            {
              k();
              return;
            }
            paramString = com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.D[i1], null);
            if (TextUtils.isEmpty(paramString)) {
              break;
            }
            paramString = com.android.dazhihui.d.n.d(paramString);
            com.android.dazhihui.a.g.a().d(false);
            com.android.dazhihui.g.a().f(paramString[0]);
            com.android.dazhihui.g.a().h(Integer.parseInt(paramString[1]));
            k();
            return;
          }
          i1 += 1;
        }
      }
    }
  }
  
  private com.android.dazhihui.ui.screen.e b(int paramInt)
  {
    MenuConfigVo.FirstMenuItem localFirstMenuItem = (MenuConfigVo.FirstMenuItem)this.f.get(this.g);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (localFirstMenuItem.id == paramInt) {
      if ((localFirstMenuItem.type == 4) || (localFirstMenuItem.type == 5))
      {
        localObject1 = com.android.dazhihui.d.r.a(localFirstMenuItem.urlPath, "");
        localObject2 = localObject1[1];
        localObject3 = localObject1[0];
        localObject1 = localObject2;
        if (localFirstMenuItem.type == 5) {
          localObject1 = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector((String)localObject2);
        }
        localObject2 = new com.android.dazhihui.ui.screen.a();
        if (((String)localObject3).equals("0")) {
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      switch (paramInt)
      {
      case 2: 
      case 3: 
      case 4: 
      case 8: 
      case 9: 
      case 10: 
      default: 
        return (com.android.dazhihui.ui.screen.e)localObject1;
        if (((String)localObject3).equals("1"))
        {
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = i.a((String)localObject1, localFirstMenuItem.fname, null, 0, false);
          if (localFirstMenuItem.type == 5) {
            ((i)localObject1).f = true;
          }
          continue;
          if (localFirstMenuItem.type == 1) {
            localObject1 = lp.a(1, localFirstMenuItem.urlPath, localFirstMenuItem.fname, true);
          } else {
            localObject1 = new com.android.dazhihui.ui.screen.a();
          }
        }
        break;
      case 6: 
        return new dy();
      case 7: 
        return new fi();
      case 1: 
        return new x();
      case 11: 
        return new bw();
      case 12: 
        return new bi();
      case 5: 
        return new bb();
      case 13: 
        localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("FirstMenuItem", this.g);
        return xe.a((Bundle)localObject1);
        localObject1 = null;
      }
    }
  }
  
  private int c(int paramInt)
  {
    int i1;
    if (paramInt == 1) {
      if (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.v) {
        if ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (com.android.dazhihui.ui.delegate.b.o.k()) || (com.android.dazhihui.ui.delegate.b.o.l()) || (com.android.dazhihui.ui.delegate.b.o.m()) || (com.android.dazhihui.ui.delegate.b.o.i())) {
          i1 = 11;
        }
      }
    }
    do
    {
      do
      {
        do
        {
          return i1;
          return 1;
          if (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w) {
            return 12;
          }
          i1 = paramInt;
        } while (com.android.dazhihui.ui.delegate.b.o.y != com.android.dazhihui.ui.delegate.b.o.x);
        return 5;
        i1 = paramInt;
      } while (paramInt != 0);
      MenuConfigVo.FirstMenuItem localFirstMenuItem = (MenuConfigVo.FirstMenuItem)this.f.get(this.g);
      if ((localFirstMenuItem.type == 7) && (localFirstMenuItem.id == 22)) {
        return 6;
      }
      if ((localFirstMenuItem.type == 7) && (localFirstMenuItem.id == 23)) {
        return 7;
      }
      i1 = paramInt;
    } while (this.k == null);
    this.k.show();
    return paramInt;
  }
  
  private void d(int paramInt)
  {
    getActivity().getSharedPreferences("TradeTabLastTimeIndex", 0).edit().putInt("lastTimeIndex", paramInt).commit();
  }
  
  private void i()
  {
    this.i = this.h.getTradeLoginChildPapeIndicator();
    this.i.setOnCheckedChangeListener(this);
    this.i.e();
  }
  
  private void j()
  {
    if ((this.e != -1) && (this.e != 0))
    {
      a(this.e, false);
      this.e = -1;
      return;
    }
    if ((this.g < 0) || (this.g >= this.f.size())) {
      this.g = 0;
    }
    Object localObject = (MenuConfigVo.FirstMenuItem)this.f.get(this.g);
    if ((((MenuConfigVo.FirstMenuItem)localObject).type == 7) && (((MenuConfigVo.FirstMenuItem)localObject).id == 22))
    {
      if ((com.android.dazhihui.ui.delegate.b.o.r()) && ((com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.w) || (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.v)))
      {
        a(1, false);
        return;
      }
      a(false, false);
      return;
    }
    if ((((MenuConfigVo.FirstMenuItem)localObject).type == 7) && (((MenuConfigVo.FirstMenuItem)localObject).id == 23))
    {
      if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.x))
      {
        a(1, false);
        return;
      }
      a(true, false);
      return;
    }
    boolean bool;
    if ((((MenuConfigVo.FirstMenuItem)localObject).type == 0) && (((MenuConfigVo.FirstMenuItem)localObject).id == 168))
    {
      Bundle localBundle = com.android.dazhihui.ui.a.e.a().b();
      localObject = null;
      if (localBundle == null) {
        break label374;
      }
      bool = localBundle.getBoolean("fromBrokerList");
      localObject = localBundle.getString("gotoFlag");
    }
    for (;;)
    {
      if (bool)
      {
        a(true, false);
        return;
      }
      if ((localObject != null) && (!com.android.dazhihui.ui.delegate.b.o.r()))
      {
        int i1 = 0;
        while (i1 < this.f.size())
        {
          if ((((MenuConfigVo.FirstMenuItem)this.f.get(i1)).type == 7) && (((MenuConfigVo.FirstMenuItem)this.f.get(i1)).id == 22))
          {
            this.g = i1;
            d(this.g);
          }
          i1 += 1;
        }
        if (this.i.getCurrentPostion() == this.g) {
          break;
        }
        this.i.a(this.g, 0);
        return;
      }
      a(13, false);
      return;
      if (this.k == null) {
        break;
      }
      this.k.show();
      return;
      label374:
      bool = false;
    }
  }
  
  private void k()
  {
    Object localObject = com.android.dazhihui.ui.delegate.a.a().b();
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        c localc = (c)((Iterator)localObject).next();
        if ((localc.c().equals(com.android.dazhihui.ui.delegate.a.a().e())) && (localc.d().equals(com.android.dazhihui.ui.delegate.a.a().f())))
        {
          l().show();
          com.android.dazhihui.ui.delegate.a.a().a(this, localc, false);
        }
      }
    }
  }
  
  private Dialog l()
  {
    if (this.c == null)
    {
      this.c = new Dialog(getActivity(), 16974132);
      this.c.setContentView(2130903530);
      this.c.getWindow().getAttributes().gravity = 17;
      this.c.setCancelable(false);
    }
    return this.c;
  }
  
  private void m()
  {
    int i2 = 0;
    this.f = MenuManager.getInstance().getTradeMenu();
    if ((this.f == null) || (this.f.size() < 1))
    {
      this.f = new ArrayList();
      localObject = new MenuConfigVo.FirstMenuItem();
      ((MenuConfigVo.FirstMenuItem)localObject).fname = "A股";
      ((MenuConfigVo.FirstMenuItem)localObject).id = 22;
      ((MenuConfigVo.FirstMenuItem)localObject).type = 7;
      ((MenuConfigVo.FirstMenuItem)localObject).menuflag = 1;
      this.f.add(localObject);
      localObject = new MenuConfigVo.FirstMenuItem();
      ((MenuConfigVo.FirstMenuItem)localObject).fname = "港美";
      ((MenuConfigVo.FirstMenuItem)localObject).id = 23;
      ((MenuConfigVo.FirstMenuItem)localObject).type = 7;
      ((MenuConfigVo.FirstMenuItem)localObject).menuflag = 1;
      this.f.add(localObject);
    }
    Object localObject = new ArrayList();
    int i1 = 0;
    while (i1 < this.f.size())
    {
      ((List)localObject).add(((MenuConfigVo.FirstMenuItem)this.f.get(i1)).fname);
      i1 += 1;
    }
    Bundle localBundle = getBundle();
    if (localBundle != null) {}
    for (i1 = localBundle.getInt("fragment_sub_index", 0);; i1 = 0)
    {
      if ((i1 > 0) && (i1 <= this.f.size()))
      {
        this.g = (i1 - 1);
        if (this.i != null)
        {
          this.i.a(getActivity(), 4, (List)localObject);
          a(this.f);
          this.o = true;
          this.i.a(this.g, -1);
        }
        return;
      }
      boolean bool = getActivity().getSharedPreferences("FirstInTradeIsUpdateApp", 0).getBoolean("isUpdateApp", false);
      getActivity().getSharedPreferences("FirstInTradeIsUpdateApp", 0).edit().putBoolean("isUpdateApp", false).commit();
      if (LeftMenuConfigManager.getInstace().getLeftMenuHeader() != null) {}
      for (i1 = LeftMenuConfigManager.getInstace().getLeftMenuHeader().isTable;; i1 = 0)
      {
        if ((i1 > 0) && (i1 <= this.f.size()))
        {
          this.g = (i1 - 1);
          break;
        }
        if (bool)
        {
          i1 = i2;
          for (;;)
          {
            if (i1 >= this.f.size()) {
              break label446;
            }
            if ((((MenuConfigVo.FirstMenuItem)this.f.get(i1)).type == 7) && (((MenuConfigVo.FirstMenuItem)this.f.get(i1)).id == 22))
            {
              this.g = i1;
              break;
            }
            i1 += 1;
          }
          label446:
          break;
        }
        this.g = q();
        if (this.g < this.f.size()) {
          break;
        }
        this.g = 0;
        break;
      }
    }
  }
  
  private void n()
  {
    if ((this.f != null) && (this.f.size() != 0))
    {
      int i1 = 0;
      if (i1 < this.f.size())
      {
        com.android.dazhihui.ui.screen.e locale = a(this.j, ((MenuConfigVo.FirstMenuItem)this.f.get(i1)).id);
        if (locale != null)
        {
          if (!(locale instanceof lp)) {
            break label85;
          }
          ((lp)locale).b(true);
        }
        for (;;)
        {
          i1 += 1;
          break;
          label85:
          if ((locale instanceof i)) {
            ((i)locale).c(true);
          }
        }
      }
    }
  }
  
  private void o()
  {
    int i1 = Integer.parseInt(getActivity().getSharedPreferences("NoticeListRefreshTime", 0).getString("NoticeListRefreshTime", "0"));
    int i2 = m.a().p() * 10000 + m.a().n() * 100 + m.a().o();
    if ((com.android.dazhihui.c.a.a.N == null) || (i2 > i1)) {
      com.android.dazhihui.ui.a.e.a().b(new gh(this, this, i2));
    }
  }
  
  private void p()
  {
    int i1 = Integer.parseInt(getActivity().getSharedPreferences("BrokerListRefreshTime", 0).getString("BrokerListRefreshTime", "0"));
    int i2 = m.a().p() * 10000 + m.a().n() * 100 + m.a().o();
    if ((com.android.dazhihui.c.a.a.K == null) || (i2 > i1)) {
      com.android.dazhihui.ui.a.e.a().a(new gi(this, this, i2));
    }
  }
  
  private int q()
  {
    return getActivity().getSharedPreferences("TradeTabLastTimeIndex", 0).getInt("lastTimeIndex", 0);
  }
  
  public void a()
  {
    if (isAdded()) {
      k();
    }
  }
  
  public void a(CompoundButton paramCompoundButton, int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      if ((this.f != null) && (this.f.size() != 0)) {
        com.android.dazhihui.d.n.a("", ((MenuConfigVo.FirstMenuItem)this.f.get(paramInt)).countid);
      }
      paramCompoundButton = String.valueOf(((MenuConfigVo.FirstMenuItem)this.f.get(paramInt)).countid);
      if ((!ah.i.containsKey(paramCompoundButton)) || (this.o)) {
        break label316;
      }
      localObject1 = getActivity().getSharedPreferences(DzhPushService.h, 0);
      localObject2 = (RedPointVo)ah.i.get(paramCompoundButton);
      if (localObject2 != null) {
        ((SharedPreferences)localObject1).edit().putString(paramCompoundButton, ((RedPointVo)localObject2).getVs()).commit();
      }
      ah.i.remove(paramCompoundButton);
      a(this.f);
    }
    for (;;)
    {
      int i1 = ((MenuConfigVo.FirstMenuItem)this.f.get(paramInt)).type;
      if ((i1 != 4) && (i1 != 5)) {
        break label465;
      }
      paramCompoundButton = com.android.dazhihui.d.r.a(((MenuConfigVo.FirstMenuItem)this.f.get(paramInt)).urlPath, "");
      localObject1 = paramCompoundButton[1];
      localObject2 = paramCompoundButton[0];
      paramCompoundButton = (CompoundButton)localObject1;
      if (i1 == 5) {
        paramCompoundButton = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector((String)localObject1);
      }
      if (!((String)localObject2).equals("0")) {
        break;
      }
      localObject1 = new Intent(getActivity(), BrowserActivity.class);
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("nexturl", paramCompoundButton);
      ((Intent)localObject1).putExtras((Bundle)localObject2);
      startActivity((Intent)localObject1);
      this.i.postDelayed(new gf(this), 500L);
      return;
      label316:
      this.o = false;
    }
    if (((String)localObject2).equals("1"))
    {
      localObject1 = new Intent();
      ((Intent)localObject1).setAction("android.intent.action.VIEW");
      ((Intent)localObject1).setData(Uri.parse(paramCompoundButton));
      startActivity((Intent)localObject1);
      this.i.postDelayed(new gg(this), 500L);
      return;
    }
    this.g = paramInt;
    d(this.g);
    for (;;)
    {
      paramCompoundButton = (MenuConfigVo.FirstMenuItem)this.f.get(paramInt);
      if ((paramCompoundButton.type != 7) || (paramCompoundButton.id != 22)) {
        break label488;
      }
      if ((!com.android.dazhihui.ui.delegate.b.o.r()) || ((com.android.dazhihui.ui.delegate.b.o.y != com.android.dazhihui.ui.delegate.b.o.w) && (com.android.dazhihui.ui.delegate.b.o.y != com.android.dazhihui.ui.delegate.b.o.v))) {
        break;
      }
      a(1, false);
      return;
      label465:
      this.g = paramInt;
      d(this.g);
    }
    a(false, true);
    return;
    label488:
    if ((paramCompoundButton.type == 7) && (paramCompoundButton.id == 23))
    {
      if ((com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.y == com.android.dazhihui.ui.delegate.b.o.x))
      {
        a(1, false);
        return;
      }
      a(true, true);
      return;
    }
    if ((paramCompoundButton.type == 0) && (paramCompoundButton.id == 168))
    {
      a(13, false);
      return;
    }
    a(paramCompoundButton.id, false);
  }
  
  public void a(String paramString, int paramInt)
  {
    if (paramInt == ah.n) {
      a(this.f);
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3))) {}
    while (com.android.dazhihui.ui.delegate.b.o.a(paramString1, "", getActivity(), true)) {
      return;
    }
    com.android.dazhihui.ui.delegate.a.a().a("");
    com.android.dazhihui.ui.delegate.a.a().b("");
    com.android.dazhihui.ui.delegate.a.a().c("");
    if (paramString1 != null) {
      com.android.dazhihui.ui.delegate.a.a().a(paramString1);
    }
    if (paramString2 != null) {
      com.android.dazhihui.ui.delegate.a.a().b(paramString2);
    }
    if (paramString3 != null) {
      com.android.dazhihui.ui.delegate.a.a().c(paramString3);
    }
    com.android.dazhihui.ui.delegate.b.o.u();
    paramString3 = com.android.dazhihui.ui.delegate.a.a().b();
    if ((paramString3 != null) && (paramString3.size() > 0))
    {
      paramString3 = paramString3.iterator();
      while (paramString3.hasNext())
      {
        c localc = (c)paramString3.next();
        if ((localc.c().equals(paramString1)) && (localc.d().equals(paramString2)))
        {
          a(paramString1);
          return;
        }
      }
    }
    f();
  }
  
  public void a(List<MenuConfigVo.FirstMenuItem> paramList)
  {
    if ((this.i != null) && (paramList != null) && (paramList.size() > 0))
    {
      int i1 = 0;
      if (i1 < paramList.size())
      {
        int i2 = ((MenuConfigVo.FirstMenuItem)paramList.get(i1)).countid;
        if (ah.i.containsKey(String.valueOf(i2))) {
          ((MyRadioButton)this.i.getMRadioGroup().getChildAt(i1)).setRedHot(1);
        }
        for (;;)
        {
          i1 += 1;
          break;
          ((MyRadioButton)this.i.getMRadioGroup().getChildAt(i1)).setRedHot(0);
        }
      }
      ah.a().b(10004);
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    Log.i("postion", this.i.getCurrentPostion() + "");
    Object localObject = com.android.dazhihui.ui.a.e.a().b();
    if (localObject != null) {}
    for (boolean bool = ((Bundle)localObject).getBoolean("fromBrokerList");; bool = false)
    {
      if (bool)
      {
        if (com.android.dazhihui.ui.delegate.b.o.b(com.android.dazhihui.c.a.a.z))
        {
          com.android.dazhihui.ui.delegate.a.a().a(com.android.dazhihui.c.a.a.z);
          i1 = 0;
          while (i1 < this.f.size())
          {
            localObject = (MenuConfigVo.FirstMenuItem)this.f.get(i1);
            if ((((MenuConfigVo.FirstMenuItem)localObject).type == 7) && (((MenuConfigVo.FirstMenuItem)localObject).id == 23))
            {
              this.g = i1;
              d(this.g);
            }
            i1 += 1;
          }
        }
        int i1 = 0;
        while (i1 < this.f.size())
        {
          localObject = (MenuConfigVo.FirstMenuItem)this.f.get(i1);
          if ((((MenuConfigVo.FirstMenuItem)localObject).type == 7) && (((MenuConfigVo.FirstMenuItem)localObject).id == 22))
          {
            this.g = i1;
            d(this.g);
          }
          i1 += 1;
        }
        if (this.i.getCurrentPostion() != this.g)
        {
          this.i.a(this.g, 0);
          return;
        }
        f();
        return;
      }
      if (!paramBoolean2)
      {
        f();
        return;
      }
      localObject = com.android.dazhihui.ui.delegate.a.a().b();
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          c localc = (c)((Iterator)localObject).next();
          if (((localc.j()) && (paramBoolean1)) || ((!localc.j()) && (!paramBoolean1)))
          {
            com.android.dazhihui.ui.delegate.a.a().a(localc.c());
            com.android.dazhihui.ui.delegate.a.a().b(localc.d());
            com.android.dazhihui.ui.delegate.a locala = com.android.dazhihui.ui.delegate.a.a();
            if (localc.i()) {}
            for (localObject = "1";; localObject = "0")
            {
              locala.c((String)localObject);
              a(localc.c());
              return;
            }
          }
        }
      }
      com.android.dazhihui.ui.delegate.b.o.u();
      com.android.dazhihui.ui.a.e.a().a(true);
      f();
      return;
    }
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt == 9) {
      getActivity().finish();
    }
    do
    {
      do
      {
        return true;
      } while (this.d == paramInt);
      a(paramInt, true);
    } while (paramInt != 3);
    com.android.dazhihui.d.n.a("", 20061);
    return true;
  }
  
  public boolean a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    return true;
  }
  
  public void b()
  {
    if (isAdded())
    {
      l().cancel();
      f();
    }
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (this.k != null) {
      this.k.beforeHidden();
    }
    n();
    if (this.i != null) {
      this.i.f();
    }
  }
  
  public void c()
  {
    Intent localIntent;
    int i1;
    Object localObject;
    if (isAdded())
    {
      localIntent = new Intent();
      if ((this.p) || ((com.android.dazhihui.ui.delegate.b.o.r) && (com.android.dazhihui.ui.delegate.b.o.s.equals(com.android.dazhihui.c.a.a.z)))) {
        i1 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (com.android.dazhihui.c.a.a.z.equals(com.android.dazhihui.c.a.a.E[i1][0])) {
            this.r = com.android.dazhihui.c.a.a.E[i1][2];
          }
        }
        else
        {
          d.a().a("offline_capital_state", 2);
          d.a().g();
          localObject = com.android.dazhihui.c.a.a.z + "_" + this.r;
          Bundle localBundle = new Bundle();
          localBundle.putString("entrustName", (String)localObject);
          localBundle.putBoolean("isRequest", true);
          localIntent.putExtras(localBundle);
          localIntent.setClass(getActivity(), OfflineCapitalDetailActivity.class);
          startActivity(localIntent);
          return;
        }
        i1 += 1;
      }
    }
    if ((com.android.dazhihui.ui.delegate.b.o.r) && (com.android.dazhihui.c.a.a.E.length > 1))
    {
      localObject = new Bundle();
      ((Bundle)localObject).putBoolean("isMineRequest", true);
      localIntent.putExtras((Bundle)localObject);
      localIntent.setClass(getActivity(), OfflineCapitalMine.class);
      startActivity(localIntent);
      return;
    }
    l().cancel();
    a(1, false);
    com.android.dazhihui.ui.a.e.a().a(true);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null)
    {
      if (this.k != null) {
        this.k.changeLookFace(paramy);
      }
      switch (gj.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.h != null) {
          this.h.a(paramy);
        }
      } while (this.i == null);
      this.i.a();
      return;
      if (this.h != null) {
        this.h.a(paramy);
      }
    } while (this.i == null);
    this.i.a();
  }
  
  public void d()
  {
    if (isAdded())
    {
      com.android.dazhihui.ui.delegate.b.o.r = false;
      l().cancel();
      f();
    }
  }
  
  public void e()
  {
    new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("你确定退出？").setPositiveButton(2131165363, new ge(this)).setNegativeButton(2131165331, new gd(this)).show();
  }
  
  public void f()
  {
    a(0, false);
  }
  
  public boolean g()
  {
    if ((this.k instanceof dy)) {
      return ((dy)this.k).e();
    }
    if ((this.k instanceof fi)) {
      return ((fi)this.k).a();
    }
    return false;
  }
  
  public boolean h()
  {
    if (this.l != null) {
      this.m = this.l.getInt("bottomIndex", 0);
    }
    ((MainScreen)getActivity()).a(this.m, null, this.m, 0);
    return false;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.j = getChildFragmentManager();
    if (com.android.dazhihui.ui.a.e.a().b() != null)
    {
      paramBundle = com.android.dazhihui.ui.a.e.a().b();
      if (paramBundle != null) {
        this.p = paramBundle.getBoolean("haveNoLoginSorHaveOne");
      }
    }
    o();
    p();
    DzhPushService.a(this);
    System.out.println("进入TradeMainFragment了      onActivityCreated  haveNoLoginSorHaveOne   " + this.p);
    j();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903507, paramViewGroup, false);
    this.h = ((TradeHeader)this.a.findViewById(2131559735));
    i();
    m();
    this.n = true;
    return this.a;
  }
  
  public void onDestroyView()
  {
    DzhPushService.b(this);
    super.onDestroyView();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.q = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!this.q) && (!k.a(getActivity()).b()) && (!this.n))
    {
      o();
      p();
      j();
    }
    this.n = false;
  }
  
  public void setSubFragmentIndex(int paramInt1, int paramInt2)
  {
    if ((com.android.dazhihui.ui.delegate.b.o.r()) && (paramInt1 == 0)) {}
    for (this.e = -1;; this.e = paramInt1)
    {
      if ((paramInt2 > 0) && (this.f != null) && (paramInt2 <= this.f.size()))
      {
        this.g = (paramInt2 - 1);
        if (this.i != null)
        {
          a(this.f);
          this.o = true;
          this.i.a(this.g, -1);
        }
      }
      return;
    }
  }
  
  public void show()
  {
    super.show();
    this.n = true;
    o();
    p();
    this.l = getBundle();
    if (this.a != null) {
      j();
    }
    if (this.i != null)
    {
      this.i.a();
      this.i.e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */