package com.tencent;

import com.tencent.imcore.IInit;

abstract class ᵢ
  extends IInit
{
  public TIMCallBack a;
  
  ᵢ(TIMCallBack paramTIMCallBack)
  {
    this.a = paramTIMCallBack;
    swigReleaseOwnership();
  }
  
  public abstract void a();
  
  public abstract void a(int paramInt, String paramString);
  
  public final void done()
  {
    a();
    swigTakeOwnership();
  }
  
  public final void fail(int paramInt, String paramString)
  {
    a(paramInt, paramString);
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ᵢ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */