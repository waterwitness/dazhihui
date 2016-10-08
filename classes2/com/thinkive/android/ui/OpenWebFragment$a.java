package com.thinkive.android.ui;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.DownloadListener;

final class OpenWebFragment$a
  implements DownloadListener
{
  OpenWebFragment$a(OpenWebFragment paramOpenWebFragment) {}
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    Log.e("asos", "MyWebViewDownLoadListener  ss  " + paramString1);
    paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    this.a.startActivity(paramString1);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\ui\OpenWebFragment$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */