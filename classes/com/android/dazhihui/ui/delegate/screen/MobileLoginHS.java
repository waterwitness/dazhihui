package com.android.dazhihui.ui.delegate.screen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.screen.jinzheng.BindingMobileRequest;
import com.android.dazhihui.ui.delegate.screen.jinzheng.BindingMobileResponse;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import java.io.PrintStream;

public class MobileLoginHS
  extends BaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private String b;
  private Handler c;
  private Runnable d;
  private int e = 30000;
  private int f = 1000;
  private com.android.dazhihui.c.a.a g;
  private EditText h;
  private EditText i;
  private Button j;
  private Button k;
  private TextView l;
  private String m;
  private RelativeLayout n;
  private RelativeLayout o;
  private Bundle p;
  private boolean q;
  private m r;
  private f s;
  private m t;
  
  private void g()
  {
    String str1 = this.h.getText().toString();
    String str2 = this.i.getText().toString();
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(120);
    localx2.d(Integer.parseInt(str2));
    localx2.a(str1);
    localx2.a("");
    localx2.a("");
    localx1.a(localx2);
    this.r = new m(localx1);
    this.r.a(n.a);
    registRequestListener(this.r);
    sendRequest(this.r);
    getLoadingDialog().show();
  }
  
  private void h()
  {
    String str = this.h.getText().toString();
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(111);
    localx2.b(2);
    localx2.a(str);
    localx1.a(localx2);
    this.t = new m(localx1);
    this.t.a(n.a);
    registRequestListener(this.t);
    sendRequest(this.t);
    getLoadingDialog().show();
  }
  
  private void i()
  {
    int i1 = e.a().j();
    com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
    if (com.android.dazhihui.c.a.a.A[0].equals("无"))
    {
      com.android.dazhihui.c.a.a.A[0] = com.android.dazhihui.c.a.a.z;
      this.g.a(35);
    }
    label57:
    label149:
    for (;;)
    {
      this.g.close();
      return;
      i1 = 0;
      if (i1 < com.android.dazhihui.c.a.a.A.length) {
        if (!com.android.dazhihui.c.a.a.A[i1].equals(com.android.dazhihui.c.a.a.z)) {}
      }
      for (i1 = 0;; i1 = 1)
      {
        if (i1 == 0) {
          break label149;
        }
        String[] arrayOfString = com.android.dazhihui.c.a.a.A;
        com.android.dazhihui.c.a.a.A = null;
        com.android.dazhihui.c.a.a.A = new String[arrayOfString.length + 1];
        System.arraycopy(arrayOfString, 0, com.android.dazhihui.c.a.a.A, 0, arrayOfString.length);
        com.android.dazhihui.c.a.a.A[(com.android.dazhihui.c.a.a.A.length - 1)] = com.android.dazhihui.c.a.a.z;
        this.g.a(35);
        break;
        i1 += 1;
        break label57;
      }
    }
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
    Object localObject = this.h.getText().toString();
    String str = this.i.getText().toString();
    if ((((String)localObject).length() == 0) || (str.length() == 0))
    {
      localObject = Toast.makeText(this, "　　手机号码、通信密码都必须填写。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      return;
    }
    if (((String)localObject).length() != 11)
    {
      localObject = Toast.makeText(this, "　　手机号码须为 11 位。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      return;
    }
    localObject = Toast.makeText(this, "　　正在验证，请稍候……", 0);
    ((Toast)localObject).setGravity(17, 0, 0);
    ((Toast)localObject).show();
    g();
  }
  
  public void a(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }
  
  public void b()
  {
    String str = this.h.getText().toString();
    if (str.length() == 0)
    {
      Toast.makeText(this, "　　手机号码必须填写。", 1).show();
      return;
    }
    if (str.length() != 11)
    {
      Toast.makeText(this, "　　手机号码须为 11 位。", 1).show();
      return;
    }
    e();
    h();
  }
  
  public void c()
  {
    int i1 = e.a().j();
    Object localObject = new com.android.dazhihui.c.a.a(this);
    com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
    ((com.android.dazhihui.c.a.a)localObject).a(34);
    ((com.android.dazhihui.c.a.a)localObject).close();
    localObject = this.h.getText().toString();
    String str = this.i.getText().toString();
    com.android.dazhihui.c.a.a locala = new com.android.dazhihui.c.a.a(this);
    com.android.dazhihui.c.a.a.i[i1][0] = localObject;
    com.android.dazhihui.c.a.a.i[i1][1] = str;
    locala.a(19);
    locala.close();
    i();
  }
  
  public void createTitleObj(Context paramContext, com.android.dazhihui.ui.widget.ct paramct)
  {
    this.m = com.android.dazhihui.ui.delegate.b.o.q();
    paramct.a = 40;
    paramct.d = this.m;
    paramct.p = this;
  }
  
  public void d()
  {
    Object localObject = new BindingMobileRequest();
    String str = com.android.dazhihui.c.a.a.i[e.a().j()][2];
    ((BindingMobileRequest)localObject).setMobile(this.h.getText().toString());
    ((BindingMobileRequest)localObject).setTradeName(str);
    localObject = ((BindingMobileRequest)localObject).BindingMoileJson();
    System.out.println("免责声明绑定手机" + (String)localObject);
    for (;;)
    {
      try
      {
        localObject = com.android.dazhihui.ui.delegate.screen.a.a.a.b("jf.gw.com.cn    ", "jf.gw.com.cn    ", (String)localObject);
        localException1.printStackTrace();
      }
      catch (Exception localException1)
      {
        try
        {
          System.out.println("加密数据:" + (String)localObject);
          localObject = "http://10.15.201.24:8080/mktact/services/common/confidentialapi?op=BindingMobile&key=" + (String)localObject;
          System.out.println("加密后url:" + (String)localObject);
          this.s = new f();
          this.s.c((String)localObject);
          registRequestListener(this.s);
          sendRequest(this.s);
          return;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        localObject = null;
      }
    }
  }
  
  public void e()
  {
    this.c.postDelayed(this.d, 0L);
  }
  
  public void f()
  {
    this.c.removeCallbacks(this.d);
    this.e = 30000;
    this.l.setBackgroundResource(2130837598);
    this.l.setTextColor(-12563843);
    this.l.setText(this.b);
    this.l.setEnabled(true);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((paramj instanceof g))
    {
      paramj = (g)paramj;
      if (paramh == this.s)
      {
        paramj = new String(paramj.a());
        System.out.println("免责声明绑定手机返回数据" + paramj);
        paramh = null;
      }
      try
      {
        paramj = com.android.dazhihui.ui.delegate.screen.a.a.a.a("jf.gw.com.cn    ", "jf.gw.com.cn    ", paramj);
        paramh = paramj;
      }
      catch (Exception paramj)
      {
        for (;;)
        {
          paramj.printStackTrace();
        }
        Toast.makeText(this, paramj, 1).show();
        return;
      }
      System.out.println("解密数据" + paramh);
      paramj = new BindingMobileResponse(paramh);
      paramh = paramj.getStatus();
      paramj = paramj.getMessage();
      if (paramh.equals("0"))
      {
        c();
        paramh = new Bundle();
        paramh.putBoolean("fromBrokerList", true);
        paramh.putBoolean("haveNoLoginSorHaveOne", this.q);
        e.a().a(paramh);
        e.a().a(true);
        com.android.dazhihui.ui.delegate.b.o.a(this, 0);
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          paramh = ((com.android.dazhihui.a.b.o)paramj).h();
          getLoadingDialog().dismiss();
        } while ((paramh == null) || (paramh.a != 2972));
        paramh = new q(paramh.b);
        paramh.b();
        i1 = paramh.e();
        paramh.e();
        paramh.e();
        if (i1 != 111) {
          break;
        }
        i1 = paramh.b();
        if (i1 == 0)
        {
          a(getResources().getString(2131165349));
          return;
        }
        if (i1 == 1)
        {
          a(getResources().getString(2131165346));
          return;
        }
      } while (i1 != 2);
      a(getResources().getString(2131165347));
      return;
    } while (i1 != 120);
    int i1 = paramh.b();
    if (i1 == 0) {
      if (com.android.dazhihui.ui.delegate.b.o.m())
      {
        this.n.setVisibility(8);
        this.l.setVisibility(8);
        this.o.setVisibility(0);
      }
    }
    for (;;)
    {
      paramh.h();
      return;
      c();
      paramj = new Bundle();
      paramj.putBoolean("fromBrokerList", true);
      paramj.putBoolean("haveNoLoginSorHaveOne", this.q);
      e.a().a(paramj);
      e.a().a(true);
      com.android.dazhihui.ui.delegate.b.o.a(this, 0);
      continue;
      if (i1 == 1) {
        showShortToast("　　验证码错误。");
      } else if (i1 == 2) {
        showShortToast("　　手机号码没有注册。");
      } else if (i1 == 3) {
        showShortToast("　　重试次数太多。");
      } else {
        showShortToast("　　验证失败。");
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    getLoadingDialog().dismiss();
    a("网络连接超时!");
  }
  
  public void init(Bundle paramBundle)
  {
    this.g = new com.android.dazhihui.c.a.a(this);
    this.g.close();
    setContentView(2130903317);
    this.p = getIntent().getExtras();
    if (this.p != null) {
      this.q = this.p.getBoolean("haveNoLoginSorHaveOne");
    }
    this.a = ((DzhHeader)findViewById(2131558643));
    this.a.a(this, this);
    this.n = ((RelativeLayout)findViewById(2131560045));
    this.o = ((RelativeLayout)findViewById(2131560057));
    this.k = ((Button)findViewById(2131560058));
    this.n.setVisibility(0);
    this.o.setVisibility(8);
    this.i = ((EditText)findViewById(2131560052));
    this.h = ((EditText)findViewById(2131560047));
    this.k.setOnClickListener(new ct(this));
    this.h.setFilters(new InputFilter[] { new InputFilter.LengthFilter(11) });
    this.h.addTextChangedListener(new cu(this));
    this.j = ((Button)findViewById(2131560054));
    this.j.setBackgroundResource(2130837588);
    this.j.setTextColor(-16777216);
    this.j.setEnabled(false);
    this.j.setOnClickListener(new cv(this));
    this.l = ((TextView)findViewById(2131560050));
    this.l.setOnClickListener(new cw(this));
    this.b = this.l.getText().toString();
    this.c = new Handler();
    this.d = new cx(this);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    getLoadingDialog().dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\MobileLoginHS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */