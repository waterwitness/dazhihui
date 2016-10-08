package com.tencent.open.utils;

import java.io.ByteArrayInputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

class ApkExternalInfoTool$ApkExternalInfo
{
  Properties a = new Properties();
  byte[] b;
  
  void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    ByteBuffer localByteBuffer;
    int i;
    do
    {
      int j;
      do
      {
        do
        {
          return;
          localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
          i = ApkExternalInfoTool.a().getBytes().length;
          arrayOfByte = new byte[i];
          localByteBuffer.get(arrayOfByte);
          if (!ApkExternalInfoTool.a().equals(new ZipShort(arrayOfByte))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(paramArrayOfByte) + "]");
          }
        } while (paramArrayOfByte.length - i <= 2);
        arrayOfByte = new byte[2];
        localByteBuffer.get(arrayOfByte);
        j = new ZipShort(arrayOfByte).getValue();
      } while (paramArrayOfByte.length - i - 2 < j);
      byte[] arrayOfByte = new byte[j];
      localByteBuffer.get(arrayOfByte);
      this.a.load(new ByteArrayInputStream(arrayOfByte));
      i = paramArrayOfByte.length - i - j - 2;
    } while (i <= 0);
    this.b = new byte[i];
    localByteBuffer.get(this.b);
  }
  
  public String toString()
  {
    return "ApkExternalInfo [p=" + this.a + ", otherData=" + Arrays.toString(this.b) + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\ApkExternalInfoTool$ApkExternalInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */