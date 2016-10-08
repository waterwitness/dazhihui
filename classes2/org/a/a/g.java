package org.a.a;

import java.io.IOException;

public class g
  extends IOException
{
  private Throwable a;
  
  g(String paramString)
  {
    super(paramString);
  }
  
  g(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.a = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */