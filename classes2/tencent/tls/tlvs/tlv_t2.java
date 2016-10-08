package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t2
  extends tlv_t
{
  int _sigVer = 0;
  int _t2_body_len = 0;
  
  public tlv_t2()
  {
    this._cmd = 2;
  }
  
  public byte[] get_tlv_2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = paramArrayOfByte1;
    if (paramArrayOfByte1 == null) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte1 = paramArrayOfByte2;
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte1 = new byte[0];
    }
    this._t2_body_len = (arrayOfByte.length + 6 + paramArrayOfByte1.length);
    paramArrayOfByte2 = new byte[this._t2_body_len];
    util.int16_to_buf(paramArrayOfByte2, 0, this._sigVer);
    util.int16_to_buf(paramArrayOfByte2, 2, arrayOfByte.length);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte2, 4, arrayOfByte.length);
    int i = arrayOfByte.length + 4;
    util.int16_to_buf(paramArrayOfByte2, i, paramArrayOfByte1.length);
    i += 2;
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, i, paramArrayOfByte1.length);
    i = paramArrayOfByte1.length;
    set_data(paramArrayOfByte2, this._t2_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */