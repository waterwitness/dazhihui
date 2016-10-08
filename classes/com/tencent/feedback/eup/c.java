package com.tencent.feedback.eup;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
  implements Thread.UncaughtExceptionHandler
{
  private static c c = null;
  private Thread.UncaughtExceptionHandler a = null;
  private Context b = null;
  
  private c(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      this.b = paramContext;
      return;
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        paramContext = localContext;
      }
    }
  }
  
  private int a(List<e> paramList, int paramInt, boolean paramBoolean)
  {
    Context localContext = this.b;
    if ((paramList == null) || (paramInt <= 0)) {
      return 0;
    }
    ArrayList localArrayList = new ArrayList();
    Collections.sort(paramList, new b.2());
    paramList = paramList.iterator();
    while ((paramList.hasNext()) && (paramInt > localArrayList.size()))
    {
      e locale = (e)paramList.next();
      if ((locale.b()) && (!paramBoolean)) {
        break;
      }
      localArrayList.add(locale);
      paramList.remove();
    }
    if (localArrayList.size() > 0) {
      return b.a(localContext, localArrayList);
    }
    return 0;
  }
  
  public static c a(Context paramContext)
  {
    try
    {
      if ((c == null) && (paramContext != null)) {
        c = new c(paramContext);
      }
      paramContext = c;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  private void a(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	com/tencent/feedback/eup/c:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   6: ifnull +26 -> 32
    //   9: ldc 88
    //   11: iconst_0
    //   12: anewarray 4	java/lang/Object
    //   15: invokestatic 94	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: getfield 23	com/tencent/feedback/eup/c:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   22: aload_1
    //   23: aload_2
    //   24: invokeinterface 97 3 0
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: ldc 99
    //   34: iconst_0
    //   35: anewarray 4	java/lang/Object
    //   38: invokestatic 94	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: invokestatic 104	android/os/Process:myPid	()I
    //   44: invokestatic 108	android/os/Process:killProcess	(I)V
    //   47: iconst_1
    //   48: invokestatic 113	java/lang/System:exit	(I)V
    //   51: goto -22 -> 29
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	c
    //   0	59	1	paramThread	Thread
    //   0	59	2	paramThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	29	54	finally
    //   32	51	54	finally
  }
  
  private static void c()
  {
    b.1 local1 = new b.1();
    local1.setName("ImmediateEUP");
    local1.start();
    try
    {
      local1.join(3000L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
  
  public final void a()
  {
    try
    {
      com.tencent.feedback.common.e.e("rqdp{ eup regist}", new Object[0]);
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
      if (localUncaughtExceptionHandler != this)
      {
        this.a = localUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
      }
      return;
    }
    finally {}
  }
  
  public final boolean a(e parame, CrashStrategyBean paramCrashStrategyBean)
  {
    if ((parame == null) && (paramCrashStrategyBean == null))
    {
      com.tencent.feedback.common.e.c("handler exception data params error", new Object[0]);
      return false;
    }
    Object localObject1;
    boolean bool;
    Object localObject3;
    if (paramCrashStrategyBean.isMerged())
    {
      localObject1 = this.b;
      if (parame == null) {
        localObject1 = null;
      }
      while (localObject1 != null)
      {
        com.tencent.feedback.common.e.e("merge success return", new Object[0]);
        if ((!((e)localObject1).y()) && (((e)localObject1).o() >= 2))
        {
          com.tencent.feedback.common.e.e("rqdp{ may be crash too frequent! do immediate upload in merge!}", new Object[0]);
          c();
        }
        return true;
        localObject2 = com.tencent.feedback.proguard.a.c(com.tencent.feedback.proguard.a.c(parame.h()).getBytes());
        if (localObject2 == null)
        {
          com.tencent.feedback.common.e.c("rqdp{  md5 error!}", new Object[0]);
          localObject1 = null;
        }
        else
        {
          parame.g((String)localObject2);
          parame.b(true);
          parame.b(1);
          parame.a(0);
          localObject2 = b.a((Context)localObject1, 1, "desc", -1, (String)localObject2, -1, -1, -1, -1, -1L, -1L, null);
          if ((localObject2 == null) || (((List)localObject2).size() <= 0))
          {
            com.tencent.feedback.common.e.b("rqdp{  new one ,no merged!}", new Object[0]);
            localObject1 = null;
          }
          else
          {
            localObject2 = (e)((List)localObject2).get(0);
            if ((((e)localObject2).n() != null) && (((e)localObject2).n().contains(parame.i())))
            {
              com.tencent.feedback.common.e.b("rqdp{ already merged} %d", new Object[] { Long.valueOf(parame.i()) });
              localObject1 = localObject2;
            }
            else
            {
              ((e)localObject2).b(((e)localObject2).o() + 1);
              if (((e)localObject2).n() == null) {
                ((e)localObject2).f("");
              }
              ((e)localObject2).f(((e)localObject2).n() + parame.i() + "\n");
              com.tencent.feedback.common.e.b("rqdp{  EUPDAO.insertOrUpdateEUP() start}", new Object[0]);
              if ((localObject1 == null) || (localObject2 == null)) {
                com.tencent.feedback.common.e.c("rqdp{  context == null || bean == null,pls check}", new Object[0]);
              }
              for (bool = false;; bool = b.b((Context)localObject1, (List)localObject3))
              {
                localObject1 = localObject2;
                if (!bool) {
                  break;
                }
                com.tencent.feedback.common.e.g("rqdp{  eupMeg update success} %b , c:%d , at:%s up:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((e)localObject2).o()), ((e)localObject2).n(), Integer.valueOf(((e)localObject2).l()) });
                localObject1 = localObject2;
                if (parame.r() == null) {
                  break;
                }
                localObject3 = new File(parame.r());
                localObject1 = localObject2;
                if (!((File)localObject3).exists()) {
                  break;
                }
                localObject1 = localObject2;
                if (!((File)localObject3).isFile()) {
                  break;
                }
                ((File)localObject3).delete();
                localObject1 = localObject2;
                break;
                localObject3 = new ArrayList();
                ((List)localObject3).add(localObject2);
              }
            }
          }
        }
      }
    }
    int i = paramCrashStrategyBean.getMaxStoredNum();
    Object localObject2 = b.a(this.b, i + 1, "asc", -1, null, -1, -1, -1, -1, -1L, -1L, null);
    if ((localObject2 != null) && (((List)localObject2).size() > 0))
    {
      i = ((List)localObject2).size() - i + 1;
      if ((i > 0) && (a((List)localObject2, i, parame.b()) < i))
      {
        com.tencent.feedback.common.e.e("can't add more eup!", new Object[0]);
        return false;
      }
    }
    if ((localObject2 != null) && (((List)localObject2).size() > 1))
    {
      localObject1 = (e)((List)localObject2).get(0);
      localObject3 = ((List)localObject2).iterator();
      if (((Iterator)localObject3).hasNext())
      {
        localObject2 = (e)((Iterator)localObject3).next();
        if ((((e)localObject1).i() >= ((e)localObject2).i()) || (!((e)localObject2).b())) {
          break label828;
        }
        localObject1 = localObject2;
      }
    }
    label828:
    for (;;)
    {
      break;
      if ((((e)localObject1).b()) && (parame.i() - ((e)localObject1).i() < 60000L))
      {
        com.tencent.feedback.common.e.e("rqdp{ may be crash too frequent! do immediate upload in not merge!}", new Object[0]);
        c();
      }
      b.a(this.b, parame, paramCrashStrategyBean);
      if (com.tencent.feedback.common.a.e(this.b))
      {
        com.tencent.feedback.common.e.e("save log", new Object[0]);
        parame.a(com.tencent.feedback.proguard.a.a(paramCrashStrategyBean.getOnlyLogTag(), paramCrashStrategyBean.getMaxLogRow()));
      }
      for (;;)
      {
        bool = b.a(this.b, parame);
        com.tencent.feedback.common.e.g("store new eup pn:%s, isMe:%b , isNa:%b , res:%b ", new Object[] { parame.s(), Boolean.valueOf(parame.c()), Boolean.valueOf(parame.d()), Boolean.valueOf(bool) });
        return bool;
        parame.a(null);
      }
    }
  }
  
  public final boolean a(String paramString1, Throwable paramThrowable, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    String str3 = com.tencent.feedback.common.a.h(this.b);
    Object localObject3 = "";
    Object localObject1 = "";
    String str2;
    if (paramThrowable != null) {
      str2 = paramThrowable.getMessage();
    }
    for (;;)
    {
      String str1;
      label40:
      Object localObject2;
      label63:
      long l;
      if (paramThrowable != null)
      {
        str1 = paramThrowable.getClass().getName();
        localObject2 = f.k();
        if (localObject2 != null) {
          break label470;
        }
        com.tencent.feedback.common.e.c("rqdp{  instance == null}", new Object[0]);
        localObject2 = null;
        l = new Date().getTime();
      }
      try
      {
        paramThrowable = b.a(paramThrowable, CrashReport.getCrashRuntimeStrategy());
        localObject3 = paramThrowable;
        localObject4 = localObject1;
        if (localObject3 != null)
        {
          localObject4 = localObject1;
          if (((String)localObject3).contains("\n")) {
            localObject4 = ((String)localObject3).substring(0, ((String)localObject3).indexOf("\n"));
          }
        }
        com.tencent.feedback.common.e.b("rqdp{ stack:}%s", new Object[] { localObject3 });
        localObject1 = paramString2;
        if (paramBoolean)
        {
          localObject1 = paramString2;
          if (localObject2 != null)
          {
            com.tencent.feedback.common.e.b("get crash extra...", new Object[0]);
            paramThrowable = paramString2;
            if (localObject2 == null) {}
          }
        }
      }
      catch (Throwable paramThrowable)
      {
        for (;;)
        {
          try
          {
            Object localObject4;
            com.tencent.feedback.common.e.a("your crmsg", new Object[0]);
            paramThrowable = ((CrashHandleListener)localObject2).getCrashExtraMessage(false, str1, (String)localObject4, (String)localObject3, 55536, l);
            localObject1 = paramThrowable;
            if (localObject2 != null) {
              try
              {
                com.tencent.feedback.common.e.a("your crdata", new Object[0]);
                paramString2 = ((CrashHandleListener)localObject2).getCrashExtraData(false, str1, (String)localObject4, (String)localObject3, 55536, l);
                paramArrayOfByte = com.tencent.feedback.common.c.a(this.b);
                paramThrowable = b.a(this.b, paramArrayOfByte.h(), paramArrayOfByte.p(), paramArrayOfByte.k(), paramArrayOfByte.y(), str3, paramString1, (String)localObject4, str1, str2, (String)localObject3, l, paramThrowable, paramString2);
                paramThrowable.a(paramBoolean);
              }
              catch (Throwable paramString2)
              {
                com.tencent.feedback.common.e.d("rqdp{ get extra msg error} %s", new Object[] { paramString2.toString() });
                paramString2.printStackTrace();
                localObject1 = paramThrowable;
              }
            }
            try
            {
              paramString2 = b.a();
              if (paramString2 != null)
              {
                paramThrowable.F().putAll(paramString2);
                if ((paramString1 != null) && (paramString1.trim().length() > 0)) {
                  paramThrowable.F().remove(paramString1);
                }
              }
            }
            catch (Throwable paramString1)
            {
              com.tencent.feedback.common.e.d("get all threads stack fail", new Object[0]);
              paramString1.printStackTrace();
              continue;
              paramBoolean = true;
              continue;
              com.tencent.feedback.common.e.c("not to save", new Object[0]);
            }
            if ((!paramBoolean) || (localObject2 == null)) {
              break label599;
            }
            try
            {
              com.tencent.feedback.common.e.a("your ask2save", new Object[0]);
              paramString1 = str1;
              if (str2 != null)
              {
                paramString1 = str1;
                if (str2.trim().length() > 0) {
                  paramString1 = str1 + ":" + str2;
                }
              }
              paramBoolean = ((CrashHandleListener)localObject2).onCrashSaving(false, paramString1, (String)localObject4, (String)localObject3, 55536, l, paramThrowable.m(), paramThrowable.G(), paramThrowable.x());
              if (!paramBoolean) {
                break label605;
              }
              return a(paramThrowable, CrashReport.getCrashRuntimeStrategy());
            }
            catch (Throwable paramString1)
            {
              com.tencent.feedback.common.e.d("rqdp{ get extra msg error} %s", new Object[] { paramString1.toString() });
              paramString1.printStackTrace();
            }
            str2 = "";
            break;
            str1 = "";
            break label40;
            label470:
            localObject2 = ((f)localObject2).q();
            break label63;
            paramThrowable = paramThrowable;
            com.tencent.feedback.common.e.d("create stack from throw fail!", new Object[0]);
            paramThrowable.printStackTrace();
          }
          catch (Throwable paramThrowable)
          {
            com.tencent.feedback.common.e.d("rqdp{ get extra msg error} %s", new Object[] { paramThrowable.toString() });
            paramThrowable.printStackTrace();
            paramThrowable = paramString2;
            continue;
          }
          paramString2 = paramArrayOfByte;
          paramThrowable = (Throwable)localObject1;
        }
      }
    }
    label599:
    label605:
    return false;
  }
  
  public final void b()
  {
    try
    {
      com.tencent.feedback.common.e.e("rqdp{ eup unregister}", new Object[0]);
      if (Thread.getDefaultUncaughtExceptionHandler() == this)
      {
        Thread.setDefaultUncaughtExceptionHandler(this.a);
        this.a = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (paramThrowable != null) {}
    for (;;)
    {
      try
      {
        paramThrowable.printStackTrace();
        Object localObject = f.k();
        if (localObject == null)
        {
          com.tencent.feedback.common.e.c("rqdp{  instance == null}", new Object[0]);
          localObject = null;
          if (localObject == null) {}
        }
        try
        {
          com.tencent.feedback.common.e.a("your crhandler start", new Object[0]);
          ((CrashHandleListener)localObject).onCrashHandleStart(false);
          if (paramThread == null)
          {
            String str1 = "";
            com.tencent.feedback.common.e.e("rqdp{ handle eup result} %b", new Object[] { Boolean.valueOf(a(str1, paramThrowable, null, null, true)) });
            if (localObject == null) {
              break label194;
            }
          }
          try
          {
            com.tencent.feedback.common.e.a("your crhandler end", new Object[0]);
            bool = ((CrashHandleListener)localObject).onCrashHandleEnd(false);
            if (bool) {
              a(paramThread, paramThrowable);
            }
            return;
          }
          catch (Throwable localThrowable1)
          {
            String str2;
            com.tencent.feedback.common.e.d("rqdp{ your crash handle end error} %s", new Object[] { localThrowable1.toString() });
            localThrowable1.printStackTrace();
          }
          localObject = ((f)localObject).q();
        }
        catch (Throwable localThrowable2)
        {
          com.tencent.feedback.common.e.d("rqdp{ handle start error} %s", new Object[] { localThrowable2.toString() });
          localThrowable2.printStackTrace();
          continue;
        }
        str2 = paramThread.getName();
      }
      finally {}
      continue;
      label194:
      boolean bool = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */