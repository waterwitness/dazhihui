package org.a.a;

import java.io.IOException;
import java.io.InputStream;

public class bg
  implements o
{
  private bv a;
  
  bg(bv parambv)
  {
    this.a = parambv;
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
      throw new q("IOException converting stream to byte array: " + localIOException.getMessage(), localIOException);
    }
  }
  
  public InputStream e()
  {
    return this.a;
  }
  
  public bd g()
  {
    return new bf(this.a.b());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */