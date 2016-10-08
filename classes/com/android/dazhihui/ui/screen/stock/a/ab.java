package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.Stock2990Vo;
import com.android.dazhihui.ui.model.stock.market.MarketAdapterItmeOnClickListener;
import com.android.dazhihui.ui.model.stock.market.MarketHSListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class ab
  extends l
{
  public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  private Vector<String> R = new Vector();
  private ae S = new ae();
  private String T;
  private ArrayList<ArrayList<MarketStockVo>> b = new ArrayList();
  private com.android.dazhihui.a.b.m c;
  private com.android.dazhihui.a.b.m d;
  private com.android.dazhihui.a.b.m e;
  
  public ab()
  {
    this.i = 2130903265;
    this.J = new boolean[] { 0, 0, 0, 0 };
    this.K = new String[] { "", "", "", "" };
    this.k = 8;
    this.j = new String[] { "板块", "5分钟涨跌幅", "资金流", "涨跌幅" };
    this.y = new String[] { "上证指数", "深证指数", "创业板指", "IF当月连续", "IC当月连续", "IH当月连续" };
    this.x = null;
    this.R.add("SH000001");
    this.R.add("SZ399001");
    this.R.add("SZ399006");
    this.R.add("IF0001");
    this.R.add("IC0001");
    this.R.add("IH0001");
  }
  
  private com.android.dazhihui.a.b.m a(String paramString)
  {
    x[] arrayOfx = new x[8];
    arrayOfx[0] = a(33272, 0, 1, 5);
    arrayOfx[0].c("沪深市场2-涨幅榜" + paramString + " TIME=" + this.T);
    arrayOfx[1] = a(33272, 1, 1, 6);
    arrayOfx[1].c("沪深市场2-跌幅榜" + paramString + " TIME=" + this.T);
    arrayOfx[2] = a(32928, 0, 25, 5);
    arrayOfx[2].c("沪深市场2-5分钟涨跌幅" + paramString + " TIME=" + this.T);
    arrayOfx[3] = a(38032, 0, 17, 5);
    arrayOfx[3].c("沪深市场2-资金流入" + paramString + " TIME=" + this.T);
    arrayOfx[4] = a(38032, 1, 17, 6);
    arrayOfx[4].c("沪深市场2-资金流出" + paramString + " TIME=" + this.T);
    arrayOfx[5] = new x(2955);
    arrayOfx[5].c(107);
    arrayOfx[5].c(0);
    arrayOfx[5].a(this.R);
    arrayOfx[5].c("沪深市场2-指数-沪-深-创" + paramString + " TIME=" + this.T);
    arrayOfx[6] = a(0, 3);
    arrayOfx[6].c("沪深市场2-板块涨幅榜" + paramString + " TIME=" + this.T);
    arrayOfx[7] = a(1, 4);
    arrayOfx[7].c("沪深市场2-板块跌幅榜" + paramString + " TIME=" + this.T);
    return new com.android.dazhihui.a.b.m(arrayOfx);
  }
  
  private x a(int paramInt1, int paramInt2)
  {
    x localx = new x(2990);
    localx.c(105);
    localx.d(1085945);
    localx.b(1);
    localx.b(paramInt1);
    localx.c(0);
    localx.c(paramInt2);
    return localx;
  }
  
  private x a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x localx = new x(2955);
    localx.c(0);
    localx.c(paramInt1);
    localx.b(paramInt3);
    localx.b(paramInt2);
    localx.c(0);
    localx.c(paramInt4);
    return localx;
  }
  
  private void a()
  {
    x localx = new x(2206);
    localx.a("SH000001");
    localx.c("沪深市场2-上证指数-涨跌家数 TIME=" + this.T);
    this.d = new com.android.dazhihui.a.b.m(localx);
    this.d.a(this);
    this.d.a("沪深市场2-上证指数-涨跌家数--单次包 NioRequest TIME=" + this.T);
    localx = new x(2206);
    localx.a("SZ399001");
    localx.c("沪深市场2-深证指数-涨跌家数 TIME=" + this.T);
    this.e = new com.android.dazhihui.a.b.m(localx);
    this.e.a(this);
    this.e.a("沪深市场2-深证指数-涨跌家数--单次包 NioRequest TIME=" + this.T);
    sendRequest(this.d);
    sendRequest(this.e);
  }
  
  private void a(int paramInt, ArrayList<MarketStockVo> paramArrayList)
  {
    paramArrayList = this.P.obtainMessage(paramInt, paramArrayList);
    this.P.sendMessage(paramArrayList);
  }
  
  private void f()
  {
    if (this.h != null)
    {
      TextView localTextView = (TextView)this.h.findViewById(2131559795);
      int i = this.S.a;
      int j = this.S.d;
      localTextView.setText(i + j + "家");
      localTextView = (TextView)this.h.findViewById(2131559797);
      i = this.S.b;
      j = this.S.e;
      localTextView.setText(i + j + "家");
      localTextView = (TextView)this.h.findViewById(2131559799);
      i = this.S.c;
      j = this.S.f;
      localTextView.setText(i + j + "家");
    }
  }
  
  protected MarketListAdapter c(int paramInt)
  {
    int i = 1;
    FragmentActivity localFragmentActivity;
    MarketAdapterItmeOnClickListener localMarketAdapterItmeOnClickListener;
    switch (paramInt)
    {
    default: 
      localFragmentActivity = getActivity();
      localMarketAdapterItmeOnClickListener = this.Q;
      if (paramInt != 0) {
        break;
      }
    }
    for (;;)
    {
      return new MarketHSListAdapter(null, paramInt, localFragmentActivity, localMarketAdapterItmeOnClickListener, i);
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 1);
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 0);
      return new MarketHSListAdapter(null, 1, getActivity(), this.Q, 0);
      return new MarketHSListAdapter(null, 2, getActivity(), this.Q, 0);
      return new MarketHSListAdapter(null, 3, getActivity(), this.Q, 0);
      i = 0;
    }
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (ad.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.h == null);
      this.h.setBackgroundColor(getActivity().getResources().getColor(2131493540));
      ((TextView)this.h.findViewById(2131559794)).setTextColor(getActivity().getResources().getColor(2131493546));
      ((TextView)this.h.findViewById(2131559796)).setTextColor(getActivity().getResources().getColor(2131493546));
      ((TextView)this.h.findViewById(2131559798)).setTextColor(getActivity().getResources().getColor(2131493546));
      ((TextView)this.h.findViewById(2131559797)).setTextColor(getActivity().getResources().getColor(2131493546));
      return;
    } while (this.h == null);
    this.h.setBackgroundColor(getActivity().getResources().getColor(2131493603));
    ((TextView)this.h.findViewById(2131559794)).setTextColor(getActivity().getResources().getColor(2131493609));
    ((TextView)this.h.findViewById(2131559796)).setTextColor(getActivity().getResources().getColor(2131493609));
    ((TextView)this.h.findViewById(2131559798)).setTextColor(getActivity().getResources().getColor(2131493609));
    ((TextView)this.h.findViewById(2131559797)).setTextColor(getActivity().getResources().getColor(2131493609));
  }
  
  public void d(int paramInt)
  {
    Bundle localBundle = new Bundle();
    Object localObject = null;
    ArrayList localArrayList = MarketManager.get().getChildList("决策");
    if (paramInt == 0)
    {
      localBundle.putParcelable("market_vo", new MarketVo("板块综合", false, false, -100));
      localObject = new Intent(getActivity(), MarketListScreenActivity.class);
      ((Intent)localObject).putExtras(localBundle);
      MarketManager.get().setStatisticsUserAction("", "板块更多");
    }
    for (;;)
    {
      ((Intent)localObject).putExtras(localBundle);
      startActivity((Intent)localObject);
      return;
      if (paramInt == 3)
      {
        localBundle.putParcelable("market_vo", MarketManager.get().getMarketVo("沪深市场"));
        localBundle.putByte("SortType", (byte)0);
        localObject = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "涨跌幅更多");
      }
      else if (paramInt == 1)
      {
        localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(3));
        localObject = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "五分钟涨跌幅更多");
      }
      else if (paramInt == 2)
      {
        localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(1));
        localObject = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "资金流更多");
      }
      else if (paramInt == 4)
      {
        localBundle.putParcelable("market_vo", MarketManager.get().getMarketVo("沪深市场"));
        localBundle.putInt("sequenceID", 21);
        localObject = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "换手率更多");
      }
      else if (paramInt == -100)
      {
        localObject = MarketManager.get().getMarketVo("沪深市场");
        localBundle.putInt("child_index", 1);
        localBundle.putParcelable("market_vo", (Parcelable)localObject);
        localObject = new Intent(getActivity(), MarketListScreenActivity.class);
      }
    }
  }
  
  public void e(int paramInt)
  {
    if (paramInt == 0)
    {
      localIntent = new Intent();
      localIntent.setClass(getActivity(), MoreNewsListScreen.class);
      localIntent.putExtra("name", "要闻");
      localIntent.putExtra("type", 1);
      localIntent.putExtra("url", f.L);
      startActivity(localIntent);
      n.a("", 1419);
    }
    while (paramInt != -100) {
      return;
    }
    Intent localIntent = new Intent(getActivity(), BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.M);
    localBundle.putString("names", "看盘宝");
    localIntent.putExtras(localBundle);
    startActivity(localIntent);
    n.a("", 1418);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = (o)paramj;
    if (paramj == null) {}
    Object localObject2;
    int i;
    Object localObject1;
    Object localObject3;
    int j;
    label319:
    int k;
    int m;
    for (;;)
    {
      return;
      paramj = paramj.h();
      if (paramj != null)
      {
        try
        {
          if (paramj.a == 2984)
          {
            localObject2 = new q(paramj.b);
            ((q)localObject2).e();
            i = ((q)localObject2).e();
            localObject1 = new ArrayList();
            i -= 1;
            while (i >= 0)
            {
              localObject3 = new MarketStockVo();
              ((MarketStockVo)localObject3).setModuleCode(((q)localObject2).l());
              ((MarketStockVo)localObject3).setStockName(((q)localObject2).l());
              ((q)localObject2).b();
              ((q)localObject2).h();
              j = ((q)localObject2).h();
              paramj = b.c(j);
              paramh = paramj;
              if (!paramj.contains("-")) {
                paramh = "+" + paramj;
              }
              ((MarketStockVo)localObject3).setBkZf(paramh);
              ((MarketStockVo)localObject3).setBkColor(b.h(j));
              ((MarketStockVo)localObject3).setModule_id(((q)localObject2).e());
              ((q)localObject2).l();
              ((MarketStockVo)localObject3).setCfgName(((q)localObject2).l());
              j = ((q)localObject2).b();
              ((MarketStockVo)localObject3).setCfgZx(b.a(((q)localObject2).h(), j));
              ((MarketStockVo)localObject3).setCfgZf(b.c(((q)localObject2).h()));
              ((ArrayList)localObject1).add(localObject3);
              i -= 1;
            }
            paramh = (ArrayList)this.b.get(0);
            paramh.addAll((Collection)localObject1);
            if (paramh.size() != 6) {
              continue;
            }
            paramj = new ArrayList();
            i = 0;
            while (i < 3)
            {
              paramj.add(i, paramh.get(i));
              i += 1;
            }
            while (i < 3)
            {
              paramj.add(i + 3, paramh.get(paramh.size() - i - 1));
              i += 1;
            }
            paramh.clear();
            a(0, paramj);
            return;
          }
        }
        catch (Exception paramh)
        {
          paramh.printStackTrace();
          return;
        }
        if (paramj.a != 2990) {
          break;
        }
        paramh = new q(paramj.b);
        paramj = new ArrayList();
        localObject1 = new Stock2990Vo();
        j = paramh.e();
        k = paramh.h();
        paramh.e();
        m = paramh.e();
        i = 0;
        for (;;)
        {
          if ((i >= m) || (i >= 3)) {
            break label1931;
          }
          localObject2 = new MarketStockVo();
          if (!((Stock2990Vo)localObject1).decode(paramh, j, k)) {
            break;
          }
          ((MarketStockVo)localObject2).setModuleCode(((Stock2990Vo)localObject1).code);
          ((MarketStockVo)localObject2).setStockName(((Stock2990Vo)localObject1).name);
          ((MarketStockVo)localObject2).setBkZf(b.b(((Stock2990Vo)localObject1).zx, ((Stock2990Vo)localObject1).zshou));
          ((MarketStockVo)localObject2).setBkColor(b.h(((Stock2990Vo)localObject1).zx, ((Stock2990Vo)localObject1).zshou));
          ((MarketStockVo)localObject2).setModule_id(((Stock2990Vo)localObject1).cfg);
          ((MarketStockVo)localObject2).setCfgName(((Stock2990Vo)localObject1).up_cfg_name);
          ((MarketStockVo)localObject2).setCfgZx(b.a(((Stock2990Vo)localObject1).up_cfg_zx, ((Stock2990Vo)localObject1).up_cfg_decLen));
          ((MarketStockVo)localObject2).setCfgZf(b.c(((Stock2990Vo)localObject1).up_cfg_zf));
          paramj.add(localObject2);
          i += 1;
        }
        label582:
        while ((paramh != null) && (paramh.size() == 6))
        {
          paramj = new ArrayList();
          i = 0;
          while (i < 3)
          {
            paramj.add(i, paramh.get(i));
            i += 1;
          }
          paramh = (ArrayList)this.b.get(0);
          paramh.clear();
          paramh.addAll(paramj);
          continue;
          paramh = (ArrayList)this.b.get(0);
          if (paramh.size() != 3) {
            break label1922;
          }
          paramh.addAll(3, paramj);
        }
      }
    }
    label688:
    while (i < 3)
    {
      paramj.add(i + 3, paramh.get(paramh.size() - i - 1));
      i += 1;
    }
    paramh.clear();
    a(0, paramj);
    a();
    return;
    if (paramj.a == 2955)
    {
      localObject2 = new q(paramj.b);
      k = ((q)localObject2).e();
      m = ((q)localObject2).e();
      ((q)localObject2).e();
      j = ((q)localObject2).e();
      localObject1 = new ArrayList();
      label836:
      MarketStockVo localMarketStockVo;
      switch (k)
      {
      case 0: 
        localObject3 = new Stock2955Vo();
        i = 0;
        if ((i < j) && (i < 5))
        {
          localMarketStockVo = new MarketStockVo();
          ((Stock2955Vo)localObject3).decode((q)localObject2, k, m);
          localMarketStockVo.setStockCode(((Stock2955Vo)localObject3).code);
          localMarketStockVo.setStockName(((Stock2955Vo)localObject3).name);
          localMarketStockVo.setDecl(((Stock2955Vo)localObject3).decLen);
          localMarketStockVo.setZs(((Stock2955Vo)localObject3).zshou);
          localMarketStockVo.setZxData(((Stock2955Vo)localObject3).zx);
          localMarketStockVo.setCje(((Stock2955Vo)localObject3).cje);
          localMarketStockVo.setType(((Stock2955Vo)localObject3).type);
          localMarketStockVo.ggss = ((Stock2955Vo)localObject3).ggsm;
          paramh = b.a(((Stock2955Vo)localObject3).zsu, b.a(((Stock2955Vo)localObject3).zx, ((Stock2955Vo)localObject3).decLen));
          if (paramh.trim().equals("--"))
          {
            localMarketStockVo.setFiveZf(paramh);
            localMarketStockVo.setLoanable(((Stock2955Vo)localObject3).isLoanable);
            localMarketStockVo.setFiveColor(b.f(((Stock2955Vo)localObject3).zsu + 10000, 10000));
            paramj = n.c(((Stock2955Vo)localObject3).drzjlr - ((Stock2955Vo)localObject3).drzjlc);
            paramh = paramj;
            if (!paramj.contains("-")) {
              paramh = "+" + paramj;
            }
            localMarketStockVo.setJe(paramh);
            localMarketStockVo.setJeColor(b.h(((Stock2955Vo)localObject3).drzjlr - ((Stock2955Vo)localObject3).drzjlc));
            paramh = b.d(((Stock2955Vo)localObject3).hs);
            if (!paramh.trim().equals("--")) {
              break label1393;
            }
            localMarketStockVo.setHsl(paramh);
          }
        }
        break;
      case 107: 
        for (;;)
        {
          label990:
          localMarketStockVo.setHslColor(-857518);
          ((ArrayList)localObject1).add(localMarketStockVo);
          i += 1;
          break label836;
          if ((k != 107) || (m != 0)) {
            break;
          }
          i = 0;
          for (;;)
          {
            if (i < j) {}
            try
            {
              paramh = new MarketStockVo();
              paramj = ((q)localObject2).l();
              localObject3 = ((q)localObject2).l();
              paramh.setStockCode(paramj);
              paramh.setStockName((String)localObject3);
              paramh.setDecl(((q)localObject2).b());
              paramh.setType(((q)localObject2).b());
              paramh.setZs(((q)localObject2).h());
              ((q)localObject2).h();
              paramh.setZxData(((q)localObject2).h());
              ((q)localObject2).h();
              ((q)localObject2).h();
              paramh.setCje(((q)localObject2).h());
              paramh.setLoanable(false);
              ((ArrayList)localObject1).add(paramh);
              i += 1;
            }
            catch (Exception paramh)
            {
              paramh.printStackTrace();
              return;
            }
          }
          this.C.put(Integer.valueOf(this.j.length), localObject1);
          if (this.G == null) {
            break;
          }
          this.G.notifyDataSetChanged();
          return;
          if (paramh.contains("-"))
          {
            localMarketStockVo.setFiveZf(paramh + "%");
            break label990;
          }
          localMarketStockVo.setFiveZf("+" + paramh + "%");
          break label990;
          label1393:
          localMarketStockVo.setHsl(paramh + "%");
        }
        label1421:
        while ((paramh != null) && (paramh.size() == 10))
        {
          paramj = new ArrayList();
          i = 0;
          while (i < 5)
          {
            paramj.add(i, paramh.get(i));
            i += 1;
          }
          paramh = (ArrayList)this.b.get(3);
          paramh.clear();
          paramh.addAll((Collection)localObject1);
          continue;
          paramh = (ArrayList)this.b.get(3);
          if (paramh.size() != 5) {
            break label1919;
          }
          paramh.addAll(5, (Collection)localObject1);
          continue;
          label1527:
          while (i < 5)
          {
            paramj.add(i + 5, paramh.get(paramh.size() - i - 1));
            i += 1;
          }
          paramh.clear();
          a(3, paramj);
        }
        for (;;)
        {
          label1573:
          e();
          return;
          label1578:
          if ((k != 0) || (m != 32928)) {
            break;
          }
          a(1, (ArrayList)localObject1);
        }
        label1599:
        while ((paramh != null) && (paramh.size() == 10))
        {
          paramj = new ArrayList();
          i = 0;
          while (i < 5)
          {
            paramj.add(i, paramh.get(i));
            i += 1;
          }
          paramh = (ArrayList)this.b.get(2);
          paramh.clear();
          paramh.addAll((Collection)localObject1);
          continue;
          paramh = (ArrayList)this.b.get(2);
          if (paramh.size() != 5) {
            break label1916;
          }
          paramh.addAll(5, (Collection)localObject1);
        }
      }
    }
    for (;;)
    {
      if (i < 5)
      {
        paramj.add(i + 5, paramh.get(paramh.size() - i - 1));
        i += 1;
      }
      else
      {
        paramh.clear();
        a(2, paramj);
        break label1573;
        label1916:
        label1919:
        label1922:
        label1931:
        do
        {
          if ((k != 0) || (m != 33273)) {
            break label1573;
          }
          a(4, (ArrayList)localObject1);
          break label1573;
          if (paramj.a != 2206) {
            break;
          }
          paramj = new q(paramj.b);
          i = paramj.e();
          j = paramj.e();
          k = paramj.e();
          paramj.h();
          paramj.h();
          paramj.h();
          paramj.h();
          if (paramh == this.e)
          {
            this.S.d = i;
            this.S.e = j;
            this.S.f = k;
            f();
            return;
          }
          if (paramh != this.d) {
            break;
          }
          this.S.a = i;
          this.S.b = j;
          this.S.c = k;
          f();
          return;
          break label1599;
          break label1421;
          break label582;
          i = 0;
          break label319;
          switch (m)
          {
          }
          paramh = null;
          break label582;
          i = 0;
          break label688;
          return;
          if ((k != 0) || (m != 33272)) {
            break label1578;
          }
          switch (j)
          {
          }
          paramh = null;
          break label1421;
          i = 0;
          break label1527;
        } while ((k != 0) || (m != 38032));
        switch (j)
        {
        }
        paramh = null;
        break label1599;
        i = 0;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if ((com.android.dazhihui.g.a().L()) && (paramh != null) && ((paramh instanceof com.android.dazhihui.a.b.m)))
    {
      showShortToast(2131166193);
      Log.i("s2978", "handleTimeout " + ((com.android.dazhihui.a.b.m)paramh).v());
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    showShortToast(2131166192);
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onPause()
  {
    super.onPause();
    com.android.dazhihui.a.g.a().b(this.O);
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.O == null) {
      this.O = new ac(this);
    }
    com.android.dazhihui.a.g.a().a(this.O);
  }
  
  public void refresh()
  {
    super.refresh();
    this.T = a.format(new Date());
    if (this.b.size() == 0)
    {
      i = 0;
      while (i < this.j.length)
      {
        ArrayList localArrayList = new ArrayList();
        this.b.add(localArrayList);
        i += 1;
      }
    }
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j == 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    this.c = a(" 自动包 ");
    this.c.a("沪深市场2----自动包  NioRequest TIME=" + this.T);
    registRequestListener(this.c);
    setAutoRequest(this.c);
    startAutoRequestPeriod();
    sendRequest(this.c);
    d();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
  
  public void show()
  {
    super.show();
    refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */