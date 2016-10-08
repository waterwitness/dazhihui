package org.a.a;

public class cb
{
  private String a;
  private int b;
  
  public cb(String paramString)
  {
    this.a = paramString;
    this.b = 0;
  }
  
  public boolean a()
  {
    return this.b != -1;
  }
  
  public String b()
  {
    if (this.b == -1) {
      return null;
    }
    int i = this.a.indexOf('.', this.b);
    if (i == -1)
    {
      str = this.a.substring(this.b);
      this.b = -1;
      return str;
    }
    String str = this.a.substring(this.b, i);
    this.b = (i + 1);
    return str;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */