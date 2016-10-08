package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
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
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.delegate.view.TradeAccountSwitchView;
import com.android.dazhihui.ui.delegate.view.d;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.dc;

public class bb
  extends ad
  implements d, dc
{
  private View c;
  private TradeAccountSwitchView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private LinearLayout j;
  private LinearLayout k;
  private LinearLayout l;
  private LinearLayout m;
  private LinearLayout n;
  private ScrollView o;
  private LinearLayout p;
  private LayoutInflater q;
  private NoScrollListView[] r;
  private b[][] s;
  private bg[] t;
  private boolean u = false;
  private com.android.dazhihui.a.b.u v;
  private com.android.dazhihui.a.b.u w = null;
  private boolean x = false;
  
  private void e()
  {
    if (bk.c())
    {
      if ((!g()) && (!f())) {}
      return;
    }
    b();
  }
  
  private boolean f()
  {
    if (bk.b()) {
      new AlertDialog.Builder(getActivity()).setTitle("修改交易密码").setMessage("我们会在用户首次登录或定期提示用户修改密码，以保证用户交易密码安全。").setPositiveButton("确定", new bc(this)).show();
    }
    bk.c(false);
    b();
    return bk.b();
  }
  
  private boolean g()
  {
    if ((bk.a()) && (PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("HK_SETTING_SHOW_TIP", true)))
    {
      this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("15066").a("1026", "0").h()) });
      registRequestListener(this.w);
      a(this.w, true);
      return true;
    }
    return false;
  }
  
  private void h()
  {
    this.d.a(2, this.c);
    this.d = ((TradeAccountSwitchView)this.c.findViewById(2131559768));
    this.d.a(2, this.c);
    this.d.a();
    this.d.setAccountSwitchItemClick(this);
    this.q = LayoutInflater.from(getActivity());
    this.p.removeAllViews();
    this.s = o.c("");
    if (this.s != null)
    {
      int i2 = this.s.length;
      this.r = new NoScrollListView[i2];
      this.t = new bg[i2];
      localObject1 = new LinearLayout.LayoutParams[i2];
      localObject2 = new bi(this);
      int i1 = 0;
      if (i1 < i2)
      {
        if (this.s[i1].length == 0) {}
        for (;;)
        {
          i1 += 1;
          break;
          this.t[i1] = new bg(this);
          this.t[i1].a(this.s[i1]);
          this.r[i1] = new NoScrollListView(getActivity());
          this.r[i1].setAdapter(this.t[i1]);
          this.r[i1].setBackgroundColor(-1);
          this.r[i1].setDivider(getResources().getDrawable(2131493268));
          this.r[i1].setDividerHeight((int)getResources().getDimension(2131230773));
          this.r[i1].setPadding((int)getResources().getDimension(2131230788), 0, 0, 0);
          localObject1[i1] = new LinearLayout.LayoutParams(-1, -2);
          localObject3 = new View(getActivity());
          ((View)localObject3).setBackgroundResource(2131493268);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
          if (i1 != 0) {
            localLayoutParams1.setMargins(0, (int)getResources().getDimension(2131230774), 0, 0);
          }
          View localView = new View(getActivity());
          localView.setBackgroundResource(2131493268);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
          this.p.addView((View)localObject3, localLayoutParams1);
          this.p.addView(this.r[i1], localObject1[i1]);
          this.p.addView(localView, localLayoutParams2);
          this.r[i1].setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
        }
      }
    }
    Object localObject1 = new LinearLayout.LayoutParams(-1, -2);
    Object localObject2 = this.q.inflate(2130903590, null);
    Object localObject3 = (Button)((View)localObject2).findViewById(2131559790);
    this.p.addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
    ((Button)localObject3).setOnClickListener(new bd(this));
    bk.e();
    n.a("", 1027);
  }
  
  private void i()
  {
    bh localbh = new bh(this);
    this.j.setOnClickListener(localbh);
    this.k.setOnClickListener(localbh);
    this.l.setOnClickListener(localbh);
    this.m.setOnClickListener(localbh);
    this.n.setOnClickListener(localbh);
  }
  
  private void k()
  {
    this.d = ((TradeAccountSwitchView)this.c.findViewById(2131559768));
    this.e = ((TextView)this.c.findViewById(2131559770));
    this.f = ((TextView)this.c.findViewById(2131559774));
    this.g = ((TextView)this.c.findViewById(2131560823));
    this.h = ((TextView)this.c.findViewById(2131560825));
    this.i = ((TextView)this.c.findViewById(2131560827));
    this.j = ((LinearLayout)this.c.findViewById(2131560828));
    this.k = ((LinearLayout)this.c.findViewById(2131560829));
    this.l = ((LinearLayout)this.c.findViewById(2131559788));
    this.m = ((LinearLayout)this.c.findViewById(2131560832));
    this.n = ((LinearLayout)this.c.findViewById(2131560830));
    this.p = ((LinearLayout)this.c.findViewById(2131559789));
    this.o = ((ScrollView)this.c.findViewById(2131559766));
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ((gc)getParentFragment()).a(paramString1, paramString2, paramString3);
  }
  
  public void b()
  {
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("15004").h()) });
    registRequestListener(this.v);
    a(this.v, true);
  }
  
  public void c()
  {
    if (this.c != null) {
      b();
    }
  }
  
  public void d()
  {
    this.e.setText("--");
    this.f.setText("--");
    this.g.setText("--");
    this.h.setText("--");
    this.i.setText("--");
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((paramj == null) || (getActivity() == null) || (getActivity().isFinishing())) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramh != this.w) {
              break;
            }
            paramh = ((v)paramj).b();
          } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (!paramh.b())
          {
            paramh = Toast.makeText(getActivity(), paramh.d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        } while (paramh.g() <= 0);
        int i1 = paramh.b(0, "1577");
        paramh = n.t(paramh.a(0, "1208"));
        paramh = new bz(getActivity(), i1, paramh, new be(this));
        paramh.setOnCancelListener(new bf(this));
        paramh.show();
        return;
      } while (paramh != this.v);
      paramh = ((v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
    paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (!paramj.b())
    {
      b(paramj.d());
      return;
    }
    TextView localTextView = this.e;
    if (paramj.a(0, "1087") == null)
    {
      paramh = "--";
      localTextView.setText(paramh);
      localTextView = this.f;
      if (paramj.a(0, "1064") != null) {
        break label354;
      }
      paramh = "--";
      label261:
      localTextView.setText(paramh);
      localTextView = this.g;
      if (paramj.a(0, "1065") != null) {
        break label366;
      }
      paramh = "--";
      label286:
      localTextView.setText(paramh);
      localTextView = this.h;
      if (paramj.a(0, "1077") != null) {
        break label378;
      }
      paramh = "--";
      label311:
      localTextView.setText(paramh);
      localTextView = this.i;
      if (paramj.a(0, "1078") != null) {
        break label390;
      }
    }
    label354:
    label366:
    label378:
    label390:
    for (paramh = "--";; paramh = paramj.a(0, "1078"))
    {
      localTextView.setText(paramh);
      return;
      paramh = paramj.a(0, "1087");
      break;
      paramh = paramj.a(0, "1064");
      break label261;
      paramh = paramj.a(0, "1065");
      break label286;
      paramh = paramj.a(0, "1077");
      break label311;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = paramLayoutInflater.inflate(2130903494, paramViewGroup, false);
    k();
    h();
    i();
    e();
    this.u = true;
    return this.c;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.x = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!this.u) && (!this.x) && (!isHidden()) && (o.r()))
    {
      this.d.a(2, this.c);
      this.d.a();
    }
    this.u = false;
  }
  
  public void show()
  {
    super.show();
    if (this.c != null)
    {
      h();
      this.d.a(2, this.c);
      this.d.a();
      d();
      this.o.scrollTo(0, 0);
      e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */