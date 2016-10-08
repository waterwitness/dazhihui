package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.av.sdk.AVEndpoint.CancelAllViewCompleteCallback;

final class AVRoomControl$2
  extends AVEndpoint.CancelAllViewCompleteCallback
{
  protected void OnComplete(int paramInt)
  {
    Log.d("ilvb", "AvGuestActivity CancelAllViewCompleteCallback.OnComplete 取消画面 result=" + paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */