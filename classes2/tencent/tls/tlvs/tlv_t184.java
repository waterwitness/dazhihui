package tencent.tls.tlvs;

import tencent.tls.tools.MD5;
import tencent.tls.tools.util;

public class tlv_t184
  extends tlv_t
{
  byte[] _mS2 = new byte[0];
  
  public tlv_t184()
  {
    this._cmd = 388;
  }
  
  public byte[] getMS2()
  {
    return this._mS2;
  }
  
  public byte[] get_tlv_184(long paramLong, String paramString)
  {
    paramString = MD5.toMD5Byte(paramString);
    int i = paramString.length;
    byte[] arrayOfByte = new byte[i + 8];
    System.arraycopy(paramString, 0, arrayOfByte, 0, i);
    i = 0 + i;
    util.int64_to_buf(arrayOfByte, i, paramLong);
    paramString = MD5.toMD5Byte(arrayOfByte);
    set_data(paramString, paramString.length);
    return get_buf();
  }
  
  public boolean verify()
  {
    if (this._body_len < 16) {
      return false;
    }
    this._mS2 = new byte[16];
    System.arraycopy(this._buf, this._head_len, this._mS2, 0, 16);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t184.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */