package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t177
  extends tlv_t
{
  int _t177_body_len = 0;
  
  public tlv_t177()
  {
    this._cmd = 375;
  }
  
  public byte[] get_tlv_177(long paramLong, String paramString)
  {
    byte[] arrayOfByte = new byte[0];
    if (paramString != null) {
      arrayOfByte = paramString.getBytes();
    }
    this._t177_body_len = (arrayOfByte.length + 7);
    paramString = new byte[this._t177_body_len];
    util.int8_to_buf(paramString, 0, 1);
    util.int64_to_buf32(paramString, 1, paramLong);
    util.int16_to_buf(paramString, 5, arrayOfByte.length);
    System.arraycopy(arrayOfByte, 0, paramString, 7, arrayOfByte.length);
    int i = arrayOfByte.length;
    set_data(paramString, this._t177_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t177.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */