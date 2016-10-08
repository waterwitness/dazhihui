package com.android.dazhihui.ui.delegate.b.a;

final class a
{
  long a(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      return 1L;
    }
    long l1 = paramLong & 0xFFFF;
    paramLong = 0xFFFF & paramLong >> 16;
    int i;
    int k;
    if (paramInt2 > 0)
    {
      if (paramInt2 < 5552) {}
      int j;
      for (i = paramInt2;; i = 5552)
      {
        j = i;
        while (j >= 16)
        {
          k = paramInt1 + 1;
          long l2 = l1 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l3 = l2 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l4 = l3 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l5 = l4 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l6 = l5 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l7 = l6 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l8 = l7 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l9 = l8 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l10 = l9 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l11 = l10 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l12 = l11 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l13 = l12 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l14 = l13 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          long l15 = l14 + (paramArrayOfByte[k] & 0xFF);
          k = paramInt1 + 1;
          long l16 = l15 + (paramArrayOfByte[paramInt1] & 0xFF);
          paramInt1 = k + 1;
          l1 = l16 + (paramArrayOfByte[k] & 0xFF);
          paramLong = paramLong + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9 + l10 + l11 + l12 + l13 + l14 + l15 + l16 + l1;
          j -= 16;
        }
      }
      if (j == 0) {
        break label522;
      }
      label443:
      k = paramInt1 + 1;
      l1 += (paramArrayOfByte[paramInt1] & 0xFF);
      paramLong += l1;
      j -= 1;
      if (j != 0) {
        break label515;
      }
      paramInt1 = k;
    }
    label515:
    label522:
    for (;;)
    {
      l1 %= 65521L;
      paramLong %= 65521L;
      paramInt2 -= i;
      break;
      return paramLong << 16 | l1;
      paramInt1 = k;
      break label443;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */