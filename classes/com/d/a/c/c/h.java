package com.d.a.c.c;

import com.d.a.a.f;
import com.d.a.al;
import com.d.a.ay;
import com.d.a.bi;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

class h
  implements bi<byte[]>
{
  int a;
  boolean b;
  
  h(g paramg, al paramal, ay paramay) {}
  
  private void a()
  {
    ay localay = new ay(this.d);
    k localk = new k(this);
    if ((this.a & 0x8) != 0)
    {
      localay.a((byte)0, localk);
      return;
    }
    if ((this.a & 0x10) != 0)
    {
      localay.a((byte)0, localk);
      return;
    }
    b();
  }
  
  private void b()
  {
    if (this.b)
    {
      this.e.a(2, new l(this, this.d));
      return;
    }
    this.c.d = false;
    this.c.a(this.d);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    short s = g.a(paramArrayOfByte, 0, ByteOrder.LITTLE_ENDIAN);
    if (s != 35615)
    {
      this.c.a(new IOException(String.format("unknown format (magic number %x)", new Object[] { Short.valueOf(s) })));
      this.d.a(new f());
      return;
    }
    this.a = paramArrayOfByte[3];
    if ((this.a & 0x2) != 0) {}
    for (;;)
    {
      this.b = bool;
      if (this.b) {
        this.c.e.update(paramArrayOfByte, 0, paramArrayOfByte.length);
      }
      if ((this.a & 0x4) == 0) {
        break;
      }
      this.e.a(2, new i(this, this.e));
      return;
      bool = false;
    }
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */