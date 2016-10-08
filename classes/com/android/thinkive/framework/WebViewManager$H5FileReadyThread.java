package com.android.thinkive.framework;

import android.content.Context;
import android.content.Intent;
import com.android.thinkive.framework.util.FileUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.PreferencesUtil;
import java.io.File;
import java.io.IOException;

class WebViewManager$H5FileReadyThread
  implements Runnable
{
  private Context context;
  
  public WebViewManager$H5FileReadyThread(WebViewManager paramWebViewManager, Context paramContext)
  {
    this.context = paramContext;
  }
  
  public void run()
  {
    try
    {
      synchronized (WebViewManager.access$2(this.this$0))
      {
        Log.d("H5FileReadyThread start !!!");
        WebViewManager.access$3(this.this$0, WebViewManager.unZipState.STATUS_RUNNING);
        FileUtil.deleteFile(new File(WebViewManager.access$4(this.this$0) + File.separator + "www"));
        FileUtil.copyAssetFile(this.context, "m.zip", WebViewManager.access$4(this.this$0) + File.separator + "m.zip");
        Object localObject1 = new File(WebViewManager.access$4(this.this$0) + File.separator + "m.zip");
        FileUtil.upZipFile((File)localObject1, WebViewManager.access$4(this.this$0));
        FileUtil.deleteFile((File)localObject1);
        PreferencesUtil.putBoolean(WebViewManager.access$2(this.this$0), "isUnzipComplete", true);
        WebViewManager.access$5(this.this$0);
        localObject1 = new Intent();
        ((Intent)localObject1).setAction("com.thinkive.android.h5.unzip.complete");
        WebViewManager.access$2(this.this$0).sendBroadcast((Intent)localObject1);
        Log.d("send h5 unzip complete broadcast!!!");
        WebViewManager.access$3(this.this$0, WebViewManager.unZipState.STATUS_FINISHED);
        return;
      }
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\WebViewManager$H5FileReadyThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */