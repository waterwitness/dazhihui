package com.tencent.avsdkhost;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

class ChatMsgGuestListAdapterHost$1
  implements View.OnClickListener
{
  ChatMsgGuestListAdapterHost$1(ChatMsgGuestListAdapterHost paramChatMsgGuestListAdapterHost) {}
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof ChatMsgGuestListAdapterHost.ViewHolder)))
    {
      paramView = (ChatMsgGuestListAdapterHost.ViewHolder)paramView.getTag();
      if (paramView != null) {
        this.this$0.showZhuYe(paramView.userAccount);
      }
    }
    else
    {
      return;
    }
    Log.e(ChatMsgGuestListAdapterHost.access$000(), "消息列表点击用户错误!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */