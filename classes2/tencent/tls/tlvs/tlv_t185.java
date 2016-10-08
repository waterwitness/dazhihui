package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t185
  extends tlv_t
{
  public tlv_t185()
  {
    this._cmd = 389;
  }
  
  public byte[] get_tlv_185(int paramInt)
  {
    byte[] arrayOfByte = new byte[2];
    util.int8_to_buf(arrayOfByte, 0, 1);
    util.int8_to_buf(arrayOfByte, 1, paramInt);
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t185.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */