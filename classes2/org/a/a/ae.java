package org.a.a;

import java.io.IOException;
import java.io.InputStream;
import org.a.e.b.a;

public class ae
  implements o
{
  private v a;
  
  ae(v paramv)
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
      throw new q("IOException converting stream to byte array: " + localIOException.getMessage(), localIOException);
    }
  }
  
  public InputStream e()
  {
    return new am(this.a);
  }
  
  public bd g()
  {
    return new ac(a.a(e()));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */