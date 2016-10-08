package com.g.a.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

class m
{
  final h a;
  private Executor b;
  private Executor c;
  private Executor d;
  private final Map<Integer, String> e = Collections.synchronizedMap(new HashMap());
  private final Map<String, ReentrantLock> f = new WeakHashMap();
  private final AtomicBoolean g = new AtomicBoolean(false);
  private final AtomicBoolean h = new AtomicBoolean(false);
  private final AtomicBoolean i = new AtomicBoolean(false);
  private final Object j = new Object();
  
  m(h paramh)
  {
    this.a = paramh;
    this.b = paramh.g;
    this.c = paramh.h;
    this.d = a.a();
  }
  
  private void e()
  {
    if ((!this.a.i) && (((ExecutorService)this.b).isShutdown())) {
      this.b = f();
    }
    if ((!this.a.j) && (((ExecutorService)this.c).isShutdown())) {
      this.c = f();
    }
  }
  
  private Executor f()
  {
    return a.a(this.a.k, this.a.l, this.a.m);
  }
  
  String a(com.g.a.b.e.a parama)
  {
    return (String)this.e.get(Integer.valueOf(parama.f()));
  }
  
  AtomicBoolean a()
  {
    return this.g;
  }
  
  ReentrantLock a(String paramString)
  {
    ReentrantLock localReentrantLock2 = (ReentrantLock)this.f.get(paramString);
    ReentrantLock localReentrantLock1 = localReentrantLock2;
    if (localReentrantLock2 == null)
    {
      localReentrantLock1 = new ReentrantLock();
      this.f.put(paramString, localReentrantLock1);
    }
    return localReentrantLock1;
  }
  
  void a(com.g.a.b.e.a parama, String paramString)
  {
    this.e.put(Integer.valueOf(parama.f()), paramString);
  }
  
  void a(p paramp)
  {
    this.d.execute(new n(this, paramp));
  }
  
  void a(u paramu)
  {
    e();
    this.c.execute(paramu);
  }
  
  void a(Runnable paramRunnable)
  {
    this.d.execute(paramRunnable);
  }
  
  Object b()
  {
    return this.j;
  }
  
  void b(com.g.a.b.e.a parama)
  {
    this.e.remove(Integer.valueOf(parama.f()));
  }
  
  boolean c()
  {
    return this.h.get();
  }
  
  boolean d()
  {
    return this.i.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */