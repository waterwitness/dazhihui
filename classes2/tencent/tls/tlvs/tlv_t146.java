package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t146
  extends tlv_t
{
  public int _errorinfo_len = 0;
  public int _msg_len = 0;
  public int _title_len = 0;
  public String errMsg = "";
  public String errTitle = "";
  public int errType = 0;
  public String extraErrMsg = "";
  int ver = 0;
  
  public tlv_t146()
  {
    this._cmd = 326;
  }
  
  public boolean verify()
  {
    if (this._body_len < 4) {}
    do
    {
      do
      {
        do
        {
          return false;
          this.ver = util.buf_to_int16(this._buf, this._head_len);
          if (this.ver != 0) {
            break;
          }
          this.errType = util.buf_to_int16(this._buf, this._head_len + 2);
          i = util.buf_to_int16(this._buf, this._head_len + 4);
          this._title_len = i;
        } while (this._body_len < i + 12);
        arrayOfByte = new byte[i];
        System.arraycopy(this._buf, this._head_len + 6, arrayOfByte, 0, i);
        this.errTitle = new String(arrayOfByte);
        i = util.buf_to_int16(this._buf, this._head_len + 6 + this._title_len);
        this._msg_len = i;
      } while (this._body_len < i + (this._title_len + 12));
      arrayOfByte = new byte[this._msg_len];
      System.arraycopy(this._buf, this._head_len + 8 + this._title_len, arrayOfByte, 0, this._msg_len);
      this.errMsg = new String(arrayOfByte);
      i = util.buf_to_int16(this._buf, this._head_len + 10 + this._title_len + this._msg_len);
      this._errorinfo_len = i;
    } while (this._body_len < i + (this._title_len + 12 + this._msg_len));
    byte[] arrayOfByte = new byte[this._errorinfo_len];
    System.arraycopy(this._buf, this._head_len + 12 + this._title_len + this._msg_len, arrayOfByte, 0, this._errorinfo_len);
    this.extraErrMsg = new String(arrayOfByte);
    while (this.ver != 1)
    {
      int i;
      return true;
    }
    this.errType = util.buf_to_int32(this._buf, this._head_len + 2);
    this._msg_len = util.buf_to_int16(this._buf, this._head_len + 2 + 4);
    arrayOfByte = new byte[this._msg_len];
    System.arraycopy(this._buf, this._head_len + 2 + 4, arrayOfByte, 0, this._msg_len);
    this.errMsg = new String(arrayOfByte);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t146.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */