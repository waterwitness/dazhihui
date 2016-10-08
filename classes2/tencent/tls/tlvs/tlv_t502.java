package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t502
  extends tlv_t
{
  public tlv_t502()
  {
    this._cmd = 1282;
  }
  
  public byte[] get_tlv_502(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    util.int32_to_buf(arrayOfByte, 0, paramInt);
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t502.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */