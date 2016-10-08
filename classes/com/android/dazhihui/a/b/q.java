package com.android.dazhihui.a.b;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Vector;

public class q
{
  private DataInputStream a;
  private ByteArrayInputStream b;
  
  public q(byte[] paramArrayOfByte)
  {
    this.b = new ByteArrayInputStream(paramArrayOfByte);
    this.a = new DataInputStream(this.b);
    try
    {
      this.a.available();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  public int a()
  {
    return e();
  }
  
  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.a.read(arrayOfByte);
    return arrayOfByte;
  }
  
  public int b()
  {
    try
    {
      int i = this.a.readByte();
      return i;
    }
    catch (Exception localException)
    {
      throw new RuntimeException();
    }
  }
  
  public byte[] b(int paramInt)
  {
    if (paramInt == 0) {}
    byte[] arrayOfByte;
    for (paramInt = e();; paramInt = h())
    {
      arrayOfByte = new byte[paramInt];
      if (arrayOfByte.length != 0) {
        break;
      }
      return arrayOfByte;
    }
    paramInt = 0;
    for (;;)
    {
      int i;
      try
      {
        if (paramInt >= arrayOfByte.length) {
          break;
        }
        i = this.a.read(arrayOfByte, paramInt, arrayOfByte.length - paramInt);
        if (i == -1) {
          throw new IOException();
        }
      }
      catch (IOException localIOException)
      {
        return arrayOfByte;
      }
      paramInt += i;
    }
  }
  
  public int c()
  {
    try
    {
      int i = this.a.available();
      return i;
    }
    catch (IOException localIOException) {}
    return -1;
  }
  
  public int c(int paramInt)
  {
    if (paramInt == 0) {
      return e();
    }
    return h();
  }
  
  public int d()
  {
    int i = e();
    if (i >> 15 == 0) {
      return i;
    }
    return ((i ^ 0xFFFFFFFF) + 1 & 0xFFFF) * -1;
  }
  
  public int e()
  {
    int i;
    int j;
    try
    {
      i = this.a.read();
      j = this.a.read();
      if ((j | i) < 0) {
        throw new EOFException();
      }
    }
    catch (IOException localIOException)
    {
      return 0;
    }
    return (i << 0) + (j << 8);
  }
  
  public int f()
  {
    int i = h();
    if (i >> 31 == 0) {
      return i;
    }
    return ((i ^ 0xFFFFFFFF) + 1 & 0xFFFFFFFF) * -1;
  }
  
  public int g()
  {
    int j;
    do
    {
      int k;
      try
      {
        i = this.a.read();
        j = this.a.read();
        k = this.a.read();
        if ((k | j | i) < 0) {
          throw new EOFException();
        }
      }
      catch (IOException localIOException)
      {
        i = 0;
        return i;
      }
      j = (i << 0) + ((j << 8) + (k << 16));
      int i = j;
    } while (j >> 23 == 0);
    return ((j ^ 0xFFFFFFFF) + 1 & 0xFFFFFF) * -1;
  }
  
  public int h()
  {
    int i;
    int j;
    int k;
    int m;
    try
    {
      i = this.a.read();
      j = this.a.read();
      k = this.a.read();
      m = this.a.read();
      if ((m | k | j | i) < 0) {
        throw new EOFException();
      }
    }
    catch (IOException localIOException)
    {
      return 0;
    }
    return (i << 0) + ((j << 8) + ((k << 16) + (m << 24)));
  }
  
  public float i()
  {
    try
    {
      float f = Float.intBitsToFloat(h());
      return f;
    }
    catch (Exception localException) {}
    return 0.0F;
  }
  
  public int[] j()
  {
    int[] arrayOfInt = new int[a()];
    int i = 0;
    while (i < arrayOfInt.length)
    {
      arrayOfInt[i] = h();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public long k()
  {
    long l1;
    long l2;
    long l3;
    long l4;
    long l5;
    long l6;
    long l7;
    long l8;
    try
    {
      l1 = this.a.read();
      l2 = this.a.read();
      l3 = this.a.read();
      l4 = this.a.read();
      l5 = this.a.read();
      l6 = this.a.read();
      l7 = this.a.read();
      l8 = this.a.read();
      if ((l8 | l7 | l6 | l5 | l4 | l3 | l2 | l1) < 0L) {
        throw new EOFException();
      }
    }
    catch (IOException localIOException)
    {
      return 0L;
    }
    return (l1 << 0) + ((l2 << 8) + ((l3 << 16) + ((l4 << 24) + ((l5 << 32) + ((l6 << 40) + ((l7 << 48) + (l8 << 56)))))));
  }
  
  public String l()
  {
    try
    {
      Object localObject = new byte[a()];
      this.a.read((byte[])localObject);
      localObject = new String((byte[])localObject, "UTF-8");
      return (String)localObject;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public String[] m()
  {
    String[] arrayOfString = new String[a()];
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = l();
      i += 1;
    }
    return arrayOfString;
  }
  
  public Vector<String> n()
  {
    int j = a();
    Vector localVector = new Vector(j);
    int i = 0;
    while (i < j)
    {
      localVector.addElement(l());
      i += 1;
    }
    return localVector;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */