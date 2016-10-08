package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.TIMCallBack;
import com.tencent.openqq.IMSdkInt;

class AVContextControl$3
  implements TIMCallBack
{
  AVContextControl$3(AVContextControl paramAVContextControl) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.e("ilvb", "AVContextControl login failed, imsdk error code  = " + paramInt + ", desc = " + paramString);
    AVContextControl.access$300(this.this$0, false, 0L, paramInt);
  }
  
  public void onSuccess()
  {
    Log.d("ilvb", "AVContextControl login successfully. tiny id = " + IMSdkInt.get().getTinyId());
    AVContextControl.access$300(this.this$0, true, IMSdkInt.get().getTinyId(), 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVContextControl$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */