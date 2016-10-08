package tencent.tls.platform;

import tencent.tls.account.acc_status;
import tencent.tls.report.QLog;
import tencent.tls.request.SigInfo;
import tencent.tls.request.WorkThread.Worker;
import tencent.tls.request.async_context;
import tencent.tls.request.req_TGTGT;
import tencent.tls.request.req_getsalt;
import tencent.tls.request.req_global;
import tencent.tls.tools.MD5;
import tencent.tls.tools.util;

class TLSHelper$4
  implements WorkThread.Worker
{
  TLSHelper$4(TLSHelper paramTLSHelper, byte[] paramArrayOfByte, req_global paramreq_global, String paramString, TLSUserInfo paramTLSUserInfo, boolean paramBoolean) {}
  
  public int work()
  {
    Object localObject2 = this.val$userPasswd;
    async_context localasync_context = req_global.get_async_data(this.val$thisG._seq);
    QLog.i("wtlogin login with GetStWithPasswd:user:" + this.val$userAccount + " accType: " + TLSHelper.access$900(this.this$0) + " dwAppid:" + TLSHelper.access$100(this.this$0) + " dwMainSigMap:0x" + Integer.toHexString(TLSHelper.access$200(this.this$0)) + " dwSubAppid:" + TLSHelper.access$300(this.this$0) + " Seq:" + this.val$thisG._seq + " ...");
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length != 0) {}
    }
    else
    {
      localObject1 = localasync_context._mpasswd.getBytes();
    }
    acc_status.mpasswd = "";
    if (acc_status.msalt != 0L)
    {
      localasync_context._msalt = acc_status.msalt;
      acc_status.msalt = 0L;
    }
    if (localObject1.length > 16) {
      System.arraycopy(localObject1, 0, localObject1, 0, 16);
    }
    int i = util.get_saved_network_type(TLSHelper.access$400(this.this$0));
    req_global._network_type = util.get_network_type(TLSHelper.access$400(this.this$0));
    if (i != req_global._network_type)
    {
      util.set_net_retry_type(TLSHelper.access$400(this.this$0), 0);
      util.save_network_type(TLSHelper.access$400(this.this$0), req_global._network_type);
    }
    req_global._apn = util.get_apn_string(TLSHelper.access$400(this.this$0)).getBytes();
    this.val$userInfo.identifier = this.val$userAccount;
    localObject2 = this.val$thisG;
    String str = this.val$userAccount;
    ((req_global)localObject2)._userid = str;
    localasync_context._userid = str;
    this.val$thisG._uin = 0L;
    localasync_context._tinyid = 0L;
    localasync_context._src_appid = TLSHelper.access$100(this.this$0);
    localasync_context._appid = TLSHelper.access$100(this.this$0);
    localasync_context._sub_appid = TLSHelper.access$300(this.this$0);
    localasync_context._main_sigmap = TLSHelper.access$200(this.this$0);
    localasync_context._last_err_msg = new TLSErrInfo();
    if (localObject1.length > 0)
    {
      localasync_context._tmp_pwd = MD5.toMD5Byte((byte[])localObject1);
      localasync_context._tmp_pwd_type = 0;
    }
    if (this.val$userAccount.length() > util.MAX_NAME_LEN) {
      i = 64528;
    }
    for (;;)
    {
      this.val$thisG.close_connect();
      QLog.i("wtlogin login with GetStWithPasswd:user:" + this.val$userAccount + " dwAppid:" + TLSHelper.access$100(this.this$0) + " dwMainSigMap:" + TLSHelper.access$200(this.this$0) + " dwSubAppid:" + TLSHelper.access$300(this.this$0) + " Seq:" + this.val$thisG._seq + " ret=" + i, this.val$thisG._uin);
      return i;
      int j;
      if (localasync_context._msalt == 0L)
      {
        j = new req_getsalt(this.val$thisG).make_request(TLSHelper.access$100(this.this$0), TLSHelper.access$300(this.this$0), TLSHelper.access$200(this.this$0), this.val$userAccount, req_global._pic_type, 0, 0, 1, this.val$userInfo);
        i = j;
        if (j != 0) {}
      }
      else
      {
        localObject1 = new StringBuilder().append("get salt: ");
        if (localasync_context._msalt != 0L) {}
        for (boolean bool = true;; bool = false)
        {
          QLog.i(bool);
          if (localasync_context._tmp_pwd_type == 0) {
            break label795;
          }
          QLog.i("user:" + this.val$userAccount + " login with saved A1.", this.val$thisG._uin);
          j = new req_TGTGT(this.val$thisG).make_request(TLSHelper.access$100(this.this$0), TLSHelper.access$300(this.this$0), 1, this.val$thisG._uin, 0, req_global._ip_addr, localasync_context._tmp_pwd, localasync_context._tmp_no_pic_sig, TLSHelper.access$700(this.this$0), TLSHelper.access$800(this.this$0), null, TLSHelper.access$200(this.this$0), TLSHelper.access$300(this.this$0), 1, req_global._pic_type, 0, 0, 1, this.val$userInfo);
          i = j;
          if (j != 0) {
            break;
          }
          localObject1 = this.val$thisG.get_siginfo(this.val$thisG._uin, TLSHelper.access$100(this.this$0));
          if (localObject1 != null) {
            break label972;
          }
          i = 64532;
          break;
        }
        label795:
        QLog.i("user:" + this.val$userAccount + " login with input password.", this.val$thisG._uin);
        localObject1 = new byte[4];
        long l = System.currentTimeMillis() / 1000L + req_global._l_init_time;
        if (acc_status.regtime == 0L) {}
        for (;;)
        {
          util.int64_to_buf32((byte[])localObject1, 0, l);
          acc_status.regtime = 0L;
          j = new req_TGTGT(this.val$thisG).make_request(TLSHelper.access$100(this.this$0), TLSHelper.access$300(this.this$0), 1, this.val$thisG._uin, 0, req_global._ip_addr, (byte[])localObject1, 0, localasync_context._tmp_pwd, this.val$smslogin, TLSHelper.access$700(this.this$0), TLSHelper.access$800(this.this$0), null, TLSHelper.access$200(this.this$0), TLSHelper.access$300(this.this$0), 1, req_global._pic_type, 0, 0, 1, this.val$userInfo);
          break;
          l = acc_status.regtime;
        }
        label972:
        this.val$userInfo.get_clone((SigInfo)localObject1);
        i = j;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSHelper$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */