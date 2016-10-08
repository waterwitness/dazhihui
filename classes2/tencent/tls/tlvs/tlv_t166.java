package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t166
  extends tlv_t
{
  public tlv_t166()
  {
    this._cmd = 358;
  }
  
  public byte[] get_tlv_166(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    util.int8_to_buf(arrayOfByte, 0, paramInt);
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t166.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */