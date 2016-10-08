package org.a.a;

import java.io.IOException;

public class av
  implements ar, bw
{
  private v a;
  
  public av(v paramv)
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
      throw new q("unable to get DER object", localIOException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new q("unable to get DER object", localIllegalArgumentException);
    }
  }
  
  public bd g()
  {
    try
    {
      au localau = new au(this.a.b());
      return localau;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new g(localIllegalArgumentException.getMessage(), localIllegalArgumentException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */