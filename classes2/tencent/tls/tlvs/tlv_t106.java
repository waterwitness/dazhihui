package tencent.tls.tlvs;

import tencent.tls.tools.cryptor;
import tencent.tls.tools.util;

public class tlv_t106
  extends tlv_t
{
  int _SSoVer = 1;
  int _TGTGTVer = 4;
  int _t106_body_len = 90;
  
  public tlv_t106()
  {
    this._cmd = 262;
  }
  
  public byte[] get_tlv_106(long paramLong1, long paramLong2, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3, long paramLong3, byte[] paramArrayOfByte4, int paramInt3, byte[] paramArrayOfByte5, int paramInt4, byte[] paramArrayOfByte6, int paramInt5)
  {
    byte[] arrayOfByte = paramArrayOfByte1;
    if (paramArrayOfByte1 == null) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte1 = paramArrayOfByte2;
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte1 = new byte[0];
    }
    paramArrayOfByte2 = paramArrayOfByte3;
    if (paramArrayOfByte3 == null) {
      paramArrayOfByte2 = new byte[0];
    }
    paramArrayOfByte3 = paramArrayOfByte4;
    if (paramArrayOfByte4 == null) {
      paramArrayOfByte3 = new byte[0];
    }
    paramArrayOfByte4 = paramArrayOfByte5;
    if (paramArrayOfByte5 == null) {
      paramArrayOfByte4 = new byte[0];
    }
    paramArrayOfByte5 = paramArrayOfByte6;
    if (paramArrayOfByte6 == null) {
      paramArrayOfByte5 = new byte[0];
    }
    this._t106_body_len += paramArrayOfByte5.length + 2 + 4;
    paramArrayOfByte6 = new byte[this._t106_body_len];
    util.int16_to_buf(paramArrayOfByte6, 0, this._TGTGTVer);
    util.int32_to_buf(paramArrayOfByte6, 2, util.get_rand_32());
    util.int32_to_buf(paramArrayOfByte6, 6, this._SSoVer);
    util.int64_to_buf32(paramArrayOfByte6, 10, paramLong1);
    util.int32_to_buf(paramArrayOfByte6, 14, paramInt1);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte6, 18, arrayOfByte.length);
    paramInt1 = arrayOfByte.length + 18;
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte6, paramInt1, paramArrayOfByte1.length);
    paramInt1 += paramArrayOfByte1.length;
    util.int8_to_buf(paramArrayOfByte6, paramInt1, paramInt2);
    paramInt1 += 1;
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte6, paramInt1, paramArrayOfByte2.length);
    paramInt1 += paramArrayOfByte2.length;
    System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte6, paramInt1, paramArrayOfByte3.length);
    paramInt1 += paramArrayOfByte3.length;
    util.int32_to_buf(paramArrayOfByte6, paramInt1, 0);
    paramInt1 += 4;
    util.int8_to_buf(paramArrayOfByte6, paramInt1, paramInt3);
    paramInt1 += 1;
    if (paramArrayOfByte4.length == 0)
    {
      paramArrayOfByte1 = new byte[16];
      util.int32_to_buf(paramArrayOfByte1, 0, util.get_rand_32());
      util.int32_to_buf(paramArrayOfByte1, 4, util.get_rand_32());
      util.int32_to_buf(paramArrayOfByte1, 8, util.get_rand_32());
      util.int32_to_buf(paramArrayOfByte1, 12, util.get_rand_32());
      paramInt1 += paramArrayOfByte1.length;
    }
    for (;;)
    {
      util.int64_to_buf32(paramArrayOfByte6, paramInt1, paramLong2);
      paramInt1 += 4;
      util.int32_to_buf(paramArrayOfByte6, paramInt1, paramInt4);
      paramInt1 += 4;
      util.int16_to_buf(paramArrayOfByte6, paramInt1, paramArrayOfByte5.length);
      paramInt1 += 2;
      System.arraycopy(paramArrayOfByte5, 0, paramArrayOfByte6, paramInt1, paramArrayOfByte5.length);
      paramInt1 += paramArrayOfByte5.length;
      util.int32_to_buf(paramArrayOfByte6, paramInt1, paramInt5);
      paramArrayOfByte1 = util.getS2(paramArrayOfByte2, paramLong3);
      paramArrayOfByte1 = cryptor.encrypt(paramArrayOfByte6, 0, paramArrayOfByte6.length, paramArrayOfByte1);
      this._t106_body_len = paramArrayOfByte1.length;
      set_data(paramArrayOfByte1, this._t106_body_len);
      return get_buf();
      System.arraycopy(paramArrayOfByte4, 0, paramArrayOfByte6, paramInt1, paramArrayOfByte4.length);
      paramInt1 += paramArrayOfByte4.length;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */