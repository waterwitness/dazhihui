package com.tencent.avsdkhost.control;

import android.app.Activity;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.d.n;
import com.c.a.k;
import com.tencent.avsdk.Model.CustomRspMsgVo.CreateRoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.CreateRoomRsp;
import java.util.List;
import org.json.JSONObject;

class RoomControl$1
  implements i
{
  RoomControl$1(RoomControl paramRoomControl, Runnable paramRunnable, Activity paramActivity) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
      n.d("ilvb", "" + paramh);
      paramj = new JSONObject(paramh).optJSONObject("Data");
      paramj = (CustomRspMsgVo.CreateRoomRsp)new k().a(paramj.toString(), CustomRspMsgVo.CreateRoomRsp.class);
      if ((paramj != null) && (paramj.RepDataRoomInfo != null) && (paramj.RepDataRoomInfo.size() > 0))
      {
        this.this$0.mRoomId = Integer.parseInt(((CustomRspMsgVo.CreateRoomInfo)paramj.RepDataRoomInfo.get(0)).RoomId);
        this.this$0.mGroupId = String.valueOf(this.this$0.mRoomId);
        if (this.val$runnable != null) {
          this.val$runnable.run();
        }
        if (com.android.dazhihui.g.a().L()) {
          Toast.makeText(this.val$activity, "" + ((CustomRspMsgVo.CreateRoomInfo)paramj.RepDataRoomInfo.get(0)).RoomTopic, 1).show();
        }
      }
      else
      {
        n.d("ilvb", "" + paramh);
        this.this$0.showError(this.val$activity, "创建房间异常,请退出重试!");
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      this.this$0.showError(this.val$activity, "创建房间异常,请退出重试!");
    }
  }
  
  public void handleTimeout(h paramh)
  {
    this.this$0.showError(this.val$activity, "创建房间超时,请退出重试!");
  }
  
  public void netException(h paramh, Exception paramException)
  {
    this.this$0.showError(this.val$activity, "创建房间网络异常,请退出重试!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\RoomControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */