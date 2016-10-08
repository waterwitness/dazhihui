package com.tencent.avsdkhost.control;

import android.os.Handler;
import android.os.Message;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;
import com.tencent.avsdkhost.ChatEntityHost;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;

class MessageControlHost$7
  implements TIMValueCallBack<TIMMessage>
{
  MessageControlHost$7(MessageControlHost paramMessageControlHost, TIMValueCallBack paramTIMValueCallBack) {}
  
  public void onError(int paramInt, String paramString)
  {
    if (paramInt == 85) {
      MessageControlHost.access$000(this.this$0).sendEmptyMessage(266);
    }
    for (;;)
    {
      if (this.val$callBack != null) {
        this.val$callBack.onError(paramInt, paramString);
      }
      return;
      if (paramInt == 6011)
      {
        MessageControlHost.access$000(this.this$0).sendEmptyMessage(267);
      }
      else if (paramInt == 80001)
      {
        ChatEntityHost localChatEntityHost = MessageControlHost.getChatEntity(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "你发的消息带敏感词汇!", "", "");
        Message localMessage = MessageControlHost.access$000(this.this$0).obtainMessage(260);
        localMessage.obj = localChatEntityHost;
        MessageControlHost.access$000(this.this$0).sendMessage(localMessage);
      }
    }
  }
  
  public void onSuccess(TIMMessage paramTIMMessage)
  {
    if (this.val$callBack != null) {
      this.val$callBack.onSuccess(paramTIMMessage);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */