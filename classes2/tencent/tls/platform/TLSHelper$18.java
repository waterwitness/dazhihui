package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.TransReqContext;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.req_global;
import tencent.tls.request.req_transport;

class TLSHelper$18
  implements WorkThread.Worker
{
  TLSHelper$18(TLSHelper paramTLSHelper, String paramString, long paramLong, req_global paramreq_global, TransReqContext paramTransReqContext, TLSUserInfo paramTLSUserInfo) {}
  
  public int work()
  {
    QLog.i("user:" + this.val$identifier + " sdkAppid:" + TLSHelper.access$100(this.this$0) + " role:" + this.val$role + " Seq:" + this.val$thisG._seq + " RequestTransport...");
    this.val$thisG._userid = this.val$identifier;
    int i = new req_transport(this.val$thisG).make_request(0L, this.val$req_context, null, null, TLSHelper.access$100(this.this$0), this.val$role, this.val$userInfo);
    this.val$thisG.close_transport_connect();
    QLog.i("user:" + this.val$identifier + " sdkAppid:" + TLSHelper.access$100(this.this$0) + " role:" + this.val$role + " Seq:" + this.val$thisG._seq + " RequestTransport ret=" + i);
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */