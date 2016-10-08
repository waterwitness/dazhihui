package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.g;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundAtone
  extends DelegateBaseActivity
  implements cp, cs
{
  public String a;
  private String b = "";
  private EditText c;
  private EditText d;
  private Spinner e;
  private EditText f;
  private EditText g;
  private EditText h;
  private EditText i;
  private Button j;
  private int m = 0;
  private String[] n = { "巨额取消", "巨额顺延" };
  private DzhHeader o;
  private int p = -1;
  private String q;
  private String r;
  private com.android.dazhihui.a.b.u s;
  private com.android.dazhihui.a.b.u t;
  private String u = "0";
  private com.android.dazhihui.a.b.u v;
  
  private void d()
  {
    this.c.setText("");
    this.d.setText("");
    this.f.setText("");
    this.g.setText("");
    this.h.setText("");
    this.i.setText("");
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new y(this, paramString));
  }
  
  private void f()
  {
    this.q = "";
    this.r = "";
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11916;
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", this.b).a("1206", "0").a("1277", "1").h()) });
    this.s.a(this);
    g.a().a(this.s);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11906;
    this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11906").a("1090", this.b).a("1206", "0").a("1277", "1").h()) });
    this.t.a(this);
    g.a().a(this.t);
  }
  
  public void b(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　基金代码和赎回份额都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "　　基金代码必须为完整的6位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11900;
    int k = this.e.getSelectedItemPosition();
    if (k == 0)
    {
      this.a = "0";
      if ("0".equals(this.u)) {
        break label170;
      }
    }
    for (com.android.dazhihui.ui.delegate.b.h localh = o.g("11900").a("1088", 2).a("1090", this.q).a("1092", this.r).a("1097", "").a("1093", "").a("1515", "1").a("1583", this.a);; localh = o.g("11900").a("1088", 2).a("1090", this.q).a("1093", "").a("1092", this.r).a("1097", "").a("1583", this.a))
    {
      this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      this.v.a(this);
      g.a().a(this.v);
      d();
      return;
      if (k != 1) {
        break;
      }
      this.a = "1";
      break;
      label170:
      this.q = this.c.getText().toString();
      this.r = this.d.getText().toString();
    }
  }
  
  protected void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (z.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.o == null);
      this.o.a(paramy);
      return;
    } while (this.o == null);
    this.o.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金赎回";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.o = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = (com.android.dazhihui.a.b.v)paramj;
    this.p = -1;
    paramj = paramj.b();
    if (paramj == null) {
      if (paramh == this.v) {
        c("　　网络连接异常，请查询今日委托，检查本次委托是否提交成功。");
      }
    }
    do
    {
      do
      {
        return;
        if (paramh == this.s)
        {
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if ((paramh.b()) && (paramh.g() > 0))
          {
            this.g.setText(paramh.a(0, "1091"));
            this.h.setText(paramh.a(0, "1094"));
            this.i.setText(paramh.a(0, "1123"));
          }
          b();
          return;
        }
        if (paramh != this.t) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if ((paramh.b()) && (paramh.g() > 0)) {
          this.f.setText(paramh.a(0, "1078"));
        }
      } while (!paramh.b());
      paramj = this.f;
      if (paramh.g() > 0) {}
      for (paramh = paramh.a(0, "1098");; paramh = "0")
      {
        paramj.setText(paramh);
        return;
      }
    } while (paramh != this.v);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b())
    {
      f();
      paramh = paramh.a(0, "1042");
      a("　　委托请求提交成功。合同号为：" + paramh, true);
      return;
    }
    d();
    f();
    c(paramh.d());
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    getLoadingDialog().dismiss();
    switch (this.p)
    {
    }
    for (;;)
    {
      this.p = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 ");
      continue;
      d("网络中断，请设置网络连接");
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getExtras();
      if (paramBundle == null) {}
    }
    for (paramBundle = paramBundle.getString("codes", "");; paramBundle = "")
    {
      setContentView(2130903480);
      this.o = ((DzhHeader)findViewById(2131558513));
      this.o.a(this, this);
      this.c = ((EditText)findViewById(2131560730));
      this.d = ((EditText)findViewById(2131560732));
      this.e = ((Spinner)findViewById(2131560734));
      ArrayAdapter localArrayAdapter = new ArrayAdapter(this, 17367048, this.n);
      localArrayAdapter.setDropDownViewResource(17367049);
      this.e.setAdapter(localArrayAdapter);
      this.e.setVisibility(1);
      this.e.setOnItemSelectedListener(new t(this));
      this.f = ((EditText)findViewById(2131560736));
      this.g = ((EditText)findViewById(2131560738));
      this.h = ((EditText)findViewById(2131560740));
      this.i = ((EditText)findViewById(2131560742));
      this.c.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
      this.f.setFocusable(false);
      this.g.setFocusable(false);
      this.h.setFocusable(false);
      this.i.setFocusable(false);
      this.c.addTextChangedListener(new u(this));
      if (!"".equals(paramBundle)) {
        this.c.setText(paramBundle);
      }
      this.j = ((Button)findViewById(2131560743));
      this.j.setOnClickListener(new v(this));
      return;
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    getLoadingDialog().dismiss();
    switch (this.p)
    {
    }
    for (;;)
    {
      this.p = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 ");
      continue;
      d("网络中断，请设置网络连接");
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.p == 11900))
    {
      a("委托请求已发送，请查看委托查询，确认是否成功提交", true);
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundAtone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */