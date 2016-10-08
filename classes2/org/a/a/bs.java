package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class bs
  extends l
  implements bn
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  private byte[] b;
  
  public bs(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  void a(bh parambh)
  {
    parambh.a(28, e());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof bs)) {
      return false;
    }
    return i_().equals(((bs)parambd).i_());
  }
  
  public byte[] e()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return i_().hashCode();
  }
  
  public String i_()
  {
    StringBuffer localStringBuffer = new StringBuffer("#");
    Object localObject = new ByteArrayOutputStream();
    p localp = new p((OutputStream)localObject);
    try
    {
      localp.a(this);
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      int i = 0;
      while (i != localObject.length)
      {
        localStringBuffer.append(a[(localObject[i] >>> 4 & 0xF)]);
        localStringBuffer.append(a[(localObject[i] & 0xF)]);
        i += 1;
      }
      return localIOException.toString();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("internal error encoding BitString");
    }
  }
  
  public String toString()
  {
    return i_();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */