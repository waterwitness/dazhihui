package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t8
  extends tlv_t
{
  int _t8_body_len = 0;
  
  public tlv_t8()
  {
    this._cmd = 8;
  }
  
  public byte[] get_tlv_8(int paramInt1, int paramInt2, int paramInt3)
  {
    this._t8_body_len = 8;
    byte[] arrayOfByte = new byte[this._t8_body_len];
    util.int16_to_buf(arrayOfByte, 0, paramInt1);
    util.int32_to_buf(arrayOfByte, 2, paramInt2);
    util.int16_to_buf(arrayOfByte, 6, paramInt3);
    set_data(arrayOfByte, this._t8_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */