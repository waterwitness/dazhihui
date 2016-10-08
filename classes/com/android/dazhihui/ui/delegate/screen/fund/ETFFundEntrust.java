package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.k;

public class ETFFundEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private Spinner b;
  private EditText c;
  private EditText d;
  private EditText e;
  private EditText f;
  private TextView g;
  private TextView h;
  private TextView i;
  private Button j;
  private Button m;
  private int n;
  private String o;
  private String p;
  private int q;
  private boolean r;
  private com.android.dazhihui.a.b.u s;
  private com.android.dazhihui.a.b.u t;
  private com.android.dazhihui.a.b.u u;
  private com.android.dazhihui.a.b.u v;
  
  private void a()
  {
    this.a.a(this, this);
    switch (this.n)
    {
    default: 
      if (this.r) {
        b();
      }
      break;
    }
    for (;;)
    {
      localObject = new String[com.android.dazhihui.ui.delegate.b.o.z.length];
      int k = 0;
      while (k < localObject.length)
      {
        localObject[k] = (com.android.dazhihui.ui.delegate.b.o.q(com.android.dazhihui.ui.delegate.b.o.z[k][0]) + " " + com.android.dazhihui.ui.delegate.b.o.z[k][1]);
        k += 1;
      }
      this.r = true;
      this.q = 1;
      break;
      this.r = false;
      this.q = 1;
      break;
      this.r = true;
      this.q = 3;
      break;
      this.r = false;
      this.q = 3;
      break;
      this.r = true;
      this.q = 2;
      break;
      this.r = false;
      this.q = 2;
      break;
      c();
    }
    Object localObject = new ArrayAdapter(this, 17367048, (Object[])localObject);
    ((ArrayAdapter)localObject).setDropDownViewResource(17367049);
    this.b.setAdapter((SpinnerAdapter)localObject);
    this.c.addTextChangedListener(new o(this));
    this.j.setOnClickListener(new p(this));
    this.m.setOnClickListener(new q(this));
    l();
    if (!TextUtils.isEmpty(this.p)) {
      this.c.setText(this.p);
    }
  }
  
  private void b()
  {
    this.i.setText("申购上限：");
    this.g.setText("申购份额：");
    this.j.setText("申购");
  }
  
  private void c()
  {
    this.i.setText("赎回上限：");
    this.g.setText("赎回份额：");
    this.j.setText("赎回");
  }
  
  private void d()
  {
    this.e.setText("");
    this.h.setText("\t\t\t\t");
    this.f.setText("");
  }
  
  private void f()
  {
    this.c.setText("");
    this.e.setText("");
    this.h.setText("\t\t\t\t");
    this.f.setText("");
  }
  
  private void g()
  {
    String str = h();
    k localk = new k();
    localk.a(this.o);
    localk.b(str);
    localk.b(getString(2131165363), new r(this));
    localk.a(getString(2131165331), null);
    localk.a(this);
  }
  
  private String h()
  {
    if (this.r) {
      return i();
    }
    return j();
  }
  
  private String i()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = this.b.getSelectedItem().toString();
    String str2 = this.c.getText().toString();
    String str3 = this.f.getText().toString();
    localStringBuilder.append("股东帐号: ").append(str1).append("\n");
    localStringBuilder.append("ETF 代码: ").append(str2).append("\n");
    localStringBuilder.append("申购份额: ").append(str3).append("\n");
    return localStringBuilder.toString();
  }
  
  private String j()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = this.b.getSelectedItem().toString();
    String str2 = this.c.getText().toString();
    String str3 = this.f.getText().toString();
    localStringBuilder.append("股东帐号: ").append(str1).append("\n");
    localStringBuilder.append("ETF 代码: ").append(str2).append("\n");
    localStringBuilder.append("赎回份额: ").append(str3).append("\n");
    return localStringBuilder.toString();
  }
  
  private void k()
  {
    o();
    String str = this.c.getText().toString();
    this.s = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(11102)).a("1003", "0").a("1036", str).h()) });
    registRequestListener(this.s);
    a(this.s, true);
  }
  
  private void l()
  {
    o();
    this.c.getText().toString();
    this.t = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(11104)).a("1028", "0").a("1234", "0").h()) });
    registRequestListener(this.t);
    a(this.t, true);
  }
  
  private void m()
  {
    String[] arrayOfString = o();
    String str2 = this.c.getText().toString();
    String str1 = "32";
    if (!this.r) {
      str1 = "33";
    }
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12124)).a("1026", str1).a("1021", arrayOfString[0]).a("1019", arrayOfString[1]).a("1036", str2).a("1041", "").a("1221", "").a("1028", "").a("1906", this.q).h()) });
    registRequestListener(this.u);
    a(this.u, true);
  }
  
  private void n()
  {
    String[] arrayOfString = o();
    String str2 = this.c.getText().toString();
    String str1 = "0";
    if (!this.r) {
      str1 = "1";
    }
    String str3 = this.f.getText().toString();
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12424").a("1906", this.q).a("1026", str1).a("1021", arrayOfString[0]).a("1019", arrayOfString[1]).a("1036", str2).a("1040", str3).h()) });
    registRequestListener(this.v);
    a(this.v, true);
  }
  
  private String[] o()
  {
    int k = (int)this.b.getSelectedItemId();
    if (com.android.dazhihui.ui.delegate.b.o.z.length == 0) {
      return new String[] { "", "", "" };
    }
    return com.android.dazhihui.ui.delegate.b.o.z[k];
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
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.d = this.o;
    paramct.a = 40;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {}
    label150:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramh != this.s) {
              break;
            }
            paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          } while ((!paramh.b()) || (paramh.g() <= 0));
          paramj = paramh.a(0, "1021");
          int i1 = com.android.dazhihui.ui.delegate.b.o.z.length;
          int k = 0;
          for (;;)
          {
            if (k < i1)
            {
              if (!com.android.dazhihui.ui.delegate.b.o.z[k][0].equals(paramj)) {
                break label150;
              }
              String str = com.android.dazhihui.ui.delegate.b.o.z[k][2];
              if ((str != null) && (str.equals("1"))) {
                this.b.setSelection(k);
              }
            }
            else
            {
              this.h.setText(paramh.a(0, "1037"));
              m();
              return;
            }
            this.b.setSelection(k);
            k += 1;
          }
          if (paramh != this.t) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        } while ((!paramh.b()) || (paramh.g() <= 0));
        this.d.setText(paramh.a(0, "1078"));
        return;
        if (paramh != this.u) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      } while ((!paramh.b()) || (paramh.g() <= 0));
      this.e.setText(paramh.a(0, "1462"));
      return;
    } while (paramh != this.v);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (paramh.b())
    {
      paramh = paramh.a(0, "1042");
      a("　　委托请求提交成功。合同号为：" + paramh, true);
      return;
    }
    c(paramh.d());
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.n = paramBundle.getInt("id_Mark");
      this.o = paramBundle.getString("name_Mark");
      this.p = paramBundle.getString("codes");
    }
    setContentView(2130903479);
    this.a = ((DzhHeader)findViewById(2131558513));
    this.b = ((Spinner)findViewById(2131560716));
    this.h = ((TextView)findViewById(2131560719));
    this.c = ((EditText)findViewById(2131560718));
    this.d = ((EditText)findViewById(2131560721));
    this.e = ((EditText)findViewById(2131560724));
    this.i = ((TextView)findViewById(2131560723));
    this.f = ((EditText)findViewById(2131560726));
    this.g = ((TextView)findViewById(2131560725));
    this.j = ((Button)findViewById(2131560727));
    this.m = ((Button)findViewById(2131560728));
    a();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ETFFundEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */