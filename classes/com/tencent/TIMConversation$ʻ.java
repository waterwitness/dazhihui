package com.tencent;

import android.os.Handler;
import com.tencent.imcore.IDeleteLocalMsg;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMConversation$ʻ
  extends IDeleteLocalMsg
{
  public TIMCallBack a;
  
  public TIMConversation$ʻ(TIMConversation paramTIMConversation, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done()
  {
    IMMsfCoreProxy.mainHandler.post(new ᵎᵎ(this));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ᵢᵢ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConversation$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */