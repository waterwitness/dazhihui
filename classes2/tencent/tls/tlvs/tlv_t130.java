package tencent.tls.tlvs;

public class tlv_t130
  extends tlv_t
{
  public tlv_t130()
  {
    this._cmd = 304;
  }
  
  public byte[] get_ipaddr()
  {
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(this._buf, this._head_len + 2 + 4, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public byte[] get_time()
  {
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(this._buf, this._head_len + 2, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public boolean verify()
  {
    return this._body_len >= 14;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t130.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */