package com.d.a.c;

import com.d.a.a.e;
import com.d.a.al;
import com.d.a.an;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

abstract class bc
{
  private static final List<Integer> w;
  private static final List<Integer> x;
  e a = new bd(this);
  e b = new be(this);
  e c = new bf(this);
  e d = new bg(this);
  e e = new bh(this);
  private boolean g = true;
  private boolean h = false;
  private int i;
  private boolean j;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private int p;
  private byte[] q = new byte[0];
  private byte[] r = new byte[0];
  private boolean s = false;
  private ByteArrayOutputStream t = new ByteArrayOutputStream();
  private Inflater u = new Inflater(true);
  private byte[] v = new byte['က'];
  private an y = new an();
  
  static
  {
    if (!bc.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      w = Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10) });
      x = Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) });
      return;
    }
  }
  
  public bc(al paramal)
  {
    paramal.a(this.y);
    a();
  }
  
  private static long a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte.length < paramInt2) {
      throw new IllegalArgumentException("length must be less than or equal to b.length");
    }
    long l1 = 0L;
    int i1 = 0;
    for (;;)
    {
      if (i1 >= paramInt2) {
        return l1;
      }
      l1 += ((paramArrayOfByte[(i1 + paramInt1)] & 0xFF) << (paramInt2 - 1 - i1) * 8);
      i1 += 1;
    }
  }
  
  private void a(byte paramByte)
  {
    boolean bool1;
    int i1;
    if ((paramByte & 0x40) == 64)
    {
      bool1 = true;
      if ((paramByte & 0x20) != 32) {
        break label70;
      }
      i1 = 1;
      label23:
      if ((paramByte & 0x10) != 16) {
        break label75;
      }
    }
    label70:
    label75:
    for (int i2 = 1;; i2 = 0)
    {
      if (((this.h) || (!bool1)) && (i1 == 0) && (i2 == 0)) {
        break label80;
      }
      throw new bi("RSV not zero");
      bool1 = false;
      break;
      i1 = 0;
      break label23;
    }
    label80:
    if ((paramByte & 0x80) == 128) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      this.j = bool2;
      this.m = (paramByte & 0xF);
      this.l = bool1;
      this.q = new byte[0];
      this.r = new byte[0];
      if (w.contains(Integer.valueOf(this.m))) {
        break;
      }
      throw new bi("Bad opcode");
    }
    if ((!x.contains(Integer.valueOf(this.m))) && (!this.j)) {
      throw new bi("Expected non-final packet");
    }
    this.i = 1;
  }
  
  private byte[] a(int paramInt1, String paramString, int paramInt2)
  {
    return a(paramInt1, f(paramString), paramInt2);
  }
  
  private byte[] a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    return a(paramInt1, paramArrayOfByte, paramInt2, 0, paramArrayOfByte.length);
  }
  
  private byte[] a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.s) {
      return null;
    }
    int i2;
    int i4;
    int i1;
    label36:
    int i3;
    label46:
    int i5;
    label65:
    byte[] arrayOfByte;
    if (paramInt2 > 0)
    {
      i2 = 2;
      i4 = paramInt4 + i2 - paramInt3;
      if (i4 > 125) {
        break label251;
      }
      i1 = 2;
      if (!this.g) {
        break label271;
      }
      i3 = 4;
      i5 = i1 + i3;
      if (!this.g) {
        break label277;
      }
      i3 = 128;
      arrayOfByte = new byte[i4 + i5];
      arrayOfByte[0] = ((byte)((byte)paramInt1 | 0xFFFFFF80));
      if (i4 > 125) {
        break label283;
      }
      arrayOfByte[1] = ((byte)(i3 | i4));
    }
    for (;;)
    {
      if (paramInt2 > 0)
      {
        arrayOfByte[i5] = ((byte)(paramInt2 / 256 & 0xFF));
        arrayOfByte[(i5 + 1)] = ((byte)(paramInt2 & 0xFF));
      }
      System.arraycopy(paramArrayOfByte, paramInt3, arrayOfByte, i5 + i2, paramInt4 - paramInt3);
      if (this.g)
      {
        paramArrayOfByte = new byte[4];
        paramArrayOfByte[0] = ((byte)(int)Math.floor(Math.random() * 256.0D));
        paramArrayOfByte[1] = ((byte)(int)Math.floor(Math.random() * 256.0D));
        paramArrayOfByte[2] = ((byte)(int)Math.floor(Math.random() * 256.0D));
        paramArrayOfByte[3] = ((byte)(int)Math.floor(Math.random() * 256.0D));
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, i1, paramArrayOfByte.length);
        a(arrayOfByte, paramArrayOfByte, i5);
      }
      return arrayOfByte;
      i2 = 0;
      break;
      label251:
      if (i4 <= 65535)
      {
        i1 = 4;
        break label36;
      }
      i1 = 10;
      break label36;
      label271:
      i3 = 0;
      break label46;
      label277:
      i3 = 0;
      break label65;
      label283:
      if (i4 <= 65535)
      {
        arrayOfByte[1] = ((byte)(i3 | 0x7E));
        arrayOfByte[2] = ((byte)(i4 / 256));
        arrayOfByte[3] = ((byte)(i4 & 0xFF));
      }
      else
      {
        arrayOfByte[1] = ((byte)(i3 | 0x7F));
        arrayOfByte[2] = ((byte)(int)(i4 / 72057594037927936L & 0xFF));
        arrayOfByte[3] = ((byte)(int)(i4 / 281474976710656L & 0xFF));
        arrayOfByte[4] = ((byte)(int)(i4 / 1099511627776L & 0xFF));
        arrayOfByte[5] = ((byte)(int)(i4 / 4294967296L & 0xFF));
        arrayOfByte[6] = ((byte)(int)(i4 / 16777216L & 0xFF));
        arrayOfByte[7] = ((byte)(int)(i4 / 65536L & 0xFF));
        arrayOfByte[8] = ((byte)(int)(i4 / 256L & 0xFF));
        arrayOfByte[9] = ((byte)(i4 & 0xFF));
      }
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length - paramInt];
    System.arraycopy(paramArrayOfByte, paramInt, arrayOfByte, 0, paramArrayOfByte.length - paramInt);
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (paramArrayOfByte2.length == 0) {}
    for (;;)
    {
      return paramArrayOfByte1;
      int i1 = 0;
      while (i1 < paramArrayOfByte1.length - paramInt)
      {
        paramArrayOfByte1[(paramInt + i1)] = ((byte)(paramArrayOfByte1[(paramInt + i1)] ^ paramArrayOfByte2[(i1 % 4)]));
        i1 += 1;
      }
    }
  }
  
  private void b()
  {
    int i1 = 0;
    Object localObject3 = a(this.r, this.q, 0);
    Object localObject1 = localObject3;
    if (this.l) {}
    int i2;
    try
    {
      localObject1 = d((byte[])localObject3);
      i2 = this.m;
      if (i2 != 0) {
        break label122;
      }
      if (this.p == 0) {
        throw new bi("Mode was not set.");
      }
    }
    catch (DataFormatException localDataFormatException)
    {
      throw new IOException("Invalid deflated data");
    }
    this.t.write(localDataFormatException);
    Object localObject2;
    if (this.j)
    {
      localObject2 = this.t.toByteArray();
      if (this.p != 1) {
        break label114;
      }
      c(f((byte[])localObject2));
      c();
    }
    label114:
    label122:
    do
    {
      return;
      b((byte[])localObject2);
      break;
      if (i2 == 1)
      {
        if (this.j)
        {
          c(f((byte[])localObject2));
          return;
        }
        this.p = 1;
        this.t.write((byte[])localObject2);
        return;
      }
      if (i2 == 2)
      {
        if (this.j)
        {
          b((byte[])localObject2);
          return;
        }
        this.p = 2;
        this.t.write((byte[])localObject2);
        return;
      }
      if (i2 == 8)
      {
        if (localObject2.length >= 2) {
          i1 = (localObject2[0] & 0xFF) * 256 + (localObject2[1] & 0xFF);
        }
        if (localObject2.length > 2) {}
        for (localObject2 = f(a((byte[])localObject2, 2));; localObject2 = null)
        {
          a(i1, (String)localObject2);
          return;
        }
      }
      if (i2 == 9)
      {
        if (localObject2.length > 125) {
          throw new bi("Ping payload too large");
        }
        localObject3 = f((byte[])localObject2);
        c(a(10, (byte[])localObject2, -1));
        e((String)localObject3);
        return;
      }
    } while (i2 != 10);
    d(f((byte[])localObject2));
  }
  
  private void b(byte paramByte)
  {
    boolean bool;
    if ((paramByte & 0x80) == 128)
    {
      bool = true;
      this.k = bool;
      this.o = (paramByte & 0x7F);
      if ((this.o < 0) || (this.o > 125)) {
        break label67;
      }
      if (!this.k) {
        break label62;
      }
    }
    label62:
    for (paramByte = 3;; paramByte = 4)
    {
      this.i = paramByte;
      return;
      bool = false;
      break;
    }
    label67:
    if (this.o == 126) {}
    for (paramByte = 2;; paramByte = 8)
    {
      this.n = paramByte;
      this.i = 2;
      return;
    }
  }
  
  private void c()
  {
    this.p = 0;
    this.t.reset();
  }
  
  private byte[] d(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    this.u.setInput(paramArrayOfByte);
    if (this.u.needsInput())
    {
      paramArrayOfByte = this.u;
      byte[] arrayOfByte = new byte[4];
      arrayOfByte[2] = -1;
      arrayOfByte[3] = -1;
      paramArrayOfByte.setInput(arrayOfByte);
    }
    for (;;)
    {
      if (this.u.needsInput())
      {
        return localByteArrayOutputStream.toByteArray();
        i1 = this.u.inflate(this.v);
        localByteArrayOutputStream.write(this.v, 0, i1);
        break;
      }
      int i1 = this.u.inflate(this.v);
      localByteArrayOutputStream.write(this.v, 0, i1);
    }
  }
  
  private void e(byte[] paramArrayOfByte)
  {
    this.o = g(paramArrayOfByte);
    if (this.k) {}
    for (int i1 = 3;; i1 = 4)
    {
      this.i = i1;
      return;
    }
  }
  
  private String f(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "UTF-8");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
  
  private byte[] f(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private int g(byte[] paramArrayOfByte)
  {
    long l1 = a(paramArrayOfByte, 0, paramArrayOfByte.length);
    if ((l1 < 0L) || (l1 > 2147483647L)) {
      throw new bi("Bad integer: " + l1);
    }
    return (int)l1;
  }
  
  void a()
  {
    switch (this.i)
    {
    default: 
      return;
    case 0: 
      this.y.a(1, this.a);
      return;
    case 1: 
      this.y.a(1, this.b);
      return;
    case 2: 
      this.y.a(this.n, this.c);
      return;
    case 3: 
      this.y.a(4, this.d);
      return;
    }
    this.y.a(this.o, this.e);
  }
  
  protected abstract void a(int paramInt, String paramString);
  
  protected abstract void a(Exception paramException);
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public byte[] a(String paramString)
  {
    return a(1, paramString, -1);
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return a(2, paramArrayOfByte, -1);
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  protected abstract void b(byte[] paramArrayOfByte);
  
  public byte[] b(String paramString)
  {
    return a(9, paramString, -1);
  }
  
  protected abstract void c(String paramString);
  
  protected abstract void c(byte[] paramArrayOfByte);
  
  protected abstract void d(String paramString);
  
  protected abstract void e(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */