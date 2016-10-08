package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.request.req_imgcode_reask;

class TLSHelper$12
  implements WorkThread.Worker
{
  TLSHelper$12(TLSHelper paramTLSHelper, req_global paramreq_global) {}
  
  public int work()
  {
    Object localObject = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("user:" + this.val$thisG._userid + " Seq:" + this.val$thisG._seq + " TLSPwdLoginReaskImgcode ...");
    this.val$thisG._userid = ((async_context)localObject)._userid;
    this.val$thisG._uin = ((async_context)localObject)._tinyid;
    ((async_context)localObject)._last_err_msg = new TLSErrInfo();
    int i = new req_imgcode_reask(this.val$thisG).make_request();
    StringBuilder localStringBuilder = new StringBuilder().append("user:").append(this.val$thisG._userid).append(" Seq:").append(this.val$thisG._seq).append(" TLSPwdLoginReaskImgcode ret=");
    if (i > 0) {}
    for (localObject = Integer.toHexString(i);; localObject = Integer.valueOf(i))
    {
      QLog.i(localObject);
      return i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */