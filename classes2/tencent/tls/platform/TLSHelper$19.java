package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.TransReqContext;
import tencent.tls.request.WorkThread.When;
import tencent.tls.request.req_global;

class TLSHelper$19
  implements WorkThread.When
{
  TLSHelper$19(TLSHelper paramTLSHelper, TransReqContext paramTransReqContext, TLSUserInfo paramTLSUserInfo, req_global paramreq_global, String paramString1, int paramInt, String paramString2) {}
  
  public void done(int paramInt)
  {
    int i = this.val$req_context.get_subcmd();
    if (this.val$req_context.is_register_req())
    {
      TLSHelper.access$1500(this.this$0, this.val$req_context, this.val$userInfo, paramInt);
      return;
    }
    if (i == 1538)
    {
      TLSHelper.access$1600(this.this$0, this.val$req_context, paramInt);
      return;
    }
    if (i == 1537)
    {
      TLSHelper.access$1700(this.this$0, this.val$req_context, paramInt);
      return;
    }
    if (i == 2571)
    {
      TLSHelper.access$1800(this.this$0, this.val$req_context, this.val$thisG, this.val$appidAt3rd, this.val$accountType, this.val$usersig, paramInt);
      return;
    }
    if (i == 1155)
    {
      TLSHelper.access$1900(this.this$0, this.val$req_context, paramInt);
      return;
    }
    QLog.i("命令字不一致!");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$19.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */