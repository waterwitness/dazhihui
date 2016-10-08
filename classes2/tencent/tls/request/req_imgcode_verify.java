package tencent.tls.request;

import tencent.tls.report.QLog;

public class req_imgcode_verify
  extends oicq_request
{
  public req_imgcode_verify(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 2;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(byte[] paramArrayOfByte)
  {
    async_context localasync_context = req_global.get_async_data(this._g._seq);
    paramArrayOfByte = new req_imgcode_verify.1(this, new int[] { 260, 8, 2 }, localasync_context, paramArrayOfByte);
    return encrypt_body(paramArrayOfByte.doit(), this._sub_cmd, paramArrayOfByte.getTlvCnt());
  }
  
  public int make_request(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    int j = req_global._app_client_version;
    int i = 0;
    for (;;)
    {
      paramString = get_request_body(str.getBytes());
      get_request(this._default_client_version, this._cmd, this._default_client_seq, this._g._uin, this._default_ext_retry, this._default_ext_type, j, this._default_ext_instance, paramString);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_imgcode_verify.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */