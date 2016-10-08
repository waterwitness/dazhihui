package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MorningPostScreen
  extends BaseActivity
  implements cs
{
  private DzhHeader a;
  private i b;
  
  private void a()
  {
    if (this.b != null) {
      this.b.refresh();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (jt.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8744;
    paramct.d = paramContext.getResources().getString(2131165400);
    paramct.q = false;
    paramct.p = new js(this);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903329);
    this.a = ((DzhHeader)findViewById(2131560085));
    this.a.a(this, this);
    paramBundle = new Bundle();
    paramBundle.putString("nexturl", f.U);
    paramBundle.putString("names", null);
    paramBundle.putInt("api_type", 0);
    paramBundle.putByteArray("post_data", null);
    paramBundle.putBoolean("ISSHOWTITLE", false);
    this.b = i.a(paramBundle);
    getSupportFragmentManager().a().a(2131559839, this.b, "browserFragment").b();
    a();
    changeLookFace(this.mLookFace);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.b != null) && (this.b.a() != null))
    {
      MyWebView localMyWebView = this.b.a();
      if ((paramInt == 4) && (localMyWebView.canGoBack()))
      {
        localMyWebView.goBack();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MorningPostScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */