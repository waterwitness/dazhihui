package com.cairh.app.sjkh;

import android.content.Intent;
import com.cairh.app.sjkh.ui.VideoCallActivity;

class MainActivity$WebviewClick$14
  implements Runnable
{
  MainActivity$WebviewClick$14(MainActivity.WebviewClick paramWebviewClick, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    Intent localIntent = new Intent(MainActivity.WebviewClick.access$0(this.this$1), VideoCallActivity.class);
    localIntent.putExtra("videoServer", this.val$videoServer);
    localIntent.putExtra("videoPort", this.val$videoPort);
    localIntent.putExtra("targetUserId", this.val$targetUserId);
    MainActivity.WebviewClick.access$0(this.this$1).startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */