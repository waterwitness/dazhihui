package com.payeco.android.plugin.http.encryption;

final class c
  extends a
{
  private static final byte[] bJ;
  private static final byte[] bK;
  private final byte[] bL;
  int bM;
  public final boolean bN;
  public final boolean bO;
  public final boolean bP;
  private final byte[] bQ;
  private int count;
  
  static
  {
    if (!Base64.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      bD = bool;
      bJ = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      bK = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      return;
    }
  }
  
  public c(int paramInt)
  {
    this.bE = null;
    boolean bool1;
    label33:
    label47:
    byte[] arrayOfByte;
    if ((paramInt & 0x1) == 0)
    {
      bool1 = true;
      this.bN = bool1;
      if ((paramInt & 0x2) != 0) {
        break label101;
      }
      bool1 = true;
      this.bO = bool1;
      if ((paramInt & 0x4) == 0) {
        break label106;
      }
      bool1 = bool2;
      this.bP = bool1;
      if ((paramInt & 0x8) != 0) {
        break label111;
      }
      arrayOfByte = bJ;
      label63:
      this.bQ = arrayOfByte;
      this.bL = new byte[2];
      this.bM = 0;
      if (!this.bO) {
        break label118;
      }
    }
    label101:
    label106:
    label111:
    label118:
    for (paramInt = 19;; paramInt = -1)
    {
      this.count = paramInt;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label33;
      bool1 = false;
      break label47;
      arrayOfByte = bK;
      break label63;
    }
  }
  
  public final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = this.bQ;
    byte[] arrayOfByte2 = this.bE;
    int j = 0;
    int i = this.count;
    int n = paramInt2 + paramInt1;
    int k;
    switch (this.bM)
    {
    default: 
      k = -1;
      paramInt2 = paramInt1;
      paramInt1 = k;
      label64:
      if (paramInt1 != -1)
      {
        arrayOfByte2[0] = arrayOfByte1[(paramInt1 >> 18 & 0x3F)];
        arrayOfByte2[1] = arrayOfByte1[(paramInt1 >> 12 & 0x3F)];
        arrayOfByte2[2] = arrayOfByte1[(paramInt1 >> 6 & 0x3F)];
        j = 4;
        arrayOfByte2[3] = arrayOfByte1[(paramInt1 & 0x3F)];
        i -= 1;
        if (i == 0)
        {
          paramInt1 = j;
          if (this.bP)
          {
            paramInt1 = 5;
            arrayOfByte2[4] = 13;
          }
          j = paramInt1 + 1;
          arrayOfByte2[paramInt1] = 10;
          i = 19;
          paramInt1 = j;
        }
      }
      break;
    }
    for (;;)
    {
      label213:
      int m;
      if (paramInt2 + 3 > n)
      {
        if (paramInt2 - this.bM != n - 1) {
          break label703;
        }
        if (this.bM <= 0) {
          break label688;
        }
        paramArrayOfByte = this.bL;
        j = 1;
        k = paramArrayOfByte[0];
        k = (k & 0xFF) << 4;
        this.bM -= j;
        m = paramInt1 + 1;
        arrayOfByte2[paramInt1] = arrayOfByte1[(k >> 6 & 0x3F)];
        j = m + 1;
        arrayOfByte2[m] = arrayOfByte1[(k & 0x3F)];
        paramInt1 = j;
        if (this.bN)
        {
          k = j + 1;
          arrayOfByte2[j] = 61;
          paramInt1 = k + 1;
          arrayOfByte2[k] = 61;
        }
        j = paramInt1;
        k = paramInt2;
        if (!this.bO) {
          break label1067;
        }
        j = paramInt1;
        if (this.bP)
        {
          arrayOfByte2[paramInt1] = 13;
          j = paramInt1 + 1;
        }
        paramInt1 = j + 1;
        arrayOfByte2[j] = 10;
        j = paramInt1;
        k = paramInt2;
        if ((bD) || (this.bM == 0)) {
          break label1029;
        }
        throw new AssertionError();
        k = -1;
        paramInt2 = paramInt1;
        paramInt1 = k;
        break label64;
        if (paramInt1 + 2 > n) {
          break;
        }
        k = this.bL[0];
        paramInt2 = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        m = paramArrayOfByte[paramInt2];
        this.bM = 0;
        paramInt1 = (k & 0xFF) << 16 | (paramInt1 & 0xFF) << 8 | m & 0xFF;
        paramInt2 += 1;
        break label64;
        if (paramInt1 + 1 > n) {
          break;
        }
        k = this.bL[0];
        m = this.bL[1];
        paramInt2 = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        this.bM = 0;
        paramInt1 = (k & 0xFF) << 16 | (m & 0xFF) << 8 | paramInt1 & 0xFF;
        break label64;
      }
      j = (paramArrayOfByte[paramInt2] & 0xFF) << 16 | (paramArrayOfByte[(paramInt2 + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt2 + 2)] & 0xFF;
      arrayOfByte2[paramInt1] = arrayOfByte1[(j >> 18 & 0x3F)];
      arrayOfByte2[(paramInt1 + 1)] = arrayOfByte1[(j >> 12 & 0x3F)];
      arrayOfByte2[(paramInt1 + 2)] = arrayOfByte1[(j >> 6 & 0x3F)];
      arrayOfByte2[(paramInt1 + 3)] = arrayOfByte1[(j & 0x3F)];
      paramInt2 += 3;
      paramInt1 += 4;
      i -= 1;
      if (i == 0)
      {
        if (this.bP)
        {
          i = paramInt1 + 1;
          arrayOfByte2[paramInt1] = 13;
          paramInt1 = i;
        }
        for (;;)
        {
          i = paramInt1 + 1;
          arrayOfByte2[paramInt1] = 10;
          j = 19;
          paramInt1 = i;
          i = j;
          break;
          label688:
          k = paramArrayOfByte[paramInt2];
          paramInt2 += 1;
          j = 0;
          break label213;
          label703:
          if (paramInt2 - this.bM == n - 2) {
            if (this.bM > 1)
            {
              byte[] arrayOfByte3 = this.bL;
              j = 1;
              k = arrayOfByte3[0];
              label739:
              if (this.bM <= 0) {
                break label943;
              }
              m = this.bL[j];
              j += 1;
              label761:
              k = (m & 0xFF) << 2 | (k & 0xFF) << 10;
              this.bM -= j;
              j = paramInt1 + 1;
              arrayOfByte2[paramInt1] = arrayOfByte1[(k >> 12 & 0x3F)];
              m = j + 1;
              arrayOfByte2[j] = arrayOfByte1[(k >> 6 & 0x3F)];
              paramInt1 = m + 1;
              arrayOfByte2[m] = arrayOfByte1[(k & 0x3F)];
              if (!this.bN) {
                break label1070;
              }
              j = paramInt1 + 1;
              arrayOfByte2[paramInt1] = 61;
              paramInt1 = j;
            }
          }
          label943:
          label1029:
          label1067:
          label1070:
          for (;;)
          {
            j = paramInt1;
            k = paramInt2;
            if (this.bO)
            {
              j = paramInt1;
              if (this.bP)
              {
                arrayOfByte2[paramInt1] = 13;
                j = paramInt1 + 1;
              }
              paramInt1 = j + 1;
              arrayOfByte2[j] = 10;
              k = paramInt2;
              j = paramInt1;
              break;
              k = paramArrayOfByte[paramInt2];
              paramInt2 += 1;
              j = 0;
              break label739;
              m = paramArrayOfByte[paramInt2];
              paramInt2 += 1;
              break label761;
              k = paramInt2;
              j = paramInt1;
              if (!this.bO) {
                break;
              }
              k = paramInt2;
              j = paramInt1;
              if (paramInt1 <= 0) {
                break;
              }
              k = paramInt2;
              j = paramInt1;
              if (i == 19) {
                break;
              }
              if (this.bP)
              {
                j = paramInt1 + 1;
                arrayOfByte2[paramInt1] = 13;
                paramInt1 = j;
              }
              for (;;)
              {
                j = paramInt1 + 1;
                arrayOfByte2[paramInt1] = 10;
                k = paramInt2;
                break;
                if ((!bD) && (k != n)) {
                  throw new AssertionError();
                }
                this.bF = j;
                this.count = i;
                return true;
              }
            }
            break;
          }
        }
      }
      continue;
      paramInt1 = 4;
      continue;
      paramInt1 = j;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */