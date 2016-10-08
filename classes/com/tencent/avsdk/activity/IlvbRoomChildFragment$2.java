package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.tencent.avsdk.LiveVideoInfo;
import com.tencent.avsdk.LiveVideoRecycleViewAdapter;
import com.tencent.avsdk.LiveVideoRecycleViewAdapter.OnRecyclerViewListener;

class IlvbRoomChildFragment$2
  implements LiveVideoRecycleViewAdapter.OnRecyclerViewListener
{
  IlvbRoomChildFragment$2(IlvbRoomChildFragment paramIlvbRoomChildFragment) {}
  
  public void onItemClick(View paramView, int paramInt)
  {
    Object localObject = IlvbRoomChildFragment.access$000(this.this$0).getItem(paramInt);
    int i = Integer.parseInt(((LiveVideoInfo)localObject).getRoomId());
    String str2 = ((LiveVideoInfo)localObject).getOwnerAccount();
    String str3 = ((LiveVideoInfo)localObject).getRoomImg();
    String str4 = ((LiveVideoInfo)localObject).getTLSIMId();
    String str1 = ((LiveVideoInfo)localObject).getRoomShareUrl();
    int j = ((LiveVideoInfo)localObject).getPV();
    if (((LiveVideoInfo)localObject).getRoomStatus().equals("1"))
    {
      if ("app_dzh".equals("app_dzh")) {}
      for (paramView = "disc";; paramView = "48")
      {
        AvGuestActivity.startAvGuestActivity(IlvbRoomChildFragment.access$100(this.this$0), paramInt, this.this$0.getActivity(), false, i, str2, str3, str1, j, str4, paramView, ((LiveVideoInfo)localObject).getRoomStatus());
        return;
      }
    }
    if (str1 != null)
    {
      paramView = new Intent();
      localObject = new Bundle();
      ((Bundle)localObject).putString("nexturl", str1 + "&formPlant=1");
      ((Bundle)localObject).putString("names", "主页");
      paramView.putExtras((Bundle)localObject);
      paramView.setClass(this.this$0.getActivity(), BrowserActivity.class);
      this.this$0.getActivity().startActivity(paramView);
      return;
    }
    Toast.makeText(this.this$0.getActivity(), "房间信息获取失败", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbRoomChildFragment$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */