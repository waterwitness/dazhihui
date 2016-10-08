package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t11f
  extends tlv_t
{
  public tlv_t11f()
  {
    this._cmd = 287;
  }
  
  public int get_chg_time()
  {
    return util.buf_to_int32(this._buf, this._head_len);
  }
  
  public int get_tk_pri()
  {
    return util.buf_to_int32(this._buf, this._head_len + 4);
  }
  
  public boolean verify()
  {
    return this._body_len >= 8;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t11f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */