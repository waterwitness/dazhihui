package tencent.tls.request;

import java.net.Socket;
import tencent.tls.platform.TLSErrInfo;
import tencent.tls.platform.TLSUserInfo;
import tencent.tls.report.QLog;
import tencent.tls.tlvs.tlv_t172;
import tencent.tls.tools.cryptor;
import tencent.tls.tools.util;

public class req_transport
  extends oicq_request
{
  public int _req_transport_eext_head_len = 0;
  public int _rsp_transport_eext_head_len = 5;
  
  public req_transport(req_global paramreq_global)
  {
    this._cmd = 2104;
    this._sub_cmd = 1;
    this._service_cmd = "wtlogin64.trans_emp";
    this._g = paramreq_global;
    this._g._encrypt_type = 0;
  }
  
  protected byte[] encrypt_body(byte[] paramArrayOfByte)
  {
    if (this._g._encrypt_type == 0) {
      return ecdh_encrypt_body(paramArrayOfByte, this._g._rand_key, this._g._pub_key, this._g._share_key);
    }
    return kc_encrypt_body(paramArrayOfByte, this._g._rand_key, 3);
  }
  
  public int get_port(boolean paramBoolean)
  {
    if (paramBoolean) {}
    return 8080;
  }
  
  public byte[] get_request_body(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2, int paramInt)
  {
    if (paramArrayOfByte2 == null)
    {
      paramArrayOfByte2 = new byte[0];
      if (paramInt == 0) {
        paramInt = 0;
      }
    }
    for (;;)
    {
      byte[] arrayOfByte2 = new byte[0];
      byte[] arrayOfByte1 = arrayOfByte2;
      if (this._g._t172_data != null)
      {
        arrayOfByte1 = arrayOfByte2;
        if (this._g._t172_data.length > 0)
        {
          arrayOfByte2 = new tlv_t172().get_tlv_172(this._g._t172_data);
          arrayOfByte1 = new byte[arrayOfByte2.length + 2];
          util.int16_to_buf(arrayOfByte1, 0, 1);
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 2, arrayOfByte2.length);
        }
      }
      this._req_transport_eext_head_len = (paramArrayOfByte2.length + 13 + 1 + arrayOfByte1.length);
      arrayOfByte2 = new byte[paramArrayOfByte1.length + this._req_transport_eext_head_len];
      util.int8_to_buf(arrayOfByte2, 0, paramInt);
      util.int16_to_buf(arrayOfByte2, 1, paramArrayOfByte1.length);
      util.int32_to_buf(arrayOfByte2, 3, 0);
      util.int64_to_buf32(arrayOfByte2, 7, paramLong2);
      util.int16_to_buf(arrayOfByte2, 11, paramArrayOfByte2.length);
      System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, 13, paramArrayOfByte2.length);
      paramInt = paramArrayOfByte2.length + 13;
      util.int8_to_buf(arrayOfByte2, paramInt, arrayOfByte1.length);
      paramInt += 1;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramInt, arrayOfByte1.length);
      paramInt += arrayOfByte1.length;
      System.arraycopy(paramArrayOfByte1, 0, arrayOfByte2, paramInt, paramArrayOfByte1.length);
      paramInt = paramArrayOfByte1.length;
      return encrypt_body(arrayOfByte2);
      paramInt = 3;
      continue;
      if (paramInt == 0) {
        paramInt = 1;
      } else {
        paramInt = 2;
      }
    }
  }
  
  public int get_response(TransReqContext paramTransReqContext)
  {
    int i = this._pos;
    int j;
    if (i <= this._rsp_head_len + 2)
    {
      j = 64527;
      return j;
    }
    this._rsp_body_len = (i - this._rsp_head_len - 2);
    if (this._g._encrypt_type == 0)
    {
      j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._share_key);
      i = j;
      if (j < 0)
      {
        QLog.i("use ecdh decrypt_body failed");
        j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._rand_key);
        i = j;
        if (j < 0)
        {
          QLog.i("use kc decrypt_body failed");
          i = j;
        }
      }
    }
    for (;;)
    {
      j = i;
      if (i < 0) {
        break;
      }
      return get_response_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, paramTransReqContext);
      j = decrypt_body(this._buf, this._rsp_head_len + 1, this._rsp_body_len, this._g._rand_key);
      i = j;
      if (j < 0)
      {
        QLog.i("use kc decrypt_body failed");
        i = j;
      }
    }
  }
  
  public int get_response_body(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 < this._rsp_transport_eext_head_len) {
      return 64527;
    }
    paramInt1 = get_response_ret_code(paramArrayOfByte, paramInt1);
    set_err_msg(null);
    QLog.d("type=" + paramInt1);
    return paramInt1;
  }
  
  public int get_response_body(byte[] paramArrayOfByte, int paramInt1, int paramInt2, TransReqContext paramTransReqContext)
  {
    if (paramInt2 < this._rsp_transport_eext_head_len) {
      return 64527;
    }
    int i = get_response_ret_code(paramArrayOfByte, paramInt1);
    set_err_msg((TLSErrInfo)null);
    QLog.d("type=" + i);
    switch (i)
    {
    default: 
      return i;
    case 0: 
      int j = this._rsp_transport_eext_head_len;
      byte[] arrayOfByte = new byte[paramInt2 - this._rsp_transport_eext_head_len];
      System.arraycopy(paramArrayOfByte, j + paramInt1, arrayOfByte, 0, arrayOfByte.length);
      paramTransReqContext.set_body(arrayOfByte);
      return i;
    }
    paramInt1 = this._rsp_transport_eext_head_len + 2 + paramInt1;
    paramTransReqContext = new tlv_t172();
    paramInt2 = paramTransReqContext.get_tlv(paramArrayOfByte, paramInt1, this._pos - paramInt1 - 1);
    paramInt1 = paramInt2;
    if (paramInt2 > 0)
    {
      this._g._encrypt_type = 1;
      this._g._t172_data = paramTransReqContext.get_data();
      QLog.i("get rollback sig");
      paramInt1 = i;
    }
    return paramInt1;
  }
  
  public Socket get_sk()
  {
    if (this._g._transport_sk != null) {
      QLog.d("_transport_sk" + this._g._transport_sk.toString());
    }
    for (;;)
    {
      return this._g._transport_sk;
      QLog.d("_transport_sk null");
    }
  }
  
  public int make_request(long paramLong1, TransReqContext paramTransReqContext, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong2, long paramLong3, TLSUserInfo paramTLSUserInfo)
  {
    for (;;)
    {
      int k;
      byte[] arrayOfByte;
      long l;
      try
      {
        int m = req_global._app_client_version;
        k = 0;
        j = 0;
        arrayOfByte = paramTransReqContext._body;
        l = System.currentTimeMillis() / 1000L;
        l = req_global._l_init_time + l;
        if (arrayOfByte == null)
        {
          paramTLSUserInfo = new byte[0];
          i = j;
          if (paramTLSUserInfo == null) {
            break label289;
          }
          i = j;
          if (paramTLSUserInfo.length <= 0) {
            break label289;
          }
          paramTLSUserInfo = get_request_body(paramTLSUserInfo, paramArrayOfByte1, paramLong2, paramLong3, 0);
          get_request(this._default_client_version, this._cmd, this._default_client_seq, paramLong1, this._default_ext_retry, this._default_ext_type, m, this._default_ext_instance, paramTLSUserInfo);
          j = snd_rcv_req();
          if (j == 0) {
            break label239;
          }
          QLog.d("req_transport rsp: ret=" + j);
          return j;
        }
        if (paramArrayOfByte1 == null)
        {
          paramTLSUserInfo = new byte[arrayOfByte.length + 4];
          util.int64_to_buf32(paramTLSUserInfo, 0, l);
          System.arraycopy(arrayOfByte, 0, paramTLSUserInfo, 4, arrayOfByte.length);
          continue;
        }
        paramTLSUserInfo = new byte[arrayOfByte.length + 4];
      }
      finally {}
      util.int64_to_buf32(paramTLSUserInfo, 0, l);
      System.arraycopy(arrayOfByte, 0, paramTLSUserInfo, 4, arrayOfByte.length);
      paramTLSUserInfo = cryptor.encrypt(paramTLSUserInfo, 0, paramTLSUserInfo.length, paramArrayOfByte2);
      continue;
      label239:
      int i = get_response(paramTransReqContext);
      if ((i == 0) && (paramArrayOfByte1 != null))
      {
        paramTLSUserInfo = paramTransReqContext.get_body();
        paramTransReqContext.set_body(cryptor.decrypt(paramTLSUserInfo, 0, paramTLSUserInfo.length, paramArrayOfByte2));
      }
      int j = i;
      if (i == 180)
      {
        label289:
        j = i;
        if (k < 1)
        {
          k += 1;
          j = i;
        }
      }
    }
  }
  
  public void set_sk(Socket paramSocket)
  {
    this._g._transport_sk = paramSocket;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\req_transport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */