package com.d.a.c.d;

import com.d.a.d.b;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class f
  implements Serializable
{
  public static final f a = a(new byte[0]);
  private static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  final byte[] b;
  private transient int d;
  private transient String e;
  
  f(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public static f a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("s == null");
    }
    f localf = new f(paramString.getBytes(b.b));
    localf.e = paramString;
    return localf;
  }
  
  public static f a(byte... paramVarArgs)
  {
    if (paramVarArgs == null) {
      throw new IllegalArgumentException("data == null");
    }
    return new f((byte[])paramVarArgs.clone());
  }
  
  public byte a(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public String a()
  {
    String str = this.e;
    if (str != null) {
      return str;
    }
    str = new String(this.b, b.b);
    this.e = str;
    return str;
  }
  
  public String b()
  {
    int i = 0;
    char[] arrayOfChar = new char[this.b.length * 2];
    byte[] arrayOfByte = this.b;
    int k = arrayOfByte.length;
    int j = 0;
    for (;;)
    {
      if (i >= k) {
        return new String(arrayOfChar);
      }
      int m = arrayOfByte[i];
      int n = j + 1;
      arrayOfChar[j] = c[(m >> 4 & 0xF)];
      j = n + 1;
      arrayOfChar[n] = c[(m & 0xF)];
      i += 1;
    }
  }
  
  public f c()
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.b.length) {
        return this;
      }
      j = this.b[i];
      if ((j >= 65) && (j <= 90)) {
        break;
      }
      i += 1;
    }
    byte[] arrayOfByte = (byte[])this.b.clone();
    arrayOfByte[i] = ((byte)(j + 32));
    i += 1;
    if (i >= arrayOfByte.length) {
      return new f(arrayOfByte);
    }
    int j = arrayOfByte[i];
    if ((j < 65) || (j > 90)) {}
    for (;;)
    {
      i += 1;
      break;
      arrayOfByte[i] = ((byte)(j + 32));
    }
  }
  
  public int d()
  {
    return this.b.length;
  }
  
  public byte[] e()
  {
    return (byte[])this.b.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof f)) && (Arrays.equals(((f)paramObject).b, this.b)));
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i != 0) {
      return i;
    }
    i = Arrays.hashCode(this.b);
    this.d = i;
    return i;
  }
  
  public String toString()
  {
    if (this.b.length == 0) {
      return "ByteString[size=0]";
    }
    if (this.b.length <= 16) {
      return String.format("ByteString[size=%s data=%s]", new Object[] { Integer.valueOf(this.b.length), b() });
    }
    try
    {
      String str = String.format("ByteString[size=%s md5=%s]", new Object[] { Integer.valueOf(this.b.length), a(MessageDigest.getInstance("MD5").digest(this.b)).b() });
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new AssertionError();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */