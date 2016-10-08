package com.android.dazhihui.ui.screen.stock.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.MergeAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketAdapterItmeOnClickListener;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import com.android.dazhihui.ui.screen.stock.PlateListScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.CustomGridView;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhRefreshListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class l
  extends a
  implements cs
{
  protected RelativeLayout[] A;
  protected w B;
  protected HashMap<Integer, ArrayList<MarketStockVo>> C = new HashMap();
  protected HashMap<Integer, Integer> D = new HashMap();
  protected MergeAdapter E = null;
  protected ListView F;
  protected u G;
  protected boolean H = false;
  protected boolean[] I = null;
  protected boolean[] J = null;
  protected String[] K = null;
  public boolean L = true;
  protected int M = -1;
  protected boolean N = false;
  protected com.android.dazhihui.a.u O;
  protected Handler P = new r(this);
  MarketAdapterItmeOnClickListener Q = new s(this);
  private DzhHeader a;
  private CustomGridView b;
  private AdvertView c = null;
  private Toast d;
  private DzhRefreshListView e;
  protected View f;
  protected View g;
  protected View h;
  protected int i = 0;
  protected String[] j = { "板块", "涨跌幅", "5分钟涨跌幅", "资金流", "换手率榜" };
  protected int k = 0;
  public final int l = 0;
  public final int m = 1;
  public final int n = 2;
  public final int o = 3;
  public final int p = 4;
  public final int q = 5;
  public final int r = 6;
  public final int s = 7;
  public final int t = 8;
  public final int u = 9;
  public final int v = 10;
  public final int w = 11;
  protected int[] x = { 39, 34, 31, 35, 32, 33 };
  protected String[] y = null;
  protected MarketListAdapter[] z;
  
  private void a()
  {
    Object localObject = (ViewGroup)this.g.findViewById(2131559812);
    if (8 == this.k)
    {
      ((ViewGroup)localObject).setVisibility(0);
      localObject = this.g.findViewById(2131559813);
      View localView = this.g.findViewById(2131559815);
      ((View)localObject).setOnClickListener(new o(this));
      localView.setOnClickListener(new p(this));
    }
    this.b = ((CustomGridView)this.g.findViewById(2131559492));
    this.G = new u(this);
    this.b.setAdapter(this.G);
    this.b.setOnItemClickListener(new q(this));
  }
  
  protected RelativeLayout a(int paramInt, LayoutInflater paramLayoutInflater)
  {
    int i2 = 0;
    paramLayoutInflater = (RelativeLayout)paramLayoutInflater.inflate(2130903270, null);
    TextView localTextView1 = (TextView)paramLayoutInflater.findViewById(2131559807);
    ImageView localImageView = (ImageView)paramLayoutInflater.findViewById(2131559817);
    TextView localTextView2 = (TextView)paramLayoutInflater.findViewById(2131559815);
    this.B = new w(this, paramInt);
    localTextView1.setOnClickListener(this.B);
    localImageView.setOnClickListener(this.B);
    localTextView2.setOnClickListener(this.B);
    if ((this.I != null) && (this.I.length > paramInt))
    {
      if (this.I[paramInt] != 0)
      {
        i1 = 0;
        localImageView.setVisibility(i1);
      }
    }
    else if ((this.J != null) && (this.J.length > paramInt) && (this.K != null) && (this.K.length == this.J.length))
    {
      localTextView2.setText(this.K[paramInt]);
      if (this.J[paramInt] == 0) {
        break label205;
      }
    }
    label205:
    for (int i1 = i2;; i1 = 8)
    {
      localTextView2.setVisibility(i1);
      localTextView1.setText(this.j[paramInt]);
      return paramLayoutInflater;
      i1 = 4;
      break;
    }
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 < 0) || (paramInt2 >= this.C.size())) {}
    do
    {
      do
      {
        do
        {
          return;
          localObject2 = (ArrayList)this.C.get(Integer.valueOf(paramInt2));
        } while (localObject2 == null);
        if ((paramInt1 != 1) && ((paramInt1 != 8) || (paramInt2 != 0))) {
          break;
        }
      } while ((paramInt3 < 0) || (paramInt3 >= ((ArrayList)localObject2).size()));
      localObject2 = (MarketStockVo)((ArrayList)localObject2).get(paramInt3);
    } while ((((MarketStockVo)localObject2).getModule_id() == 0) || (TextUtils.isEmpty(((MarketStockVo)localObject2).getStockName())));
    MarketVo localMarketVo = new MarketVo(((MarketStockVo)localObject2).getStockName(), false, false, ((MarketStockVo)localObject2).getModule_id());
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putString("code", ((MarketStockVo)localObject2).getModuleCode());
    ((Bundle)localObject1).putParcelable("market_vo", localMarketVo);
    Object localObject2 = new Intent();
    ((Intent)localObject2).putExtras((Bundle)localObject1);
    ((Intent)localObject2).setClass(getActivity(), PlateListScreen.class);
    startActivity((Intent)localObject2);
    return;
    localObject1 = new Vector();
    paramInt1 = 0;
    while (paramInt1 < ((ArrayList)localObject2).size())
    {
      ((Vector)localObject1).add(new StockVo(((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getStockName(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getStockCode(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getType(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).isLoanable(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getZx(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getZf(), ((MarketStockVo)((ArrayList)localObject2).get(paramInt1)).getZd()));
      paramInt1 += 1;
    }
    localObject2 = new Bundle();
    ((Bundle)localObject2).putParcelable("stock_vo", (Parcelable)((Vector)localObject1).get(paramInt3));
    com.android.dazhihui.d.r.a(getActivity(), (Vector)localObject1, paramInt3, (Bundle)localObject2);
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.F != null) && (paramBoolean)) {
      this.F.setSelection(0);
    }
    refresh();
  }
  
  protected void b() {}
  
  public void b(int paramInt)
  {
    int i1 = 1;
    int[] arrayOfInt = new int[this.z.length];
    arrayOfInt[0] = 0;
    if ((this.k == 4) || (this.k == 5)) {
      arrayOfInt[0] = 1;
    }
    for (;;)
    {
      if ((this.M != -1) && (this.c != null)) {
        arrayOfInt[0] += 1;
      }
      int i2 = arrayOfInt[0];
      while (i1 < this.z.length)
      {
        arrayOfInt[i1] = (i2 + (this.z[(i1 - 1)].getCount() + 1));
        i2 = arrayOfInt[i1];
        i1 += 1;
      }
      if (this.k == 8) {
        arrayOfInt[0] = 1;
      }
    }
    i1 = 0;
    if (i1 < arrayOfInt.length) {
      if (i1 < arrayOfInt.length - 1)
      {
        if ((arrayOfInt[i1] >= paramInt) || (paramInt >= arrayOfInt[(i1 + 1)])) {
          break label187;
        }
        paramInt = paramInt - arrayOfInt[i1] - 1;
      }
    }
    for (;;)
    {
      a(this.k, i1, paramInt);
      return;
      if (arrayOfInt[i1] < paramInt)
      {
        paramInt = paramInt - arrayOfInt[i1] - 1;
      }
      else
      {
        label187:
        i1 += 1;
        break;
        i1 = 0;
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void beforeHidden()
  {
    this.L = false;
    super.beforeHidden();
  }
  
  protected MarketListAdapter c(int paramInt)
  {
    return new MarketListAdapter(null, paramInt, getActivity(), this.Q);
  }
  
  public void c()
  {
    d locald = d.a();
    int i1 = locald.b("IS_FIRST_IN_MINUTE_HK", 0);
    locald.g();
    if ((i1 == 0) && (this.k == 4))
    {
      new com.android.dazhihui.ui.delegate.screen.hk.o(getActivity()).show();
      locald.a("IS_FIRST_IN_MINUTE_HK", 1);
      locald.g();
    }
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (t.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      Object localObject;
      int i2;
      int i1;
      TextView localTextView1;
      TextView localTextView2;
      do
      {
        return;
        if (this.f != null) {
          this.f.setBackgroundColor(getActivity().getResources().getColor(2131493540));
        }
        if (this.z != null)
        {
          localObject = this.z;
          i2 = localObject.length;
          i1 = 0;
          while (i1 < i2)
          {
            localTextView1 = localObject[i1];
            localTextView1.changeLookFace(paramy);
            localTextView1.notifyDataSetChanged();
            i1 += 1;
          }
        }
        if (this.A != null)
        {
          localObject = this.A;
          i2 = localObject.length;
          i1 = 0;
          while (i1 < i2)
          {
            localTextView1 = localObject[i1];
            localTextView1.setBackgroundResource(2130838731);
            ((TextView)localTextView1.findViewById(2131559807)).setTextColor(getActivity().getResources().getColor(2131493549));
            localTextView2 = (TextView)localTextView1.findViewById(2131559815);
            localTextView2.setBackgroundResource(2130838712);
            localTextView2.setTextColor(getActivity().getResources().getColor(2131493553));
            ((ImageView)localTextView1.findViewById(2131559817)).setImageResource(2130838713);
            i1 += 1;
          }
        }
        if (this.g != null)
        {
          this.g.setBackgroundColor(getActivity().getResources().getColor(2131493540));
          localObject = (ViewGroup)this.g.findViewById(2131559812);
          localTextView1 = (TextView)this.g.findViewById(2131559814);
          if (localObject != null) {
            ((ViewGroup)localObject).setBackgroundResource(2130838731);
          }
          if (localTextView1 != null) {
            localTextView1.setTextColor(getActivity().getResources().getColor(2131493549));
          }
          localObject = (TextView)this.g.findViewById(2131559815);
          if (localObject != null)
          {
            ((TextView)localObject).setBackgroundResource(2130838712);
            ((TextView)localObject).setTextColor(getActivity().getResources().getColor(2131493553));
          }
          localObject = (ImageView)this.g.findViewById(2131559813);
          if (localObject != null) {
            ((ImageView)localObject).setImageResource(2130838713);
          }
        }
        if (this.G != null) {
          this.G.a(paramy);
        }
        if (this.b != null) {
          this.b.a(paramy);
        }
      } while (this.F == null);
      this.F.setDivider(getActivity().getResources().getDrawable(2130838716));
      return;
      if (this.f != null) {
        this.f.setBackgroundColor(getActivity().getResources().getColor(2131493603));
      }
      if (this.z != null)
      {
        localObject = this.z;
        i2 = localObject.length;
        i1 = 0;
        while (i1 < i2)
        {
          localTextView1 = localObject[i1];
          localTextView1.changeLookFace(paramy);
          localTextView1.notifyDataSetChanged();
          i1 += 1;
        }
      }
      if (this.A != null)
      {
        localObject = this.A;
        i2 = localObject.length;
        i1 = 0;
        while (i1 < i2)
        {
          localTextView1 = localObject[i1];
          localTextView1.setBackgroundResource(2130838813);
          ((TextView)localTextView1.findViewById(2131559807)).setTextColor(getActivity().getResources().getColor(2131493612));
          localTextView2 = (TextView)localTextView1.findViewById(2131559815);
          localTextView2.setBackgroundResource(2130838795);
          localTextView2.setTextColor(getActivity().getResources().getColor(2131493616));
          ((ImageView)localTextView1.findViewById(2131559817)).setImageResource(2130838796);
          i1 += 1;
        }
      }
      if (this.g != null)
      {
        this.g.setBackgroundColor(getActivity().getResources().getColor(2131493603));
        localObject = (ViewGroup)this.g.findViewById(2131559812);
        localTextView1 = (TextView)this.g.findViewById(2131559814);
        if (localObject != null) {
          ((ViewGroup)localObject).setBackgroundResource(2130838813);
        }
        if (localTextView1 != null) {
          localTextView1.setTextColor(getActivity().getResources().getColor(2131493612));
        }
        localObject = (TextView)this.g.findViewById(2131559815);
        if (localObject != null)
        {
          ((TextView)localObject).setBackgroundResource(2130838795);
          ((TextView)localObject).setTextColor(getActivity().getResources().getColor(2131493616));
        }
        localObject = (ImageView)this.g.findViewById(2131559813);
        if (localObject != null) {
          ((ImageView)localObject).setImageResource(2130838796);
        }
      }
      if (this.G != null) {
        this.G.a(paramy);
      }
      if (this.b != null) {
        this.b.a(paramy);
      }
    } while (this.F == null);
    this.F.setDivider(getActivity().getResources().getDrawable(2130838798));
  }
  
  public void createTitleObj(Context paramContext, ct paramct) {}
  
  public void d()
  {
    if (this.a != null)
    {
      this.a.setMoreRefresh(true);
      this.a.a();
    }
  }
  
  public void d(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("market_vo", new MarketVo(this.j[paramInt].replaceAll(" ", ""), false, false, this.x[paramInt]));
    Intent localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
    localIntent.putExtras(localBundle);
    startActivity(localIntent);
  }
  
  public void e()
  {
    if (this.a != null) {
      this.a.b();
    }
    if (this.e != null) {
      this.e.d();
    }
  }
  
  public void e(int paramInt) {}
  
  public void f(int paramInt)
  {
    this.M = paramInt;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleTimeout(h paramh)
  {
    e();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    e();
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = getView();
    if ((this.M != -1) && (paramBundle != null) && (getActivity() != null) && (this.k != 4) && (this.k != 5))
    {
      paramBundle = (AdvertView)paramBundle.findViewById(2131559801);
      if (paramBundle != null)
      {
        paramBundle.setAdvCode(this.M);
        addAdvert(paramBundle);
      }
    }
    this.d = Toast.makeText(getActivity(), "", 0);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if ((this.k == 4) || (this.k == 5)) {}
    for (this.f = paramLayoutInflater.inflate(2130903279, null);; this.f = paramLayoutInflater.inflate(2130903264, null))
    {
      this.e = ((DzhRefreshListView)this.f.findViewById(2131559793));
      this.e.setScrollingWhileRefreshingEnabled(true);
      this.e.setOnRefreshListener(new m(this));
      this.F = ((ListView)this.e.getRefreshableView());
      this.E = new MergeAdapter();
      this.z = new MarketListAdapter[this.j.length];
      this.A = new RelativeLayout[this.j.length];
      int i1 = 0;
      while (i1 <= this.j.length - 1)
      {
        this.A[i1] = a(i1, paramLayoutInflater);
        this.E.addView(this.A[i1]);
        paramViewGroup = c(i1);
        this.z[i1] = paramViewGroup;
        this.E.addAdapter(paramViewGroup);
        this.z[i1].changeLookFace(this.mLookFace);
        this.z[i1].notifyDataSetChanged();
        i1 += 1;
      }
    }
    if ((this.M != -1) && (!this.N))
    {
      this.c = new AdvertView(getActivity());
      this.c.a(2131493529, 2131493592, 0);
      this.c.setAdvCode(this.M);
      this.c.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      addAdvert(this.c);
      this.F.addHeaderView(this.c);
    }
    for (;;)
    {
      if (this.y != null)
      {
        this.g = LayoutInflater.from(getActivity()).inflate(2130903268, null);
        this.F.addHeaderView(this.g);
        a();
      }
      if (this.i != 0)
      {
        this.h = LayoutInflater.from(getActivity()).inflate(this.i, null);
        this.F.addFooterView(this.h);
      }
      if (this.H)
      {
        this.g = LayoutInflater.from(getActivity()).inflate(2130903274, null);
        this.F.addHeaderView(this.g);
        b();
      }
      this.F.setAdapter(this.E);
      this.F.setOnItemClickListener(new n(this));
      changeLookFace(this.mLookFace);
      return this.f;
      if ((this.M != -1) && (this.N) && ((this.k == 4) || (this.k == 5)))
      {
        paramLayoutInflater = (AdvertView)this.f.findViewById(2131559801);
        if (paramLayoutInflater != null)
        {
          paramLayoutInflater.setAdvCode(this.M);
          addAdvert(paramLayoutInflater);
        }
      }
    }
  }
  
  public void onDetach()
  {
    super.onDetach();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    boolean bool1 = isVisible();
    boolean bool2 = getUserVisibleHint();
    if ((getActivity() != null) && (((getActivity() instanceof MarketListScreenActivity)) || ((getActivity() instanceof SelfStockMoreListScreen))))
    {
      refresh();
      this.mRequestAdapter.startAutoRequestPeriod();
    }
    do
    {
      return;
      if ((getActivity() != null) && ((getActivity() instanceof MainScreen)) && (!this.L))
      {
        beforeHidden();
        return;
      }
    } while ((getActivity() == null) || (!(getActivity() instanceof MainScreen)) || (!this.L) || (!bool1) || (!bool2));
    refresh();
  }
  
  public void refresh()
  {
    super.refresh();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {
      show();
    }
    this.L = paramBoolean;
  }
  
  public void show()
  {
    this.L = true;
    super.show();
  }
  
  public void showShortToast(int paramInt)
  {
    if ((getActivity() == null) || (getActivity().isFinishing())) {}
    String str;
    do
    {
      return;
      str = getActivity().getResources().getString(paramInt);
    } while ((this.d == null) || (TextUtils.isEmpty(str)));
    this.d.setText(str);
    this.d.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */