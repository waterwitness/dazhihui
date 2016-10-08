package com.tencent.avsdkhost;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class ChatMsgGuestListAdapterHost$4
  implements View.OnClickListener
{
  ChatMsgGuestListAdapterHost$4(ChatMsgGuestListAdapterHost paramChatMsgGuestListAdapterHost, String paramString) {}
  
  public void onClick(View paramView)
  {
    this.this$0.showZhuYe(this.val$userAccount);
    if ((ChatMsgGuestListAdapterHost.access$300(this.this$0) != null) && (ChatMsgGuestListAdapterHost.access$300(this.this$0).isShowing())) {
      ChatMsgGuestListAdapterHost.access$300(this.this$0).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */