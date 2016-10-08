public final class o
{
  public static final byte[] a;
  
  static
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = 5;
    a = arrayOfByte;
  }
  
  private static void a(int paramInt, long paramLong, byte[] paramArrayOfByte)
  {
    if (paramInt == 0) {
      paramArrayOfByte[(paramArrayOfByte.length - 1)] = ((byte)(int)paramLong);
    }
    for (;;)
    {
      if (paramInt - 1 < 0) {
        return;
      }
      paramLong = (int)(paramLong % Math.pow(128.0D, paramInt));
      paramInt -= 1;
      break;
      paramArrayOfByte[(paramArrayOfByte.length - 1 - paramInt)] = ((byte)(int)(paramLong / Math.pow(128.0D, paramInt) + 128.0D));
    }
  }
  
  public static byte[] a(int paramInt, byte[] paramArrayOfByte)
  {
    int k = paramArrayOfByte.length;
    int i;
    byte[] arrayOfByte2;
    int j;
    label31:
    byte[] arrayOfByte1;
    if (k >= 128) {
      if (k <= 255)
      {
        i = 1;
        arrayOfByte2 = new byte[i];
        j = 0;
        if (j < i) {
          break label134;
        }
        arrayOfByte1 = new byte[arrayOfByte2.length + 1];
        arrayOfByte1[0] = ((byte)(arrayOfByte2.length + 128));
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 1, arrayOfByte2.length);
      }
    }
    for (;;)
    {
      arrayOfByte2 = new byte[arrayOfByte1.length + 1 + paramArrayOfByte.length];
      arrayOfByte2[0] = ((byte)paramInt);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, arrayOfByte1.length + 1, paramArrayOfByte.length);
      return arrayOfByte2;
      if (k <= 65535)
      {
        i = 2;
        break;
      }
      if (k <= 16777215)
      {
        i = 3;
        break;
      }
      i = 4;
      break;
      label134:
      arrayOfByte2[j] = ((byte)(k >> (i - 1 - j) * 8));
      j += 1;
      break label31;
      arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = ((byte)k);
    }
  }
  
  public static byte[] a(String paramString)
  {
    String[] arrayOfString = paramString.split("\\.");
    int i = (byte)(Integer.parseInt(arrayOfString[0]) * 40 + Integer.parseInt(arrayOfString[1]));
    paramString = new byte[1];
    paramString[0] = i;
    int j = 2;
    if (j >= arrayOfString.length) {
      return paramString;
    }
    long l = Long.parseLong(arrayOfString[j]);
    int k = 0;
    for (;;)
    {
      if (l < 1L << (k + 1) * 7)
      {
        byte[] arrayOfByte2 = new byte[k + 1];
        a(k, l, arrayOfByte2);
        byte[] arrayOfByte1 = new byte[paramString.length + arrayOfByte2.length];
        System.arraycopy(paramString, 0, arrayOfByte1, 0, paramString.length);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramString.length, arrayOfByte2.length);
        j += 1;
        paramString = arrayOfByte1;
        break;
      }
      k += 1;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = paramArrayOfByte1;
    if (paramArrayOfByte1 == null) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte1 = new byte[arrayOfByte.length + paramArrayOfByte2.length];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte1, 0, arrayOfByte.length);
    System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, arrayOfByte.length, paramArrayOfByte2.length);
    return paramArrayOfByte1;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */