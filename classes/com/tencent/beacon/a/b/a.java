package com.tencent.beacon.a.b;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.beacon.c.e.d;
import com.tencent.beacon.e.b;
import com.tencent.beacon.upload.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
  implements g
{
  private Context a = null;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramInt != 101) {
      b.c("com strategy unmatch key: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    e locale;
    Object localObject1;
    int i;
    do
    {
      do
      {
        do
        {
          return;
        } while ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0));
        locale = c.a(this.a).d();
        if (locale == null)
        {
          b.c("imposible! common strategy null!", new Object[0]);
          return;
        }
        try
        {
          localObject1 = new com.tencent.beacon.c.e.a();
          ((com.tencent.beacon.c.e.a)localObject1).a(new com.tencent.beacon.f.a(paramArrayOfByte));
          if (localObject1 == null) {
            break label1193;
          }
          if (locale != null) {
            break;
          }
        }
        catch (Throwable paramArrayOfByte)
        {
          paramArrayOfByte.printStackTrace();
          b.d("error to common strategy!", new Object[0]);
          return;
        }
      } while (i == 0);
      if (paramBoolean)
      {
        b.e("update common strategy should save ", new Object[0]);
        localObject1 = this.a;
        if (paramArrayOfByte != null)
        {
          localObject2 = new h();
          ((h)localObject2).a(paramInt);
          ((h)localObject2).a(paramArrayOfByte);
          com.tencent.beacon.a.h.a((Context)localObject1, (h)localObject2);
        }
      }
      b.e("com strategy changed notify! ", new Object[0]);
      paramArrayOfByte = c.a(this.a);
      paramArrayOfByte.a(locale);
    } while (!paramBoolean);
    paramArrayOfByte.a(true);
    return;
    int k = 0;
    if (!((com.tencent.beacon.c.e.a)localObject1).c.equals(locale.b()))
    {
      b.b("strategy url changed to: %s", new Object[] { ((com.tencent.beacon.c.e.a)localObject1).c });
      k = 1;
      locale.a(((com.tencent.beacon.c.e.a)localObject1).c);
    }
    if (((com.tencent.beacon.c.e.a)localObject1).b != locale.c())
    {
      b.b("QueryPeriod changed to: %d", new Object[] { Integer.valueOf(((com.tencent.beacon.c.e.a)localObject1).b) });
      k = 1;
      locale.a(((com.tencent.beacon.c.e.a)localObject1).b);
    }
    Object localObject2 = ((com.tencent.beacon.c.e.a)localObject1).a;
    label312:
    Object localObject3;
    int n;
    label356:
    label385:
    int m;
    boolean bool;
    label456:
    int j;
    if (locale == null)
    {
      i = 0;
      break label1199;
      localObject1 = ((com.tencent.beacon.c.e.a)localObject1).d;
      if (locale == null)
      {
        i = 0;
        break label1210;
      }
    }
    else
    {
      i = 0;
      if (localObject2 != null)
      {
        localObject3 = locale.e();
        if (localObject3 == null) {
          break label1199;
        }
        n = 0;
        i = 0;
        if (n >= ((SparseArray)localObject3).size()) {
          break label1190;
        }
        e.a locala = (e.a)((SparseArray)localObject3).valueAt(n);
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        if (!localIterator.hasNext()) {
          break label1234;
        }
        d locald = (d)localIterator.next();
        m = i;
        if (locald.a != locala.f()) {
          break label1221;
        }
        b.a("server module strategy mid: %d", new Object[] { Byte.valueOf(locald.a) });
        if (locald.b != 1) {
          break label1228;
        }
        bool = true;
        if (locala.a() != bool)
        {
          b.b("mid: %d , isUsable changed: %b ", new Object[] { Byte.valueOf(locald.a), Boolean.valueOf(bool) });
          i = 1;
          locala.a(bool);
        }
        j = i;
        if (!locala.b().equals(locald.c))
        {
          b.b("mid: %d , url changed: %s", new Object[] { Byte.valueOf(locald.a), locald.c });
          j = 1;
          locala.a(locald.c);
        }
        if (locald.a != 1)
        {
          i = j;
          if (locald.a != 2) {}
        }
        else
        {
          if ((locala.c() == null) || (locald.d == null)) {
            break label885;
          }
          i = j;
          if (!locala.c().equals(locald.d))
          {
            b.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(locald.a) });
            i = 1;
            locala.a(locald.d);
            c.a(this.a).a(locald.a, locald.d);
          }
        }
        j = i;
        if (locald.a == 1)
        {
          if ((locala.d() == null) || (locald.e == null)) {
            break label965;
          }
          if (!locala.d().equals(locald.e))
          {
            label725:
            b.b("mid: %d , PreventEventCode changed...", new Object[] { Byte.valueOf(locald.a) });
            i = 1;
            locala.a(com.tencent.beacon.b.a.a(locald.e));
          }
          label761:
          if ((locala.g() == null) || (locald.g == null)) {
            break label984;
          }
          j = i;
          if (!locala.g().equals(locald.g))
          {
            label799:
            b.b("mid: %d , SampleEventSet changed...", new Object[] { Byte.valueOf(locald.a) });
            j = 1;
            locala.b(com.tencent.beacon.b.a.a(locald.g));
          }
        }
        for (;;)
        {
          m = j;
          if (locald.a != 2) {
            break label1221;
          }
          b.b("mid: %d , SpeedMonitorStrategy", new Object[] { Byte.valueOf(locald.a) });
          locala.a(locald.f);
          m = j;
          break label1221;
          label885:
          i = j;
          if (locald.d == null) {
            break;
          }
          i = j;
          if (locala.c() != null) {
            break;
          }
          b.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(locald.a) });
          i = 1;
          locala.a(locald.d);
          c.a(this.a).a(locald.a, locald.d);
          break;
          label965:
          if ((locala.d() != null) || (locald.e != null)) {
            break label725;
          }
          break label761;
          label984:
          if ((locala.g() != null) || (locald.g != null)) {
            break label799;
          }
          j = i;
        }
      }
      localObject2 = locale.e();
      if (localObject2 == null) {
        break label1199;
      }
      m = ((SparseArray)localObject2).size();
      j = 0;
      i = 0;
    }
    for (;;)
    {
      if (j < m)
      {
        localObject3 = (e.a)((SparseArray)localObject2).valueAt(j);
        if (!((e.a)localObject3).a()) {
          break label1243;
        }
        b.b("mid: %d , server not response strategy, sdk local close it!", new Object[] { Integer.valueOf(((e.a)localObject3).f()) });
        i = 1;
        ((e.a)localObject3).a(false);
        break label1243;
        k = 0;
        if ((localObject1 != null) && (locale.d() != null))
        {
          i = k;
          if (!((Map)localObject1).equals(locale.d()))
          {
            locale.a((Map)localObject1);
            i = 1;
          }
        }
        else
        {
          i = k;
          if (localObject1 != null)
          {
            i = k;
            if (locale.d() == null)
            {
              locale.a((Map)localObject1);
              i = 1;
            }
          }
        }
      }
      label1190:
      label1193:
      label1199:
      label1210:
      while (i == 0)
      {
        i = j;
        break;
        do
        {
          j = k;
          break label312;
          continue;
          continue;
          i = 0;
          break;
        } while (i == 0);
        j = 1;
        break label312;
      }
      i = 1;
      break;
      label1221:
      i = m;
      break label385;
      label1228:
      bool = false;
      break label456;
      label1234:
      n += 1;
      break label356;
      label1243:
      j += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */