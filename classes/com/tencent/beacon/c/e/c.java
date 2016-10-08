package com.tencent.beacon.c.e;

import com.tencent.beacon.f.a;
import com.tencent.beacon.f.b;

public final class c
  extends com.tencent.beacon.f.c
{
  public String a = "";
  public int b = 0;
  public boolean c = true;
  private int d = 0;
  
  public final void a(a parama)
  {
    this.a = parama.b(0, true);
    this.b = parama.a(this.b, 1, true);
    this.d = parama.a(this.d, 2, false);
    boolean bool = this.c;
    this.c = parama.a(3, false);
  }
  
  public final void a(b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    paramb.a(this.d, 2);
    paramb.a(this.c, 3);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\c\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */