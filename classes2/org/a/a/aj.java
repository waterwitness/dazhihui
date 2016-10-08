package org.a.a;

import java.io.IOException;

public class aj
  implements u
{
  private v a;
  
  aj(v paramv)
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
      throw new q(localIOException.getMessage(), localIOException);
    }
  }
  
  public bd g()
  {
    return new ai(this.a.b(), false);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */