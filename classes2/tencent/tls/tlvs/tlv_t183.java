package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t183
  extends tlv_t
{
  long _msalt = 0L;
  
  public tlv_t183()
  {
    this._cmd = 387;
  }
  
  public long getMsalt()
  {
    return this._msalt;
  }
  
  public byte[] get_tlv_183(long paramLong)
  {
    byte[] arrayOfByte = new byte[8];
    util.int64_to_buf(arrayOfByte, 0, paramLong);
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
  
  public boolean verify()
  {
    if (this._body_len < 8) {
      return false;
    }
    this._msalt = util.buf_to_int64(this._buf, this._head_len);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t183.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */