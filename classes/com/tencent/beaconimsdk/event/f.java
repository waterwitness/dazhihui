package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.b;
import com.tencent.beaconimsdk.a.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f
{
  private h a;
  private Context b;
  private int c = 20000;
  private int d = 0;
  private Runnable e = new f.1(this);
  
  public f(Context paramContext)
  {
    this.b = paramContext;
    HashMap localHashMap = new HashMap(2);
    boolean bool = com.tencent.beaconimsdk.a.a.g(this.b);
    e.a(paramContext);
    localHashMap.put("A33", e.g(paramContext));
    if (bool)
    {
      localHashMap.put("A66", "F");
      localHashMap.put("A68", com.tencent.beaconimsdk.a.a.h(this.b));
      if (!com.tencent.beaconimsdk.a.a.b) {
        break label160;
      }
    }
    label160:
    for (paramContext = "Y";; paramContext = "N")
    {
      localHashMap.put("A85", paramContext);
      this.a = a.a(this.b, "rqd_heartbeat", localHashMap);
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
  
  private int c()
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
    if (!e.m(this.b)) {}
    do
    {
      return;
      com.tencent.beaconimsdk.upload.f localf = j.d().f();
      if (localf != null)
      {
        ArrayList localArrayList = new ArrayList(2);
        localArrayList.add(this.a);
        localf.a(new i.a(this.b, localArrayList));
      }
      a(c() + 1);
    } while (c() % 10 != 0);
    b.a().a(108, this.e, 600000L, this.c);
    a(0);
  }
  
  public final void b()
  {
    String str = com.tencent.beaconimsdk.a.a.b(this.b, "HEART_DENGTA", "");
    if (e.e().equals(str))
    {
      com.tencent.beaconimsdk.c.a.a("heartbeat has been uploaded today!", new Object[0]);
      return;
    }
    b.a().a(108, this.e, 0L, this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */