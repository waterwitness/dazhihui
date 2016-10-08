package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t127
  extends tlv_t
{
  int _t127_body_len = 0;
  int _version = 0;
  
  public tlv_t127()
  {
    this._cmd = 295;
  }
  
  public byte[] get_tlv_127(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this._t127_body_len = (paramArrayOfByte1.length + 4 + 2 + paramArrayOfByte2.length);
    byte[] arrayOfByte = new byte[this._t127_body_len];
    util.int16_to_buf(arrayOfByte, 0, this._version);
    util.int16_to_buf(arrayOfByte, 2, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 4, paramArrayOfByte1.length);
    int i = paramArrayOfByte1.length + 4;
    util.int16_to_buf(arrayOfByte, i, paramArrayOfByte2.length);
    i += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i, paramArrayOfByte2.length);
    i = paramArrayOfByte2.length;
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t127.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */