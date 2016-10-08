package tencent.tls.account;

import java.nio.ByteBuffer;

public class acc_verify_code
  extends acc_request
{
  public acc_verify_code(int paramInt)
  {
    this._cmd = paramInt;
  }
  
  public byte[] get_request(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2 = get_encrypt_token(paramArrayOfByte1, paramArrayOfByte2);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 1 + 2 + paramArrayOfByte2.length);
    localByteBuffer.put((byte)paramArrayOfByte1.length);
    localByteBuffer.put(paramArrayOfByte1);
    localByteBuffer.putShort((short)paramArrayOfByte2.length);
    localByteBuffer.put(paramArrayOfByte2);
    return super.get_request(localByteBuffer.array());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_verify_code.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */