package com.tencent.avsdk.control;

import com.android.dazhihui.d.n;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;

class MessageControl$5
  implements TIMValueCallBack<TIMMessage>
{
  MessageControl$5(MessageControl paramMessageControl) {}
  
  public void onError(int paramInt, String paramString)
  {
    n.f(MessageControl.access$000(), "ping error i=" + paramInt + " " + paramString);
  }
  
  public void onSuccess(TIMMessage paramTIMMessage)
  {
    n.f(MessageControl.access$000(), "ping Success");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */