package com.tencent;

import com.tencent.imsdk.QLog;

final class ˆᵔ
  extends ᵢ
{
  ˆᵔ(TIMManager paramTIMManager, TIMCallBack paramTIMCallBack)
  {
    super(paramTIMCallBack);
  }
  
  public final void a()
  {
    QLog.e("imsdk.TIMManager", 1, "initStorage succ");
    IMCoreWrapper.get().setReady(true);
    if (this.a == null) {
      return;
    }
    this.a.onSuccess();
  }
  
  public final void a(int paramInt, String paramString)
  {
    QLog.e("imsdk.TIMManager", 1, "initStorage failed|code: " + paramInt + " desc: " + paramString);
    if (this.a == null) {
      return;
    }
    this.a.onError(paramInt, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆᵔ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */