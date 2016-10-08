package com.e.a.a;

class n
  extends l
{
  private static final byte[] g = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] h = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  int c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  private final byte[] i;
  private int j;
  private final byte[] k;
  
  public n(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    boolean bool1;
    if ((paramInt & 0x1) == 0)
    {
      bool1 = true;
      this.d = bool1;
      if ((paramInt & 0x2) != 0) {
        break label101;
      }
      bool1 = true;
      label33:
      this.e = bool1;
      if ((paramInt & 0x4) == 0) {
        break label106;
      }
      bool1 = bool2;
      label47:
      this.f = bool1;
      if ((paramInt & 0x8) != 0) {
        break label111;
      }
      paramArrayOfByte = g;
      label63:
      this.k = paramArrayOfByte;
      this.i = new byte[2];
      this.c = 0;
      if (!this.e) {
        break label118;
      }
    }
    label101:
    label106:
    label111:
    label118:
    for (paramInt = 19;; paramInt = -1)
    {
      this.j = paramInt;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label33;
      bool1 = false;
      break label47;
      paramArrayOfByte = h;
      break label63;
    }
  }
  
  public int a(int paramInt)
  {
    return paramInt * 8 / 5 + 10;
  }
  
  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = this.k;
    byte[] arrayOfByte2 = this.a;
    int n = 0;
    int i2 = this.j;
    int i4 = paramInt2 + paramInt1;
    int i1 = -1;
    int m;
    switch (this.c)
    {
    default: 
      m = paramInt1;
      label63:
      paramInt1 = i2;
      paramInt2 = n;
      n = m;
      if (i1 != -1)
      {
        arrayOfByte2[0] = arrayOfByte1[(i1 >> 18 & 0x3F)];
        arrayOfByte2[1] = arrayOfByte1[(i1 >> 12 & 0x3F)];
        arrayOfByte2[2] = arrayOfByte1[(i1 >> 6 & 0x3F)];
        paramInt2 = 4;
        arrayOfByte2[3] = arrayOfByte1[(i1 & 0x3F)];
        i1 = i2 - 1;
        paramInt1 = i1;
        n = m;
        if (i1 == 0)
        {
          if (!this.f) {
            break label1184;
          }
          paramInt1 = 5;
          arrayOfByte2[4] = 13;
        }
      }
      break;
    }
    for (;;)
    {
      arrayOfByte2[paramInt1] = 10;
      i1 = 19;
      paramInt2 = paramInt1 + 1;
      for (;;)
      {
        if (m + 3 > i4)
        {
          if (!paramBoolean) {
            break label1029;
          }
          if (m - this.c != i4 - 1) {
            break label716;
          }
          if (this.c <= 0) {
            break label699;
          }
          paramArrayOfByte = this.i;
          i2 = 1;
          n = paramArrayOfByte[0];
          paramInt1 = m;
          m = i2;
          label240:
          n = (n & 0xFF) << 4;
          this.c -= m;
          i2 = paramInt2 + 1;
          arrayOfByte2[paramInt2] = arrayOfByte1[(n >> 6 & 0x3F)];
          m = i2 + 1;
          arrayOfByte2[i2] = arrayOfByte1[(n & 0x3F)];
          paramInt2 = m;
          if (this.d)
          {
            n = m + 1;
            arrayOfByte2[m] = 61;
            paramInt2 = n + 1;
            arrayOfByte2[n] = 61;
          }
          if (!this.e) {
            break label1160;
          }
          m = paramInt2;
          if (this.f)
          {
            arrayOfByte2[paramInt2] = 13;
            m = paramInt2 + 1;
          }
          paramInt2 = m + 1;
          arrayOfByte2[m] = 10;
          n = paramInt1;
          paramInt1 = paramInt2;
          label380:
          if ((this.c == 0) && (n == i4)) {
            break label1066;
          }
          throw new AssertionError();
          m = paramInt1;
          break label63;
          if (paramInt1 + 2 > i4) {
            break;
          }
          m = this.i[0];
          paramInt2 = paramInt1 + 1;
          i1 = (m & 0xFF) << 16 | (paramArrayOfByte[paramInt1] & 0xFF) << 8 | paramArrayOfByte[paramInt2] & 0xFF;
          this.c = 0;
          m = paramInt2 + 1;
          break label63;
          if (paramInt1 + 1 > i4) {
            break;
          }
          paramInt2 = this.i[0];
          i1 = this.i[1];
          m = paramInt1 + 1;
          i1 = (paramInt2 & 0xFF) << 16 | (i1 & 0xFF) << 8 | paramArrayOfByte[paramInt1] & 0xFF;
          this.c = 0;
          break label63;
        }
        paramInt1 = (paramArrayOfByte[m] & 0xFF) << 16 | (paramArrayOfByte[(m + 1)] & 0xFF) << 8 | paramArrayOfByte[(m + 2)] & 0xFF;
        arrayOfByte2[paramInt2] = arrayOfByte1[(paramInt1 >> 18 & 0x3F)];
        arrayOfByte2[(paramInt2 + 1)] = arrayOfByte1[(paramInt1 >> 12 & 0x3F)];
        arrayOfByte2[(paramInt2 + 2)] = arrayOfByte1[(paramInt1 >> 6 & 0x3F)];
        arrayOfByte2[(paramInt2 + 3)] = arrayOfByte1[(paramInt1 & 0x3F)];
        m += 3;
        i2 = paramInt2 + 4;
        i1 -= 1;
        paramInt1 = i1;
        paramInt2 = i2;
        n = m;
        if (i1 == 0)
        {
          if (this.f)
          {
            paramInt1 = i2 + 1;
            arrayOfByte2[i2] = 13;
          }
          for (;;)
          {
            arrayOfByte2[paramInt1] = 10;
            i1 = 19;
            paramInt2 = paramInt1 + 1;
            break;
            label699:
            n = paramArrayOfByte[m];
            paramInt1 = m + 1;
            m = 0;
            break label240;
            label716:
            label752:
            int i3;
            if (m - this.c == i4 - 2) {
              if (this.c > 1)
              {
                byte[] arrayOfByte3 = this.i;
                paramInt1 = 1;
                i2 = arrayOfByte3[0];
                if (this.c <= 0) {
                  break label938;
                }
                i3 = this.i[paramInt1];
                paramInt1 += 1;
                n = m;
                m = i3;
                label779:
                m = (m & 0xFF) << 2 | (i2 & 0xFF) << 10;
                this.c -= paramInt1;
                paramInt1 = paramInt2 + 1;
                arrayOfByte2[paramInt2] = arrayOfByte1[(m >> 12 & 0x3F)];
                paramInt2 = paramInt1 + 1;
                arrayOfByte2[paramInt1] = arrayOfByte1[(m >> 6 & 0x3F)];
                paramInt1 = paramInt2 + 1;
                arrayOfByte2[paramInt2] = arrayOfByte1[(m & 0x3F)];
                if (!this.d) {
                  break label1157;
                }
                paramInt2 = paramInt1 + 1;
                arrayOfByte2[paramInt1] = 61;
                paramInt1 = paramInt2;
              }
            }
            label938:
            label1029:
            label1066:
            label1157:
            for (;;)
            {
              if (this.e)
              {
                paramInt2 = paramInt1;
                if (this.f)
                {
                  arrayOfByte2[paramInt1] = 13;
                  paramInt2 = paramInt1 + 1;
                }
                paramInt1 = paramInt2 + 1;
                arrayOfByte2[paramInt2] = 10;
                break;
                i2 = paramArrayOfByte[m];
                m += 1;
                paramInt1 = 0;
                break label752;
                i3 = paramArrayOfByte[m];
                n = m + 1;
                m = i3;
                break label779;
                n = m;
                paramInt1 = paramInt2;
                if (!this.e) {
                  break;
                }
                n = m;
                paramInt1 = paramInt2;
                if (paramInt2 <= 0) {
                  break;
                }
                n = m;
                paramInt1 = paramInt2;
                if (i1 == 19) {
                  break;
                }
                if (this.f)
                {
                  paramInt1 = paramInt2 + 1;
                  arrayOfByte2[paramInt2] = 13;
                }
                for (;;)
                {
                  paramInt2 = paramInt1 + 1;
                  arrayOfByte2[paramInt1] = 10;
                  n = m;
                  paramInt1 = paramInt2;
                  break;
                  if (m == i4 - 1)
                  {
                    arrayOfByte1 = this.i;
                    paramInt1 = this.c;
                    this.c = (paramInt1 + 1);
                    arrayOfByte1[paramInt1] = paramArrayOfByte[m];
                    paramInt1 = paramInt2;
                  }
                  for (;;)
                  {
                    this.b = paramInt1;
                    this.j = i1;
                    return true;
                    paramInt1 = paramInt2;
                    if (m == i4 - 2)
                    {
                      arrayOfByte1 = this.i;
                      paramInt1 = this.c;
                      this.c = (paramInt1 + 1);
                      arrayOfByte1[paramInt1] = paramArrayOfByte[m];
                      arrayOfByte1 = this.i;
                      paramInt1 = this.c;
                      this.c = (paramInt1 + 1);
                      arrayOfByte1[paramInt1] = paramArrayOfByte[(m + 1)];
                      paramInt1 = paramInt2;
                    }
                  }
                  paramInt1 = paramInt2;
                }
              }
              break;
            }
            label1160:
            n = paramInt1;
            paramInt1 = paramInt2;
            break label380;
            paramInt1 = i2;
          }
        }
        m = n;
        i1 = paramInt1;
      }
      label1184:
      paramInt1 = 4;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */