package com.g.a.b.d;

import java.util.Locale;

public enum d
{
  private String h;
  private String i;
  
  private d(String paramString)
  {
    this.h = paramString;
    this.i = (paramString + "://");
  }
  
  public static d a(String paramString)
  {
    if (paramString != null)
    {
      d[] arrayOfd = values();
      int m = arrayOfd.length;
      int k = 0;
      while (k < m)
      {
        d locald = arrayOfd[k];
        if (locald.d(paramString)) {
          return locald;
        }
        k += 1;
      }
    }
    return g;
  }
  
  private boolean d(String paramString)
  {
    return paramString.toLowerCase(Locale.US).startsWith(this.i);
  }
  
  public String b(String paramString)
  {
    return this.i + paramString;
  }
  
  public String c(String paramString)
  {
    if (!d(paramString)) {
      throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] { paramString, this.h }));
    }
    return paramString.substring(this.i.length());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */