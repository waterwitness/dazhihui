package com.d.a.c.c;

import com.d.a.ay;
import com.d.a.bi;
import java.nio.ByteOrder;
import java.util.zip.CRC32;

class i
  implements bi<byte[]>
{
  i(h paramh, ay paramay) {}
  
  public void a(byte[] paramArrayOfByte)
  {
    if (this.a.b) {
      h.c(this.a).e.update(paramArrayOfByte, 0, 2);
    }
    int i = g.a(paramArrayOfByte, 0, ByteOrder.LITTLE_ENDIAN);
    this.b.a(i & 0xFFFF, new j(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */