package com.tencent.av.sdk;

import android.util.Log;

public class AVVideoCtrl$SwitchCameraCompleteCallback
{
  static final String TAG = "SdkJni";
  
  protected void onComplete(int paramInt1, int paramInt2)
  {
    Log.d("SdkJni", "SwitchCameraCompleteCallback.OnComplete. result = " + paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVVideoCtrl$SwitchCameraCompleteCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */