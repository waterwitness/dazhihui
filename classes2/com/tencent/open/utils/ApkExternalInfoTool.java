package com.tencent.open.utils;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.zip.ZipException;

public final class ApkExternalInfoTool
{
  public static final String CHANNELID = "channelNo";
  private static final ZipLong a = new ZipLong(101010256L);
  private static final ZipShort b = new ZipShort(38651);
  
  private static byte[] a(RandomAccessFile paramRandomAccessFile)
  {
    int j = 1;
    long l = paramRandomAccessFile.length() - 22L;
    paramRandomAccessFile.seek(l);
    byte[] arrayOfByte = a.getBytes();
    int i = paramRandomAccessFile.read();
    if (i != -1) {
      if ((i != arrayOfByte[0]) || (paramRandomAccessFile.read() != arrayOfByte[1]) || (paramRandomAccessFile.read() != arrayOfByte[2]) || (paramRandomAccessFile.read() != arrayOfByte[3])) {}
    }
    for (i = j;; i = 0)
    {
      if (i == 0)
      {
        throw new ZipException("archive is not a ZIP archive");
        l -= 1L;
        paramRandomAccessFile.seek(l);
        i = paramRandomAccessFile.read();
        break;
      }
      paramRandomAccessFile.seek(16L + l + 4L);
      arrayOfByte = new byte[2];
      paramRandomAccessFile.readFully(arrayOfByte);
      i = new ZipShort(arrayOfByte).getValue();
      if (i == 0) {
        return null;
      }
      arrayOfByte = new byte[i];
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    }
  }
  
  public static String read(File paramFile, String paramString)
  {
    ApkExternalInfoTool.ApkExternalInfo localApkExternalInfo = null;
    try
    {
      localRandomAccessFile = new RandomAccessFile(paramFile, "r");
      if (paramString == null) {
        break label82;
      }
    }
    finally
    {
      try
      {
        paramFile = a(localRandomAccessFile);
        if (paramFile == null)
        {
          paramFile = localApkExternalInfo;
          if (localRandomAccessFile != null)
          {
            localRandomAccessFile.close();
            paramFile = localApkExternalInfo;
          }
        }
        do
        {
          return paramFile;
          localApkExternalInfo = new ApkExternalInfoTool.ApkExternalInfo(null);
          localApkExternalInfo.a(paramFile);
          paramString = localApkExternalInfo.a.getProperty(paramString);
          paramFile = paramString;
        } while (localRandomAccessFile == null);
        localRandomAccessFile.close();
        return paramString;
      }
      finally
      {
        for (;;)
        {
          RandomAccessFile localRandomAccessFile;
          paramString = localRandomAccessFile;
        }
      }
      paramFile = finally;
      paramString = null;
    }
    paramString.close();
    label82:
    throw paramFile;
  }
  
  public static String readChannelId(File paramFile)
  {
    return read(paramFile, "channelNo");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\ApkExternalInfoTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */