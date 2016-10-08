package com.tencent.avsdkhost.widget;

import android.view.View;
import android.view.View.OnClickListener;

class ChatListViewHost$2
  implements View.OnClickListener
{
  ChatListViewHost$2(ChatListViewHost paramChatListViewHost) {}
  
  public void onClick(View paramView)
  {
    if (this.this$0.getCount() > 1)
    {
      this.this$0.hideUnreadView();
      this.this$0.setSelection(this.this$0.getCount() - 1);
      ChatListViewHost.access$002(this.this$0, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\ChatListViewHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */