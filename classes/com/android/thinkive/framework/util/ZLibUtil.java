package com.android.thinkive.framework.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ZLibUtil
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
      paramArrayOfByte.printStackTrace();
    }
  }
  
  /* Error */
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 36	java/util/zip/Deflater
    //   3: dup
    //   4: invokespecial 37	java/util/zip/Deflater:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual 40	java/util/zip/Deflater:reset	()V
    //   12: aload_2
    //   13: aload_0
    //   14: invokevirtual 44	java/util/zip/Deflater:setInput	([B)V
    //   17: aload_2
    //   18: invokevirtual 45	java/util/zip/Deflater:finish	()V
    //   21: new 47	java/io/ByteArrayOutputStream
    //   24: dup
    //   25: aload_0
    //   26: arraylength
    //   27: invokespecial 50	java/io/ByteArrayOutputStream:<init>	(I)V
    //   30: astore_3
    //   31: sipush 1024
    //   34: newarray <illegal type>
    //   36: astore_1
    //   37: aload_2
    //   38: invokevirtual 54	java/util/zip/Deflater:finished	()Z
    //   41: ifeq +20 -> 61
    //   44: aload_3
    //   45: invokevirtual 58	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   48: astore_1
    //   49: aload_1
    //   50: astore_0
    //   51: aload_3
    //   52: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   55: aload_2
    //   56: invokevirtual 64	java/util/zip/Deflater:end	()V
    //   59: aload_0
    //   60: areturn
    //   61: aload_3
    //   62: aload_1
    //   63: iconst_0
    //   64: aload_2
    //   65: aload_1
    //   66: invokevirtual 68	java/util/zip/Deflater:deflate	([B)I
    //   69: invokevirtual 69	java/io/ByteArrayOutputStream:write	([BII)V
    //   72: goto -35 -> 37
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual 70	java/lang/Exception:printStackTrace	()V
    //   80: aload_3
    //   81: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   84: goto -29 -> 55
    //   87: astore_1
    //   88: aload_1
    //   89: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   92: goto -37 -> 55
    //   95: astore_0
    //   96: aload_3
    //   97: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   100: aload_0
    //   101: athrow
    //   102: astore_1
    //   103: aload_1
    //   104: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   107: goto -7 -> 100
    //   110: astore_1
    //   111: aload_1
    //   112: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   115: goto -60 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	paramArrayOfByte	byte[]
    //   36	30	1	arrayOfByte	byte[]
    //   75	2	1	localException	Exception
    //   87	2	1	localIOException1	IOException
    //   102	2	1	localIOException2	IOException
    //   110	2	1	localIOException3	IOException
    //   7	58	2	localDeflater	java.util.zip.Deflater
    //   30	67	3	localByteArrayOutputStream	ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   31	37	75	java/lang/Exception
    //   37	49	75	java/lang/Exception
    //   61	72	75	java/lang/Exception
    //   80	84	87	java/io/IOException
    //   31	37	95	finally
    //   37	49	95	finally
    //   61	72	95	finally
    //   76	80	95	finally
    //   96	100	102	java/io/IOException
    //   51	55	110	java/io/IOException
  }
  
  public static byte[] decompress(InputStream paramInputStream)
  {
    int i = 1024;
    InflaterInputStream localInflaterInputStream = new InflaterInputStream(paramInputStream);
    paramInputStream = new ByteArrayOutputStream(1024);
    for (;;)
    {
      try
      {
        arrayOfByte = new byte['Ѐ'];
        i = localInflaterInputStream.read(arrayOfByte, 0, i);
        if (i > 0) {
          continue;
        }
      }
      catch (IOException localIOException)
      {
        byte[] arrayOfByte;
        localIOException.printStackTrace();
        continue;
      }
      return paramInputStream.toByteArray();
      paramInputStream.write(arrayOfByte, 0, i);
    }
  }
  
  /* Error */
  public static byte[] decompress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 83	java/util/zip/Inflater
    //   3: dup
    //   4: invokespecial 84	java/util/zip/Inflater:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual 85	java/util/zip/Inflater:reset	()V
    //   12: aload_2
    //   13: aload_0
    //   14: invokevirtual 86	java/util/zip/Inflater:setInput	([B)V
    //   17: new 47	java/io/ByteArrayOutputStream
    //   20: dup
    //   21: aload_0
    //   22: arraylength
    //   23: invokespecial 50	java/io/ByteArrayOutputStream:<init>	(I)V
    //   26: astore_3
    //   27: sipush 1024
    //   30: newarray <illegal type>
    //   32: astore_1
    //   33: aload_2
    //   34: invokevirtual 87	java/util/zip/Inflater:finished	()Z
    //   37: ifeq +20 -> 57
    //   40: aload_3
    //   41: invokevirtual 58	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   44: astore_1
    //   45: aload_1
    //   46: astore_0
    //   47: aload_3
    //   48: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   51: aload_2
    //   52: invokevirtual 88	java/util/zip/Inflater:end	()V
    //   55: aload_0
    //   56: areturn
    //   57: aload_3
    //   58: aload_1
    //   59: iconst_0
    //   60: aload_2
    //   61: aload_1
    //   62: invokevirtual 91	java/util/zip/Inflater:inflate	([B)I
    //   65: invokevirtual 69	java/io/ByteArrayOutputStream:write	([BII)V
    //   68: goto -35 -> 33
    //   71: astore_1
    //   72: aload_1
    //   73: invokevirtual 70	java/lang/Exception:printStackTrace	()V
    //   76: aload_3
    //   77: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   80: goto -29 -> 51
    //   83: astore_1
    //   84: aload_1
    //   85: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   88: goto -37 -> 51
    //   91: astore_0
    //   92: aload_3
    //   93: invokevirtual 61	java/io/ByteArrayOutputStream:close	()V
    //   96: aload_0
    //   97: athrow
    //   98: astore_1
    //   99: aload_1
    //   100: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   103: goto -7 -> 96
    //   106: astore_1
    //   107: aload_1
    //   108: invokevirtual 31	java/io/IOException:printStackTrace	()V
    //   111: goto -60 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramArrayOfByte	byte[]
    //   32	30	1	arrayOfByte	byte[]
    //   71	2	1	localException	Exception
    //   83	2	1	localIOException1	IOException
    //   98	2	1	localIOException2	IOException
    //   106	2	1	localIOException3	IOException
    //   7	54	2	localInflater	java.util.zip.Inflater
    //   26	67	3	localByteArrayOutputStream	ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   27	33	71	java/lang/Exception
    //   33	45	71	java/lang/Exception
    //   57	68	71	java/lang/Exception
    //   76	80	83	java/io/IOException
    //   27	33	91	finally
    //   33	45	91	finally
    //   57	68	91	finally
    //   72	76	91	finally
    //   92	96	98	java/io/IOException
    //   47	51	106	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\ZLibUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */