package com.tencent.imsdk;

import com.tencent.TIMValueCallBack;
import com.tencent.openqq.IMCmdListener;
import com.tencent.openqq.IMError;

final class ˑ
  implements TIMValueCallBack<byte[]>
{
  ˑ(IMMsfCoreProxy paramIMMsfCoreProxy, IMCmdListener paramIMCmdListener) {}
  
  public final void onError(int paramInt, String paramString)
  {
    this.a.onError(IMError.FAIL, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ˑ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */