package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t149
  extends tlv_t
{
  public int _content_len = 0;
  public int _otherinfo_len = 0;
  public int _title_len = 0;
  
  public tlv_t149()
  {
    this._cmd = 329;
  }
  
  public String get_content()
  {
    byte[] arrayOfByte = new byte[this._content_len];
    System.arraycopy(this._buf, this._head_len + 2 + 2 + this._title_len + 2, arrayOfByte, 0, this._content_len);
    return new String(arrayOfByte);
  }
  
  public String get_otherinfo()
  {
    byte[] arrayOfByte = new byte[this._otherinfo_len];
    System.arraycopy(this._buf, this._head_len + 2 + 2 + this._title_len + 2 + this._content_len + 2, arrayOfByte, 0, this._otherinfo_len);
    return new String(arrayOfByte);
  }
  
  public String get_title()
  {
    byte[] arrayOfByte = new byte[this._title_len];
    System.arraycopy(this._buf, this._head_len + 2 + 2, arrayOfByte, 0, this._title_len);
    return new String(arrayOfByte);
  }
  
  public int get_type()
  {
    return util.buf_to_int16(this._buf, this._head_len);
  }
  
  public boolean verify()
  {
    if (this._body_len < 8) {}
    int i;
    do
    {
      do
      {
        do
        {
          return false;
          i = util.buf_to_int16(this._buf, this._head_len + 2);
        } while (this._body_len < i + 8);
        this._title_len = i;
        i = util.buf_to_int16(this._buf, this._head_len + 2 + 2 + this._title_len);
      } while (this._body_len < this._title_len + 8 + i);
      this._content_len = i;
      i = util.buf_to_int16(this._buf, this._head_len + 2 + 2 + this._title_len + 2 + this._content_len);
    } while (this._body_len < this._title_len + 8 + this._content_len + i);
    this._otherinfo_len = i;
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t149.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */