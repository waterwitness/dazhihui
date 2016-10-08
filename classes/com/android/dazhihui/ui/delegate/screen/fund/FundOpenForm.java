package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundOpenForm
  extends DelegateBaseActivity
  implements cp, cs
{
  String[] a = { "名称" };
  String[] b = { "1089" };
  private int c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private EditText h;
  private EditText i;
  private EditText j;
  private Spinner m;
  private Button n;
  private String o = null;
  private String p = null;
  private boolean q;
  private boolean r;
  private boolean s;
  private String[] t = { "新开账户", "增加账户" };
  private com.android.dazhihui.ui.delegate.b.h u;
  private DzhHeader v;
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.u x;
  private com.android.dazhihui.a.b.u y;
  
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
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11924").a("1011", "").h()) });
    registRequestListener(this.w);
    a(this.w, true);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.x = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12052").h()) });
    registRequestListener(this.x);
    a(this.x, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh1 = o.g("11918");
    Object localObject;
    if (this.u != null)
    {
      localObject = this.u.e();
      int k = 0;
      while (k < localObject.length)
      {
        localh1.a(localObject[k], this.u.a(localObject[k]));
        k += 1;
      }
    }
    localh1.a("1184", "");
    com.android.dazhihui.ui.delegate.b.h localh2 = localh1.a("1115", this.o).a("1031", "").a("1182", this.f.getText().toString()).a("1185", this.g.getText().toString()).a("1290", this.h.getText().toString()).a("2002", this.i.getText().toString()).a("1025", this.j.getText().toString()).a("1293", String.valueOf(this.c));
    if (this.c == 1)
    {
      localObject = this.e.getText().toString();
      localh2.a("1114", (String)localObject);
      if (!this.q) {
        break label277;
      }
      localh1.a("2315", "2");
    }
    for (;;)
    {
      this.y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh1.h()) });
      registRequestListener(this.y);
      a(this.y, true);
      return;
      localObject = "";
      break;
      label277:
      if (this.s) {
        localh1.a("2315", "0");
      } else if (this.r) {
        localh1.a("2315", "0");
      }
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金开户";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.v = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i1 = 0;
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {
      if (paramh == this.y)
      {
        paramh = Toast.makeText(this, "　　网络连接异常，未收到开户请求的返回信息。", 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
      }
    }
    for (;;)
    {
      return;
      com.android.dazhihui.ui.delegate.b.h localh;
      if (paramh == this.x)
      {
        localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if ((localh.b()) && (localh.g() > 0))
        {
          this.u = new com.android.dazhihui.ui.delegate.b.h(null);
          String[] arrayOfString = localh.a(0);
          k = 0;
          while (k < arrayOfString.length)
          {
            this.u.a(arrayOfString[k], localh.a(0, arrayOfString[k]));
            k += 1;
          }
          this.f.setText(localh.a(0, "1182"));
          this.g.setText(localh.a(0, "1185"));
          this.h.setText(localh.a(0, "1290"));
          this.i.setText(localh.a(0, "2002"));
          this.j.setText(localh.a(0, "1025"));
        }
      }
      while (paramh == this.w)
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (paramh.b()) {
          break label365;
        }
        paramh = Toast.makeText(this, paramh.d() + "　　读取失败", 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        if (paramh == this.y)
        {
          localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (localh.b())
          {
            localh.a(0, "1042");
            new AlertDialog.Builder(this).setTitle("提示").setMessage("您已开户成功！").setPositiveButton("确定", new bp(this)).setCancelable(false).show();
          }
          else
          {
            c(localh.d());
          }
        }
      }
      continue;
      label365:
      int i2 = paramh.g();
      int k = i1;
      while (k < i2)
      {
        if (paramh.a(k, "1089").equals("深市TA")) {
          this.o = paramh.a(k, "1115");
        }
        k += 1;
      }
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
    paramBundle = getIntent().getExtras();
    this.o = paramBundle.getString("cid");
    this.p = paramBundle.getString("cname");
    this.q = paramBundle.getBoolean("otc", false);
    this.r = paramBundle.getBoolean("isXcPt", false);
    this.s = paramBundle.getBoolean("setPlan", false);
    if (this.r) {
      a();
    }
    setContentView(2130903485);
    this.v = ((DzhHeader)findViewById(2131558513));
    this.v.a(this, this);
    this.d = ((EditText)findViewById(2131560765));
    this.d.setEnabled(false);
    this.d.setInputType(0);
    this.e = ((EditText)findViewById(2131560769));
    this.f = ((EditText)findViewById(2131560771));
    this.f.setEnabled(false);
    this.f.setFocusable(false);
    this.f.setInputType(0);
    this.g = ((EditText)findViewById(2131560773));
    this.g.setEnabled(false);
    this.g.setFocusable(false);
    this.g.setInputType(0);
    this.h = ((EditText)findViewById(2131560775));
    this.h.setEnabled(false);
    this.h.setFocusable(false);
    this.h.setInputType(0);
    this.i = ((EditText)findViewById(2131560777));
    this.i.setEnabled(false);
    this.i.setFocusable(false);
    this.i.setInputType(0);
    this.j = ((EditText)findViewById(2131560779));
    this.j.setEnabled(false);
    this.j.setFocusable(false);
    this.j.setInputType(0);
    this.j.setOnEditorActionListener(new bm(this));
    this.m = ((Spinner)findViewById(2131560767));
    if (this.p != null)
    {
      this.d.setText(this.p);
      this.d.setFocusable(false);
      this.d.setTextColor(-16777216);
    }
    paramBundle = new ArrayAdapter(this, 17367048, this.t);
    paramBundle.setDropDownViewResource(17367049);
    this.m.setAdapter(paramBundle);
    this.m.setVisibility(1);
    this.m.setOnItemSelectedListener(new bn(this));
    this.n = ((Button)findViewById(2131560780));
    this.n.setFocusable(true);
    this.n.requestFocus();
    this.n.setOnClickListener(new bo(this));
    b();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundOpenForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */