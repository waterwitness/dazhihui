package org.a.b;

import java.io.IOException;

public class l
  extends IOException
{
  private final Throwable a;
  
  l(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.a = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */