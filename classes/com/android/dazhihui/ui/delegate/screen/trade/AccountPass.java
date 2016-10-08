package com.android.dazhihui.ui.delegate.screen.trade;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.hs.SecretToolkit;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class AccountPass
  extends DelegateBaseActivity
  implements cp, cs
{
  private int a = 0;
  private EditText b;
  private EditText c;
  private EditText d;
  private DzhHeader e;
  private e f;
  private com.android.dazhihui.a.b.u g;
  
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
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    String str1 = "11106";
    if (this.a == 4369) {
      str1 = "15014";
    }
    String str2 = this.c.getText().toString();
    this.g = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str1).a("1032", str2).h()) });
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    Object localObject = SecretToolkit.getInstance();
    String str1 = ((SecretToolkit)localObject).secretIn_password(this.b.getText().toString());
    String str2 = ((SecretToolkit)localObject).secretIn_password(this.c.getText().toString());
    localObject = ((SecretToolkit)localObject).secretIn_secretkeyinfo();
    this.f = new e();
    this.f.c("https://uatopen.hs.net/secu/v1/password_mod");
    this.f.b("UTF-8");
    this.f.a("Bearer " + o.d);
    this.f.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.f.a("sendercomp_id", "90013");
    this.f.a("password_type", "2");
    this.f.a("password", str1);
    this.f.a("new_password", str2);
    this.f.a("secret_key_info", (String)localObject);
    registRequestListener(this.f);
    a(this.f, true);
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "  没有填写“旧的密码”！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "  没有填写“新的密码”！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "  没有填写“确认密码”！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 3)
    {
      localToast = Toast.makeText(this, "  “旧的密码”填写错误！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 4)
    {
      localToast = Toast.makeText(this, "  “确认密码”与“新的密码”填写不一致！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(this, "　　委托请求提交中，请稍候……", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (c.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.e == null);
      this.e.a(paramy);
      return;
    } while (this.e == null);
    this.e.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "修改交易密码";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.e = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i = 0;
    super.handleResponse(paramh, paramj);
    Object localObject;
    if (paramh == this.g)
    {
      localObject = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject, this)) {
        break label228;
      }
      localObject = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject).e());
      if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b()) {
        break label203;
      }
      localObject = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1208"), 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      o.u();
      o.a(this);
      finish();
    }
    while (paramh == this.f)
    {
      paramh = new String(((g)paramj).a());
      label203:
      label228:
      try
      {
        paramj = new JSONObject(paramh).getJSONArray("data");
        while (i < paramj.length())
        {
          localObject = ((JSONObject)paramj.get(i)).getString("error_no");
          if ((((String)localObject).equals("0")) && (localObject != null))
          {
            localObject = Toast.makeText(this, "修改成功", 0);
            ((Toast)localObject).setGravity(17, 0, 0);
            ((Toast)localObject).show();
            o.u();
            o.a(this);
            finish();
          }
          i += 1;
        }
        localObject = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
        ((Toast)localObject).setGravity(17, 0, 0);
        ((Toast)localObject).show();
      }
      catch (JSONException paramj) {}
      localObject = Toast.makeText(this, "　　连接失败，请重试。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
    }
    try
    {
      paramh = Toast.makeText(this, ((JSONObject)new JSONTokener(paramh).nextValue()).getString("error_info"), 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
      return;
    }
    catch (JSONException paramh)
    {
      new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new b(this)).show();
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903041);
    paramBundle = getIntent();
    if ((paramBundle != null) && (paramBundle.getExtras() != null)) {
      this.a = paramBundle.getExtras().getInt("type", 0);
    }
    this.e = ((DzhHeader)findViewById(2131558513));
    this.e.a(this, this);
    this.b = ((EditText)findViewById(2131558515));
    this.c = ((EditText)findViewById(2131558517));
    this.d = ((EditText)findViewById(2131558519));
    ((Button)findViewById(2131558520)).setOnClickListener(new a(this));
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\AccountPass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */