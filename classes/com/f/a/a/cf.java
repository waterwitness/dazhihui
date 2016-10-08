package com.f.a.a;

public class cf
{
  static
  {
    if (!cf.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    eh localeh = new eh(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localeh.a(paramArrayOfByte, paramInt1, paramInt2, true)) {
      throw new IllegalArgumentException("bad base-64");
    }
    if (localeh.b == localeh.a.length) {
      return localeh.a;
    }
    paramArrayOfByte = new byte[localeh.b];
    System.arraycopy(localeh.a, 0, paramArrayOfByte, 0, localeh.b);
    return paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */