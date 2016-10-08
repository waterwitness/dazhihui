package com.tencent.qalsdk.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
  private byte[] buffer = new byte[64];
  private byte[] digest = new byte[16];
  public String digestHexStr;
  
  public static long b2iu(byte paramByte)
  {
    if (paramByte < 0) {
      return paramByte & 0xFF;
    }
    return paramByte;
  }
  
  public static String byteHEX(byte paramByte)
  {
    char[] arrayOfChar = new char[16];
    char[] tmp6_5 = arrayOfChar;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 65;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 66;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 67;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 68;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 69;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 70;
    tmp90_84;
    return new String(new char[] { arrayOfChar[(paramByte >>> 4 & 0xF)], arrayOfChar[(paramByte & 0xF)] });
  }
  
  public static byte[] getFileMd5(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return null;
      try
      {
        File localFile = new File(paramString);
        if (localFile.exists())
        {
          paramString = getPartfileMd5(paramString, localFile.length());
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
    return null;
  }
  
  /* Error */
  public static byte[] getPartfileMd5(String paramString, long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload 6
    //   5: astore_3
    //   6: aload_0
    //   7: ifnull +22 -> 29
    //   10: aload 6
    //   12: astore_3
    //   13: aload_0
    //   14: invokevirtual 52	java/lang/String:length	()I
    //   17: ifeq +12 -> 29
    //   20: lload_1
    //   21: lconst_0
    //   22: lcmp
    //   23: ifge +8 -> 31
    //   26: aload 6
    //   28: astore_3
    //   29: aload_3
    //   30: areturn
    //   31: new 75	java/io/FileInputStream
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 76	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   39: astore 4
    //   41: aload 4
    //   43: astore_3
    //   44: new 54	java/io/File
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 57	java/io/File:<init>	(Ljava/lang/String;)V
    //   52: astore_0
    //   53: aload 4
    //   55: astore_3
    //   56: aload_0
    //   57: invokevirtual 61	java/io/File:exists	()Z
    //   60: ifeq +63 -> 123
    //   63: aload 4
    //   65: astore_3
    //   66: aload_0
    //   67: invokevirtual 64	java/io/File:length	()J
    //   70: lstore 9
    //   72: lload_1
    //   73: lconst_0
    //   74: lcmp
    //   75: ifeq +134 -> 209
    //   78: lload_1
    //   79: lstore 7
    //   81: lload 9
    //   83: lload_1
    //   84: lcmp
    //   85: ifge +6 -> 91
    //   88: goto +121 -> 209
    //   91: aload 4
    //   93: astore_3
    //   94: aload 4
    //   96: lload 7
    //   98: invokestatic 80	com/tencent/qalsdk/util/MD5:toMD5Byte	(Ljava/io/InputStream;J)[B
    //   101: astore_0
    //   102: aload_0
    //   103: astore_3
    //   104: aload 4
    //   106: ifnull -77 -> 29
    //   109: aload 4
    //   111: invokevirtual 83	java/io/FileInputStream:close	()V
    //   114: aload_0
    //   115: areturn
    //   116: astore_3
    //   117: aload_3
    //   118: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   121: aload_0
    //   122: areturn
    //   123: aload 6
    //   125: astore_3
    //   126: aload 4
    //   128: ifnull -99 -> 29
    //   131: aload 4
    //   133: invokevirtual 83	java/io/FileInputStream:close	()V
    //   136: aconst_null
    //   137: areturn
    //   138: astore_0
    //   139: aload_0
    //   140: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   143: aconst_null
    //   144: areturn
    //   145: astore 5
    //   147: aconst_null
    //   148: astore_0
    //   149: aload_0
    //   150: astore_3
    //   151: aload 5
    //   153: invokevirtual 71	java/lang/Exception:printStackTrace	()V
    //   156: aload 6
    //   158: astore_3
    //   159: aload_0
    //   160: ifnull -131 -> 29
    //   163: aload_0
    //   164: invokevirtual 83	java/io/FileInputStream:close	()V
    //   167: aconst_null
    //   168: areturn
    //   169: astore_0
    //   170: aload_0
    //   171: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   174: aconst_null
    //   175: areturn
    //   176: astore_0
    //   177: aconst_null
    //   178: astore_3
    //   179: aload_3
    //   180: ifnull +7 -> 187
    //   183: aload_3
    //   184: invokevirtual 83	java/io/FileInputStream:close	()V
    //   187: aload_0
    //   188: athrow
    //   189: astore_3
    //   190: aload_3
    //   191: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   194: goto -7 -> 187
    //   197: astore_0
    //   198: goto -19 -> 179
    //   201: astore 5
    //   203: aload 4
    //   205: astore_0
    //   206: goto -57 -> 149
    //   209: lload 9
    //   211: lstore 7
    //   213: goto -122 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramString	String
    //   0	216	1	paramLong	long
    //   5	99	3	localObject1	Object
    //   116	2	3	localIOException1	IOException
    //   125	59	3	localObject2	Object
    //   189	2	3	localIOException2	IOException
    //   39	165	4	localFileInputStream	java.io.FileInputStream
    //   145	7	5	localException1	Exception
    //   201	1	5	localException2	Exception
    //   1	156	6	localObject3	Object
    //   79	133	7	l1	long
    //   70	140	9	l2	long
    // Exception table:
    //   from	to	target	type
    //   109	114	116	java/io/IOException
    //   131	136	138	java/io/IOException
    //   31	41	145	java/lang/Exception
    //   163	167	169	java/io/IOException
    //   31	41	176	finally
    //   183	187	189	java/io/IOException
    //   44	53	197	finally
    //   56	63	197	finally
    //   66	72	197	finally
    //   94	102	197	finally
    //   151	156	197	finally
    //   44	53	201	java/lang/Exception
    //   56	63	201	java/lang/Exception
    //   66	72	201	java/lang/Exception
    //   94	102	201	java/lang/Exception
  }
  
  public static byte[] sysGetBufferMd5(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 == 0)) {
      return null;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public static byte[] sysGetStremMd5(InputStream paramInputStream, long paramLong)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 6
    //   3: aload_0
    //   4: ifnull +9 -> 13
    //   7: lload_1
    //   8: lconst_0
    //   9: lcmp
    //   10: ifne +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: ldc 90
    //   17: invokestatic 96	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   20: astore_3
    //   21: ldc 106
    //   23: newarray <illegal type>
    //   25: astore 4
    //   27: aload 4
    //   29: arraylength
    //   30: istore 5
    //   32: lload 6
    //   34: lload_1
    //   35: lcmp
    //   36: ifge +58 -> 94
    //   39: aload 4
    //   41: arraylength
    //   42: i2l
    //   43: lload 6
    //   45: ladd
    //   46: lload_1
    //   47: lcmp
    //   48: ifle +10 -> 58
    //   51: lload_1
    //   52: lload 6
    //   54: lsub
    //   55: l2i
    //   56: istore 5
    //   58: aload_0
    //   59: aload 4
    //   61: iconst_0
    //   62: iload 5
    //   64: invokevirtual 112	java/io/InputStream:read	([BII)I
    //   67: istore 5
    //   69: iload 5
    //   71: iflt -58 -> 13
    //   74: aload_3
    //   75: aload 4
    //   77: iconst_0
    //   78: iload 5
    //   80: invokevirtual 100	java/security/MessageDigest:update	([BII)V
    //   83: lload 6
    //   85: iload 5
    //   87: i2l
    //   88: ladd
    //   89: lstore 6
    //   91: goto -59 -> 32
    //   94: aload_0
    //   95: invokevirtual 113	java/io/InputStream:close	()V
    //   98: aload_3
    //   99: invokevirtual 103	java/security/MessageDigest:digest	()[B
    //   102: astore_0
    //   103: aload_0
    //   104: areturn
    //   105: astore_0
    //   106: aload_0
    //   107: invokevirtual 104	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   110: aconst_null
    //   111: areturn
    //   112: astore_0
    //   113: aload_0
    //   114: invokevirtual 84	java/io/IOException:printStackTrace	()V
    //   117: aconst_null
    //   118: areturn
    //   119: astore_0
    //   120: goto -22 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramInputStream	InputStream
    //   0	123	1	paramLong	long
    //   20	79	3	localMessageDigest	MessageDigest
    //   25	51	4	arrayOfByte	byte[]
    //   30	56	5	i	int
    //   1	89	6	l	long
    // Exception table:
    //   from	to	target	type
    //   15	32	105	java/security/NoSuchAlgorithmException
    //   39	51	105	java/security/NoSuchAlgorithmException
    //   58	69	105	java/security/NoSuchAlgorithmException
    //   74	83	105	java/security/NoSuchAlgorithmException
    //   94	98	105	java/security/NoSuchAlgorithmException
    //   98	103	105	java/security/NoSuchAlgorithmException
    //   15	32	112	java/io/IOException
    //   39	51	112	java/io/IOException
    //   58	69	112	java/io/IOException
    //   74	83	112	java/io/IOException
    //   94	98	112	java/io/IOException
    //   98	103	112	java/io/IOException
    //   94	98	119	java/lang/Exception
  }
  
  public static String toMD5(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      paramString = null;
    }
    do
    {
      return paramString;
      try
      {
        localObject = paramString.getBytes("ISO8859_1");
        paramString = (String)localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          Object localObject;
          byte[] arrayOfByte;
          paramString = paramString.getBytes();
        }
      }
      arrayOfByte = new MD5().getMD5(paramString, 0, paramString.length);
      localObject = "";
      paramString = (String)localObject;
    } while (arrayOfByte == null);
    for (;;)
    {
      paramString = (String)localObject;
      if (i >= 16) {
        break;
      }
      localObject = (String)localObject + byteHEX(arrayOfByte[i]);
      i += 1;
    }
  }
  
  public static String toMD5(byte[] paramArrayOfByte)
  {
    Object localObject;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      localObject = null;
      return (String)localObject;
    }
    byte[] arrayOfByte = new MD5().getMD5(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = "";
    int i = 0;
    for (;;)
    {
      localObject = paramArrayOfByte;
      if (i >= 16) {
        break;
      }
      paramArrayOfByte = paramArrayOfByte + byteHEX(arrayOfByte[i]);
      i += 1;
    }
  }
  
  public static byte[] toMD5Byte(InputStream paramInputStream, long paramLong)
  {
    return new MD5().getMD5(paramInputStream, paramLong);
  }
  
  public static byte[] toMD5Byte(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO8859_1");
      paramString = arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        paramString = paramString.getBytes();
      }
    }
    return new MD5().getMD5(paramString, 0, paramString.length);
  }
  
  public static byte[] toMD5Byte(byte[] paramArrayOfByte)
  {
    return toMD5Byte(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static byte[] toMD5Byte(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new MD5().getMD5(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  native byte[] getBufferMd5(byte[] paramArrayOfByte);
  
  public byte[] getMD5(InputStream paramInputStream, long paramLong)
  {
    if ((paramInputStream == null) || (paramLong < 0L)) {}
    long l1;
    do
    {
      for (;;)
      {
        return null;
        try
        {
          long l2 = paramInputStream.available();
          if (paramLong != 0L)
          {
            l1 = paramLong;
            if (l2 != 0L)
            {
              l1 = paramLong;
              if (paramInputStream.available() >= paramLong) {}
            }
          }
          else
          {
            int i = paramInputStream.available();
            l1 = i;
          }
          if (l1 != 0L)
          {
            byte[] arrayOfByte1 = sysGetStremMd5(paramInputStream, l1);
            if (arrayOfByte1 == null) {
              break label114;
            }
            this.digest = arrayOfByte1;
            return this.digest;
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    } while (paramInputStream == null);
    try
    {
      paramInputStream.close();
      return null;
    }
    catch (IOException paramInputStream)
    {
      paramInputStream.printStackTrace();
      return null;
    }
    try
    {
      label114:
      byte[] arrayOfByte2 = getStremMd5(paramInputStream, l1);
      localObject = arrayOfByte2;
      paramInputStream.close();
      localObject = arrayOfByte2;
    }
    catch (Exception paramInputStream)
    {
      for (;;)
      {
        Object localObject;
        paramInputStream.printStackTrace();
      }
    }
    if (localObject != null)
    {
      this.digest = ((byte[])localObject);
      return this.digest;
    }
    return this.digest;
  }
  
  public byte[] getMD5(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte == null) || (paramInt2 == 0) || (paramInt1 < 0)) {
      return null;
    }
    byte[] arrayOfByte = sysGetBufferMd5(paramArrayOfByte, paramInt1, paramInt2);
    if (arrayOfByte != null)
    {
      this.digest = arrayOfByte;
      return this.digest;
    }
    try
    {
      paramArrayOfByte = getBufferMd5(paramArrayOfByte);
      if (paramArrayOfByte != null)
      {
        this.digest = paramArrayOfByte;
        return this.digest;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte.printStackTrace();
        paramArrayOfByte = arrayOfByte;
      }
    }
    return this.digest;
  }
  
  native byte[] getStremMd5(InputStream paramInputStream, long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\MD5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */