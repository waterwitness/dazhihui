package com.tencent.avsdk.activity;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.avsdk.LiveVideoInfo;

class IlvbTopicRoomListScreen$5
  implements AdapterView.OnItemClickListener
{
  IlvbTopicRoomListScreen$5(IlvbTopicRoomListScreen paramIlvbTopicRoomListScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (LiveVideoInfo)paramAdapterView.getAdapter().getItem(paramInt);
    int i = Integer.parseInt(paramView.getRoomId());
    String str1 = paramView.getOwnerAccount();
    String str2 = paramView.getRoomImg();
    String str3 = paramView.getTLSIMId();
    String str4 = paramView.getRoomShareUrl();
    int j = paramView.getPV();
    if ("app_dzh".equals("app_dzh")) {}
    for (paramAdapterView = "disc";; paramAdapterView = "48")
    {
      AvGuestActivity.startAvGuestActivity(IlvbTopicRoomListScreen.access$600(this.this$0), paramInt, this.this$0, false, i, str1, str2, str4, j, str3, paramAdapterView, paramView.getRoomStatus());
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbTopicRoomListScreen$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */