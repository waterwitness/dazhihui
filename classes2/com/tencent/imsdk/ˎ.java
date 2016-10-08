package com.tencent.imsdk;

import com.tencent.TIMValueCallBack;
import com.tencent.qalsdk.QALValueCallBack;
import java.util.concurrent.ExecutorService;

final class ˎ
  implements QALValueCallBack
{
  ˎ(IMMsfCoreProxy paramIMMsfCoreProxy, TIMValueCallBack paramTIMValueCallBack, String paramString) {}
  
  public final void onError(int paramInt, String paramString)
  {
    if (paramInt == 1001)
    {
      this.a.onError(6012, "operation timeout: wait server rsp timeout or no network.");
      return;
    }
    this.a.onError(paramInt, paramString);
  }
  
  public final void onSuccess(byte[] paramArrayOfByte)
  {
    if ((this.b.equals("im_open_msg.msg_sync")) || (this.b.equals("group_open_svc.group_msg_get")) || (this.b.equals("Recentcontact.Get_PB")))
    {
      IMMsfCoreProxy.access$200(this.c).execute(new ˏ(this, paramArrayOfByte));
      return;
    }
    this.a.onSuccess(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ˎ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */