package tencent.tls.request;

import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;

public class req_getsalt
  extends oicq_request
{
  public req_getsalt(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 25;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(long paramLong1, long paramLong2, int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramString = new req_getsalt.1(this, new int[] { 256, 274, 263, 265, 340, 8, 1282, 1289 }, paramString, paramLong1, paramLong2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    return encrypt_body(paramString.doit(), this._sub_cmd, paramString.getTlvCnt());
  }
  
  public int make_request(long paramLong1, long paramLong2, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, TLSUserInfo paramTLSUserInfo)
  {
    int j = req_global._app_client_version;
    this._g._userid = paramString;
    int i = 0;
    for (;;)
    {
      paramTLSUserInfo = get_request_body(paramLong1, paramLong2, j, paramInt1, paramString, paramInt2, paramInt3, paramInt4, paramInt5);
      get_request(this._default_client_version, this._cmd, this._default_client_seq, 0L, this._default_ext_retry, this._default_ext_type, j, this._default_ext_instance, paramTLSUserInfo);
      int k = snd_rcv_req();
      if (k != 0) {
        return k;
      }
      k = get_response();
      QLog.i("retry num:" + i + " ret:" + k + " uin: " + this._g._uin);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_getsalt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */