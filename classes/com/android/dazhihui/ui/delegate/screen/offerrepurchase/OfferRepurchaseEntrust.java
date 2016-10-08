package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class OfferRepurchaseEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private String B;
  private String C;
  private String D;
  private List<double[]> E = new ArrayList();
  private com.android.dazhihui.a.b.u F = null;
  private com.android.dazhihui.a.b.u G = null;
  private com.android.dazhihui.a.b.u H = null;
  private com.android.dazhihui.a.b.u I;
  private com.android.dazhihui.a.b.u J = null;
  private DatePickerDialog.OnDateSetListener K = new f(this);
  public View.OnClickListener a = new e(this);
  private DzhHeader b;
  private EditText c;
  private Spinner d;
  private EditText e;
  private EditText f;
  private EditText g;
  private TableRow h;
  private CheckBox i;
  private EditText j;
  private TextView m;
  private String n;
  private String o = "";
  private String p = "";
  private String q = "";
  private String r = "";
  private String s;
  private String t;
  private String u;
  private String v;
  private String[] w;
  private String[] x;
  private int y;
  private int z;
  
  private String a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramh.g() > 0)
    {
      this.o = paramh.a(0, "1037");
      this.s = paramh.a(0, "1683");
      this.t = this.s;
      this.u = paramh.a(0, "1684");
      this.r = paramh.a(0, "1686");
      this.v = paramh.a(0, "1687");
      this.C = paramh.a(0, "1688");
      this.p = paramh.a(0, "1869");
      this.q = paramh.a(0, "1383");
      this.B = paramh.a(0, "1996");
      this.D = paramh.a(0, "6174");
    }
    if (this.g != null) {
      this.g.setText(this.q);
    }
    localStringBuilder.append("产品名称:\t").append(this.o).append("\n");
    localStringBuilder.append("最小买入:\t").append(this.p).append("\n");
    localStringBuilder.append("到期合约利率:\t").append(this.s).append("\n");
    localStringBuilder.append("提前终止利率:\t").append(this.u).append("\n");
    return localStringBuilder.toString();
  }
  
  private void a()
  {
    try
    {
      if (o.j()) {
        this.j.setText("20991231");
      }
      for (;;)
      {
        this.y = Integer.valueOf(this.j.getText().toString().substring(0, 4)).intValue();
        this.z = (Integer.valueOf(this.j.getText().toString().substring(4, 6)).intValue() - 1);
        this.A = Integer.valueOf(this.j.getText().toString().substring(6, 8)).intValue();
        return;
        long l = System.currentTimeMillis();
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(l);
        int k = localCalendar.get(1);
        int i1 = localCalendar.get(2);
        int i2 = localCalendar.get(5);
        this.j.setText("" + (k + 1) + "" + o.a(i1 + 1) + "" + o.a(i2));
      }
      return;
    }
    catch (Exception localException)
    {
      n.e("OfferRepurchaseEntrust", localException.toString());
      this.y = 2099;
      this.z = 12;
      this.A = 31;
    }
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.h paramh, String paramString)
  {
    if ((this.D != null) && (!this.D.equals("")))
    {
      if (this.D.equals("0")) {
        paramh.a("1023", "");
      }
      while (!this.D.equals("1")) {
        return;
      }
      paramh.a("1023", paramString);
      return;
    }
    paramh.a("1023", paramString);
  }
  
  private void b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o.a(this.y)).append(o.a(this.z)).append(o.a(this.A));
    this.j.setText(localStringBuilder.toString());
  }
  
  private void b(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (paramh.g() > 0)
    {
      this.v = paramh.a(0, "1078");
      this.e.setText(this.v);
    }
  }
  
  private void c()
  {
    Object localObject = this.c.getText().toString();
    String str1 = this.d.getSelectedItem().toString();
    String str2 = this.f.getText().toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("股东代码:\t").append(str1).append("\n");
    localStringBuilder.append("产品代码:\t").append((String)localObject).append("\n");
    localStringBuilder.append("委托数量:\t").append(str2).append("\n");
    localStringBuilder.append("到期合约利率:\t").append(this.s).append("\n");
    localStringBuilder.append("提前终止利率:\t").append(this.u).append("\n");
    localStringBuilder.append("你确认吗？\t").append("\n");
    localObject = new k();
    ((k)localObject).a("委托确认");
    ((k)localObject).b(localStringBuilder.toString());
    ((k)localObject).b(getString(2131165363), new c(this));
    ((k)localObject).a(getString(2131165331), new d(this));
    ((k)localObject).a(this);
  }
  
  private void c(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (paramh.g() <= 0) {}
    label152:
    label157:
    for (;;)
    {
      return;
      paramh = paramh.a(0, "1021");
      int i1 = o.z.length;
      int k = 0;
      if (k < i1) {
        if ((o.z[k][0] != null) && (o.z[k][0].equals(paramh)))
        {
          String str = o.z[k][2];
          if ((str != null) && (str.equals("1"))) {
            this.d.setSelection(k);
          }
        }
      }
      for (k = 1;; k = 0)
      {
        if (k != 0) {
          break label157;
        }
        k = 0;
        for (;;)
        {
          if (k >= i1) {
            break label152;
          }
          if ((o.z[k][0] != null) && (o.z[k][0].equals(paramh)))
          {
            this.d.setSelection(k);
            return;
            this.d.setSelection(k);
            k += 1;
            break;
          }
          k += 1;
        }
        break;
      }
    }
  }
  
  private void d()
  {
    this.f.setText("");
  }
  
  private void d(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    paramh = a(paramh);
    this.m.setText(paramh);
    if ((this.B != null) && (!this.B.equals(""))) {
      if (this.B.equals("0"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(false);
        this.i.setChecked(false);
        this.i.setFocusable(false);
        if ((this.D != null) && (!this.D.equals("")))
        {
          paramh = (TextView)findViewById(2131560948);
          if (!this.D.equals("0")) {
            break label489;
          }
          paramh.setVisibility(8);
          this.j.setVisibility(8);
        }
      }
    }
    label489:
    while (!this.D.equals("1"))
    {
      return;
      if (this.B.equals("1"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(false);
        this.i.setChecked(true);
        this.i.setFocusable(false);
        break;
      }
      if (this.B.equals("2"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(true);
        this.i.setChecked(false);
        this.i.setFocusable(true);
        break;
      }
      if (!this.B.equals("3")) {
        break;
      }
      this.i.setVisibility(0);
      this.i.setEnabled(true);
      this.i.setChecked(true);
      this.i.setFocusable(true);
      break;
      if ((this.C == null) || (this.C.equals(""))) {
        break;
      }
      if (this.C.equals("0"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(false);
        this.i.setChecked(false);
        this.i.setFocusable(false);
        break;
      }
      if (this.C.equals("1"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(false);
        this.i.setChecked(true);
        this.i.setFocusable(false);
        break;
      }
      if (this.C.equals("2"))
      {
        this.i.setVisibility(0);
        this.i.setEnabled(true);
        this.i.setChecked(false);
        this.i.setFocusable(true);
        break;
      }
      if (!this.C.equals("3")) {
        break;
      }
      this.i.setVisibility(0);
      this.i.setEnabled(true);
      this.i.setChecked(true);
      this.i.setFocusable(true);
      break;
    }
    paramh.setVisibility(0);
    this.j.setVisibility(0);
  }
  
  private void e(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    int i1 = paramh.g();
    if (i1 == 0) {}
    for (;;)
    {
      return;
      if (i1 > 0)
      {
        int k = 0;
        while (k < i1)
        {
          double d1 = Double.parseDouble(paramh.a(k, "1036").trim());
          double d2 = Double.parseDouble(paramh.a(k, "1695").trim());
          double d3 = Double.parseDouble(paramh.a(k, "6169").trim());
          double d4 = Double.parseDouble(paramh.a(k, "6170").trim());
          this.E.add(new double[] { d1, d2, d3, d4 });
          k += 1;
        }
      }
    }
  }
  
  private String[] f()
  {
    int k = (int)this.d.getSelectedItemId();
    if (o.z.length == 0) {
      return new String[] { "", "", "" };
    }
    return o.z[k];
  }
  
  private void g()
  {
    String str = this.c.getText().toString();
    this.F = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(12190)).a("1036", str).h()) });
    registRequestListener(this.F);
    a(this.F, true);
  }
  
  private void h()
  {
    this.G = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(12328)).h()) });
    registRequestListener(this.G);
    a(this.G, true);
  }
  
  private void i()
  {
    String str2 = this.c.getText().toString();
    String str3 = this.f.getText().toString();
    String str1 = this.j.getText().toString();
    String[] arrayOfString = f();
    String str4 = n.t(this.s);
    String str5 = n.t(this.u);
    if (this.i.isChecked()) {}
    for (Object localObject = "1";; localObject = "0")
    {
      localObject = o.g(String.valueOf(12192)).a("1021", arrayOfString[0]).a("1019", arrayOfString[1]).a("1036", str2).a("1683", str4).a("1684", str5).a("1040", str3).a("1688", (String)localObject);
      a((com.android.dazhihui.ui.delegate.b.h)localObject, str1);
      this.J = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.J);
      a(this.J, true);
      return;
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.b.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.d = getResources().getString(2131165206);
    paramct.a = 40;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    com.android.dazhihui.ui.delegate.b.u.a(paramj, this);
    paramj = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramj.b()) {
      c(paramj.d());
    }
    do
    {
      return;
      if (paramh == this.F)
      {
        c(paramj);
        d(paramj);
        h();
        return;
      }
      if (paramh == this.J)
      {
        paramh = paramj.a(0, "1042");
        c("\t\t委托请求提交成功。合同号为：" + paramh);
        h();
        return;
      }
      if (paramh == this.G)
      {
        b(paramj);
        return;
      }
      if (paramh == this.H)
      {
        b(paramj);
        return;
      }
    } while (paramh != this.I);
    e(paramj);
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    if (paramBundle != null) {
      this.n = paramBundle.getString("codes");
    }
    this.w = com.android.dazhihui.ui.delegate.c.a.K;
    this.x = com.android.dazhihui.ui.delegate.c.a.L;
    setContentView(2130903518);
    this.b = ((DzhHeader)findViewById(2131558513));
    this.b.a(this, this);
    this.c = ((EditText)findViewById(2131560940));
    this.d = ((Spinner)findViewById(2131560941));
    this.e = ((EditText)findViewById(2131560942));
    this.f = ((EditText)findViewById(2131560946));
    this.i = ((CheckBox)findViewById(2131560947));
    this.j = ((EditText)findViewById(2131560949));
    this.m = ((TextView)findViewById(2131559761));
    this.c.setText(this.n);
    this.h = ((TableRow)findViewById(2131560943));
    paramBundle = new String[o.z.length];
    int k = 0;
    while (k < paramBundle.length)
    {
      paramBundle[k] = (o.q(o.z[k][0]) + " " + o.z[k][1]);
      k += 1;
    }
    paramBundle = new ArrayAdapter(this, 17367048, paramBundle);
    paramBundle.setDropDownViewResource(17367049);
    this.d.setAdapter(paramBundle);
    ((Button)findViewById(2131560639)).setOnClickListener(new a(this));
    this.i.setOnCheckedChangeListener(new b(this));
    a();
    g();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, 3, this.K, this.y, this.z, this.A);
    localDatePickerDialog.setTitle("请选择 终止日期");
    return localDatePickerDialog;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\OfferRepurchaseEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */