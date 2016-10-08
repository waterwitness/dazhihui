package com.tencent;

import com.tencent.imcore.IGroupNotifyCallback;

abstract class TIMGroupSystemElem$ʻ
  extends IGroupNotifyCallback
{
  public TIMCallBack a;
  
  public TIMGroupSystemElem$ʻ(TIMGroupSystemElem paramTIMGroupSystemElem, TIMCallBack paramTIMCallBack)
  {
    swigReleaseOwnership();
    this.a = paramTIMCallBack;
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public void done()
  {
    a();
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    a(paramInt, paramString);
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupSystemElem$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */