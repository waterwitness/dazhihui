package org.a.a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class i
  extends FilterInputStream
{
  private final int a;
  private final boolean b;
  
  public i(InputStream paramInputStream)
  {
    this(paramInputStream, a(paramInputStream));
  }
  
  public i(InputStream paramInputStream, int paramInt)
  {
    this(paramInputStream, paramInt, false);
  }
  
  public i(InputStream paramInputStream, int paramInt, boolean paramBoolean)
  {
    super(paramInputStream);
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  public i(byte[] paramArrayOfByte)
  {
    this(new ByteArrayInputStream(paramArrayOfByte), paramArrayOfByte.length);
  }
  
  public i(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this(new ByteArrayInputStream(paramArrayOfByte), paramArrayOfByte.length, paramBoolean);
  }
  
  static int a(InputStream paramInputStream)
  {
    if ((paramInputStream instanceof ca)) {
      return ((ca)paramInputStream).a();
    }
    if ((paramInputStream instanceof ByteArrayInputStream)) {
      return ((ByteArrayInputStream)paramInputStream).available();
    }
    return Integer.MAX_VALUE;
  }
  
  static int a(InputStream paramInputStream, int paramInt)
  {
    int i = paramInt & 0x1F;
    paramInt = i;
    if (i == 31)
    {
      i = 0;
      int j = paramInputStream.read();
      paramInt = j;
      if ((j & 0x7F) == 0) {
        throw new IOException("corrupted stream - invalid high tag number found");
      }
      while ((paramInt >= 0) && ((paramInt & 0x80) != 0))
      {
        i = (paramInt & 0x7F | i) << 7;
        paramInt = paramInputStream.read();
      }
      if (paramInt < 0) {
        throw new EOFException("EOF found inside tag value.");
      }
      paramInt = paramInt & 0x7F | i;
    }
    return paramInt;
  }
  
  static bd a(int paramInt, byte[] paramArrayOfByte)
  {
    switch (paramInt)
    {
    case 7: 
    case 8: 
    case 9: 
    case 11: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 21: 
    case 25: 
    case 29: 
    default: 
      return new bt(false, paramInt, paramArrayOfByte);
    case 3: 
      return ap.b(paramArrayOfByte);
    case 30: 
      return new ao(paramArrayOfByte);
    case 1: 
      return new b(paramArrayOfByte);
    case 10: 
      return new f(paramArrayOfByte);
    case 24: 
      return new h(paramArrayOfByte);
    case 27: 
      return new ax(paramArrayOfByte);
    case 22: 
      return new az(paramArrayOfByte);
    case 2: 
      return new j(paramArrayOfByte);
    case 5: 
      return bb.a;
    case 18: 
      return new bc(paramArrayOfByte);
    case 6: 
      return new m(paramArrayOfByte);
    case 4: 
      return new bf(paramArrayOfByte);
    case 19: 
      return new bi(paramArrayOfByte);
    case 20: 
      return new bo(paramArrayOfByte);
    case 28: 
      return new bs(paramArrayOfByte);
    case 23: 
      return new z(paramArrayOfByte);
    case 12: 
      return new br(paramArrayOfByte);
    }
    return new bu(paramArrayOfByte);
  }
  
  static int b(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    int k = paramInputStream.read();
    if (k < 0) {
      throw new EOFException("EOF found when length expected");
    }
    int j;
    if (k == 128) {
      j = -1;
    }
    do
    {
      do
      {
        return j;
        j = k;
      } while (k <= 127);
      int m = k & 0x7F;
      if (m > 4) {
        throw new IOException("DER length more than 4 bytes: " + m);
      }
      k = 0;
      j = i;
      for (i = k; j < m; i = k + (i << 8))
      {
        k = paramInputStream.read();
        if (k < 0) {
          throw new EOFException("EOF found reading length");
        }
        j += 1;
      }
      if (i < 0) {
        throw new IOException("corrupted stream - negative length found");
      }
      j = i;
    } while (i < paramInt);
    throw new IOException("corrupted stream - out of bounds length found");
  }
  
  protected int a()
  {
    return b(this, this.a);
  }
  
  protected bd a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 & 0x20) != 0) {}
    bv localbv;
    for (boolean bool = true;; bool = false)
    {
      localbv = new bv(this, paramInt3);
      if ((paramInt1 & 0x40) == 0) {
        break;
      }
      return new an(bool, paramInt2, localbv.b());
    }
    if ((paramInt1 & 0x80) != 0) {
      return new v(localbv).a(bool, paramInt2);
    }
    if (bool)
    {
      switch (paramInt2)
      {
      default: 
        return new bt(true, paramInt2, localbv.b());
      case 4: 
        return new ac(a(localbv).a);
      case 16: 
        if (this.b) {
          return new bz(localbv.b());
        }
        return aw.a(a(localbv));
      case 17: 
        return aw.a(a(localbv), false);
      }
      return new au(a(localbv));
    }
    return a(paramInt2, localbv.b());
  }
  
  e a(bv parambv)
  {
    return new i(parambv).b();
  }
  
  e b()
  {
    e locale = new e();
    for (;;)
    {
      bd localbd = c();
      if (localbd == null) {
        break;
      }
      locale.a(localbd);
    }
    return locale;
  }
  
  public bd c()
  {
    int j = read();
    if (j <= 0)
    {
      if (j == 0) {
        throw new IOException("unexpected end-of-contents marker");
      }
      return null;
    }
    int k = a(this, j);
    if ((j & 0x20) != 0) {}
    int m;
    for (int i = 1;; i = 0)
    {
      m = a();
      if (m >= 0) {
        break label242;
      }
      if (i != 0) {
        break;
      }
      throw new IOException("indefinite length primitive encoding encountered");
    }
    Object localObject = new v(new bx(this, this.a), this.a);
    if ((j & 0x40) != 0) {
      return new ab(k, (v)localObject).g();
    }
    if ((j & 0x80) != 0) {
      return new al(true, k, (v)localObject).g();
    }
    switch (k)
    {
    default: 
      throw new IOException("unknown BER object encountered");
    case 4: 
      return new ae((v)localObject).g();
    case 16: 
      return new ah((v)localObject).g();
    case 17: 
      return new aj((v)localObject).g();
    }
    return new av((v)localObject).g();
    try
    {
      label242:
      localObject = a(j, k, m);
      return (bd)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new g("corrupted stream detected", localIllegalArgumentException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */