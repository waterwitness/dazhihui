package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.e;
import com.tencent.beacon.b.a;
import com.tencent.beacon.e.c;
import com.tencent.beacon.upload.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i
{
  private k a;
  private Context b;
  private int c = 20000;
  private int d = 0;
  private Runnable e = new i.1(this);
  
  public i(Context paramContext)
  {
    this.b = paramContext;
    HashMap localHashMap = new HashMap(2);
    if (com.tencent.beacon.a.b.g(this.b))
    {
      localHashMap.put("A66", "F");
      localHashMap.put("A68", com.tencent.beacon.a.b.h(this.b));
      if (!com.tencent.beacon.a.b.b) {
        break label143;
      }
    }
    label143:
    for (paramContext = "Y";; paramContext = "N")
    {
      localHashMap.put("A85", paramContext);
      this.a = b.a(this.b, "rqd_heartbeat", true, 0L, 0L, localHashMap);
      return;
      localHashMap.put("A66", "B");
      break;
    }
  }
  
  public i(Context paramContext, boolean paramBoolean)
  {
    this.b = paramContext;
    HashMap localHashMap = new HashMap(2);
    if (paramBoolean)
    {
      localHashMap.put("A66", "F");
      localHashMap.put("A68", com.tencent.beacon.a.b.h(this.b));
      if (!com.tencent.beacon.a.b.b) {
        break label137;
      }
    }
    label137:
    for (paramContext = "Y";; paramContext = "N")
    {
      localHashMap.put("A85", paramContext);
      this.a = b.a(this.b, "rqd_heartbeat", true, 0L, 0L, localHashMap);
      return;
      localHashMap.put("A66", "B");
      break;
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.d = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private int b()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void a()
  {
    if (!c.b(this.b)) {}
    do
    {
      return;
      h localh = p.d().h();
      if (localh != null)
      {
        ArrayList localArrayList = new ArrayList(2);
        localArrayList.add(this.a);
        localh.a(new l.a(this.b, localArrayList));
      }
      a(b() + 1);
    } while (b() % 10 != 0);
    e.a().a(108, this.e, 600000L, this.c);
    a(0);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i = 0;
    String str = com.tencent.beacon.a.b.b(this.b, "HEART_DENGTA", "");
    if (a.t().equals(str))
    {
      com.tencent.beacon.e.b.a("heartbeat has been uploaded today!", new Object[0]);
      return;
    }
    if (paramBoolean) {
      i = (int)(Math.random() * 60.0D) * 1000;
    }
    e.a().a(108, this.e, i, this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */