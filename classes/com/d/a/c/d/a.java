package com.d.a.c.d;

import com.d.a.af;
import com.d.a.ag;
import com.d.a.ai;
import com.d.a.al;
import com.d.a.bo;
import com.d.a.c.bn;
import java.io.IOException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
  implements i
{
  af a;
  ag b;
  h c;
  j d;
  au e;
  Hashtable<Integer, b> f = new Hashtable();
  bn g;
  boolean h = true;
  int i;
  final aa j = new aa();
  long k;
  aa l = new aa();
  boolean m;
  private int n;
  private int o;
  private int p;
  private boolean q = false;
  private Map<Integer, z> r;
  
  public a(af paramaf, bn parambn)
  {
    this.g = parambn;
    this.a = paramaf;
    this.b = new ag(paramaf);
    if (parambn == bn.c) {
      this.e = new ab();
    }
    for (;;)
    {
      this.c = this.e.a(paramaf, this, true);
      this.d = this.e.a(this.b, true);
      this.p = 1;
      if (parambn == bn.d) {
        this.p += 2;
      }
      this.n = 1;
      this.j.a(7, 0, 16777216);
      return;
      if (parambn == bn.d) {
        this.e = new r();
      }
    }
  }
  
  private b a(int paramInt, List<k> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    if (paramBoolean1)
    {
      paramBoolean1 = false;
      if (!paramBoolean2) {
        break label32;
      }
    }
    label32:
    for (paramBoolean2 = bool;; paramBoolean2 = true)
    {
      if (!this.m) {
        break label38;
      }
      return null;
      paramBoolean1 = true;
      break;
    }
    label38:
    int i1 = this.p;
    this.p += 2;
    b localb = new b(this, i1, paramBoolean1, paramBoolean2, paramList);
    if (localb.i()) {
      this.f.put(Integer.valueOf(i1), localb);
    }
    if (paramInt == 0) {
      try
      {
        this.d.a(paramBoolean1, paramBoolean2, i1, paramInt, paramList);
        return localb;
      }
      catch (IOException paramList)
      {
        throw new AssertionError(paramList);
      }
    }
    if (this.h) {
      throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
    }
    this.d.a(paramInt, i1, paramList);
    return localb;
  }
  
  private void a(boolean paramBoolean, int paramInt1, int paramInt2, z paramz)
  {
    if (paramz != null) {
      paramz.a();
    }
    this.d.a(paramBoolean, paramInt1, paramInt2);
  }
  
  private boolean b(int paramInt)
  {
    return (this.g == bn.d) && (paramInt != 0) && ((paramInt & 0x1) == 0);
  }
  
  /* Error */
  private z c(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 162	com/d/a/c/d/a:r	Ljava/util/Map;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 162	com/d/a/c/d/a:r	Ljava/util/Map;
    //   13: iload_1
    //   14: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   17: invokeinterface 168 2 0
    //   22: checkcast 153	com/d/a/c/d/z
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: areturn
    //   30: aconst_null
    //   31: astore_2
    //   32: goto -6 -> 26
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	a
    //   0	40	1	paramInt	int
    //   25	7	2	localz	z
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	35	finally
  }
  
  public b a(List<k> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(0, paramList, paramBoolean1, paramBoolean2);
  }
  
  public void a()
  {
    this.d.a();
    this.d.a(this.j);
    int i1 = this.j.d(65536);
    if (i1 != 65536) {
      this.d.a(0, i1 - 65536);
    }
  }
  
  void a(int paramInt)
  {
    this.i += paramInt;
    if (this.i >= this.j.d(65536) / 2) {}
    try
    {
      this.d.a(0, this.i);
      this.i = 0;
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
  
  public void a(int paramInt1, int paramInt2, List<k> paramList)
  {
    throw new AssertionError("pushPromise");
  }
  
  public void a(int paramInt, long paramLong)
  {
    if (paramInt == 0) {
      a(paramLong);
    }
    b localb;
    do
    {
      return;
      localb = (b)this.f.get(Integer.valueOf(paramInt));
    } while (localb == null);
    localb.a(paramLong);
  }
  
  public void a(int paramInt, g paramg)
  {
    if (b(paramInt)) {
      throw new AssertionError("push");
    }
    b localb = (b)this.f.remove(Integer.valueOf(paramInt));
    if (localb != null) {
      bo.a(localb, new IOException(paramg.toString()));
    }
  }
  
  public void a(int paramInt, g paramg, f paramf)
  {
    this.m = true;
    paramg = this.f.entrySet().iterator();
    for (;;)
    {
      if (!paramg.hasNext()) {
        return;
      }
      paramf = (Map.Entry)paramg.next();
      if ((((Integer)paramf.getKey()).intValue() > paramInt) && (((b)paramf.getValue()).e()))
      {
        bo.a((al)paramf.getValue(), new IOException(g.k.toString()));
        paramg.remove();
      }
    }
  }
  
  void a(long paramLong)
  {
    this.k += paramLong;
    Iterator localIterator = this.f.values().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      bo.a((b)localIterator.next());
    }
  }
  
  public void a(Exception paramException)
  {
    this.a.d();
    Iterator localIterator = this.f.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      bo.a((al)((Map.Entry)localIterator.next()).getValue(), paramException);
      localIterator.remove();
    }
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
    {
      z localz = c(paramInt1);
      if (localz != null) {
        localz.b();
      }
      return;
    }
    try
    {
      a(true, paramInt1, paramInt2, null);
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  public void a(boolean paramBoolean, int paramInt, ai paramai)
  {
    if (b(paramInt)) {
      throw new AssertionError("push");
    }
    b localb = (b)this.f.get(Integer.valueOf(paramInt));
    if (localb == null) {}
    do
    {
      try
      {
        this.d.a(paramInt, g.c);
        paramai.m();
        return;
      }
      catch (IOException paramai)
      {
        throw new AssertionError(paramai);
      }
      int i1 = paramai.d();
      paramai.a(localb.g);
      localb.a(i1);
      bo.a(localb, localb.g);
    } while (!paramBoolean);
    this.f.remove(Integer.valueOf(paramInt));
    localb.d();
    bo.a(localb, null);
  }
  
  public void a(boolean paramBoolean, aa paramaa)
  {
    long l2 = 0L;
    int i1 = this.l.d(65536);
    if (paramBoolean) {
      this.l.a();
    }
    this.l.a(paramaa);
    for (;;)
    {
      long l1;
      try
      {
        this.d.b();
        int i2 = this.l.d(65536);
        l1 = l2;
        if (i2 != -1)
        {
          l1 = l2;
          if (i2 != i1)
          {
            l2 = i2 - i1;
            l1 = l2;
            if (!this.q)
            {
              a(l2);
              this.q = true;
              l1 = l2;
            }
          }
        }
        paramaa = this.f.values().iterator();
        if (!paramaa.hasNext()) {
          return;
        }
      }
      catch (IOException paramaa)
      {
        throw new AssertionError(paramaa);
      }
      ((b)paramaa.next()).a(l1);
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<k> paramList, n paramn)
  {
    if (b(paramInt1)) {
      throw new AssertionError("push");
    }
    if (this.m) {}
    b localb;
    do
    {
      do
      {
        return;
        localb = (b)this.f.get(Integer.valueOf(paramInt1));
        if (localb != null) {
          break;
        }
        if (paramn.a()) {
          try
          {
            this.d.a(paramInt1, g.c);
            return;
          }
          catch (IOException paramList)
          {
            throw new AssertionError(paramList);
          }
        }
      } while ((paramInt1 <= this.o) || (paramInt1 % 2 == this.p % 2));
      throw new AssertionError("unexpected receive stream");
      if (paramn.b()) {
        try
        {
          this.d.a(paramInt1, g.c);
          this.f.remove(Integer.valueOf(paramInt1));
          return;
        }
        catch (IOException paramList)
        {
          throw new AssertionError(paramList);
        }
      }
      localb.a(paramList, paramn);
    } while (!paramBoolean2);
    this.f.remove(Integer.valueOf(paramInt1));
    bo.a(localb, null);
  }
  
  public void b()
  {
    try
    {
      this.d.b();
      return;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */