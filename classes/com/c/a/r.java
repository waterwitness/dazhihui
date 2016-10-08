package com.c.a;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r
{
  private com.c.a.b.s a = com.c.a.b.s.a;
  private af b = af.a;
  private j c = d.a;
  private final Map<Type, s<?>> d = new HashMap();
  private final List<am> e = new ArrayList();
  private final List<am> f = new ArrayList();
  private boolean g;
  private String h;
  private int i = 2;
  private int j = 2;
  private boolean k;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private boolean o;
  
  private void a(String paramString, int paramInt1, int paramInt2, List<am> paramList)
  {
    if ((paramString != null) && (!"".equals(paramString.trim()))) {}
    for (paramString = new a(paramString);; paramString = new a(paramInt1, paramInt2))
    {
      paramList.add(ai.a(com.c.a.c.a.get(java.util.Date.class), paramString));
      paramList.add(ai.a(com.c.a.c.a.get(Timestamp.class), paramString));
      paramList.add(ai.a(com.c.a.c.a.get(java.sql.Date.class), paramString));
      do
      {
        return;
      } while ((paramInt1 == 2) || (paramInt2 == 2));
    }
  }
  
  public r a()
  {
    this.k = true;
    return this;
  }
  
  public k b()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Collections.reverse(localArrayList);
    localArrayList.addAll(this.f);
    a(this.h, this.i, this.j, localArrayList);
    return new k(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, localArrayList);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */