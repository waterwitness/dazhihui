package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.av.sdk.AVContext.StopCallback;

class AVContextControl$2
  implements AVContext.StopCallback
{
  AVContextControl$2(AVContextControl paramAVContextControl) {}
  
  public void OnComplete()
  {
    AVContextControl.access$200(this.this$0);
    Log.d("ilvb", "AVContextControl mStopContextCompleteCallback.OnComplete");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVContextControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */