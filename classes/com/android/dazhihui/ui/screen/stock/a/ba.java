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
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.market.MarketHSListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import java.util.ArrayList;

public class ba
  extends l
{
  private ArrayList<ArrayList<MarketStockVo>> a = new ArrayList();
  private com.android.dazhihui.a.b.m b;
  private com.android.dazhihui.a.b.m c;
  
  public ba()
  {
    this.k = 11;
    this.j = new String[] { "创新层", "基础层", "成交量", "涨幅榜", "跌幅榜" };
    this.y = null;
    this.x = null;
  }
  
  private com.android.dazhihui.a.b.m a()
  {
    x[] arrayOfx = new x[5];
    arrayOfx[0] = a(29, 33273, 0, 2, 12);
    arrayOfx[0].c("新三板-成交量");
    arrayOfx[1] = a(29, 33272, 0, 1, 10);
    arrayOfx[1].c("新三板-涨幅榜");
    arrayOfx[2] = a(29, 33272, 1, 1, 11);
    arrayOfx[2].c("新三板-跌幅榜");
    arrayOfx[3] = a(124, 33273, 0, 1, 10);
    arrayOfx[3].c("新三板-基础层");
    arrayOfx[4] = a(125, 33273, 0, 1, 10);
    arrayOfx[4].c("新三板-创新层");
    return new com.android.dazhihui.a.b.m(arrayOfx);
  }
  
  private x a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    x localx = new x(2955);
    localx.c(paramInt1);
    localx.c(paramInt2);
    localx.b(paramInt4);
    localx.b(paramInt3);
    localx.c(0);
    localx.c(paramInt5);
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
    case 3: 
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 0);
    case 4: 
      return new MarketHSListAdapter(null, 0, getActivity(), this.Q, 0);
    }
    return new MarketHSListAdapter(null, 5, getActivity(), this.Q, 0);
  }
  
  public void d(int paramInt)
  {
    Bundle localBundle = new Bundle();
    Intent localIntent = null;
    if ((paramInt == 3) || (paramInt == 4))
    {
      localBundle.putParcelable("market_vo", MarketManager.get().getMarketVoByName("新三板"));
      if (paramInt == 3)
      {
        localBundle.putByte("SortType", (byte)0);
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
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
        localBundle.putParcelable("market_vo", MarketManager.get().getMarketVoByName("新三板"));
        localBundle.putInt("sequenceID", 2);
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
      }
      else if (paramInt == 0)
      {
        localBundle.putParcelable("market_vo", new MarketVo("创新层", true, false, -100));
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
      }
      else if (paramInt == 1)
      {
        localBundle.putParcelable("market_vo", new MarketVo("基础层", true, false, -100));
        localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
      }
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    for (;;)
    {
      int j;
      int m;
      int i;
      try
      {
        if ((paramh != this.b) && (paramh != this.c)) {
          break;
        }
        paramh.a(Boolean.FALSE);
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh == null) || (paramh.a != 2955)) {
          break;
        }
        paramj = new q(paramh.b);
        j = paramj.e();
        int k = paramj.e();
        paramj.e();
        m = paramj.e();
        paramh = new ArrayList();
        if ((j != 29) && (j != 124) && (j != 125)) {
          break;
        }
        Stock2955Vo localStock2955Vo = new Stock2955Vo();
        i = 0;
        if (i < m)
        {
          MarketStockVo localMarketStockVo = new MarketStockVo();
          localStock2955Vo.decode(paramj, j, k);
          localMarketStockVo.setStockCode(localStock2955Vo.code);
          localMarketStockVo.setStockName(localStock2955Vo.name);
          localMarketStockVo.setDecl(localStock2955Vo.decLen);
          localMarketStockVo.setZs(localStock2955Vo.zshou);
          localMarketStockVo.setZxData(localStock2955Vo.zx);
          localMarketStockVo.setCje(localStock2955Vo.cje);
          localMarketStockVo.setCjl(localStock2955Vo.cjl);
          localMarketStockVo.setCjl_dw(localStock2955Vo.cjldw);
          localMarketStockVo.setType(localStock2955Vo.type);
          paramh.add(localMarketStockVo);
          i += 1;
          continue;
        }
        if ((j == 29) && (m == 10))
        {
          a(3, paramh);
          e();
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      if ((j == 29) && (m == 11))
      {
        paramj = new ArrayList();
        i = 0;
        while (i < 10)
        {
          paramj.add(i, paramh.get(i));
          i += 1;
        }
        a(4, paramj);
      }
      else if ((j == 29) && (m == 12))
      {
        paramj = new ArrayList();
        i = 0;
        while (i < 10)
        {
          paramj.add(i, paramh.get(i));
          i += 1;
        }
        a(2, paramj);
      }
      else if (j == 124)
      {
        a(1, paramh);
      }
      else if (j == 125)
      {
        a(0, paramh);
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
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
        a(i, localArrayList);
        i += 1;
      }
    }
    this.c = a();
    this.c.a("新三板----单次包 NioRequest");
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
      this.b.a("新三板----自动包  NioRequest");
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */