package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.request.req_smslogin_reask;

class TLSHelper$10
  implements WorkThread.Worker
{
  TLSHelper$10(TLSHelper paramTLSHelper, req_global paramreq_global, String paramString, TLSUserInfo paramTLSUserInfo) {}
  
  public int work()
  {
    Object localObject = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("user:" + this.val$mobile + " Seq:" + this.val$thisG._seq + " TLSSmsLoginReaskCode ...");
    this.val$thisG._userid = this.val$mobile;
    ((async_context)localObject)._last_err_msg = new TLSErrInfo();
    int i = new req_smslogin_reask(this.val$thisG).make_request(TLSHelper.access$700(this.this$0), TLSHelper.access$800(this.this$0), null, this.val$userInfo);
    StringBuilder localStringBuilder = new StringBuilder().append("user:").append(this.val$thisG._userid).append(" Seq:").append(this.val$thisG._seq).append(" TLSSmsLoginReaskCode ret=");
    if (i > 0) {}
    for (localObject = Integer.toHexString(i);; localObject = Integer.valueOf(i))
    {
      QLog.i(localObject);
      return i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */