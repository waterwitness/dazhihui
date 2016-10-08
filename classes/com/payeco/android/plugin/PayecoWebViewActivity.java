package com.payeco.android.plugin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class PayecoWebViewActivity
  extends PayecoBasicActivity
{
  public static final String protocolUrl = "https://m.payeco.com/payeco_imsi/html/agreement.html";
  public static final String supportBankUrl = "https://m.payeco.com/payeco_imsi/html/banklist.html";
  private Resources a;
  private String b;
  private PayecoWebViewActivity bm;
  private WebView bn;
  private Button bo;
  private TextView bp;
  private String url;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    this.b = getPackageName();
    this.bm = this;
    setContentView(this.a.getIdentifier("payeco_plugin_webview", "layout", this.b));
    this.url = getIntent().getSerializableExtra("url").toString();
    int i = this.a.getIdentifier("payeco_close_webview_tv", "id", this.b);
    int j = this.a.getIdentifier("payeco_close_webview_bt", "id", this.b);
    paramBundle = new L(this, i);
    this.bo = ((Button)findViewById(j));
    this.bo.setOnClickListener(paramBundle);
    this.bp = ((TextView)findViewById(i));
    this.bp.setOnClickListener(paramBundle);
    this.bn = ((WebView)findViewById(this.a.getIdentifier("payecoReadProtocolWebView", "id", this.b)));
    this.bn.setWebViewClient(new M(this));
    paramBundle = this.bn.getSettings();
    paramBundle.setTextSize(WebSettings.TextSize.LARGER);
    paramBundle.setBuiltInZoomControls(true);
    paramBundle.setDefaultZoom(WebSettings.ZoomDensity.FAR);
    i = getResources().getDisplayMetrics().densityDpi;
    if (i == 240) {
      paramBundle.setDefaultZoom(WebSettings.ZoomDensity.FAR);
    }
    for (;;)
    {
      paramBundle.setJavaScriptEnabled(true);
      this.bn.requestFocus();
      this.bn.setHorizontalScrollBarEnabled(false);
      this.bn.setHorizontalScrollbarOverlay(true);
      this.bn.loadUrl(this.url);
      return;
      if (i == 160) {
        paramBundle.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
      } else {
        paramBundle.setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoWebViewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */