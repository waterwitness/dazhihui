package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t147
  extends tlv_t
{
  public tlv_t147()
  {
    this._cmd = 327;
  }
  
  public byte[] get_tlv_147(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = paramArrayOfByte1;
    if (paramArrayOfByte1 == null) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte1 = paramArrayOfByte2;
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte1 = new byte[0];
    }
    int j = limit_len(arrayOfByte, 32);
    int i = limit_len(paramArrayOfByte1, 32);
    paramArrayOfByte2 = new byte[j + 6 + 2 + i];
    util.int64_to_buf32(paramArrayOfByte2, 0, paramLong);
    util.int16_to_buf(paramArrayOfByte2, 4, j);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte2, 6, j);
    j += 6;
    util.int16_to_buf(paramArrayOfByte2, j, i);
    j += 2;
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, j, i);
    set_data(paramArrayOfByte2, paramArrayOfByte2.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t147.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */