package com.android.dazhihui.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.b.b;
import com.android.dazhihui.w;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class i
  extends c
{
  i(g paramg, Context paramContext)
  {
    super(paramContext);
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 2)
    {
      g.d(this.a).removeMessages(9);
      g.d(this.a).sendEmptyMessage(9);
      synchronized (g.a(this.a))
      {
        while (!g.e(this.a).isEmpty())
        {
          localm = (m)g.e(this.a).remove(0);
          g.f(this.a).c(localm);
          if (localm.r())
          {
            localMessage = Message.obtain();
            localMessage.what = 0;
            localm.a(localMessage.what);
            localm.b(true);
            localm.a(localMessage, localm.c());
          }
        }
      }
      g.a(this.a, 0);
      g.a(this.a, true);
      g.a(this.a, System.currentTimeMillis());
    }
    while (paramInt != 0)
    {
      m localm;
      Message localMessage;
      return;
    }
    exception(-1);
  }
  
  public void exception(int paramInt)
  {
    g.b(this.a).a(0);
    this.a.a(0L);
    Message localMessage = Message.obtain();
    localMessage.obj = new Exception();
    if (g.h(this.a))
    {
      g.d(this.a).removeMessages(8);
      if ((!g.d(this.a).hasMessages(3)) && (!g.d(this.a).hasMessages(8)))
      {
        localMessage.what = 3;
        Log.d("Protocol", "NETWORK_MARKET_EXCEPTION_MSG");
        g.b(this.a, false);
        g.d(this.a).sendMessage(localMessage);
      }
    }
    while ((g.d(this.a).hasMessages(3)) || (g.d(this.a).hasMessages(8))) {
      return;
    }
    g.b(this.a, true);
    localMessage.what = 8;
    Log.e("Protocol", "netConnectException RESET_MARKET_MSG");
    g.d(this.a).sendMessageDelayed(localMessage, 100L);
  }
  
  public void receiveData(byte[] arg1)
  {
    g.b(this.a).a(2);
    g.c(this.a).d(???.length);
    g.a(this.a, 0);
    Iterator localIterator = o.d(???).iterator();
    while (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      this.a.a(localo);
      b.a().a(localo);
      if (localo.j())
      {
        g.a(this.a, localo);
      }
      else if (localo.g())
      {
        b.a().b(localo);
        g.a(this.a, localo);
      }
      else
      {
        g.a(this.a, System.currentTimeMillis());
        g.b(this.a, 0);
        g.c(this.a, 0);
        synchronized (g.a(this.a))
        {
          Object localObject2 = g.g(this.a).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            m localm = (m)((Iterator)localObject2).next();
            if (localm.p() == localo.f())
            {
              this.a.a(localm, localo);
              localObject2 = Message.obtain();
              ((Message)localObject2).what = 2;
              ((Message)localObject2).obj = localo;
              localm.a((Message)localObject2);
              if (!localm.q())
              {
                g.g(this.a).remove(localm);
                g.f(this.a).e(localm);
              }
              localo.c(true);
            }
          }
          if (!localo.j())
          {
            b.a().b(localo);
            g.a(this.a, localo);
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */