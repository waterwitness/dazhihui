package com.tencent.beaconimsdk.a.b;

import com.tencent.beaconimsdk.c.a;
import java.util.Map;
import java.util.Set;

public final class d$a
{
  private final int a;
  private boolean b = false;
  private String c = "http://oth.eve.mdt.qq.com:8080/analytics/upload";
  private String d = "http://jrlt.beacon.qq.com/analytics/upload";
  private Map<String, String> e = null;
  private Set<String> f = null;
  private Set<String> g = null;
  
  public d$a(int paramInt)
  {
    this.a = paramInt;
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
    if (a.b) {
      return this.d;
    }
    return this.c;
  }
  
  public final void b(Set<String> paramSet)
  {
    this.g = paramSet;
  }
  
  public final Map<String, String> c()
  {
    return this.e;
  }
  
  public final Set<String> d()
  {
    return this.f;
  }
  
  public final int e()
  {
    return this.a;
  }
  
  public final Set<String> f()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\b\d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */