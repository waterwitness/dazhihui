package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.l;
import java.util.Timer;

public class af
{
  private static volatile af dd = null;
  private Timer dc = null;
  private Context h = null;
  
  private af(Context paramContext)
  {
    this.h = paramContext.getApplicationContext();
    this.dc = new Timer(false);
  }
  
  public static af Y(Context paramContext)
  {
    if (dd == null) {}
    try
    {
      if (dd == null) {
        dd = new af(paramContext);
      }
      return dd;
    }
    finally {}
  }
  
  public final void ah()
  {
    if (c.j() == d.aG)
    {
      long l = c.u() * 60 * 1000;
      if (c.k()) {
        l.av().b("setupPeriodTimer delay:" + l);
      }
      ag localag = new ag(this);
      if (this.dc == null) {
        break label103;
      }
      if (c.k()) {
        l.av().b("setupPeriodTimer schedule delay:" + l);
      }
      this.dc.schedule(localag, l);
    }
    label103:
    while (!c.k()) {
      return;
    }
    l.av().c("setupPeriodTimer schedule timer == null");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */