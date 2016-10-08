package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class H5PayActivity
  extends Activity
{
  private WebView a;
  private WebViewClient b;
  
  public void a()
  {
    try
    {
      synchronized (b.a)
      {
        ???.notify();
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void finish()
  {
    a();
    super.finish();
  }
  
  public void onBackPressed()
  {
    if (this.a.canGoBack())
    {
      if (((c)this.b).a)
      {
        j localj = j.a(j.d.h);
        i.a = i.a(localj.h, localj.i, "");
        finish();
      }
      return;
    }
    i.a = i.a();
    finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      Object localObject = getIntent().getExtras();
      paramBundle = ((Bundle)localObject).getString("url");
      if (!com.alipay.sdk.j.j.a(paramBundle))
      {
        finish();
        return;
      }
      localObject = ((Bundle)localObject).getString("cookie");
      super.requestWindowFeature(1);
      this.a = com.alipay.sdk.j.j.a(this, paramBundle, (String)localObject);
      this.b = new c(this);
      this.a.setWebViewClient(this.b);
      return;
    }
    catch (Exception paramBundle)
    {
      finish();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.a != null) {
      this.a.removeAllViews();
    }
    try
    {
      this.a.destroy();
      this.a = null;
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\H5PayActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */