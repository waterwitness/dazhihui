package org.apache.cordova;

class CordovaActivity$3
  implements Runnable
{
  CordovaActivity$3(CordovaActivity paramCordovaActivity1, boolean paramBoolean, CordovaActivity paramCordovaActivity2, String paramString1, String paramString2) {}
  
  public void run()
  {
    if (this.val$exit)
    {
      this.val$me.appView.setVisibility(8);
      this.val$me.displayError("Application Error", this.val$description + " (" + this.val$failingUrl + ")", "OK", this.val$exit);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */