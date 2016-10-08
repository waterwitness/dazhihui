package com.baidu.location;

public class c
{
  private String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  
  public a a()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.a != null) {
      localStringBuffer.append(this.a);
    }
    if (this.c != null) {
      localStringBuffer.append(this.c);
    }
    if ((this.c != null) && (this.d != null) && ((!this.c.contains("北京")) || (!this.d.contains("北京"))) && ((!this.c.contains("上海")) || (!this.d.contains("上海"))) && ((!this.c.contains("天津")) || (!this.d.contains("天津"))) && ((!this.c.contains("重庆")) || (!this.d.contains("重庆")))) {
      localStringBuffer.append(this.d);
    }
    if (this.f != null) {
      localStringBuffer.append(this.f);
    }
    if (this.g != null) {
      localStringBuffer.append(this.g);
    }
    if (this.h != null) {
      localStringBuffer.append(this.h);
    }
    if (localStringBuffer.length() > 0) {
      this.i = localStringBuffer.toString();
    }
    return new a(this, null);
  }
  
  public c a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public c b(String paramString)
  {
    this.b = paramString;
    return this;
  }
  
  public c c(String paramString)
  {
    this.c = paramString;
    return this;
  }
  
  public c d(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public c e(String paramString)
  {
    this.e = paramString;
    return this;
  }
  
  public c f(String paramString)
  {
    this.f = paramString;
    return this;
  }
  
  public c g(String paramString)
  {
    this.g = paramString;
    return this;
  }
  
  public c h(String paramString)
  {
    this.h = paramString;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */