package org.apache.cordova;

class CordovaActivity$2
  implements Runnable
{
  CordovaActivity$2(CordovaActivity paramCordovaActivity1, CordovaActivity paramCordovaActivity2, String paramString) {}
  
  public void run()
  {
    this.val$me.spinnerStop();
    this.val$me.appView.showWebPage(this.val$errorUrl, false, true, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */