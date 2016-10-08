package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.TIMCallBack;

class AVRoomControl$5
  implements TIMCallBack
{
  AVRoomControl$5(AVRoomControl paramAVRoomControl) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.e("ilvb", "AVRoomControl push stop error " + paramInt + " : " + paramString);
  }
  
  public void onSuccess()
  {
    Log.i("ilvb", "AVRoomControl push stop OK");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */