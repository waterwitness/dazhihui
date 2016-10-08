package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.fund.FundAtone;
import com.android.dazhihui.ui.delegate.screen.fund.FundCancelTable;
import com.android.dazhihui.ui.delegate.screen.fund.FundEntrust;
import com.android.dazhihui.ui.delegate.screen.fund.FundListViewPublic;
import com.android.dazhihui.ui.delegate.screen.fund.FundMenu;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import java.util.ArrayList;

public class cd
  extends ad
  implements View.OnClickListener
{
  private boolean A;
  private boolean B;
  private BaseAdapter C;
  protected int c;
  protected int d;
  private LinearLayout e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private LinearLayout i;
  private ArrayList<cf> j = new ArrayList();
  private float k = 1.0F;
  private ListView l;
  private com.android.dazhihui.a.b.u m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private ImageView r;
  private com.android.dazhihui.a.b.u s;
  private String[] t;
  private String[] u;
  private String[] v;
  private String[] w;
  private int x;
  private int y;
  private View z;
  
  public cd()
  {
    String[] arrayOfString;
    if (a.A == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "基金名称";
      arrayOfString[1] = "实际份额";
      arrayOfString[2] = "可用份额";
      arrayOfString[3] = "基金市值";
      arrayOfString[4] = "基金状态";
      arrayOfString[5] = "基金代码";
      this.t = arrayOfString;
      if (a.B != null) {
        break label169;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1092";
      arrayOfString[2] = "1098";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1123";
      arrayOfString[5] = "1090";
    }
    for (;;)
    {
      this.u = arrayOfString;
      this.c = 0;
      this.d = 0;
      this.x = 0;
      this.y = m.a().H();
      this.A = false;
      this.B = true;
      this.C = new ce(this);
      return;
      arrayOfString = a.A;
      break;
      label169:
      arrayOfString = a.B;
    }
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.u paramu)
  {
    this.v = this.t;
    this.w = this.u;
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.h.b(paramu.e());
    if (!localh.b()) {
      b(localh.d());
    }
    do
    {
      return;
      this.c = localh.g();
      this.d = localh.b("1289");
      if (this.c != 0) {
        break;
      }
    } while ((this.x != 0) || (this.c > 0) || (this.d > 0));
    this.r.setVisibility(0);
    this.l.setVisibility(8);
    return;
    if (this.c > 0)
    {
      this.r.setVisibility(8);
      int i1 = 0;
      while (i1 < this.c)
      {
        String[] arrayOfString = new String[this.v.length];
        Object localObject2 = "--";
        String str = "--";
        Object localObject1 = "--";
        paramu = "--";
        int i2 = 0;
        for (;;)
        {
          if (i2 < this.w.length) {
            try
            {
              arrayOfString[i2] = localh.a(i1, this.w[i2]).trim();
              arrayOfString[i2] = o.c(this.w[i2], arrayOfString[i2]);
              if ("1090".equals(this.w[i2]))
              {
                localObject5 = arrayOfString[i2];
                localObject6 = paramu;
                Object localObject3 = localObject2;
                i2 += 1;
                localObject2 = localObject3;
                localObject1 = localObject5;
                paramu = (com.android.dazhihui.ui.delegate.b.u)localObject6;
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                Object localObject5;
                Object localObject6;
                arrayOfString[i2] = "-";
                continue;
                Object localObject4;
                if ("1091".equals(this.w[i2]))
                {
                  localObject4 = arrayOfString[i2];
                  localObject5 = localObject1;
                  localObject6 = paramu;
                }
                else if ("1266".equals(this.w[i2]))
                {
                  localObject6 = arrayOfString[i2];
                  localObject4 = localObject2;
                  localObject5 = localObject1;
                }
                else
                {
                  localObject4 = localObject2;
                  localObject5 = localObject1;
                  localObject6 = paramu;
                  if ("1064".equals(this.w[i2]))
                  {
                    str = arrayOfString[i2];
                    localObject4 = localObject2;
                    localObject5 = localObject1;
                    localObject6 = paramu;
                  }
                }
              }
            }
          }
        }
        this.j.add(new cf(this, arrayOfString, (String)localObject2, (String)localObject1, str, paramu, false));
        i1 += 1;
      }
      this.x += this.c;
      this.y = 10;
      if (this.x < this.d) {
        a(false);
      }
      this.l.setVisibility(0);
      if (ah.a().c().booleanValue()) {
        ah.a().b(this.c, localh);
      }
    }
    this.C.notifyDataSetChanged();
  }
  
  private void c()
  {
    boolean bool = true;
    if ((!o.r()) && (!o.s())) {
      return;
    }
    this.m = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").a("6098", "1").h()) });
    registRequestListener(this.m);
    com.android.dazhihui.a.b.u localu = this.m;
    if (!this.A) {}
    for (;;)
    {
      a(localu, bool);
      return;
      bool = false;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool = true;
    if ((!o.r()) && (!o.s())) {
      return;
    }
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11906").a("1206", this.x).a("1277", this.y).h()) });
    registRequestListener(this.s);
    com.android.dazhihui.a.b.u localu = this.s;
    if ((!this.A) && (paramBoolean)) {}
    for (paramBoolean = bool;; paramBoolean = false)
    {
      a(localu, paramBoolean);
      return;
    }
  }
  
  public void b()
  {
    this.m = null;
    this.s = null;
    this.n.setText("--");
    this.o.setText("--");
    this.p.setText("--");
    this.q.setText("--");
    this.c = 0;
    this.d = 0;
    this.x = 0;
    this.y = m.a().H();
    this.j.clear();
    this.C.notifyDataSetChanged();
    this.l.setVisibility(4);
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    this.B = false;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {
      return;
    }
    if (paramh == this.m)
    {
      Object localObject = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if ((((com.android.dazhihui.ui.delegate.b.h)localObject).b()) && (((com.android.dazhihui.ui.delegate.b.h)localObject).g() > 0))
      {
        String str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1078");
        if ((str == null) || (str.isEmpty())) {
          break label191;
        }
        this.n.setText(str);
        label81:
        str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1266");
        if ((str == null) || (str.isEmpty())) {
          break label203;
        }
        this.q.setText(str);
        label112:
        str = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "6099");
        if ((str == null) || (str.isEmpty())) {
          break label215;
        }
        this.p.setText(str);
        label144:
        localObject = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1079");
        if ((localObject == null) || (((String)localObject).isEmpty())) {
          break label227;
        }
        this.o.setText((CharSequence)localObject);
      }
    }
    for (;;)
    {
      a(true);
      if (paramh != this.s) {
        break;
      }
      a(paramj);
      return;
      label191:
      this.n.setText("--");
      break label81;
      label203:
      this.q.setText("--");
      break label112;
      label215:
      this.p.setText("--");
      break label144;
      label227:
      this.o.setText("--");
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559044: 
      paramView = new Bundle();
      paramView.putInt("screenId", 1);
      a(FundEntrust.class, paramView);
      return;
    case 2131559046: 
      a(FundAtone.class);
      return;
    case 2131559063: 
      paramView = new Bundle();
      paramView.putString("tag", "femx");
      a(FundListViewPublic.class, paramView);
      return;
    case 2131559048: 
      a(FundCancelTable.class);
      return;
    }
    a(FundMenu.class);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getArguments();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.z = paramLayoutInflater.inflate(2130903135, paramViewGroup, false);
    this.r = ((ImageView)this.z.findViewById(2131558778));
    this.l = ((ListView)this.z.findViewById(2131559066));
    this.k = getResources().getDisplayMetrics().density;
    this.n = ((TextView)this.z.findViewById(2131559041));
    this.o = ((TextView)this.z.findViewById(2131559042));
    this.p = ((TextView)this.z.findViewById(2131559040));
    this.q = ((TextView)this.z.findViewById(2131559038));
    paramLayoutInflater = new TextView(getActivity());
    paramLayoutInflater.setGravity(17);
    paramLayoutInflater.setTextColor(-13421773);
    paramLayoutInflater.setGravity(83);
    paramLayoutInflater.setPadding((int)(10.0F * this.k), 0, 0, 0);
    paramLayoutInflater.setTextSize(2, 12.0F);
    paramLayoutInflater.setMinHeight((int)(25.0F * this.k));
    paramLayoutInflater.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    paramLayoutInflater.setText("我的基金");
    this.l.addHeaderView(paramLayoutInflater, null, false);
    this.l.setAdapter(this.C);
    this.e = ((LinearLayout)this.z.findViewById(2131559044));
    this.f = ((LinearLayout)this.z.findViewById(2131559046));
    this.g = ((LinearLayout)this.z.findViewById(2131559063));
    this.h = ((LinearLayout)this.z.findViewById(2131559048));
    this.i = ((LinearLayout)this.z.findViewById(2131559064));
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    return this.z;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.A = paramBoolean;
    if (paramBoolean) {}
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.B) && (!isHidden()) && (!this.A) && (!k.a(getActivity()).b()) && (o.r()))
    {
      b();
      c();
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {}
  }
  
  public void show()
  {
    super.show();
    this.B = true;
    if (this.z != null)
    {
      b();
      c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */