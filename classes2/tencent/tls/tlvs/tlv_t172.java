package tencent.tls.tlvs;

public class tlv_t172
  extends tlv_t
{
  public tlv_t172()
  {
    this._cmd = 370;
  }
  
  public byte[] get_tlv_172(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[0];
    }
    set_data(arrayOfByte, arrayOfByte.length);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t172.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */