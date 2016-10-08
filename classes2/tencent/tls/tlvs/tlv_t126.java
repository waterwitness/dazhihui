package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t126
  extends tlv_t
{
  int _random_len = 0;
  
  public tlv_t126()
  {
    this._cmd = 294;
  }
  
  public byte[] get_random()
  {
    byte[] arrayOfByte = new byte[this._random_len];
    System.arraycopy(this._buf, this._head_len + 2 + 2, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public boolean verify()
  {
    if (this._body_len < 2) {}
    do
    {
      do
      {
        return false;
      } while (this._body_len < 4);
      this._random_len = util.buf_to_int16(this._buf, this._head_len + 2);
    } while (this._random_len + 2 + 2 > this._body_len);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t126.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */