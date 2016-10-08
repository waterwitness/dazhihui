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
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.Stock2990Vo;
import com.android.dazhihui.ui.model.stock.market.MarketHSListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import java.util.ArrayList;

public class az
  extends l
{
  private static final int[][] d = { { 105, 1 }, { 105, 25 }, { 105, 17 }, { 113, 1 }, { 114, 1 } };
  private ArrayList<ArrayList<MarketStockVo>> a = new ArrayList();
  private com.android.dazhihui.a.b.m b;
  private com.android.dazhihui.a.b.m c;
  
  public az()
  {
    this.k = 1;
    this.j = new String[] { "热点", "涨速", "资金", "行业", "概念" };
    this.y = null;
    this.x = null;
  }
  
  private com.android.dazhihui.a.b.m a()
  {
    x[] arrayOfx = new x[10];
    arrayOfx[0] = b(0, 0, 3);
    arrayOfx[0].c("板块市场-综合-涨幅前3");
    arrayOfx[1] = b(1, 0, 4);
    arrayOfx[1].c("板块市场-综合-跌幅前3");
    arrayOfx[2] = b(0, 1, 5);
    arrayOfx[2].c("板块市场-综合-涨速前3");
    arrayOfx[3] = b(1, 1, 6);
    arrayOfx[3].c("板块市场-综合-涨速后3");
    arrayOfx[4] = b(0, 2, 7);
    arrayOfx[4].c("板块市场-综合-资金前3");
    arrayOfx[5] = b(1, 2, 8);
    arrayOfx[5].c("板块市场-综合-资金后3");
    arrayOfx[6] = b(0, 3, 9);
    arrayOfx[6].c("板块市场-行业-涨幅前3");
    arrayOfx[7] = b(1, 3, 10);
    arrayOfx[7].c("板块市场-行业-跌幅前3");
    arrayOfx[8] = b(0, 4, 11);
    arrayOfx[8].c("板块市场-概念-涨幅前3");
    arrayOfx[9] = b(1, 4, 12);
    arrayOfx[9].c("板块市场-概念-跌幅前3");
    return new com.android.dazhihui.a.b.m(arrayOfx);
  }
  
  private x b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = d[paramInt2][0];
    paramInt2 = (byte)d[paramInt2][1];
    x localx = new x(2990);
    localx.c(i);
    localx.d(1085945);
    localx.b(paramInt2);
    localx.b(paramInt1);
    localx.c(0);
    localx.c(paramInt3);
    return localx;
  }
  
  protected MarketListAdapter c(int paramInt)
  {
    return new MarketHSListAdapter(null, paramInt, getActivity(), this.Q, 1);
  }
  
  public void d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4)) {
      return;
    }
    Bundle localBundle = new Bundle();
    int i = d[paramInt][0];
    paramInt = d[paramInt][1];
    if (i == 105) {
      localBundle.putParcelable("market_vo", new MarketVo("板块综合", false, false, -100));
    }
    for (;;)
    {
      localBundle.putInt("plate_list_sequence", paramInt);
      Intent localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      return;
      if (i == 113) {
        localBundle.putParcelable("market_vo", new MarketVo("行业板块", false, false, -100));
      } else if (i == 114) {
        localBundle.putParcelable("market_vo", new MarketVo("概念板块", false, false, -100));
      }
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i;
    int j;
    int k;
    for (;;)
    {
      ArrayList localArrayList;
      Object localObject;
      MarketStockVo localMarketStockVo;
      try
      {
        if ((paramh != this.b) && (paramh != this.c)) {
          break label1108;
        }
        paramh = (o)paramj;
        if (paramh == null) {
          return;
        }
        paramh = paramh.h();
        if ((paramh == null) || ((paramh.a != 2984) && (paramh.a != 2990))) {
          break label1108;
        }
        localArrayList = new ArrayList();
        q localq = new q(paramh.b);
        i = 0;
        if (paramh.a == 2984)
        {
          localq.e();
          j = localq.e();
          i = 0;
          if (i >= j) {
            break label1109;
          }
          localObject = new MarketStockVo();
          ((MarketStockVo)localObject).setModuleCode(localq.l());
          ((MarketStockVo)localObject).setStockName(localq.l());
          localq.b();
          localq.h();
          k = localq.h();
          paramj = b.c(k);
          paramh = paramj;
          if (!paramj.contains("-")) {
            paramh = "+" + paramj;
          }
          ((MarketStockVo)localObject).setBkZf(paramh);
          ((MarketStockVo)localObject).setBkColor(b.h(k));
          ((MarketStockVo)localObject).setModule_id(localq.e());
          localq.l();
          ((MarketStockVo)localObject).setCfgName(localq.l());
          k = localq.b();
          ((MarketStockVo)localObject).setCfgZx(b.a(localq.h(), k));
          ((MarketStockVo)localObject).setCfgZf(b.c(localq.h()));
          localArrayList.add(localObject);
          i += 1;
          continue;
          if ((paramh == null) || (paramh.size() != 6)) {
            break;
          }
          paramj = new ArrayList();
          j = 0;
          if (j >= 3) {
            break label1193;
          }
          paramj.add(j, paramh.get(j));
          j += 1;
          continue;
        }
        if (paramh.a != 2990) {
          break label1105;
        }
        localObject = new Stock2990Vo();
        int m = localq.e();
        int n = localq.h();
        localq.e();
        k = localq.e();
        j = 0;
        i = k;
        if (j >= k) {
          break label1105;
        }
        i = k;
        if (j >= 3) {
          break label1105;
        }
        localMarketStockVo = new MarketStockVo();
        if (!((Stock2990Vo)localObject).decode(localq, m, n)) {
          break label1108;
        }
        localMarketStockVo.setModuleCode(((Stock2990Vo)localObject).code);
        localMarketStockVo.setStockName(((Stock2990Vo)localObject).name);
        if ((k != 6) && (k != 5)) {
          break label1176;
        }
        paramj = b.a(((Stock2990Vo)localObject).zsu, b.a(((Stock2990Vo)localObject).zx, ((Stock2990Vo)localObject).decLen));
        paramh = paramj;
        if (!"--".equals(paramj)) {
          paramh = paramj + "%";
        }
        localMarketStockVo.setBkZf(paramh);
        localMarketStockVo.setBkColor(b.h(((Stock2990Vo)localObject).zsu + 10000, 10000));
        localMarketStockVo.setModule_id(((Stock2990Vo)localObject).cfg);
        localMarketStockVo.setCfgName(((Stock2990Vo)localObject).up_cfg_name);
        localMarketStockVo.setCfgZx(b.a(((Stock2990Vo)localObject).up_cfg_zx, ((Stock2990Vo)localObject).up_cfg_decLen));
        localMarketStockVo.setCfgZf(b.c(((Stock2990Vo)localObject).up_cfg_zf));
        localArrayList.add(localMarketStockVo);
        j += 1;
        continue;
        label615:
        i = ((Stock2990Vo)localObject).drzjlr - ((Stock2990Vo)localObject).drzjlc;
        localMarketStockVo.setBkZf(n.c(i));
        localMarketStockVo.setBkColor(b.g(i));
        continue;
        localMarketStockVo.setBkZf(b.b(((Stock2990Vo)localObject).zx, ((Stock2990Vo)localObject).zshou));
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      label658:
      localMarketStockVo.setBkColor(b.h(((Stock2990Vo)localObject).zx, ((Stock2990Vo)localObject).zshou));
      continue;
      paramh = (ArrayList)this.a.get(0);
      paramh.clear();
      paramh.addAll(localArrayList);
      i = 0;
      continue;
      i = 0;
      paramj = (ArrayList)this.a.get(0);
      paramh = paramj;
      if (paramj.size() != 3) {
        break label1102;
      }
      paramj.addAll(3, localArrayList);
      i = 0;
      paramh = paramj;
      continue;
      paramh = (ArrayList)this.a.get(1);
      paramh.clear();
      paramh.addAll(localArrayList);
      i = 1;
      continue;
      i = 1;
      paramj = (ArrayList)this.a.get(1);
      paramh = paramj;
      if (paramj.size() != 3) {
        break label1102;
      }
      paramj.addAll(3, localArrayList);
      i = 1;
      paramh = paramj;
      continue;
      paramh = (ArrayList)this.a.get(2);
      paramh.clear();
      paramh.addAll(localArrayList);
      i = 2;
      continue;
      i = 2;
      paramj = (ArrayList)this.a.get(2);
      paramh = paramj;
      if (paramj.size() != 3) {
        break label1102;
      }
      paramj.addAll(3, localArrayList);
      i = 2;
      paramh = paramj;
      continue;
      paramh = (ArrayList)this.a.get(3);
      paramh.clear();
      paramh.addAll(localArrayList);
      i = 3;
      continue;
      i = 3;
      paramj = (ArrayList)this.a.get(3);
      paramh = paramj;
      if (paramj.size() != 3) {
        break label1102;
      }
      paramj.addAll(3, localArrayList);
      i = 3;
      paramh = paramj;
      continue;
      paramh = (ArrayList)this.a.get(4);
      paramh.clear();
      paramh.addAll(localArrayList);
      i = 4;
      continue;
      i = 4;
      paramj = (ArrayList)this.a.get(4);
      paramh = paramj;
      if (paramj.size() != 3) {
        break label1102;
      }
      paramj.addAll(3, localArrayList);
      i = 4;
      paramh = paramj;
    }
    for (;;)
    {
      if (j < 3)
      {
        paramj.add(j + 3, paramh.get(paramh.size() - j - 1));
        j += 1;
      }
      else
      {
        paramj = this.P.obtainMessage(i, paramj);
        this.P.sendMessage(paramj);
        paramh.clear();
        e();
        return;
        label1102:
        break;
        label1105:
        break label1113;
        label1108:
        return;
        label1109:
        i = j;
        label1113:
        switch (i)
        {
        }
        i = 0;
        paramh = null;
        break;
        label1176:
        if (k == 8) {
          break label615;
        }
        if (k != 7) {
          break label658;
        }
        break label615;
        label1193:
        j = 0;
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
        i += 1;
      }
    }
    this.c = a();
    this.c.a("板块市场----单次包 NioRequest");
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
      this.b.a("板块市场----自动包  NioRequest");
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */