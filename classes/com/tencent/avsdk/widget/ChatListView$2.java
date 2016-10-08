package com.tencent.avsdk.widget;

import android.view.View;
import android.view.View.OnClickListener;

class ChatListView$2
  implements View.OnClickListener
{
  ChatListView$2(ChatListView paramChatListView) {}
  
  public void onClick(View paramView)
  {
    if (this.this$0.getCount() > 1)
    {
      ChatListView.access$002(this.this$0, true);
      ChatListView.access$102(this.this$0, true);
      this.this$0.hideUnreadView();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatListView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */