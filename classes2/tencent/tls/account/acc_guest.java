package tencent.tls.account;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import tencent.tls.tools.MD5;
import tencent.tls.tools.util;

public class acc_guest
  extends acc_request
{
  public acc_guest()
  {
    this._cmd = 118;
  }
  
  public byte[] get_request(int paramInt1, byte[] paramArrayOfByte1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null) {
      return null;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    Object localObject = Build.VERSION.RELEASE;
    paramString = (String)localObject;
    if (localObject == null) {
      paramString = "";
    }
    acc_status.mpasswd = util.get_mpasswd();
    localObject = MD5.toMD5Byte(acc_status.mpasswd);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramString.length() + 1 + 5 + (paramArrayOfByte1.length + 1) + (str.length() + 1) + 4 + 4 + 4 + 1 + paramArrayOfByte2.length + 1 + localObject.length + 1 + (acc_status.apk_sig.length + 2 + 4 + acc_status.apk_id.length));
    localByteBuffer.putInt(paramInt1);
    localByteBuffer.put((byte)this._os_type);
    localByteBuffer.put((byte)paramString.length());
    localByteBuffer.put(paramString.getBytes());
    localByteBuffer.put((byte)paramArrayOfByte1.length);
    localByteBuffer.put(paramArrayOfByte1);
    localByteBuffer.put((byte)str.length());
    localByteBuffer.put(str.getBytes());
    localByteBuffer.putInt(paramInt2);
    localByteBuffer.putInt(acc_status.lang);
    localByteBuffer.putInt((int)paramLong);
    localByteBuffer.put((byte)paramArrayOfByte2.length);
    localByteBuffer.put(paramArrayOfByte2);
    localByteBuffer.put((byte)localObject.length);
    localByteBuffer.put((byte[])localObject);
    localByteBuffer.put((byte)1);
    localByteBuffer.put((byte)1);
    localByteBuffer.put((byte)(acc_status.apk_sig.length + 4 + acc_status.apk_id.length));
    localByteBuffer.put(acc_status.apk_sig);
    localByteBuffer.putInt(acc_status.apk_id.length);
    localByteBuffer.put(acc_status.apk_id);
    return super.get_request(localByteBuffer.array());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_guest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */