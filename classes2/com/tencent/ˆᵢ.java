package com.tencent;

import com.tencent.imsdk.QLog;
import com.tencent.qalsdk.QALOffLineMsg;
import com.tencent.qalsdk.QALOfflinePushListener;

final class ˆᵢ
  implements QALOfflinePushListener
{
  ˆᵢ(TIMManager paramTIMManager, TIMOfflinePushListener paramTIMOfflinePushListener) {}
  
  public final void onPushMsg(QALOffLineMsg paramQALOffLineMsg)
  {
    QLog.d("imsdk.TIMManager", 1, "recv offline push");
    try
    {
      System.loadLibrary("_imcore_jni_gyp");
      if (this.a != null)
      {
        paramQALOffLineMsg = ProtobufParser.offlinePush2PushNotification(paramQALOffLineMsg.getBody());
        if (paramQALOffLineMsg != null) {
          this.a.handleNotification(paramQALOffLineMsg);
        }
      }
      return;
    }
    catch (UnsatisfiedLinkError paramQALOffLineMsg)
    {
      QLog.e("imsdk.TIMManager", 1, "Couldn't load _imcore_jni_gyp|UnsatisfiedLinkError|set mode 0");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆᵢ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */