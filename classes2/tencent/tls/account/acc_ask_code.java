package tencent.tls.account;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import tencent.tls.tools.util;

public class acc_ask_code
  extends acc_request
{
  public acc_ask_code(int paramInt)
  {
    this._cmd = paramInt;
  }
  
  public byte[] get_request(int paramInt1, String paramString1, byte[] paramArrayOfByte1, String paramString2, int paramInt2, long paramLong, byte[] paramArrayOfByte2)
  {
    if (paramString1 == null) {}
    while (paramArrayOfByte1 == null) {
      return null;
    }
    String str = paramString2;
    if (paramString2 == null) {
      str = "";
    }
    Object localObject = Build.VERSION.RELEASE;
    paramString2 = (String)localObject;
    if (localObject == null) {
      paramString2 = "";
    }
    localObject = ByteBuffer.allocate(paramString1.length() + 5 + 1 + (paramString2.length() + 1) + (paramArrayOfByte1.length + 1) + (str.length() + 1) + 4 + 4 + 4 + 1 + paramArrayOfByte2.length + 1 + (acc_status.apk_sig.length + 2 + 4 + acc_status.apk_id.length));
    ((ByteBuffer)localObject).putInt(paramInt1);
    ((ByteBuffer)localObject).put((byte)paramString1.length());
    ((ByteBuffer)localObject).put(paramString1.getBytes());
    ((ByteBuffer)localObject).put((byte)this._os_type);
    ((ByteBuffer)localObject).put((byte)paramString2.length());
    ((ByteBuffer)localObject).put(paramString2.getBytes());
    ((ByteBuffer)localObject).put((byte)paramArrayOfByte1.length);
    ((ByteBuffer)localObject).put(paramArrayOfByte1);
    ((ByteBuffer)localObject).put((byte)str.length());
    ((ByteBuffer)localObject).put(str.getBytes());
    ((ByteBuffer)localObject).putInt(paramInt2);
    ((ByteBuffer)localObject).putInt(acc_status.lang);
    ((ByteBuffer)localObject).putInt((int)paramLong);
    ((ByteBuffer)localObject).put((byte)paramArrayOfByte2.length);
    ((ByteBuffer)localObject).put(paramArrayOfByte2);
    ((ByteBuffer)localObject).put((byte)1);
    ((ByteBuffer)localObject).put((byte)1);
    ((ByteBuffer)localObject).put((byte)(acc_status.apk_sig.length + 4 + acc_status.apk_id.length));
    ((ByteBuffer)localObject).put(acc_status.apk_sig);
    ((ByteBuffer)localObject).putInt(acc_status.apk_id.length);
    ((ByteBuffer)localObject).put(acc_status.apk_id);
    return super.get_request(((ByteBuffer)localObject).array());
  }
  
  public byte[] get_request(int paramInt1, String paramString1, byte[] paramArrayOfByte1, String paramString2, int paramInt2, long paramLong, byte[] paramArrayOfByte2, TLSOpenAccountInfo paramTLSOpenAccountInfo)
  {
    if (paramString1 == null) {
      return null;
    }
    if (paramArrayOfByte1 == null) {
      return null;
    }
    if (paramTLSOpenAccountInfo.checkInvalid()) {
      return null;
    }
    String str = paramString2;
    if (paramString2 == null) {
      str = "";
    }
    byte[] arrayOfByte1 = paramTLSOpenAccountInfo.openappid.getBytes();
    byte[] arrayOfByte2 = paramTLSOpenAccountInfo.openid.getBytes();
    byte[] arrayOfByte3 = paramTLSOpenAccountInfo.access_token.getBytes();
    byte[] arrayOfByte4 = new byte[4];
    util.int32_to_buf(arrayOfByte4, 0, paramTLSOpenAccountInfo.openAccountType);
    paramTLSOpenAccountInfo = Build.VERSION.RELEASE;
    paramString2 = paramTLSOpenAccountInfo;
    if (paramTLSOpenAccountInfo == null) {
      paramString2 = "";
    }
    paramTLSOpenAccountInfo = ByteBuffer.allocate(paramString1.length() + 5 + 1 + (paramString2.length() + 1) + (paramArrayOfByte1.length + 1) + (str.length() + 1) + 4 + 4 + 4 + 1 + paramArrayOfByte2.length + 1 + (acc_status.apk_sig.length + 2 + 4 + acc_status.apk_id.length + 6 + (arrayOfByte1.length + 2) + (arrayOfByte2.length + 2) + (arrayOfByte3.length + 2)));
    paramTLSOpenAccountInfo.putInt(paramInt1);
    paramTLSOpenAccountInfo.put((byte)paramString1.length());
    paramTLSOpenAccountInfo.put(paramString1.getBytes());
    paramTLSOpenAccountInfo.put((byte)this._os_type);
    paramTLSOpenAccountInfo.put((byte)paramString2.length());
    paramTLSOpenAccountInfo.put(paramString2.getBytes());
    paramTLSOpenAccountInfo.put((byte)paramArrayOfByte1.length);
    paramTLSOpenAccountInfo.put(paramArrayOfByte1);
    paramTLSOpenAccountInfo.put((byte)str.length());
    paramTLSOpenAccountInfo.put(str.getBytes());
    paramTLSOpenAccountInfo.putInt(paramInt2);
    paramTLSOpenAccountInfo.putInt(acc_status.lang);
    paramTLSOpenAccountInfo.putInt((int)paramLong);
    paramTLSOpenAccountInfo.put((byte)paramArrayOfByte2.length);
    paramTLSOpenAccountInfo.put(paramArrayOfByte2);
    paramTLSOpenAccountInfo.put((byte)5);
    paramTLSOpenAccountInfo.put((byte)1);
    paramTLSOpenAccountInfo.put((byte)(acc_status.apk_sig.length + 4 + acc_status.apk_id.length));
    paramTLSOpenAccountInfo.put(acc_status.apk_sig);
    paramTLSOpenAccountInfo.putInt(acc_status.apk_id.length);
    paramTLSOpenAccountInfo.put(acc_status.apk_id);
    paramTLSOpenAccountInfo.put((byte)2);
    paramTLSOpenAccountInfo.put((byte)4);
    paramTLSOpenAccountInfo.put(arrayOfByte4);
    paramTLSOpenAccountInfo.put((byte)3);
    paramTLSOpenAccountInfo.put((byte)arrayOfByte1.length);
    paramTLSOpenAccountInfo.put(arrayOfByte1);
    paramTLSOpenAccountInfo.put((byte)4);
    paramTLSOpenAccountInfo.put((byte)arrayOfByte2.length);
    paramTLSOpenAccountInfo.put(arrayOfByte2);
    paramTLSOpenAccountInfo.put((byte)5);
    paramTLSOpenAccountInfo.put((byte)arrayOfByte3.length);
    paramTLSOpenAccountInfo.put(arrayOfByte3);
    return super.get_request(paramTLSOpenAccountInfo.array());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\acc_ask_code.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */