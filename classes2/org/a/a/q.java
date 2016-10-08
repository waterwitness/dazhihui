package org.a.a;

public class q
  extends IllegalStateException
{
  private Throwable a;
  
  q(String paramString)
  {
    super(paramString);
  }
  
  q(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.a = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */