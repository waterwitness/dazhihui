package com.tencent.beacon.event;

import android.content.Context;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public final class h
  implements Runnable
{
  private Context a;
  private int b;
  private int c = -1;
  private Map<String, String> d = new HashMap(2);
  private int e = 0;
  
  public h(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.e = Calendar.getInstance().get(5);
    this.d.put("A63", "N");
    this.d.put("A66", "F");
  }
  
  public final void run()
  {
    boolean bool;
    if (this.b > 0)
    {
      bool = com.tencent.beacon.a.b.g(this.a);
      int i = Calendar.getInstance().get(5);
      if (i != this.e)
      {
        this.e = i;
        new i(this.a, bool).a(true);
      }
      if (this.c == -1) {
        break label157;
      }
      if ((this.c != 0) || (!bool)) {
        break label138;
      }
      localMap = this.d;
      if (!com.tencent.beacon.a.b.b) {
        break label132;
      }
      str = "Y";
      localMap.put("A85", str);
      p.a("rqd_applaunched", true, 0L, 0L, this.d, true);
      com.tencent.beacon.e.b.a(" create a applaunched event", new Object[0]);
      this.c = 1;
      p.c(true);
    }
    label132:
    label138:
    while ((bool) || (this.c != 1)) {
      for (;;)
      {
        return;
        str = "N";
      }
    }
    label157:
    while (!bool)
    {
      Map localMap;
      String str;
      this.c = 0;
      return;
    }
    this.c = 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */