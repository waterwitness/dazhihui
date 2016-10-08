package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t1
  extends tlv_t
{
  byte[] IP_KEY = new byte[2];
  int _ip_len = 4;
  int _ip_pos = 14;
  int _ip_ver = 1;
  int _t1_body_len = 24;
  
  public tlv_t1()
  {
    this._cmd = 1;
  }
  
  public byte[] get_ip()
  {
    byte[] arrayOfByte = new byte[this._ip_len];
    System.arraycopy(this._buf, this._ip_pos, arrayOfByte, 0, this._ip_len);
    return arrayOfByte;
  }
  
  public byte[] get_tlv_1(long paramLong, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[this._t1_body_len];
    util.int16_to_buf(arrayOfByte, 0, this._ip_ver);
    util.int32_to_buf(arrayOfByte, 2, util.get_rand_32());
    util.int64_to_buf(arrayOfByte, 6, paramLong);
    util.int64_to_buf32(arrayOfByte, 14, util.get_server_cur_time());
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 18, paramArrayOfByte.length);
    int i = paramArrayOfByte.length + 18;
    util.int16_to_buf(arrayOfByte, i, 0);
    set_data(arrayOfByte, this._t1_body_len);
    return get_buf();
  }
  
  public boolean verify()
  {
    return this._body_len >= 24;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */