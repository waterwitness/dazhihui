package org.a.c;

import java.io.IOException;
import java.security.Principal;
import org.a.a.k.h;

public class b
  extends h
  implements Principal
{
  public b(String paramString)
  {
    super(paramString);
  }
  
  public byte[] a()
  {
    try
    {
      byte[] arrayOfByte = a("DER");
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException.toString());
    }
  }
  
  public String getName()
  {
    return toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */