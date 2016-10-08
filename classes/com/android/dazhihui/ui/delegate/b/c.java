package com.android.dazhihui.ui.delegate.b;

public class c
{
  public static char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  
  public static String a(byte paramByte)
  {
    paramByte &= 0xFF;
    int i = (paramByte & 0xF0) / 16;
    return new String(new char[] { a[i], a[((paramByte & 0xF) % 16)] });
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuffer.append(a(paramArrayOfByte[i]));
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */