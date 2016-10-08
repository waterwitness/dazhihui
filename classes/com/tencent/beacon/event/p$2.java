package com.tencent.beacon.event;

import com.tencent.beacon.b.a;
import com.tencent.beacon.b.a.b;
import com.tencent.beacon.e.b;
import java.util.HashMap;
import java.util.Map;

final class p$2
  implements Runnable
{
  p$2(p paramp, String[] paramArrayOfString) {}
  
  public final void run()
  {
    int i;
    String str;
    a.b localb;
    if (this.a != null)
    {
      b.b(" start domain test:", new Object[0]);
      String[] arrayOfString = this.a;
      int j = arrayOfString.length;
      i = 0;
      if (i < j)
      {
        str = arrayOfString[i];
        b.b(" dns:" + str, new Object[0]);
        localb = a.a(str, false);
        if (localb != null) {
          break label74;
        }
      }
    }
    return;
    label74:
    long l = localb.a + localb.b + localb.c + localb.d + localb.e;
    b.b(" elapse:" + l, new Object[0]);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("A34", str);
    localHashMap.put("A35", String.valueOf(localb.a));
    localHashMap.put("A36", String.valueOf(localb.c));
    localHashMap.put("A37", String.valueOf(localb.d));
    localHashMap.put("A38", String.valueOf(localb.e));
    localHashMap.put("A40", String.valueOf(localb.b));
    if (l > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      p.a("rqd_domainSpeed", bool, l, 0L, localHashMap, true);
      i += 1;
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\p$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */