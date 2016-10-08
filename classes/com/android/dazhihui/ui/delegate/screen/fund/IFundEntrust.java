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
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class IFundEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private int b;
  private Spinner c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private String h = "";
  private String i;
  private int j;
  private Button m;
  private int n = -1;
  private com.android.dazhihui.a.b.u o;
  private com.android.dazhihui.a.b.u p;
  private com.android.dazhihui.a.b.u q;
  
  private void d()
  {
    this.d.setText("");
    this.e.setText("");
    this.f.setText("");
    this.g.setText("");
  }
  
  private void d(String paramString)
  {
    runOnUiThread(new ck(this, paramString));
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
    this.n = 11102;
    this.o = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.h).h()) });
    registRequestListener(this.o);
    a(this.o, true);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.n = 11104;
    this.p = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.p);
    a(this.p, false);
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 0)
    {
      StringBuilder localStringBuilder = new StringBuilder().append("　　基金代码和");
      if (this.b == 2)
      {
        localObject = "认购";
        localObject = Toast.makeText(this, (String)localObject + "金额都必须填写。", 0);
        ((Toast)localObject).setGravity(17, 0, 0);
        ((Toast)localObject).show();
      }
    }
    do
    {
      return;
      localObject = "申购";
      break;
      if (paramInt == 1)
      {
        localObject = Toast.makeText(this, "　　基金代码必须为完整的6位。", 0);
        ((Toast)localObject).setGravity(17, 0, 0);
        ((Toast)localObject).show();
        return;
      }
    } while (paramInt != 2);
    Object localObject = Toast.makeText(this, "　　没有匹配的股东账号，无法交易。", 0);
    ((Toast)localObject).setGravity(17, 0, 0);
    ((Toast)localObject).show();
  }
  
  public void c()
  {
    if ((o.z == null) || (o.z.length == 0)) {}
    while (!o.r()) {
      return;
    }
    this.n = 12018;
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12018").a("1026", this.b).a("1021", o.z[this.j][0]).a("1019", o.z[this.j][1]);
    if (this.i == null) {}
    for (String str = "0";; str = this.i)
    {
      this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1003", str).a("1036", this.d.getText().toString()).a("1041", "").a("1040", this.e.getText().toString()).h()) });
      registRequestListener(this.q);
      a(this.q, true);
      d();
      return;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (cl.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    if (this.b == 2) {}
    for (paramContext = "场内认购";; paramContext = "场内申购")
    {
      paramct.a = 40;
      paramct.d = paramContext;
      paramct.p = this;
      return;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    this.n = -1;
    paramj = ((v)paramj).b();
    if (paramj == null) {
      if (paramh == this.q) {
        c("　　网络连接异常，请查询今日委托，检查本次委托是否提交成功。");
      }
    }
    label176:
    do
    {
      do
      {
        return;
        if (paramh == this.o)
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
            if (k >= 0)
            {
              if (!o.z[k][0].equals(paramj)) {
                break label176;
              }
              String str = o.z[k][2];
              if ((str != null) && (str.equals("1"))) {
                this.c.setSelection(k);
              }
            }
            else
            {
              this.i = paramh.a(0, "1003");
              this.g.setText(paramh.a(0, "1037"));
              b();
              return;
            }
            this.c.setSelection(k);
            k -= 1;
          }
        }
        if (paramh != this.p) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      } while ((!paramh.b()) || (paramh.g() <= 0));
      this.f.setText(paramh.a(0, "1078"));
      return;
    } while (paramh != this.q);
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
    switch (this.n)
    {
    }
    for (;;)
    {
      this.n = -1;
      return;
      d("请求超时，请查看转账查询，确认是否成功提交 ");
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903501);
    this.b = getIntent().getExtras().getInt("screenId");
    this.a = ((DzhHeader)findViewById(2131558513));
    this.a.a(this, this);
    paramBundle = new String[o.z.length];
    int k = 0;
    while (k < paramBundle.length)
    {
      paramBundle[k] = o.z[k][1];
      k += 1;
    }
    this.c = ((Spinner)findViewById(2131560849));
    this.c.setPrompt("请选择股东帐号");
    paramBundle = new ArrayAdapter(this, 17367048, paramBundle);
    paramBundle.setDropDownViewResource(17367049);
    this.c.setVisibility(1);
    this.c.setAdapter(paramBundle);
    this.c.setOnItemSelectedListener(new cg(this));
    this.d = ((EditText)findViewById(2131560851));
    this.e = ((EditText)findViewById(2131560853));
    this.f = ((EditText)findViewById(2131560855));
    this.g = ((EditText)findViewById(2131560857));
    this.d.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.f.setFocusable(false);
    this.g.setFocusable(false);
    this.d.addTextChangedListener(new ch(this));
    this.m = ((Button)findViewById(2131560858));
    this.m.setOnClickListener(new ci(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.n == 12018))
    {
      a("委托请求已发送，请查看委托查询，确认是否成功提交 ", true);
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\IFundEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */