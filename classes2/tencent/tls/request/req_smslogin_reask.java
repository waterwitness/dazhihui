package tencent.tls.request;

import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;

public class req_smslogin_reask
  extends oicq_request
{
  public req_smslogin_reask(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 19;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(int paramInt1, int paramInt2, long[] paramArrayOfLong)
  {
    paramArrayOfLong = new req_smslogin_reask.1(this, new int[] { 260, 8, 278 }, paramInt1, paramInt2, paramArrayOfLong);
    return encrypt_body(paramArrayOfLong.doit(), this._sub_cmd, paramArrayOfLong.getTlvCnt());
  }
  
  public int make_request(int paramInt1, int paramInt2, long[] paramArrayOfLong, TLSUserInfo paramTLSUserInfo)
  {
    int j = req_global._app_client_version;
    int i = 0;
    for (;;)
    {
      paramTLSUserInfo = get_request_body(paramInt1, paramInt2, paramArrayOfLong);
      get_request(this._default_client_version, this._cmd, this._default_client_seq, this._g._uin, this._default_ext_retry, this._default_ext_type, j, this._default_ext_instance, paramTLSUserInfo);
      int k = snd_rcv_req();
      if (k != 0) {
        return k;
      }
      k = get_response();
      QLog.i("retry num:" + i + " ret:" + k, this._g._uin);
      if (k != 180) {
        return k;
      }
      if (i >= 1) {
        return k;
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_smslogin_reask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */