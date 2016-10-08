package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.a.f;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class TDialog
  extends b
{
  static final FrameLayout.LayoutParams a = new FrameLayout.LayoutParams(-1, -1);
  static Toast b = null;
  private static WeakReference<ProgressDialog> d;
  private WeakReference<Context> c;
  private String e;
  private TDialog.OnTimeListener f;
  private IUiListener g;
  private FrameLayout h;
  private com.tencent.open.c.b i;
  private Handler j;
  private boolean k = false;
  private QQToken l = null;
  
  public TDialog(Context paramContext, String paramString1, String paramString2, IUiListener paramIUiListener, QQToken paramQQToken)
  {
    super(paramContext, 16973840);
    this.c = new WeakReference(paramContext);
    this.e = paramString2;
    this.f = new TDialog.OnTimeListener(paramContext, paramString1, paramString2, paramQQToken.getAppId(), paramIUiListener);
    this.j = new TDialog.THandler(this, this.f, paramContext.getMainLooper());
    this.g = paramIUiListener;
    this.l = paramQQToken;
  }
  
  private void a()
  {
    new TextView((Context)this.c.get()).setText("test");
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.i = new com.tencent.open.c.b((Context)this.c.get());
    this.i.setLayoutParams(localLayoutParams);
    this.h = new FrameLayout((Context)this.c.get());
    localLayoutParams.gravity = 17;
    this.h.setLayoutParams(localLayoutParams);
    this.h.addView(this.i);
    setContentView(this.h);
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  private void b()
  {
    this.i.setVerticalScrollBarEnabled(false);
    this.i.setHorizontalScrollBarEnabled(false);
    this.i.setWebViewClient(new TDialog.FbWebViewClient(this, null));
    this.i.setWebChromeClient(this.mChromeClient);
    this.i.clearFormData();
    WebSettings localWebSettings = this.i.getSettings();
    if (localWebSettings == null) {
      return;
    }
    localWebSettings.setSavePassword(false);
    localWebSettings.setSaveFormData(false);
    localWebSettings.setCacheMode(-1);
    localWebSettings.setNeedInitialFocus(false);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setSupportZoom(true);
    localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
    localWebSettings.setJavaScriptEnabled(true);
    if ((this.c != null) && (this.c.get() != null))
    {
      localWebSettings.setDatabaseEnabled(true);
      localWebSettings.setDatabasePath(((Context)this.c.get()).getApplicationContext().getDir("databases", 0).getPath());
    }
    localWebSettings.setDomStorageEnabled(true);
    this.jsBridge.a(new TDialog.JsListener(this, null), "sdk_js_if");
    this.i.loadUrl(this.e);
    this.i.setLayoutParams(a);
    this.i.setVisibility(4);
    this.i.getSettings().setSavePassword(false);
  }
  
  private static void c(Context paramContext, String paramString)
  {
    try
    {
      paramString = Util.parseJson(paramString);
      int m = paramString.getInt("type");
      paramString = paramString.getString("msg");
      if (m == 0)
      {
        if (b == null) {
          b = Toast.makeText(paramContext, paramString, 0);
        }
        for (;;)
        {
          b.show();
          return;
          b.setView(b.getView());
          b.setText(paramString);
          b.setDuration(0);
        }
      }
      if (m != 1) {
        return;
      }
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    if (b == null) {
      b = Toast.makeText(paramContext, paramString, 1);
    }
    for (;;)
    {
      b.show();
      return;
      b.setView(b.getView());
      b.setText(paramString);
      b.setDuration(1);
    }
  }
  
  private static void d(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    int m;
    do
    {
      do
      {
        return;
        try
        {
          paramString = Util.parseJson(paramString);
          m = paramString.getInt("action");
          paramString = paramString.getString("msg");
          if (m != 1) {
            break;
          }
          if ((d == null) || (d.get() == null))
          {
            paramContext = new ProgressDialog(paramContext);
            paramContext.setMessage(paramString);
            d = new WeakReference(paramContext);
            paramContext.show();
            return;
          }
        }
        catch (JSONException paramContext)
        {
          paramContext.printStackTrace();
          return;
        }
        ((ProgressDialog)d.get()).setMessage(paramString);
      } while (((ProgressDialog)d.get()).isShowing());
      ((ProgressDialog)d.get()).show();
      return;
    } while ((m != 0) || (d == null) || (d.get() == null) || (!((ProgressDialog)d.get()).isShowing()));
    ((ProgressDialog)d.get()).dismiss();
    d = null;
  }
  
  public void onBackPressed()
  {
    if (this.f != null) {
      this.f.onCancel();
    }
    super.onBackPressed();
  }
  
  protected void onConsoleMessage(String paramString)
  {
    f.b("openSDK_LOG.TDialog", "--onConsoleMessage--");
    try
    {
      this.jsBridge.a(this.i, paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    a();
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\TDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */