package com.d.a.b;

public abstract class n<T, F>
  extends l<T>
  implements g<F>
{
  public void a(Exception paramException, F paramF)
  {
    if (isCancelled()) {
      return;
    }
    if (paramException != null)
    {
      b(paramException);
      return;
    }
    try
    {
      a(paramF);
      return;
    }
    catch (Exception paramException)
    {
      b(paramException);
    }
  }
  
  protected abstract void a(F paramF);
  
  protected void b(Exception paramException)
  {
    a(paramException);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */