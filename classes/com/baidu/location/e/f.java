package com.baidu.location.e;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.baidu.location.BDLocation;
import com.baidu.location.a;
import com.baidu.location.b.b;
import com.baidu.location.b.l;
import com.baidu.location.h.h;
import com.baidu.location.h.m;
import com.baidu.location.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
{
  private static f b = null;
  public boolean a = true;
  private ArrayList c = null;
  private boolean d = false;
  private boolean e = false;
  
  public static f a()
  {
    if (b == null) {
      b = new f();
    }
    return b;
  }
  
  private g a(Messenger paramMessenger)
  {
    if (this.c == null) {
      return null;
    }
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg.b.equals(paramMessenger)) {
        return localg;
      }
    }
    return null;
  }
  
  private void a(g paramg)
  {
    if (paramg == null) {
      return;
    }
    if (a(paramg.b) != null)
    {
      g.a(paramg, 14);
      return;
    }
    this.c.add(paramg);
    g.a(paramg, 13);
  }
  
  private void e()
  {
    f();
    d();
  }
  
  private void f()
  {
    Iterator localIterator = this.c.iterator();
    boolean bool1 = false;
    boolean bool2 = false;
    if (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (localg.c.c) {
        bool2 = true;
      }
      if (!localg.c.h) {
        break label90;
      }
      bool1 = true;
    }
    label90:
    for (;;)
    {
      break;
      l.a = bool1;
      if (this.d != bool2)
      {
        this.d = bool2;
        h.a().a(this.d);
      }
      return;
    }
  }
  
  public void a(Bundle paramBundle, int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    try
    {
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        g.a(localg, paramInt, paramBundle);
        if (localg.d > 4) {
          localIterator.remove();
        }
      }
      return;
    }
    catch (Exception paramBundle) {}
  }
  
  public void a(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.replyTo == null)) {
      return;
    }
    a(new g(this, paramMessage));
    e();
  }
  
  public void a(BDLocation paramBDLocation)
  {
    Iterator localIterator = this.c.iterator();
    try
    {
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        localg.a(paramBDLocation);
        if (localg.d > 4) {
          localIterator.remove();
        }
      }
      return;
    }
    catch (Exception paramBDLocation) {}
  }
  
  public void a(BDLocation paramBDLocation, int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    try
    {
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        localg.a(paramBDLocation, paramInt);
        if (localg.d > 4) {
          localIterator.remove();
        }
      }
      return;
    }
    catch (Exception paramBDLocation) {}
  }
  
  public void a(BDLocation paramBDLocation, Message paramMessage)
  {
    if ((paramBDLocation == null) || (paramMessage == null)) {}
    do
    {
      do
      {
        return;
        paramMessage = a(paramMessage.replyTo);
      } while (paramMessage == null);
      paramMessage.a(paramBDLocation);
    } while (paramMessage.d <= 4);
    this.c.remove(paramMessage);
  }
  
  public void a(String paramString)
  {
    paramString = new BDLocation(paramString);
    Object localObject = u.b().a(paramString);
    String str = u.b().e();
    List localList = u.b().f();
    if (localObject != null) {
      paramString.a((a)localObject);
    }
    if (str != null) {
      paramString.d(str);
    }
    if (localList != null) {
      paramString.a(localList);
    }
    localObject = this.c.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((g)((Iterator)localObject).next()).b(paramString);
    }
  }
  
  public void b()
  {
    this.c.clear();
    e();
  }
  
  public void b(Message paramMessage)
  {
    paramMessage = a(paramMessage.replyTo);
    if (paramMessage != null) {
      this.c.remove(paramMessage);
    }
    n.a().c();
    t.a().c();
    e();
  }
  
  public String c()
  {
    Object localObject = new StringBuffer(256);
    if (this.c.isEmpty()) {
      return "&prod=" + b.d + ":" + b.c;
    }
    g localg = (g)this.c.get(0);
    if (localg.c.f != null) {
      ((StringBuffer)localObject).append(localg.c.f);
    }
    if (localg.a != null)
    {
      ((StringBuffer)localObject).append(":");
      ((StringBuffer)localObject).append(localg.a);
      ((StringBuffer)localObject).append("|");
    }
    localObject = ((StringBuffer)localObject).toString();
    if ((localObject != null) && (!((String)localObject).equals(""))) {
      return "&prod=" + (String)localObject;
    }
    return null;
  }
  
  public boolean c(Message paramMessage)
  {
    boolean bool2 = true;
    g localg = a(paramMessage.replyTo);
    if (localg == null) {
      return false;
    }
    int i = localg.c.d;
    localg.c.d = paramMessage.getData().getInt("scanSpan", localg.c.d);
    if (localg.c.d < 1000)
    {
      n.a().e();
      t.a().c();
      this.a = false;
      if ((localg.c.d <= 999) || (i >= 1000)) {
        break label393;
      }
      if (!localg.c.n)
      {
        bool1 = bool2;
        if (!localg.c.s) {}
      }
      else
      {
        t.a().a(localg.c.n);
        t.a().b(localg.c.s);
        t.a().b();
      }
    }
    label214:
    label382:
    label393:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localg.c.c = paramMessage.getData().getBoolean("openGPS", localg.c.c);
      String str = paramMessage.getData().getString("coorType");
      k localk = localg.c;
      if ((str != null) && (!str.equals("")))
      {
        localk.a = str;
        str = paramMessage.getData().getString("addrType");
        localk = localg.c;
        if ((str == null) || (str.equals(""))) {
          break label382;
        }
      }
      for (;;)
      {
        localk.b = str;
        if (!l.f.equals(localg.c.b)) {
          u.b().i();
        }
        localg.c.e = paramMessage.getData().getInt("timeOut", localg.c.e);
        localg.c.h = paramMessage.getData().getBoolean("location_change_notify", localg.c.h);
        localg.c.g = paramMessage.getData().getInt("priority", localg.c.g);
        e();
        return bool1;
        n.a().d();
        this.a = true;
        break;
        str = localg.c.a;
        break label214;
        str = localg.c.b;
      }
    }
  }
  
  public int d(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.replyTo == null)) {}
    do
    {
      return 1;
      paramMessage = a(paramMessage.replyTo);
    } while ((paramMessage == null) || (paramMessage.c == null));
    return paramMessage.c.g;
  }
  
  public void d()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).a();
    }
  }
  
  public int e(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.replyTo == null)) {}
    do
    {
      return 1000;
      paramMessage = a(paramMessage.replyTo);
    } while ((paramMessage == null) || (paramMessage.c == null));
    return paramMessage.c.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */