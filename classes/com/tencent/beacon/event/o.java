package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.a.a;
import com.tencent.beacon.a.a.f;
import com.tencent.beacon.a.h;
import com.tencent.beacon.e.b;
import java.util.HashMap;
import java.util.Map;

public final class o
  implements Runnable
{
  private Context a;
  
  public o(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void run()
  {
    f localf = h.r(this.a);
    Object localObject;
    if (localf != null)
    {
      localObject = new HashMap();
      ((HashMap)localObject).put("A43", localf.c());
      ((HashMap)localObject).put("A44", localf.d());
      ((HashMap)localObject).put("A41", localf.a());
      ((HashMap)localObject).put("A42", localf.b());
      p.a("rqd_useInfoEvent", true, 0L, 0L, (Map)localObject, true);
      localObject = this.a;
      if (localObject != null) {
        break label171;
      }
    }
    for (;;)
    {
      b.e("%s %d %d", new Object[] { "rqd_useInfoEvent", Long.valueOf(localf.a()), Long.valueOf(localf.b()) });
      return;
      label171:
      a.a((Context)localObject, new int[] { 8 }, -1L, Long.MAX_VALUE);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */