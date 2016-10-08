package com.tencent.av.utils;

import android.telephony.PhoneStateListener;

class PhoneStatusMonitor$QQPhoneStateListener
  extends PhoneStateListener
{
  PhoneStatusMonitor$QQPhoneStateListener(PhoneStatusMonitor paramPhoneStatusMonitor) {}
  
  public void onCallStateChanged(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onCallStateChanged(paramInt, paramString);
      return;
      if (QLog.isColorLevel()) {
        QLog.d("PhoneStatusMonitor", 0, "onCallStateChanged CALL_STATE_IDLE");
      }
      if ((this.this$0.mIsCalling) && (!PhoneStatusTools.isCalling(this.this$0.mContext)))
      {
        this.this$0.mIsCalling = false;
        if (this.this$0.mPhoneStatusListener != null)
        {
          this.this$0.mPhoneStatusListener.onCallStateChanged(false);
          continue;
          if (QLog.isColorLevel()) {
            QLog.d("PhoneStatusMonitor", 0, "onCallStateChanged CALL_STATE_RINGING or CALL_STATE_OFFHOOK");
          }
          if (!this.this$0.mIsCalling)
          {
            this.this$0.mIsCalling = true;
            if (this.this$0.mPhoneStatusListener != null) {
              this.this$0.mPhoneStatusListener.onCallStateChanged(true);
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\utils\PhoneStatusMonitor$QQPhoneStateListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */