package com.d.a.c;

import java.util.Hashtable;

public enum bn
{
  private static final Hashtable<String, bn> f;
  private final String e;
  
  static
  {
    f = new Hashtable();
    f.put(a.toString(), a);
    f.put(b.toString(), b);
    f.put(c.toString(), c);
    f.put(d.toString(), d);
  }
  
  private bn(String paramString1)
  {
    this.e = paramString1;
  }
  
  public static bn a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return (bn)f.get(paramString.toLowerCase());
  }
  
  public boolean a()
  {
    return false;
  }
  
  public String toString()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */