package com.tencent.avsdkhost.activity;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.lang.ref.WeakReference;

class AvHostActivity$MyHandler
  extends Handler
{
  private final WeakReference<AvHostActivity> mActivity;
  private final Handler.Callback mCallback;
  
  public AvHostActivity$MyHandler(AvHostActivity paramAvHostActivity, Handler.Callback paramCallback)
  {
    this.mActivity = new WeakReference(paramAvHostActivity);
    this.mCallback = paramCallback;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((this.mActivity != null) && (this.mCallback != null))
    {
      AvHostActivity localAvHostActivity = (AvHostActivity)this.mActivity.get();
      if ((localAvHostActivity != null) && (this.mCallback != null) && (!localAvHostActivity.isFinishing())) {}
    }
    else
    {
      return;
    }
    this.mCallback.handleMessage(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$MyHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */