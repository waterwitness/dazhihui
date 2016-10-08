package org.a.a.k;

public class j
{
  private String a;
  private int b;
  private char c;
  private StringBuffer d = new StringBuffer();
  
  public j(String paramString)
  {
    this(paramString, ',');
  }
  
  public j(String paramString, char paramChar)
  {
    this.a = paramString;
    this.b = -1;
    this.c = paramChar;
  }
  
  public boolean a()
  {
    return this.b != this.a.length();
  }
  
  public String b()
  {
    if (this.b == this.a.length()) {
      return null;
    }
    int i = this.b;
    this.d.setLength(0);
    int j = 0;
    int k = i + 1;
    i = 0;
    char c1;
    if (k != this.a.length())
    {
      c1 = this.a.charAt(k);
      if (c1 == '"') {
        if (i == 0) {
          if (j == 0)
          {
            i = 1;
            label76:
            int m = 0;
            j = i;
            i = m;
          }
        }
      }
    }
    for (;;)
    {
      k += 1;
      break;
      i = 0;
      break label76;
      this.d.append(c1);
      i = j;
      break label76;
      if ((i != 0) || (j != 0))
      {
        if ((c1 == '#') && (this.d.charAt(this.d.length() - 1) == '=')) {
          this.d.append('\\');
        }
        for (;;)
        {
          this.d.append(c1);
          i = 0;
          break;
          if ((c1 == '+') && (this.c != '+')) {
            this.d.append('\\');
          }
        }
      }
      if (c1 == '\\')
      {
        i = 1;
      }
      else
      {
        if (c1 == this.c)
        {
          this.b = k;
          return this.d.toString().trim();
        }
        this.d.append(c1);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */