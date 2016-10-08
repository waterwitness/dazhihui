package com.a.a.a.a;

public class c
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private final String c;
  
  public static char[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, true);
  }
  
  public static char[] a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (char[] arrayOfChar = a;; arrayOfChar = b) {
      return a(paramArrayOfByte, arrayOfChar);
    }
  }
  
  protected static char[] a(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    int j = 0;
    int k = paramArrayOfByte.length;
    char[] arrayOfChar = new char[k << 1];
    int i = 0;
    for (;;)
    {
      if (i >= k) {
        return arrayOfChar;
      }
      int m = j + 1;
      arrayOfChar[j] = paramArrayOfChar[((paramArrayOfByte[i] & 0xF0) >>> 4)];
      j = m + 1;
      arrayOfChar[m] = paramArrayOfChar[(paramArrayOfByte[i] & 0xF)];
      i += 1;
    }
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    return new String(a(paramArrayOfByte));
  }
  
  public String toString()
  {
    return super.toString() + "[charsetName=" + this.c + "]";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\a\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */