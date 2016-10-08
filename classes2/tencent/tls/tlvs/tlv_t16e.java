package tencent.tls.tlvs;

public class tlv_t16e
  extends tlv_t
{
  int _t16e_body_len = 0;
  
  public tlv_t16e()
  {
    this._cmd = 366;
  }
  
  public byte[] get_tlv_16e(byte[] paramArrayOfByte)
  {
    int i = 64;
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      arrayOfByte = new byte[0];
    }
    if (arrayOfByte.length < 64) {
      i = arrayOfByte.length;
    }
    this._t16e_body_len = i;
    paramArrayOfByte = new byte[this._t16e_body_len];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, this._t16e_body_len);
    set_data(paramArrayOfByte, this._t16e_body_len);
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t16e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */