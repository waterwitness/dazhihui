package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t505
  extends tlv_t
{
  int expire = 0;
  int reask = 0;
  
  public tlv_t505()
  {
    this._cmd = 1285;
  }
  
  public int getExpire()
  {
    return this.expire;
  }
  
  public int getReask()
  {
    return this.reask;
  }
  
  public boolean verify()
  {
    if (this._body_len < 4) {
      return false;
    }
    this.reask = util.buf_to_int16(this._buf, this._head_len);
    this.expire = util.buf_to_int16(this._buf, this._head_len + 2);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t505.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */