package com.tencent.imsdk;

import com.tencent.TIMCallBack;
import com.tencent.TIMManager;
import com.tencent.TIMUser;
import com.tencent.qalsdk.QALCallBack;
import com.tencent.qalsdk.QALSDKManager;
import com.tencent.statistics.BeaconEvents;
import com.tencent.statistics.BeaconUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tencent.tls.platform.TLSErrInfo;
import tencent.tls.platform.TLSExchangeTicketListener;
import tencent.tls.platform.TLSLoginHelper;
import tencent.tls.platform.TLSUserInfo;

final class ـ
  implements TLSExchangeTicketListener
{
  ـ(IMMsfCoreProxy paramIMMsfCoreProxy, TIMUser paramTIMUser, IMMsfUserInfo paramIMMsfUserInfo, QALCallBack paramQALCallBack, TIMCallBack paramTIMCallBack) {}
  
  public final void OnExchangeTicketFail(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|2-Ticket|Fail|OnExchangeTicketFail|code: " + paramTLSErrInfo.ErrCode + " desc: " + paramTLSErrInfo.Msg);
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "OnExchangeTicketFail|code: " + paramTLSErrInfo.ErrCode + " desc: " + paramTLSErrInfo.Msg);
    BeaconUtil.onEvent(BeaconEvents.loginEvent, false, -1L, -1L, localHashMap, false);
    IMMsfCoreProxy.errorOnMainThread(this.d, paramTLSErrInfo.ErrCode, paramTLSErrInfo.Msg);
  }
  
  public final void OnExchangeTicketSuccess(TLSUserInfo paramTLSUserInfo)
  {
    try
    {
      Map localMap = TLSLoginHelper.getInstance().getSSOTicket(this.a.getIdentifier());
      this.b.setTinyid(((Long)localMap.get("tinyID")).longValue());
      QLog.w("imsdk.IMMsfCoreProxy", 1, "IMMsfCoreProxy|login update id:" + this.a.getIdentifier() + "/" + localMap.get("identifier").toString());
      TIMManager localTIMManager = TIMManager.getInstanceById(this.a.getIdentifier());
      this.a.setIdentifier(localMap.get("identifier").toString());
      IMMsfCoreProxy.access$400(this.e).put(this.a.getIdentifier(), this.b);
      localTIMManager.setIdentification(this.a.getIdentifier(), false);
      QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|2-Ticket|Succ|OnExchangeTicketSuccess, tinyid:" + this.b.getTinyid());
      QALSDKManager.getInstance().bindID(paramTLSUserInfo.identifier, this.c);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public final void OnExchangeTicketTimeout(TLSErrInfo paramTLSErrInfo)
  {
    QLog.e("imsdk.IMMsfCoreProxy", 1, "Login|2-Ticket|Fail|OnExchangeTicketTimeout|code:" + paramTLSErrInfo.ErrCode + " desc: " + paramTLSErrInfo.Msg);
    HashMap localHashMap = new HashMap();
    localHashMap.put("param_FailCode", "OnExchangeTicketTimeout|code: " + paramTLSErrInfo.ErrCode + " desc: " + paramTLSErrInfo.Msg);
    BeaconUtil.onEvent(BeaconEvents.loginEvent, false, -1L, -1L, localHashMap, false);
    IMMsfCoreProxy.errorOnMainThread(this.d, 6012, "operation timeout: wait server rsp timeout or no network.");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ـ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */