package qalsdk;

public abstract class i
{
  protected bi[] b = { new c("http://3gimg.qq.com/qq_product_operations/nettest/index.html", "MobileQQ1"), new c("http://3gimg.qq.com/qq_product_operations/nettest/index2.html", "MobileQQ2") };
  
  protected be a(bi parambi, int paramInt, bf parambf)
  {
    switch (parambi.c)
    {
    case 1: 
    default: 
      return null;
    case 2: 
      return new bg(paramInt, ((c)parambi).a, parambi.d, 10000, parambf);
    }
    parambi = (d)parambi;
    return new bh(paramInt, parambi.a, parambi.b, parambi.d, 10000, parambf);
  }
  
  public abstract void a();
  
  public abstract void a(String paramString);
  
  public abstract void b();
  
  public abstract void b(String paramString);
  
  public abstract void c();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */