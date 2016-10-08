package org.apache.cordova;

import android.app.AlertDialog.Builder;

class CordovaActivity$4
  implements Runnable
{
  CordovaActivity$4(CordovaActivity paramCordovaActivity1, CordovaActivity paramCordovaActivity2, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {}
  
  public void run()
  {
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.val$me);
      localBuilder.setMessage(this.val$message);
      localBuilder.setTitle(this.val$title);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(this.val$button, new CordovaActivity.4.1(this, this.val$exit, this.val$me));
      localBuilder.create();
      localBuilder.show();
      return;
    }
    catch (Exception localException)
    {
      this.this$0.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */