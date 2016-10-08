package org.a.a;

import java.io.IOException;

public class bk
  implements s
{
  private v a;
  
  bk(v paramv)
  {
    this.a = paramv;
  }
  
  public bd c()
  {
    try
    {
      bd localbd = g();
      return localbd;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException.getMessage());
    }
  }
  
  public bd g()
  {
    return new bj(this.a.b());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */