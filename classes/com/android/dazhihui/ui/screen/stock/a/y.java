package com.android.dazhihui.ui.screen.stock.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class y
  extends l
{
  private ViewGroup R;
  private View.OnClickListener S = null;
  private View T;
  private ArrayList<ArrayList<MarketStockVo>> a = new ArrayList();
  private final int b = 60010;
  private m c;
  private Vector<String> d = new Vector();
  private ViewGroup e;
  
  public y()
  {
    this.k = 4;
    this.j = new String[] { "港股通", "AH股", "国企股", "香港主板", "红筹股", "蓝筹股" };
    this.y = new String[] { "恒生指数", "国企指数", "红筹指数" };
    this.x = new int[] { 39, 34, 31, 35, 32, 33 };
    this.d.add("HKHSI");
    this.d.add("HKHSCEI");
    this.d.add("HKHSCCI");
  }
  
  private x a(int paramInt1, int paramInt2)
  {
    x localx = new x(2955);
    localx.c(paramInt1);
    localx.c(0);
    localx.b(1);
    localx.b(paramInt2);
    localx.c(0);
    localx.c(3);
    localx.c("市场-港股");
    return localx;
  }
  
  private x a(int paramInt, Vector<String> paramVector)
  {
    x localx = new x(2955);
    localx.c(paramInt);
    localx.c(0);
    localx.a(paramVector);
    localx.c("市场-港股");
    return localx;
  }
  
  private void a()
  {
    x[] arrayOfx = new x[13];
    arrayOfx[(this.j.length * 2)] = a(60010, this.d);
    int i = 0;
    while (i < this.x.length)
    {
      arrayOfx[i] = a(this.x[i], 0);
      arrayOfx[(this.x.length + i)] = a(this.x[i], 1);
      i += 1;
    }
    this.c = new m(arrayOfx);
    registRequestListener(this.c);
  }
  
  private void a(int paramInt, ArrayList<MarketStockVo> paramArrayList)
  {
    int k = 0;
    if (paramInt == 60010)
    {
      this.C.put(Integer.valueOf(this.j.length), paramArrayList);
      if (this.G != null) {
        this.G.notifyDataSetChanged();
      }
    }
    label197:
    for (;;)
    {
      return;
      int i = 0;
      for (;;)
      {
        if (i >= this.x.length) {
          break label197;
        }
        if (paramInt == this.x[i])
        {
          ArrayList localArrayList = (ArrayList)this.a.get(i);
          localArrayList.addAll(paramArrayList);
          if (localArrayList.size() != 6) {
            break;
          }
          paramArrayList = new ArrayList();
          paramInt = 0;
          int j;
          for (;;)
          {
            j = k;
            if (paramInt >= 3) {
              break;
            }
            paramArrayList.add(paramInt, localArrayList.get(paramInt));
            paramInt += 1;
          }
          while (j < 3)
          {
            paramArrayList.add(j + 3, localArrayList.get(localArrayList.size() - j - 1));
            j += 1;
          }
          paramArrayList = this.P.obtainMessage(i, paramArrayList);
          this.P.sendMessage(paramArrayList);
          localArrayList.clear();
          return;
        }
        i += 1;
      }
    }
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.S = paramOnClickListener;
    if ((this.S != null) && (this.e != null))
    {
      this.e.setVisibility(0);
      this.e.setOnClickListener(this.S);
    }
    if ((this.S != null) && (this.R != null))
    {
      this.R.setVisibility(0);
      this.R.setOnClickListener(this.S);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {
      ((ImageView)this.e.findViewById(2131559847)).setImageResource(2130838935);
    }
  }
  
  public void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (z.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.T == null);
      this.T.findViewById(2131559843).setBackgroundColor(getResources().getColor(2131493551));
      this.T.findViewById(2131559846).setBackgroundColor(getResources().getColor(2131493551));
      this.T.findViewById(2131559840).setBackgroundColor(getResources().getColor(2131493551));
      ((TextView)this.T.findViewById(2131559845)).setTextColor(getActivity().getResources().getColor(2131493563));
      ((TextView)this.T.findViewById(2131559848)).setTextColor(getActivity().getResources().getColor(2131493563));
      ((TextView)this.T.findViewById(2131559842)).setTextColor(getActivity().getResources().getColor(2131493563));
      return;
    } while (this.T == null);
    this.T.findViewById(2131559843).setBackgroundColor(getResources().getColor(2131493614));
    this.T.findViewById(2131559846).setBackgroundColor(getResources().getColor(2131493614));
    this.T.findViewById(2131559840).setBackgroundColor(getResources().getColor(2131493614));
    ((TextView)this.T.findViewById(2131559845)).setTextColor(getActivity().getResources().getColor(2131493626));
    ((TextView)this.T.findViewById(2131559848)).setTextColor(getActivity().getResources().getColor(2131493626));
    ((TextView)this.T.findViewById(2131559842)).setTextColor(getActivity().getResources().getColor(2131493626));
  }
  
  public void d(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.d(paramInt);
      return;
      MarketManager.get().setStatisticsUserAction("", "港股通");
      continue;
      MarketManager.get().setStatisticsUserAction("", "AH股");
      continue;
      MarketManager.get().setStatisticsUserAction("", "国企股");
      continue;
      MarketManager.get().setStatisticsUserAction("", "香港主板");
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i = 0;
    if (this.c == paramh) {
      paramh.a(Boolean.FALSE);
    }
    paramh = (o)paramj;
    if (paramh == null) {
      return;
    }
    paramh = paramh.h();
    if (paramh != null) {}
    try
    {
      if (paramh.a == 2955)
      {
        paramh = new q(paramh.b);
        int j = paramh.e();
        paramh.e();
        paramh.e();
        int k = paramh.e();
        paramj = new ArrayList();
        while (i < k)
        {
          MarketStockVo localMarketStockVo = new MarketStockVo();
          String str1 = paramh.l();
          String str2 = paramh.l();
          localMarketStockVo.setStockCode(str1);
          localMarketStockVo.setStockName(str2);
          localMarketStockVo.setDecl(paramh.b());
          localMarketStockVo.setType(paramh.b());
          localMarketStockVo.setZs(paramh.h());
          paramh.h();
          localMarketStockVo.setZxData(paramh.h());
          paramh.h();
          paramh.h();
          localMarketStockVo.setCje(paramh.h());
          localMarketStockVo.setLoanable(false);
          paramj.add(localMarketStockVo);
          i += 1;
        }
        a(j, paramj);
      }
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    finally
    {
      e();
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.c)
    {
      if (paramh.j() == Boolean.TRUE) {}
      paramh.a(Boolean.FALSE);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.c)
    {
      if (paramh.j() == Boolean.TRUE) {
        showShortToast(2131166192);
      }
      paramh.a(Boolean.FALSE);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.T = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.e = ((ViewGroup)this.T.findViewById(2131559846));
    if (this.S != null)
    {
      this.e.setVisibility(0);
      this.e.setOnClickListener(this.S);
    }
    if ((this.S != null) && (this.R == null))
    {
      this.R = ((ViewGroup)this.T.findViewById(2131559840));
      this.R.setVisibility(0);
      this.R.setOnClickListener(this.S);
    }
    changeLookFace(this.mLookFace);
    return this.T;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.a.size() == 0)
    {
      int i = 0;
      while (i < this.j.length)
      {
        ArrayList localArrayList = new ArrayList();
        this.a.add(localArrayList);
        i += 1;
      }
    }
    a();
    this.c.a(Boolean.TRUE);
    sendRequest(this.c);
    d();
  }
  
  public void show()
  {
    super.show();
    refresh();
    c();
    if ((this.S != null) && (this.R == null))
    {
      this.R = ((ViewGroup)this.T.findViewById(2131559840));
      this.R.setVisibility(0);
      this.R.setOnClickListener(this.S);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */