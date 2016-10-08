package tencent.tls.request;

import java.util.List;
import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;
import tencent.tls.tlvs.tlv_t104;
import tencent.tls.tools.util;

public class req_TGTGT
  extends oicq_request
{
  public static final int SIGSRC_NORMAL = 3;
  
  public req_TGTGT(req_global paramreq_global)
  {
    this._cmd = 2103;
    this._sub_cmd = 9;
    this._service_cmd = "wtlogin64.login";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  public byte[] get_request_body(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, boolean paramBoolean, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, int paramInt4, int paramInt5, long[] paramArrayOfLong, int paramInt6, long paramLong4, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, List<String> paramList)
  {
    async_context localasync_context = req_global.get_async_data(this._g._seq);
    long l = localasync_context._msalt;
    paramArrayOfByte1 = new req_TGTGT.1(this, new int[] { 24, 1, 262, 278, 256, 263, 260, 322, 274, 1282, 324, 325, 327, 358, 340, 321, 8, 363, 370, 375, 362, 389, 1289 }, paramLong1, paramInt1, paramLong3, paramInt2, paramArrayOfByte1, paramArrayOfByte5, paramLong2, paramArrayOfByte2, paramArrayOfByte3, l, paramArrayOfByte4, paramArrayOfByte6, paramLong4, paramInt6, paramInt8, paramInt9, paramInt10, paramInt11, paramInt4, paramInt5, paramArrayOfLong, paramArrayOfByte7, localasync_context, paramArrayOfByte9, paramArrayOfByte8, paramList, paramBoolean);
    return encrypt_body(paramArrayOfByte1.doit(), this._sub_cmd, paramArrayOfByte1.getTlvCnt());
  }
  
  public int make_request(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3, boolean paramBoolean, int paramInt4, int paramInt5, long[] paramArrayOfLong, int paramInt6, long paramLong4, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, TLSUserInfo paramTLSUserInfo)
  {
    paramInt7 = req_global._app_client_version;
    paramTLSUserInfo = req_global.get_async_data(this._g._seq);
    paramTLSUserInfo._tgtgt_key = util.get_rand_16byte(req_global._IMEI_KEY);
    byte[] arrayOfByte = paramTLSUserInfo._tgtgt_key;
    Object localObject = paramTLSUserInfo._t104;
    paramTLSUserInfo = (TLSUserInfo)localObject;
    if (localObject == null) {
      paramTLSUserInfo = new tlv_t104();
    }
    paramInt1 = 0;
    for (;;)
    {
      localObject = get_request_body(paramLong1, paramLong2, paramInt7, paramLong3, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramInt3, paramArrayOfByte3, arrayOfByte, paramBoolean, null, null, paramInt4, paramInt5, paramArrayOfLong, paramInt6, paramLong4, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, req_global._IMEI, paramTLSUserInfo.get_data(), req_global._apk_id, null);
      get_request(this._default_client_version, this._cmd, this._default_client_seq, paramLong3, this._default_ext_retry, this._default_ext_type, paramInt7, this._default_ext_instance, (byte[])localObject);
      int i = snd_rcv_req();
      if (i != 0) {
        return i;
      }
      i = get_response();
      QLog.i("retry num:" + paramInt1 + " ret:" + i, paramLong3);
      if (i != 180) {
        return i;
      }
      if (paramInt1 >= 1) {
        return i;
      }
      paramInt1 += 1;
    }
  }
  
  public int make_request(long paramLong1, long paramLong2, int paramInt1, long paramLong3, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, int paramInt4, long[] paramArrayOfLong, int paramInt5, long paramLong4, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, TLSUserInfo paramTLSUserInfo)
  {
    paramInt6 = req_global._app_client_version;
    Object localObject = req_global.get_async_data(this._g._seq)._t104;
    paramTLSUserInfo = (TLSUserInfo)localObject;
    if (localObject == null) {
      paramTLSUserInfo = new tlv_t104();
    }
    paramArrayOfByte2 = decrypt_a1(paramArrayOfByte2);
    if (paramArrayOfByte2 == null) {
      return 64522;
    }
    paramInt1 = 0;
    for (;;)
    {
      localObject = get_request_body(paramLong1, paramLong2, paramInt6, paramLong3, paramInt2, paramArrayOfByte1, null, 0, null, null, false, paramArrayOfByte2, paramArrayOfByte3, paramInt3, paramInt4, paramArrayOfLong, paramInt5, paramLong4, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, req_global._IMEI, paramTLSUserInfo.get_data(), req_global._apk_id, null);
      get_request(this._default_client_version, this._cmd, this._default_client_seq, paramLong3, this._default_ext_retry, this._default_ext_type, paramInt6, this._default_ext_instance, (byte[])localObject);
      int i = snd_rcv_req();
      if (i != 0) {
        return i;
      }
      i = get_response();
      QLog.i("retry num:" + paramInt1 + " ret:" + i, paramLong3);
      if (i != 180) {
        return i;
      }
      if (paramInt1 >= 1) {
        return i;
      }
      paramInt1 += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_TGTGT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */