package com.tencent.feedback.eup;

import android.content.Context;
import com.tencent.feedback.common.i;
import com.tencent.feedback.proguard.a;
import com.tencent.feedback.proguard.l;
import com.tencent.feedback.proguard.t;
import com.tencent.feedback.proguard.w;
import com.tencent.feedback.upload.AbstractUploadDatas;
import com.tencent.feedback.upload.UploadHandleListener;

public final class f
  extends i
{
  private static f b;
  private CrashStrategyBean c;
  private CrashStrategyBean d;
  private c e;
  private CrashHandleListener f;
  private final boolean g;
  
  private f(Context paramContext, String paramString, boolean paramBoolean, com.tencent.feedback.upload.e parame, UploadHandleListener paramUploadHandleListener, CrashHandleListener paramCrashHandleListener, CrashStrategyBean paramCrashStrategyBean) {}
  
  public static f a(Context paramContext, String paramString, boolean paramBoolean, com.tencent.feedback.upload.e parame, UploadHandleListener paramUploadHandleListener, CrashHandleListener paramCrashHandleListener, CrashStrategyBean paramCrashStrategyBean)
  {
    try
    {
      if (b == null)
      {
        com.tencent.feedback.common.e.e("rqdp{  eup create instance}", new Object[0]);
        paramContext = new f(paramContext, paramString, false, parame, paramUploadHandleListener, paramCrashHandleListener, paramCrashStrategyBean);
        b = paramContext;
        paramContext.a(true);
      }
      paramContext = b;
      return paramContext;
    }
    finally {}
  }
  
  public static com.tencent.feedback.upload.e a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = com.tencent.feedback.upload.f.a(paramContext, paramBoolean);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static boolean a(Thread paramThread, Throwable paramThrowable, String paramString, byte[] paramArrayOfByte)
  {
    com.tencent.feedback.common.e.e("rqdp{  handleCatchException}", new Object[0]);
    if (!n()) {
      return false;
    }
    Object localObject = k();
    if (localObject == null)
    {
      com.tencent.feedback.common.e.c("rqdp{  instance == null}", new Object[0]);
      return false;
    }
    if (((f)localObject).a()) {}
    for (;;)
    {
      try
      {
        localObject = ((f)localObject).t();
        if (localObject != null) {
          break label111;
        }
        com.tencent.feedback.common.e.c("rqdp{  imposiable chandler null!}", new Object[0]);
        return false;
      }
      catch (Throwable paramThread)
      {
        paramThread.printStackTrace();
        com.tencent.feedback.common.e.d("rqdp{  handleCatchException error} %s", new Object[] { paramThread.toString() });
      }
      return ((c)localObject).a(paramThread, paramThrowable, paramString, paramArrayOfByte, false);
      paramThread = paramThread.getName();
      continue;
      return false;
      label111:
      if (paramThread == null) {
        paramThread = null;
      }
    }
  }
  
  public static f k()
  {
    try
    {
      f localf = b;
      return localf;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static AbstractUploadDatas l()
  {
    AbstractUploadDatas localAbstractUploadDatas = null;
    for (;;)
    {
      try
      {
        boolean bool = n();
        if (!bool) {
          return localAbstractUploadDatas;
        }
        if (b == null)
        {
          com.tencent.feedback.common.e.c("rqdp{  instance == null}", new Object[0]);
          continue;
        }
        if (!b.a()) {
          continue;
        }
      }
      finally {}
      g localg = g.a(b.a);
    }
  }
  
  public static boolean m()
  {
    if (!n()) {
      return false;
    }
    com.tencent.feedback.common.e.e("rqdp{  doUploadExceptionDatas}", new Object[0]);
    f localf = k();
    if (localf == null)
    {
      com.tencent.feedback.common.e.c("rqdp{  instance == null}", new Object[0]);
      return false;
    }
    return localf.h();
  }
  
  public static boolean n()
  {
    boolean bool1 = false;
    f localf = k();
    if (localf == null) {
      com.tencent.feedback.common.e.d("rqdp{  not init eup}", new Object[0]);
    }
    do
    {
      boolean bool2;
      do
      {
        return bool1;
        bool2 = localf.a();
        bool1 = bool2;
      } while (!bool2);
      bool1 = bool2;
    } while (!localf.s());
    return localf.b();
  }
  
  private boolean s()
  {
    try
    {
      boolean bool = this.g;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private c t()
  {
    try
    {
      c localc = this.e;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(CrashStrategyBean paramCrashStrategyBean)
  {
    try
    {
      this.d = paramCrashStrategyBean;
      return;
    }
    finally
    {
      paramCrashStrategyBean = finally;
      throw paramCrashStrategyBean;
    }
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokespecial 150	com/tencent/feedback/common/i:b	(Z)V
    //   7: aload_0
    //   8: invokevirtual 102	com/tencent/feedback/eup/f:a	()Z
    //   11: ifeq +13 -> 24
    //   14: aload_0
    //   15: getfield 31	com/tencent/feedback/eup/f:e	Lcom/tencent/feedback/eup/c;
    //   18: invokevirtual 152	com/tencent/feedback/eup/c:a	()V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 31	com/tencent/feedback/eup/f:e	Lcom/tencent/feedback/eup/c;
    //   28: invokevirtual 154	com/tencent/feedback/eup/c:b	()V
    //   31: goto -10 -> 21
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	f
    //   0	39	1	paramBoolean	boolean
    //   34	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	34	finally
    //   24	31	34	finally
  }
  
  public final void e()
  {
    int i = -1;
    super.e();
    Context localContext = this.a;
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.deleteEup() start}", new Object[0]);
    if (localContext == null) {
      com.tencent.feedback.common.e.c("rqdp{  deleteEup() context is null arg}", new Object[0]);
    }
    for (;;)
    {
      com.tencent.feedback.common.e.b("remove fail updata num :%d", new Object[] { Integer.valueOf(i) });
      return;
      i = l.a(localContext, new int[] { 1, 2 }, -1L, Long.MAX_VALUE, 3, -1);
    }
  }
  
  public final void f()
  {
    int i = -1;
    super.f();
    Context localContext = this.a;
    com.tencent.feedback.common.e.b("rqdp{  EUPDAO.deleteEup() start}", new Object[0]);
    if (localContext == null) {
      com.tencent.feedback.common.e.c("rqdp{  deleteEup() context is null arg}", new Object[0]);
    }
    for (;;)
    {
      com.tencent.feedback.common.e.e("rqdp{  eup clear} %d ", new Object[] { Integer.valueOf(i) });
      com.tencent.feedback.common.e.e("rqdp{  eup strategy clear} %d ", new Object[] { Integer.valueOf(a.b(this.a, 302)) });
      return;
      i = l.a(localContext, new int[] { 1, 2 }, -1L, Long.MAX_VALUE, -1, -1);
    }
  }
  
  public final int g()
  {
    int i = 0;
    CrashStrategyBean localCrashStrategyBean = r();
    if ((localCrashStrategyBean != null) && (super.g() >= 0))
    {
      if (!localCrashStrategyBean.isMerged())
      {
        com.tencent.feedback.common.e.e("rqdp{  in no merge}", new Object[0]);
        i = b.b(this.a);
      }
      do
      {
        return i;
        com.tencent.feedback.common.e.e("rqdp{  in merge}", new Object[0]);
      } while (!b.a(this.a));
      return 1;
    }
    return -1;
  }
  
  public final boolean h()
  {
    if (super.h())
    {
      g localg = g.a(this.a);
      com.tencent.feedback.upload.e locale = c();
      if ((localg == null) || (locale == null))
      {
        com.tencent.feedback.common.e.c("rqdp{  upDatas or uphandler null!}", new Object[0]);
        return false;
      }
      try
      {
        locale.a(localg);
        return true;
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        com.tencent.feedback.common.e.d("rqdp{  upload eupdata error} %s", new Object[] { localThrowable.toString() });
      }
    }
    return false;
  }
  
  public final boolean i()
  {
    return p() != null;
  }
  
  public final CrashStrategyBean o()
  {
    try
    {
      CrashStrategyBean localCrashStrategyBean = this.c;
      return localCrashStrategyBean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final CrashStrategyBean p()
  {
    try
    {
      CrashStrategyBean localCrashStrategyBean = this.d;
      return localCrashStrategyBean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final CrashHandleListener q()
  {
    try
    {
      CrashHandleListener localCrashHandleListener = this.f;
      return localCrashHandleListener;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final CrashStrategyBean r()
  {
    for (;;)
    {
      try
      {
        if (t.a(this.a).b().h())
        {
          CrashStrategyBean localCrashStrategyBean1 = p();
          CrashStrategyBean localCrashStrategyBean2 = localCrashStrategyBean1;
          if (localCrashStrategyBean1 == null) {
            localCrashStrategyBean2 = o();
          }
          return localCrashStrategyBean2;
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        return null;
      }
      Object localObject = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */