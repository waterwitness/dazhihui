package com.d.a.c.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e
  implements c
{
  long[] a;
  private int b;
  
  public e()
  {
    this.a = new long[1];
  }
  
  private e(d paramd)
  {
    long[] arrayOfLong = new long[2];
    arrayOfLong[0] = paramd.a;
    this.a = arrayOfLong;
  }
  
  private void e(int paramInt)
  {
    long[] arrayOfLong = new long[paramInt];
    if (this.a != null) {
      System.arraycopy(this.a, 0, arrayOfLong, 0, this.a.length);
    }
    this.a = arrayOfLong;
  }
  
  private int f(int paramInt)
  {
    paramInt = (this.b + paramInt) / 64;
    if (paramInt > this.a.length - 1) {
      e(paramInt + 1);
    }
    return paramInt;
  }
  
  private int g(int paramInt)
  {
    return (this.b + paramInt) % 64;
  }
  
  private static int h(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException(String.format("input must be a positive number: %s", new Object[] { Integer.valueOf(paramInt) }));
    }
    return paramInt;
  }
  
  public void a()
  {
    Arrays.fill(this.a, 0L);
  }
  
  public void a(int paramInt)
  {
    h(paramInt);
    int i = f(paramInt);
    long[] arrayOfLong = this.a;
    arrayOfLong[i] |= 1L << g(paramInt);
  }
  
  List<Integer> b()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = this.a.length;
    int k = this.b;
    for (;;)
    {
      if (i >= j * 64 - k) {
        return localArrayList;
      }
      if (c(i)) {
        localArrayList.add(Integer.valueOf(i));
      }
      i += 1;
    }
  }
  
  public void b(int paramInt)
  {
    h(paramInt);
    int i = f(paramInt);
    long[] arrayOfLong = this.a;
    arrayOfLong[i] ^= 1L << g(paramInt);
  }
  
  public boolean c(int paramInt)
  {
    h(paramInt);
    int i = f(paramInt);
    return (this.a[i] & 1L << g(paramInt)) != 0L;
  }
  
  public void d(int paramInt)
  {
    this.b -= h(paramInt);
    if (this.b < 0)
    {
      paramInt = this.b / -64 + 1;
      long[] arrayOfLong = new long[this.a.length + paramInt];
      System.arraycopy(this.a, 0, arrayOfLong, paramInt, this.a.length);
      this.a = arrayOfLong;
      this.b = (this.b % 64 + 64);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{");
    List localList = b();
    int i = 0;
    int j = localList.size();
    for (;;)
    {
      if (i >= j) {
        return '}';
      }
      if (i > 0) {
        localStringBuilder.append(',');
      }
      localStringBuilder.append(localList.get(i));
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */