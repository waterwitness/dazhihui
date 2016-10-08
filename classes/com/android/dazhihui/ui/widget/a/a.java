package com.android.dazhihui.ui.widget.a;

import android.os.Build.VERSION;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<Params, Progress, Result>
{
  private static final ThreadFactory a = new b();
  public static final Executor b;
  public static final Executor c;
  public static final Executor d;
  private static final BlockingQueue<Runnable> e = new LinkedBlockingQueue(10);
  private static final g f;
  private static volatile Executor g;
  private final k<Params, Result> h = new c(this);
  private final FutureTask<Result> i = new d(this, this.h);
  private volatile j j = j.a;
  private final AtomicBoolean k = new AtomicBoolean();
  private final AtomicBoolean l = new AtomicBoolean();
  
  static
  {
    b = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, e, a, new ThreadPoolExecutor.DiscardOldestPolicy());
    if (a()) {}
    for (Object localObject = new h(null);; localObject = Executors.newSingleThreadExecutor(a))
    {
      c = (Executor)localObject;
      d = Executors.newFixedThreadPool(2, a);
      f = new g(null);
      g = c;
      return;
    }
  }
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
  
  private void c(Result paramResult)
  {
    if (!this.l.get()) {
      d(paramResult);
    }
  }
  
  private Result d(Result paramResult)
  {
    f.obtainMessage(1, new f(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  private void e(Result paramResult)
  {
    if (d()) {
      b(paramResult);
    }
    for (;;)
    {
      this.j = j.c;
      return;
      a(paramResult);
    }
  }
  
  public final a<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.j != j.a) {}
    switch (e.a[this.j.ordinal()])
    {
    default: 
      this.j = j.b;
      b();
      this.h.b = paramVarArgs;
      paramExecutor.execute(this.i);
      return this;
    case 1: 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  protected void a(Result paramResult) {}
  
  protected void b() {}
  
  protected void b(Result paramResult)
  {
    c();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  public final a<Params, Progress, Result> c(Params... paramVarArgs)
  {
    return a(g, paramVarArgs);
  }
  
  protected void c() {}
  
  public final boolean cancel(boolean paramBoolean)
  {
    this.k.set(true);
    return this.i.cancel(paramBoolean);
  }
  
  public final boolean d()
  {
    return this.k.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */