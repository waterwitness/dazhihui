package com.tencent.avsdkhost.control;

import android.util.Log;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;

class MessageControlHost$8
  implements TIMValueCallBack<TIMMessage>
{
  MessageControlHost$8(MessageControlHost paramMessageControlHost, String paramString) {}
  
  public void onError(int paramInt, String paramString)
  {
    Log.i("xyfSend", this.val$message + "-->" + paramInt + "--->" + paramString);
  }
  
  public void onSuccess(TIMMessage paramTIMMessage)
  {
    Log.i("xyfSend", this.val$message + "-->发送成功");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */