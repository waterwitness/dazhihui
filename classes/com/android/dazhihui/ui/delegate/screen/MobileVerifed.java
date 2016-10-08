package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.r;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.m;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MobileVerifed
  extends BaseActivity
  implements cp, cs
{
  r a = null;
  private Object b;
  private boolean c = false;
  private String d;
  private String e;
  private EditText f;
  private TextView g;
  private TextView h;
  private DzhHeader i;
  private boolean j = false;
  
  private boolean c()
  {
    return e.a().r() != null;
  }
  
  private void d()
  {
    Object localObject = new com.android.dazhihui.ui.delegate.b.g();
    ((com.android.dazhihui.ui.delegate.b.g)localObject).a(this.d);
    localObject = new m(1904, ((com.android.dazhihui.ui.delegate.b.g)localObject).a());
    String str = e.a().r();
    int k = e.a().s();
    if ((str != null) && (k > 0))
    {
      this.a = new r(new m[] { localObject });
      this.a.a(this);
      com.android.dazhihui.a.g.a().a(this.a, str, k);
      getLoadingDialog().show();
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
    int k = e.a().j();
    this.d = this.f.getText().toString();
    if (this.d.length() == 0)
    {
      localObject = Toast.makeText(this, "　　手机号码必须填写。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      return;
    }
    if (this.d.length() != 11)
    {
      localObject = Toast.makeText(this, "　　手机号码须为 11 位。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      return;
    }
    if (this.e == null) {}
    for (Object localObject = "　　正在验证，请稍候……";; localObject = "　　正在下载自选列表，请稍候……")
    {
      localObject = Toast.makeText(this, (CharSequence)localObject, 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
      if (this.e != null)
      {
        a.z = a.i[k][2];
        a.i[k] = { this.d, this.e, a.z };
        a.i[k][0] = this.d;
        a.i[k][1] = this.e;
        a.i[k][2] = a.z;
        new a(this).a(19);
      }
      if (this.e != null) {
        break;
      }
      d();
      return;
    }
  }
  
  public void a(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "未从服务器上取到数据请重试！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "  网络连接异常请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  public void a(Object paramObject)
  {
    new AlertDialog.Builder(this).setTitle(getString(2131165469)).setMessage(getString(2131165344)).setPositiveButton(getString(2131165363), new da(this)).setNegativeButton(getString(2131165331), null).show();
  }
  
  public void b()
  {
    Object localObject = Toast.makeText(this, "　　正在注册手机号，请稍候……", 0);
    ((Toast)localObject).setGravity(17, 0, 0);
    ((Toast)localObject).show();
    try
    {
      localObject = PendingIntent.getBroadcast(this, 0, new Intent(), 0);
      SmsManager.getDefault().sendTextMessage("95521", null, "8", (PendingIntent)localObject, null);
      k = 1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Toast localToast = Toast.makeText(this, "　　发送失败。", 0);
        localToast.setGravity(17, 0, 0);
        localToast.show();
        int k = 0;
      }
    }
    if (k != 0)
    {
      localObject = Toast.makeText(this, "　　发送成功。", 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = com.android.dazhihui.ui.delegate.b.o.q();
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int k = e.a().j();
    getLoadingDialog().dismiss();
    if (paramh == this.a)
    {
      paramh = (com.android.dazhihui.a.b.o)paramj;
      paramj = paramh.h();
      if ((paramh != null) && (paramj.b != null) && (paramj.a == 1904))
      {
        paramh = new com.android.dazhihui.ui.delegate.b.g(m.a(paramj.b)[0].b());
        boolean bool = paramh.g();
        paramh = paramh.h();
        if (!bool) {
          break label380;
        }
        paramj = new a(this);
        a.z = a.i[k][2];
        paramj.a(34);
        paramj.close();
        this.e = paramh;
        paramh = new a(this);
        a.z = a.i[k][2];
        a.i[k] = { this.d, this.e, a.z };
        a.i[k][0] = this.d;
        a.i[k][1] = this.e;
        a.i[k][2] = a.z;
        paramh.a(19);
        if (!a.A[0].equals("无")) {
          break label292;
        }
        a.A[0] = a.z;
        paramh.a(35);
      }
    }
    label292:
    label294:
    label380:
    label412:
    for (;;)
    {
      paramh.close();
      Toast.makeText(this, "　　手机号码已验证通过", 1).show();
      paramh = new Bundle();
      paramh.putBoolean("accobool", true);
      paramh.putBoolean("haveNoLoginSorHaveOne", this.j);
      startActivity(RegionTable.class, paramh);
      finish();
      return;
      k = 0;
      if (k < a.A.length) {
        if (!a.A[k].equals(a.z)) {}
      }
      for (k = 0;; k = 1)
      {
        if (k == 0) {
          break label412;
        }
        paramj = a.A;
        a.A = null;
        a.A = new String[paramj.length + 1];
        System.arraycopy(paramj, 0, a.A, 0, paramj.length);
        a.A[(a.A.length - 1)] = a.z;
        paramh.a(35);
        break;
        k += 1;
        break label294;
        Toast.makeText(this, "验证失败。" + paramh, 1).show();
        return;
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (getLoadingDialog().isShowing())
    {
      getLoadingDialog().dismiss();
      a(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    paramBundle = getIntent().getExtras();
    this.c = paramBundle.getBoolean("hidden");
    this.j = paramBundle.getBoolean("haveNoLoginSorHaveOne");
    setContentView(2130903318);
    this.i = ((DzhHeader)findViewById(2131558643));
    this.i.a(this, this);
    this.f = ((EditText)findViewById(2131559508));
    this.f.setFilters(new InputFilter[] { new InputFilter.LengthFilter(11) });
    this.g = ((TextView)findViewById(2131560059));
    this.g.setText("提示：激活前请发送短信8到");
    this.h = ((TextView)findViewById(2131560060));
    this.h.setText("95521或手机拨打95521-9-1免费注册.");
    ((Button)findViewById(2131559509)).setOnClickListener(new cy(this));
    ((Button)findViewById(2131560062)).setOnClickListener(new cz(this));
    if (com.android.dazhihui.ui.delegate.b.o.m != null)
    {
      if (com.android.dazhihui.ui.delegate.b.o.m.length > 0) {
        this.b = com.android.dazhihui.ui.delegate.b.o.m[0];
      }
      if (com.android.dazhihui.ui.delegate.b.o.m.length > 1) {
        this.e = com.android.dazhihui.ui.delegate.b.o.m[1];
      }
    }
    if (this.b != null) {
      this.f.setText((String)this.b);
    }
    if (this.c) {
      a();
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (getLoadingDialog().isShowing())
    {
      getLoadingDialog().dismiss();
      a(2);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\MobileVerifed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */