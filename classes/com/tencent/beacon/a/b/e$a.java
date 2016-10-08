package com.tencent.beacon.a.b;

import com.tencent.beacon.c.e.e;
import com.tencent.beacon.e.b;
import java.util.Map;
import java.util.Set;

public final class e$a
{
  private final int a;
  private boolean b = false;
  private String c = "http://eventlog.beacon.qq.com/analytics/upload";
  private String d = "http://jrlt.beacon.qq.com/analytics/upload";
  private Map<String, String> e = null;
  private Set<String> f = null;
  private e g = null;
  private Set<String> h = null;
  
  public e$a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void a(e parame)
  {
    this.g = parame;
  }
  
  public final void a(String paramString)
  {
    this.c = paramString;
  }
  
  public final void a(Map<String, String> paramMap)
  {
    this.e = paramMap;
  }
  
  public final void a(Set<String> paramSet)
  {
    this.f = paramSet;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final String b()
  {
    if (b.b) {
      return this.d;
    }
    return this.c;
  }
  
  public final void b(Set<String> paramSet)
  {
    this.h = paramSet;
  }
  
  public final Map<String, String> c()
  {
    return this.e;
  }
  
  public final Set<String> d()
  {
    return this.f;
  }
  
  public final e e()
  {
    return this.g;
  }
  
  public final int f()
  {
    return this.a;
  }
  
  public final Set<String> g()
  {
    return this.h;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\b\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */