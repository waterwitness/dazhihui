package tencent.tls.platform;

import tencent.tls.report.QLog;
import tencent.tls.request.SigInfo;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_global;
import tencent.tls.request.req_tgtgt_nopicsig;
import tencent.tls.tools.util;

class TLSHelper$2
  implements WorkThread.Worker
{
  TLSHelper$2(TLSHelper paramTLSHelper, req_global paramreq_global, String paramString, long paramLong, TLSUserInfo paramTLSUserInfo) {}
  
  public int work()
  {
    Object localObject1 = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("wtlogin login with GetStWithoutPasswd:user:" + this.val$userAccount + " dwSrcAppid:" + TLSHelper.access$100(this.this$0) + " dwDstAppid:" + this.val$dstAppid + " dwMainSigMap:" + TLSHelper.access$200(this.this$0) + " dwSubDstAppid:" + TLSHelper.access$300(this.this$0) + " Seq:" + this.val$thisG._seq + " ...");
    int i = util.get_saved_network_type(TLSHelper.access$400(this.this$0));
    req_global._network_type = util.get_network_type(TLSHelper.access$400(this.this$0));
    if (i != req_global._network_type)
    {
      util.set_net_retry_type(TLSHelper.access$400(this.this$0), 0);
      util.save_network_type(TLSHelper.access$400(this.this$0), req_global._network_type);
    }
    req_global._apn = util.get_apn_string(TLSHelper.access$400(this.this$0)).getBytes();
    this.val$userInfo.identifier = this.val$userAccount;
    Object localObject2 = this.val$thisG;
    Object localObject3 = this.val$userAccount;
    ((req_global)localObject2)._userid = ((String)localObject3);
    ((async_context)localObject1)._userid = ((String)localObject3);
    this.val$thisG._uin = 0L;
    ((async_context)localObject1)._tinyid = 0L;
    ((async_context)localObject1)._src_appid = TLSHelper.access$100(this.this$0);
    ((async_context)localObject1)._appid = this.val$dstAppid;
    ((async_context)localObject1)._sub_appid = TLSHelper.access$300(this.this$0);
    ((async_context)localObject1)._main_sigmap = TLSHelper.access$200(this.this$0);
    ((async_context)localObject1)._last_err_msg = new TLSErrInfo();
    long l = this.val$thisG.getTinyId(this.val$userAccount);
    if (l == 0L)
    {
      QLog.i("user:" + this.val$userAccount + " have not found uin record.");
      i = 64533;
    }
    for (;;)
    {
      this.val$thisG.close_connect();
      QLog.i("wtlogin login with GetStWithoutPasswd:user:" + this.val$userAccount + " dwSrcAppid:" + TLSHelper.access$100(this.this$0) + " dwDstAppid:" + this.val$dstAppid + " dwMainSigMap:0x" + Integer.toHexString(TLSHelper.access$200(this.this$0)) + " dwSubDstAppid:" + TLSHelper.access$300(this.this$0) + " Seq:" + this.val$thisG._seq + " ret=" + i, this.val$thisG._uin);
      return i;
      this.val$thisG._uin = l;
      localObject2 = TLSHelper.access$500(this.this$0, this.val$userAccount, TLSHelper.access$100(this.this$0));
      localObject3 = TLSHelper.access$600(this.this$0, this.val$userAccount, TLSHelper.access$100(this.this$0));
      if ((localObject2 != null) && (localObject2.length > 0) && (localObject3 != null) && (localObject3.length > 0))
      {
        QLog.i("user:" + this.val$userAccount + " exchange A2 from A1.", this.val$thisG._uin);
        ((async_context)localObject1)._tmp_pwd = ((byte[])localObject2);
        ((async_context)localObject1)._tmp_no_pic_sig = ((byte[])localObject3);
      }
      for (int j = new req_tgtgt_nopicsig(this.val$thisG).make_request(this.val$dstAppid, 1, this.val$thisG._uin, 0, req_global._ip_addr, (byte[])localObject2, (byte[])localObject3, TLSHelper.access$700(this.this$0), TLSHelper.access$800(this.this$0), null, TLSHelper.access$200(this.this$0), TLSHelper.access$300(this.this$0), 1, req_global._pic_type, 0, 0, 1, TLSHelper.access$100(this.this$0), this.val$userInfo);; j = 64532)
      {
        i = j;
        if (j != 0) {
          break;
        }
        localObject1 = this.val$thisG.get_siginfo(l, this.val$dstAppid);
        if (localObject1 != null) {
          break label700;
        }
        i = 64532;
        break;
      }
      label700:
      this.val$userInfo.get_clone((SigInfo)localObject1);
      i = j;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */