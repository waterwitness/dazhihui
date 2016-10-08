package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.g;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.ct;

public class MarketFocusScreen
  extends MarketListScreen
{
  String a = "http://mnews.gw.com.cn/";
  private final String h = this.a + "wap/data/gold/jygz.json";
  private DzhHeader i;
  private i j;
  
  private void c()
  {
    if (this.j != null) {
      this.j.refresh();
    }
  }
  
  protected void a(int paramInt, boolean paramBoolean)
  {
    this.d = new f();
    this.d.c(this.h);
    this.d.a(this);
    g.a().a(this.d);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (if.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.i == null);
      this.i.a(paramy);
      return;
    } while (this.i == null);
    this.i.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8744;
    paramct.d = "龙虎榜";
    paramct.q = false;
    paramct.p = new ie(this);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903329);
    this.i = ((DzhHeader)findViewById(2131560085));
    this.i.a(this, this);
    paramBundle = new Bundle();
    paramBundle.putString("nexturl", "http://lhb.gw.com.cn/");
    paramBundle.putString("names", null);
    paramBundle.putInt("api_type", 0);
    paramBundle.putByteArray("post_data", null);
    paramBundle.putBoolean("ISSHOWTITLE", false);
    this.j = i.a(paramBundle);
    getSupportFragmentManager().a().a(2131559839, this.j, "browserFragment").b();
    c();
    changeLookFace(this.mLookFace);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.j != null) && (this.j.a() != null))
    {
      MyWebView localMyWebView = this.j.a();
      if ((paramInt == 4) && (localMyWebView.canGoBack()))
      {
        localMyWebView.goBack();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MarketFocusScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */