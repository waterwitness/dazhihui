package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t18
  extends tlv_t
{
  int _ping_version = 1;
  int _sso_version = 1536;
  int _t18_body_len = 26;
  
  public tlv_t18()
  {
    this._cmd = 24;
  }
  
  public byte[] get_tlv_18(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
  {
    byte[] arrayOfByte = new byte[this._t18_body_len];
    util.int16_to_buf(arrayOfByte, 0, this._ping_version);
    util.int32_to_buf(arrayOfByte, 2, this._sso_version);
    util.int32_to_buf(arrayOfByte, 6, (int)paramLong1);
    util.int32_to_buf(arrayOfByte, 10, paramInt1);
    util.int64_to_buf(arrayOfByte, 14, paramLong2);
    util.int16_to_buf(arrayOfByte, 22, paramInt2);
    util.int16_to_buf(arrayOfByte, 24, 0);
    set_data(arrayOfByte, this._t18_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */