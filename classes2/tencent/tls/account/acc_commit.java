package tencent.tls.account;

import java.nio.ByteBuffer;
import tencent.tls.tools.MD5;
import tencent.tls.tools.cryptor;
import tencent.tls.tools.util;

public class acc_commit
  extends acc_request
{
  public acc_commit(int paramInt)
  {
    this._cmd = paramInt;
  }
  
  public byte[] get_encrypt_token(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 1 + 1 + paramArrayOfByte2.length + 1);
    localByteBuffer.put((byte)paramArrayOfByte1.length);
    localByteBuffer.put(paramArrayOfByte1);
    localByteBuffer.put((byte)paramArrayOfByte2.length);
    localByteBuffer.put(paramArrayOfByte2);
    localByteBuffer.put((byte)0);
    if ((paramArrayOfByte3 == null) || (paramArrayOfByte3.length == 0)) {}
    for (paramArrayOfByte1 = acc_status.STATIC_KEY.getBytes();; paramArrayOfByte1 = MD5.toMD5Byte(paramArrayOfByte3)) {
      return cryptor.encrypt(localByteBuffer.array(), 0, localByteBuffer.capacity(), paramArrayOfByte1);
    }
  }
  
  public byte[] get_request(byte[] paramArrayOfByte1, String paramString, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = util.getS2(MD5.toMD5Byte(paramString), acc_status.msalt);
    if (this._cmd == 102)
    {
      paramString = ByteBuffer.allocate(paramArrayOfByte1.length + 1 + 1 + arrayOfByte.length + 1);
      paramString.put((byte)paramArrayOfByte1.length);
      paramString.put(paramArrayOfByte1);
      paramString.put((byte)arrayOfByte.length);
      paramString.put(arrayOfByte);
      paramString.put((byte)0);
    }
    for (paramArrayOfByte1 = paramString;; paramArrayOfByte1 = paramString)
    {
      return super.get_request(paramArrayOfByte1.array());
      paramArrayOfByte2 = get_encrypt_token(paramArrayOfByte1, arrayOfByte, paramArrayOfByte2);
      paramString = ByteBuffer.allocate(paramArrayOfByte1.length + 1 + 2 + paramArrayOfByte2.length);
      paramString.put((byte)paramArrayOfByte1.length);
      paramString.put(paramArrayOfByte1);
      paramString.putShort((short)paramArrayOfByte2.length);
      paramString.put(paramArrayOfByte2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_commit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */