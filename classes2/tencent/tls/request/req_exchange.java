package tencent.tls.request;

import tencent.tls.report.QLog;

public class req_exchange
  extends oicq_request
{
  public req_exchange(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 26;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(long paramLong, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new req_exchange.1(this, new int[] { 256, 274, 1282, 1283, 1287, 8 }, paramLong, paramString1, paramInt, paramString2, paramString3);
    return encrypt_body(paramString1.doit(), this._sub_cmd, paramString1.getTlvCnt());
  }
  
  public int make_request(long paramLong, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    int j = req_global._app_client_version;
    this._g._userid = paramString1;
    int i = 0;
    for (;;)
    {
      byte[] arrayOfByte = get_request_body(paramLong, paramInt, paramString1, paramString2, paramString3);
      get_request(this._default_client_version, this._cmd, this._default_client_seq, 0L, this._default_ext_retry, this._default_ext_type, j, this._default_ext_instance, arrayOfByte);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_exchange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */