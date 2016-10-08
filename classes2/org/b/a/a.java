package org.b.a;

public class a
  extends Exception
{
  private Throwable a;
  
  public a(String paramString)
  {
    super(paramString);
  }
  
  public a(Throwable paramThrowable)
  {
    super(paramThrowable.getMessage());
    this.a = paramThrowable;
  }
  
  public Throwable getCause()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */