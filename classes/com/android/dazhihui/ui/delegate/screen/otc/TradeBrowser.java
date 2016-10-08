package com.android.dazhihui.ui.delegate.screen.otc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class TradeBrowser
  extends DelegateBaseActivity
  implements cp, cs
{
  private WebView a;
  private String b;
  
  public static void a(DelegateBaseActivity paramDelegateBaseActivity, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("B_URL", paramString);
    paramDelegateBaseActivity.startActivity(TradeBrowser.class, localBundle);
  }
  
  public boolean OnChildClick(View paramView)
  {
    return false;
  }
  
  public void createTitleObj(Context paramContext, ct paramct) {}
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903465);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getExtras();
      if (paramBundle != null) {
        this.b = paramBundle.getString("B_URL");
      }
    }
    this.a = ((WebView)findViewById(2131558818));
    this.a.setWebViewClient(new al(this));
    this.a.setScrollBarStyle(33554432);
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.getSettings().setBuiltInZoomControls(true);
    this.a.getSettings().setSupportZoom(true);
    this.a.loadUrl(this.b);
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\TradeBrowser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */