package com.android.dazhihui.ui.screen.moneybox;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import java.math.BigDecimal;
import java.util.ArrayList;

public class FundRedemption
  extends DelegateBaseActivity
{
  private String A;
  private String B = "";
  com.android.dazhihui.a.b.u a;
  com.android.dazhihui.a.b.u b;
  com.android.dazhihui.a.b.u c;
  com.android.dazhihui.a.b.u d;
  com.android.dazhihui.a.b.u e;
  com.android.dazhihui.a.b.u f;
  Handler g = new m(this);
  EditText h;
  EditText i;
  RadioGroup j;
  RadioButton m;
  RadioButton n;
  Button o;
  TextView p;
  ArrayList<String> q;
  ArrayList<String> r;
  ArrayList<String> s;
  ArrayList<String> t;
  private RelativeLayout u;
  private ImageView v;
  private TextView w;
  private String[] x = { "" };
  private int y = 0;
  private int z = 0;
  
  private void a(double paramDouble)
  {
    this.m.setText("全仓    " + com.android.dazhihui.ui.delegate.b.o.p(String.valueOf(paramDouble)));
    this.n.setText("半仓    " + com.android.dazhihui.ui.delegate.b.o.p(String.valueOf(paramDouble / 2.0D)));
    b(paramDouble);
  }
  
  private void b(double paramDouble)
  {
    this.i.setText(com.android.dazhihui.ui.delegate.b.o.p(String.valueOf(paramDouble)));
    this.i.setSelection(this.i.getText().length());
  }
  
  private void d()
  {
    this.u = ((RelativeLayout)findViewById(2131560063));
    this.v = ((ImageView)this.u.findViewById(2131560068));
    this.v.setVisibility(0);
    this.w = ((TextView)this.u.findViewById(2131560069));
    this.w.setVisibility(0);
    this.j = ((RadioGroup)findViewById(2131560075));
    this.o = ((Button)findViewById(2131559744));
    this.o.setOnClickListener(new o(this));
    this.p = ((TextView)findViewById(2131559621));
    this.p.setText(com.android.dazhihui.ui.delegate.b.o.p());
    this.h = ((EditText)findViewById(2131559743));
    this.h.setInputType(0);
    this.h.setText(this.x[0]);
    this.h.setOnTouchListener(new p(this));
    this.i = ((EditText)findViewById(2131559741));
    this.m = ((RadioButton)findViewById(2131560076));
    this.n = ((RadioButton)findViewById(2131560077));
    q localq = new q(this);
    this.m.setOnClickListener(localq);
    this.n.setOnClickListener(localq);
    this.m.performClick();
  }
  
  private void f()
  {
    this.w.setText("赎回");
    this.v.setOnClickListener(new r(this));
  }
  
  public void a()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.a = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", "").a("1036", "").a("1206", 0).a("1277", 500).h()) });
    registRequestListener(this.a);
    a(this.a, true);
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a("确定", new u(this, paramInt, paramContext));
    paramContext.b("取消", new n(this, paramContext));
    paramContext.show();
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a(paramString3, new t(this, paramInt, paramContext));
    paramContext.show();
  }
  
  public void b()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.b = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11102").a("1003", "").a("1036", (String)this.q.get(this.y)).h()) });
    registRequestListener(this.b);
    a(this.b, true);
  }
  
  public void c()
  {
    int k;
    int i1;
    label50:
    Object localObject;
    double d1;
    if ((this.q != null) && (this.q.size() > 0))
    {
      k = 0;
      if (k >= ae.h.length) {
        break label877;
      }
      if (!ae.h[k].a.equals(com.android.dazhihui.ui.delegate.b.o.p())) {
        break label160;
      }
      i1 = 0;
      if (i1 >= ae.h[k].b.length) {
        break label877;
      }
      if (!ae.h[k].b[i1][0].equals(this.q.get(this.y))) {
        break label151;
      }
      localObject = ae.h[k].b[i1][1];
      d1 = Double.parseDouble(ae.h[k].b[i1][3]);
    }
    for (;;)
    {
      if (localObject == null) {
        a(this, "提示", "获取赎回数据出错！", "确定", 0);
      }
      label151:
      label160:
      String str2;
      do
      {
        do
        {
          return;
          i1 += 1;
          break label50;
          k += 1;
          break;
        } while (!com.android.dazhihui.ui.delegate.b.o.r());
        str2 = BigDecimal.valueOf(Double.parseDouble(this.i.getText().toString())).multiply(BigDecimal.valueOf(d1)).toString();
        if (((String)localObject).equals("1"))
        {
          localObject = com.android.dazhihui.ui.delegate.b.o.g("12018").a("1026", 1).a("1021", com.android.dazhihui.ui.delegate.b.o.z[this.z][0]).a("1019", com.android.dazhihui.ui.delegate.b.o.z[this.z][1]);
          if (this.A == null) {}
          for (str1 = "0";; str1 = this.A)
          {
            this.c = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).a("1003", str1).a("1036", (String)this.q.get(this.y)).a("1041", "").a("1040", str2).h()) });
            registRequestListener(this.c);
            a(this.c, true);
            return;
          }
        }
        if (((String)localObject).equals("2"))
        {
          localObject = com.android.dazhihui.ui.delegate.b.o.g("11116").a("1026", 1).a("1021", com.android.dazhihui.ui.delegate.b.o.z[this.z][0]).a("1019", com.android.dazhihui.ui.delegate.b.o.z[this.z][1]);
          if (this.A == null) {}
          for (str1 = "0";; str1 = this.A)
          {
            this.e = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).a("1003", str1).a("1036", (String)this.q.get(this.y)).a("1041", this.B).a("1029", "1").a("1040", str2).h()) });
            registRequestListener(this.e);
            a(this.e, true);
            return;
          }
        }
        if (((String)localObject).equals("3"))
        {
          this.d = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12342").a("1026", 1).a("1021", com.android.dazhihui.ui.delegate.b.o.z[this.z][0]).a("1019", com.android.dazhihui.ui.delegate.b.o.z[this.z][1]).a("1036", (String)this.q.get(this.y)).a("1040", str2).a("1945", "1").h()) });
          registRequestListener(this.d);
          a(this.d, true);
          return;
        }
      } while ((!((String)localObject).equals("4")) && (!((String)localObject).equals("5")) && (!((String)localObject).equals("6")));
      String str1 = "1";
      if (((String)localObject).equals("5")) {
        str1 = "4";
      }
      for (;;)
      {
        this.f = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12424").a("1026", 1).a("1906", str1).a("1021", com.android.dazhihui.ui.delegate.b.o.z[this.z][0]).a("1019", com.android.dazhihui.ui.delegate.b.o.z[this.z][1]).a("1036", (String)this.q.get(this.y)).a("1040", str2).h()) });
        registRequestListener(this.f);
        a(this.f, true);
        return;
        if (((String)localObject).equals("6")) {
          str1 = "3";
        }
      }
      label877:
      d1 = 0.0D;
      localObject = null;
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i2 = 0;
    super.handleResponse(paramh, paramj);
    paramh = ((v)paramj).b();
    if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {}
    int i1;
    int k;
    label220:
    label228:
    do
    {
      do
      {
        return;
        paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        switch (Integer.parseInt(paramj.a()))
        {
        default: 
          return;
        }
      } while (paramj.g() == 0);
      paramh = paramj.a(0, "1021");
      i1 = com.android.dazhihui.ui.delegate.b.o.z.length;
      k = 0;
      if (k >= i1) {
        break label997;
      }
      if (!com.android.dazhihui.ui.delegate.b.o.z[k][0].equals(paramh)) {
        break label902;
      }
      String str = com.android.dazhihui.ui.delegate.b.o.z[k][2];
      if ((str == null) || (!str.equals("1"))) {
        break;
      }
      this.z = k;
      k = 1;
      if (k == 0)
      {
        k = 0;
        if (k < i1)
        {
          if (!com.android.dazhihui.ui.delegate.b.o.z[k][0].equals(paramh)) {
            break label911;
          }
          this.z = k;
        }
      }
      this.A = paramj.a(0, "1021");
      paramj.a(0, "1156");
      this.B = paramj.a(0, "1167");
      if ((this.B == null) || (this.B.length() == 0) || (Double.parseDouble(this.B) == 0.0D)) {
        this.B = paramj.a(0, "1181");
      }
      if ((this.B == null) || (this.B.length() == 0) || (Double.parseDouble(this.B) == 0.0D)) {
        this.B = paramj.a(0, "1178");
      }
    } while ((this.B != null) && (this.B.length() != 0) && (Double.parseDouble(this.B) != 0.0D));
    this.B = "";
    return;
    if (paramj.b()) {}
    for (;;)
    {
      try
      {
        int i3 = paramj.g();
        if (i3 <= 0) {
          break label852;
        }
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        k = 0;
        if (k < i3)
        {
          paramh = paramj.a(k, "1036");
          if (paramh == null) {
            break label1006;
          }
          i1 = 0;
          if (i1 >= ae.g.size()) {
            break label1006;
          }
          if (!((String[])ae.g.get(i1))[1].equals(paramh)) {
            break label1015;
          }
          this.r.add(((String[])ae.g.get(i1))[0]);
          this.q.add(((String[])ae.g.get(i1))[1]);
          paramh = paramj.a(k, "1061");
          if (paramh != null) {
            break label1003;
          }
          paramh = "0";
          this.s.add(paramh);
          if (com.android.dazhihui.ui.delegate.b.o.p().equals("国泰君安证券"))
          {
            paramh = BigDecimal.valueOf(Double.parseDouble(paramh));
            this.t.add(paramh.toString());
            break label1006;
          }
          paramh = BigDecimal.valueOf(Double.parseDouble(((String[])ae.g.get(i1))[3])).multiply(BigDecimal.valueOf(Double.parseDouble(paramh)));
          continue;
        }
        if (this.q.size() == 0)
        {
          a(this, "提示", "    当前无可赎回产品！", "确定", 1);
          return;
        }
      }
      catch (NumberFormatException paramh)
      {
        paramh.printStackTrace();
        a(this, "提示", "数据出错！", "确定", 1);
        return;
      }
      this.x = null;
      this.x = new String[this.q.size()];
      k = i2;
      while (k < this.x.length)
      {
        this.x[k] = ((String)this.r.get(k) + "(" + (String)this.q.get(k) + ")");
        k += 1;
      }
      this.h.setText(this.x[0]);
      a(Double.parseDouble((String)this.t.get(0)));
      this.g.sendEmptyMessage(0);
      return;
      label852:
      a(this, "提示", "    当前无可赎回产品！", "确定", 1);
      return;
      paramj = paramj.d();
      paramh = paramj;
      if (paramj == null) {
        paramh = "";
      }
      a(this, "提示", paramh, "确定", 0);
      return;
      this.z = k;
      label902:
      k += 1;
      break;
      label911:
      k += 1;
      break label228;
      if (paramj.b())
      {
        paramj = paramj.a(0, "1042");
        paramh = paramj;
        if (paramj == null) {
          paramh = "";
        }
      }
      for (paramh = "　　委托请求提交成功。合同号为：" + paramh;; paramh = paramj.d())
      {
        paramj = paramh;
        if (paramh == null) {
          paramj = "";
        }
        a(this, "提示", paramj, "确定", 1);
        return;
      }
      label997:
      k = 0;
      break label220;
      label1003:
      continue;
      label1006:
      k += 1;
      continue;
      label1015:
      i1 += 1;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903324);
    d();
    f();
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).setItems(this.x, new s(this)).create();
    localAlertDialog.requestWindowFeature(1);
    localAlertDialog.show();
    return localAlertDialog;
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\FundRedemption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */