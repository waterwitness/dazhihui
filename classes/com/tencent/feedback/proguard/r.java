package com.tencent.feedback.proguard;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.feedback.common.e;
import com.tencent.feedback.upload.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class r
  implements d
{
  private Context a = null;
  
  public r(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramInt != 300) {
      e.c("rqdp{  com strategy unmatch key:}%d", new Object[] { Integer.valueOf(paramInt) });
    }
    w localw;
    Object localObject1;
    do
    {
      do
      {
        return;
      } while (paramArrayOfByte == null);
      localw = t.a(this.a).b();
      if (localw == null)
      {
        e.c("rqdp{  imposible! common strategy null!}", new Object[0]);
        return;
      }
      try
      {
        localObject1 = new T();
        ((T)localObject1).a(new h(paramArrayOfByte));
        if (localObject1 == null) {
          break label1110;
        }
        if (localw != null) {
          break;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        e.d("rqdp{  error to common strategy!}", new Object[0]);
        return;
      }
    } while (i == 0);
    if (paramBoolean)
    {
      e.e("rqdp{  update common strategy should save}", new Object[0]);
      a.a(this.a, paramInt, paramArrayOfByte);
    }
    e.e("rqdp{  com strategy changed notify!}", new Object[0]);
    t.a(this.a).a(localw);
    return;
    int i = 0;
    if (((T)localObject1).g != localw.h())
    {
      e.b("rqdp{  useSStrategy changed to} %b", new Object[] { Boolean.valueOf(((T)localObject1).g) });
      i = 1;
      localw.a(((T)localObject1).g);
    }
    if (!((T)localObject1).e.equals(localw.a()))
    {
      e.b("rqdp{  url changed to} %s", new Object[] { ((T)localObject1).e });
      i = 1;
      localw.a(((T)localObject1).e);
    }
    int k;
    Object localObject2;
    for (;;)
    {
      if (((T)localObject1).c != localw.b())
      {
        e.b("rqdp{  upStrategy changed to} %d", new Object[] { Integer.valueOf(((T)localObject1).c) });
        i = 1;
        localw.a(((T)localObject1).c);
      }
      if (((T)localObject1).d != localw.c())
      {
        e.b("rqdp{  QueryPeriod changed to} %d", new Object[] { Integer.valueOf(((T)localObject1).d) });
        i = 1;
        localw.b(((T)localObject1).d);
      }
      k = i;
      if (((T)localObject1).f != localw.j())
      {
        e.b("rqdp{  enforceQuery changed to} %b", new Object[] { Boolean.valueOf(((T)localObject1).f) });
        k = 1;
        localw.b(((T)localObject1).f);
      }
      localObject2 = ((T)localObject1).b;
      if (localObject2 == null) {
        break label1116;
      }
      if (localw != null) {
        break;
      }
      break label1116;
      label411:
      localObject1 = ((T)localObject1).a;
      if (localw != null) {
        break label623;
      }
      i = 0;
      break label1130;
      e.b("rqdp{  url same to} %s", new Object[] { ((T)localObject1).e });
    }
    i = 0;
    if (((W)localObject2).c != localw.f())
    {
      e.b("rqdp{  ea changed:}%d", new Object[] { Integer.valueOf(((W)localObject2).c) });
      i = 1;
      localw.c(((W)localObject2).c);
    }
    if (((W)localObject2).d != localw.g())
    {
      e.b("rqdp{  za changed:}%d", new Object[] { Integer.valueOf(((W)localObject2).d) });
      i = 1;
      localw.d(((W)localObject2).d);
    }
    if (!((W)localObject2).a.equals(localw.d()))
    {
      e.b("rqdp{  enk changed}", new Object[0]);
      i = 1;
      localw.b(((W)localObject2).a);
    }
    label623:
    int j;
    int m;
    if (!((W)localObject2).b.equals(localw.e()))
    {
      e.b("rqdp{  enpk changed}", new Object[0]);
      i = 1;
      localw.c(((W)localObject2).b);
      break label1119;
      j = 0;
      m = 0;
      i = 0;
      if (localObject1 != null)
      {
        localObject2 = localw.i();
        j = i;
        if (localObject2 != null)
        {
          m = 0;
          i = 0;
          label659:
          if (m >= ((SparseArray)localObject2).size()) {
            break label1157;
          }
          w.a locala = (w.a)((SparseArray)localObject2).valueAt(m);
          Iterator localIterator = ((ArrayList)localObject1).iterator();
          boolean bool1 = false;
          label691:
          while (localIterator.hasNext())
          {
            V localV = (V)localIterator.next();
            j = i;
            if (localV.a != locala.a) {
              break label1141;
            }
            boolean bool2 = true;
            bool1 = true;
            if (locala.d() != localV.c)
            {
              e.b("rqdp{  mid:}%d rqdp{  , need detail changed:}%b ", new Object[] { Integer.valueOf(localV.a), Boolean.valueOf(localV.c) });
              i = 1;
              locala.c(localV.c);
            }
            if (!locala.a().equals(localV.b))
            {
              e.b("rqdp{  mid:}%d rqdp{  , url changed:}%s", new Object[] { Integer.valueOf(localV.a), localV.b });
              i = 1;
              locala.a(localV.b);
            }
            else
            {
              e.b("rqdp{  mid:}%d rqdp{  , url same:}%s", new Object[] { Integer.valueOf(localV.a), localV.b });
              bool1 = bool2;
              j = i;
              break label1141;
            }
          }
          if (bool1 == locala.c()) {
            break label1148;
          }
          e.b("rqdp{  mid:}%d rqdp{  , enable} %b", new Object[] { Integer.valueOf(locala.a), Boolean.valueOf(bool1) });
          i = 1;
          locala.b(bool1);
          break label1148;
        }
      }
    }
    for (;;)
    {
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        i = j;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (V)((Iterator)localObject1).next();
        if (localw.e(((V)localObject2).a) == null) {
          e.c("rqdp{  imposiable! module base strategy not ready! mId:}%d", new Object[] { Integer.valueOf(((V)localObject2).a) });
        }
      }
      localObject1 = localw.i();
      i = m;
      if (localObject1 != null)
      {
        m = 0;
        for (;;)
        {
          i = j;
          if (m >= ((SparseArray)localObject1).size()) {
            break;
          }
          localObject2 = (w.a)((SparseArray)localObject1).valueAt(m);
          if (((w.a)localObject2).c())
          {
            e.b("rqdp{  mid:}%d rqdp{  , server closed}", new Object[] { Integer.valueOf(((w.a)localObject2).e()) });
            j = 1;
            ((w.a)localObject2).b(false);
          }
          m += 1;
        }
      }
      label1110:
      label1116:
      label1119:
      label1130:
      while (i == 0)
      {
        i = k;
        break;
        i = 0;
        break;
        i = 0;
        if (i == 0) {
          break label411;
        }
        k = 1;
        break label411;
      }
      i = 1;
      break;
      label1141:
      i = j;
      break label691;
      label1148:
      m += 1;
      break label659;
      label1157:
      j = i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */