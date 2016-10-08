package com.cairh.app.sjkh;

import android.content.Intent;
import android.os.Environment;
import com.cairh.app.sjkh.service.BlockUploadService;
import java.io.File;

class MainActivity$WebviewClick$15
  implements Runnable
{
  MainActivity$WebviewClick$15(MainActivity.WebviewClick paramWebviewClick, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    String str1 = "";
    if (Environment.getExternalStorageState().equals("mounted")) {
      str1 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SJKH";
    }
    str1 = str1 + "/sjkh_sVideo_" + this.val$userId + ".mp4";
    Intent localIntent = new Intent(MainActivity.WebviewClick.access$0(this.this$1), BlockUploadService.class);
    String str2 = MainActivity.WebviewClick.access$0(this.this$1).appServerUrl.replace("indexnew", "blockUploadVideo.do");
    String str3 = MainActivity.WebviewClick.access$0(this.this$1).appServerUrl.replace("indexnew", "notifyMergeBlocks.do");
    localIntent.putExtra("uploadBlockUrl", str2);
    localIntent.putExtra("notifyUrl", str3);
    localIntent.putExtra("cookieDomain", this.val$cookieDomain);
    localIntent.putExtra("cookiestr", this.val$cookiestr);
    localIntent.putExtra("filePath", str1);
    MainActivity.WebviewClick.access$0(this.this$1).startService(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */