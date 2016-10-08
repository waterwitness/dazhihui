package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

class ik
  implements DownloadListener
{
  ik(MyWebView paramMyWebView) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    this.a.getContext().startActivity(paramString1);
    if ((this.a.getContext() instanceof Activity)) {
      ((Activity)this.a.getContext()).finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */