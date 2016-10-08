package com.c.b;

import java.util.EnumMap;
import java.util.Map;

public final class l
{
  private final String a;
  private final byte[] b;
  private n[] c;
  private final a d;
  private Map<m, Object> e;
  private final long f;
  
  public l(String paramString, byte[] paramArrayOfByte, n[] paramArrayOfn, a parama)
  {
    this(paramString, paramArrayOfByte, paramArrayOfn, parama, System.currentTimeMillis());
  }
  
  public l(String paramString, byte[] paramArrayOfByte, n[] paramArrayOfn, a parama, long paramLong)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
    this.c = paramArrayOfn;
    this.d = parama;
    this.e = null;
    this.f = paramLong;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(m paramm, Object paramObject)
  {
    if (this.e == null) {
      this.e = new EnumMap(m.class);
    }
    this.e.put(paramm, paramObject);
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */