package com.d.a.c.c;

import com.d.a.ai;
import com.d.a.al;
import com.d.a.ay;
import java.nio.ByteOrder;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public class g
  extends m
{
  boolean d = true;
  protected CRC32 e = new CRC32();
  
  public g()
  {
    super(new Inflater(true));
  }
  
  static short a(byte[] paramArrayOfByte, int paramInt, ByteOrder paramByteOrder)
  {
    if (paramByteOrder == ByteOrder.BIG_ENDIAN) {
      return (short)(paramArrayOfByte[paramInt] << 8 | paramArrayOfByte[(paramInt + 1)] & 0xFF);
    }
    return (short)(paramArrayOfByte[(paramInt + 1)] << 8 | paramArrayOfByte[paramInt] & 0xFF);
  }
  
  public void a(al paramal, ai paramai)
  {
    if (this.d)
    {
      paramai = new ay(paramal);
      paramai.a(10, new h(this, paramal, paramai));
      return;
    }
    super.a(paramal, paramai);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */