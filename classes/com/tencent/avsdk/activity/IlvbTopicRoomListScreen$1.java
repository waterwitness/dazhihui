package com.tencent.avsdk.activity;

import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;

class IlvbTopicRoomListScreen$1
  implements Runnable
{
  IlvbTopicRoomListScreen$1(IlvbTopicRoomListScreen paramIlvbTopicRoomListScreen) {}
  
  public void run()
  {
    if (!IlvbTopicRoomListScreen.access$000(this.this$0))
    {
      if (IlvbTopicRoomListScreen.access$100(this.this$0) != null)
      {
        IlvbTopicRoomListScreen.access$100(this.this$0).a(false, 2);
        IlvbTopicRoomListScreen.access$100(this.this$0).b();
      }
      IlvbTopicRoomListScreen.access$002(this.this$0, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbTopicRoomListScreen$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */