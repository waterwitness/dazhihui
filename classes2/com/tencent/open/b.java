package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;

public abstract class b
  extends Dialog
{
  private static final String TAG = "openSDK_LOG.JsDialog";
  protected a jsBridge;
  @SuppressLint({"NewApi"})
  protected final WebChromeClient mChromeClient = new b.1(this);
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  protected abstract void onConsoleMessage(String paramString);
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jsBridge = new a();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */