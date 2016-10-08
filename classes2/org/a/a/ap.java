package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.a.e.a;

public class ap
  extends l
  implements bn
{
  private static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  protected byte[] a;
  protected int b;
  
  public ap(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0);
  }
  
  public ap(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt;
  }
  
  public static ap a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof ap))) {
      return (ap)paramObject;
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static ap a(x paramx, boolean paramBoolean)
  {
    paramx = paramx.h();
    if ((paramBoolean) || ((paramx instanceof ap))) {
      return a(paramx);
    }
    return b(((n)paramx).f());
  }
  
  static ap b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 1) {
      throw new IllegalArgumentException("truncated BIT STRING detected");
    }
    int i = paramArrayOfByte[0];
    byte[] arrayOfByte = new byte[paramArrayOfByte.length - 1];
    if (arrayOfByte.length != 0) {
      System.arraycopy(paramArrayOfByte, 1, arrayOfByte, 0, paramArrayOfByte.length - 1);
    }
    return new ap(arrayOfByte, i);
  }
  
  void a(bh parambh)
  {
    byte[] arrayOfByte = new byte[e().length + 1];
    arrayOfByte[0] = ((byte)f());
    System.arraycopy(e(), 0, arrayOfByte, 1, arrayOfByte.length - 1);
    parambh.a(3, arrayOfByte);
  }
  
  protected boolean a(bd parambd)
  {
    if (!(parambd instanceof ap)) {}
    do
    {
      return false;
      parambd = (ap)parambd;
    } while ((this.b != parambd.b) || (!a.a(this.a, parambd.a)));
    return true;
  }
  
  public byte[] e()
  {
    return this.a;
  }
  
  public int f()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return this.b ^ a.a(this.a);
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
        localStringBuffer.append(c[(localObject[i] >>> 4 & 0xF)]);
        localStringBuffer.append(c[(localObject[i] & 0xF)]);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */