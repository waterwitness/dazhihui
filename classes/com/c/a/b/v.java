package com.c.a.b;

import java.math.BigDecimal;

public final class v
  extends Number
{
  private final String a;
  
  public v(String paramString)
  {
    this.a = paramString;
  }
  
  public double doubleValue()
  {
    return Double.parseDouble(this.a);
  }
  
  public float floatValue()
  {
    return Float.parseFloat(this.a);
  }
  
  public int intValue()
  {
    try
    {
      int i = Integer.parseInt(this.a);
      return i;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        long l = Long.parseLong(this.a);
        return (int)l;
      }
      catch (NumberFormatException localNumberFormatException2) {}
    }
    return new BigDecimal(this.a).intValue();
  }
  
  public long longValue()
  {
    try
    {
      long l = Long.parseLong(this.a);
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return new BigDecimal(this.a).longValue();
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */