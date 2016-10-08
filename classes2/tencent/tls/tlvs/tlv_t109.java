package tencent.tls.tlvs;

public class tlv_t109
  extends tlv_t
{
  int _t109_body_len = 0;
  
  public tlv_t109()
  {
    this._cmd = 265;
  }
  
  public byte[] get_tlv_109(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[16];
    }
    this._t109_body_len = arrayOfByte.length;
    paramArrayOfByte = new byte[this._t109_body_len];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, arrayOfByte.length);
    set_data(paramArrayOfByte, this._t109_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t109.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */