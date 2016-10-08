package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t107
  extends tlv_t
{
  int _t107_body_len = 6;
  
  public tlv_t107()
  {
    this._cmd = 263;
  }
  
  public byte[] get_tlv_107(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    byte[] arrayOfByte = new byte[this._t107_body_len];
    util.int16_to_buf(arrayOfByte, 0, paramInt1);
    util.int8_to_buf(arrayOfByte, 2, paramInt2);
    util.int16_to_buf(arrayOfByte, 3, paramInt3);
    util.int8_to_buf(arrayOfByte, 5, paramInt4);
    set_data(arrayOfByte, this._t107_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t107.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */