package com.tencent.avsdkhost;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class ChatMsgGuestListAdapterHost$3
  implements View.OnClickListener
{
  ChatMsgGuestListAdapterHost$3(ChatMsgGuestListAdapterHost paramChatMsgGuestListAdapterHost, String paramString) {}
  
  public void onClick(View paramView)
  {
    paramView = ChatMsgGuestListAdapterHost.access$200(this.this$0).obtainMessage(19);
    paramView.obj = this.val$userAccount;
    ChatMsgGuestListAdapterHost.access$200(this.this$0).sendMessage(paramView);
    if ((ChatMsgGuestListAdapterHost.access$300(this.this$0) != null) && (ChatMsgGuestListAdapterHost.access$300(this.this$0).isShowing())) {
      ChatMsgGuestListAdapterHost.access$300(this.this$0).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\ChatMsgGuestListAdapterHost$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */