package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.market.MarketHSListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import java.util.ArrayList;

public class aa
  extends l
{
  private ArrayList<ArrayList<MarketStockVo>> a = new ArrayList();
  private com.android.dazhihui.a.b.m b;
  private com.android.dazhihui.a.b.m c;
  
  public aa()
  {
    this.k = 0;
    this.j = new String[] { "涨幅榜", "跌幅榜", "5分钟涨跌幅", "资金流", "换手率榜" };
    this.y = null;
    this.x = null;
  }
  
  private com.android.dazhihui.a.b.m a()
  {
    x[] arrayOfx = new x[6];
    arrayOfx[0] = a(33272, 0, 1, 10);
    arrayOfx[0].c("沪深市场-涨幅榜");
    arrayOfx[1] = a(33272, 1, 1, 11);
    arrayOfx[1].c("沪深市场-跌幅榜");
    arrayOfx[2] = a(32928, 0, 25, 5);
    arrayOfx[2].c("沪深市场-5分钟涨跌幅");
    arrayOfx[3] = a(38032, 0, 17, 5);
    arrayOfx[3].c("沪深市场-资金流入");
    arrayOfx[4] = a(38032, 1, 17, 5);
    arrayOfx[4].c("沪深市场-资金流出");
    arrayOfx[5] = a(33273, 0, 21, 5);
    arrayOfx[5].c("沪深市场-换手率榜");
    return new com.android.dazhihui.a.b.m(arrayOfx);
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
  
  private void a(int paramInt, ArrayList<MarketStockVo> paramArrayList)
  {
    paramArrayList = this.P.obtainMessage(paramInt, paramArrayList);
    this.P.sendMessage(paramArrayList);
  }
  
  protected MarketListAdapter c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new MarketHSListAdapter(null, paramInt, getActivity(), this.Q, 0);
    case 0: 
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 0);
    case 1: 
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 0);
    case 2: 
      return new MarketHSListAdapter(null, 1, getActivity(), this.Q, 0);
    case 3: 
      return new MarketHSListAdapter(null, 2, getActivity(), this.Q, 0);
    }
    return new MarketHSListAdapter(null, 3, getActivity(), this.Q, 0);
  }
  
  public void d(int paramInt)
  {
    Bundle localBundle = new Bundle();
    Intent localIntent = null;
    ArrayList localArrayList = MarketManager.get().getChildList("决策");
    if ((paramInt == 0) || (paramInt == 1))
    {
      localBundle.putParcelable("market_vo", MarketManager.get().getMarketVo("沪深市场"));
      if (paramInt == 0)
      {
        localBundle.putByte("SortType", (byte)0);
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "涨跌幅更多");
      }
    }
    for (;;)
    {
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      return;
      localBundle.putByte("SortType", (byte)1);
      break;
      if (paramInt == 2)
      {
        localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(3));
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "五分钟涨跌幅更多");
      }
      else if (paramInt == 3)
      {
        localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(1));
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "资金流更多");
      }
      else if (paramInt == 4)
      {
        localBundle.putParcelable("market_vo", MarketManager.get().getMarketVo("沪深市场"));
        localBundle.putInt("sequenceID", 21);
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        MarketManager.get().setStatisticsUserAction("", "换手率更多");
      }
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int j;
    int k;
    int m;
    ArrayList localArrayList;
    for (;;)
    {
      MarketStockVo localMarketStockVo;
      try
      {
        if ((paramh != this.b) && (paramh != this.c)) {
          break label794;
        }
        paramh.a(Boolean.FALSE);
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh == null) || (paramh.a != 2955)) {
          break label794;
        }
        q localq = new q(paramh.b);
        j = localq.e();
        k = localq.e();
        localq.e();
        m = localq.e();
        localArrayList = new ArrayList();
        if (j != 0) {
          break label794;
        }
        Stock2955Vo localStock2955Vo = new Stock2955Vo();
        i = 0;
        if (i >= m) {
          break;
        }
        localMarketStockVo = new MarketStockVo();
        localStock2955Vo.decode(localq, j, k);
        localMarketStockVo.setStockCode(localStock2955Vo.code);
        localMarketStockVo.setStockName(localStock2955Vo.name);
        localMarketStockVo.setDecl(localStock2955Vo.decLen);
        localMarketStockVo.setZs(localStock2955Vo.zshou);
        localMarketStockVo.setZxData(localStock2955Vo.zx);
        localMarketStockVo.setCje(localStock2955Vo.cje);
        localMarketStockVo.setType(localStock2955Vo.type);
        localMarketStockVo.ggss = localStock2955Vo.ggsm;
        paramh = b.a(localStock2955Vo.zsu, b.a(localStock2955Vo.zx, localStock2955Vo.decLen));
        if (paramh.trim().equals("--"))
        {
          localMarketStockVo.setFiveZf(paramh);
          localMarketStockVo.setLoanable(localStock2955Vo.isLoanable);
          localMarketStockVo.setFiveColor(b.f(localStock2955Vo.zsu + 10000, 10000));
          paramj = n.c(localStock2955Vo.drzjlr - localStock2955Vo.drzjlc);
          paramh = paramj;
          if (!paramj.contains("-")) {
            paramh = "+" + paramj;
          }
          localMarketStockVo.setJe(paramh);
          localMarketStockVo.setJeColor(b.h(localStock2955Vo.drzjlr - localStock2955Vo.drzjlc));
          paramh = b.d(localStock2955Vo.hs);
          if (!paramh.trim().equals("--")) {
            break label501;
          }
          localMarketStockVo.setHsl(paramh);
          localMarketStockVo.setHslColor(-857518);
          localArrayList.add(localMarketStockVo);
          i += 1;
          continue;
        }
        if (paramh.contains("-"))
        {
          localMarketStockVo.setFiveZf(paramh + "%");
          continue;
        }
        localMarketStockVo.setFiveZf("+" + paramh + "%");
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      continue;
      label501:
      localMarketStockVo.setHsl(paramh + "%");
    }
    if ((j == 0) && (k == 33272) && (m == 10)) {
      a(0, localArrayList);
    }
    do
    {
      for (;;)
      {
        e();
        return;
        if ((j == 0) && (k == 33272) && (m == 11))
        {
          paramh = new ArrayList();
          i = 0;
          while (i < 10)
          {
            paramh.add(i, localArrayList.get(i));
            i += 1;
          }
          a(1, paramh);
        }
        else
        {
          if ((j != 0) || (k != 32928)) {
            break;
          }
          a(2, localArrayList);
        }
      }
      if ((j != 0) || (k != 38032)) {
        break;
      }
      paramh = (ArrayList)this.a.get(3);
      paramh.addAll(localArrayList);
    } while (paramh.size() != 10);
    paramj = new ArrayList();
    int i = 0;
    while (i < 5)
    {
      paramj.add(i, paramh.get(i));
      i += 1;
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
        a(3, paramj);
        paramh.clear();
        break;
        if ((j != 0) || (k != 33273)) {
          break;
        }
        a(4, localArrayList);
        break;
        label794:
        return;
        i = 0;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if ((paramh == this.b) || (paramh == this.c)) {
      paramh.a(Boolean.FALSE);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((paramh == this.b) || (paramh == this.c))
    {
      if (paramh.j() == Boolean.TRUE) {
        showShortToast(2131166192);
      }
      paramh.a(Boolean.FALSE);
    }
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.a.size() == 0)
    {
      i = 0;
      while (i < this.j.length)
      {
        ArrayList localArrayList = new ArrayList();
        this.a.add(localArrayList);
        i += 1;
      }
    }
    this.c = a();
    this.c.a(Boolean.TRUE);
    this.c.a("沪深市场----单次包 NioRequest");
    registRequestListener(this.c);
    sendRequest(this.c);
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j == 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    if (this.b == null)
    {
      this.b = a();
      this.b.a("沪深市场----自动包  NioRequest");
      this.b.a(Boolean.TRUE);
      registRequestListener(this.b);
      setAutoRequest(this.b);
    }
    startAutoRequestPeriod();
    d();
  }
  
  public void show()
  {
    super.show();
    refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */