package com.tencent.avsdk.control;

import android.os.Handler;
import android.util.Log;
import com.tencent.TIMCallBack;

class MessageControl$1
  implements TIMCallBack
{
  MessageControl$1(MessageControl paramMessageControl, TIMCallBack paramTIMCallBack) {}
  
  public void onError(int paramInt, String paramString)
  {
    if (this.val$timCallBack != null) {
      this.val$timCallBack.onError(paramInt, paramString);
    }
    Log.e(MessageControl.access$000(), "加群失败,失败原因：" + paramInt + ":" + paramString);
  }
  
  public void onSuccess()
  {
    Log.d(MessageControl.access$000(), "initJoinGroup 加群成功");
    if (this.val$timCallBack != null) {
      this.val$timCallBack.onSuccess();
    }
    if (MessageControl.access$100(this.this$0) != null) {
      MessageControl.access$100(this.this$0).sendEmptyMessage(293);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */