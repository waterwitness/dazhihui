package org.a.a;

import java.io.IOException;
import java.util.Enumeration;

class by
  implements Enumeration
{
  private i a;
  private Object b;
  
  public by(byte[] paramArrayOfByte)
  {
    this.a = new i(paramArrayOfByte, true);
    this.b = a();
  }
  
  private Object a()
  {
    try
    {
      bd localbd = this.a.c();
      return localbd;
    }
    catch (IOException localIOException)
    {
      throw new q("malformed DER construction: " + localIOException, localIOException);
    }
  }
  
  public boolean hasMoreElements()
  {
    return this.b != null;
  }
  
  public Object nextElement()
  {
    Object localObject = this.b;
    this.b = a();
    return localObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */