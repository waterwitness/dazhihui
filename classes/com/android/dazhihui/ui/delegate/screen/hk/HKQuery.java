package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Vector;

public class HKQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  private final String[] A = { "1037", "1039", "1041", "1134", "1040", "1047", "1043", "1036", "1003" };
  private final String[] B = { "证券名称", "成交时间", "成交价", "成交量", "成交金额", "证券代码" };
  private final String[] C = { "1037", "1039", "1048", "1047", "1049", "1036", "1003" };
  private final String[] D = { "证券名称", "委托日期", "价格", "均价", "数量", "成交", "状态", "证券代码" };
  private final String[] E = { "1037", "1038", "1041", "1134", "1040", "1047", "1043", "1036", "1003" };
  private final String[] F = { "证券名称", "成交日期", "成交价", "成交量", "成交金额", "证券代码" };
  private final String[] G = { "1037", "1038", "1048", "1047", "1049", "1036", "1003" };
  private final String[] H = { "委托日期", "成交日期", "币种", "发生金额", "备注信息", "证券代码" };
  private final String[] I = { "1038", "1045", "1311", "1080", "1043", "1003" };
  private final String[] J = { "交易所名称", "委托日期", "成交日期", "证券代码", "证券名称", "证券数量", "备注信息" };
  private final String[] K = { "1004", "1038", "1045", "1036", "1037", "1060", "1043", "1003" };
  private int L;
  private String M;
  private String[] N;
  private String[] O;
  private Vector<Integer> P;
  private Vector<Integer> Q;
  private Vector<String[]> R;
  private Vector<String[]> S;
  private bp T;
  private LayoutInflater U;
  private int V;
  private int W;
  private int X;
  private String Y;
  private DzhHeader a;
  private int aa;
  private int ab;
  private int ac;
  private String ad;
  private int ae = 0;
  private m af = new bl(this);
  private com.android.dazhihui.a.b.u ag = null;
  private com.android.dazhihui.a.b.u ah = null;
  private DatePickerDialog.OnDateSetListener ai = new bn(this);
  private DatePickerDialog.OnDateSetListener aj = new bo(this);
  private Calendar ak = Calendar.getInstance();
  private DropDownTextView b = null;
  private DropDownTextView c = null;
  private LinearLayout d;
  private LinearLayout e;
  private LinearLayout f;
  private TextView g;
  private TextView h;
  private Button i;
  private TextView j;
  private TextView m;
  private TextView n;
  private TextView o;
  private ListView p;
  private ImageView q;
  private ImageView r;
  private String[] s;
  private final String[] t = { "委托时间", "价格/均价", "数量/成交", "状态" };
  private final String[] u = { "成交时间", "成交价", "成交量", "成交金额" };
  private final String[] v = { "委托日期", "价格/均价", "数量/成交", "状态" };
  private final String[] w = { "成交日期", "成交价", "成交量", "成交金额" };
  private final String[] x = { "委托/成交", "币种", "金额", "状态" };
  private final String[] y = { "代码/名称", "委托/成交", "数量", "状态" };
  private final String[] z = { "证券名称", "委托时间", "价格", "均价", "数量", "成交", "状态", "证券代码" };
  
  private void a()
  {
    this.a = ((DzhHeader)findViewById(2131558643));
    this.d = ((LinearLayout)findViewById(2131558774));
    this.e = ((LinearLayout)findViewById(2131558775));
    this.f = ((LinearLayout)findViewById(2131558776));
    this.g = ((TextView)findViewById(2131558687));
    this.h = ((TextView)findViewById(2131558688));
    this.i = ((Button)findViewById(2131558777));
    this.j = ((TextView)findViewById(2131558890));
    this.m = ((TextView)findViewById(2131558891));
    this.n = ((TextView)findViewById(2131558892));
    this.o = ((TextView)findViewById(2131558893));
    this.p = ((ListView)findViewById(2131558780));
    this.q = ((ImageView)findViewById(2131558778));
    this.r = ((ImageView)findViewById(2131558889));
    this.p.setEmptyView(this.q);
    this.b = ((DropDownTextView)findViewById(2131560781));
    this.c = ((DropDownTextView)findViewById(2131560835));
  }
  
  private void a(boolean paramBoolean)
  {
    com.android.dazhihui.ui.delegate.b.h localh = o.g(this.L + "");
    switch (this.L)
    {
    }
    for (;;)
    {
      this.ah = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.ah);
      a(this.ah, paramBoolean);
      return;
      localh.a("1206", this.S.size()).a("1277", 20).a("1043", "").a("1319", "");
      continue;
      localh.a("1206", this.S.size()).a("1277", 20).a("1043", "").a("1319", "");
      continue;
      localh.a("1022", this.Y).a("1023", this.ad).a("1206", this.S.size()).a("1277", 20).a("1043", "").a("1319", "");
    }
  }
  
  private void b()
  {
    this.R = new Vector();
    this.S = new Vector();
    this.P = new Vector();
    this.Q = new Vector();
    this.T.a().setVisibility(0);
    this.T.notifyDataSetChanged();
  }
  
  private void c()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {
      this.L = localBundle.getInt("screenId");
    }
    switch (this.L)
    {
    default: 
      this.a.a(this, this);
      if (this.s != null)
      {
        this.j.setText(this.s[0]);
        this.m.setText(this.s[1]);
        this.n.setText(this.s[2]);
        this.o.setText(this.s[3]);
      }
      if ((this.L == 15020) || (this.L == 15016))
      {
        bk.a(bk.B, this.b, 0);
        this.b.setOnItemChangeListener(this.af);
      }
      if ((this.L == 15022) || (this.L == 15018) || (this.L == 15058) || (this.L == 15060))
      {
        this.Y = o.x();
        this.V = Integer.parseInt(this.Y.substring(0, 4));
        this.W = Integer.parseInt(this.Y.substring(4, 6));
        this.X = Integer.parseInt(this.Y.substring(6, 8));
        this.g.setText(this.V + "-" + this.W + "-" + this.X);
        this.ad = o.y();
        this.aa = Integer.parseInt(this.ad.substring(0, 4));
        this.ab = Integer.parseInt(this.ad.substring(4, 6));
        this.ac = Integer.parseInt(this.ad.substring(6, 8));
        this.h.setText(this.aa + "-" + this.ab + "-" + this.ac);
        if (this.L != 15058)
        {
          if (this.L != 15060) {
            break label945;
          }
          bk.a(bk.C, this.c, 0);
        }
      }
      break;
    }
    for (;;)
    {
      this.c.setOnItemChangeListener(this.af);
      this.R = new Vector();
      this.S = new Vector();
      this.P = new Vector();
      this.Q = new Vector();
      this.U = LayoutInflater.from(this);
      this.T = new bp(this, this.L);
      this.p.addFooterView(this.T.a());
      this.p.setAdapter(this.T);
      this.q.setVisibility(8);
      return;
      this.M = "当日委托";
      this.d.setVisibility(8);
      this.r.setVisibility(4);
      this.b.setVisibility(0);
      this.s = this.t;
      this.N = this.z;
      this.O = this.A;
      break;
      this.M = "当日成交";
      this.d.setVisibility(8);
      this.r.setVisibility(4);
      this.b.setVisibility(0);
      this.s = this.u;
      this.N = this.B;
      this.O = this.C;
      break;
      this.M = "历史委托";
      this.d.setVisibility(0);
      this.r.setVisibility(4);
      this.c.setVisibility(0);
      this.s = this.v;
      this.N = this.D;
      this.O = this.E;
      break;
      this.M = "历史成交";
      this.d.setVisibility(0);
      this.r.setVisibility(4);
      this.c.setVisibility(0);
      this.s = this.w;
      this.N = this.F;
      this.O = this.G;
      break;
      this.M = "现金提存";
      this.d.setVisibility(0);
      this.r.setVisibility(4);
      this.c.setVisibility(0);
      this.s = this.x;
      this.N = this.H;
      this.O = this.I;
      break;
      this.M = "股票往来";
      this.d.setVisibility(0);
      this.r.setVisibility(4);
      this.c.setVisibility(0);
      this.s = this.y;
      this.N = this.J;
      this.O = this.K;
      break;
      label945:
      bk.a(bk.B, this.c, 0);
    }
  }
  
  private void d()
  {
    bq localbq = new bq(this);
    this.i.setOnClickListener(localbq);
    this.e.setOnClickListener(localbq);
    this.f.setOnClickListener(localbq);
    this.p.setOnScrollListener(new bm(this));
  }
  
  private void f()
  {
    this.ag = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("15068").h()) });
    registRequestListener(this.ag);
    a(this.ag, true);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = this.M;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
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
            return;
            if (paramh != this.ag) {
              break;
            }
            paramh = ((v)paramj).b();
          } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (!paramh.b())
          {
            paramh = Toast.makeText(this, paramh.d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        } while (paramh.g() <= 0);
        bk.A = (String[][])Array.newInstance(String.class, new int[] { paramh.g(), 2 });
        k = 0;
        while (k < paramh.g())
        {
          bk.A[k][0] = n.t(paramh.a(k, "1208"));
          bk.A[k][1] = n.t(paramh.a(k, "1311"));
          k += 1;
        }
        bk.a(this.c, 0);
        this.c.setOnItemChangeListener(this.af);
        a(true);
        return;
      } while (paramh != this.ah);
      paramh = ((v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
    paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (!paramj.b())
    {
      paramh = Toast.makeText(this, paramj.d(), 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
      return;
    }
    int i2 = paramj.g();
    int k = paramj.b("1289");
    this.T.a(k);
    if ((i2 == 0) && (this.R.size() == 0))
    {
      this.q.setVisibility(0);
      this.p.removeFooterView(this.T.a());
      return;
    }
    this.q.setVisibility(4);
    if (this.S.size() + i2 >= k) {
      this.p.removeFooterView(this.T.a());
    }
    Object localObject;
    if (i2 > 0)
    {
      int i1 = 0;
      if (i1 < i2)
      {
        localObject = new String[this.O.length];
        k = 0;
        if (k < this.O.length)
        {
          if (paramj.a(i1, this.O[k]) == null) {}
          for (paramh = "";; paramh = paramj.a(i1, this.O[k]))
          {
            localObject[k] = paramh;
            if ("1043".equals(this.O[k])) {
              localObject[k] = bk.c(localObject[k]);
            }
            k += 1;
            break;
          }
        }
        if (this.L == 15058)
        {
          paramh = paramj.a(i1, "1080");
          if ((!TextUtils.isEmpty(paramh)) && (Double.parseDouble(paramh) > 0.0D)) {
            k = -65536;
          }
        }
        for (;;)
        {
          this.S.add(localObject);
          this.Q.add(new Integer(k));
          i1 += 1;
          break;
          k = getResources().getColor(2131492932);
          continue;
          if (this.L == 15060)
          {
            paramh = paramj.a(i1, "1060");
            if ((!TextUtils.isEmpty(paramh)) && (Double.parseDouble(paramh) > 0.0D)) {
              k = -65536;
            } else {
              k = getResources().getColor(2131492932);
            }
          }
          else
          {
            paramh = paramj.a(i1, "1026");
            if ((paramh != null) && (paramh.equals("0"))) {
              k = -65536;
            } else {
              k = getResources().getColor(2131492932);
            }
          }
        }
      }
      if (this.L != 15058) {
        break label751;
      }
      this.R = bk.a(this.S, 2, this.ae);
      this.P = bk.a(this.S, this.Q, 2, this.ae);
    }
    for (;;)
    {
      this.T.notifyDataSetChanged();
      if (this.R.size() != 0) {
        break;
      }
      this.q.setVisibility(0);
      this.T.a().setVisibility(8);
      return;
      label751:
      if (this.L == 15060)
      {
        paramh = new Vector();
        paramj = new Vector();
        k = 0;
        for (;;)
        {
          if (k >= this.S.size()) {
            break label862;
          }
          localObject = ((String[])this.S.get(k))[5];
          try
          {
            double d1 = Double.parseDouble((String)localObject);
            if (d1 != 0.0D) {
              break;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              paramh.add(this.S.get(k));
              paramj.add(this.Q.get(k));
            }
          }
          k += 1;
        }
        label862:
        this.R = bk.b(paramh, this.O.length - 1, this.ae);
        this.P = bk.b(paramh, paramj, this.O.length - 1, this.ae);
      }
      else
      {
        this.R = bk.b(this.S, this.O.length - 1, this.ae);
        this.P = bk.b(this.S, this.Q, this.O.length - 1, this.ae);
      }
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903497);
    a();
    c();
    d();
    if (this.L == 15058)
    {
      if (bk.A == null)
      {
        f();
        return;
      }
      bk.a(this.c, 0);
      this.c.setOnItemChangeListener(this.af);
      a(true);
      return;
    }
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */