package com.android.dazhihui.ui.delegate.screen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;

public class MobileLogin
  extends BaseActivity
  implements com.android.dazhihui.ui.widget.cp, com.android.dazhihui.ui.widget.cs
{
  public static String a = "encrypt_pwd";
  private Object[] b;
  private byte[] c;
  private com.android.dazhihui.c.a.a d;
  private EditText e;
  private EditText f;
  private Button g;
  private TextView h;
  private TextView i;
  private boolean j;
  private String k;
  private boolean l;
  private boolean m;
  private boolean n = false;
  private LinearLayout o;
  private String p;
  private com.android.dazhihui.a.b.u q = null;
  private com.android.dazhihui.a.b.u r = null;
  private DzhHeader s;
  private String t;
  private Handler u;
  private Runnable v;
  private int w = 30000;
  private int x = 1000;
  private com.android.dazhihui.a.b.u y = null;
  
  public static int a(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | paramArrayOfByte[1] << 8 & 0xFF00 | paramArrayOfByte[2] << 16 & 0xFF0000 | paramArrayOfByte[3] << 24 & 0xFF000000;
  }
  
  private void e()
  {
    int i1 = e.a().j();
    com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
    if (com.android.dazhihui.c.a.a.A[0].equals("无"))
    {
      com.android.dazhihui.c.a.a.A[0] = com.android.dazhihui.c.a.a.z;
      this.d.a(35);
    }
    label57:
    label149:
    for (;;)
    {
      this.d.close();
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
        this.d.a(35);
        break;
        i1 += 1;
        break label57;
      }
    }
  }
  
  private void f()
  {
    String str = this.e.getText().toString();
    com.android.dazhihui.ui.delegate.b.h localh = new com.android.dazhihui.ui.delegate.b.h("13028").a("2002", str).a("1205", "13");
    if (this.n) {
      localh.a("2007", a(str, this.f.getText().toString()));
    }
    this.q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(15, localh.h()) });
    registRequestListener(this.q);
    sendRequest(this.q);
    getLoadingDialog().show();
  }
  
  private boolean g()
  {
    return com.android.dazhihui.g.a().H() != null;
  }
  
  private void h()
  {
    o.u();
    this.c = com.android.dazhihui.ui.delegate.b.u.b(16);
    com.android.dazhihui.ui.delegate.b.g localg = new com.android.dazhihui.ui.delegate.b.g();
    localg.a(com.android.dazhihui.ui.delegate.b.u.a(o.p(), 20));
    localg.g(0);
    localg.a(com.android.dazhihui.ui.delegate.b.u.a(this.e.getText().toString(), 20));
    localg.a(this.c);
    i1 = com.android.dazhihui.ui.delegate.b.u.h();
    try
    {
      arrayOfByte = a(i1);
      i1 = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        byte[] arrayOfByte;
        i1 = 2139062143;
        continue;
        i1 += 1;
      }
    }
    if (i1 < arrayOfByte.length)
    {
      if (arrayOfByte[i1] == 0) {
        arrayOfByte[i1] = 1;
      }
    }
    else
    {
      i1 = a(arrayOfByte);
      localg.g(i1);
      this.y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(13, localg.a()) });
      registRequestListener(this.y);
      sendRequest(this.y);
      getLoadingDialog().show();
      Log.d("trade", "MoblieLogin():send_D()");
      return;
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public String a(String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (paramString1 != null) && (paramString1.length() > 0) && (paramString2.length() > 0))
    {
      int i2 = 0;
      String str1 = "";
      int i3;
      for (int i1 = 0;; i1 = i3 + 1)
      {
        str2 = str1;
        if (i2 >= paramString2.length()) {
          break;
        }
        i3 = i1;
        if (i1 >= paramString1.length()) {
          i3 = 0;
        }
        i1 = Integer.parseInt(paramString2.substring(i2, i2 + 1));
        int i4 = Integer.parseInt(paramString1.substring(i2, i2 + 1));
        str1 = str1 + "0" + Integer.toHexString(i1 ^ i4);
        i2 += 1;
      }
    }
    String str2 = "";
    return str2;
  }
  
  public void a()
  {
    Object localObject = this.e.getText().toString();
    String str = this.f.getText().toString();
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
    h();
  }
  
  public byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt & 0xFF), (byte)((0xFF00 & paramInt) >> 8), (byte)((0xFF0000 & paramInt) >> 16), (byte)((0xFF000000 & paramInt) >> 24) };
  }
  
  public void b()
  {
    this.u.postDelayed(this.v, 0L);
  }
  
  public void b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localToast = Toast.makeText(this, "未从服务器上取到数据请重试！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 1: 
      localToast = Toast.makeText(this, "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(this, "  网络连接异常请重试......", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void c()
  {
    this.u.removeCallbacks(this.v);
    this.w = 30000;
    this.h.setBackgroundResource(2130837598);
    this.h.setTextColor(-12563843);
    this.h.setText(this.t);
    this.h.setEnabled(true);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    this.p = o.q();
    paramct.a = 40;
    paramct.d = this.p;
    paramct.p = this;
  }
  
  public void d()
  {
    String str = this.e.getText().toString();
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
    b();
    f();
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.s = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    int i1 = e.a().j();
    getLoadingDialog().dismiss();
    Object localObject1;
    if (paramh == this.q)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!paramh.b())
        {
          o.a(null);
          Toast.makeText(this, paramh.d(), 1).show();
        }
      }
    }
    label416:
    label592:
    label614:
    for (;;)
    {
      return;
      paramh = new com.android.dazhihui.c.a.a(this);
      com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
      paramh.a(34);
      paramh.close();
      paramh = this.e.getText().toString();
      paramj = new com.android.dazhihui.c.a.a(this);
      com.android.dazhihui.c.a.a.i[i1][0] = paramh;
      paramj.a(19);
      paramj.close();
      Toast.makeText(this, "短信已发送,请查收密钥。", 1).show();
      return;
      Object localObject3;
      Object localObject2;
      if (paramh == this.y)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
        {
          localObject3 = new com.android.dazhihui.ui.delegate.b.g(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          boolean bool = ((com.android.dazhihui.ui.delegate.b.g)localObject3).g();
          localObject1 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
          localObject2 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
          i2 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).f();
          if (!bool) {
            break label592;
          }
          localObject3 = this.f.getText().toString().getBytes();
          byte[] arrayOfByte1 = new byte[localObject1.length + localObject3.length + this.c.length];
          System.arraycopy(localObject1, 0, arrayOfByte1, 0, localObject1.length);
          System.arraycopy(localObject3, 0, arrayOfByte1, localObject1.length, localObject3.length);
          byte[] arrayOfByte2 = this.c;
          int i3 = localObject1.length;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, localObject3.length + i3, this.c.length);
          localObject3 = com.android.dazhihui.ui.delegate.b.j.a(arrayOfByte1);
          if (com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject1, com.android.dazhihui.ui.delegate.b.a.b((byte[])localObject2, (byte[])localObject3))) {
            break label416;
          }
          localObject1 = Toast.makeText(this, "　　验证码错误。", 0);
          ((Toast)localObject1).setGravity(17, 0, 0);
          ((Toast)localObject1).show();
        }
      }
      for (;;)
      {
        if (paramh != this.r) {
          break label614;
        }
        paramh = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
          break;
        }
        paramj = com.android.dazhihui.ui.delegate.b.g.c(paramh.e());
        paramh = com.android.dazhihui.ui.delegate.b.h.c(paramj);
        if (paramh.b()) {
          break label616;
        }
        paramh = Toast.makeText(this, "　　验证失败。", 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        localObject1 = new com.android.dazhihui.c.a.a(this);
        com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
        ((com.android.dazhihui.c.a.a)localObject1).a(34);
        ((com.android.dazhihui.c.a.a)localObject1).close();
        com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject3, i2);
        localObject1 = this.e.getText().toString();
        localObject2 = this.f.getText().toString();
        localObject3 = new com.android.dazhihui.c.a.a(this);
        com.android.dazhihui.c.a.a.i[i1][0] = localObject1;
        com.android.dazhihui.c.a.a.i[i1][1] = localObject2;
        ((com.android.dazhihui.c.a.a)localObject3).a(19);
        ((com.android.dazhihui.c.a.a)localObject3).close();
        e();
        localObject1 = new Bundle();
        ((Bundle)localObject1).putBoolean("accobool", false);
        if (this.k != null) {
          ((Bundle)localObject1).putString("gotoFlag", this.k);
        }
        ((Bundle)localObject1).putBoolean("xcLoginProcedure", this.l);
        ((Bundle)localObject1).putBoolean("haveNoLoginSorHaveOne", this.m);
        startActivity(RegionTable.class, (Bundle)localObject1);
        finish();
        continue;
        localObject1 = Toast.makeText(this, "　　验证失败。", 0);
        ((Toast)localObject1).setGravity(17, 0, 0);
        ((Toast)localObject1).show();
      }
    }
    label616:
    e.a().j(null);
    e.a().k(null);
    i1 = paramj.indexOf("\00132003=");
    if (i1 != -1)
    {
      i1 += 7;
      i2 = paramj.indexOf("\001", i1);
      if ((i2 != -1) && (i2 > i1)) {
        e.a().j(paramj.substring(i1, i2).trim());
      }
    }
    i1 = paramj.indexOf("\00132002=");
    if (i1 != -1)
    {
      i1 += 7;
      i2 = paramj.indexOf("\001", i1);
      if ((i2 != -1) && (i2 > i1)) {
        e.a().k(paramj.substring(i1, i2).trim());
      }
    }
    int i2 = paramh.g();
    paramj = (String[][])Array.newInstance(String.class, new int[] { i2, 3 });
    i1 = 0;
    while (i1 < i2)
    {
      paramj[i1][0] = paramh.a(i1, "1021");
      paramj[i1][1] = paramh.a(i1, "1016");
      paramj[i1][2] = paramh.a(i1, "1005");
      if ((paramj[i1][1] == null) || (paramj[i1][1].trim().length() == 0)) {
        paramj[i1][1] = paramh.a(i1, "1019");
      }
      i1 += 1;
    }
    this.d = new com.android.dazhihui.c.a.a(this);
    com.android.dazhihui.c.a.a.q = paramj;
    this.d.a(25);
    this.d.close();
    e();
    paramh = new Bundle();
    paramh.putBoolean("accobool", false);
    if (this.k != null) {
      paramh.putString("gotoFlag", this.k);
    }
    paramh.putBoolean("xcLoginProcedure", this.l);
    paramh.putBoolean("haveNoLoginSorHaveOne", this.m);
    startActivity(RegionTable.class, paramh);
    finish();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (paramh == this.y) {
      e.a().p();
    }
    if (getLoadingDialog().isShowing())
    {
      b(1);
      getLoadingDialog().dismiss();
    }
  }
  
  public void init(Bundle paramBundle)
  {
    this.d = new com.android.dazhihui.c.a.a(this);
    this.d.close();
    int i1 = e.a().j();
    paramBundle = getIntent().getExtras();
    this.k = paramBundle.getString("gotoFlag");
    boolean bool;
    if (this.k != null)
    {
      bool = true;
      this.j = bool;
      this.l = paramBundle.getBoolean("xcLoginProcedure");
      this.m = paramBundle.getBoolean("haveNoLoginSorHaveOne");
      this.n = paramBundle.getBoolean(a, false);
      setContentView(2130903317);
      this.s = ((DzhHeader)findViewById(2131558643));
      this.s.a(this, this);
      this.f = ((EditText)findViewById(2131560052));
      this.e = ((EditText)findViewById(2131560047));
      this.e.setFilters(new InputFilter[] { new InputFilter.LengthFilter(11) });
      this.e.addTextChangedListener(new co(this));
      this.g = ((Button)findViewById(2131560054));
      this.g.setOnClickListener(new cp(this));
      this.h = ((TextView)findViewById(2131560050));
      this.h.setOnClickListener(new cq(this));
      this.t = this.h.getText().toString();
      this.u = new Handler();
      this.v = new cr(this);
      this.o = ((LinearLayout)findViewById(2131560055));
      if (!this.p.contains("湘财")) {
        break label522;
      }
      this.o.setVisibility(0);
      this.i = ((TextView)findViewById(2131560056));
      paramBundle = this.i.getText().toString();
      this.i.getPaint().setFlags(8);
      this.i.setOnClickListener(new cs(this, paramBundle));
    }
    for (;;)
    {
      com.android.dazhihui.c.a.a.q = (String[][])null;
      this.b = new Object[2];
      if (com.android.dazhihui.c.a.a.i[i1].length > 0)
      {
        this.b[0] = com.android.dazhihui.c.a.a.i[i1][0];
        this.e.setText((String)this.b[0]);
        this.e.setFocusable(true);
      }
      if ((com.android.dazhihui.c.a.a.i[i1].length > 1) && (!com.android.dazhihui.c.a.a.i[i1][1].equals("")))
      {
        this.b[1] = com.android.dazhihui.c.a.a.i[i1][1];
        this.f.setText((String)this.b[1]);
        this.f.setFocusable(false);
        this.e.setFocusable(false);
        this.g.setClickable(false);
      }
      return;
      bool = false;
      break;
      label522:
      this.o.setVisibility(8);
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (paramh == this.y) {
      e.a().p();
    }
    if (getLoadingDialog().isShowing())
    {
      b(2);
      getLoadingDialog().dismiss();
    }
  }
  
  protected void onFinish() {}
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\MobileLogin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */