package com.baidu.location.c;

import com.baidu.location.BDLocation;
import java.util.LinkedHashMap;

class b
  extends Thread
{
  private String b;
  private Long c;
  private BDLocation d;
  private BDLocation e;
  private BDLocation f;
  private String g;
  private LinkedHashMap h;
  
  private b(a parama, String paramString1, Long paramLong, BDLocation paramBDLocation1, BDLocation paramBDLocation2, BDLocation paramBDLocation3, String paramString2, LinkedHashMap paramLinkedHashMap)
  {
    this.b = paramString1;
    this.c = paramLong;
    this.d = paramBDLocation1;
    this.e = paramBDLocation2;
    this.f = paramBDLocation3;
    this.g = paramString2;
    this.h = paramLinkedHashMap;
  }
  
  public void run()
  {
    a.a(this.a, this.b, this.c, this.d);
    a.a(this.a, null);
    a.b(this.a, null);
    a.a(this.a, this.h);
    a.a(this.a, this.f, this.d, this.e, this.b, this.c);
    if (this.g != null) {
      a.a(this.a).j().a(this.g);
    }
    this.h = null;
    this.b = null;
    this.g = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */