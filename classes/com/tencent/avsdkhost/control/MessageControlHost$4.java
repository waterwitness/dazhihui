package com.tencent.avsdkhost.control;

import com.tencent.TIMConversation;
import com.tencent.TIMMessage;
import com.tencent.TIMMessageListener;
import java.util.List;

class MessageControlHost$4
  implements TIMMessageListener
{
  MessageControlHost$4(MessageControlHost paramMessageControlHost) {}
  
  public boolean onNewMessages(List<TIMMessage> paramList)
  {
    if ((paramList == null) || (MessageControlHost.access$000(this.this$0) == null)) {
      return false;
    }
    if (paramList.size() > 0) {
      MessageControlHost.access$200(this.this$0).setReadMessage((TIMMessage)paramList.get(0));
    }
    MessageControlHost.access$300(this.this$0, paramList);
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */