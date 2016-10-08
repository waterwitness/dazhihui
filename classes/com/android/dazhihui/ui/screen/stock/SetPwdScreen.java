package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.a.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;

public class SetPwdScreen
  extends BaseActivity
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, cp, cs
{
  public static String a = "IS_EXIT";
  public static String b = "TENCENT_EXIST";
  public static String c = "WEIXING_EXIST";
  public static String d = "REALUNAME";
  public static String e = "PASSWDMD5";
  public static String f = "DEFPASSWORD";
  public static String g = "OPEN_ID";
  public static String h = "NEW_REGISTER";
  private EditText i;
  private String j = "";
  private String k = "FROM_LOTTERY";
  private boolean l = false;
  private boolean m;
  private String n;
  private String o;
  private boolean p = false;
  private String q = "";
  private boolean r = false;
  private byte[] s = null;
  private CheckBox t;
  private m u = null;
  private m v = null;
  private m w = null;
  private Button x;
  private String y;
  private boolean z = false;
  
  private void a()
  {
    String str = this.j;
    b localb = com.android.dazhihui.g.a().k();
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2972);
    arrayOfx[0].b(2);
    x localx = new x(127);
    localx.a(w.a().f());
    byte[] arrayOfByte = w.a().j();
    n.c("enRsa: " + w.a().j());
    localx.a(arrayOfByte, 0);
    localx.a(localb.a(str.getBytes()), 0);
    arrayOfx[0].a(localx);
    this.w = new m(arrayOfx);
    registRequestListener(this.w);
    sendRequest(this.w);
  }
  
  private void b()
  {
    if (TextUtils.isEmpty(this.q))
    {
      n.c("openId isNull");
      return;
    }
    String str = this.j;
    b localb = com.android.dazhihui.g.a().k();
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2972);
    arrayOfx[0].b(2);
    x localx = new x(148);
    this.s = localb.a(str.getBytes());
    localx.a(this.s, 0);
    localx.a("keytp=qqid&key=" + this.q);
    arrayOfx[0].a(localx);
    this.u = new m(arrayOfx);
    registRequestListener(this.u);
    sendRequest(this.u);
  }
  
  private void c()
  {
    if (TextUtils.isEmpty(this.q))
    {
      n.c("openId isNull");
      return;
    }
    String str = this.j;
    b localb = com.android.dazhihui.g.a().k();
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2972);
    arrayOfx[0].b(2);
    x localx = new x(148);
    this.s = localb.a(str.getBytes());
    localx.a(this.s, 0);
    localx.a("keytp=wxid&key=" + this.q);
    arrayOfx[0].a(localx);
    this.u = new m(arrayOfx);
    registRequestListener(this.u);
    sendRequest(this.u);
  }
  
  private void d()
  {
    String str = this.j;
    b localb = com.android.dazhihui.g.a().k();
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2972);
    arrayOfx[0].b(2);
    x localx = new x(149);
    this.s = localb.a(str.getBytes());
    localx.a(this.s, 0);
    localx.a("");
    arrayOfx[0].a(localx);
    this.v = new m(arrayOfx);
    registRequestListener(this.v);
    sendRequest(this.v);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    this.x.setClickable(true);
    int i1;
    int i2;
    if ((paramj instanceof o))
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.b != null) && (paramh.a == 2972))
      {
        paramh = new q(paramh.b);
        i1 = paramh.b();
        i2 = paramh.e();
        paramh.e();
        paramh.e();
      }
    }
    switch (i2)
    {
    default: 
    case 127: 
      do
      {
        do
        {
          return;
        } while (i1 != 2);
        i1 = paramh.b();
        if (i1 == 0)
        {
          com.android.dazhihui.g.a().k();
          w.a().e(this.j);
          paramh = d.a();
          paramh.a("USER_MD5_PWD", w.a().i());
          paramh.g();
          paramh.a("USER_RSA_PWD", w.a().j());
          paramh.g();
          if (this.p) {}
          for (;;)
          {
            finish();
            return;
            paramh = new Intent(this, RegisterSuccessScreen.class);
            paramh.putExtra("type", 0);
            paramh.putExtra("REGISTER_FROM_TYPE", this.k);
            startActivity(paramh);
          }
        }
      } while (i1 != 1);
      return;
    case 148: 
      if (paramh.b() == 0)
      {
        w.a().e(this.j);
        paramh = d.a();
        paramh.a("USER_MD5_PWD", w.a().i());
        paramh.g();
        paramh.a("USER_RSA_PWD", w.a().j());
        paramh.g();
        paramh = new Intent(this, RegisterSuccessScreen.class);
        paramh.putExtra("REGISTER_FROM_TYPE", this.k);
        paramh.putExtra("type", 1);
        startActivity(paramh);
        finish();
        return;
      }
      showShortToast(getResources().getString(2131166388));
      return;
    }
    if (paramh.b() == 0)
    {
      this.y = paramh.l();
      w.a().e(this.j);
      paramh = d.a();
      paramh.a("USER_RSA_PWD", w.a().j());
      paramh.g();
      paramh.a("USER_MD5_PWD", w.a().i());
      paramh.g();
      w.a().b(this.y);
      paramh.a("USER_NAME", w.a().f());
      paramh.g();
      paramh = new Intent(this, RegisterSuccessScreen.class);
      paramh.putExtra("type", 0);
      paramh.putExtra("REGISTER_FROM_TYPE", this.k);
      startActivity(paramh);
      finish();
      return;
    }
    showShortToast(getResources().getString(2131166457));
  }
  
  public void handleTimeout(h paramh)
  {
    this.x.setClickable(true);
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903416);
    Object localObject = (DzhHeader)findViewById(2131558567);
    ((DzhHeader)localObject).setOnHeaderButtonClickListener(this);
    ((DzhHeader)localObject).a(this, this);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.k = paramBundle.getStringExtra("REGISTER_FROM_TYPE");
      this.r = paramBundle.getBooleanExtra(h, false);
      this.l = paramBundle.getBooleanExtra(b, false);
      this.q = paramBundle.getStringExtra(g);
      this.m = paramBundle.getBooleanExtra(c, false);
      this.p = paramBundle.getBooleanExtra(a, false);
      if ((!TextUtils.isEmpty(this.k)) && (this.k.equals("FROM_LOTTERY"))) {
        ((DzhHeader)localObject).setBackgroundResource(2130838345);
      }
    }
    TextView localTextView = (TextView)findViewById(2131560393);
    if (this.p)
    {
      localTextView.setText(getResources().getString(2131166242));
      localTextView.setVisibility(0);
    }
    for (;;)
    {
      if (this.r) {
        ((DzhHeader)localObject).setTitle("用户注册");
      }
      if ((this.m) || (this.l))
      {
        localTextView.setVisibility(8);
        this.n = paramBundle.getStringExtra(d);
        w.a().b(this.n);
        localObject = d.a();
        ((d)localObject).a("USER_NAME", w.a().f());
        ((d)localObject).g();
        this.o = paramBundle.getStringExtra(e);
        paramBundle = paramBundle.getStringExtra(f);
        findViewById(2131560394).setVisibility(0);
        ((TextView)findViewById(2131560395)).setText(paramBundle);
      }
      this.i = ((EditText)findViewById(2131560397));
      this.x = ((Button)findViewById(2131560400));
      this.x.setOnClickListener(this);
      ((CheckBox)findViewById(2131560396)).setOnCheckedChangeListener(this);
      this.t = ((CheckBox)findViewById(2131560399));
      ((TextView)findViewById(2131560398)).setOnClickListener(this);
      return;
      localTextView.setVisibility(8);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    this.x.setClickable(true);
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    switch (paramCompoundButton.getId())
    {
    default: 
      return;
    }
    if (paramBoolean) {
      this.i.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
    for (;;)
    {
      this.i.postInvalidate();
      return;
      this.i.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131560399: 
    default: 
      return;
    case 2131560400: 
      if (!this.t.isChecked())
      {
        showShortToast(getResources().getString(2131165257));
        return;
      }
      if ((this.i == null) || (TextUtils.isEmpty(this.i.getText())))
      {
        showShortToast(getResources().getString(2131165575));
        return;
      }
      this.j = this.i.getText().toString().trim();
      if ((this.j.length() < 4) || (this.j.length() > 19))
      {
        showShortToast(getResources().getString(2131166154));
        return;
      }
      if (n.s(this.j))
      {
        Toast.makeText(this, "格式错误", 1).show();
        return;
      }
      paramView.setClickable(false);
      paramView = w.a().s();
      paramView.a(new th(this, this));
      com.android.dazhihui.a.g.a().a(paramView);
      return;
    }
    r.a(this, null, "http://pay.gw.com.cn/rulesregister.jsp", null);
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SetPwdScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */