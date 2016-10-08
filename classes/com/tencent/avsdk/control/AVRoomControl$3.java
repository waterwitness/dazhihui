package com.tencent.avsdk.control;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.dazhihui.g;
import com.tencent.av.sdk.AVRoomMulti.Delegate;
import com.tencent.avsdk.UserilvbManager;
import java.lang.ref.WeakReference;

class AVRoomControl$3
  implements AVRoomMulti.Delegate
{
  AVRoomControl$3(AVRoomControl paramAVRoomControl) {}
  
  public void OnPrivilegeDiffNotify(int paramInt)
  {
    Log.d("ilvb", "AVRoomControl mRoomDelegate.OnPrivilegeDiffNotify privilege = " + paramInt);
  }
  
  public void OnSemiAutoRecvCameraVideo(String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder().append("AVRoomControl mRoomDelegate.OnSemiAutoRecvCameraVideo. identifier count = ");
    if (paramArrayOfString != null) {}
    for (int i = paramArrayOfString.length;; i = -1)
    {
      Log.d("ilvb", i);
      return;
    }
  }
  
  public void onEndpointsUpdateInfo(int paramInt, String[] paramArrayOfString)
  {
    if (!this.this$0.isContextOk()) {
      return;
    }
    String str;
    switch (paramInt)
    {
    default: 
      str = "未知事件";
      paramInt = -1;
    }
    Object localObject;
    for (;;)
    {
      if (paramInt != -1)
      {
        localObject = (Handler)AVRoomControl.access$100(this.this$0).get();
        if (localObject != null) {
          ((Handler)localObject).obtainMessage(paramInt).sendToTarget();
        }
      }
      if (!g.a().L()) {
        break;
      }
      localObject = new StringBuilder();
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
        break label231;
      }
      int i = paramArrayOfString.length;
      paramInt = 0;
      while (paramInt < i)
      {
        ((StringBuilder)localObject).append(paramArrayOfString[paramInt]).append(" | ");
        paramInt += 1;
      }
      str = "进入房间事件";
      paramInt = -1;
      continue;
      str = "退出房间事件";
      paramInt = -1;
      continue;
      str = "有发摄像头视频事件";
      paramInt = 343;
      continue;
      str = "无发摄像头视频事件";
      paramInt = 344;
      continue;
      str = "有发语音事件";
      paramInt = -1;
      continue;
      str = "无发语音事件";
      paramInt = -1;
      continue;
      str = "有发屏幕视频事件";
      paramInt = 347;
      continue;
      str = "无发屏幕视频事件";
      paramInt = 348;
    }
    label231:
    Log.d("ilvb", "AVRoomControl mRoomDelegate.onEndpointsUpdateInfo event = " + str + " strings=" + ((StringBuilder)localObject).toString());
  }
  
  public void onEnterRoomComplete(int paramInt)
  {
    Log.d("ilvb", "AVRoomControl mRoomDelegate.onEnterRoomComplete result = " + paramInt);
    if (paramInt == 0)
    {
      AVRoomControl.initAudioService();
      AVRoomControl.access$002(this.this$0, AVRoomControl.RoomState.ROOM_ENTER_OK);
      if (!UserilvbManager.getInstance().mAvPrepareNormal) {
        break label113;
      }
      if (this.this$0.isContextOk()) {
        break label77;
      }
    }
    label77:
    do
    {
      return;
      AVRoomControl.access$002(this.this$0, AVRoomControl.RoomState.ROOM_ENTER_FAIL);
      break;
      localObject = (Handler)AVRoomControl.access$100(this.this$0).get();
    } while (localObject == null);
    Object localObject = ((Handler)localObject).obtainMessage(339);
    ((Message)localObject).arg1 = paramInt;
    ((Message)localObject).sendToTarget();
    return;
    label113:
    UserilvbManager.getInstance().mAvPrepareNormal = true;
    Log.e("ilvb", "AVRoomControl 已经后台进入房间， loading时候用户退出，需要做个exitRoom操作");
    this.this$0.exitRoom();
  }
  
  public void onExitRoomComplete(int paramInt)
  {
    
    if (paramInt == 0)
    {
      AVRoomControl.access$002(this.this$0, AVRoomControl.RoomState.ROOM_EXIT_OK);
      Log.d("ilvb", "AVRoomControl mRoomDelegate.onExitRoomComplete result = " + paramInt);
      if (this.this$0.isContextOk()) {
        break label68;
      }
    }
    label68:
    do
    {
      return;
      AVRoomControl.access$002(this.this$0, AVRoomControl.RoomState.ROOM_EXIT_FAIL);
      break;
      localObject = (Handler)AVRoomControl.access$100(this.this$0).get();
    } while (localObject == null);
    Object localObject = ((Handler)localObject).obtainMessage(340);
    ((Message)localObject).arg1 = paramInt;
    ((Message)localObject).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */