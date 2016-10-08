package com.tencent.beaconimsdk.b.a;

import com.tencent.beaconimsdk.d.a;
import com.tencent.beaconimsdk.d.c;

public final class b
  extends c
{
  private static byte[] m;
  public byte a = 0;
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public int f = 0;
  public byte[] g = null;
  public byte h = 0;
  public byte i = 0;
  public String j = "";
  public String k = "";
  public String l = "";
  
  public final void a(a parama)
  {
    this.a = parama.a(this.a, 0, true);
    this.b = parama.a(1, true);
    this.c = parama.a(2, true);
    this.d = parama.a(3, true);
    this.e = parama.a(4, true);
    this.f = parama.a(this.f, 5, true);
    if (m == null)
    {
      arrayOfByte = (byte[])new byte[1];
      m = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    byte[] arrayOfByte = m;
    this.g = ((byte[])parama.b(6, true));
    this.h = parama.a(this.h, 7, true);
    this.i = parama.a(this.i, 8, true);
    this.j = parama.a(9, false);
    this.k = parama.a(10, false);
    this.l = parama.a(11, false);
  }
  
  public final void a(com.tencent.beaconimsdk.d.b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    paramb.a(this.c, 2);
    paramb.a(this.d, 3);
    paramb.a(this.e, 4);
    paramb.a(this.f, 5);
    paramb.a(this.g, 6);
    paramb.a(this.h, 7);
    paramb.a(this.i, 8);
    if (this.j != null) {
      paramb.a(this.j, 9);
    }
    if (this.k != null) {
      paramb.a(this.k, 10);
    }
    if (this.l != null) {
      paramb.a(this.l, 11);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */