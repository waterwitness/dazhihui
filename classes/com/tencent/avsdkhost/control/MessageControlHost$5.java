package com.tencent.avsdkhost.control;

import com.android.dazhihui.d.n;
import com.tencent.TIMMessage;
import com.tencent.TIMValueCallBack;

class MessageControlHost$5
  implements TIMValueCallBack<TIMMessage>
{
  MessageControlHost$5(MessageControlHost paramMessageControlHost) {}
  
  public void onError(int paramInt, String paramString)
  {
    n.f(MessageControlHost.access$100(), "ping error i=" + paramInt + " " + paramString);
  }
  
  public void onSuccess(TIMMessage paramTIMMessage)
  {
    n.f(MessageControlHost.access$100(), "ping Success");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */