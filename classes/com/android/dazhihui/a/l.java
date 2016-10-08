package com.android.dazhihui.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.ui.a.h;
import com.android.dazhihui.w;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class l
  extends c
{
  l(g paramg, Context paramContext)
  {
    super(paramContext);
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 2)
    {
      synchronized (g.a(this.a))
      {
        while (!g.m(this.a).isEmpty())
        {
          localm = (com.android.dazhihui.a.b.m)g.m(this.a).get(0);
          if (localm != null)
          {
            localObject3 = localm.n();
            if (localObject3 != null)
            {
              g.n(this.a).a((byte[])localObject3);
              g.c(this.a).c(localObject3.length);
              localm.a(true);
              g.m(this.a).remove(0);
              if (localm.r())
              {
                localObject3 = Message.obtain();
                ((Message)localObject3).what = 0;
                localm.a((Message)localObject3, localm.c());
              }
            }
          }
        }
      }
      g.a(this.a, 2);
    }
    while (paramInt != 0)
    {
      com.android.dazhihui.a.b.m localm;
      Object localObject3;
      return;
    }
    exception(-1);
  }
  
  public void exception(int paramInt)
  {
    synchronized (g.a(this.a))
    {
      Iterator localIterator = g.l(this.a).iterator();
      if (localIterator.hasNext())
      {
        com.android.dazhihui.a.b.m localm = (com.android.dazhihui.a.b.m)localIterator.next();
        Message localMessage = Message.obtain();
        localMessage.what = 1;
        localMessage.obj = new Exception();
        localm.a(localMessage);
      }
    }
    g.d(this.a).sendEmptyMessage(5);
    h.a().a(new m(this));
    this.a.k();
  }
  
  public void receiveData(byte[] arg1)
  {
    g.c(this.a).d(???.length);
    g.a(this.a, 2);
    Iterator localIterator = com.android.dazhihui.a.b.l.a(???).iterator();
    if (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      for (;;)
      {
        com.android.dazhihui.a.b.m localm;
        synchronized (g.a(this.a))
        {
          Object localObject2 = g.l(this.a).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localm = (com.android.dazhihui.a.b.m)((Iterator)localObject2).next();
            if (!(localm instanceof k)) {
              break label189;
            }
            i = ((k)localm).m();
            if (!(localo instanceof com.android.dazhihui.a.b.l)) {
              break label199;
            }
            j = ((com.android.dazhihui.a.b.l)localo).a();
            if (i != j) {
              continue;
            }
            localObject2 = Message.obtain();
            ((Message)localObject2).what = 2;
            ((Message)localObject2).obj = localo;
            localm.a((Message)localObject2);
            if (!localm.q()) {
              g.l(this.a).remove(localm);
            }
          }
        }
        label189:
        int i = localm.p();
        continue;
        label199:
        int j = localm.p();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */