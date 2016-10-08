package com.tencent.a.a.a.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class g
{
  private static g i = null;
  private Map<Integer, f> f = null;
  private int g = 0;
  private Context h = null;
  
  private g(Context paramContext)
  {
    this.h = paramContext.getApplicationContext();
    this.f = new HashMap(3);
    this.f.put(Integer.valueOf(1), new e(paramContext));
    this.f.put(Integer.valueOf(2), new b(paramContext));
    this.f.put(Integer.valueOf(4), new d(paramContext));
  }
  
  private c a(List<Integer> paramList)
  {
    if ((paramList != null) && (paramList.size() >= 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject = (Integer)paramList.next();
        localObject = (f)this.f.get(localObject);
        if (localObject != null)
        {
          localObject = ((f)localObject).e();
          if ((localObject != null) && (h.e(((c)localObject).c))) {
            return (c)localObject;
          }
        }
      }
    }
    return new c();
  }
  
  public static g a(Context paramContext)
  {
    try
    {
      if (i == null) {
        i = new g(paramContext);
      }
      paramContext = i;
      return paramContext;
    }
    finally {}
  }
  
  public final void b(String paramString)
  {
    c localc = f();
    localc.c = paramString;
    if (!h.d(localc.a)) {
      localc.a = h.b(this.h);
    }
    if (!h.d(localc.b)) {
      localc.b = h.c(this.h);
    }
    localc.d = System.currentTimeMillis();
    paramString = this.f.entrySet().iterator();
    while (paramString.hasNext()) {
      ((f)((Map.Entry)paramString.next()).getValue()).a(localc);
    }
  }
  
  public final c f()
  {
    return a(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4) })));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\a\a\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */