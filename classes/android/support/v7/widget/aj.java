package android.support.v7.widget;

class aj
  implements bw
{
  aj(RecyclerView paramRecyclerView) {}
  
  public void a(bk parambk)
  {
    RecyclerView.f(this.a).a(parambk.itemView, this.a.a);
  }
  
  public void a(bk parambk, at paramat1, at paramat2)
  {
    this.a.a.d(parambk);
    RecyclerView.a(this.a, parambk, paramat1, paramat2);
  }
  
  public void b(bk parambk, at paramat1, at paramat2)
  {
    RecyclerView.b(this.a, parambk, paramat1, paramat2);
  }
  
  public void c(bk parambk, at paramat1, at paramat2)
  {
    parambk.setIsRecyclable(false);
    if (RecyclerView.d(this.a)) {
      if (this.a.e.a(parambk, parambk, paramat1, paramat2)) {
        RecyclerView.e(this.a);
      }
    }
    while (!this.a.e.c(parambk, paramat1, paramat2)) {
      return;
    }
    RecyclerView.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */