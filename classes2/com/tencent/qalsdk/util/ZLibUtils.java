package com.tencent.qalsdk.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public abstract class ZLibUtils
{
  public static void compress(byte[] paramArrayOfByte, OutputStream paramOutputStream)
  {
    paramOutputStream = new DeflaterOutputStream(paramOutputStream);
    try
    {
      paramOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
      paramOutputStream.finish();
      paramOutputStream.flush();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new Exception(paramArrayOfByte.toString());
    }
  }
  
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    Deflater localDeflater = new Deflater();
    localDeflater.reset();
    localDeflater.setInput(paramArrayOfByte);
    localDeflater.finish();
    localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
    try
    {
      byte[] arrayOfByte1 = new byte['Ѐ'];
      while (!localDeflater.finished()) {
        localByteArrayOutputStream.write(arrayOfByte1, 0, localDeflater.deflate(arrayOfByte1));
      }
      try
      {
        byte[] arrayOfByte2;
        localByteArrayOutputStream.close();
        throw paramArrayOfByte;
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          localIOException3.printStackTrace();
        }
      }
    }
    catch (Exception localException)
    {
      localException = localException;
      localException.printStackTrace();
      try
      {
        localByteArrayOutputStream.close();
        for (;;)
        {
          localDeflater.end();
          return paramArrayOfByte;
          arrayOfByte2 = localByteArrayOutputStream.toByteArray();
          paramArrayOfByte = arrayOfByte2;
          try
          {
            localByteArrayOutputStream.close();
          }
          catch (IOException localIOException1)
          {
            localIOException1.printStackTrace();
          }
        }
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          localIOException2.printStackTrace();
        }
      }
    }
    finally {}
  }
  
  public static byte[] decompress(InputStream paramInputStream)
  {
    int i = 1024;
    InflaterInputStream localInflaterInputStream = new InflaterInputStream(paramInputStream);
    paramInputStream = new ByteArrayOutputStream(1024);
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        i = localInflaterInputStream.read(arrayOfByte, 0, i);
        if (i <= 0) {
          break;
        }
        paramInputStream.write(arrayOfByte, 0, i);
      }
      return paramInputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  /* Error */
  public static byte[] decompress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 90	java/util/zip/Inflater
    //   3: dup
    //   4: invokespecial 91	java/util/zip/Inflater:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 92	java/util/zip/Inflater:reset	()V
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual 93	java/util/zip/Inflater:setInput	([B)V
    //   17: new 51	java/io/ByteArrayOutputStream
    //   20: dup
    //   21: aload_0
    //   22: arraylength
    //   23: invokespecial 54	java/io/ByteArrayOutputStream:<init>	(I)V
    //   26: astore_0
    //   27: sipush 1024
    //   30: newarray <illegal type>
    //   32: astore_2
    //   33: aload_1
    //   34: invokevirtual 94	java/util/zip/Inflater:finished	()Z
    //   37: ifne +37 -> 74
    //   40: aload_0
    //   41: aload_2
    //   42: iconst_0
    //   43: aload_1
    //   44: aload_2
    //   45: invokevirtual 97	java/util/zip/Inflater:inflate	([B)I
    //   48: invokevirtual 63	java/io/ByteArrayOutputStream:write	([BII)V
    //   51: goto -18 -> 33
    //   54: astore_1
    //   55: new 30	java/lang/Exception
    //   58: dup
    //   59: aload_1
    //   60: invokevirtual 98	java/lang/Exception:toString	()Ljava/lang/String;
    //   63: invokespecial 37	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   66: athrow
    //   67: astore_1
    //   68: aload_0
    //   69: invokevirtual 69	java/io/ByteArrayOutputStream:close	()V
    //   72: aload_1
    //   73: athrow
    //   74: aload_0
    //   75: invokevirtual 76	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   78: astore_2
    //   79: aload_0
    //   80: invokevirtual 69	java/io/ByteArrayOutputStream:close	()V
    //   83: aload_1
    //   84: invokevirtual 99	java/util/zip/Inflater:end	()V
    //   87: aload_2
    //   88: areturn
    //   89: astore_0
    //   90: new 30	java/lang/Exception
    //   93: dup
    //   94: aload_0
    //   95: invokevirtual 34	java/io/IOException:toString	()Ljava/lang/String;
    //   98: invokespecial 37	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   101: athrow
    //   102: astore_0
    //   103: new 30	java/lang/Exception
    //   106: dup
    //   107: aload_0
    //   108: invokevirtual 34	java/io/IOException:toString	()Ljava/lang/String;
    //   111: invokespecial 37	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramArrayOfByte	byte[]
    //   7	37	1	localInflater	java.util.zip.Inflater
    //   54	6	1	localException	Exception
    //   67	17	1	localObject	Object
    //   32	56	2	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   27	33	54	java/lang/Exception
    //   33	51	54	java/lang/Exception
    //   74	79	54	java/lang/Exception
    //   27	33	67	finally
    //   33	51	67	finally
    //   55	67	67	finally
    //   74	79	67	finally
    //   79	83	89	java/io/IOException
    //   68	72	102	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\ZLibUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */