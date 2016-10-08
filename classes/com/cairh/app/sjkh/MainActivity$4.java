package com.cairh.app.sjkh;

class MainActivity$4
  implements Runnable
{
  MainActivity$4(MainActivity paramMainActivity, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    if ((this.val$callbackFunc == null) || ("".equals(this.val$callbackFunc)))
    {
      this.this$0.callJSFunc("checkVersion('1','" + this.val$version + "','" + this.val$versionChannel + "')");
      return;
    }
    this.this$0.callJSFunc(this.val$callbackFunc + "('" + "1" + "','" + this.val$version + "','" + this.val$versionChannel + "')");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */