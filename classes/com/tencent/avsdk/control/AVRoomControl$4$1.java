package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.avsdkhost.control.RoomControl.CallBack;

class AVRoomControl$4$1
  implements RoomControl.CallBack
{
  AVRoomControl$4$1(AVRoomControl.4 param4) {}
  
  public void onCallBack(boolean paramBoolean, String paramString)
  {
    Log.i("ilvb", "AVRoomControl web hls return=" + paramBoolean + "\n" + paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */