package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.bf;
import com.android.dazhihui.d.bg;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.DZLHItem;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.Stock2991Vo;
import com.android.dazhihui.ui.model.stock.Stock2992Vo;
import com.android.dazhihui.ui.model.stock.Stock2993Vo;
import com.android.dazhihui.ui.model.stock.market.HHStkVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.HHStkDataView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.hd;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ao
  extends l
{
  BaseAdapter R = null;
  PopupWindow S = null;
  ImageView T;
  ListView U;
  private View V;
  private int W = 0;
  private int X = 0;
  private int Y = 33273;
  private boolean[] Z;
  protected int a = 0;
  private int[] aa;
  private String[] ab;
  private String ac;
  private byte ad = 0;
  private int ae = 0;
  private TableLayoutGroup af;
  private boolean ag;
  private Vector<String> ah;
  private bg ai;
  private MarketVo aj;
  private int ak = 0;
  private ArrayList<MarketVo> al;
  private ArrayList<DZLHItem> am;
  private boolean an = true;
  protected HHStkDataView b;
  com.android.dazhihui.a.b.m c;
  com.android.dazhihui.a.b.m d;
  com.android.dazhihui.a.b.m e;
  
  public static ao a(Bundle paramBundle)
  {
    ao localao = new ao();
    localao.setArguments(paramBundle);
    return localao;
  }
  
  private void a(p paramp)
  {
    paramp = paramp.b;
    if (paramp != null)
    {
      paramp = new q(paramp);
      HHStkVo localHHStkVo = new HHStkVo();
      localHHStkVo.decode(paramp);
      if (this.b != null) {
        this.b.setData(localHHStkVo);
      }
    }
  }
  
  private int g(int paramInt)
  {
    int j = 0;
    int i = j;
    if (this.aa != null)
    {
      i = j;
      if (paramInt >= 0)
      {
        i = j;
        if (paramInt < this.aa.length) {
          i = this.aa[paramInt];
        }
      }
    }
    return i;
  }
  
  private void h()
  {
    if (this.X == 39)
    {
      x localx = new x(2989);
      localx.c("港股通行情数据底部额度等信息");
      this.e = new com.android.dazhihui.a.b.m(localx);
      registRequestListener(this.e);
      sendRequest(this.e);
    }
  }
  
  private void h(int paramInt)
  {
    int j = 1;
    int k = 1;
    int i = 1;
    if (this.aj == null) {}
    Object localObject1;
    do
    {
      do
      {
        return;
        if (!this.ag) {
          break;
        }
      } while ((this.ah == null) || (this.ah.size() == 0));
      if (paramInt + 50 < this.ah.size()) {}
      for (i = 50;; i = this.ah.size() - paramInt)
      {
        localObject1 = new x(2955);
        ((x)localObject1).c(this.X);
        ((x)localObject1).c(this.Y);
        ((x)localObject1).a(this.ah, paramInt, i);
        ((x)localObject1).c("市场-自动包-子市场名=" + this.aj.getName() + "-带代码集合requestID=" + this.X + "-begin=" + paramInt);
        this.d = new com.android.dazhihui.a.b.m((x)localObject1);
        registRequestListener(this.d);
        this.d.a(Integer.valueOf(paramInt));
        setAutoRequest(this.d);
        return;
      }
    } while ((this.X == 106) || (this.X == 107));
    if (("分级基金".equals(this.aj.getName())) && ("分级A".equals(this.ac)))
    {
      localObject1 = new x(2992);
      ((x)localObject1).b(this.W);
      if (this.ad == 0) {}
      for (;;)
      {
        ((x)localObject1).b(i);
        ((x)localObject1).c(paramInt);
        ((x)localObject1).c(this.ae);
        ((x)localObject1).c("市场-自动包-子市场名=" + this.aj.getName() + "-分级A-begin=" + paramInt);
        localObject1 = new com.android.dazhihui.a.b.m((x)localObject1);
        ((com.android.dazhihui.a.b.m)localObject1).a(Integer.valueOf(paramInt));
        registRequestListener((h)localObject1);
        setAutoRequest((h)localObject1);
        return;
        i = 0;
      }
    }
    if (("分级基金".equals(this.aj.getName())) && ("分级B".equals(this.ac)))
    {
      localObject1 = new x(2991);
      ((x)localObject1).b(this.W);
      if (this.ad == 0) {}
      for (i = j;; i = 0)
      {
        ((x)localObject1).b(i);
        ((x)localObject1).c(paramInt);
        ((x)localObject1).c(this.ae);
        ((x)localObject1).c("市场-自动包-子市场名=" + this.aj.getName() + "-分级B-begin=" + paramInt);
        localObject1 = new com.android.dazhihui.a.b.m((x)localObject1);
        ((com.android.dazhihui.a.b.m)localObject1).a(Integer.valueOf(paramInt));
        registRequestListener((h)localObject1);
        setAutoRequest((h)localObject1);
        return;
      }
    }
    if (("分级基金".equals(this.aj.getName())) && ("上市母基".equals(this.ac)))
    {
      localObject1 = new x(2993);
      ((x)localObject1).b(this.W);
      if (this.ad == 0) {}
      for (i = k;; i = 0)
      {
        ((x)localObject1).b(i);
        ((x)localObject1).c(paramInt);
        ((x)localObject1).c(this.ae);
        ((x)localObject1).c("市场-自动包-子市场名=" + this.aj.getName() + "-上市母基-begin=" + paramInt);
        localObject1 = new com.android.dazhihui.a.b.m((x)localObject1);
        ((com.android.dazhihui.a.b.m)localObject1).a(Integer.valueOf(paramInt));
        registRequestListener((h)localObject1);
        setAutoRequest((h)localObject1);
        return;
      }
    }
    if ("富时A50指数期货".equals(this.aj.getName())) {
      try
      {
        localObject1 = new x(2938);
        ((x)localObject1).c(this.X);
        ((x)localObject1).b(this.ad);
        ((x)localObject1).b(this.W);
        ((x)localObject1).c(paramInt);
        ((x)localObject1).c(this.ae);
        ((x)localObject1).c("市场-子市场名=" + this.aj.getName() + "-requestID=32816" + "-begin=" + paramInt);
        localObject1 = new com.android.dazhihui.a.b.m((x)localObject1);
        ((com.android.dazhihui.a.b.m)localObject1).a(Integer.valueOf(paramInt));
        registRequestListener((h)localObject1);
        setAutoRequest((h)localObject1);
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
    }
    Object localObject2 = new x(2955);
    ((x)localObject2).c(this.X);
    ((x)localObject2).c(this.Y);
    ((x)localObject2).b(this.W);
    ((x)localObject2).b(this.ad);
    ((x)localObject2).c(paramInt);
    ((x)localObject2).c(this.ae);
    ((x)localObject2).c("市场-自动包-子市场名=" + this.aj.getName() + "-requestID=" + this.X + "-begin=" + paramInt);
    localObject2 = new com.android.dazhihui.a.b.m((x)localObject2);
    ((com.android.dazhihui.a.b.m)localObject2).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject2);
    setAutoRequest((h)localObject2);
  }
  
  public void a()
  {
    FragmentActivity localFragmentActivity = getActivity();
    if ((this.V == null) || (localFragmentActivity == null)) {
      return;
    }
    Object localObject1 = getActivity().getIntent().getExtras();
    if ((localObject1 != null) && (this.aj == null))
    {
      this.aj = ((MarketVo)((Bundle)localObject1).getParcelable("market_vo"));
      this.W = ((Bundle)localObject1).getInt("sequenceID", 0);
      this.ad = ((Bundle)localObject1).getByte("SortType", (byte)0).byteValue();
      this.ak = ((Bundle)localObject1).getInt("child_index", 0);
    }
    if (this.aj == null)
    {
      ((ViewGroup)this.V).removeAllViews();
      n.c("market list screen NULL");
      return;
    }
    this.af = ((TableLayoutGroup)this.V.findViewById(2131559838));
    this.af.setLayerType(1, null);
    this.b = ((HHStkDataView)this.V.findViewById(2131559837));
    MarketManager localMarketManager = MarketManager.get();
    Object localObject2 = this.aj;
    localObject1 = localObject2;
    if (this.aj.isMenu())
    {
      this.al = localMarketManager.getChildList(this.aj.getName());
      if ((this.ak > 0) && (this.al != null) && (this.ak < this.al.size())) {
        this.aj.setCurrentChild(this.ak);
      }
      i = this.aj.getCurrentChild();
      localObject1 = localObject2;
      if (this.al != null)
      {
        localObject1 = localObject2;
        if (i < this.al.size()) {
          localObject1 = (MarketVo)this.al.get(i);
        }
      }
    }
    if (((MarketVo)localObject1).hasStockList())
    {
      this.ah = new Vector();
      localObject2 = localMarketManager.getStockCodeList(((MarketVo)localObject1).getName());
      if (localObject2 != null) {
        this.ah.addAll((Collection)localObject2);
      }
      this.ag = true;
      this.X = ((MarketVo)localObject1).getId();
      this.ae = com.android.dazhihui.ui.a.m.a().H();
      if (!"分级基金".equals(this.aj.getName())) {
        break label504;
      }
    }
    label504:
    for (this.ai = bf.a(((MarketVo)localObject1).getName());; this.ai = bf.a(this.aj.getName()))
    {
      if (this.ai == null) {
        this.ai = bf.a(this.aj.getName() + ((MarketVo)localObject1).getName());
      }
      if (this.ai == null) {
        this.ai = bf.a();
      }
      if (this.ai == null) {
        break label656;
      }
      this.Y = this.ai.e();
      localObject1 = this.ai.a();
      this.ab = new String[localObject1.length];
      i = 0;
      while (i < localObject1.length)
      {
        this.ab[i] = localObject1[i];
        i += 1;
      }
      this.ag = false;
      this.ah = null;
      break;
    }
    localObject1 = this.ai.b();
    this.Z = new boolean[localObject1.length];
    int i = 0;
    while (i < localObject1.length)
    {
      this.Z[i] = localObject1[i];
      i += 1;
    }
    this.aa = this.ai.c();
    if ((this.aa != null) && (this.W != 0))
    {
      i = 0;
      if (i < this.aa.length) {
        if (this.W == this.aa[i]) {
          this.a = i;
        }
      }
    }
    for (i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.a = this.ai.d();
        this.W = g(this.a);
      }
      label656:
      label1154:
      label1191:
      boolean bool;
      if (this.aj.isMenu())
      {
        i = this.aj.getCurrentChild();
        this.al = localMarketManager.getChildList(this.aj.getName());
        if ((this.al != null) && (i < this.al.size()))
        {
          localObject1 = ((MarketVo)this.al.get(i)).getName();
          this.ab[0] = localObject1;
          this.ac = this.ab[0];
          if ("沪深指数".equals(localObject1)) {
            this.Z = new boolean[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
          }
          if ((localFragmentActivity instanceof MainScreen))
          {
            this.Z[0] = true;
            this.R = new hd(getActivity(), this.al);
            this.S = new PopupWindow(getActivity());
            this.S.setWidth(-2);
            this.S.setHeight(-2);
            this.S.setBackgroundDrawable(new ColorDrawable(0));
            this.S.setWindowLayoutMode(-2, -2);
            this.S.setFocusable(true);
            localObject1 = (LinearLayout)LayoutInflater.from(getActivity()).inflate(2130903573, null);
            this.T = ((ImageView)((LinearLayout)localObject1).findViewById(2131561262));
            this.U = ((ListView)((LinearLayout)localObject1).findViewById(2131561263));
            this.U.setAdapter(this.R);
            if ((this.R != null) && (this.R.getCount() > 6))
            {
              localObject2 = this.R.getView(0, null, this.U);
              ((View)localObject2).measure(0, 0);
              i = ((View)localObject2).getMeasuredHeight();
              localObject2 = this.U.getLayoutParams();
              ((ViewGroup.LayoutParams)localObject2).height = (i * 6 + this.U.getDividerHeight() * 6 + 20);
              this.U.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
            this.U.setOnItemClickListener(new ap(this));
            ((LinearLayout)localObject1).setGravity(1);
            ((LinearLayout.LayoutParams)this.T.getLayoutParams()).rightMargin = 0;
            ((LinearLayout)localObject1).requestLayout();
            this.S.setContentView((View)localObject1);
          }
        }
        else
        {
          MarketManager.get().setStatisticsUserAction("", this.ab[0]);
          this.af.b();
          if (this.ag) {
            break label1391;
          }
          this.af.setContinuousLoading(true);
          this.af.setColumnClickable(this.Z);
          this.af.setHeaderColumn(this.ab);
          this.af.setColumnAlign(Paint.Align.CENTER);
          this.af.setFirstColumnHeadAlign(Paint.Align.CENTER);
          localObject1 = this.af;
          i = this.a;
          if (this.ad != 0) {
            break label1402;
          }
          bool = false;
          label1254:
          ((TableLayoutGroup)localObject1).a(i, bool);
          this.af.setOnLoadingListener(new aq(this));
          this.af.setOnContentScrollChangeListener(new ar(this));
          this.af.setOnTableLayoutClickListener(new as(this));
          if (this.X != 39) {
            break label1408;
          }
          this.b.setVisibility(0);
        }
      }
      for (;;)
      {
        changeLookFace(this.mLookFace);
        return;
        i += 1;
        break;
        this.Z[0] = false;
        break label1154;
        if (TextUtils.isEmpty(this.aj.getName())) {
          break label1154;
        }
        this.ab[0] = this.aj.getName();
        this.ac = this.ab[0];
        break label1154;
        label1391:
        this.af.setContinuousLoading(false);
        break label1191;
        label1402:
        bool = true;
        break label1254;
        label1408:
        this.b.setVisibility(8);
      }
    }
  }
  
  public void a(int paramInt)
  {
    if (this.aj != null)
    {
      this.aj.setCurrentChild(paramInt);
      this.ak = paramInt;
      a();
      refresh();
      g();
    }
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    int j = 1;
    int k = 1;
    int i = 1;
    if ((this.X == 106) || (this.X == 107) || (this.aj == null)) {}
    for (;;)
    {
      return;
      if (("分级基金".equals(this.aj.getName())) && ("分级A".equals(this.ac))) {
        for (;;)
        {
          try
          {
            x localx1 = new x(2992);
            localx1.b(this.W);
            if (this.ad == 0)
            {
              localx1.b(i);
              localx1.c(paramInt);
              localx1.c(this.ae);
              localx1.c("市场-子市场名=" + this.aj.getName() + "-分级A-begin=" + paramInt);
              this.c = new com.android.dazhihui.a.b.m(localx1);
              this.c.a(Integer.valueOf(paramInt));
              registRequestListener(this.c);
              sendRequest(this.c);
              if (!paramBoolean) {
                break;
              }
              d();
              return;
            }
          }
          catch (Exception localException1)
          {
            localException1.printStackTrace();
            return;
          }
          i = 0;
        }
      }
      if (("分级基金".equals(this.aj.getName())) && ("分级B".equals(this.ac))) {
        for (;;)
        {
          try
          {
            x localx2 = new x(2991);
            localx2.b(this.W);
            if (this.ad == 0)
            {
              i = j;
              localx2.b(i);
              localx2.c(paramInt);
              localx2.c(this.ae);
              localx2.c("市场-子市场名=" + this.aj.getName() + "-分级B-begin=" + paramInt);
              this.c = new com.android.dazhihui.a.b.m(localx2);
              this.c.a(Integer.valueOf(paramInt));
              registRequestListener(this.c);
              sendRequest(this.c);
              if (!paramBoolean) {
                break;
              }
              d();
              return;
            }
          }
          catch (Exception localException2)
          {
            localException2.printStackTrace();
            return;
          }
          i = 0;
        }
      }
      if (("分级基金".equals(this.aj.getName())) && ("上市母基".equals(this.ac))) {
        for (;;)
        {
          try
          {
            x localx3 = new x(2993);
            localx3.b(this.W);
            if (this.ad == 0)
            {
              i = k;
              localx3.b(i);
              localx3.c(paramInt);
              localx3.c(this.ae);
              localx3.c("市场-子市场名=" + this.aj.getName() + "-上市母基-begin=" + paramInt);
              this.c = new com.android.dazhihui.a.b.m(localx3);
              this.c.a(Integer.valueOf(paramInt));
              registRequestListener(this.c);
              sendRequest(this.c);
              if (!paramBoolean) {
                break;
              }
              d();
              return;
            }
          }
          catch (Exception localException3)
          {
            localException3.printStackTrace();
            return;
          }
          i = 0;
        }
      }
      if ("富时A50指数期货".equals(this.aj.getName())) {
        try
        {
          x localx4 = new x(2938);
          localx4.c(this.X);
          localx4.b(this.ad);
          localx4.b(this.W);
          localx4.c(paramInt);
          localx4.c(this.ae);
          localx4.c("市场-子市场名=" + this.aj.getName() + "-requestID=32816" + "-begin=" + paramInt);
          this.c = new com.android.dazhihui.a.b.m(localx4);
          this.c.a(Integer.valueOf(paramInt));
          registRequestListener(this.c);
          sendRequest(this.c);
          if (!paramBoolean) {
            continue;
          }
          d();
          return;
        }
        catch (Exception localException4)
        {
          localException4.printStackTrace();
          return;
        }
      } else {
        try
        {
          x localx5 = new x(2955);
          localx5.c(this.X);
          localx5.c(this.Y);
          localx5.b(this.W);
          localx5.b(this.ad);
          localx5.c(paramInt);
          localx5.c(this.ae);
          localx5.c("市场-子市场名=" + this.aj.getName() + "-requestID=" + this.X + "-begin=" + paramInt);
          this.c = new com.android.dazhihui.a.b.m(localx5);
          this.c.a(Integer.valueOf(paramInt));
          registRequestListener(this.c);
          sendRequest(this.c);
          if (paramBoolean)
          {
            d();
            return;
          }
        }
        catch (Exception localException5)
        {
          localException5.printStackTrace();
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.V != null) && (paramBoolean)) {
      this.V.scrollTo(0, 0);
    }
    refresh();
  }
  
  protected void b(int paramInt, boolean paramBoolean)
  {
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j <= 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    if (this.ag) {
      c(paramBoolean);
    }
    for (;;)
    {
      h();
      h(paramInt);
      return;
      a(paramInt, paramBoolean);
    }
  }
  
  protected void c(boolean paramBoolean)
  {
    if ((this.ah == null) || (this.ah.size() == 0) || (this.aj == null)) {}
    do
    {
      return;
      int i = 0;
      if (i < this.ah.size())
      {
        if (i + 50 < this.ah.size()) {}
        for (int j = 50;; j = this.ah.size() - i)
        {
          x localx = new x(2955);
          localx.c(this.X);
          localx.c(this.Y);
          localx.a(this.ah, i, j);
          localx.c("市场-子市场名=" + this.aj.getName() + "-带代码集合requestID=" + this.X + "-begin=" + i);
          this.d = new com.android.dazhihui.a.b.m(localx);
          registRequestListener(this.d);
          this.d.a(Integer.valueOf(i));
          sendRequest(this.d);
          i += 50;
          break;
        }
      }
    } while (!paramBoolean);
    d();
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (at.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.af != null)
        {
          this.af.setBackgroundColor(getActivity().getResources().getColor(2131493542));
          this.af.a(paramy);
        }
      } while ((this.U == null) || (this.T == null));
      this.U.setBackgroundResource(2130837566);
      this.U.setDivider(new ColorDrawable(-16777216));
      this.U.setDividerHeight(2);
      this.T.setImageResource(2130838118);
      return;
      if (this.af != null)
      {
        this.af.setBackgroundColor(getActivity().getResources().getColor(2131493605));
        this.af.a(paramy);
      }
    } while ((this.U == null) || (this.T == null));
    this.U.setBackgroundResource(2130838788);
    this.U.setDivider(new ColorDrawable(-2697514));
    this.U.setDividerHeight(2);
    this.T.setImageResource(2130838121);
  }
  
  public void f()
  {
    if ((this.an) && (this.aa != null) && (this.af != null)) {
      this.af.a(this.a);
    }
    this.an = false;
  }
  
  public void g()
  {
    if ((this.aj == null) || (!this.aj.isMenu())) {}
    Object localObject1;
    do
    {
      do
      {
        return;
        ArrayList localArrayList = MarketManager.get().getChildList(this.aj.getName());
        Object localObject2 = null;
        int i = this.aj.getCurrentChild();
        localObject1 = localObject2;
        if (localArrayList != null)
        {
          localObject1 = localObject2;
          if (i < localArrayList.size()) {
            localObject1 = (MarketVo)localArrayList.get(i);
          }
        }
      } while (localObject1 == null);
      localObject1 = ((MarketVo)localObject1).getName();
      if (((String)localObject1).equals("沪深A股"))
      {
        n.a("", 1296);
        return;
      }
      if (((String)localObject1).equals("沪深指数"))
      {
        n.a("", 1297);
        return;
      }
      if (((String)localObject1).equals("创业板"))
      {
        n.a("", 1298);
        return;
      }
      if (((String)localObject1).equals("中小板块"))
      {
        n.a("", 1299);
        return;
      }
      if (((String)localObject1).equals("上证A股"))
      {
        n.a("", 1300);
        return;
      }
      if (((String)localObject1).equals("深证A股"))
      {
        n.a("", 1301);
        return;
      }
      if (((String)localObject1).equals("港股通"))
      {
        n.a("", 1302);
        return;
      }
      if (((String)localObject1).equals("上证B股"))
      {
        n.a("", 1303);
        return;
      }
      if (((String)localObject1).equals("深证B股"))
      {
        n.a("", 1304);
        return;
      }
      if (((String)localObject1).equals("深证H股"))
      {
        n.a("", 1305);
        return;
      }
      if (((String)localObject1).equals("两网及退市"))
      {
        n.a("", 1306);
        return;
      }
      if (((String)localObject1).equals("新三板"))
      {
        n.a("", 1307);
        return;
      }
      if (((String)localObject1).equals("上证风险"))
      {
        n.a("", 1308);
        return;
      }
      if (((String)localObject1).equals("上证退市"))
      {
        n.a("", 1309);
        return;
      }
    } while (!((String)localObject1).equals("深证退市"));
    n.a("", 1310);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      if ((this.Y >>> 12 & 0x1) == 0) {
        break label1957;
      }
      i = this.aj.getCurrentChild();
      if (paramh == this.e)
      {
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        a(paramh.h());
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    paramj = (o)paramj;
    Object localObject1;
    int k;
    boolean bool;
    label174:
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (paramj != null)
    {
      localObject1 = paramj.h();
      if (((p)localObject1).a == 2955)
      {
        paramj = new Stock2955Vo();
        localObject1 = ((p)localObject1).b;
        if ((localObject1 != null) && (this.af != null))
        {
          localObject1 = new q((byte[])localObject1);
          k = ((q)localObject1).e();
          m = ((q)localObject1).e();
          j = ((q)localObject1).e();
          n = ((q)localObject1).e();
          if (!this.ag)
          {
            if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + n >= j)) {
              break label1951;
            }
            bool = true;
            this.af.setLoadingDown(bool);
          }
          localObject2 = new ArrayList();
          j = 0;
          while (j < n)
          {
            localObject3 = new String[this.ab.length];
            localObject4 = new int[this.ab.length];
            paramj.decode((q)localObject1, k, m);
            paramj.getData(this.ab, (String[])localObject3, (int[])localObject4, i);
            localObject5 = new mh();
            if (this.am != null)
            {
              localObject3[3] = ((DZLHItem)this.am.get(j)).getSszt();
              localObject4[3] = 39936;
            }
            ((mh)localObject5).a = ((String[])localObject3);
            ((mh)localObject5).b = ((int[])localObject4);
            ((mh)localObject5).d = n.e(paramj.code);
            ((mh)localObject5).g = paramj.type;
            if (paramj.ggsm > 0) {
              ((mh)localObject5).i = true;
            }
            if (k == 10) {
              ((mh)localObject5).j = true;
            }
            ((mh)localObject5).h = paramj.isLoanable;
            ((mh)localObject5).k = new Object[] { paramj.code };
            ((List)localObject2).add(localObject5);
            j += 1;
          }
          i = 0;
          if (paramh.j() == null) {
            break label1964;
          }
          i = ((Integer)paramh.j()).intValue();
          break label1964;
        }
      }
    }
    for (;;)
    {
      this.af.a((List)localObject2, i);
      f();
      do
      {
        e();
        return;
        if (((p)localObject1).a != 2991) {
          break;
        }
        paramj = new Stock2991Vo();
        localObject1 = ((p)localObject1).b;
      } while ((localObject1 == null) || (this.af == null));
      localObject1 = new q((byte[])localObject1);
      j = ((q)localObject1).e();
      k = ((q)localObject1).e();
      if (!this.ag) {
        if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + k >= j)) {
          break label1945;
        }
      }
      label1933:
      label1939:
      label1945:
      for (bool = true;; bool = false)
      {
        this.af.setLoadingDown(bool);
        localObject2 = new ArrayList();
        j = 0;
        while (j < k)
        {
          localObject3 = new String[this.ab.length];
          localObject4 = new int[this.ab.length];
          paramj.decode((q)localObject1);
          paramj.getData(this.ab, (String[])localObject3, (int[])localObject4, i);
          localObject5 = new mh();
          ((mh)localObject5).a = ((String[])localObject3);
          ((mh)localObject5).b = ((int[])localObject4);
          ((mh)localObject5).d = n.e(paramj.code);
          ((mh)localObject5).g = paramj.type;
          ((mh)localObject5).h = paramj.isLoanable;
          ((mh)localObject5).k = new Object[] { paramj.code };
          ((List)localObject2).add(localObject5);
          j += 1;
        }
        i = 0;
        if (paramh.j() != null) {
          i = ((Integer)paramh.j()).intValue();
        }
        this.af.a((List)localObject2, i);
        f();
        break;
        if (((p)localObject1).a == 2992)
        {
          paramj = new Stock2992Vo();
          localObject1 = ((p)localObject1).b;
          if ((localObject1 == null) || (this.af == null)) {
            break;
          }
          localObject1 = new q((byte[])localObject1);
          i = ((q)localObject1).e();
          j = ((q)localObject1).e();
          if (!this.ag) {
            if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + j >= i)) {
              break label1939;
            }
          }
        }
        for (bool = true;; bool = false)
        {
          this.af.setLoadingDown(bool);
          localObject2 = new ArrayList();
          i = 0;
          while (i < j)
          {
            localObject3 = new String[this.ab.length];
            localObject4 = new int[this.ab.length];
            paramj.decode((q)localObject1);
            paramj.getData(this.ab, (String[])localObject3, (int[])localObject4, 0);
            localObject5 = new mh();
            ((mh)localObject5).a = ((String[])localObject3);
            ((mh)localObject5).b = ((int[])localObject4);
            ((mh)localObject5).d = n.e(paramj.code);
            ((mh)localObject5).g = paramj.type;
            ((mh)localObject5).h = paramj.isLoanable;
            ((mh)localObject5).k = new Object[] { paramj.code };
            ((List)localObject2).add(localObject5);
            i += 1;
          }
          i = 0;
          if (paramh.j() != null) {
            i = ((Integer)paramh.j()).intValue();
          }
          this.af.a((List)localObject2, i);
          f();
          break;
          if (((p)localObject1).a == 2993)
          {
            paramj = new Stock2993Vo();
            localObject1 = ((p)localObject1).b;
            if ((localObject1 == null) || (this.af == null)) {
              break;
            }
            localObject1 = new q((byte[])localObject1);
            i = ((q)localObject1).e();
            j = ((q)localObject1).e();
            if (!this.ag) {
              if ((paramh.j() == null) || (((Integer)paramh.j()).intValue() + j >= i)) {
                break label1933;
              }
            }
          }
          for (bool = true;; bool = false)
          {
            this.af.setLoadingDown(bool);
            localObject2 = new ArrayList();
            i = 0;
            while (i < j)
            {
              localObject3 = new String[this.ab.length];
              localObject4 = new int[this.ab.length];
              paramj.decode((q)localObject1);
              paramj.getData(this.ab, (String[])localObject3, (int[])localObject4, 0);
              localObject5 = new mh();
              ((mh)localObject5).a = ((String[])localObject3);
              ((mh)localObject5).b = ((int[])localObject4);
              ((mh)localObject5).d = n.e(paramj.code);
              ((mh)localObject5).g = paramj.type;
              ((mh)localObject5).h = paramj.isLoanable;
              ((mh)localObject5).k = new Object[] { paramj.code };
              ((List)localObject2).add(localObject5);
              i += 1;
            }
            i = 0;
            if (paramh.j() != null) {
              i = ((Integer)paramh.j()).intValue();
            }
            this.af.a((List)localObject2, i);
            f();
            break;
            if (((p)localObject1).a != 2938) {
              break;
            }
            paramj = ((p)localObject1).b;
            if ((paramj == null) || (this.af == null)) {
              break;
            }
            paramj = new q(paramj);
            j = paramj.e();
            i = paramj.e();
            if ((paramh.j() != null) && (((Integer)paramh.j()).intValue() + i < j)) {}
            for (bool = true;; bool = false)
            {
              this.af.setLoadingDown(bool);
              int i9 = ((Integer)paramh.j()).intValue();
              paramh = new ArrayList();
              k = i - 1;
              while (k >= 0)
              {
                localObject1 = new mh();
                localObject2 = new int[13];
                localObject3 = paramj.l();
                localObject4 = paramj.l();
                localObject2[0] = 39936;
                try
                {
                  i8 = paramj.b();
                  paramj.e();
                  i7 = paramj.h();
                  i = paramj.h();
                  i6 = paramj.h();
                  i5 = paramj.h();
                  i4 = paramj.h();
                  i3 = paramj.h();
                  paramj.h();
                  i2 = paramj.h();
                  j = paramj.h();
                  n = paramj.h();
                  m = paramj.h();
                  i1 = j;
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    String str1;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    j = 0;
                    m = 0;
                    n = 0;
                    int i1 = 0;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 2;
                    i = 0;
                  }
                }
                if (i1 == 0) {
                  j = i;
                }
                localObject5 = b.a(i7, i8);
                localObject2[1] = b.h(i7, j);
                str1 = b.c(i7, j);
                localObject2[2] = localObject2[1];
                str2 = b.b(i7, j, i8);
                localObject2[3] = localObject2[1];
                str3 = b.d(n - m, 0);
                localObject2[4] = -1;
                str4 = n.e(b.b(i6));
                localObject2[5] = -16711681;
                str5 = n.g(String.valueOf(n));
                localObject2[6] = 65280;
                str6 = b.a(i2, i8);
                localObject2[7] = b.h(i2, j);
                str7 = b.a(i1, i8);
                localObject2[8] = b.h(i1, j);
                str8 = b.a(i3, i8);
                localObject2[9] = -1;
                str9 = b.a(i5, i8);
                localObject2[10] = b.h(i5, j);
                str10 = b.a(i4, i8);
                localObject2[11] = b.h(i4, j);
                str11 = b.a(i, i8);
                localObject2[12] = -1;
                ((mh)localObject1).a = new String[] { localObject4, localObject5, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11 };
                ((mh)localObject1).b = ((int[])localObject2);
                ((mh)localObject1).d = n.e((String)localObject3);
                ((mh)localObject1).g = 7;
                ((mh)localObject1).k = new Object[] { localObject3 };
                paramh.add(localObject1);
                k -= 1;
              }
              this.af.a(paramh, i9);
              f();
              break;
            }
          }
        }
      }
      label1951:
      bool = false;
      break label174;
      label1957:
      i = 0;
      break;
      return;
      label1964:
      if (k == 101) {
        i = 0;
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if ((paramBundle != null) && (this.aj == null))
    {
      this.aj = ((MarketVo)paramBundle.getParcelable("market_vo"));
      this.W = paramBundle.getInt("sequenceID", 0);
      this.ad = paramBundle.getByte("SortType", (byte)0).byteValue();
      this.ak = paramBundle.getInt("child_index", 0);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.V = paramLayoutInflater.inflate(2130903277, null);
    a();
    return this.V;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.af != null)
    {
      b(this.af.getContentVisibleBeginPosition(), true);
      return;
    }
    b(0, true);
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
  
  public void show()
  {
    refresh();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */