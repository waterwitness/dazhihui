package com.android.dazhihui.a.b;

import com.android.dazhihui.d.b.o;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

public class x
{
  private ByteArrayOutputStream a = new ByteArrayOutputStream();
  private DataOutputStream b = new DataOutputStream(this.a);
  private int c;
  private x d = null;
  private boolean e = false;
  private w f;
  private String g = "";
  
  public x() {}
  
  public x(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public void a(float paramFloat)
  {
    try
    {
      d(Float.floatToIntBits(paramFloat));
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public void a(int paramInt)
  {
    c(paramInt);
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.b.write((byte)(int)(paramLong >>> 0 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 8 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 16 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 24 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 32 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 40 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 48 & 0xFF));
      this.b.write((byte)(int)(paramLong >>> 56 & 0xFF));
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public void a(w paramw)
  {
    this.f = paramw;
  }
  
  public void a(x paramx)
  {
    this.d = paramx;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(paramx.a() & 0xFF);
      localByteArrayOutputStream.write(paramx.a() >>> 8 & 0xFF);
      localByteArrayOutputStream.write(0);
      localByteArrayOutputStream.write(0);
      localByteArrayOutputStream.write(paramx.b().length & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramx.b());
      a(localByteArrayOutputStream.toByteArray());
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramx) {}
  }
  
  public void a(x paramx, int paramInt)
  {
    this.d = paramx;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(paramx.a() & 0xFF);
      localByteArrayOutputStream.write(paramx.a() >>> 8 & 0xFF);
      localByteArrayOutputStream.write(0);
      localByteArrayOutputStream.write(0);
      localByteArrayOutputStream.write(paramx.b().length & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramInt >>> 0 & 0xFF);
      localByteArrayOutputStream.write(paramInt >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramInt >>> 16 & 0xFF);
      localByteArrayOutputStream.write(paramInt >>> 24 & 0xFF);
      localByteArrayOutputStream.write(paramx.b());
      a(localByteArrayOutputStream.toByteArray());
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramx) {}
  }
  
  public void a(x paramx, int paramInt1, int paramInt2)
  {
    this.d = paramx;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(paramx.a() & 0xFF);
      localByteArrayOutputStream.write(paramx.a() >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramInt1 & 0xFF);
      localByteArrayOutputStream.write(paramInt1 >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramInt2 >>> 0 & 0xFF);
      localByteArrayOutputStream.write(paramInt2 >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramInt2 >>> 16 & 0xFF);
      localByteArrayOutputStream.write(paramInt2 >>> 24 & 0xFF);
      localByteArrayOutputStream.write(paramx.b());
      a(localByteArrayOutputStream.toByteArray());
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramx) {}
  }
  
  public void a(x paramx, short paramShort)
  {
    this.d = paramx;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(paramx.a() & 0xFF);
      localByteArrayOutputStream.write(paramx.a() >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramShort & 0xFF);
      localByteArrayOutputStream.write(paramShort >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length & 0xFF);
      localByteArrayOutputStream.write(paramx.b().length >>> 8 & 0xFF);
      localByteArrayOutputStream.write(paramx.b());
      a(localByteArrayOutputStream.toByteArray());
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramx) {}
  }
  
  public void a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    try
    {
      paramString = str.getBytes("UTF-8");
      a(paramString.length);
      this.b.write(paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void a(Vector<String> paramVector)
  {
    if (paramVector == null) {}
    for (;;)
    {
      return;
      int j = paramVector.size();
      a(j);
      int i = 0;
      while (i < j)
      {
        a((String)paramVector.elementAt(i));
        i += 1;
      }
    }
  }
  
  public void a(Vector<String> paramVector, int paramInt1, int paramInt2)
  {
    int j = paramVector.size();
    int i = paramInt2;
    if (paramInt2 + paramInt1 > j) {
      i = j - paramInt1;
    }
    a(i);
    paramInt2 = paramInt1;
    while (paramInt2 < paramInt1 + i)
    {
      a((String)paramVector.elementAt(paramInt2));
      paramInt2 += 1;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      b(paramArrayOfByte[i]);
      i += 1;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt == 0) {
      c(paramArrayOfByte.length);
    }
    for (;;)
    {
      paramInt = 0;
      while (paramInt < paramArrayOfByte.length)
      {
        b(paramArrayOfByte[paramInt]);
        paramInt += 1;
      }
      d(paramArrayOfByte.length);
    }
  }
  
  public void a(int[] paramArrayOfInt)
  {
    a(paramArrayOfInt.length);
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      c(paramArrayOfInt[i]);
      i += 1;
    }
  }
  
  public void a(String[] paramArrayOfString)
  {
    a(paramArrayOfString.length);
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      a(paramArrayOfString[i]);
      i += 1;
    }
  }
  
  public void b(int paramInt)
  {
    try
    {
      this.b.writeByte(paramInt);
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public void b(String paramString)
  {
    try
    {
      paramString = o.a(paramString.getBytes("UTF-8"));
      a(paramString.length);
      this.b.write(paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void b(Vector<String> paramVector)
  {
    int i = paramVector.size();
    a(i);
    i -= 1;
    while (i >= 0)
    {
      a((String)paramVector.elementAt(i));
      i -= 1;
    }
  }
  
  public void b(int[] paramArrayOfInt)
  {
    a(paramArrayOfInt.length);
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      d(paramArrayOfInt[i]);
      i += 1;
    }
  }
  
  public byte[] b()
  {
    return this.a.toByteArray();
  }
  
  public void c()
  {
    try
    {
      if (this.b != null) {
        this.b.close();
      }
      if (this.a != null) {
        this.a.close();
      }
      this.b = null;
      this.a = null;
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public void c(int paramInt)
  {
    try
    {
      this.b.write(paramInt >>> 0 & 0xFF);
      this.b.write(paramInt >>> 8 & 0xFF);
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public void c(String paramString)
  {
    this.g = paramString;
  }
  
  public x d()
  {
    return this.d;
  }
  
  public void d(int paramInt)
  {
    try
    {
      this.b.write(paramInt >>> 0 & 0xFF);
      this.b.write(paramInt >>> 8 & 0xFF);
      this.b.write(paramInt >>> 16 & 0xFF);
      this.b.write(paramInt >>> 24 & 0xFF);
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public w f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */