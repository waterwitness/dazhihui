package com.tencent.avsdk.activity;

import android.text.TextUtils;
import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class IlvbTopicRoomListScreen$3
  implements b
{
  IlvbTopicRoomListScreen$3(IlvbTopicRoomListScreen paramIlvbTopicRoomListScreen) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (!TextUtils.isEmpty(IlvbTopicRoomListScreen.access$200(this.this$0))) {
      IlvbTopicRoomListScreen.access$400(this.this$0, IlvbTopicRoomListScreen.access$200(this.this$0), IlvbTopicRoomListScreen.access$300(this.this$0), true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbTopicRoomListScreen$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */