package com.tencent.open;

import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;

class PKDialog$JsListener
  extends a.b
{
  private PKDialog$JsListener(PKDialog paramPKDialog) {}
  
  public void onCancel(String paramString)
  {
    PKDialog.access$200(this.this$0).obtainMessage(2, paramString).sendToTarget();
    this.this$0.dismiss();
  }
  
  public void onComplete(String paramString)
  {
    PKDialog.access$200(this.this$0).obtainMessage(1, paramString).sendToTarget();
    f.e("openSDK_LOG.PKDialog", "JsListener onComplete" + paramString);
    this.this$0.dismiss();
  }
  
  public void onLoad(String paramString)
  {
    PKDialog.access$200(this.this$0).obtainMessage(4, paramString).sendToTarget();
  }
  
  public void showMsg(String paramString)
  {
    PKDialog.access$200(this.this$0).obtainMessage(3, paramString).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\PKDialog$JsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */