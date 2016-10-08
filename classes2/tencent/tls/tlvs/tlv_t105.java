package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t105
  extends tlv_t
{
  int _en_pos = 0;
  int _enlen = 0;
  int _pic_pos = 0;
  int _piclen = 0;
  
  public tlv_t105()
  {
    this._cmd = 261;
  }
  
  public byte[] get_pic()
  {
    byte[] arrayOfByte = new byte[this._piclen];
    if (this._piclen <= 0) {
      return arrayOfByte;
    }
    System.arraycopy(this._buf, this._pic_pos, arrayOfByte, 0, this._piclen);
    return arrayOfByte;
  }
  
  public byte[] get_sign()
  {
    byte[] arrayOfByte = new byte[this._enlen];
    if (this._enlen <= 0) {
      return arrayOfByte;
    }
    System.arraycopy(this._buf, this._en_pos, arrayOfByte, 0, this._enlen);
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
        this._enlen = util.buf_to_int16(this._buf, this._head_len);
      } while (this._body_len < this._enlen + 2 + 2);
      this._piclen = util.buf_to_int16(this._buf, this._head_len + 2 + this._enlen);
    } while (this._body_len < this._enlen + 2 + 2 + this._piclen);
    this._en_pos = (this._head_len + 2);
    this._pic_pos = (this._enlen + 2 + 2 + this._head_len);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t105.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */