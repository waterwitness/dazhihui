package com.tencent.avsdk.control;

import android.util.Log;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;

class MessageControl$8
  implements TIMValueCallBack<TIMMessage>
{
  MessageControl$8(MessageControl paramMessageControl, String paramString) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.i("xyfSend", this.val$message + "-->" + paramInt + "--->" + paramString);
  }
  
  public void onSuccess(TIMMessage paramTIMMessage)
  {
    Log.i("xyfSend", this.val$message + "-->发送成功");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */