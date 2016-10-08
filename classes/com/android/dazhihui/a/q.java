package com.android.dazhihui.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.a.h;
import com.android.dazhihui.w;
import java.util.Vector;

class q
  extends Handler
{
  q(g paramg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    case 5: 
    default: 
    case 0: 
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    case 8: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
              } while (!this.a.u());
              if (g.o(this.a) == null) {
                g.a(this.a, g.p(this.a));
              }
              this.a.a(g.o(this.a));
              return;
            } while ((!this.a.w()) || (!h.a().c()));
            g.b(this.a, h.a().e());
            this.a.a(g.q(this.a));
            return;
          } while ((!this.a.v()) || (!e.a().l()));
          g.c(this.a, e.a().m());
          this.a.a(g.r(this.a));
          return;
          while (!g.e(this.a).isEmpty())
          {
            m localm = (m)g.e(this.a).get(0);
            g.e(this.a).remove(0);
            Message localMessage = Message.obtain();
            localMessage.what = 1;
            localMessage.obj = paramMessage.obj;
            localm.a(localMessage);
          }
          g.d(this.a, 3);
          return;
          g.d(this.a, 4);
          return;
          this.a.n();
          return;
          this.a.x();
        } while (!g.s(this.a));
        this.a.d();
        return;
        this.a.x();
        this.a.a(0L);
        o.d();
        g.f(this.a).b();
        w.a().u();
      } while ((!g.s(this.a)) || (g.b(this.a) == null) || (TextUtils.isEmpty(g.t(this.a).C())));
      g.b(this.a).b();
      g.b(this.a).a(g.t(this.a).C(), g.t(this.a).D());
      g.b(this.a).a();
      return;
    case 9: 
      w.a().u();
      g.t(this.a).ak();
      return;
    }
    g.c(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */