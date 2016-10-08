package com.kwl.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamUtils
{
  public static InputStream Byte2InputStream(byte[] paramArrayOfByte)
  {
    return new ByteArrayInputStream(paramArrayOfByte);
  }
  
  public static boolean closeInputStream(InputStream paramInputStream)
  {
    boolean bool = false;
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      bool = true;
      return bool;
    }
    catch (IOException paramInputStream)
    {
      paramInputStream.printStackTrace();
    }
    return false;
  }
  
  public static boolean closeOutputStream(OutputStream paramOutputStream)
  {
    boolean bool = false;
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      bool = true;
      return bool;
    }
    catch (IOException paramOutputStream)
    {
      paramOutputStream.printStackTrace();
    }
    return false;
  }
  
  public static InputStream getAssetsAsStream(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getResources().getAssets().open(paramString);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static InputStream getFileAsStream(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.openFileInput(paramString);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static InputStream getResourceAsStream(String paramString)
  {
    try
    {
      paramString = FileUtil.class.getClassLoader().getResourceAsStream(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public static byte[] parseStream2Array(InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 78	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 79	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual 83	java/io/InputStream:available	()I
    //   12: newarray <illegal type>
    //   14: astore_2
    //   15: aload_0
    //   16: aload_2
    //   17: invokevirtual 87	java/io/InputStream:read	([B)I
    //   20: iconst_m1
    //   21: if_icmpne +14 -> 35
    //   24: aload_1
    //   25: invokevirtual 91	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   28: astore_1
    //   29: aload_0
    //   30: invokevirtual 25	java/io/InputStream:close	()V
    //   33: aload_1
    //   34: areturn
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 94	java/io/ByteArrayOutputStream:write	([B)V
    //   40: goto -25 -> 15
    //   43: astore_1
    //   44: aload_0
    //   45: invokevirtual 25	java/io/InputStream:close	()V
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	paramInputStream	InputStream
    //   7	29	1	localObject1	Object
    //   43	6	1	localObject2	Object
    //   14	23	2	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   15	29	43	finally
    //   35	40	43	finally
  }
  
  public static void readAll(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    for (;;)
    {
      if (i <= 0) {}
      int j;
      do
      {
        return;
        j = paramInputStream.read(paramArrayOfByte, paramArrayOfByte.length - i, i);
      } while (j < 0);
      i -= j;
    }
  }
  
  public static void skipAll(InputStream paramInputStream, int paramInt)
  {
    for (;;)
    {
      if (paramInt <= 0) {
        return;
      }
      long l = paramInputStream.skip(paramInt);
      if (l < 0L) {
        throw new IOException("Socket closed.");
      }
      paramInt = (int)(paramInt - l);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\StreamUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */