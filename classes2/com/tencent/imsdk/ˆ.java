package com.tencent.imsdk;

import com.tencent.qalsdk.QALPushListener;
import java.util.concurrent.ExecutorService;

final class ˆ
  implements QALPushListener
{
  ˆ(IMMsfCoreProxy paramIMMsfCoreProxy) {}
  
  public final void onError(String paramString1, int paramInt, String paramString2)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "recv push cmd im_open_push.msg_push error, id: " + paramString1 + "|code:" + paramInt + "|desc: " + paramString2);
  }
  
  public final void onSuccess(String paramString, byte[] paramArrayOfByte)
  {
    IMMsfCoreProxy.access$200(this.a).execute(new ˈ(this, paramString, paramArrayOfByte));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */