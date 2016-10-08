package com.joanzapata.pdfview;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.joanzapata.pdfview.c.a;
import com.joanzapata.pdfview.d.c;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

class e
{
  private PriorityQueue<a> a = new PriorityQueue(c.a, new f(this));
  private PriorityQueue<a> b = new PriorityQueue(c.a, new f(this));
  private Vector<a> c = new Vector();
  
  private a a(PriorityQueue<a> paramPriorityQueue, a parama)
  {
    paramPriorityQueue = paramPriorityQueue.iterator();
    while (paramPriorityQueue.hasNext())
    {
      a locala = (a)paramPriorityQueue.next();
      if (locala.equals(parama)) {
        return locala;
      }
    }
    return null;
  }
  
  private void e()
  {
    try
    {
      while ((this.b.size() + this.a.size() >= c.a) && (!this.a.isEmpty()))
      {
        ((a)this.a.poll()).d().recycle();
        continue;
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    for (;;)
    {
      if ((this.b.size() + this.a.size() >= c.a) && (!this.b.isEmpty())) {
        ((a)this.b.poll()).d().recycle();
      }
    }
  }
  
  public void a()
  {
    this.a.addAll(this.b);
    this.b.clear();
  }
  
  public void a(a parama)
  {
    e();
    this.b.offer(parama);
  }
  
  public boolean a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF)
  {
    paramRectF = new a(paramInt1, paramInt2, null, paramFloat1, paramFloat2, paramRectF, true, 0);
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      if (((a)localIterator.next()).equals(paramRectF)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF, int paramInt3)
  {
    paramRectF = new a(paramInt1, paramInt2, null, paramFloat1, paramFloat2, paramRectF, false, 0);
    a locala = a(this.a, paramRectF);
    if (locala != null)
    {
      this.a.remove(locala);
      locala.a(paramInt3);
      this.b.offer(locala);
      return true;
    }
    return a(this.b, paramRectF) != null;
  }
  
  public Vector<a> b()
  {
    Vector localVector = new Vector(this.a);
    localVector.addAll(this.b);
    return localVector;
  }
  
  public void b(a parama)
  {
    if (this.c.size() >= 4) {
      ((a)this.c.remove(0)).d().recycle();
    }
    this.c.add(parama);
  }
  
  public Vector<a> c()
  {
    return this.c;
  }
  
  public void d()
  {
    Iterator localIterator = this.b.iterator();
    a locala;
    while (localIterator.hasNext())
    {
      locala = (a)localIterator.next();
      if (locala.d() != null) {
        locala.d().recycle();
      }
    }
    localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      locala = (a)localIterator.next();
      if (locala.d() != null) {
        locala.d().recycle();
      }
    }
    localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      locala = (a)localIterator.next();
      if (locala.d() != null) {
        locala.d().recycle();
      }
    }
    this.a.clear();
    this.b.clear();
    this.c.clear();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */