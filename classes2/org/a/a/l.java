package org.a.a;

import java.io.IOException;

public abstract class l
  extends bd
{
  public static l a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new i(paramArrayOfByte);
    try
    {
      paramArrayOfByte = (l)paramArrayOfByte.c();
      return paramArrayOfByte;
    }
    catch (ClassCastException paramArrayOfByte)
    {
      throw new IOException("cannot recognise object in stream");
    }
  }
  
  abstract void a(bh parambh);
  
  abstract boolean a(bd parambd);
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    while (((paramObject instanceof ar)) && (a(((ar)paramObject).c()))) {
      return true;
    }
    return false;
  }
  
  public abstract int hashCode();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */