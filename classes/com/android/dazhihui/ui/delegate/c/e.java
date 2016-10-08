package com.android.dazhihui.ui.delegate.c;

public class e
  implements Comparable<e>
{
  private String a;
  private String b;
  private String[] c;
  private String d;
  private String e = null;
  
  public e() {}
  
  public e(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    String[] arrayOfString = paramArrayOfString;
    int i;
    if (paramString2 != null)
    {
      arrayOfString = paramArrayOfString;
      if (!paramString2.equals(""))
      {
        arrayOfString = paramArrayOfString;
        if (paramArrayOfString != null)
        {
          arrayOfString = paramArrayOfString;
          if (paramArrayOfString.length > 0)
          {
            i = 0;
            if (i >= paramArrayOfString.length) {
              break label157;
            }
            if (!((String)paramArrayOfString[i].subSequence(0, 1)).toUpperCase().equals(paramString2.toUpperCase())) {
              break label142;
            }
          }
        }
      }
    }
    label142:
    label157:
    for (String str = paramArrayOfString[i].toUpperCase();; str = null)
    {
      arrayOfString = paramArrayOfString;
      if (str != null)
      {
        arrayOfString = paramArrayOfString;
        if (str.length() > 0)
        {
          arrayOfString = new String[1];
          arrayOfString[0] = str;
        }
      }
      this.b = paramString1;
      this.c = arrayOfString;
      if (paramString2 != null)
      {
        this.e = paramString2.toUpperCase();
        return;
        i += 1;
        break;
      }
      this.e = null;
      return;
    }
  }
  
  public int a(e parame)
  {
    return b().compareTo(parame.b());
  }
  
  public String a()
  {
    return this.b;
  }
  
  public boolean a(String paramString)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.c.length)
      {
        if (this.c[i].startsWith(paramString))
        {
          this.d = this.c[i];
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public String b()
  {
    int k = 0;
    int j;
    int i;
    if (this.d == null)
    {
      j = k;
      if (this.e != null) {
        i = 0;
      }
    }
    for (;;)
    {
      j = k;
      if (i < this.c.length)
      {
        if (this.e.equals(this.c[i].subSequence(0, 1))) {
          j = i;
        }
      }
      else
      {
        this.d = this.c[j];
        return this.d;
      }
      i += 1;
    }
  }
  
  public String c()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    paramObject = (e)paramObject;
    return this.a.equals(((e)paramObject).c());
  }
  
  public String toString()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */