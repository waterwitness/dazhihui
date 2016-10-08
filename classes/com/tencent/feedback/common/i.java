package com.tencent.feedback.common;

import android.content.Context;
import com.tencent.feedback.proguard.s;
import com.tencent.feedback.proguard.t;
import com.tencent.feedback.proguard.w;
import com.tencent.feedback.proguard.w.a;
import com.tencent.feedback.proguard.x;
import com.tencent.feedback.proguard.z;
import com.tencent.feedback.upload.UploadHandleListener;
import com.tencent.feedback.upload.d;

public class i
  implements s, x
{
  protected final Context a;
  private int b;
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  private com.tencent.feedback.upload.e g;
  private d h;
  private int i = 0;
  
  public i(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, com.tencent.feedback.upload.e parame, d paramd, UploadHandleListener paramUploadHandleListener)
  {
    if (paramContext == null) {}
    for (;;)
    {
      this.a = paramContext;
      paramContext = c.a(this.a);
      if ((paramString != null) && (paramString.trim().length() > 0)) {
        paramContext.a(paramString);
      }
      this.b = 3;
      this.c = 202;
      this.d = 302;
      this.g = parame;
      this.h = paramd;
      if (parame != null)
      {
        parame.a(302, paramd);
        parame.a(paramUploadHandleListener);
      }
      paramContext = t.a(this.a);
      paramContext.a(this);
      paramContext.a(this);
      paramContext.a(3, parame);
      return;
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        paramContext = localContext;
      }
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.i = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void c(boolean paramBoolean)
  {
    try
    {
      this.f = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private d k()
  {
    try
    {
      d locald = this.h;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private int l()
  {
    try
    {
      int j = this.i;
      return j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(w paramw)
  {
    e.h("rqdp{  com strateyg changed }%s", new Object[] { getClass().toString() });
    if (paramw != null)
    {
      paramw = paramw.e(this.b);
      if (paramw != null) {
        if ((!paramw.c()) || (!paramw.b())) {
          break label92;
        }
      }
    }
    label92:
    for (boolean bool = true;; bool = false)
    {
      if (a() != bool)
      {
        e.f("rqdp{  module} %d rqdp{  able changed }%b", new Object[] { Integer.valueOf(this.b), Boolean.valueOf(bool) });
        b(bool);
      }
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool = true;
    Object localObject = t.a(this.a);
    if (localObject != null)
    {
      localObject = ((t)localObject).b().e(this.b);
      if ((localObject != null) && (((w.a)localObject).b() != paramBoolean))
      {
        e.e("rqdp{  mid:}%d rqdp{  change user switch} %b", new Object[] { Integer.valueOf(this.b), Boolean.valueOf(paramBoolean) });
        ((w.a)localObject).a(paramBoolean);
        if ((!((w.a)localObject).b()) || (!((w.a)localObject).c())) {
          break label99;
        }
      }
    }
    label99:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      if (paramBoolean != a()) {
        b(paramBoolean);
      }
      return;
    }
  }
  
  public final boolean a()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    try
    {
      this.e = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.feedback.upload.e c()
  {
    try
    {
      com.tencent.feedback.upload.e locale = this.g;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d()
  {
    e.h("rqdp{  com query start }%s", new Object[] { getClass().toString() });
    a(l() + 1);
  }
  
  public void e()
  {
    e.h("rqdp{  com query end }%s", new Object[] { getClass().toString() });
    if (!b())
    {
      e.b("rqdp{  step after query}", new Object[0]);
      c(true);
    }
    for (;;)
    {
      try
      {
        w localw = t.a(this.a).b();
        w.a locala = localw.e(this.b);
        if ((a()) && (locala != null))
        {
          e.b("rqdp{  isable}", new Object[0]);
          bool1 = locala.d();
          boolean bool2 = localw.j();
          if (!bool1) {
            break label339;
          }
          if (bool2)
          {
            bool1 = true;
            e.b("rqdp{  needDetail} %b rqdp{  allQ:}%b rqdp{  result:}%b", new Object[] { Boolean.valueOf(locala.d()), Boolean.valueOf(localw.j()), Boolean.valueOf(bool1) });
            if (g() <= 0) {
              break label345;
            }
            j = 1;
            if (j != 0)
            {
              e.e("rqdp{  asyn up module} %d", new Object[] { Integer.valueOf(this.b) });
              b.b().a(new i.1(this));
            }
          }
          else
          {
            if (i()) {
              break label339;
            }
            z localz = com.tencent.feedback.proguard.a.a(this.a, this.d);
            if (localz != null)
            {
              d locald = k();
              if (locald == null)
              {
                e.c("rqdp{  imposiable eup reshandler not ready}", new Object[0]);
                break label339;
              }
              locald.a(this.d, localz.c(), false);
            }
            if (i()) {
              break label339;
            }
            bool1 = true;
            continue;
          }
          if (!bool1) {
            break label338;
          }
          e.e("rqdp{  asyn query module }%d", new Object[] { Integer.valueOf(this.b) });
          b.b().a(new i.2(this));
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        e.d("rqdp{  common query end error} %s", new Object[] { localThrowable.toString() });
        return;
      }
      e.b("rqdp{  disable}", new Object[0]);
      label338:
      return;
      label339:
      boolean bool1 = false;
      continue;
      label345:
      int j = 0;
    }
  }
  
  public void f()
  {
    e.h("rqdp{  app first start} %s", new Object[] { getClass().toString() });
  }
  
  public int g()
  {
    if (!a()) {
      return -1;
    }
    return 0;
  }
  
  public boolean h()
  {
    return a();
  }
  
  public boolean i()
  {
    return true;
  }
  
  public final boolean j()
  {
    if (!a()) {}
    com.tencent.feedback.upload.e locale;
    do
    {
      return false;
      locale = c();
    } while (locale == null);
    locale.a(new com.tencent.feedback.upload.a(this.a, this.b, this.c));
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */