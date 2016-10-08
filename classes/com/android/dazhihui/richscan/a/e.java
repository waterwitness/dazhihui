package com.android.dazhihui.richscan.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.c.b.g;

public final class e
  extends g
{
  private final byte[] a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  
  public e(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt5, paramInt6);
    if ((paramInt3 + paramInt5 > paramInt1) || (paramInt4 + paramInt6 > paramInt2)) {
      throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  public byte[] a()
  {
    int i = 0;
    int k = c();
    int m = d();
    Object localObject;
    if ((k == this.b) && (m == this.c))
    {
      localObject = this.a;
      return (byte[])localObject;
    }
    int n = k * m;
    byte[] arrayOfByte1 = new byte[n];
    int j = this.e * this.b + this.d;
    if (k == this.b)
    {
      System.arraycopy(this.a, j, arrayOfByte1, 0, n);
      return arrayOfByte1;
    }
    byte[] arrayOfByte2 = this.a;
    for (;;)
    {
      localObject = arrayOfByte1;
      if (i >= m) {
        break;
      }
      System.arraycopy(arrayOfByte2, j, arrayOfByte1, i * k, k);
      j += this.b;
      i += 1;
    }
  }
  
  public byte[] a(int paramInt, byte[] paramArrayOfByte)
  {
    if ((paramInt < 0) || (paramInt >= d())) {
      throw new IllegalArgumentException("Requested row is outside the image: " + paramInt);
    }
    int i = c();
    byte[] arrayOfByte;
    if (paramArrayOfByte != null)
    {
      arrayOfByte = paramArrayOfByte;
      if (paramArrayOfByte.length >= i) {}
    }
    else
    {
      arrayOfByte = new byte[i];
    }
    int j = this.e;
    int k = this.b;
    int m = this.d;
    System.arraycopy(this.a, (j + paramInt) * k + m, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public Bitmap b()
  {
    int m = c();
    int n = d();
    int[] arrayOfInt = new int[m * n];
    Object localObject = this.a;
    int j = this.e;
    int k = this.b;
    int i1 = this.d;
    int i = 0;
    j = j * k + i1;
    while (i < n)
    {
      k = 0;
      while (k < m)
      {
        arrayOfInt[(i * m + k)] = ((localObject[(j + k)] & 0xFF) * 65793 | 0xFF000000);
        k += 1;
      }
      j += this.b;
      i += 1;
    }
    localObject = Bitmap.createBitmap(m, n, Bitmap.Config.ARGB_8888);
    ((Bitmap)localObject).setPixels(arrayOfInt, 0, m, 0, 0, m, n);
    return (Bitmap)localObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */