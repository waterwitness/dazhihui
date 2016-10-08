package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.request.req_smslogin_verify;
import tencent.tls.tools.util;

class TLSHelper$14
  implements WorkThread.Worker
{
  TLSHelper$14(TLSHelper paramTLSHelper, req_global paramreq_global, String paramString, TLSUserInfo paramTLSUserInfo) {}
  
  public int work()
  {
    async_context localasync_context = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("user:" + this.val$thisG._userid + " code:" + this.val$code + " Seq:" + this.val$thisG._seq + " TLSSmsLoginVerifyCode ...");
    localasync_context._last_err_msg = new TLSErrInfo();
    localasync_context._mpasswd = util.get_mpasswd();
    int i = new req_smslogin_verify(this.val$thisG).make_request(this.val$code, TLSHelper.access$700(this.this$0), TLSHelper.access$800(this.this$0), null, this.val$userInfo);
    QLog.i("user:" + this.val$thisG._userid + " code:" + this.val$code + " Seq:" + this.val$thisG._seq + " TLSSmsLoginVerifyCode ret=" + Integer.toHexString(i));
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */