package com.android.dazhihui.ui.widget.b;

import java.util.Enumeration;
import java.util.Hashtable;

public class c
{
  private String a;
  private String b = "";
  private Hashtable c = null;
  private int d = 0;
  
  public c() {}
  
  public c(String paramString)
  {
    this();
    this.a = paramString;
    if ((paramString.charAt(0) != '<') || (paramString.charAt(paramString.length() - 1) != '>'))
    {
      this.b = paramString;
      return;
    }
    paramString = paramString.substring(1, paramString.length() - 1);
    if (paramString.charAt(0) == '/')
    {
      paramString = paramString.substring(1).trim();
      this.d = 2;
    }
    for (;;)
    {
      int i = paramString.indexOf(' ');
      String str = paramString;
      if (i > -1)
      {
        a(paramString.substring(i + 1).trim());
        str = paramString.substring(0, i).trim().toLowerCase();
      }
      this.b = str;
      return;
      if (paramString.charAt(paramString.length() - 1) == '/')
      {
        paramString = paramString.substring(0, paramString.length() - 1).trim();
        this.d = 3;
      }
      else
      {
        paramString = paramString.trim();
        this.d = 1;
      }
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    this.c = new Hashtable();
    int i = paramString.indexOf('=');
    if (i > -1)
    {
      String str2 = paramString.substring(0, i).trim();
      String str1 = paramString.substring(i + 1).trim();
      if (str1.charAt(0) == '"') {
        i = str1.indexOf('"', 1);
      }
      for (paramString = str1.substring(1, i);; paramString = str1.substring(0, i))
      {
        str1 = str1.substring(i + 1).trim();
        this.c.put(str2, paramString);
        paramString = str1;
        break;
        int j = str1.indexOf(' ');
        i = j;
        if (j == -1) {
          i = str1.length() - 1;
        }
      }
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public String b(String paramString)
  {
    if (this.c == null) {
      return null;
    }
    paramString = this.c.get(paramString);
    if (paramString == null) {}
    for (paramString = null;; paramString = (String)paramString) {
      return paramString;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("Tag name=``" + this.b + "'' state = " + this.d);
    if (this.c != null)
    {
      Enumeration localEnumeration = this.c.keys();
      while (localEnumeration.hasMoreElements())
      {
        String str = (String)localEnumeration.nextElement();
        localStringBuffer.append("\n\t" + str + "=``" + this.c.get(str) + "''");
      }
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */