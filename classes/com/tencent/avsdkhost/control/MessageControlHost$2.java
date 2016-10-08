package com.tencent.avsdkhost.control;

import android.os.Handler;
import com.tencent.TIMUserStatusListener;
import com.tencent.avsdk.UserilvbManager;

class MessageControlHost$2
  implements TIMUserStatusListener
{
  MessageControlHost$2(MessageControlHost paramMessageControlHost) {}
  
  public void onForceOffline()
  {
    if (MessageControlHost.access$000(this.this$0) != null) {
      MessageControlHost.access$000(this.this$0).sendEmptyMessage(290);
    }
  }
  
  public void onUserSigExpired()
  {
    UserilvbManager.getInstance().requestToken();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */