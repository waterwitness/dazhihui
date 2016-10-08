package com.tencent.avsdk.control;

import com.tencent.TIMConversation;
import com.tencent.TIMMessage;
import com.tencent.TIMMessageListener;
import java.util.List;

class MessageControl$4
  implements TIMMessageListener
{
  MessageControl$4(MessageControl paramMessageControl) {}
  
  public boolean onNewMessages(List<TIMMessage> paramList)
  {
    if ((paramList == null) || (MessageControl.access$100(this.this$0) == null)) {
      return false;
    }
    if (paramList.size() > 0) {
      MessageControl.access$200(this.this$0).setReadMessage((TIMMessage)paramList.get(0));
    }
    MessageControl.access$300(this.this$0, paramList);
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */