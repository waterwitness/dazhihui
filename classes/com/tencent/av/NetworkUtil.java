package com.tencent.av;

import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import java.nio.ByteBuffer;
import java.util.Random;

public class NetworkUtil
{
  private static final String tag = "av.NetworkUtil";
  
  public static byte[] formReq(String paramString1, int paramInt1, int paramInt2, String paramString2, byte[] paramArrayOfByte)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getMsfUserInfo(paramString1);
    paramString1 = localIMMsfUserInfo;
    if (localIMMsfUserInfo == null) {
      paramString1 = new IMMsfUserInfo();
    }
    short s1 = (short)IMMsfCoreProxy.get().random.nextInt();
    short s2 = (short)paramInt1;
    long l = paramString1.getTinyid();
    paramString1 = "".getBytes();
    if (paramString2 != null) {
      paramString1 = paramString2.getBytes();
    }
    byte b = (byte)paramString1.length;
    paramString2 = ByteBuffer.allocate(paramString1.length + 11 + 4 + 10 + paramArrayOfByte.length);
    paramString2.putShort((short)0).putShort((short)0).putShort(s1).putInt(0);
    paramString2.putShort(s2).putLong(l).put(b).put(paramString1).putInt(paramInt2);
    paramString2.put(paramArrayOfByte);
    paramString2.flip();
    return paramString2.array();
  }
  
  public static byte[] formReq(String paramString1, int paramInt1, int paramInt2, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getMsfUserInfo(paramString1);
    paramString1 = localIMMsfUserInfo;
    if (localIMMsfUserInfo == null) {
      paramString1 = new IMMsfUserInfo();
    }
    short s1 = (short)IMMsfCoreProxy.get().random.nextInt();
    short s2 = (short)paramInt1;
    long l = paramString1.getTinyid();
    paramString1 = "".getBytes();
    if (paramString2 != null) {
      paramString1 = paramString2.getBytes();
    }
    byte b = (byte)paramString1.length;
    paramInt1 = paramString1.length;
    int i = paramArrayOfByte1.length;
    int j = paramArrayOfByte2.length;
    paramString2 = ByteBuffer.allocate(paramInt1 + 11 + 4 + 10 + 1 + 4 + 4 + i + j + 1);
    paramString2.putShort((short)0).putShort((short)0).putShort(s1).putInt(0);
    paramString2.putShort(s2).putLong(l).put(b).put(paramString1).putInt(paramInt2);
    paramString2.put((byte)40).putInt(i).putInt(j).put(paramArrayOfByte1).put(paramArrayOfByte2).put((byte)41);
    paramString2.flip();
    return paramString2.array();
  }
  
  public static byte[] parseRsp(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.getShort();
    paramArrayOfByte.getShort();
    paramArrayOfByte.getShort();
    paramArrayOfByte.getInt();
    paramArrayOfByte.getShort();
    paramArrayOfByte.getInt();
    int i = paramArrayOfByte.getShort();
    if (i > paramArrayOfByte.remaining()) {}
    int j;
    do
    {
      do
      {
        return null;
        paramArrayOfByte.get(new byte[i], 0, i);
        paramArrayOfByte.get();
        i = paramArrayOfByte.getInt();
        j = paramArrayOfByte.getInt();
      } while (i > paramArrayOfByte.remaining());
      paramArrayOfByte.get(new byte[i], 0, i);
    } while (j > paramArrayOfByte.remaining());
    byte[] arrayOfByte = new byte[j];
    paramArrayOfByte.get(arrayOfByte, 0, j);
    return arrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\NetworkUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */