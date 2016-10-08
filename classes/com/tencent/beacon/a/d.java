package com.tencent.beacon.a;

import android.content.Context;
import com.tencent.beacon.event.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public final class d
  implements Runnable
{
  private Context a;
  private int b;
  private int c;
  private Runnable d;
  private boolean e;
  private boolean f;
  private boolean g;
  private int h = 0;
  
  public d(Context paramContext, int paramInt1, int paramInt2, Runnable paramRunnable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramContext;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramRunnable;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.g = paramBoolean3;
  }
  
  public final void run()
  {
    boolean bool = b.g(this.a);
    Object localObject1;
    long l1;
    if (bool)
    {
      localObject3 = "F";
      localObject1 = h.a(this.a);
      if ((this.b > 0) && (this.f)) {
        l1 = 0L;
      }
    }
    try
    {
      long l2 = (f.m().h() + new Date().getTime()) / 1000L;
      l1 = l2;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject4;
        continue;
        localObject3 = localException2;
        continue;
        localObject3 = null;
        continue;
        continue;
        Object localObject2 = null;
      }
    }
    if (this.f)
    {
      localObject1 = ((h)localObject1).g();
      if ((localObject1 != null) && (!((String)localObject1).equals("")))
      {
        localObject1 = (String)localObject3 + "," + (String)localObject1 + "," + l1;
        if (this.g)
        {
          localObject4 = h.h();
          if ((localObject4 != null) && (!((String)localObject4).equals("")))
          {
            localObject3 = (String)localObject3 + "," + (String)localObject4 + "," + l1;
            for (;;)
            {
              try
              {
                localObject4 = b.b(this.a, "app_mem_info", "");
                localObject5 = b.b(this.a, "app_cpu_info", "");
                if (((this.h != 0) || ("".equals(localObject4))) && (this.h < this.c / this.b)) {
                  continue;
                }
                HashMap localHashMap = new HashMap();
                localHashMap.put("A78", (String)localObject4 + ";" + (String)localObject1);
                if (localObject3 != null) {
                  localHashMap.put("A77", (String)localObject5 + ";" + (String)localObject3);
                }
                if (!p.a("rqd_res_occ", true, 0L, 0L, localHashMap, true)) {
                  continue;
                }
                b.a(this.a, "app_mem_info", "");
                if (localObject3 != null) {
                  b.a(this.a, "app_cpu_info", "");
                }
                this.h = 0;
              }
              catch (Exception localException1)
              {
                com.tencent.beacon.e.b.c("get resinfo from sp failed! ", new Object[0]);
                continue;
                if (!"".equals(localObject4)) {
                  continue;
                }
                b.a(this.a, "app_mem_info", localException1);
                if (localObject3 == null) {
                  continue;
                }
                if (!"".equals(localObject5)) {
                  continue;
                }
                b.a(this.a, "app_cpu_info", (String)localObject3);
                this.h += 1;
                continue;
                b.a(this.a, "app_mem_info", (String)localObject4 + ";" + localException1);
                continue;
                b.a(this.a, "app_cpu_info", (String)localObject5 + ";" + (String)localObject3);
                continue;
                localObject4 = new ArrayList();
                Object localObject5 = new com.tencent.beacon.a.a.a(8, 0, localException1.d(), com.tencent.beacon.b.a.a(localException1));
                ((com.tencent.beacon.a.a.a)localObject5).a(localException1.e());
                ((List)localObject4).add(localObject5);
                com.tencent.beacon.a.a.a.b((Context)localObject3, (List)localObject4);
                continue;
              }
              if ((this.b > 0) && (this.e))
              {
                l1 = new Date().getTime();
                localObject3 = h.r(this.a);
                localObject1 = localObject3;
                if (localObject3 == null)
                {
                  localObject1 = new com.tencent.beacon.a.a.f();
                  ((com.tencent.beacon.a.a.f)localObject1).c(l1);
                  ((com.tencent.beacon.a.a.f)localObject1).d(l1);
                  ((com.tencent.beacon.a.a.f)localObject1).b(0L);
                  ((com.tencent.beacon.a.a.f)localObject1).a(0L);
                }
                ((com.tencent.beacon.a.a.f)localObject1).a(((com.tencent.beacon.a.a.f)localObject1).a() + this.b / 60);
                if (bool) {
                  ((com.tencent.beacon.a.a.f)localObject1).b(((com.tencent.beacon.a.a.f)localObject1).b() + this.b / 60);
                }
                ((com.tencent.beacon.a.a.f)localObject1).d(l1);
                localObject3 = this.a;
                if ((localObject3 != null) && (localObject1 != null)) {
                  continue;
                }
                com.tencent.beacon.e.b.e(" used:%d  seen:%d  next:%d", new Object[] { Long.valueOf(((com.tencent.beacon.a.a.f)localObject1).a()), Long.valueOf(((com.tencent.beacon.a.a.f)localObject1).b()), Integer.valueOf(this.b) });
                if (((com.tencent.beacon.a.a.f)localObject1).a() >= this.c / 60) {
                  e.a().a(this.d);
                }
              }
              return;
              localObject3 = "B";
              break;
              b.a(this.a, "app_mem_info", (String)localObject4 + ";" + (String)localObject1);
              if (localObject3 != null) {
                b.a(this.a, "app_cpu_info", (String)localObject5 + ";" + (String)localObject3);
              }
              this.h += 1;
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */