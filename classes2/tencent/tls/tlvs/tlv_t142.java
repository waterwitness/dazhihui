package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t142
  extends tlv_t
{
  int _t142_body_len = 0;
  int _version = 0;
  
  public tlv_t142()
  {
    this._cmd = 322;
  }
  
  public byte[] get_tlv_142(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[0];
    }
    int i = limit_len(arrayOfByte, 32);
    this._t142_body_len = (i + 4);
    paramArrayOfByte = new byte[this._t142_body_len];
    util.int16_to_buf(paramArrayOfByte, 0, this._version);
    util.int16_to_buf(paramArrayOfByte, 2, i);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 4, i);
    set_data(paramArrayOfByte, paramArrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t142.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */