package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class d
  implements ar
{
  public byte[] a()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    new p(localByteArrayOutputStream).a(this);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public byte[] a(String paramString)
  {
    if (paramString.equals("DER"))
    {
      paramString = new ByteArrayOutputStream();
      new bh(paramString).a(this);
      return paramString.toByteArray();
    }
    return a();
  }
  
  public byte[] b()
  {
    try
    {
      byte[] arrayOfByte = a("DER");
      return arrayOfByte;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public bd c()
  {
    return d();
  }
  
  public abstract bd d();
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ar)) {
      return false;
    }
    paramObject = (ar)paramObject;
    return d().equals(((ar)paramObject).c());
  }
  
  public int hashCode()
  {
    return d().hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */