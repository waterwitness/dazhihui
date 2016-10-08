package tencent.tls.request;

import java.util.List;
import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;

public class req_tgtgt_nopicsig
  extends oicq_request
{
  public req_tgtgt_nopicsig(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 15;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, int paramInt4, long[] paramArrayOfLong, int paramInt5, long paramLong3, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong4, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, List<String> paramList)
  {
    async_context localasync_context = req_global.get_async_data(this._g._seq);
    paramArrayOfByte1 = new req_tgtgt_nopicsig.1(this, new int[] { 24, 1, 262, 278, 256, 263, 324, 322, 274, 1282, 325, 358, 362, 363, 340, 321, 8, 327, 370, 375, 1289 }, paramLong1, paramInt1, paramLong2, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramInt3, paramInt4, paramArrayOfLong, paramLong3, paramInt5, paramInt7, paramInt8, paramInt9, paramInt10, paramArrayOfByte4, localasync_context, paramArrayOfByte5, paramArrayOfByte3, paramList, paramLong4);
    return encrypt_body(paramArrayOfByte1.doit(), this._sub_cmd, paramArrayOfByte1.getTlvCnt());
  }
  
  public int make_request(long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, int paramInt4, long[] paramArrayOfLong, int paramInt5, long paramLong3, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, long paramLong4, TLSUserInfo paramTLSUserInfo)
  {
    int j = req_global._app_client_version;
    paramArrayOfByte2 = decrypt_a1(paramArrayOfByte2);
    if (paramArrayOfByte2 == null)
    {
      paramInt6 = 64522;
      return paramInt6;
    }
    paramInt1 = 0;
    for (;;)
    {
      get_request(this._default_client_version, this._cmd, this._default_client_seq, paramLong2, this._default_ext_retry, this._default_ext_type, j, this._default_ext_instance, get_request_body(paramLong1, j, paramLong2, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramInt3, paramInt4, paramArrayOfLong, paramInt5, paramLong3, j, paramInt7, paramInt8, paramInt9, paramInt10, paramLong4, req_global._IMEI, req_global._apk_id, null));
      int i = snd_rcv_req();
      paramInt6 = i;
      if (i != 0) {
        break;
      }
      paramInt6 = get_response();
      QLog.i("retry num:" + paramInt1 + " ret:" + paramInt6, paramLong2);
      if (paramInt6 != 180) {
        return paramInt6;
      }
      if (paramInt1 >= 1) {
        return paramInt6;
      }
      paramInt1 += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_tgtgt_nopicsig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */