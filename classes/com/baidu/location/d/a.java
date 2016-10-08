package com.baidu.location.d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.e;
import com.baidu.location.h;
import java.util.ArrayList;
import java.util.Iterator;

public class a
{
  private ArrayList a = null;
  private float b = Float.MAX_VALUE;
  private BDLocation c = null;
  private long d = 0L;
  private h e = null;
  private Context f = null;
  private int g = 0;
  private long h = 0L;
  private boolean i = false;
  private PendingIntent j = null;
  private AlarmManager k = null;
  private a.b l = null;
  private b m = new b(this);
  private boolean n = false;
  
  public a(Context paramContext, h paramh)
  {
    this.f = paramContext;
    this.e = paramh;
    this.e.a(this.m);
    this.k = ((AlarmManager)this.f.getSystemService("alarm"));
    this.l = new a.b(this);
    this.n = false;
  }
  
  private void a(long paramLong)
  {
    try
    {
      if (this.j != null) {
        this.k.cancel(this.j);
      }
      this.j = PendingIntent.getBroadcast(this.f, 0, new Intent("android.com.baidu.location.TIMER.NOTIFY"), 134217728);
      if (this.j == null) {
        return;
      }
      this.k.set(0, System.currentTimeMillis() + paramLong, this.j);
      return;
    }
    catch (Exception localException) {}
  }
  
  private void a(BDLocation paramBDLocation)
  {
    if ((paramBDLocation.h() != 61) && (paramBDLocation.h() != 161) && (paramBDLocation.h() != 65)) {
      a(120000L);
    }
    while ((System.currentTimeMillis() - this.d < 5000L) || (this.a == null)) {
      return;
    }
    this.c = paramBDLocation;
    this.d = System.currentTimeMillis();
    float[] arrayOfFloat = new float[1];
    Iterator localIterator = this.a.iterator();
    float f1 = Float.MAX_VALUE;
    if (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      Location.distanceBetween(paramBDLocation.c(), paramBDLocation.d(), locale.f, locale.g, arrayOfFloat);
      float f2 = arrayOfFloat[0] - locale.c - paramBDLocation.f();
      if (f2 > 0.0F)
      {
        if (f2 >= f1) {
          break label210;
        }
        f1 = f2;
      }
      label210:
      for (;;)
      {
        break;
        if (locale.h < 3)
        {
          locale.h += 1;
          locale.a(paramBDLocation, arrayOfFloat[0]);
          if (locale.h < 3) {
            this.i = true;
          }
        }
      }
    }
    if (f1 < this.b) {
      this.b = f1;
    }
    this.g = 0;
    c();
  }
  
  private boolean b()
  {
    boolean bool2;
    if ((this.a == null) || (this.a.isEmpty())) {
      bool2 = false;
    }
    Iterator localIterator;
    boolean bool1;
    do
    {
      return bool2;
      localIterator = this.a.iterator();
      bool1 = false;
      bool2 = bool1;
    } while (!localIterator.hasNext());
    if (((e)localIterator.next()).h < 3) {
      bool1 = true;
    }
    for (;;)
    {
      break;
    }
  }
  
  private void c()
  {
    int i2 = 10000;
    if (!b()) {
      return;
    }
    int i1;
    if (this.b > 5000.0F)
    {
      i1 = 600000;
      if (!this.i) {
        break label148;
      }
      this.i = false;
      i1 = i2;
    }
    label146:
    label148:
    for (;;)
    {
      if (this.g != 0)
      {
        long l1 = this.h;
        long l2 = this.g;
        long l3 = System.currentTimeMillis();
        if (i1 <= l1 + l2 - l3) {}
      }
      for (i2 = 0;; i2 = 1)
      {
        if (i2 == 0) {
          break label146;
        }
        this.g = i1;
        this.h = System.currentTimeMillis();
        a(this.g);
        return;
        if (this.b > 1000.0F)
        {
          i1 = 120000;
          break;
        }
        if (this.b > 500.0F)
        {
          i1 = 60000;
          break;
        }
        i1 = 10000;
        break;
      }
      break;
    }
  }
  
  public int a(e parame)
  {
    if (this.a == null) {
      this.a = new ArrayList();
    }
    this.a.add(parame);
    parame.i = true;
    parame.j = this;
    if (!this.n)
    {
      this.f.registerReceiver(this.l, new IntentFilter("android.com.baidu.location.TIMER.NOTIFY"));
      this.n = true;
    }
    if (parame.e == null) {
      return 1;
    }
    Object localObject;
    if (!parame.e.equals("gcj02"))
    {
      localObject = Jni.a(parame.b, parame.a, parame.e + "2gcj");
      parame.g = localObject[0];
      parame.f = localObject[1];
    }
    if ((this.c == null) || (System.currentTimeMillis() - this.d > 30000L)) {
      this.e.a();
    }
    for (;;)
    {
      c();
      return 1;
      localObject = new float[1];
      Location.distanceBetween(this.c.c(), this.c.d(), parame.f, parame.g, (float[])localObject);
      float f1 = localObject[0] - parame.c - this.c.f();
      if (f1 > 0.0F)
      {
        if (f1 < this.b) {
          this.b = f1;
        }
      }
      else if (parame.h < 3)
      {
        parame.h += 1;
        parame.a(this.c, localObject[0]);
        if (parame.h < 3) {
          this.i = true;
        }
      }
    }
  }
  
  public void a()
  {
    if (this.j != null) {
      this.k.cancel(this.j);
    }
    this.c = null;
    this.d = 0L;
    if (this.n) {
      this.f.unregisterReceiver(this.l);
    }
    this.n = false;
  }
  
  public int b(e parame)
  {
    if (this.a == null) {
      return 0;
    }
    if (this.a.contains(parame)) {
      this.a.remove(parame);
    }
    if ((this.a.size() == 0) && (this.j != null)) {
      this.k.cancel(this.j);
    }
    return 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */