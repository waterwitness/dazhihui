package org.a.b;

public class c
  extends Exception
{
  Exception a;
  
  public c(String paramString, Exception paramException)
  {
    super(paramString);
    this.a = paramException;
  }
  
  public Throwable getCause()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */