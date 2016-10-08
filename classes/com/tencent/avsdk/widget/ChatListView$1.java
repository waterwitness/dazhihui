package com.tencent.avsdk.widget;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class ChatListView$1
  implements AbsListView.OnScrollListener
{
  ChatListView$1(ChatListView paramChatListView) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt2 >= paramInt3)
    {
      ChatListView.access$002(this.this$0, true);
      this.this$0.hideUnreadView();
      return;
    }
    ChatListView.access$002(this.this$0, false);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatListView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */