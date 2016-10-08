package com.tencent.avsdk.control;

import android.os.Handler;
import com.tencent.TIMUserStatusListener;
import com.tencent.avsdk.UserilvbManager;

class MessageControl$2
  implements TIMUserStatusListener
{
  MessageControl$2(MessageControl paramMessageControl) {}
  
  public void onForceOffline()
  {
    if (MessageControl.access$100(this.this$0) != null) {
      MessageControl.access$100(this.this$0).sendEmptyMessage(290);
    }
  }
  
  public void onUserSigExpired()
  {
    UserilvbManager.getInstance().requestToken();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */