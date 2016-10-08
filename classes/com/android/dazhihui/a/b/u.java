package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.b.o;

public class u
  extends m
{
  private com.android.dazhihui.ui.delegate.b.u[] l = null;
  private int m;
  
  public u(com.android.dazhihui.ui.delegate.b.u[] paramArrayOfu)
  {
    this.l = paramArrayOfu;
    this.j = this.l.length;
    this.i = n.d;
    this.f = d.b;
    this.c = 7000L;
  }
  
  public void a(com.android.dazhihui.ui.delegate.b.u[] paramArrayOfu)
  {
    this.l = paramArrayOfu;
  }
  
  protected boolean a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return false;
      if ((com.android.dazhihui.a.g.a().o()) && (o.r()))
      {
        com.android.dazhihui.a.g.a += 1;
        if (com.android.dazhihui.a.g.a >= 2)
        {
          com.android.dazhihui.a.g.a().A();
          a.a().l();
          a.a().m();
          com.android.dazhihui.a.g.a = 0;
          return false;
          com.android.dazhihui.a.g.a = 0;
          paramObject = ((v)paramObject).b();
          if (this.l[0].d() == 13)
          {
            if ((paramObject != null) && (!new com.android.dazhihui.ui.delegate.b.g(((com.android.dazhihui.ui.delegate.b.u)paramObject).e()).g()))
            {
              paramObject = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)paramObject).e());
              if ((paramObject != null) && ((((String)paramObject).indexOf("10000") > 0) || (((String)paramObject).indexOf("20000") > 0) || (((String)paramObject).indexOf("20001") > 0)))
              {
                Log.d("trade", "D Error");
                a.a().p();
                return true;
              }
            }
          }
          else if ((this.l[0].d() == 12) && (paramObject != null))
          {
            String str2 = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)paramObject).e());
            paramObject = h.c(str2);
            String str1 = "";
            int i;
            if (o.a)
            {
              paramObject = str1;
              if (str2 != null)
              {
                paramInt = str2.indexOf("21008");
                i = str2.indexOf("\001", paramInt);
                paramObject = str1;
                if (paramInt > 0)
                {
                  paramObject = str1;
                  if (i <= 0) {}
                }
              }
            }
            for (paramObject = str2.substring(paramInt + 6, i); (paramObject != null) && ((((String)paramObject).indexOf("10000") >= 0) || (((String)paramObject).indexOf("20000") >= 0) || (((String)paramObject).indexOf("20001") >= 0)); paramObject = ((h)paramObject).c())
            {
              Log.d("trade", "C Error");
              a.a().p();
              return true;
            }
          }
        }
      }
    }
  }
  
  public void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  public int m()
  {
    return this.m;
  }
  
  public byte[] n()
  {
    com.android.dazhihui.ui.delegate.b.u[] arrayOfu = this.l;
    int j = arrayOfu.length;
    int i = 0;
    if (i < j)
    {
      Object localObject = arrayOfu[i];
      ((com.android.dazhihui.ui.delegate.b.u)localObject).a(this.h);
      Log.d("Protocol", "request tradepack tag: " + this.h + "   ");
      if (this.h == 0) {
        if (new String(com.android.dazhihui.ui.delegate.b.g.b("8=CTRL1.0\00121004=10\001")).equals(new String(((com.android.dazhihui.ui.delegate.b.u)localObject).e()))) {
          Log.d("Protocol", "request tradepack protocol: 心跳包   ");
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (((com.android.dazhihui.ui.delegate.b.u)localObject).d() == 13)
        {
          Log.d("Protocol", "request tradepack protocol: D协议   ");
        }
        else
        {
          localObject = h.c(com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.ui.delegate.b.u)localObject).e()));
          Log.d("Protocol", "request tradepack protocol: " + ((h)localObject).a() + "   ");
        }
      }
    }
    return com.android.dazhihui.ui.delegate.b.u.a(this.l, this);
  }
  
  public com.android.dazhihui.ui.delegate.b.u[] w()
  {
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */