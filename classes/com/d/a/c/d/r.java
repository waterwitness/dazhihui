package com.d.a.c.d;

import com.d.a.ag;
import com.d.a.al;
import java.io.IOException;
import java.util.logging.Logger;

final class r
  implements au
{
  private static final Logger a = Logger.getLogger(r.class.getName());
  private static final f b = f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
  
  private static short b(short paramShort1, byte paramByte, short paramShort2)
  {
    short s = paramShort1;
    if ((paramByte & 0x8) != 0) {
      s = (short)(paramShort1 - 1);
    }
    if (paramShort2 > s) {
      throw d("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] { Short.valueOf(paramShort2), Short.valueOf(s) });
    }
    return (short)(s - paramShort2);
  }
  
  private static IllegalArgumentException c(String paramString, Object... paramVarArgs)
  {
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  private static IOException d(String paramString, Object... paramVarArgs)
  {
    throw new IOException(String.format(paramString, paramVarArgs));
  }
  
  public h a(al paramal, i parami, boolean paramBoolean)
  {
    return new t(paramal, parami, 4096, paramBoolean);
  }
  
  public j a(ag paramag, boolean paramBoolean)
  {
    return new w(paramag, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */