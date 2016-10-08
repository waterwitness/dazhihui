package tencent.tls.request;

import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;

public class req_smslogin_ask
  extends oicq_request
{
  public req_smslogin_ask(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 17;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(long paramLong1, long paramLong2, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, long[] paramArrayOfLong)
  {
    paramArrayOfByte = new req_smslogin_ask.1(this, new int[] { 256, 265, 8, 322, 325, 340, 274, 1282, 278, 1289 }, paramLong1, paramLong2, paramInt2, paramInt1, paramArrayOfByte, paramInt3, paramInt4, paramArrayOfLong);
    return encrypt_body(paramArrayOfByte.doit(), this._sub_cmd, paramArrayOfByte.getTlvCnt());
  }
  
  public int make_request(long paramLong1, long paramLong2, int paramInt1, String paramString, int paramInt2, int paramInt3, TLSUserInfo paramTLSUserInfo)
  {
    int j = req_global._app_client_version;
    int i = 0;
    for (;;)
    {
      paramTLSUserInfo = get_request_body(paramLong1, paramLong2, paramInt1, j, paramString.getBytes(), paramInt2, paramInt3, null);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_smslogin_ask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */