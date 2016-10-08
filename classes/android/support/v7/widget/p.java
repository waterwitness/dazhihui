package android.support.v7.widget;

class p
{
  public bk a;
  public bk b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private p(bk parambk1, bk parambk2)
  {
    this.a = parambk1;
    this.b = parambk2;
  }
  
  private p(bk parambk1, bk parambk2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(parambk1, parambk2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }
  
  public String toString()
  {
    return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */