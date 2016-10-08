package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.stock.TipActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  private ArrayAdapter<String> A;
  private int a;
  private String b = "";
  private EditText c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private EditText h;
  private Spinner i;
  private EditText j;
  private Button m;
  private int n = -1;
  private DzhHeader o;
  private int p = -1;
  private String q;
  private String r;
  private String s;
  private com.android.dazhihui.a.b.u t;
  private com.android.dazhihui.a.b.u u;
  private String v = "0";
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.u x;
  private String[] y;
  private String[] z;
  
  private void a()
  {
    this.d.setText("");
  }
  
  private void b()
  {
    this.c.setText("");
    this.d.setText("");
    this.e.setText("");
    this.f.setText("");
    this.g.setText("");
    this.h.setText("");
    this.j.setText("");
    if (this.A != null)
    {
      this.A = new ArrayAdapter(this, 17367048, this.z);
      this.A.setDropDownViewResource(17367049);
      this.i.setAdapter(this.A);
    }
    this.i.setEnabled(false);
  }
  
  private void c()
  {
    this.q = "";
    this.r = "";
  }
  
  private void d()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11916;
    this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", this.b).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.t);
    a(this.t, true);
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new as(this, paramString));
  }
  
  private void f()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11104;
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.u);
    a(this.u, false);
  }
  
  private void g()
  {
    if (!o.r()) {
      return;
    }
    this.p = 11900;
    com.android.dazhihui.ui.delegate.b.h localh2;
    com.android.dazhihui.ui.delegate.b.h localh1;
    int k;
    if (!"0".equals(this.v))
    {
      localh2 = o.g("11900").a("1088", this.a).a("1090", this.q).a("1093", this.r).a("1515", "1").a("1092", "").a("1097", "");
      localh1 = localh2;
      if (this.i.isEnabled())
      {
        k = this.i.getSelectedItemPosition();
        localh2.a("1255", this.y[k]);
        localh1 = localh2;
      }
    }
    for (;;)
    {
      this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh1.h()) });
      registRequestListener(this.w);
      a(this.w, true);
      b();
      return;
      this.q = this.c.getText().toString();
      this.r = this.d.getText().toString();
      localh2 = o.g("11900").a("1088", this.a).a("1090", this.q).a("1093", this.r).a("1396", "1").a("1515", this.v).a("1092", "").a("1097", "");
      localh1 = localh2;
      if (this.i.isEnabled())
      {
        k = this.i.getSelectedItemPosition();
        localh2.a("1255", this.y[k]);
        localh1 = localh2;
      }
    }
  }
  
  private void h()
  {
    if (!o.r()) {}
    while (this.s == null) {
      return;
    }
    this.p = 11900;
    this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11924").a("1011", "0").a("1206", 0).a("1277", 1).a("1115", this.s).h()) });
    registRequestListener(this.x);
    a(this.x, true);
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
    StringBuilder localStringBuilder;
    if (paramInt == 0)
    {
      localStringBuilder = new StringBuilder().append("　　基金代码和");
      if (this.a != 0) {
        break label88;
      }
    }
    label88:
    for (Object localObject = "认购";; localObject = "申购")
    {
      localObject = Toast.makeText(this, (String)localObject + "金额都必须填写。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      if (paramInt == 1)
      {
        localObject = Toast.makeText(this, "　　基金代码必须为完整的6位。", 0);
        ((Toast)localObject).setGravity(17, 0, 0);
        ((Toast)localObject).show();
      }
      return;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (at.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.o.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.o.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金认购";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.o = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    this.p = -1;
    paramj = ((v)paramj).b();
    if (paramj == null) {
      if (paramh == this.w) {
        c("　　网络连接异常，请查询今日委托，检查本次委托是否提交成功。");
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramh == this.t)
          {
            paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
            if ((paramh.b()) && (paramh.g() > 0))
            {
              this.f.setText(paramh.a(0, "1091"));
              this.g.setText(paramh.a(0, "1094"));
              this.h.setText(paramh.a(0, "1123"));
              this.j.setText(paramh.a(0, "1336"));
              paramj = paramh.a(0, "1323");
              if ((paramj != null) && (!paramj.equals(""))) {
                this.n = Integer.parseInt(paramj);
              }
              this.s = paramh.a(0, "1115");
              this.y = paramh.a(0, "1255").split(",");
              this.z = paramh.a(0, "1256").split(",");
              this.A = new ArrayAdapter(this, 17367048, this.z);
              this.A.setDropDownViewResource(17367049);
              this.i.setAdapter(this.A);
              this.i.setEnabled(true);
            }
            f();
            return;
          }
          if (paramh != this.u) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        } while ((!paramh.b()) || (paramh.g() <= 0));
        this.e.setText(paramh.a(0, "1078"));
        return;
        if (paramh != this.x) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      } while ((!paramh.b()) || (paramh.g() <= 0));
      if (paramh.b(0, "1944") == 0)
      {
        paramj = paramh.a(0, "1089");
        this.s = paramh.a(0, "1115");
        Bundle localBundle = new Bundle();
        localBundle.putInt("type", 6);
        localBundle.putBoolean("directopen", true);
        localBundle.putString("fundcompanycode", this.s);
        paramh = paramj;
        if (paramj == null) {
          paramh = "";
        }
        localBundle.putString("fundcompanyname", paramh);
        startActivity(TipActivity.class, localBundle);
        return;
      }
      g();
      return;
    } while (paramh != this.w);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b()) {
      try
      {
        paramj = paramh.a(0, "1208");
        if (paramh.a(0, "1208") != null)
        {
          new AlertDialog.Builder(this).setTitle("提示信息").setMessage(paramj).setPositiveButton("确定", new ar(this)).setNegativeButton("取消", new aq(this)).show();
          return;
        }
      }
      catch (Exception paramj)
      {
        c();
        paramh = paramh.a(0, "1042");
        a("　　委托请求提交成功。合同号为：" + paramh, true);
        c();
        return;
      }
    }
    c();
    b();
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
    paramBundle = getIntent().getExtras();
    this.a = paramBundle.getInt("screenId");
    setContentView(2130903482);
    TextView localTextView = (TextView)findViewById(2131560731);
    this.o = ((DzhHeader)findViewById(2131558513));
    this.o.a(this, this);
    if (this.a == 0) {
      this.o.setTitle("基金认购");
    }
    for (;;)
    {
      this.c = ((EditText)findViewById(2131560730));
      this.d = ((EditText)findViewById(2131560732));
      this.e = ((EditText)findViewById(2131560744));
      this.f = ((EditText)findViewById(2131560736));
      this.g = ((EditText)findViewById(2131560738));
      this.h = ((EditText)findViewById(2131560740));
      this.j = ((EditText)findViewById(2131560742));
      this.i = ((Spinner)findViewById(2131560745));
      this.i.setEnabled(false);
      this.c.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
      this.e.setFocusable(false);
      this.f.setFocusable(false);
      this.g.setFocusable(false);
      this.h.setFocusable(false);
      this.j.setFocusable(false);
      this.c.addTextChangedListener(new am(this));
      paramBundle = paramBundle.getString("scode");
      if (paramBundle != null) {
        this.c.setText(paramBundle);
      }
      this.m = ((Button)findViewById(2131560743));
      this.m.setOnClickListener(new an(this));
      return;
      this.o.setTitle("基金申购");
      localTextView.setText("申购金额");
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */