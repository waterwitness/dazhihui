package org.a.b;

public class f
  extends RuntimeException
{
  Exception b;
  
  public Throwable getCause()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */