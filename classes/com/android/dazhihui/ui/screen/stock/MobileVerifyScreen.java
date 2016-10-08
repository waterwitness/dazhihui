package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;

public class MobileVerifyScreen
  extends BaseActivity
  implements View.OnClickListener, b, cp, cs
{
  m a;
  private EditText b;
  private EditText c;
  private TextView d;
  private final int e = 40;
  private int f;
  
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
  
  public void a(String paramString)
  {
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(111);
    localx2.b(2);
    localx2.a(paramString);
    localx1.a(localx2);
    this.a = new m(localx1);
    this.a.a(n.a);
    registRequestListener(this.a);
    sendRequest(this.a);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    paramct.d = "验证手机号";
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    int i;
    if (paramh == this.a)
    {
      paramh = new q(((o)paramj).h().b);
      paramh.b();
      paramh.e();
      paramh.e();
      paramh.e();
      i = paramh.b();
      if (i == 0)
      {
        showShortToast("验证码已发送,请查收!");
        this.d.setClickable(false);
        this.f = 40;
        this.d.setText("等待重试(" + this.f + ")");
        this.d.postDelayed(new jo(this), 1000L);
      }
    }
    else
    {
      return;
    }
    if (i == 1)
    {
      showShortToast("手机号码不正确!");
      return;
    }
    showShortToast("发送验证码异常!");
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.a) {
      showShortToast("发送验证码超时!");
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903316);
    this.c = ((EditText)findViewById(2131560041));
    this.b = ((EditText)findViewById(2131560042));
    this.d = ((TextView)findViewById(2131560043));
    this.d.setOnClickListener(this);
    findViewById(2131560044).setOnClickListener(this);
    findViewById(2131559711).setOnClickListener(this);
    paramBundle = (DzhHeader)findViewById(2131558567);
    paramBundle.setOnHeaderButtonClickListener(this);
    paramBundle.a(this, this);
    w.a().a(this);
  }
  
  public void loginStatusChange(c paramc)
  {
    if ((paramc == c.b) && (w.a().l())) {
      finish();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.a) {
      showShortToast("发送验证码异常!");
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560044: 
      paramView = this.c.getText().toString();
      String str = this.b.getText().toString();
      if (TextUtils.isEmpty(paramView))
      {
        showShortToast("手机号码不能为空!");
        return;
      }
      if (paramView.length() != 11)
      {
        showShortToast("手机号码长度不正确!");
        return;
      }
      if (TextUtils.isEmpty(str))
      {
        showShortToast("验证码不能为空!");
        return;
      }
      if (str.length() != 6)
      {
        showShortToast("验证码不正确!");
        return;
      }
      FingerprintLoginScreen.a(this, false, new jn(this, paramView, str));
      return;
    case 2131560043: 
      paramView = this.c.getText().toString();
      if (TextUtils.isEmpty(paramView))
      {
        showShortToast("手机号码不能为空!");
        return;
      }
      if (paramView.length() != 11)
      {
        showShortToast("手机号码格式不正确!");
        return;
      }
      a(paramView);
      return;
    }
    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(getResources().getString(2131165304))));
  }
  
  protected void onDestroy()
  {
    w.a().b(this);
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MobileVerifyScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */