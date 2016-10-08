package com.tencent.imsdk;

import com.tencent.TIMConnListener;
import com.tencent.TIMManager;
import com.tencent.TIMNetworkStatus;
import com.tencent.qalsdk.QALConnListener;
import com.tencent.timint.TIMIntManager;

final class ʾ
  implements QALConnListener
{
  ʾ(IMMsfCoreProxy paramIMMsfCoreProxy) {}
  
  public final void onConnected()
  {
    IMMsfCoreProxy.access$002(this.a, TIMNetworkStatus.TIM_NETWORK_STATUS_CONNECTED);
    if (TIMManager.getInstance().getConnectionListener() != null) {
      TIMManager.getInstance().getConnectionListener().onConnected();
    }
    if (TIMIntManager.getInstance().getConnectionListener() != null) {
      TIMIntManager.getInstance().getConnectionListener().onConnected();
    }
    QLog.i("imsdk.IMMsfCoreProxy", 1, "onConnected");
  }
  
  public final void onDisconnected(int paramInt, String paramString)
  {
    IMMsfCoreProxy.access$002(this.a, TIMNetworkStatus.TIM_NETWORK_STATUS_DISCONNECTED);
    if (TIMManager.getInstance().getConnectionListener() != null) {
      TIMManager.getInstance().getConnectionListener().onDisconnected(0, "");
    }
    if (TIMIntManager.getInstance().getConnectionListener() != null) {
      TIMIntManager.getInstance().getConnectionListener().onDisconnected(0, "");
    }
    QLog.e("imsdk.IMMsfCoreProxy", 1, "onDisconnected, code:" + paramInt + "|desc:" + paramString);
  }
  
  public final void onWifiNeedAuth(String paramString)
  {
    if (TIMManager.getInstance().getConnectionListener() != null) {
      TIMManager.getInstance().getConnectionListener().onWifiNeedAuth(paramString);
    }
    if (TIMIntManager.getInstance().getConnectionListener() != null) {
      TIMIntManager.getInstance().getConnectionListener().onWifiNeedAuth(paramString);
    }
    QLog.i("imsdk.IMMsfCoreProxy", 1, "onWifiNeedAuth, desc: " + paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */