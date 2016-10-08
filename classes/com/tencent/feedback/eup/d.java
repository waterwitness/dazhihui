package com.tencent.feedback.eup;

import android.content.Context;
import com.tencent.feedback.common.e;
import com.tencent.feedback.proguard.U;
import com.tencent.feedback.proguard.a;
import com.tencent.feedback.proguard.h;

public final class d
  implements com.tencent.feedback.upload.d
{
  private Context a;
  
  public d(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if ((paramInt == 302) && (paramArrayOfByte != null)) {}
    for (;;)
    {
      U localU;
      try
      {
        f localf = f.k();
        if (localf == null)
        {
          e.c("rqdp{  imposiable handle response ,but no eup instance!}", new Object[0]);
          return;
        }
        localU = new U();
        localU.a(new h(paramArrayOfByte));
        localCrashStrategyBean = localf.p();
        if (localCrashStrategyBean != null) {
          break label381;
        }
        localCrashStrategyBean = localf.o();
        if (localCrashStrategyBean != null) {
          break label169;
        }
        e.f("rqdp{  init eup sStrategy by default}", new Object[0]);
        localCrashStrategyBean = new CrashStrategyBean();
        localf.a(localCrashStrategyBean);
      }
      catch (Throwable paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        e.d("rqdp{  process crash strategy error} %s", new Object[] { paramArrayOfByte.toString() });
        return;
      }
      if ((i != 0) && (paramBoolean))
      {
        e.f("rqdp{  save eup strategy}", new Object[0]);
        a.a(this.a, paramInt, paramArrayOfByte);
      }
      e.h("rqdp{  crashStrategy}[%s]", new Object[] { localU });
      return;
      label169:
      e.f("rqdp{  init eup sStrategy by uStrategy}", new Object[0]);
      CrashStrategyBean localCrashStrategyBean = localCrashStrategyBean.clone();
      continue;
      label381:
      do
      {
        if (localCrashStrategyBean.isMerged() != localU.a)
        {
          e.h("rqdp{  is merged changed} %b", new Object[] { Boolean.valueOf(localU.a) });
          localCrashStrategyBean.setMerged(localU.a);
        }
        for (i = 1;; i = 0)
        {
          if (localCrashStrategyBean.isAssertOn() != localU.b)
          {
            localCrashStrategyBean.setAssertEnable(localU.b);
            e.h("rqdp{ Assert enable changed: } %s", new Object[] { Boolean.valueOf(localU.b) });
            i = 1;
          }
          if (localCrashStrategyBean.getAssertTaskInterval() != localU.c)
          {
            localCrashStrategyBean.setAssertTaskInterval(localU.c);
            e.h("rqdp{ Assert task interval changed: } %s", new Object[] { Integer.valueOf(localU.c) });
            i = 1;
          }
          if (localCrashStrategyBean.getAssertLimitCount() == localU.d) {
            break;
          }
          localCrashStrategyBean.setAssertLimitCount(localU.d);
          e.h("rqdp{ Assert limit count changed: } %s", new Object[] { Integer.valueOf(localU.d) });
          i = 1;
          break;
        }
        continue;
        return;
      } while ((localU != null) && (localCrashStrategyBean != null));
      int i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */