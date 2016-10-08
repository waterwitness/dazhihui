package com.tencent.open;

import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;

class TDialog$JsListener
  extends a.b
{
  private TDialog$JsListener(TDialog paramTDialog) {}
  
  public void onAddShare(String paramString)
  {
    f.b("openSDK_LOG.TDialog", "JsListener onAddShare");
    onComplete(paramString);
  }
  
  public void onCancel(String paramString)
  {
    f.e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + paramString);
    TDialog.b(this.this$0).obtainMessage(2, paramString).sendToTarget();
    this.this$0.dismiss();
  }
  
  public void onCancelAddShare(String paramString)
  {
    f.e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + paramString);
    onCancel("cancel");
  }
  
  public void onCancelInvite()
  {
    f.e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
    onCancel("");
  }
  
  public void onCancelLogin()
  {
    onCancel("");
  }
  
  public void onComplete(String paramString)
  {
    TDialog.b(this.this$0).obtainMessage(1, paramString).sendToTarget();
    f.e("openSDK_LOG.TDialog", "JsListener onComplete" + paramString);
    this.this$0.dismiss();
  }
  
  public void onInvite(String paramString)
  {
    onComplete(paramString);
  }
  
  public void onLoad(String paramString)
  {
    TDialog.b(this.this$0).obtainMessage(4, paramString).sendToTarget();
  }
  
  public void showMsg(String paramString)
  {
    TDialog.b(this.this$0).obtainMessage(3, paramString).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\TDialog$JsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */