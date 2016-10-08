package qalsdk;

public abstract class be
  implements Runnable
{
  protected int a;
  protected bf b;
  
  public be(int paramInt, bf parambf)
  {
    this.a = paramInt;
    this.b = parambf;
  }
  
  protected abstract int a(String paramString);
  
  protected void a(int paramInt, String paramString)
  {
    b();
    if (this.b != null) {
      this.b.a(this.a, paramInt, paramString, d());
    }
  }
  
  protected abstract boolean a();
  
  protected abstract void b();
  
  protected abstract String c();
  
  protected abstract Object d();
  
  public void run()
  {
    if (!a())
    {
      a(-1, null);
      return;
    }
    String str = c();
    if (str == null)
    {
      a(-2, null);
      return;
    }
    a(a(str), str);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */