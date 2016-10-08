package com.kwl.common.utils;

public final class Base64
{
  private static final int BASELENGTH = 128;
  private static final int EIGHTBIT = 8;
  private static final int FOURBYTE = 4;
  private static final int LOOKUPLENGTH = 64;
  private static final char PAD = '=';
  private static final int SIGN = -128;
  private static final int SIXTEENBIT = 16;
  private static final int TWENTYFOURBITGROUP = 24;
  private static final byte[] base64Alphabet;
  private static final boolean fDebug = false;
  private static final char[] lookUpBase64Alphabet;
  
  static
  {
    int k = 0;
    base64Alphabet = new byte[''];
    lookUpBase64Alphabet = new char[64];
    int i = 0;
    label29:
    label38:
    label47:
    label71:
    int j;
    if (i >= 128)
    {
      i = 90;
      if (i >= 65) {
        break label129;
      }
      i = 122;
      if (i >= 97) {
        break label146;
      }
      i = 57;
      if (i >= 48) {
        break label166;
      }
      base64Alphabet[43] = 62;
      base64Alphabet[47] = 63;
      i = 0;
      if (i <= 25) {
        break label186;
      }
      j = 26;
      i = 0;
      label82:
      if (j <= 51) {
        break label203;
      }
      j = 52;
      i = k;
    }
    for (;;)
    {
      if (j > 61)
      {
        lookUpBase64Alphabet[62] = '+';
        lookUpBase64Alphabet[63] = '/';
        return;
        base64Alphabet[i] = -1;
        i += 1;
        break;
        label129:
        base64Alphabet[i] = ((byte)(i - 65));
        i -= 1;
        break label29;
        label146:
        base64Alphabet[i] = ((byte)(i - 97 + 26));
        i -= 1;
        break label38;
        label166:
        base64Alphabet[i] = ((byte)(i - 48 + 52));
        i -= 1;
        break label47;
        label186:
        lookUpBase64Alphabet[i] = ((char)(i + 65));
        i += 1;
        break label71;
        label203:
        lookUpBase64Alphabet[j] = ((char)(i + 97));
        j += 1;
        i += 1;
        break label82;
      }
      lookUpBase64Alphabet[j] = ((char)(i + 48));
      j += 1;
      i += 1;
    }
  }
  
  public static byte[] decode(String paramString)
  {
    if (paramString == null) {}
    int m;
    int k;
    char c1;
    char c2;
    label393:
    do
    {
      do
      {
        do
        {
          return null;
          localObject = paramString.toCharArray();
          i = removeWhiteSpace((char[])localObject);
        } while (i % 4 != 0);
        m = i / 4;
        if (m == 0) {
          return new byte[0];
        }
        paramString = new byte[m * 3];
        k = 0;
        i = 0;
        j = 0;
        for (;;)
        {
          if (j >= m - 1)
          {
            m = k + 1;
            c1 = localObject[k];
            if (!isData(c1)) {
              break;
            }
            n = m + 1;
            c2 = localObject[m];
            if (!isData(c2)) {
              break;
            }
            m = base64Alphabet[c1];
            k = base64Alphabet[c2];
            i1 = n + 1;
            c1 = localObject[n];
            c2 = localObject[i1];
            if ((isData(c1)) && (isData(c2))) {
              break label484;
            }
            if ((!isPad(c1)) || (!isPad(c2))) {
              break label393;
            }
            if ((k & 0xF) != 0) {
              break;
            }
            localObject = new byte[j * 3 + 1];
            System.arraycopy(paramString, 0, localObject, 0, j * 3);
            localObject[i] = ((byte)(m << 2 | k >> 4));
            return (byte[])localObject;
          }
          n = k + 1;
          c1 = localObject[k];
          if (!isData(c1)) {
            break;
          }
          k = n + 1;
          c2 = localObject[n];
          if (!isData(c2)) {
            break;
          }
          n = k + 1;
          char c3 = localObject[k];
          if (!isData(c3)) {
            break;
          }
          k = n + 1;
          char c4 = localObject[n];
          if (!isData(c4)) {
            break;
          }
          int i4 = base64Alphabet[c1];
          int i2 = base64Alphabet[c2];
          n = base64Alphabet[c3];
          i1 = base64Alphabet[c4];
          int i3 = i + 1;
          paramString[i] = ((byte)(i4 << 2 | i2 >> 4));
          i4 = i3 + 1;
          paramString[i3] = ((byte)((i2 & 0xF) << 4 | n >> 2 & 0xF));
          i = i4 + 1;
          paramString[i4] = ((byte)(n << 6 | i1));
          j += 1;
        }
      } while ((isPad(c1)) || (!isPad(c2)));
      n = base64Alphabet[c1];
    } while ((n & 0x3) != 0);
    Object localObject = new byte[j * 3 + 2];
    System.arraycopy(paramString, 0, localObject, 0, j * 3);
    localObject[i] = ((byte)(m << 2 | k >> 4));
    localObject[(i + 1)] = ((byte)((k & 0xF) << 4 | n >> 2 & 0xF));
    return (byte[])localObject;
    label484:
    int j = base64Alphabet[c1];
    int n = base64Alphabet[c2];
    int i1 = i + 1;
    paramString[i] = ((byte)(m << 2 | k >> 4));
    int i = i1 + 1;
    paramString[i1] = ((byte)((k & 0xF) << 4 | j >> 2 & 0xF));
    paramString[i] = ((byte)(j << 6 | n));
    return paramString;
  }
  
  public static String encode(byte[] paramArrayOfByte)
  {
    int k = 0;
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length * 8;
    if (i == 0) {
      return "";
    }
    int i2 = i % 24;
    int i1 = i / 24;
    char[] arrayOfChar;
    if (i2 != 0)
    {
      i = i1 + 1;
      arrayOfChar = new char[i * 4];
      j = 0;
      i = 0;
      if (j < i1) {
        break label149;
      }
      if (i2 != 8) {
        break label379;
      }
      j = paramArrayOfByte[k];
      k = (byte)(j & 0x3);
      if ((j & 0xFFFFFF80) != 0) {
        break label367;
      }
      j = (byte)(j >> 2);
      m = i + 1;
      arrayOfChar[i] = lookUpBase64Alphabet[j];
      i = m + 1;
      arrayOfChar[m] = lookUpBase64Alphabet[(k << 4)];
      j = i + 1;
      arrayOfChar[i] = '=';
      arrayOfChar[j] = '=';
    }
    label149:
    label209:
    label224:
    label338:
    label352:
    label367:
    label379:
    while (i2 != 16) {
      for (;;)
      {
        return new String(arrayOfChar);
        i = i1;
        break;
        m = k + 1;
        k = paramArrayOfByte[k];
        int i3 = m + 1;
        m = paramArrayOfByte[m];
        int i4 = paramArrayOfByte[i3];
        int i5 = (byte)(m & 0xF);
        int i6 = (byte)(k & 0x3);
        if ((k & 0xFFFFFF80) == 0)
        {
          k = (byte)(k >> 2);
          if ((m & 0xFFFFFF80) != 0) {
            break label338;
          }
          m = (byte)(m >> 4);
          if ((i4 & 0xFFFFFF80) != 0) {
            break label352;
          }
        }
        for (n = (byte)(i4 >> 6);; n = (byte)(i4 >> 6 ^ 0xFC))
        {
          int i7 = i + 1;
          arrayOfChar[i] = lookUpBase64Alphabet[k];
          i = i7 + 1;
          arrayOfChar[i7] = lookUpBase64Alphabet[(m | i6 << 4)];
          k = i + 1;
          arrayOfChar[i] = lookUpBase64Alphabet[(n | i5 << 2)];
          arrayOfChar[k] = lookUpBase64Alphabet[(i4 & 0x3F)];
          j += 1;
          i = k + 1;
          k = i3 + 1;
          break;
          k = (byte)(k >> 2 ^ 0xC0);
          break label209;
          m = (byte)(m >> 4 ^ 0xF0);
          break label224;
        }
        j = (byte)(j >> 2 ^ 0xC0);
      }
    }
    int j = paramArrayOfByte[k];
    k = paramArrayOfByte[(k + 1)];
    int m = (byte)(k & 0xF);
    int n = (byte)(j & 0x3);
    if ((j & 0xFFFFFF80) == 0)
    {
      j = (byte)(j >> 2);
      label425:
      if ((k & 0xFFFFFF80) != 0) {
        break label508;
      }
    }
    label508:
    for (k = (byte)(k >> 4);; k = (byte)(k >> 4 ^ 0xF0))
    {
      i1 = i + 1;
      arrayOfChar[i] = lookUpBase64Alphabet[j];
      i = i1 + 1;
      arrayOfChar[i1] = lookUpBase64Alphabet[(k | n << 4)];
      j = i + 1;
      arrayOfChar[i] = lookUpBase64Alphabet[(m << 2)];
      arrayOfChar[j] = '=';
      break;
      j = (byte)(j >> 2 ^ 0xC0);
      break label425;
    }
  }
  
  private static boolean isData(char paramChar)
  {
    return (paramChar < '') && (base64Alphabet[paramChar] != -1);
  }
  
  private static boolean isPad(char paramChar)
  {
    return paramChar == '=';
  }
  
  private static boolean isWhiteSpace(char paramChar)
  {
    return (paramChar == ' ') || (paramChar == '\r') || (paramChar == '\n') || (paramChar == '\t');
  }
  
  private static int removeWhiteSpace(char[] paramArrayOfChar)
  {
    int i = 0;
    int k = 0;
    if (paramArrayOfChar == null) {}
    int m;
    int j;
    do
    {
      return k;
      m = paramArrayOfChar.length;
      j = 0;
      k = i;
    } while (j >= m);
    if (!isWhiteSpace(paramArrayOfChar[j]))
    {
      k = i + 1;
      paramArrayOfChar[i] = paramArrayOfChar[j];
      i = k;
    }
    for (;;)
    {
      j += 1;
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\Base64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */