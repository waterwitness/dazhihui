package com.tencent;

import com.tencent.imsdk.QLog;

final class ˆᵎ
  implements IMFunc.RequestListener
{
  ˆᵎ(TIMManager paramTIMManager, String paramString) {}
  
  public final void onFail(String paramString)
  {
    QLog.e("imsdk.TIMManager", 1, "uploadLogFile->failed: " + this.a + "|" + paramString);
  }
  
  public final void onSuccess(byte[] paramArrayOfByte)
  {
    QLog.i("imsdk.TIMManager", 1, "uploadLogFile->success: " + this.a + "/" + TIMManager.access$000(this.b));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆᵎ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */