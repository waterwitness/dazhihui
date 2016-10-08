package tencent.tls.tlvs;

import java.nio.ByteBuffer;

public class tlv_t509
  extends tlv_t
{
  public tlv_t509()
  {
    this._cmd = 1289;
  }
  
  public byte[] get_tlv_509(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 2 + paramArrayOfByte2.length);
    localByteBuffer.put(paramArrayOfByte1);
    localByteBuffer.putShort((short)paramArrayOfByte2.length);
    localByteBuffer.put(paramArrayOfByte2);
    set_data(localByteBuffer.array(), localByteBuffer.limit());
    return get_buf();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tlvs\tlv_t509.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */