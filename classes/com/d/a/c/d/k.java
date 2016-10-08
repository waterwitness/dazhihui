package com.d.a.c.d;

final class k
{
  public static final f a = f.a(":status");
  public static final f b = f.a(":method");
  public static final f c = f.a(":path");
  public static final f d = f.a(":scheme");
  public static final f e = f.a(":authority");
  public static final f f = f.a(":host");
  public static final f g = f.a(":version");
  public final f h;
  public final f i;
  final int j;
  
  public k(f paramf1, f paramf2)
  {
    this.h = paramf1;
    this.i = paramf2;
    this.j = (paramf1.d() + 32 + paramf2.d());
  }
  
  public k(f paramf, String paramString)
  {
    this(paramf, f.a(paramString));
  }
  
  public k(String paramString1, String paramString2)
  {
    this(f.a(paramString1), f.a(paramString2));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      bool1 = bool2;
      if (this.h.equals(((k)paramObject).h))
      {
        bool1 = bool2;
        if (this.i.equals(((k)paramObject).i)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return (this.h.hashCode() + 527) * 31 + this.i.hashCode();
  }
  
  public String toString()
  {
    return String.format("%s: %s", new Object[] { this.h.a(), this.i.a() });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */