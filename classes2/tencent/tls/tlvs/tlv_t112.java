package tencent.tls.tlvs;

public class tlv_t112
  extends tlv_t
{
  public tlv_t112()
  {
    this._cmd = 274;
  }
  
  public byte[] get_tlv_112(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[0];
    }
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t112.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */