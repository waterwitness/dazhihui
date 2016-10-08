package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.Dialog;
import android.content.Context;
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
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class IFundAtone
  extends DelegateBaseActivity
  implements cp, cs
{
  private Spinner a;
  private EditText b;
  private EditText c;
  private EditText d;
  private EditText e;
  private Button f;
  private String g = "";
  private String h;
  private String[] i;
  private DzhHeader j;
  private int m = -1;
  private com.android.dazhihui.a.b.u n;
  private com.android.dazhihui.a.b.u o;
  private com.android.dazhihui.a.b.u p;
  
  private void d()
  {
    this.b.setText("");
    this.c.setText("");
    this.d.setText("");
    this.e.setText("");
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new ce(this, paramString));
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
    this.m = 11102;
    this.n = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.g).h()) });
    registRequestListener(this.n);
    a(this.n, true);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.m = 11146;
    this.o = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", o.z[this.a.getSelectedItemPosition()][1]).a("1036", this.g).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.o);
    a(this.o, true);
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　基金代码和赎回份额都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        localToast = Toast.makeText(this, "　　基金代码必须为完整的6位。", 0);
        localToast.setGravity(17, 0, 0);
        localToast.show();
        return;
      }
    } while (paramInt != 2);
    Toast localToast = Toast.makeText(this, "　　没有匹配的股东账号，无法交易。", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void c()
  {
    if ((o.z == null) || (o.z.length == 0)) {}
    while (!o.r()) {
      return;
    }
    this.m = 12018;
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12018").a("1026", 1).a("1021", o.z[this.a.getSelectedItemPosition()][0]).a("1019", o.z[this.a.getSelectedItemPosition()][1]);
    if (this.h == null) {}
    for (String str = "0";; str = this.h)
    {
      this.p = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1003", str).a("1036", this.b.getText().toString()).a("1041", "").a("1040", this.c.getText().toString()).h()) });
      registRequestListener(this.p);
      a(this.p, true);
      d();
      return;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (cf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.j == null);
      this.j.a(paramy);
      return;
    } while (this.j == null);
    this.j.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "场内赎回";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.j = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    this.m = -1;
    paramj = ((v)paramj).b();
    if (paramj == null) {
      if (paramh == this.p) {
        c("　　网络连接异常，请查询今日委托，检查本次委托是否提交成功。");
      }
    }
    label175:
    do
    {
      do
      {
        return;
        if (paramh == this.n)
        {
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          int k;
          if ((paramh.b()) && (paramh.g() > 0))
          {
            paramj = paramh.a(0, "1021");
            k = o.z.length - 1;
          }
          for (;;)
          {
            if (k > 0)
            {
              if (!o.z[k][0].equals(paramj)) {
                break label175;
              }
              String str = o.z[k][2];
              if ((str != null) && (str.equals("1"))) {
                this.a.setSelection(k);
              }
            }
            else
            {
              this.h = paramh.a(0, "1003");
              this.e.setText(paramh.a(0, "1037"));
              b();
              return;
            }
            this.a.setSelection(k);
            k -= 1;
          }
        }
        if (paramh != this.o) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      } while (!paramh.b());
      paramj = this.d;
      if (paramh.g() > 0) {}
      for (paramh = paramh.a(0, "1061");; paramh = "0")
      {
        paramj.setText(paramh);
        return;
      }
    } while (paramh != this.p);
    d();
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b())
    {
      paramh = paramh.a(0, "1042");
      a("　　委托请求提交成功。合同号为：" + paramh, true);
      return;
    }
    c(paramh.d());
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    getLoadingDialog().dismiss();
    switch (this.m)
    {
    }
    for (;;)
    {
      this.m = -1;
      return;
      d("请求超时，请查看转账查询，确认是否成功提交 ");
      continue;
      d("网络中断，请设置网络连接");
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903500);
    this.j = ((DzhHeader)findViewById(2131558513));
    this.j.a(this, this);
    this.i = new String[o.z.length];
    int k = 0;
    while (k < this.i.length)
    {
      this.i[k] = o.z[k][1];
      k += 1;
    }
    this.a = ((Spinner)findViewById(2131560849));
    this.a.setPrompt("请选择股东帐号");
    paramBundle = new ArrayAdapter(this, 17367048, this.i);
    paramBundle.setDropDownViewResource(17367049);
    this.a.setVisibility(1);
    this.a.setAdapter(paramBundle);
    this.a.setOnItemSelectedListener(new ca(this));
    this.b = ((EditText)findViewById(2131560851));
    this.c = ((EditText)findViewById(2131560853));
    this.d = ((EditText)findViewById(2131560855));
    this.e = ((EditText)findViewById(2131560857));
    this.b.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.d.setFocusable(false);
    this.e.setFocusable(false);
    this.b.addTextChangedListener(new cb(this));
    this.f = ((Button)findViewById(2131560858));
    this.f.setOnClickListener(new cc(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.m == 12018))
    {
      a("委托请求已发送，请查看委托查询，确认是否成功提交", true);
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\IFundAtone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */