package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.io.PrintStream;

public class Transfer
  extends DelegateBaseActivity
  implements cp, cs
{
  private String A = null;
  private String B = "";
  private String C;
  private Spinner a;
  private Spinner b;
  private EditText c;
  private EditText d;
  private EditText e;
  private TextView f;
  private Button g;
  private String[] h = { "人民币", "美元", "港币" };
  private com.android.dazhihui.ui.delegate.b.h i;
  private int j;
  private int m = 0;
  private int n = 0;
  private DzhHeader o;
  private int p;
  private com.android.dazhihui.a.b.u q;
  private com.android.dazhihui.a.b.u r;
  private com.android.dazhihui.a.b.u s;
  private int t;
  private String[] u;
  private int[] v = null;
  private com.android.dazhihui.ui.delegate.b.h w;
  private String x = null;
  private String y = null;
  private String z = null;
  
  private void a(int paramInt)
  {
    if ((this.i == null) || (this.i.g() == 0)) {}
    do
    {
      return;
      this.x = this.i.a(paramInt, "1303");
      this.y = this.i.a(paramInt, "1339");
      this.z = this.i.a(paramInt, "1340");
      if ((this.x == null) || (this.x.equals(""))) {
        this.x = "1";
      }
      if ((this.y == null) || (this.y.equals(""))) {
        this.y = "2";
      }
      if ((this.z == null) || (this.z.equals(""))) {
        this.z = "1";
      }
      switch (this.j)
      {
      }
      while (this.A.equals("0"))
      {
        this.d.setTransformationMethod(new HideReturnsTransformationMethod());
        this.e.setTransformationMethod(new HideReturnsTransformationMethod());
        this.d.setText("无需填写");
        this.d.setEnabled(false);
        this.e.setText("无需填写");
        this.e.setEnabled(false);
        this.B = "";
        return;
        this.A = this.x;
        continue;
        this.A = this.y;
        continue;
        this.A = this.z;
      }
      if (this.A.equals("1"))
      {
        this.d.setTransformationMethod(new PasswordTransformationMethod());
        this.e.setTransformationMethod(new HideReturnsTransformationMethod());
        this.e.setText("无需填写");
        this.e.setEnabled(false);
        this.d.setText("");
        this.d.setEnabled(true);
        this.B = "银行密码";
        return;
      }
      if (this.A.equals("2"))
      {
        this.e.setTransformationMethod(new PasswordTransformationMethod());
        this.d.setTransformationMethod(new HideReturnsTransformationMethod());
        this.d.setText("无需填写");
        this.d.setEnabled(false);
        this.e.setText("");
        this.e.setEnabled(true);
        this.B = "资金密码";
        return;
      }
    } while (!this.A.equals("3"));
    this.d.setTransformationMethod(new PasswordTransformationMethod());
    this.e.setTransformationMethod(new PasswordTransformationMethod());
    this.d.setText("");
    this.d.setEnabled(true);
    this.e.setText("");
    this.e.setEnabled(true);
    this.B = "资金和银行密码";
  }
  
  private boolean f()
  {
    boolean bool = true;
    if ((this.u == null) || (this.u.length < 1)) {
      bool = false;
    }
    return bool;
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
    Toast localToast = Toast.makeText(this, "　　金额" + this.B + "必须填写。", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11130").h()) });
    registRequestListener(this.q);
    a(this.q, true);
  }
  
  public void c()
  {
    if (this.i == null) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11126").a("1186", this.i.a(this.n, "1186"));
    if ((this.A.equals("1")) || (this.A.equals("3")))
    {
      str = this.d.getText().toString();
      localh = localh.a("1189", str);
      if ((!this.A.equals("2")) && (!this.A.equals("3"))) {
        break label193;
      }
    }
    label193:
    for (String str = this.e.getText().toString();; str = "")
    {
      this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1031", str).a("1028", this.m).h()) });
      registRequestListener(this.r);
      a(this.r, true);
      return;
      str = "";
      break;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (gx.a[paramy.ordinal()])
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
    if (this.p == 3100) {
      this.C = paramContext.getResources().getString(2131165279);
    }
    if (this.j == 0) {
      this.C = paramContext.getResources().getString(2131165280);
    }
    for (;;)
    {
      paramct.a = 40;
      paramct.d = this.C;
      paramct.p = this;
      return;
      if (this.j == 1) {
        this.C = paramContext.getResources().getString(2131166380);
      }
    }
  }
  
  public void d()
  {
    if (this.i == null) {
      a("此功能已经关闭.");
    }
    while (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11122").a("1193", this.j).a("1186", this.i.a(this.n, "1186"));
    if ((this.A.equals("1")) || (this.A.equals("3")))
    {
      str = this.d.getText().toString();
      localh = localh.a("1189", str);
      if ((!this.A.equals("2")) && (!this.A.equals("3"))) {
        break label225;
      }
    }
    label225:
    for (String str = this.e.getText().toString();; str = "")
    {
      this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1031", str).a("1192", this.c.getText().toString()).a("1028", this.m).h()) });
      registRequestListener(this.s);
      a(this.s, true);
      a(0);
      return;
      str = "";
      break;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.o = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null)
    {
      if (paramh != this.q) {
        break label298;
      }
      a("获取可转帐银行列表失败，请返回重试。");
    }
    Object localObject;
    for (;;)
    {
      if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
      {
        if (paramh == this.q)
        {
          this.w = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (!this.w.b()) {
            break label536;
          }
          this.i = this.w;
          this.t = this.w.g();
          this.u = new String[this.t];
          this.v = new int[this.u.length];
          int k = 0;
          for (;;)
          {
            if (k < this.u.length)
            {
              localObject = this.w.a(k, "1187");
              this.v[k] = this.w.b(k, "1028");
              if ((this.v[k] < 0) || (this.v[k] >= this.h.length))
              {
                this.v[k] = 0;
                n.d("Exception ", "Transfer.java: type index out of boundary");
              }
              this.u[k] = ((String)localObject + " (" + this.h[this.v[k]] + ")");
              System.out.println("banks [" + k + "] " + this.u[k]);
              k += 1;
              continue;
              label298:
              a("　　网络连接异常，未收到转账请求的返回信息。");
              break;
            }
          }
          if (this.u.length <= 1) {
            break label481;
          }
          this.b.setPrompt("请选择银行名称");
          localObject = new ArrayAdapter(this, 17367048, this.u);
          ((ArrayAdapter)localObject).setDropDownViewResource(17367049);
          this.b.setVisibility(1);
          this.b.setAdapter((SpinnerAdapter)localObject);
          this.b.setClickable(true);
        }
        if (paramh == this.s)
        {
          this.w = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (!this.w.b()) {
            break label550;
          }
          b(this.w.a(0, "1208"));
        }
      }
    }
    for (;;)
    {
      if (paramh == this.r)
      {
        this.w = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (!this.w.b()) {
          break label564;
        }
        paramh = this.w.a(0, "1194");
        if ((paramh != null) && (!paramh.equals(""))) {
          this.c.setText(paramh);
        }
      }
      return;
      label481:
      a(0);
      localObject = new ArrayAdapter(this, 17367048, this.u);
      ((ArrayAdapter)localObject).setDropDownViewResource(17367049);
      this.b.setVisibility(1);
      this.b.setClickable(false);
      this.b.setAdapter((SpinnerAdapter)localObject);
      break;
      label536:
      a(this.w.d());
      break;
      label550:
      a(this.w.d());
    }
    label564:
    a(this.w.d());
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
    this.j = getIntent().getExtras().getInt("screenId");
    if (this.j == 2) {}
    for (this.p = 3100;; this.p = (this.j + 3074))
    {
      setContentView(2130903542);
      this.o = ((DzhHeader)findViewById(2131558643));
      this.o.a(this, this);
      this.a = ((Spinner)findViewById(2131561085));
      this.a.setPrompt("请选择币种类别");
      paramBundle = new ArrayAdapter(this, 17367048, this.h);
      paramBundle.setDropDownViewResource(17367049);
      this.a.setVisibility(1);
      this.a.setAdapter(paramBundle);
      this.a.setOnItemSelectedListener(new gu(this));
      this.b = ((Spinner)findViewById(2131561086));
      this.b.setOnItemSelectedListener(new gv(this));
      this.c = ((EditText)findViewById(2131561089));
      this.d = ((EditText)findViewById(2131561090));
      this.e = ((EditText)findViewById(2131561092));
      this.f = ((TextView)findViewById(2131561088));
      this.g = ((Button)findViewById(2131561094));
      if (this.p == 3100)
      {
        this.g.setText("查询");
        this.c.setFocusable(false);
        this.f.setText("银行余额");
      }
      this.g.setOnClickListener(new gw(this));
      b();
      return;
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\Transfer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */