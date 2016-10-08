package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t113
  extends tlv_t
{
  public tlv_t113()
  {
    this._cmd = 275;
  }
  
  public long get_uin()
  {
    return util.buf_to_int64(this._buf, this._head_len) & 0xFFFFFFFFFFFFFFFF;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t113.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */