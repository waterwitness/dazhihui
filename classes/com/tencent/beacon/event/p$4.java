package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.f;
import com.tencent.beacon.a.h;
import com.tencent.beacon.b.a;
import com.tencent.beacon.e.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class p$4
  implements Runnable
{
  p$4(p paramp) {}
  
  public final void run()
  {
    if (f.m() == null)
    {
      b.c(" model even common info == null?,return", new Object[0]);
      return;
    }
    Object localObject1 = n.a(this.a.a);
    if (localObject1 == null)
    {
      b.c(" UADeviceInfo == null?,return", new Object[0]);
      return;
    }
    Object localObject2 = h.a(this.a.a);
    HashMap localHashMap = new HashMap();
    localHashMap.put("A9", ((n)localObject1).k());
    localHashMap.put("A10", ((n)localObject1).b());
    localHashMap.put("A11", ((n)localObject1).h());
    localHashMap.put("A12", ((n)localObject1).i());
    localHashMap.put("A13", ((n)localObject1).j());
    localHashMap.put("A14", ((n)localObject1).f());
    localHashMap.put("A15", ((n)localObject1).g());
    localHashMap.put("A16", ((n)localObject1).d());
    localHashMap.put("A17", ((n)localObject1).c());
    localHashMap.put("A18", ((n)localObject1).e());
    localHashMap.put("A20", h.f(this.a.a));
    localHashMap.put("A22", n.b(this.a.a));
    localHashMap.put("A30", ((h)localObject2).j() + "m");
    localHashMap.put("A33", h.l(this.a.a));
    localHashMap.put("A52", ((n)localObject1).l());
    localHashMap.put("A53", ((n)localObject1).m());
    localHashMap.put("A54", ((n)localObject1).n());
    localHashMap.put("A55", ((n)localObject1).o());
    localHashMap.put("A56", ((n)localObject1).p());
    localHashMap.put("A57", ((n)localObject1).q());
    localHashMap.put("A58", ((n)localObject1).r());
    localObject2 = new StringBuilder();
    Context localContext = this.a.a;
    localObject1 = "0";
    long l = h.i(localContext);
    if (l > 0L) {
      localObject1 = l / 1024L / 1024L;
    }
    localHashMap.put("A59", (String)localObject1 + "m");
    localHashMap.put("A69", h.g(this.a.a));
    localObject1 = a.a(new String[] { "/system/bin/sh", "-c", "getprop ro.build.fingerprint" });
    if ((localObject1 != null) && (((List)localObject1).size() > 0)) {}
    for (localObject1 = (String)((List)localObject1).get(0);; localObject1 = "")
    {
      localHashMap.put("A82", localObject1);
      p.a("rqd_model", true, 0L, 0L, localHashMap, true);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\p$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */