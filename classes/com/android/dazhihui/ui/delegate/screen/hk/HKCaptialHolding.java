package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.delegate.domain.HKCapitalData;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class HKCaptialHolding
  extends com.android.dazhihui.ui.delegate.screen.ad
{
  public static final Comparator<String[]> i = new ae();
  private int A = -1;
  private Vector<String[]> B;
  private Vector<String[]> C;
  private Vector<Integer> D;
  private TextView E;
  private TextView F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private DropDownCurrencyView L = null;
  private boolean M = true;
  private View N;
  private com.android.dazhihui.a.b.u O = null;
  private com.android.dazhihui.a.b.u P = null;
  private com.android.dazhihui.a.b.u Q = null;
  private com.android.dazhihui.a.b.u R = null;
  private int S = 0;
  private f T = new ad(this);
  protected boolean c = true;
  protected int d = 0;
  protected int e = 0;
  protected int f = 0;
  Handler g = new ab(this);
  Runnable h = new ac(this);
  private int j = com.android.dazhihui.ui.a.m.a().H();
  private int k = 0;
  private String[] l = bk.m;
  private String[] m = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1003" };
  private String[] n = { "资产", "币种", "市值", "盈亏", "可用", "冻结" };
  private String[] o = { "6029", "1087", "1065", "1064", "1078", "1053" };
  private HKCapitalData p;
  private HKCapitalData q;
  private HKCapitalData r;
  private HKCapitalData s;
  private int t;
  private ListView u;
  private af v;
  private RelativeLayout w;
  private LinearLayout x;
  private View y;
  private ImageView z;
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2939);
    arrayOfx[0].a(paramString1);
    arrayOfx[1] = new x(2939);
    arrayOfx[1].a(paramString2);
    paramString1 = new com.android.dazhihui.a.b.m(arrayOfx);
    registRequestListener(paramString1);
    a(paramString1, paramBoolean);
  }
  
  private void c(String paramString)
  {
    StockVo localStockVo = new StockVo("", paramString, 1, false);
    Bundle localBundle = new Bundle();
    localBundle.putString("code", paramString);
    r.a(getActivity(), localStockVo, localBundle);
  }
  
  private void e()
  {
    if (this.S == 0)
    {
      b();
      return;
    }
    c();
  }
  
  public void a(boolean paramBoolean)
  {
    this.R = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15002").h()) });
    registRequestListener(this.R);
    a(this.R, true);
  }
  
  public void b()
  {
    this.P = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15004").h()) });
    registRequestListener(this.P);
    a(this.P, true);
  }
  
  public void c()
  {
    this.Q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15052").h()) });
    registRequestListener(this.Q);
    a(this.Q, true);
  }
  
  protected void c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      localObject1 = null;
    }
    while (localObject1 == null)
    {
      return;
      localObject1 = this.p;
      continue;
      localObject1 = this.q;
      continue;
      localObject1 = this.r;
      continue;
      localObject1 = this.s;
    }
    TextView localTextView = this.F;
    Object localObject2;
    if (((HKCapitalData)localObject1).getProperty() == null)
    {
      localObject2 = "--";
      localTextView.setText((CharSequence)localObject2);
      localTextView = this.G;
      if (((HKCapitalData)localObject1).getCurrency() != null) {
        break label220;
      }
      localObject2 = "--";
      label111:
      localTextView.setText((CharSequence)localObject2);
      localTextView = this.H;
      if (((HKCapitalData)localObject1).getValue() != null) {
        break label228;
      }
      localObject2 = "--";
      label134:
      localTextView.setText((CharSequence)localObject2);
      localTextView = this.I;
      if (((HKCapitalData)localObject1).getProfit() != null) {
        break label240;
      }
      localObject2 = "--";
      label157:
      localTextView.setText((CharSequence)localObject2);
      localTextView = this.J;
      if (((HKCapitalData)localObject1).getAvailable() != null) {
        break label252;
      }
      localObject2 = "--";
      label180:
      localTextView.setText((CharSequence)localObject2);
      localObject2 = this.K;
      if (((HKCapitalData)localObject1).getFrozen() != null) {
        break label264;
      }
    }
    label220:
    label228:
    label240:
    label252:
    label264:
    for (Object localObject1 = "--";; localObject1 = bk.c(((HKCapitalData)localObject1).getFrozen(), 2))
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      return;
      localObject2 = bk.c(((HKCapitalData)localObject1).getProperty(), 2);
      break;
      localObject2 = ((HKCapitalData)localObject1).getCurrency();
      break label111;
      localObject2 = bk.c(((HKCapitalData)localObject1).getValue(), 2);
      break label134;
      localObject2 = bk.c(((HKCapitalData)localObject1).getProfit(), 2);
      break label157;
      localObject2 = bk.c(((HKCapitalData)localObject1).getAvailable(), 2);
      break label180;
    }
  }
  
  public void d()
  {
    this.M = true;
    this.A = -1;
    this.D.removeAllElements();
    this.B.removeAllElements();
    this.C.removeAllElements();
    this.v.notifyDataSetChanged();
    a(true);
  }
  
  protected void d(int paramInt)
  {
    if (paramInt == 0)
    {
      this.x.setVisibility(0);
      this.y.setVisibility(8);
    }
    for (;;)
    {
      this.F.setText("--");
      this.G.setText("--");
      this.H.setText("--");
      this.I.setText("--");
      this.J.setText("--");
      this.K.setText("--");
      return;
      this.x.setVisibility(8);
      this.y.setVisibility(0);
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i3 = 0;
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
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
              do
              {
                return;
                if (!(paramj instanceof v)) {
                  break;
                }
                paramj = ((v)paramj).b();
              } while (!com.android.dazhihui.ui.delegate.b.u.a(paramj, getActivity()));
              int i1;
              int i2;
              if (paramh == this.R)
              {
                paramj = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
                if (!paramj.b())
                {
                  paramh = Toast.makeText(getActivity(), paramj.d(), 0);
                  paramh.setGravity(17, 0, 0);
                  paramh.show();
                  return;
                }
                if (this.M) {
                  e();
                }
                this.M = false;
                this.t = paramj.g();
                this.f = paramj.b("1289");
                this.v.a(this.f);
                if (this.t == 0)
                {
                  this.u.setBackgroundResource(2130838490);
                  return;
                }
                this.u.setBackgroundColor(getResources().getColor(2131493677));
                if (this.v.a() != null) {
                  this.u.removeFooterView(this.v.a());
                }
                if (this.t > 0)
                {
                  i1 = 0;
                  while (i1 < this.t)
                  {
                    String[] arrayOfString = new String[this.m.length];
                    i2 = 0;
                    if (i2 < this.m.length)
                    {
                      if (paramj.a(i1, this.m[i2]) == null) {}
                      for (paramh = "";; paramh = paramj.a(i1, this.m[i2]))
                      {
                        arrayOfString[i2] = paramh;
                        i2 += 1;
                        break;
                      }
                    }
                    if (arrayOfString[1].length() == 0) {
                      arrayOfString[1] = bk.c(arrayOfString[2], bk.a(arrayOfString[4], arrayOfString[6]).toString()).toString();
                    }
                    if (bk.a(arrayOfString[9], this.S)) {
                      this.B.add(arrayOfString);
                    }
                    this.C.add(arrayOfString);
                    i1 += 1;
                  }
                  Collections.sort(this.B, i);
                  i2 = 0;
                  if (i2 < this.B.size())
                  {
                    paramj = ((String[])this.B.get(i2))[2];
                    if (paramj != null)
                    {
                      paramh = paramj;
                      if (!paramj.equals("--")) {}
                    }
                    else
                    {
                      paramh = "0";
                    }
                    double d1 = Double.parseDouble(paramh);
                    if (d1 == 0.0D) {
                      i1 = -16777216;
                    }
                    for (;;)
                    {
                      this.D.add(new Integer(i1));
                      i2 += 1;
                      break;
                      if (d1 > 0.0D) {
                        i1 = -65536;
                      } else {
                        i1 = getResources().getColor(2131492932);
                      }
                    }
                  }
                }
                if (this.B.size() == 0)
                {
                  this.u.removeFooterView(this.v.a());
                  this.z.setVisibility(0);
                }
                for (;;)
                {
                  this.v.notifyDataSetInvalidated();
                  return;
                  this.z.setVisibility(8);
                }
              }
              if (paramh == this.Q)
              {
                paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
                if (!paramh.b())
                {
                  b(paramh.d());
                  return;
                }
                this.q = new HKCapitalData();
                this.q.setCurrency("港币HKD");
                this.r = new HKCapitalData();
                this.r.setCurrency("美元USD");
                this.s = new HKCapitalData();
                this.s.setCurrency("人民币CNY");
                i1 = 0;
                i2 = i3;
                if (i1 < paramh.g())
                {
                  if ("CNY".equals(paramh.a(i1, "1311")))
                  {
                    this.s.setBalance(paramh.a(i1, "1077"));
                    this.s.setFrozen(paramh.a(i1, "1053"));
                    this.s.setExchangeRate(paramh.a(i1, "5002"));
                    this.s.setAvailable(bk.d(this.s.getBalance(), this.s.getFrozen()).toString());
                  }
                  for (;;)
                  {
                    i1 += 1;
                    break;
                    if ("HKD".equals(paramh.a(i1, "1311")))
                    {
                      this.q.setBalance(paramh.a(i1, "1077"));
                      this.q.setFrozen(paramh.a(i1, "1053"));
                      this.q.setExchangeRate(paramh.a(i1, "5002"));
                      this.q.setAvailable(bk.d(this.q.getBalance(), this.q.getFrozen()).toString());
                    }
                    else if ("USD".equals(paramh.a(i1, "1311")))
                    {
                      this.r.setBalance(paramh.a(i1, "1077"));
                      this.r.setFrozen(paramh.a(i1, "1053"));
                      this.r.setExchangeRate(paramh.a(i1, "5002"));
                      this.r.setAvailable(bk.d(this.r.getBalance(), this.r.getFrozen()).toString());
                    }
                  }
                }
                if (i2 < this.C.size())
                {
                  if (("HKEX".equals(((String[])this.C.get(i2))[9])) || ("SZ-B".equals(((String[])this.C.get(i2))[9])) || ("SZB".equals(((String[])this.C.get(i2))[9])) || ("SZ".equals(((String[])this.C.get(i2))[9])))
                  {
                    if ((((String[])this.C.get(i2))[1] != null) && (!"--".equals(((String[])this.C.get(i2))[1]))) {
                      this.q.setValue(bk.c(this.q.getValue(), ((String[])this.C.get(i2))[1]).toString());
                    }
                    if ((((String[])this.C.get(i2))[2] != null) && (!"--".equals(((String[])this.C.get(i2))[2]))) {
                      this.q.setProfit(bk.c(this.q.getProfit(), ((String[])this.C.get(i2))[2]).toString());
                    }
                  }
                  for (;;)
                  {
                    i2 += 1;
                    break;
                    if (("US".equals(((String[])this.C.get(i2))[9])) || ("SH-B".equals(((String[])this.C.get(i2))[9])) || ("SHB".equals(((String[])this.C.get(i2))[9])) || ("SH".equals(((String[])this.C.get(i2))[9])))
                    {
                      if ((((String[])this.C.get(i2))[1] != null) && (!"--".equals(((String[])this.C.get(i2))[1]))) {
                        this.r.setValue(bk.c(this.r.getValue(), ((String[])this.C.get(i2))[1]).toString());
                      }
                      if ((((String[])this.C.get(i2))[2] != null) && (!"--".equals(((String[])this.C.get(i2))[2]))) {
                        this.r.setProfit(bk.c(this.r.getProfit(), ((String[])this.C.get(i2))[2]).toString());
                      }
                    }
                    else if (("SHA".equals(((String[])this.C.get(i2))[9])) || ("SZA".equals(((String[])this.C.get(i2))[9])))
                    {
                      if ((((String[])this.C.get(i2))[1] != null) && (!"--".equals(((String[])this.C.get(i2))[1]))) {
                        this.s.setValue(bk.c(this.s.getValue(), ((String[])this.C.get(i2))[1]).toString());
                      }
                      if ((((String[])this.C.get(i2))[2] != null) && (!"--".equals(((String[])this.C.get(i2))[2]))) {
                        this.s.setProfit(bk.c(this.s.getProfit(), ((String[])this.C.get(i2))[2]).toString());
                      }
                    }
                  }
                }
                this.q.setProperty(bk.c(this.q.getBalance(), this.q.getValue()).toString());
                this.s.setProperty(bk.c(this.s.getBalance(), this.s.getValue()).toString());
                this.r.setProperty(bk.c(this.r.getBalance(), this.r.getValue()).toString());
                c(this.S);
                return;
              }
              if (paramh == this.P)
              {
                paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
                if (!paramh.b())
                {
                  b(paramh.d());
                  return;
                }
                this.p = new HKCapitalData();
                this.p.setValue(paramh.a(0, "1065"));
                this.p.setProfit(paramh.a(0, "1064"));
                this.p.setProperty(paramh.a(0, "1087"));
                this.p.setAvailable(paramh.a(0, "1078"));
                this.p.setFrozen(paramh.a(0, "1053"));
                this.p.setCurrency("港币HKD");
                c(this.S);
                return;
              }
            } while (paramh != this.O);
            paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
            if (!paramh.b())
            {
              paramh = Toast.makeText(getActivity(), paramh.d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            bk.a(paramh);
          } while ((bk.l == null) && (bk.l.size() <= 0));
          a(true);
          return;
        } while (!(paramj instanceof com.android.dazhihui.a.b.o));
        paramh = ((com.android.dazhihui.a.b.o)paramj).h();
      } while ((paramh == null) || (paramh.a != 2939));
      paramh = paramh.b;
    } while ((paramh == null) || (paramh.length == 0));
    paramh = new q(paramh);
    paramj = paramh.l();
    paramh.l();
    paramh.b();
    paramh.b();
    paramh.e();
    paramh.h();
    paramh.h();
    paramh.h();
    paramh.h();
    paramh.h();
    paramh.b();
    paramh.h();
    c(paramj);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.N = paramLayoutInflater.inflate(2130903492, paramViewGroup, false);
    this.u = ((ListView)this.N.findViewById(2131560795));
    this.w = ((RelativeLayout)this.N.findViewById(2131559060));
    this.F = ((TextView)this.N.findViewById(2131560799));
    this.G = ((TextView)this.N.findViewById(2131560800));
    this.H = ((TextView)this.N.findViewById(2131560801));
    this.I = ((TextView)this.N.findViewById(2131560802));
    this.J = ((TextView)this.N.findViewById(2131560804));
    this.K = ((TextView)this.N.findViewById(2131560805));
    this.E = ((TextView)this.N.findViewById(2131558673));
    this.x = ((LinearLayout)this.N.findViewById(2131560803));
    this.y = this.N.findViewById(2131560806);
    this.z = ((ImageView)this.N.findViewById(2131558778));
    if (com.android.dazhihui.ui.delegate.b.o.z != null) {
      this.E.setText(com.android.dazhihui.ui.delegate.b.o.z[0][1]);
    }
    this.L = ((DropDownCurrencyView)this.N.findViewById(2131560797));
    this.L.setOnItemChangeListener(this.T);
    this.D = new Vector();
    this.B = new Vector();
    this.C = new Vector();
    this.v = new af(this, getActivity());
    this.u.setAdapter(this.v);
    this.u.setEmptyView(this.z);
    a(true);
    return this.N;
  }
  
  public void show()
  {
    super.show();
    if ((this.C != null) && (this.B != null) && (this.D != null) && (this.v != null)) {
      d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKCaptialHolding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */