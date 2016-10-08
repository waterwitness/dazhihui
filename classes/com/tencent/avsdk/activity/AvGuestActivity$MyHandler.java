package com.tencent.avsdk.activity;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.lang.ref.WeakReference;

class AvGuestActivity$MyHandler
  extends Handler
{
  private final WeakReference<AvGuestActivity> mActivity;
  private final Handler.Callback mCallback;
  
  public AvGuestActivity$MyHandler(AvGuestActivity paramAvGuestActivity, Handler.Callback paramCallback)
  {
    this.mActivity = new WeakReference(paramAvGuestActivity);
    this.mCallback = paramCallback;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((this.mActivity != null) && (this.mCallback != null))
    {
      AvGuestActivity localAvGuestActivity = (AvGuestActivity)this.mActivity.get();
      if ((localAvGuestActivity != null) && (this.mCallback != null) && (!localAvGuestActivity.isFinishing())) {}
    }
    else
    {
      return;
    }
    this.mCallback.handleMessage(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$MyHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */