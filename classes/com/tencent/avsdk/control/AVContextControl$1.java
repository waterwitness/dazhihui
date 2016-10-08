package com.tencent.avsdk.control;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.tencent.av.sdk.AVContext.StartCallback;

class AVContextControl$1
  implements AVContext.StartCallback
{
  AVContextControl$1(AVContextControl paramAVContextControl) {}
  
  public void OnComplete(int paramInt)
  {
    Log.d("ilvb", "AVContextControl mStartContextCompleteCallback.OnComplete result = " + paramInt);
    AVContextControl.access$000(this.this$0).sendBroadcast(new Intent("com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE").putExtra("av_error_result", paramInt));
    if (paramInt != 0)
    {
      AVContextControl.access$102(this.this$0, null);
      Log.e("ilvb", "AVContextControl mStartContextCompleteCallback mAVContext is null");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVContextControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */