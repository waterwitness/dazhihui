package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.GoldAnimation;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;

public class LoginMainScreen
  extends BaseActivity
  implements View.OnClickListener, b, cp, cs
{
  public static Runnable b;
  GoldAnimation a;
  IUiListener c = new gs(this);
  private String d = "FROM_STOCK";
  private boolean e = false;
  private DzhHeader f;
  private w g;
  private String h;
  private gx i;
  
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
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (gw.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.f == null);
      this.f.a(paramy);
      return;
    } while (this.f == null);
    this.f.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    paramct.d = getResources().getString(2131165410);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj) {}
  
  public void handleTimeout(h paramh) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903246);
    paramBundle = getIntent();
    this.g = w.a();
    w.a().a(c.a);
    w.a().a(this);
    if (paramBundle != null)
    {
      this.d = paramBundle.getStringExtra("REGISTER_FROM_TYPE");
      this.e = paramBundle.getBooleanExtra("CAN_showSyncSettingDialog", false);
    }
    this.f = ((DzhHeader)findViewById(2131558567));
    this.f.setOnHeaderButtonClickListener(this);
    this.f.a(this, this);
    if ((!TextUtils.isEmpty(this.d)) && (this.d.equals("FROM_LOTTERY"))) {
      this.f.setBackgroundResource(2130838345);
    }
    this.a = ((GoldAnimation)findViewById(2131558921));
    paramBundle = findViewById(2131559692);
    paramBundle.setOnClickListener(this);
    if ("app_dzh".equals("app_sb")) {
      paramBundle.setVisibility(8);
    }
    findViewById(2131559689).setOnClickListener(this);
    findViewById(2131559695).setOnClickListener(this);
    findViewById(2131559698).setOnClickListener(this);
    findViewById(2131559696).setOnClickListener(this);
    findViewById(2131559697).setOnClickListener(this);
    this.h = w.a().f();
    changeLookFace(this.mLookFace);
  }
  
  public void loginStatusChange(c paramc)
  {
    int j;
    if (paramc == c.b)
    {
      j = this.g.m();
      if (j != 0) {
        break label208;
      }
      d.a().a("login_cuccess_first_into_guh", 1);
      d.a().g();
      showShortToast(getResources().getString(2131165682));
      if (ti.a <= 0) {
        break label91;
      }
      this.a.setVisibility(0);
      this.a.a(ti.a);
      ti.a = 0;
      this.a.setOnBtnClickListener(new gt(this));
    }
    label91:
    label208:
    String str;
    do
    {
      do
      {
        return;
        paramc = w.a().f();
        Log.i("send", "mPreviousName=" + this.h + " currentName=" + paramc);
        if ((this.e) && (!TextUtils.isEmpty(paramc)) && (!paramc.equals(this.h)))
        {
          new Handler().postDelayed(new gu(this), 1000L);
          return;
        }
        new Handler().postDelayed(new gv(this), 1000L);
        return;
        if (j != 1) {
          break;
        }
        paramc = w.a().f();
        str = w.a().i();
      } while ((TextUtils.isEmpty(paramc)) || (TextUtils.isEmpty(str)));
      showShortToast(2131166436);
      return;
      paramc = w.a().f();
      str = w.a().i();
    } while ((TextUtils.isEmpty(paramc)) || (TextUtils.isEmpty(str)));
    showShortToast(2131165419);
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Tencent.onActivityResultData(paramInt1, paramInt2, paramIntent, this.c);
    if ((paramInt1 == 10100) && (paramInt2 == 11101)) {
      Tencent.handleResultData(paramIntent, this.c);
    }
  }
  
  public void onClick(View paramView)
  {
    paramView.setClickable(false);
    paramView.postDelayed(new gq(this, paramView), 2000L);
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559698: 
      if (this.i == null) {
        this.i = new gx();
      }
      this.i.a(this);
      return;
    case 2131559695: 
      if (this.i == null) {
        this.i = new gx();
      }
      this.i.a(this, this.e);
      return;
    case 2131559711: 
      startActivity(new Intent("android.intent.action.DIAL", Uri.parse(getResources().getString(2131165304))));
      return;
    case 2131559692: 
      if (this.i == null) {
        this.i = new gx();
      }
      this.i.a(this);
      n.a("", 1316);
      return;
    case 2131559696: 
      if (this.i == null) {
        this.i = new gx();
      }
      this.i.c(this);
      return;
    case 2131559689: 
      n.a("", 1378);
      if (this.i == null) {
        this.i = new gx();
      }
      this.i.b(this);
      return;
    }
    FingerprintLoginScreen.a(this, false, new gr(this));
  }
  
  protected void onDestroy()
  {
    w.a().b(this);
    if (b != null) {
      b = null;
    }
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\LoginMainScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */