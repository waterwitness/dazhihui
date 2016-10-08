package com.tencent.beaconimsdk.upload;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.beaconimsdk.a.b.d;
import com.tencent.beaconimsdk.a.b.d.a;
import com.tencent.beaconimsdk.a.b.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
{
  private Context a = null;
  
  public e(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramInt != 101) {
      com.tencent.beaconimsdk.c.a.c("com strategy unmatch key: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    d locald;
    Object localObject1;
    int i;
    for (;;)
    {
      return;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        locald = com.tencent.beaconimsdk.a.b.b.a(this.a).e();
        if (locald == null)
        {
          com.tencent.beaconimsdk.c.a.c("imposible! common strategy null!", new Object[0]);
          return;
        }
        try
        {
          localObject1 = new com.tencent.beaconimsdk.b.c.a();
          ((com.tencent.beaconimsdk.b.c.a)localObject1).a(new com.tencent.beaconimsdk.d.a(paramArrayOfByte));
          if (locald == null)
          {
            i = 0;
            if (i == 0) {
              continue;
            }
            if (paramBoolean)
            {
              com.tencent.beaconimsdk.c.a.e("update common strategy should save ", new Object[0]);
              localObject1 = this.a;
              if (paramArrayOfByte != null)
              {
                localObject2 = new g();
                ((g)localObject2).a(paramInt);
                ((g)localObject2).a(paramArrayOfByte);
                com.tencent.beaconimsdk.a.e.a((Context)localObject1, (g)localObject2);
              }
            }
            com.tencent.beaconimsdk.c.a.e("com strategy changed notify! ", new Object[0]);
            paramArrayOfByte = com.tencent.beaconimsdk.a.b.b.a(this.a);
            paramArrayOfByte.a(locald);
            if (!paramBoolean) {
              continue;
            }
            paramArrayOfByte.b();
          }
        }
        catch (Throwable paramArrayOfByte)
        {
          com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
          com.tencent.beaconimsdk.c.a.d("error to common strategy!", new Object[0]);
          return;
        }
      }
    }
    int k = 0;
    if (!((com.tencent.beaconimsdk.b.c.a)localObject1).c.equals(locald.b()))
    {
      com.tencent.beaconimsdk.c.a.b("strategy url changed to: %s", new Object[] { ((com.tencent.beaconimsdk.b.c.a)localObject1).c });
      k = 1;
      locald.a(((com.tencent.beaconimsdk.b.c.a)localObject1).c);
    }
    if (((com.tencent.beaconimsdk.b.c.a)localObject1).b != locald.c())
    {
      com.tencent.beaconimsdk.c.a.b("QueryPeriod changed to: %d", new Object[] { Integer.valueOf(((com.tencent.beaconimsdk.b.c.a)localObject1).b) });
      k = 1;
      locald.a(((com.tencent.beaconimsdk.b.c.a)localObject1).b);
    }
    Object localObject2 = ((com.tencent.beaconimsdk.b.c.a)localObject1).a;
    label306:
    Object localObject3;
    int m;
    label350:
    label379:
    int j;
    boolean bool;
    if (locald == null)
    {
      i = 0;
      break label1133;
      localObject1 = ((com.tencent.beaconimsdk.b.c.a)localObject1).d;
      if (locald == null)
      {
        i = 0;
        break label1144;
      }
    }
    else
    {
      i = 0;
      if (localObject2 != null)
      {
        localObject3 = locald.e();
        if (localObject3 == null) {
          break label1133;
        }
        m = 0;
        i = 0;
        if (m >= ((SparseArray)localObject3).size()) {
          break label1133;
        }
        d.a locala = (d.a)((SparseArray)localObject3).valueAt(m);
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        if (!localIterator.hasNext()) {
          break label1168;
        }
        com.tencent.beaconimsdk.b.c.b localb = (com.tencent.beaconimsdk.b.c.b)localIterator.next();
        j = i;
        if (localb.a != locala.e()) {
          break label1155;
        }
        com.tencent.beaconimsdk.c.a.a("server module strategy mid: %d", new Object[] { Byte.valueOf(localb.a) });
        if (localb.b != 1) {
          break label1162;
        }
        bool = true;
        label450:
        if (locala.a() != bool)
        {
          com.tencent.beaconimsdk.c.a.b("mid: %d , isUsable changed: %b ", new Object[] { Byte.valueOf(localb.a), Boolean.valueOf(bool) });
          i = 1;
          locala.a(bool);
        }
        j = i;
        if (!locala.b().equals(localb.c))
        {
          com.tencent.beaconimsdk.c.a.b("mid: %d , url changed: %s", new Object[] { Byte.valueOf(localb.a), localb.c });
          j = 1;
          locala.a(localb.c);
        }
        if (localb.a != 1)
        {
          i = j;
          if (localb.a != 2) {}
        }
        else
        {
          if ((locala.c() == null) || (localb.d == null)) {
            break label832;
          }
          i = j;
          if (!locala.c().equals(localb.d))
          {
            com.tencent.beaconimsdk.c.a.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localb.a) });
            i = 1;
            locala.a(localb.d);
            com.tencent.beaconimsdk.a.b.b.a(this.a).a(localb.a, localb.d);
          }
        }
        label672:
        j = i;
        if (localb.a != 1) {
          break label1155;
        }
        if ((locala.d() != null) && (localb.e != null))
        {
          if (!locala.d().equals(localb.e))
          {
            label719:
            com.tencent.beaconimsdk.c.a.b("mid: %d , PreventEventCode changed...", new Object[] { Byte.valueOf(localb.a) });
            i = 1;
            locala.a(com.tencent.beaconimsdk.a.e.a(localb.e));
          }
          label755:
          if ((locala.f() == null) || (localb.f == null)) {
            break label931;
          }
          j = i;
          if (locala.f().equals(localb.f)) {
            break label1155;
          }
        }
        for (;;)
        {
          com.tencent.beaconimsdk.c.a.b("mid: %d , SampleEventSet changed...", new Object[] { Byte.valueOf(localb.a) });
          j = 1;
          locala.b(com.tencent.beaconimsdk.a.e.a(localb.f));
          break label1155;
          label832:
          i = j;
          if (localb.d == null) {
            break label672;
          }
          i = j;
          if (locala.c() != null) {
            break label672;
          }
          com.tencent.beaconimsdk.c.a.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localb.a) });
          i = 1;
          locala.a(localb.d);
          com.tencent.beaconimsdk.a.b.b.a(this.a).a(localb.a, localb.d);
          break label672;
          if (locala.d() != null) {
            break label719;
          }
          if (localb.e == null) {
            break label755;
          }
          break label719;
          label931:
          if (locala.f() == null) {
            if (localb.f == null) {
              break;
            }
          }
        }
      }
      localObject2 = locald.e();
      if (localObject2 == null) {
        break label1133;
      }
      m = ((SparseArray)localObject2).size();
      j = 0;
      i = 0;
    }
    for (;;)
    {
      if (j < m)
      {
        localObject3 = (d.a)((SparseArray)localObject2).valueAt(j);
        if (!((d.a)localObject3).a()) {
          break label1177;
        }
        com.tencent.beaconimsdk.c.a.b("mid: %d , server not response strategy, sdk local close it!", new Object[] { Integer.valueOf(((d.a)localObject3).e()) });
        i = 1;
        ((d.a)localObject3).a(false);
        break label1177;
        k = 0;
        if ((localObject1 != null) && (locald.d() != null))
        {
          i = k;
          if (!((Map)localObject1).equals(locald.d()))
          {
            locald.a((Map)localObject1);
            i = 1;
          }
        }
        else
        {
          i = k;
          if (localObject1 != null)
          {
            i = k;
            if (locald.d() == null)
            {
              locald.a((Map)localObject1);
              i = 1;
            }
          }
        }
      }
      label1133:
      label1144:
      while (i == 0)
      {
        i = j;
        break;
        do
        {
          j = k;
          break;
        } while (i == 0);
        j = 1;
        break label306;
      }
      i = 1;
      break;
      label1155:
      i = j;
      break label379;
      label1162:
      bool = false;
      break label450;
      label1168:
      m += 1;
      break label350;
      label1177:
      j += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */