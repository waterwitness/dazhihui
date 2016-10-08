package com.tencent.beacon.c.d;

import java.util.ArrayList;

public final class c
  extends com.tencent.beacon.f.c
  implements Cloneable
{
  private static ArrayList<b> d;
  private static ArrayList<a> e;
  private static ArrayList<d> f;
  public ArrayList<b> a = null;
  public ArrayList<a> b = null;
  public ArrayList<d> c = null;
  
  public final void a(com.tencent.beacon.f.a parama)
  {
    Object localObject;
    if (d == null)
    {
      d = new ArrayList();
      localObject = new b();
      d.add(localObject);
    }
    this.a = ((ArrayList)parama.a(d, 0, true));
    if (e == null)
    {
      e = new ArrayList();
      localObject = new a();
      e.add(localObject);
    }
    this.b = ((ArrayList)parama.a(e, 1, true));
    if (f == null)
    {
      f = new ArrayList();
      localObject = new d();
      f.add(localObject);
    }
    this.c = ((ArrayList)parama.a(f, 2, false));
  }
  
  public final void a(com.tencent.beacon.f.b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    if (this.c != null) {
      paramb.a(this.c, 2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\c\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */