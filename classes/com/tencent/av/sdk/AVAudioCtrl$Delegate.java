package com.tencent.av.sdk;

import android.util.Log;

public class AVAudioCtrl$Delegate
{
  static final String TAG = "SdkJni";
  
  protected void onOutputModeChange(int paramInt)
  {
    Log.d("SdkJni", "onOutputModeChange outputMode = " + paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVAudioCtrl$Delegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */