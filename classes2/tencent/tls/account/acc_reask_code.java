package tencent.tls.account;

import java.nio.ByteBuffer;

public class acc_reask_code
  extends acc_request
{
  public acc_reask_code(int paramInt)
  {
    this._cmd = paramInt;
  }
  
  public byte[] get_request(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length + 1);
    localByteBuffer.put((byte)paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    return super.get_request(localByteBuffer.array());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_reask_code.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */