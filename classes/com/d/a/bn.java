package com.d.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

public class bn
  extends LinkedList<Runnable>
{
  private static final WeakHashMap<Thread, bn> c = new WeakHashMap();
  p a;
  Semaphore b = new Semaphore(0);
  
  static bn a(Thread paramThread)
  {
    synchronized (c)
    {
      bn localbn2 = (bn)c.get(paramThread);
      bn localbn1 = localbn2;
      if (localbn2 == null)
      {
        localbn1 = new bn();
        c.put(paramThread, localbn1);
      }
      return localbn1;
    }
  }
  
  static void a(p paramp)
  {
    synchronized (c)
    {
      Iterator localIterator = c.values().iterator();
      bn localbn;
      do
      {
        if (!localIterator.hasNext()) {
          return;
        }
        localbn = (bn)localIterator.next();
      } while (localbn.a != paramp);
      localbn.b.release();
    }
  }
  
  public Runnable a()
  {
    try
    {
      if (isEmpty()) {
        return null;
      }
      Runnable localRunnable = (Runnable)super.remove();
      return localRunnable;
    }
    finally {}
  }
  
  public boolean a(Runnable paramRunnable)
  {
    try
    {
      boolean bool = super.add(paramRunnable);
      return bool;
    }
    finally {}
  }
  
  public boolean remove(Object paramObject)
  {
    try
    {
      boolean bool = super.remove(paramObject);
      return bool;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */