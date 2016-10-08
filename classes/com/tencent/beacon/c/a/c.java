package com.tencent.beacon.c.a;

import com.tencent.beacon.f.a;
import com.tencent.beacon.f.b;

public final class c
  extends com.tencent.beacon.f.c
{
  private static byte[] j;
  public byte a = 0;
  public int b = 0;
  public byte[] c = null;
  public String d = "";
  public byte e = 0;
  public byte f = 0;
  public long g = 0L;
  public String h = "";
  public String i = "";
  
  public final void a(a parama)
  {
    this.a = parama.a(this.a, 0, true);
    this.b = parama.a(this.b, 1, true);
    if (j == null)
    {
      arrayOfByte = (byte[])new byte[1];
      j = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    byte[] arrayOfByte = j;
    this.c = ((byte[])parama.c(2, true));
    this.d = parama.b(3, true);
    this.e = parama.a(this.e, 4, true);
    this.f = parama.a(this.f, 5, true);
    this.g = parama.a(this.g, 6, true);
    this.h = parama.b(7, false);
    this.i = parama.b(8, false);
  }
  
  public final void a(b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    paramb.a(this.c, 2);
    paramb.a(this.d, 3);
    paramb.a(this.e, 4);
    paramb.a(this.f, 5);
    paramb.a(this.g, 6);
    if (this.h != null) {
      paramb.a(this.h, 7);
    }
    if (this.i != null) {
      paramb.a(this.i, 8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */