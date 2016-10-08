package com.android.dazhihui.ui.delegate.newtrade;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.a.b.l;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.screen.NewTradeBaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;

public class CaptialAnalMainScreen
  extends NewTradeBaseActivity
  implements View.OnClickListener, cp, cs, IWXAPIEventHandler
{
  public String a;
  private DzhHeader b;
  private Dialog e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private LinearLayout i;
  private LinearLayout j;
  private TextView k;
  private ad l;
  private e m;
  private int n;
  private k o = null;
  private k p = null;
  
  private e a(ad paramad, int paramInt)
  {
    e locale = (e)paramad.a(paramInt + "");
    paramad = locale;
    if (locale == null) {
      paramad = b(paramInt);
    }
    return paramad;
  }
  
  private e b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return new com.android.dazhihui.ui.delegate.newtrade.screen.b();
    case 0: 
      return new a();
    }
    return new f();
  }
  
  private void b()
  {
    this.b = ((DzhHeader)findViewById(2131558683));
  }
  
  private void c()
  {
    this.l = getSupportFragmentManager();
    this.b.a(this, this);
  }
  
  private void c(int paramInt)
  {
    this.n = paramInt;
    e locale1 = this.m;
    if (this.l == null) {
      return;
    }
    d();
    e locale2 = a(this.l, paramInt);
    this.m = locale2;
    at localat = this.l.a();
    if (locale1 != null)
    {
      locale1.beforeHidden();
      localat.b(locale1);
    }
    if (!locale2.isAdded()) {
      localat.a(2131558684, locale2, paramInt + "");
    }
    for (;;)
    {
      if (this.m != null) {
        this.m.show();
      }
      localat.b();
      return;
      localat.c(locale2);
    }
  }
  
  private void d()
  {
    if (this.n == 0)
    {
      this.b.a("账户分析用户服务协议", null);
      this.b.setRightText("");
    }
    while (this.n != 1) {
      return;
    }
    this.b.a("资产分析", null);
    this.b.setRightText("分享");
  }
  
  private void e()
  {
    this.e = new Dialog(this, 16974132);
    this.e.getWindow().getAttributes().gravity = 17;
    this.e.setCancelable(true);
    this.f = ((LinearLayout)LayoutInflater.from(this).inflate(2130903076, null));
    this.e.setContentView(this.f);
    this.g = ((LinearLayout)this.f.findViewById(2131558696));
    this.h = ((LinearLayout)this.f.findViewById(2131558697));
    this.i = ((LinearLayout)this.f.findViewById(2131558698));
    this.j = ((LinearLayout)this.f.findViewById(2131558699));
    this.k = ((TextView)this.f.findViewById(2131558700));
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    this.k.setOnClickListener(this);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    do
    {
      return true;
      if (((this.m instanceof f)) && (((f)this.m).a == 1))
      {
        ((f)this.m).a(0);
        return true;
      }
      finish();
      return true;
    } while (this.n != 1);
    if (this.e == null) {
      e();
    }
    this.e.show();
    return true;
  }
  
  public void a()
  {
    this.o = new k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(com.android.dazhihui.ui.delegate.newtrade.a.a.a("18802").i()) });
    registRequestListener(this.o);
    a(this.o, true);
  }
  
  public void a(int paramInt)
  {
    c(paramInt);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.b.a(paramString1, paramString2);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (g.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.b == null);
      this.b.a(paramy);
      return;
    } while (this.b == null);
    this.b.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16504;
    paramct.e = "分享";
    paramct.p = this;
    paramct.s = "";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((l)paramj).b();
    if (com.android.dazhihui.ui.delegate.newtrade.a.b.a(paramj, this))
    {
      g.b(paramj.d());
      paramj = com.android.dazhihui.ui.delegate.b.h.a(paramj.d());
      if ((paramh != this.o) || (paramj == null)) {
        break label135;
      }
      if (paramj.b()) {
        break label66;
      }
      showShortToast(paramj.d());
    }
    label66:
    label135:
    while ((paramh != this.p) || (paramj == null))
    {
      do
      {
        return;
        paramh = paramj.a("1863");
        if ((paramh != null) && (paramh.trim().equals("1")))
        {
          com.android.dazhihui.ui.delegate.newtrade.a.a.c = paramh;
          c(1);
          return;
        }
      } while ((paramh == null) || (!paramh.trim().equals("0")));
      this.a = paramj.a("1208");
      c(0);
      return;
    }
    com.android.dazhihui.ui.delegate.newtrade.a.a.c = "0";
    if ((com.android.dazhihui.ui.delegate.newtrade.a.a.c != null) && (com.android.dazhihui.ui.delegate.newtrade.a.a.c.trim().equals("1")))
    {
      c(1);
      return;
    }
    a();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903074);
    b();
    c();
    if ((com.android.dazhihui.ui.delegate.newtrade.a.a.c != null) && (com.android.dazhihui.ui.delegate.newtrade.a.a.c.trim().equals("1")))
    {
      c(1);
      return;
    }
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131558696: 
    case 2131558697: 
    case 2131558698: 
    case 2131558699: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (!bb.a(this, "com.tencent.mm"))
              {
                Toast.makeText(this, "请先安装微信", 0).show();
                return;
              }
              paramView = ((BitmapDrawable)new BitmapDrawable(bb.a(this, false))).getBitmap();
              bb.a(this).a("", paramView, false);
            } while (!this.e.isShowing());
            this.e.dismiss();
            return;
            if (!bb.a(this, "com.tencent.mm"))
            {
              Toast.makeText(this, "请先安装微信", 0).show();
              return;
            }
            paramView = ((BitmapDrawable)new BitmapDrawable(bb.a(this, false))).getBitmap();
            bb.a(this).a("", paramView, true);
          } while (!this.e.isShowing());
          this.e.dismiss();
          return;
          paramView = new BitmapDrawable(bb.a(this, false));
          bb.a(this).a("大智慧", paramView);
        } while (!this.e.isShowing());
        this.e.dismiss();
        return;
        paramView = ((BitmapDrawable)new BitmapDrawable(bb.a(this, false))).getBitmap();
        bb.a(this).a("", "", paramView);
      } while (!this.e.isShowing());
      this.e.dismiss();
      return;
    }
    if (this.e == null) {
      e();
    }
    this.e.dismiss();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      if (((this.m instanceof f)) && (((f)this.m).a == 1)) {
        ((f)this.m).a(0);
      }
      for (;;)
      {
        return true;
        finish();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onReq(BaseReq paramBaseReq) {}
  
  public void onResp(BaseResp paramBaseResp)
  {
    switch (paramBaseResp.errCode)
    {
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (!o.r()) {
      finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\CaptialAnalMainScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */