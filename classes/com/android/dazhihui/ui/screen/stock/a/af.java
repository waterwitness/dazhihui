package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.MergeAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketAdapterItmeOnClickListener;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MarketIndexView;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhRefreshScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class af
  extends l
{
  private static final String[] Y = { "SH000001", "SZ399001", "SZ399005", "SZ399006", "SZ399300", "SH000003" };
  private static final String[] Z = { "IF0001", "IF0002", "IF0003", "IF0004" };
  private static final String[] aa = { "", "", "", "", "", "" };
  private static final String[] ab = { "SH510050" };
  private static final String[] ac = { "IXNDX", "IXDJIA", "IXSPX", "HKHSI", "IXN225", "IXKSP2" };
  private static final String[] ad = { "上证指数", "深圳指数", "中小板指", "创业板指", "沪深300", "上证B股" };
  private static final String[] ae = { "IF当月连续", "IF下月连续", "IF下季连续", "IF隔季连续" };
  private static final String[] af = { "A50指数...", "A50指数...", "A50指数...", "A50指数...", "A50指数...", "A50指数..." };
  private static final String[] ag = { "50ETF" };
  private static final String[] ah = { "纳斯达克", "道琼斯", "标普500", "恒生指数", "日经225指", "韩国 KOSPI200 指数" };
  protected HashMap<Integer, Integer> R = new HashMap();
  protected MergeAdapter S = null;
  protected al[] T;
  protected boolean U = false;
  MarketAdapterItmeOnClickListener V = new aj(this);
  private MarketIndexView[] W;
  private Vector<String> X = new Vector();
  protected View a;
  private com.android.dazhihui.a.b.m ai;
  private com.android.dazhihui.a.b.m aj;
  private DzhRefreshScrollView ak;
  protected String[] b = { "沪深指数", "股指期货", "富时A50指数期货", "期权", "国际指数" };
  protected int c = 0;
  protected String[] d = null;
  protected HashMap<String, ArrayList<MarketStockVo>> e = new HashMap();
  
  public com.android.dazhihui.a.b.m a()
  {
    this.X.clear();
    x[] arrayOfx = new x[5];
    arrayOfx[0] = new x(2955);
    Object localObject1 = Y;
    int j = localObject1.length;
    int i = 0;
    Object localObject2;
    while (i < j)
    {
      localObject2 = localObject1[i];
      this.X.add(localObject2);
      i += 1;
    }
    arrayOfx[0].c(107);
    arrayOfx[0].c(0);
    arrayOfx[0].a(this.X);
    arrayOfx[0].c("市场-股指-沪深指数");
    arrayOfx[1] = new x(2955);
    this.X.clear();
    localObject1 = Z;
    j = localObject1.length;
    i = 0;
    while (i < j)
    {
      localObject2 = localObject1[i];
      this.X.add(localObject2);
      i += 1;
    }
    arrayOfx[1].c(107);
    arrayOfx[1].c(0);
    arrayOfx[1].a(this.X);
    arrayOfx[1].c("市场-股指-股指期货");
    arrayOfx[2] = new x(2955);
    this.X.clear();
    localObject1 = ab;
    j = localObject1.length;
    i = 0;
    while (i < j)
    {
      localObject2 = localObject1[i];
      this.X.add(localObject2);
      i += 1;
    }
    arrayOfx[2].c(107);
    arrayOfx[2].c(0);
    arrayOfx[2].a(this.X);
    arrayOfx[2].c("市场-股指-期权");
    arrayOfx[3] = new x(2955);
    this.X.clear();
    localObject1 = ac;
    j = localObject1.length;
    i = 0;
    while (i < j)
    {
      localObject2 = localObject1[i];
      this.X.add(localObject2);
      i += 1;
    }
    arrayOfx[3].c(107);
    arrayOfx[3].c(0);
    arrayOfx[3].a(this.X);
    arrayOfx[3].c("市场-股指-国际指数");
    localObject1 = MarketManager.get().getMarketVo("富时A50指数期货");
    if (localObject1 != null) {}
    for (i = ((MarketVo)localObject1).getId();; i = 0)
    {
      j = i;
      if (i == 0) {
        j = 32816;
      }
      arrayOfx[4] = new x(2938);
      arrayOfx[4].c(j);
      arrayOfx[4].b(0);
      arrayOfx[4].b(6);
      arrayOfx[4].c(0);
      arrayOfx[4].c(6);
      arrayOfx[4].c("市场-全球-富时A50指数期货");
      return new com.android.dazhihui.a.b.m(arrayOfx);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt1 == 6) {
      localObject = (ArrayList)this.e.get(this.b[0]);
    }
    for (;;)
    {
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        return;
        if (paramInt1 == 4)
        {
          localObject = (ArrayList)this.e.get(this.b[1]);
          continue;
        }
        if (paramInt1 == 8)
        {
          localObject = (ArrayList)this.e.get(this.b[2]);
          continue;
        }
        if (paramInt1 == 1)
        {
          localObject = (ArrayList)this.e.get(this.b[3]);
          continue;
        }
        if (paramInt1 == 7) {
          localObject = (ArrayList)this.e.get(this.b[4]);
        }
      }
      else
      {
        Vector localVector = new Vector();
        paramInt1 = 0;
        while (paramInt1 < ((ArrayList)localObject).size())
        {
          localVector.add(new StockVo(((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getStockName(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getStockCode(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getType(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).isLoanable(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getZx(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getZf(), ((MarketStockVo)((ArrayList)localObject).get(paramInt1)).getZd()));
          paramInt1 += 1;
        }
        com.android.dazhihui.ui.a.m.a().u(paramInt2);
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)localVector.get(paramInt2));
        r.a(getActivity(), localVector, paramInt2, (Bundle)localObject);
        return;
      }
      localObject = null;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    refresh();
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
  }
  
  public void changeLookFace(y paramy)
  {
    int k = 0;
    int j = 0;
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (ak.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      return;
      if (this.a != null) {
        this.a.setBackgroundColor(getActivity().getResources().getColor(2131493540));
      }
      if ((this.W != null) && (this.T != null))
      {
        Object localObject = this.T;
        k = localObject.length;
        int i = 0;
        while (i < k)
        {
          localObject[i].a(paramy);
          i += 1;
        }
        localObject = this.W;
        k = localObject.length;
        i = j;
        while (i < k)
        {
          localObject[i].a(paramy);
          i += 1;
        }
        continue;
        if (this.a != null) {
          this.a.setBackgroundColor(getActivity().getResources().getColor(2131493603));
        }
        if ((this.W != null) && (this.T != null))
        {
          localObject = this.T;
          j = localObject.length;
          i = 0;
          while (i < j)
          {
            localObject[i].a(paramy);
            i += 1;
          }
          localObject = this.W;
          j = localObject.length;
          i = k;
          while (i < j)
          {
            localObject[i].a(paramy);
            i += 1;
          }
        }
      }
    }
  }
  
  public void d(int paramInt)
  {
    Object localObject1 = null;
    Bundle localBundle = new Bundle();
    Object localObject2;
    if (paramInt == 6)
    {
      localObject2 = MarketManager.get().getMarketVo("沪深市场");
      localBundle.putInt("child_index", 1);
      localObject1 = new Intent(getActivity(), MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "沪深指数");
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        return;
        Intent localIntent;
        if (paramInt == 4)
        {
          localObject1 = MarketManager.get().getChildList("商品期货");
          if (((ArrayList)localObject1).size() > 1) {}
          for (localObject1 = (MarketVo)((ArrayList)localObject1).get(1);; localObject1 = new MarketVo("股指期货", true, false, -100))
          {
            localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
            MarketManager.get().setStatisticsUserAction("", "股指期货");
            localObject2 = localObject1;
            localObject1 = localIntent;
            break;
          }
        }
        if (paramInt == 7)
        {
          localObject1 = new Intent(getActivity(), MarketListScreenActivity.class);
          localObject2 = MarketManager.get().getMarketVo("全球指数");
          MarketManager.get().setStatisticsUserAction("", "全球指数");
          continue;
        }
        if (paramInt == 8)
        {
          localObject2 = MarketManager.get().getMarketVo("富时A50指数期货");
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new MarketVo("富时A50指数期货", false, false, 32816);
          }
          localBundle.putInt("sequenceID", 6);
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
          MarketManager.get().setStatisticsUserAction("", "富时A50指数期货");
          localObject2 = localObject1;
          localObject1 = localIntent;
        }
      }
      else
      {
        localBundle.putParcelable("market_vo", (Parcelable)localObject2);
        ((Intent)localObject1).putExtras(localBundle);
        startActivity((Intent)localObject1);
        return;
      }
      localObject2 = null;
    }
  }
  
  public void g(int paramInt)
  {
    if (paramInt == 6) {
      if ((this.T != null) && (this.T.length > 0) && (this.T[0] != null)) {
        this.T[0].notifyDataSetChanged();
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramInt != 4) {
              break;
            }
          } while ((this.T == null) || (this.T.length <= 1) || (this.T[1] == null));
          this.T[1].notifyDataSetChanged();
          return;
          if (paramInt != 8) {
            break;
          }
        } while ((this.T == null) || (this.T.length <= 2) || (this.T[2] == null));
        this.T[2].notifyDataSetChanged();
        return;
        if (paramInt != 1) {
          break;
        }
      } while ((this.T == null) || (this.T.length <= 3) || (this.T[3] == null));
      this.T[3].notifyDataSetChanged();
      return;
    } while ((paramInt != 7) || (this.T == null) || (this.T.length <= 4) || (this.T[4] == null));
    this.T[4].notifyDataSetChanged();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    Object localObject1;
    int k;
    Object localObject2;
    Object localObject3;
    String str1;
    String str2;
    try
    {
      if ((paramh != this.ai) && (paramh != this.aj)) {
        break label1034;
      }
      paramh.a(Boolean.FALSE);
      paramh = (o)paramj;
      if (paramh == null) {
        return;
      }
      paramh = paramh.h();
      this.ak.d();
      if ((paramh != null) && (paramh.a == 2955))
      {
        if (paramh.a != 2955) {
          break label1034;
        }
        localObject1 = new q(paramh.b);
        ((q)localObject1).e();
        ((q)localObject1).e();
        ((q)localObject1).e();
        m = ((q)localObject1).e();
        paramj = "key";
        k = -1;
        localObject2 = new ArrayList();
        j = 0;
        if (j < m)
        {
          localObject3 = new MarketStockVo();
          str1 = ((q)localObject1).l();
          str2 = ((q)localObject1).l();
          n.d("kkk", "code=" + str1 + " name=" + str2);
          i = k;
          paramh = paramj;
          if (k == -1)
          {
            i = k;
            paramh = paramj;
            if (!TextUtils.isEmpty(str1))
            {
              if (!str1.contains(Y[0])) {
                break label342;
              }
              paramh = this.b[0];
              i = 6;
            }
          }
          for (;;)
          {
            ((MarketStockVo)localObject3).setStockCode(str1);
            ((MarketStockVo)localObject3).setStockName(str2);
            ((MarketStockVo)localObject3).setDecl(((q)localObject1).b());
            ((MarketStockVo)localObject3).setType(((q)localObject1).b());
            ((MarketStockVo)localObject3).setZs(((q)localObject1).h());
            ((q)localObject1).h();
            ((MarketStockVo)localObject3).setZxData(((q)localObject1).h());
            ((q)localObject1).h();
            ((q)localObject1).h();
            ((MarketStockVo)localObject3).setCje(((q)localObject1).h());
            ((MarketStockVo)localObject3).setLoanable(false);
            ((ArrayList)localObject2).add(localObject3);
            j += 1;
            k = i;
            paramj = paramh;
            break;
            label342:
            if (str1.contains(Z[0]))
            {
              paramh = this.b[1];
              i = 4;
            }
            else if (str1.contains(ab[0]))
            {
              paramh = this.b[3];
              i = 1;
            }
            else
            {
              i = k;
              paramh = paramj;
              if (str1.contains(ac[0]))
              {
                paramh = this.b[4];
                i = 7;
              }
            }
          }
        }
        if (k != -1)
        {
          this.e.put(paramj, localObject2);
          g(k);
        }
        e();
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    if ((paramh != null) && (paramh.a == 2938))
    {
      paramh = paramh.b;
      if ((paramh != null) && (this.W[2] != null))
      {
        paramh = new q(paramh);
        paramh.e();
        k = paramh.e() - 1;
        paramj = new ArrayList();
        while (k >= 0)
        {
          localObject1 = new MarketStockVo();
          localObject2 = new int[13];
          localObject3 = paramh.l();
          str1 = paramh.l();
          localObject2[0] = 39936;
          try
          {
            i10 = paramh.b();
            paramh.e();
            i9 = paramh.h();
            int i1 = paramh.h();
            i8 = paramh.h();
            i7 = paramh.h();
            i6 = paramh.h();
            i5 = paramh.h();
            i4 = paramh.h();
            i3 = paramh.h();
            j = paramh.h();
            m = paramh.h();
            n = paramh.h();
            i = j;
            i2 = i;
            i = i1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              String str3;
              String str4;
              String str5;
              String str6;
              String str7;
              String str8;
              String str9;
              String str10;
              String str11;
              String str12;
              String str13;
              j = 0;
              int n = 0;
              m = 0;
              int i2 = 0;
              int i3 = 0;
              int i4 = 0;
              int i5 = 0;
              int i6 = 0;
              int i7 = 0;
              int i8 = 0;
              int i9 = 0;
              int i10 = 2;
              i = 0;
            }
          }
          if (i2 == 0) {
            j = i;
          }
          str2 = b.a(i9, i10);
          localObject2[1] = b.h(i9, j);
          str3 = b.c(i9, j);
          localObject2[2] = localObject2[1];
          str4 = b.b(i9, j, i10);
          localObject2[3] = localObject2[1];
          str5 = b.d(m - n, 0);
          localObject2[4] = -1;
          str6 = n.e(b.b(i8));
          localObject2[5] = -16711681;
          str7 = n.g(String.valueOf(m));
          localObject2[6] = 65280;
          str8 = b.a(i3, i10);
          localObject2[7] = b.h(i3, j);
          str9 = b.a(i2, i10);
          localObject2[8] = b.h(i2, j);
          str10 = b.a(i5, i10);
          localObject2[9] = -1;
          str11 = b.a(i7, i10);
          localObject2[10] = b.h(i7, j);
          str12 = b.a(i6, i10);
          localObject2[11] = b.h(i6, j);
          str13 = b.a(i, i10);
          localObject2[12] = -1;
          ((MarketStockVo)localObject1).setStockCode((String)localObject3);
          ((MarketStockVo)localObject1).setStockName(new String[] { str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13 }[0]);
          ((MarketStockVo)localObject1).setDecl(i10);
          ((MarketStockVo)localObject1).setZs(i);
          ((MarketStockVo)localObject1).setZxData(i9);
          ((MarketStockVo)localObject1).setCje(i4);
          ((MarketStockVo)localObject1).setLoanable(false);
          paramj.add(localObject1);
          k -= 1;
        }
        this.e.put(this.b[2], paramj);
        g(8);
      }
    }
    label1034:
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if ((paramh == this.ai) || (paramh == this.aj))
    {
      if (paramh.j() == Boolean.TRUE) {}
      paramh.a(Boolean.FALSE);
      this.ak.d();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((paramh == this.ai) || (paramh == this.aj))
    {
      if (paramh.j() == Boolean.TRUE) {
        showShortToast(2131166192);
      }
      paramh.a(Boolean.FALSE);
      this.ak.d();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903266, null);
    this.ak = ((DzhRefreshScrollView)this.a.findViewById(2131559800));
    this.ak.setScrollingWhileRefreshingEnabled(true);
    this.ak.setOnRefreshListener(new ag(this));
    this.T = new al[5];
    this.W = new MarketIndexView[5];
    this.W[0] = ((MarketIndexView)this.a.findViewById(2131559802));
    this.W[1] = ((MarketIndexView)this.a.findViewById(2131559803));
    this.W[2] = ((MarketIndexView)this.a.findViewById(2131559804));
    this.W[3] = ((MarketIndexView)this.a.findViewById(2131559805));
    this.W[4] = ((MarketIndexView)this.a.findViewById(2131559806));
    this.W[0].setType(6);
    this.W[1].setType(4);
    this.W[2].setType(8);
    this.W[3].setType(1);
    this.W[4].setType(7);
    this.W[0].setTitleText(this.b[0]);
    this.W[1].setTitleText(this.b[1]);
    this.W[2].setTitleText(this.b[2]);
    this.W[3].setTitleText(this.b[3]);
    this.W[4].setTitleText(this.b[4]);
    this.T[0] = new al(this);
    this.T[0].a(6);
    this.T[1] = new al(this);
    this.T[1].a(4);
    this.T[2] = new al(this);
    this.T[2].a(8);
    this.T[3] = new al(this);
    this.T[3].a(1);
    this.T[4] = new al(this);
    this.T[4].a(7);
    this.W[0].setAdapter(this.T[0]);
    this.W[1].setAdapter(this.T[1]);
    this.W[2].setAdapter(this.T[2]);
    this.W[3].setAdapter(this.T[3]);
    this.W[4].setAdapter(this.T[4]);
    paramLayoutInflater = new ah(this);
    this.W[0].setOnItemClickListener(paramLayoutInflater);
    this.W[1].setOnItemClickListener(paramLayoutInflater);
    this.W[2].setOnItemClickListener(paramLayoutInflater);
    this.W[3].setOnItemClickListener(new ai(this));
    this.W[4].setOnItemClickListener(paramLayoutInflater);
    this.W[0].setChangeMoreListener(new an(this, this.W[0].getType()));
    this.W[1].setChangeMoreListener(new an(this, this.W[1].getType()));
    this.W[2].setChangeMoreListener(new an(this, this.W[2].getType()));
    this.W[3].setChangeMoreListener(new an(this, this.W[3].getType()));
    this.W[4].setChangeMoreListener(new an(this, this.W[4].getType()));
    changeLookFace(this.mLookFace);
    return this.a;
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void refresh()
  {
    super.refresh();
    this.aj = a();
    this.aj.a(Boolean.TRUE);
    this.aj.a("市场-股指----单次包 NioRequest");
    registRequestListener(this.aj);
    sendRequest(this.aj);
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j == 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    if (this.ai == null)
    {
      this.ai = a();
      this.ai.a("市场-股指----自动包  NioRequest");
      this.ai.a(Boolean.TRUE);
      registRequestListener(this.ai);
      setAutoRequest(this.ai);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */