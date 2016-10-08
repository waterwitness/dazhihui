package com.d.a.c.c;

import com.d.a.al;
import com.d.a.bi;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

class l
  implements bi<byte[]>
{
  l(h paramh, al paramal) {}
  
  public void a(byte[] paramArrayOfByte)
  {
    int i = g.a(paramArrayOfByte, 0, ByteOrder.LITTLE_ENDIAN);
    if ((short)(int)h.c(this.a).e.getValue() != i)
    {
      h.c(this.a).a(new IOException("CRC mismatch"));
      return;
    }
    h.c(this.a).e.reset();
    h.c(this.a).d = false;
    h.c(this.a).a(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */