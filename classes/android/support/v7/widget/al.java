package android.support.v7.widget;

class al
  implements b
{
  al(RecyclerView paramRecyclerView) {}
  
  public bk a(int paramInt)
  {
    bk localbk = this.a.a(paramInt, true);
    if (localbk == null) {}
    while (this.a.c.c(localbk.itemView)) {
      return null;
    }
    return localbk;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.g = true;
    bh.a(this.a.f, paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.a(paramInt1, paramInt2, paramObject);
    this.a.h = true;
  }
  
  public void a(c paramc)
  {
    c(paramc);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.g = true;
  }
  
  public void b(c paramc)
  {
    c(paramc);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
    this.a.g = true;
  }
  
  void c(c paramc)
  {
    switch (paramc.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return;
    case 1: 
      RecyclerView.f(this.a).a(this.a, paramc.b, paramc.d);
      return;
    case 2: 
      RecyclerView.f(this.a).b(this.a, paramc.b, paramc.d);
      return;
    case 4: 
      RecyclerView.f(this.a).a(this.a, paramc.b, paramc.d, paramc.c);
      return;
    }
    RecyclerView.f(this.a).a(this.a, paramc.b, paramc.d, 1);
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    this.a.d(paramInt1, paramInt2);
    this.a.g = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */