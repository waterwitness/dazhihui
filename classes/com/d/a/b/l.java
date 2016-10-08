package com.d.a.b;

import com.d.a.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class l<T>
  extends j
  implements e<T>
{
  p d;
  Exception e;
  T j;
  boolean k;
  g<T> l;
  
  private boolean a(boolean paramBoolean)
  {
    if (!super.cancel()) {
      return false;
    }
    try
    {
      this.e = new CancellationException();
      b();
      g localg = k();
      this.k = paramBoolean;
      c(localg);
      return true;
    }
    finally {}
  }
  
  private void c(g<T> paramg)
  {
    if ((paramg != null) && (!this.k)) {
      paramg.a(this.e, this.j);
    }
  }
  
  private T j()
  {
    if (this.e != null) {
      throw new ExecutionException(this.e);
    }
    return (T)this.j;
  }
  
  private g<T> k()
  {
    g localg = this.l;
    this.l = null;
    return localg;
  }
  
  public l<T> a(f<T> paramf)
  {
    paramf.a(g());
    c(paramf);
    return this;
  }
  
  public boolean a(Exception paramException)
  {
    return b(paramException, null);
  }
  
  public final <C extends g<T>> C b(C paramC)
  {
    if ((paramC instanceof d)) {
      ((d)paramC).a(this);
    }
    d(paramC);
    return paramC;
  }
  
  void b()
  {
    if (this.d != null)
    {
      this.d.b();
      this.d = null;
    }
  }
  
  public boolean b(Exception paramException, T paramT)
  {
    try
    {
      if (!super.e()) {
        return false;
      }
      this.j = paramT;
      this.e = paramException;
      b();
      paramException = k();
      c(paramException);
      return true;
    }
    finally {}
  }
  
  public boolean b(T paramT)
  {
    return b(null, paramT);
  }
  
  public l<T> c(a parama)
  {
    super.b(parama);
    return this;
  }
  
  public boolean cancel()
  {
    return a(this.k);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    return cancel();
  }
  
  /* Error */
  public l<T> d(g<T> paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield 65	com/d/a/b/l:l	Lcom/d/a/b/g;
    //   7: aload_0
    //   8: invokevirtual 113	com/d/a/b/l:isDone	()Z
    //   11: ifne +10 -> 21
    //   14: aload_0
    //   15: invokevirtual 116	com/d/a/b/l:isCancelled	()Z
    //   18: ifeq +17 -> 35
    //   21: aload_0
    //   22: invokespecial 41	com/d/a/b/l:k	()Lcom/d/a/b/g;
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 47	com/d/a/b/l:c	(Lcom/d/a/b/g;)V
    //   33: aload_0
    //   34: areturn
    //   35: aconst_null
    //   36: astore_1
    //   37: goto -11 -> 26
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	l
    //   0	45	1	paramg	g<T>
    // Exception table:
    //   from	to	target	type
    //   2	21	40	finally
    //   21	26	40	finally
    //   26	28	40	finally
    //   41	43	40	finally
  }
  
  public boolean e()
  {
    return b(null);
  }
  
  p f()
  {
    if (this.d == null) {
      this.d = new p();
    }
    return this.d;
  }
  
  public g<T> g()
  {
    return new m(this);
  }
  
  public T get()
  {
    try
    {
      if ((isCancelled()) || (isDone()))
      {
        localObject1 = j();
        return (T)localObject1;
      }
      Object localObject1 = f();
      ((p)localObject1).a();
      return (T)j();
    }
    finally {}
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    try
    {
      if ((isCancelled()) || (isDone()))
      {
        paramTimeUnit = j();
        return paramTimeUnit;
      }
      p localp = f();
      if (!localp.a(paramLong, paramTimeUnit)) {
        throw new TimeoutException();
      }
    }
    finally {}
    return (T)j();
  }
  
  public Exception h()
  {
    return this.e;
  }
  
  public T i()
  {
    return (T)this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */