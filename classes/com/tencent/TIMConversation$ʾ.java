package com.tencent;

import android.os.Handler;
import com.tencent.imcore.ISetReadMsg;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMConversation$ʾ
  extends ISetReadMsg
{
  public TIMCallBack a;
  
  public TIMConversation$ʾ(TIMConversation paramTIMConversation, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done()
  {
    IMMsfCoreProxy.mainHandler.post(new ʻʽ(this));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʻʾ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConversation$ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */