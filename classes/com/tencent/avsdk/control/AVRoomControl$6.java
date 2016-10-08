package com.tencent.avsdk.control;

import android.os.Handler;
import android.util.Log;
import com.tencent.TIMCallBack;
import java.lang.ref.WeakReference;

class AVRoomControl$6
  implements TIMCallBack
{
  AVRoomControl$6(AVRoomControl paramAVRoomControl) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.e("ilvb", "AVRoomControl Record error" + paramInt + " : " + paramString);
    if (AVRoomControl.access$400(this.this$0) < 5)
    {
      AVRoomControl.access$408(this.this$0);
      if (this.this$0.isContextOk())
      {
        paramString = (Handler)AVRoomControl.access$100(this.this$0).get();
        if (paramString != null) {
          paramString.sendEmptyMessageDelayed(311, 30000L);
        }
      }
      return;
    }
    Log.e("ilvb", "AVRoomControl Record error 到达最大尝试次数");
  }
  
  public void onSuccess()
  {
    Log.i("ilvb", "AVRoomControl Record start OK");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVRoomControl$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */