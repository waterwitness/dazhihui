package com.tencent;

import android.os.Handler;
import com.tencent.imcore.IGetMsgs;
import com.tencent.imcore.MsgVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.List;

abstract class TIMConversation$ʼ
  extends IGetMsgs
{
  public TIMValueCallBack<List<TIMMessage>> a = null;
  
  TIMConversation$ʼ(TIMValueCallBack<List<TIMMessage>> paramTIMValueCallBack)
  {
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
    swigReleaseOwnership();
  }
  
  public final void done(MsgVec paramMsgVec)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramMsgVec == null)
    {
      QLog.i("MSF.C.IMConversation", 1, "getmsgs return null");
      IMMsfCoreProxy.mainHandler.post(new ⁱⁱ(this, localArrayList));
      swigTakeOwnership();
      return;
    }
    int i = 0;
    while (i < paramMsgVec.size())
    {
      TIMMessage localTIMMessage = new TIMMessage(paramMsgVec.get(i));
      if (localTIMMessage.getConversation().valid()) {
        localArrayList.add(localTIMMessage);
      }
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ﹳﹳ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public final void fail(int paramInt, String paramString)
  {
    QLog.e("MSF.C.IMConversation", 1, "getmsgs failed");
    IMMsfCoreProxy.mainHandler.post(new ٴٴ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConversation$ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */