package com.tencent.avsdkhost.control;

import android.os.Handler;
import android.util.Log;
import com.tencent.TIMCallBack;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;

class MessageControlHost$1
  implements TIMCallBack
{
  MessageControlHost$1(MessageControlHost paramMessageControlHost, TIMCallBack paramTIMCallBack) {}
  
  public void onError(int paramInt, String paramString)
  {
    if (this.val$timCallBack != null) {
      this.val$timCallBack.onError(paramInt, paramString);
    }
    if (paramInt != 10013)
    {
      this.this$0.sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "聊天室进入失败，请退出重新进入", "", "");
      if (MessageControlHost.access$000(this.this$0) != null) {
        MessageControlHost.access$000(this.this$0).sendEmptyMessage(292);
      }
    }
    Log.e(MessageControlHost.access$100(), "加群失败,失败原因：" + paramInt + ":" + paramString);
  }
  
  public void onSuccess()
  {
    Log.d(MessageControlHost.access$100(), "initJoinGroup 加群成功");
    if (this.val$timCallBack != null) {
      this.val$timCallBack.onSuccess();
    }
    if (MessageControlHost.access$000(this.this$0) != null) {
      MessageControlHost.access$000(this.this$0).sendEmptyMessage(293);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */