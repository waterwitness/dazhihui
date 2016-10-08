package tencent.tls.tlvs;

import tencent.tls.tools.util;

public class tlv_t138
  extends tlv_t
{
  public int A2_Valid = 0;
  public int D2_Valid = 0;
  private int cnt = 0;
  
  public tlv_t138()
  {
    this._cmd = 312;
  }
  
  public boolean verify()
  {
    int i = 0;
    if (this._body_len < 4) {}
    do
    {
      return false;
      this.cnt = util.buf_to_int32(this._buf, this._head_len);
    } while (this._body_len >= this.cnt * 10 + 4);
    if (i < this.cnt)
    {
      int j = this._head_len + 4 + i * 10;
      switch (util.buf_to_int16(this._buf, j))
      {
      }
      for (;;)
      {
        i += 1;
        break;
        this.A2_Valid = util.buf_to_int32(this._buf, j + 2);
        continue;
        this.D2_Valid = util.buf_to_int32(this._buf, j + 2);
      }
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t138.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */