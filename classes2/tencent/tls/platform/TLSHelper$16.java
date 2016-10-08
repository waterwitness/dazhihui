package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.request.req_imgcode_verify;

class TLSHelper$16
  implements WorkThread.Worker
{
  TLSHelper$16(TLSHelper paramTLSHelper, req_global paramreq_global, TLSUserInfo paramTLSUserInfo, String paramString) {}
  
  public int work()
  {
    Object localObject1 = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("user:" + this.val$thisG._userid + " Seq:" + this.val$thisG._seq + " TLSPwdLoginVerifyImgcode ...");
    Object localObject2 = this.val$userInfo;
    req_global localreq_global = this.val$thisG;
    String str = ((async_context)localObject1)._userid;
    localreq_global._userid = str;
    ((TLSUserInfo)localObject2).identifier = str;
    this.val$thisG._uin = ((async_context)localObject1)._tinyid;
    ((async_context)localObject1)._last_err_msg = new TLSErrInfo();
    int i = new req_imgcode_verify(this.val$thisG).make_request(this.val$imgCode);
    localObject2 = new StringBuilder().append("user:").append(this.val$thisG._userid).append(" Seq:").append(this.val$thisG._seq).append(" TLSPwdLoginVerifyImgcode ret=");
    if (i > 0) {}
    for (localObject1 = Integer.toHexString(i);; localObject1 = Integer.valueOf(i))
    {
      QLog.i(localObject1);
      return i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */