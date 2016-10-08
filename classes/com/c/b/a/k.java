package com.c.b.a;

import com.c.b.e;
import java.nio.charset.Charset;
import java.util.Map;

public final class k
{
  private static final String a = Charset.defaultCharset().name();
  private static final boolean b;
  
  static
  {
    if (("SJIS".equalsIgnoreCase(a)) || ("EUC_JP".equalsIgnoreCase(a))) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      return;
    }
  }
  
  public static String a(byte[] paramArrayOfByte, Map<e, ?> paramMap)
  {
    if (paramMap != null)
    {
      paramMap = (String)paramMap.get(e.e);
      if (paramMap != null) {
        return paramMap;
      }
    }
    int i16 = paramArrayOfByte.length;
    int i13 = 1;
    int j = 1;
    int i4 = 0;
    int i10 = 0;
    int i9 = 0;
    int i8 = 0;
    int m = 0;
    int k = 0;
    int i2 = 0;
    int i = 0;
    int i14 = 0;
    int i5;
    int i6;
    int i7;
    int i3;
    int n;
    label103:
    int i15;
    int i1;
    if ((paramArrayOfByte.length > 3) && (paramArrayOfByte[0] == -17) && (paramArrayOfByte[1] == -69) && (paramArrayOfByte[2] == -65))
    {
      i5 = 1;
      i6 = 0;
      i7 = 0;
      i3 = 0;
      n = 1;
      if ((i6 >= i16) || ((i13 == 0) && (j == 0) && (n == 0))) {
        break label623;
      }
      i15 = paramArrayOfByte[i6] & 0xFF;
      if (n == 0) {
        break label817;
      }
      if (i4 <= 0) {
        break label282;
      }
      if ((i15 & 0x80) != 0) {
        break label269;
      }
      i1 = 0;
    }
    for (;;)
    {
      label156:
      int i11 = i14;
      int i12 = i13;
      if (i13 != 0)
      {
        if ((i15 > 127) && (i15 < 160))
        {
          i12 = 0;
          i11 = i14;
        }
      }
      else
      {
        label191:
        if (j == 0) {
          break label808;
        }
        if (m <= 0) {
          break label468;
        }
        if ((i15 >= 64) && (i15 != 127) && (i15 <= 252)) {
          break label453;
        }
        j = i3;
        n = 0;
      }
      for (;;)
      {
        i15 = i6 + 1;
        i6 = n;
        n = i1;
        i3 = j;
        j = i6;
        i14 = i11;
        i13 = i12;
        i6 = i15;
        break label103;
        i5 = 0;
        break;
        label269:
        i4 -= 1;
        i1 = n;
        break label156;
        label282:
        if ((i15 & 0x80) == 0) {
          break label817;
        }
        if ((i15 & 0x40) == 0)
        {
          i1 = 0;
          break label156;
        }
        i4 += 1;
        if ((i15 & 0x20) == 0)
        {
          i10 += 1;
          i1 = n;
          break label156;
        }
        i4 += 1;
        if ((i15 & 0x10) == 0)
        {
          i9 += 1;
          i1 = n;
          break label156;
        }
        i4 += 1;
        if ((i15 & 0x8) == 0)
        {
          i8 += 1;
          i1 = n;
          break label156;
        }
        i1 = 0;
        break label156;
        i11 = i14;
        i12 = i13;
        if (i15 <= 159) {
          break label191;
        }
        if ((i15 >= 192) && (i15 != 215))
        {
          i11 = i14;
          i12 = i13;
          if (i15 != 247) {
            break label191;
          }
        }
        i11 = i14 + 1;
        i12 = i13;
        break label191;
        label453:
        n = j;
        j = i3;
        m -= 1;
        continue;
        label468:
        if ((i15 == 128) || (i15 == 160) || (i15 > 239))
        {
          j = i3;
          n = 0;
        }
        else
        {
          if ((i15 > 160) && (i15 < 224))
          {
            n = k + 1;
            k = i2 + 1;
            if (k > i)
            {
              i13 = 0;
              i2 = k;
              i3 = j;
              i = k;
              j = i13;
              k = n;
              n = i3;
            }
          }
          else
          {
            if (i15 > 127)
            {
              n = m + 1;
              i2 = 0;
              m = i3 + 1;
              if (m > i7)
              {
                i7 = m;
                i3 = j;
                j = m;
                m = n;
                n = i3;
              }
            }
            else
            {
              i2 = 0;
              n = j;
              j = 0;
              continue;
              label623:
              if ((n != 0) && (i4 > 0)) {
                n = 0;
              }
              for (;;)
              {
                i1 = j;
                if (j != 0)
                {
                  i1 = j;
                  if (m > 0) {
                    i1 = 0;
                  }
                }
                if ((n != 0) && ((i5 != 0) || (i10 + i9 + i8 > 0))) {
                  return "UTF8";
                }
                if ((i1 != 0) && ((b) || (i >= 3) || (i7 >= 3))) {
                  return "SJIS";
                }
                if ((i13 != 0) && (i1 != 0))
                {
                  if (((i == 2) && (k == 2)) || (i14 * 10 >= i16)) {
                    return "SJIS";
                  }
                  return "ISO8859_1";
                }
                if (i13 != 0) {
                  return "ISO8859_1";
                }
                if (i1 != 0) {
                  return "SJIS";
                }
                if (n != 0) {
                  return "UTF8";
                }
                return a;
              }
            }
            i3 = j;
            j = m;
            m = n;
            n = i3;
            continue;
          }
          i3 = j;
          j = 0;
          i2 = k;
          k = n;
          n = i3;
          continue;
          label808:
          n = j;
          j = i3;
        }
      }
      label817:
      i1 = n;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */