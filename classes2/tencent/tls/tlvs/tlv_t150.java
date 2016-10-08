package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t150
  extends tlv_t
{
  public int _other_len = 0;
  
  public tlv_t150()
  {
    this._cmd = 336;
  }
  
  public int get_bitmap()
  {
    return util.buf_to_int32(this._buf, this._head_len);
  }
  
  public byte get_network()
  {
    return (byte)(util.buf_to_int8(this._buf, this._head_len + 4) & 0xFF);
  }
  
  public boolean verify()
  {
    if (this._body_len < 7) {}
    int i;
    do
    {
      return false;
      i = util.buf_to_int16(this._buf, this._head_len + 5);
    } while (this._body_len < i + 7);
    this._other_len = i;
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t150.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */