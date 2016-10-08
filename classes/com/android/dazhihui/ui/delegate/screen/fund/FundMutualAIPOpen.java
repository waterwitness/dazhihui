package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundMutualAIPOpen
  extends DelegateBaseActivity
  implements cp, cs
{
  private String A;
  private String B;
  private String C;
  private int D;
  private DzhHeader E;
  private DatePickerDialog.OnDateSetListener F = new bi(this);
  private DatePickerDialog.OnDateSetListener G = new bj(this);
  private com.android.dazhihui.a.b.u H;
  private com.android.dazhihui.a.b.u I;
  private String J = "0";
  private com.android.dazhihui.a.b.u K;
  protected String a;
  protected String b;
  private TextView c;
  private EditText d;
  private TextView e;
  private TextView f;
  private EditText g;
  private TextView h;
  private EditText i;
  private Spinner j;
  private Spinner m;
  private EditText n;
  private EditText o;
  private EditText p;
  private Button q;
  private TextView r;
  private String s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private com.android.dazhihui.ui.delegate.b.h z;
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("MutualAIPOpen_flag", paramInt);
    localBundle.putString("mark_name", paramString);
    paramString = new Intent(paramContext, FundMutualAIPOpen.class);
    paramString.putExtras(localBundle);
    paramContext.startActivity(paramString);
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    this.i.setText(paramh.a(0, "1091"));
    this.g.setText(paramh.a(0, "1089"));
    this.z = paramh;
  }
  
  private void b(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    int k = 0;
    this.r.setText(paramh.a(0, "1078"));
    int i1 = paramh.g();
    while (k < i1)
    {
      String str1 = n.t(paramh.a(k, "1415"));
      String str2 = n.t(paramh.a(k, "1028"));
      if ((str1.equals("1")) && (str2.equals("0"))) {
        this.r.setText(paramh.a(k, "1078"));
      }
      k += 1;
    }
  }
  
  private void c(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (paramh == null) {
      return;
    }
    if (!paramh.b())
    {
      q();
      p();
      c(paramh.d());
      return;
    }
    try
    {
      String str = paramh.a(0, "1208");
      if (paramh.a(0, "1208") != null)
      {
        new AlertDialog.Builder(this).setTitle("提示信息").setMessage(str).setPositiveButton("确定", new bd(this)).setNegativeButton("取消", new bc(this)).show();
        return;
      }
    }
    catch (Exception localException)
    {
      q();
      paramh = paramh.a(0, "1042");
      a("　　委托请求提交成功。合同号为：" + paramh, true);
      q();
    }
  }
  
  private void d()
  {
    if (this.D == 12484)
    {
      this.c.setText("产品代码");
      this.h.setText("产品名称");
      this.f.setText("产品公司");
    }
  }
  
  private void f()
  {
    a();
    this.n.setText(this.a);
    this.o.setText(this.b);
    try
    {
      this.t = Integer.valueOf(this.n.getText().toString().substring(0, 4)).intValue();
      this.u = (Integer.valueOf(this.n.getText().toString().substring(4, 6)).intValue() - 1);
      this.v = Integer.valueOf(this.n.getText().toString().substring(6, 8)).intValue();
      this.w = Integer.valueOf(this.o.getText().toString().substring(0, 4)).intValue();
      this.x = (Integer.valueOf(this.o.getText().toString().substring(4, 6)).intValue() - 1);
      this.y = Integer.valueOf(this.o.getText().toString().substring(6, 8)).intValue();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void g()
  {
    this.n.setText(new StringBuilder().append(bz.a(this.t)).append(bz.a(this.u + 1)).append(bz.a(this.v)));
  }
  
  private void h()
  {
    this.o.setText(new StringBuilder().append(bz.a(this.w)).append(bz.a(this.x + 1)).append(bz.a(this.y)));
  }
  
  private void i()
  {
    if (this.z == null) {}
    while (!o.r()) {
      return;
    }
    try
    {
      String str1 = this.d.getText().toString();
      String str2 = this.p.getText().toString();
      String str3 = n.t(this.z.a(0, "1115"));
      String str4 = this.n.getText().toString();
      String str5 = this.o.getText().toString();
      String str6 = this.m.getSelectedItem().toString();
      String str7 = az.a(this.j.getSelectedItem().toString());
      this.A = str1;
      this.B = str2;
      this.C = str3;
      this.K = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12082").a("1115", str3).a("1090", str1).a("1093", str2).a("1022", str4).a("1023", str5).a("1396", "1").a("1397", str6).a("1398", str7).a("1255", "").a("1515", this.J).a("1411", "0").h()) });
      registRequestListener(this.K);
      a(this.K, true);
      return;
    }
    catch (Exception localException)
    {
      c("请查看数据是否完整");
      localException.printStackTrace();
    }
  }
  
  private void j()
  {
    if (!o.r()) {
      return;
    }
    try
    {
      String str1 = this.n.getText().toString();
      String str2 = this.o.getText().toString();
      String str3 = this.m.getSelectedItem().toString();
      String str4 = az.a(this.j.getSelectedItem().toString());
      this.K = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12082").a("1115", this.C).a("1090", this.A).a("1093", this.B).a("1022", str1).a("1023", str2).a("1396", "1").a("1397", str3).a("1398", str4).a("1255", "").a("1515", this.J).a("1411", "0").h()) });
      registRequestListener(this.K);
      a(this.K, true);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void k()
  {
    String str = l();
    new AlertDialog.Builder(this).setTitle(this.s).setMessage(str).setPositiveButton(2131165363, new bl(this)).setNegativeButton(2131165331, new bk(this)).show();
  }
  
  private String l()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localStringBuilder.append("基金代码:\t").append(this.d.getText().toString()).append("\n");
      localStringBuilder.append("基金名称:\t").append(this.i.getText().toString()).append("\n");
      localStringBuilder.append("定投方式:\t").append(this.j.getSelectedItem().toString()).append("\n");
      localStringBuilder.append("周期发送日:\t").append(this.m.getSelectedItem().toString()).append("\n");
      localStringBuilder.append("开始日期:\t").append(this.n.getText().toString()).append("\n");
      localStringBuilder.append("结束日期:\t").append(this.o.getText().toString()).append("\n");
      localStringBuilder.append("定投金额:\t").append(this.p.getText().toString()).append("\n");
      return localStringBuilder.toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  private void m()
  {
    i();
  }
  
  private String n()
  {
    if (this.z == null) {
      return "";
    }
    String str1 = this.z.a(0, "1090");
    String str2 = this.z.a(0, "1091");
    String str3 = this.z.a(0, "1094");
    String str4 = this.z.a(0, "1123");
    String str5 = this.z.a(0, "1336");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("基金代码：").append("\t").append(str1).append("\n");
    localStringBuffer.append("基金名称：").append("\t").append(str2).append("\n");
    localStringBuffer.append("基金净值：").append("\t").append(str3).append("\n");
    localStringBuffer.append("基金状态：").append("\t").append(str4).append("\n");
    localStringBuffer.append("基金风险级别：").append("\t").append(str5).append("\n");
    return localStringBuffer.toString();
  }
  
  private void o()
  {
    if (this.z == null)
    {
      c("没有获取相关数据");
      return;
    }
    a("基金信息", n(), "返回");
  }
  
  private void p()
  {
    this.d.setText("");
    r();
  }
  
  private void q()
  {
    this.A = "";
    this.B = "";
    this.C = "";
  }
  
  private void r()
  {
    this.g.setText("");
    this.i.setText("");
    this.p.setText("");
    this.z = null;
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected void a()
  {
    this.a = o.y();
    this.b = bz.a(this.a, 30);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    String str = this.d.getText().toString();
    this.H = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(String.valueOf(this.D)).a("1090", str).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.H);
    a(this.H, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.I);
    a(this.I, true);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.s;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.E = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {}
    do
    {
      do
      {
        do
        {
          return;
          if (paramh == this.K)
          {
            c(com.android.dazhihui.ui.delegate.b.h.b(paramj.e()));
            return;
          }
          if (paramh != this.H) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        } while ((!paramh.b()) || (paramh.g() <= 0));
        a(paramh);
        return;
      } while (paramh != this.I);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    } while ((!paramh.b()) || (paramh.g() <= 0));
    b(paramh);
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
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.s = paramBundle.getString("mark_name");
      this.D = paramBundle.getInt("MutualAIPOpen_flag", 11916);
    }
    a();
    setContentView(2130903484);
    this.E = ((DzhHeader)findViewById(2131558513));
    this.E.a(this, this);
    this.c = ((TextView)findViewById(2131560717));
    this.d = ((EditText)findViewById(2131560718));
    this.e = ((TextView)findViewById(2131560747));
    this.f = ((TextView)findViewById(2131560749));
    this.g = ((EditText)findViewById(2131560750));
    this.h = ((TextView)findViewById(2131560751));
    this.i = ((EditText)findViewById(2131560752));
    this.j = ((Spinner)findViewById(2131560754));
    this.m = ((Spinner)findViewById(2131560756));
    this.n = ((EditText)findViewById(2131560758));
    this.o = ((EditText)findViewById(2131560760));
    this.p = ((EditText)findViewById(2131560761));
    this.r = ((TextView)findViewById(2131560763));
    this.q = ((Button)findViewById(2131560727));
    this.d.addTextChangedListener(new bb(this));
    this.e.setClickable(true);
    this.e.setTextColor(-16776961);
    this.e.setOnClickListener(new be(this));
    this.n.setClickable(true);
    this.o.setClickable(true);
    f();
    this.n.setOnClickListener(new bf(this));
    this.o.setOnClickListener(new bg(this));
    paramBundle = az.a();
    if (paramBundle != null)
    {
      paramBundle = new ArrayAdapter(this, 17367048, paramBundle);
      paramBundle.setDropDownViewResource(17367049);
      this.m.setAdapter(paramBundle);
    }
    paramBundle = az.b();
    if (paramBundle != null)
    {
      paramBundle = new String[paramBundle.length];
      int k = 0;
      while (k < paramBundle.length)
      {
        paramBundle[k] = az.b()[k][1];
        ArrayAdapter localArrayAdapter = new ArrayAdapter(this, 17367048, paramBundle);
        localArrayAdapter.setDropDownViewResource(17367049);
        this.j.setAdapter(localArrayAdapter);
        k += 1;
      }
    }
    this.q.setOnClickListener(new bh(this));
    d();
    c();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      localDatePickerDialog = new DatePickerDialog(this, this.F, this.t, this.u, this.v);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.G, this.w, this.x, this.y);
    localDatePickerDialog.setTitle("请选择结束日期");
    return localDatePickerDialog;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundMutualAIPOpen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */