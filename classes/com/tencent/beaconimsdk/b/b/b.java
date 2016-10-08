package com.tencent.beaconimsdk.b.b;

import com.tencent.beaconimsdk.d.c;
import java.util.ArrayList;

public final class b
  extends c
  implements Cloneable
{
  private static ArrayList<a> b;
  public ArrayList<a> a = null;
  
  public final void a(com.tencent.beaconimsdk.d.a parama)
  {
    if (b == null)
    {
      b = new ArrayList();
      a locala = new a();
      b.add(locala);
    }
    this.a = ((ArrayList)parama.a(b, 0, true));
  }
  
  public final void a(com.tencent.beaconimsdk.d.b paramb)
  {
    paramb.a(this.a, 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\b\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */