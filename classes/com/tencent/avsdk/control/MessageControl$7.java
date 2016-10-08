package com.tencent.avsdk.control;

import android.os.Handler;
import android.os.Message;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.ChatEntity.ChatGuestType;

class MessageControl$7
  implements TIMValueCallBack<TIMMessage>
{
  MessageControl$7(MessageControl paramMessageControl, TIMValueCallBack paramTIMValueCallBack) {}
  
  public void onError(int paramInt, String paramString)
  {
    if (paramInt == 85) {
      MessageControl.access$100(this.this$0).sendEmptyMessage(266);
    }
    for (;;)
    {
      if (this.val$callBack != null) {
        this.val$callBack.onError(paramInt, paramString);
      }
      return;
      if (paramInt == 6011)
      {
        MessageControl.access$100(this.this$0).sendEmptyMessage(267);
      }
      else if (paramInt == 80001)
      {
        ChatEntity localChatEntity = MessageControl.getChatEntity(ChatEntity.ChatGuestType.CHAT_ERROR, "", "你发的消息带敏感词汇!", "", "");
        Message localMessage = MessageControl.access$100(this.this$0).obtainMessage(260);
        localMessage.obj = localChatEntity;
        MessageControl.access$100(this.this$0).sendMessage(localMessage);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */