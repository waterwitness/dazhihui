package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.delegate.view.TradeAccountSwitchView;
import com.android.dazhihui.ui.delegate.view.d;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.dc;
import org.json.JSONArray;
import org.json.JSONObject;

public class bi
  extends ad
  implements d, dc
{
  private boolean A;
  private boolean B = false;
  private com.android.dazhihui.a.b.u C = null;
  com.android.dazhihui.a.b.f c;
  private LayoutInflater d;
  private View e;
  private TradeAccountSwitchView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private Button l;
  private LinearLayout m;
  private LinearLayout n;
  private LinearLayout o;
  private LinearLayout p;
  private LinearLayout q;
  private ScrollView r;
  private Button s;
  private LinearLayout t;
  private LinearLayout.LayoutParams[] u;
  private NoScrollListView[] v;
  private b[][] w;
  private bk[] x;
  private String[] y = com.android.dazhihui.ui.delegate.c.a.aE;
  private String[] z = com.android.dazhihui.ui.delegate.c.a.aF;
  
  private void f()
  {
    this.f = ((TradeAccountSwitchView)this.e.findViewById(2131559768));
    this.g = ((TextView)this.e.findViewById(2131559770));
    this.h = ((TextView)this.e.findViewById(2131559772));
    this.i = ((TextView)this.e.findViewById(2131559774));
    this.j = ((TextView)this.e.findViewById(2131559776));
    this.k = ((TextView)this.e.findViewById(2131559778));
    this.l = ((Button)this.e.findViewById(2131559779));
    this.m = ((LinearLayout)this.e.findViewById(2131559780));
    this.n = ((LinearLayout)this.e.findViewById(2131559782));
    this.o = ((LinearLayout)this.e.findViewById(2131559784));
    this.q = ((LinearLayout)this.e.findViewById(2131559788));
    this.p = ((LinearLayout)this.e.findViewById(2131559786));
    this.r = ((ScrollView)this.e.findViewById(2131559766));
    this.t = ((LinearLayout)this.e.findViewById(2131559789));
  }
  
  private void g()
  {
    if (o.t == -1) {
      d();
    }
    this.f.a(1, this.e);
    this.d = LayoutInflater.from(getActivity());
    this.t.removeAllViews();
    this.w = o.d(com.android.dazhihui.c.a.a.z);
    int i2 = this.w.length;
    this.v = new NoScrollListView[i2];
    this.x = new bk[i2];
    this.u = new LinearLayout.LayoutParams[i2];
    Object localObject = new bm(this);
    int i1 = 0;
    if (i1 < i2)
    {
      if (this.w[i1].length == 0) {}
      for (;;)
      {
        i1 += 1;
        break;
        this.x[i1] = new bk(this);
        this.x[i1].a(this.w[i1]);
        this.v[i1] = new NoScrollListView(getActivity());
        this.v[i1].setAdapter(this.x[i1]);
        this.v[i1].setBackgroundColor(-1);
        this.v[i1].setDivider(getResources().getDrawable(2131493268));
        this.v[i1].setDividerHeight((int)getResources().getDimension(2131230773));
        this.v[i1].setPadding((int)getResources().getDimension(2131230788), 0, 0, 0);
        this.u[i1] = new LinearLayout.LayoutParams(-1, -2);
        localView1 = new View(getActivity());
        localView1.setBackgroundResource(2131493268);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
        if (i1 != 0) {
          localLayoutParams1.setMargins(0, (int)getResources().getDimension(2131230774), 0, 0);
        }
        View localView2 = new View(getActivity());
        localView2.setBackgroundResource(2131493268);
        LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
        this.t.addView(localView1, localLayoutParams1);
        this.t.addView(this.v[i1], this.u[i1]);
        this.t.addView(localView2, localLayoutParams2);
        this.v[i1].setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
      }
    }
    localObject = new LinearLayout.LayoutParams(-1, -2);
    View localView1 = this.d.inflate(2130903590, null);
    this.s = ((Button)localView1.findViewById(2131559790));
    this.t.addView(localView1, (ViewGroup.LayoutParams)localObject);
    this.s.setOnClickListener(new bj(this));
  }
  
  private void h()
  {
    bl localbl = new bl(this);
    this.m.setOnClickListener(localbl);
    this.n.setOnClickListener(localbl);
    this.o.setOnClickListener(localbl);
    this.p.setOnClickListener(localbl);
    this.q.setOnClickListener(localbl);
    this.l.setOnClickListener(localbl);
    this.s.setOnClickListener(localbl);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ((gc)getParentFragment()).a(paramString1, paramString2, paramString3);
  }
  
  public void b()
  {
    this.g.setText("");
    this.h.setText("");
    this.i.setText("");
    this.j.setText("");
    this.k.setText("");
  }
  
  public void c()
  {
    if (this.e != null) {
      e();
    }
  }
  
  public void d()
  {
    this.c = new com.android.dazhihui.a.b.f();
    this.c.c(com.android.dazhihui.a.f.r);
    registRequestListener(this.c);
    sendRequest(this.c);
  }
  
  public void e()
  {
    if (!o.r()) {
      return;
    }
    this.C = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12132").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.C);
    a(this.C, true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    int i2;
    Object localObject3;
    Object localObject2;
    do
    {
      do
      {
        do
        {
          return;
          if (paramh == this.c)
          {
            Object localObject1 = new String(((g)paramj).a());
            try
            {
              o.t = new JSONObject((String)localObject1).optJSONArray("data").length();
              if (this.x != null)
              {
                localObject1 = this.x;
                i2 = localObject1.length;
                i1 = 0;
                while (i1 < i2)
                {
                  localObject3 = localObject1[i1];
                  if (localObject3 != null) {
                    ((bk)localObject3).notifyDataSetChanged();
                  }
                  i1 += 1;
                }
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                localException.printStackTrace();
              }
            }
          }
        } while (paramh != this.C);
        paramh = ((v)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
      localObject2 = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
      {
        paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
    } while (i2 <= 0);
    int i1 = 0;
    if (i1 < i2)
    {
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1415");
      if ((paramh == null) || (!paramh.equals("1"))) {}
    }
    for (;;)
    {
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1078");
      Object localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1087");
      paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1064");
      localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1065");
      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1079");
      TextView localTextView = this.j;
      if (paramh == null)
      {
        paramh = "";
        label292:
        localTextView.setText(paramh);
        localTextView = this.g;
        if (localObject4 != null) {
          break label426;
        }
        paramh = "";
        label313:
        localTextView.setText(paramh);
        localObject4 = this.h;
        if (localObject3 != null) {
          break label432;
        }
        paramh = "";
        label334:
        ((TextView)localObject4).setText(paramh);
        localObject3 = this.i;
        if (paramj != null) {
          break label438;
        }
        paramh = "";
        label354:
        ((TextView)localObject3).setText(paramh);
        localObject3 = this.k;
        if (localObject2 != null) {
          break label443;
        }
      }
      label426:
      label432:
      label438:
      label443:
      for (paramh = "";; paramh = (com.android.dazhihui.a.b.h)localObject2)
      {
        ((TextView)localObject3).setText(paramh);
        if ((paramj == null) || (paramj.equals("")) || (Double.parseDouble(paramj) <= 0.0D)) {
          break label448;
        }
        this.i.setTextColor(-65536);
        return;
        i1 += 1;
        break;
        break label292;
        paramh = (com.android.dazhihui.a.b.h)localObject4;
        break label313;
        paramh = (com.android.dazhihui.a.b.h)localObject3;
        break label334;
        paramh = paramj;
        break label354;
      }
      label448:
      if ((isAdded()) && (paramj != null) && (!paramj.equals("")) && (Double.parseDouble(paramj) < 0.0D))
      {
        this.i.setTextColor(getResources().getColor(2131492932));
        return;
      }
      this.i.setTextColor(-16777216);
      return;
      i1 = 0;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903261, paramViewGroup, false);
    f();
    g();
    b();
    h();
    e();
    this.A = true;
    this.f.a();
    this.f.setAccountSwitchItemClick(this);
    return this.e;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.B = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!isHidden()) && (!this.B) && (!this.A) && (!k.a(getActivity()).b()) && (o.r()))
    {
      this.f.a();
      g();
      b();
      e();
      this.r.scrollTo(0, 0);
    }
    this.A = false;
  }
  
  public void show()
  {
    super.show();
    if (this.e != null)
    {
      this.f.a();
      b();
      g();
      e();
      this.r.scrollTo(0, 0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */