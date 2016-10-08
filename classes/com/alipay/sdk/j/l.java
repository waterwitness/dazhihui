package com.alipay.sdk.j;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

final class l
  implements DownloadListener
{
  l(Activity paramActivity) {}
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
      this.a.startActivity(paramString1);
      return;
    }
    catch (Throwable paramString1) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */