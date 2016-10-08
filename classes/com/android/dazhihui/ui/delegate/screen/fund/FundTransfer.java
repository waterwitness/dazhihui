package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundTransfer
  extends DelegateBaseActivity
  implements cp, cs
{
  private String a = "";
  private String b = "";
  private EditText c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private EditText h;
  private EditText i;
  private Button j;
  private DzhHeader m;
  private int n = -1;
  private String o;
  private String p;
  private com.android.dazhihui.a.b.u q;
  private com.android.dazhihui.a.b.u r;
  private com.android.dazhihui.a.b.u s;
  private String t = "0";
  private com.android.dazhihui.a.b.u u;
  
  private void a()
  {
    this.i.setText("");
  }
  
  private void b()
  {
    this.c.setText("");
    this.d.setText("");
    this.e.setText("");
    this.f.setText("");
    this.g.setText("");
    this.h.setText("");
    this.i.setText("");
  }
  
  private void c()
  {
    this.o = "";
    this.p = "";
  }
  
  private void d()
  {
    if (!o.r()) {
      return;
    }
    this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", this.a).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.q);
    a(this.q, true);
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new bx(this, paramString));
  }
  
  private void f()
  {
    if (!o.r()) {
      return;
    }
    this.n = 11906;
    this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11906").a("1090", this.a).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.r);
    a(this.r, true);
  }
  
  private void g()
  {
    if (!o.r()) {
      return;
    }
    this.n = 11916;
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", this.a).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.s);
    a(this.s, true);
  }
  
  private void h()
  {
    if (!o.r()) {
      return;
    }
    this.n = 11904;
    if (!"0".equals(this.t)) {}
    for (com.android.dazhihui.ui.delegate.b.h localh = o.g("11904").a("1090", this.b).a("1095", this.o).a("1515", "1").a("1093", this.p).a("1092", this.p);; localh = o.g("11904").a("1090", this.b).a("1095", this.o).a("1396", "1").a("1515", this.t).a("1093", this.p).a("1092", this.p))
    {
      this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.u);
      a(this.u, true);
      a();
      return;
      this.o = this.f.getText().toString();
      this.p = this.i.getText().toString();
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　转出基金代码必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "　　转出基金代码必须为完整的6位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "　　转入基金代码必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 3)
    {
      localToast = Toast.makeText(this, "　　转入基金代码必须为完整的6位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 4)
    {
      localToast = Toast.makeText(this, "　　转换份额必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (by.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.m == null);
      this.m.a(paramy);
      return;
    } while (this.m == null);
    this.m.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金转换";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.m = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {}
    label189:
    do
    {
      return;
      com.android.dazhihui.ui.delegate.b.h localh;
      if (paramh == this.q)
      {
        localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if ((localh.b()) && (localh.g() > 0))
        {
          this.d.setText(localh.a(0, "1089"));
          this.e.setText(localh.a(0, "1091"));
        }
        f();
      }
      for (;;)
      {
        if (paramh != this.s) {
          break label189;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if ((!paramh.b()) || (paramh.g() <= 0)) {
          break;
        }
        this.g.setText(paramh.a(0, "1091"));
        return;
        if (paramh == this.r)
        {
          localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if ((localh.b()) && (localh.g() > 0)) {
            this.h.setText(localh.a(0, "1098"));
          } else {
            this.h.setText("0");
          }
        }
      }
    } while (paramh != this.u);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b()) {
      try
      {
        paramj = paramh.a(0, "1208");
        if ((paramh.a(0, "1208") != null) && (paramh.a(0, "1396") != null))
        {
          new AlertDialog.Builder(this).setTitle("提示信息").setMessage(paramj).setPositiveButton("确定", new bw(this)).setNegativeButton("取消", new bv(this)).show();
          return;
        }
      }
      catch (Exception paramj)
      {
        c();
        a(paramh.a(0, "1208"), true);
      }
    }
    for (;;)
    {
      b();
      return;
      c();
      c(paramh.d());
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    getLoadingDialog().dismiss();
    switch (this.n)
    {
    }
    for (;;)
    {
      this.n = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 ");
      continue;
      d("网络中断，请设置网络连接");
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903486);
    this.m = ((DzhHeader)findViewById(2131558513));
    this.m.a(this, this);
    this.c = ((EditText)findViewById(2131560730));
    this.d = ((EditText)findViewById(2131560732));
    this.e = ((EditText)findViewById(2131560744));
    this.f = ((EditText)findViewById(2131560736));
    this.g = ((EditText)findViewById(2131560738));
    this.h = ((EditText)findViewById(2131560740));
    this.i = ((EditText)findViewById(2131560742));
    this.c.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.f.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.d.setFocusable(false);
    this.e.setFocusable(false);
    this.g.setFocusable(false);
    this.h.setFocusable(false);
    this.c.addTextChangedListener(new bq(this));
    this.f.addTextChangedListener(new br(this));
    this.j = ((Button)findViewById(2131560743));
    this.j.setOnClickListener(new bs(this));
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    getLoadingDialog().dismiss();
    switch (this.n)
    {
    }
    for (;;)
    {
      this.n = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 ");
      continue;
      d("网络中断，请设置网络连接");
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.n == 11904))
    {
      a("委托请求已发送，请查看委托查询，确认是否成功提交", true);
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundTransfer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */