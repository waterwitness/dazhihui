package com.android.dazhihui.ui.delegate.b;

import com.android.dazhihui.ui.delegate.newtrade.a.b;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class j
{
  private static final byte[] a = { -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private static Mac f;
  private static Mac g;
  private long[] b = new long[4];
  private long[] c = new long[2];
  private byte[] d = new byte[64];
  private byte[] e = new byte[16];
  
  private long a(byte paramByte)
  {
    if (paramByte >= 0) {
      return paramByte;
    }
    return paramByte & 0xFF;
  }
  
  private long a(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 & paramLong2 | (0xFFFFFFFFFFFFFFFF ^ paramLong1) & paramLong3;
  }
  
  private long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = a(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }
  
  public static void a()
  {
    f = null;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    int j = 0;
    byte[] arrayOfByte = new byte[64];
    int k = (int)(this.c[0] >>> 3) & 0x3F;
    long[] arrayOfLong = this.c;
    long l = arrayOfLong[0] + (paramInt << 3);
    arrayOfLong[0] = l;
    if (l < paramInt << 3)
    {
      arrayOfLong = this.c;
      arrayOfLong[1] += 1L;
    }
    arrayOfLong = this.c;
    arrayOfLong[1] += (paramInt >>> 29);
    int m = 64 - k;
    int i = k;
    if (paramInt >= m)
    {
      a(this.d, paramArrayOfByte, k, 0, m);
      d(this.d);
      i = m;
      while (i + 63 < paramInt)
      {
        a(arrayOfByte, paramArrayOfByte, 0, i, 64);
        d(arrayOfByte);
        i += 64;
      }
      k = 0;
      j = i;
      i = k;
    }
    a(this.d, paramArrayOfByte, i, j, paramInt - j);
  }
  
  private void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    while (i < paramInt3)
    {
      paramArrayOfByte1[(paramInt1 + i)] = paramArrayOfByte2[(paramInt2 + i)];
      i += 1;
    }
  }
  
  private void a(byte[] paramArrayOfByte, long[] paramArrayOfLong, int paramInt)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      paramArrayOfByte[i] = ((byte)(int)(paramArrayOfLong[j] & 0xFF));
      paramArrayOfByte[(i + 1)] = ((byte)(int)(paramArrayOfLong[j] >>> 8 & 0xFF));
      paramArrayOfByte[(i + 2)] = ((byte)(int)(paramArrayOfLong[j] >>> 16 & 0xFF));
      paramArrayOfByte[(i + 3)] = ((byte)(int)(paramArrayOfLong[j] >>> 24 & 0xFF));
      j += 1;
      i += 4;
    }
  }
  
  private void a(long[] paramArrayOfLong, byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      paramArrayOfLong[j] = (a(paramArrayOfByte[i]) | a(paramArrayOfByte[(i + 1)]) << 8 | a(paramArrayOfByte[(i + 2)]) << 16 | a(paramArrayOfByte[(i + 3)]) << 24);
      j += 1;
      i += 4;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    j localj = new j();
    localj.c();
    localj.a(paramArrayOfByte, paramArrayOfByte.length);
    localj.d();
    return localj.e;
  }
  
  private long b(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 & paramLong3 | (0xFFFFFFFFFFFFFFFF ^ paramLong3) & paramLong2;
  }
  
  private long b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = b(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }
  
  public static void b()
  {
    g = null;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(b.g(), "HmacMD5");
    if (g == null) {}
    try
    {
      g = Mac.getInstance("HmacMD5");
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      try
      {
        for (;;)
        {
          g.init(localSecretKeySpec);
          g.update(paramArrayOfByte);
          return g.doFinal();
          localNoSuchAlgorithmException = localNoSuchAlgorithmException;
          localNoSuchAlgorithmException.printStackTrace();
        }
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        for (;;)
        {
          localInvalidKeyException.printStackTrace();
        }
      }
    }
  }
  
  private long c(long paramLong1, long paramLong2, long paramLong3)
  {
    return paramLong1 ^ paramLong2 ^ paramLong3;
  }
  
  private long c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = c(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }
  
  private void c()
  {
    this.c[0] = 0L;
    this.c[1] = 0L;
    this.b[0] = 1732584193L;
    this.b[1] = 4023233417L;
    this.b[2] = 2562383102L;
    this.b[3] = 271733878L;
  }
  
  public static byte[] c(byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(u.i(), "HmacMD5");
    if (f == null) {}
    try
    {
      f = Mac.getInstance("HmacMD5");
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      try
      {
        for (;;)
        {
          f.init(localSecretKeySpec);
          f.update(paramArrayOfByte);
          return f.doFinal();
          localNoSuchAlgorithmException = localNoSuchAlgorithmException;
          localNoSuchAlgorithmException.printStackTrace();
        }
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        for (;;)
        {
          localInvalidKeyException.printStackTrace();
        }
      }
    }
  }
  
  private long d(long paramLong1, long paramLong2, long paramLong3)
  {
    return (0xFFFFFFFFFFFFFFFF ^ paramLong3 | paramLong1) ^ paramLong2;
  }
  
  private long d(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    paramLong1 = d(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7 + paramLong1;
    int i = (int)paramLong1;
    int j = (int)paramLong6;
    return ((int)paramLong1 >>> (int)(32L - paramLong6) | i << j) + paramLong2;
  }
  
  private void d()
  {
    byte[] arrayOfByte = new byte[8];
    a(arrayOfByte, this.c, 8);
    int i = (int)(this.c[0] >>> 3) & 0x3F;
    if (i >= 56) {}
    for (i = 120 - i;; i = 56 - i)
    {
      a(a, i);
      a(arrayOfByte, 8);
      a(this.e, this.b, 16);
      return;
    }
  }
  
  private void d(byte[] paramArrayOfByte)
  {
    long l2 = this.b[0];
    long l1 = this.b[1];
    long l4 = this.b[2];
    long l3 = this.b[3];
    long[] arrayOfLong = new long[16];
    a(arrayOfLong, paramArrayOfByte, 64);
    l2 = a(l2, l1, l4, l3, arrayOfLong[0], 7L, 3614090360L);
    l3 = a(l3, l2, l1, l4, arrayOfLong[1], 12L, 3905402710L);
    l4 = a(l4, l3, l2, l1, arrayOfLong[2], 17L, 606105819L);
    l1 = a(l1, l4, l3, l2, arrayOfLong[3], 22L, 3250441966L);
    l2 = a(l2, l1, l4, l3, arrayOfLong[4], 7L, 4118548399L);
    l3 = a(l3, l2, l1, l4, arrayOfLong[5], 12L, 1200080426L);
    l4 = a(l4, l3, l2, l1, arrayOfLong[6], 17L, 2821735955L);
    l1 = a(l1, l4, l3, l2, arrayOfLong[7], 22L, 4249261313L);
    l2 = a(l2, l1, l4, l3, arrayOfLong[8], 7L, 1770035416L);
    l3 = a(l3, l2, l1, l4, arrayOfLong[9], 12L, 2336552879L);
    l4 = a(l4, l3, l2, l1, arrayOfLong[10], 17L, 4294925233L);
    l1 = a(l1, l4, l3, l2, arrayOfLong[11], 22L, 2304563134L);
    l2 = a(l2, l1, l4, l3, arrayOfLong[12], 7L, 1804603682L);
    l3 = a(l3, l2, l1, l4, arrayOfLong[13], 12L, 4254626195L);
    l4 = a(l4, l3, l2, l1, arrayOfLong[14], 17L, 2792965006L);
    l1 = a(l1, l4, l3, l2, arrayOfLong[15], 22L, 1236535329L);
    l2 = b(l2, l1, l4, l3, arrayOfLong[1], 5L, 4129170786L);
    l3 = b(l3, l2, l1, l4, arrayOfLong[6], 9L, 3225465664L);
    l4 = b(l4, l3, l2, l1, arrayOfLong[11], 14L, 643717713L);
    l1 = b(l1, l4, l3, l2, arrayOfLong[0], 20L, 3921069994L);
    l2 = b(l2, l1, l4, l3, arrayOfLong[5], 5L, 3593408605L);
    l3 = b(l3, l2, l1, l4, arrayOfLong[10], 9L, 38016083L);
    l4 = b(l4, l3, l2, l1, arrayOfLong[15], 14L, 3634488961L);
    l1 = b(l1, l4, l3, l2, arrayOfLong[4], 20L, 3889429448L);
    l2 = b(l2, l1, l4, l3, arrayOfLong[9], 5L, 568446438L);
    l3 = b(l3, l2, l1, l4, arrayOfLong[14], 9L, 3275163606L);
    l4 = b(l4, l3, l2, l1, arrayOfLong[3], 14L, 4107603335L);
    l1 = b(l1, l4, l3, l2, arrayOfLong[8], 20L, 1163531501L);
    l2 = b(l2, l1, l4, l3, arrayOfLong[13], 5L, 2850285829L);
    l3 = b(l3, l2, l1, l4, arrayOfLong[2], 9L, 4243563512L);
    l4 = b(l4, l3, l2, l1, arrayOfLong[7], 14L, 1735328473L);
    l1 = b(l1, l4, l3, l2, arrayOfLong[12], 20L, 2368359562L);
    l2 = c(l2, l1, l4, l3, arrayOfLong[5], 4L, 4294588738L);
    l3 = c(l3, l2, l1, l4, arrayOfLong[8], 11L, 2272392833L);
    l4 = c(l4, l3, l2, l1, arrayOfLong[11], 16L, 1839030562L);
    l1 = c(l1, l4, l3, l2, arrayOfLong[14], 23L, 4259657740L);
    l2 = c(l2, l1, l4, l3, arrayOfLong[1], 4L, 2763975236L);
    l3 = c(l3, l2, l1, l4, arrayOfLong[4], 11L, 1272893353L);
    l4 = c(l4, l3, l2, l1, arrayOfLong[7], 16L, 4139469664L);
    l1 = c(l1, l4, l3, l2, arrayOfLong[10], 23L, 3200236656L);
    l2 = c(l2, l1, l4, l3, arrayOfLong[13], 4L, 681279174L);
    l3 = c(l3, l2, l1, l4, arrayOfLong[0], 11L, 3936430074L);
    l4 = c(l4, l3, l2, l1, arrayOfLong[3], 16L, 3572445317L);
    l1 = c(l1, l4, l3, l2, arrayOfLong[6], 23L, 76029189L);
    l2 = c(l2, l1, l4, l3, arrayOfLong[9], 4L, 3654602809L);
    l3 = c(l3, l2, l1, l4, arrayOfLong[12], 11L, 3873151461L);
    l4 = c(l4, l3, l2, l1, arrayOfLong[15], 16L, 530742520L);
    l1 = c(l1, l4, l3, l2, arrayOfLong[2], 23L, 3299628645L);
    l2 = d(l2, l1, l4, l3, arrayOfLong[0], 6L, 4096336452L);
    l3 = d(l3, l2, l1, l4, arrayOfLong[7], 10L, 1126891415L);
    l4 = d(l4, l3, l2, l1, arrayOfLong[14], 15L, 2878612391L);
    l1 = d(l1, l4, l3, l2, arrayOfLong[5], 21L, 4237533241L);
    l2 = d(l2, l1, l4, l3, arrayOfLong[12], 6L, 1700485571L);
    l3 = d(l3, l2, l1, l4, arrayOfLong[3], 10L, 2399980690L);
    l4 = d(l4, l3, l2, l1, arrayOfLong[10], 15L, 4293915773L);
    l1 = d(l1, l4, l3, l2, arrayOfLong[1], 21L, 2240044497L);
    l2 = d(l2, l1, l4, l3, arrayOfLong[8], 6L, 1873313359L);
    l3 = d(l3, l2, l1, l4, arrayOfLong[15], 10L, 4264355552L);
    l4 = d(l4, l3, l2, l1, arrayOfLong[6], 15L, 2734768916L);
    l1 = d(l1, l4, l3, l2, arrayOfLong[13], 21L, 1309151649L);
    l2 = d(l2, l1, l4, l3, arrayOfLong[4], 6L, 4149444226L);
    l3 = d(l3, l2, l1, l4, arrayOfLong[11], 10L, 3174756917L);
    l4 = d(l4, l3, l2, l1, arrayOfLong[2], 15L, 718787259L);
    l1 = d(l1, l4, l3, l2, arrayOfLong[9], 21L, 3951481745L);
    paramArrayOfByte = this.b;
    paramArrayOfByte[0] += l2;
    paramArrayOfByte = this.b;
    paramArrayOfByte[1] = (l1 + paramArrayOfByte[1]);
    paramArrayOfByte = this.b;
    paramArrayOfByte[2] += l4;
    paramArrayOfByte = this.b;
    paramArrayOfByte[3] += l3;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */