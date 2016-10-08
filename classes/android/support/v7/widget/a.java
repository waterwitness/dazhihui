package android.support.v7.widget;

import android.support.v4.c.o;
import android.support.v4.c.p;
import java.util.ArrayList;
import java.util.List;

class a
  implements ac
{
  final ArrayList<c> a = new ArrayList();
  final ArrayList<c> b = new ArrayList();
  final b c;
  Runnable d;
  final boolean e;
  final ab f;
  private o<c> g = new p(30);
  private int h = 0;
  
  a(b paramb)
  {
    this(paramb, false);
  }
  
  a(b paramb, boolean paramBoolean)
  {
    this.c = paramb;
    this.e = paramBoolean;
    this.f = new ab(this);
  }
  
  private void b(c paramc)
  {
    g(paramc);
  }
  
  private void c(c paramc)
  {
    int i2 = paramc.b;
    int k = paramc.b + paramc.d;
    int j = -1;
    int i = paramc.b;
    int n = 0;
    if (i < k) {
      if ((this.c.a(i) != null) || (d(i)))
      {
        if (j != 0) {
          break label221;
        }
        e(a(2, i2, n, null));
      }
    }
    label100:
    label215:
    label221:
    for (int m = 1;; m = 0)
    {
      j = 1;
      if (m != 0)
      {
        m = i - n;
        i = k - n;
        k = 1;
        n = k;
        k = i;
        i = m + 1;
        break;
        if (j != 1) {
          break label215;
        }
        g(a(2, i2, n, null));
      }
      for (j = 1;; j = 0)
      {
        int i1 = 0;
        m = j;
        j = i1;
        break;
        n += 1;
        m = i;
        i = k;
        k = n;
        break label100;
        c localc = paramc;
        if (n != paramc.d)
        {
          a(paramc);
          localc = a(2, i2, n, null);
        }
        if (j == 0)
        {
          e(localc);
          return;
        }
        g(localc);
        return;
      }
    }
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    int j = this.b.size() - 1;
    c localc;
    if (j >= 0)
    {
      localc = (c)this.b.get(j);
      int k;
      int i;
      if (localc.a == 8) {
        if (localc.b < localc.d)
        {
          k = localc.b;
          i = localc.d;
          label61:
          if ((paramInt1 < k) || (paramInt1 > i)) {
            break label189;
          }
          if (k != localc.b) {
            break label149;
          }
          if (paramInt2 != 1) {
            break label131;
          }
          localc.d += 1;
          label97:
          paramInt1 += 1;
          label101:
          i = paramInt1;
        }
      }
      for (;;)
      {
        j -= 1;
        paramInt1 = i;
        break;
        k = localc.d;
        i = localc.b;
        break label61;
        label131:
        if (paramInt2 != 2) {
          break label97;
        }
        localc.d -= 1;
        break label97;
        label149:
        if (paramInt2 == 1) {
          localc.b += 1;
        }
        for (;;)
        {
          paramInt1 -= 1;
          break;
          if (paramInt2 == 2) {
            localc.b -= 1;
          }
        }
        label189:
        if (paramInt1 < localc.b)
        {
          if (paramInt2 == 1)
          {
            localc.b += 1;
            localc.d += 1;
            break label101;
          }
          if (paramInt2 == 2)
          {
            localc.b -= 1;
            localc.d -= 1;
          }
        }
        break label101;
        if (localc.b <= paramInt1)
        {
          if (localc.a == 1)
          {
            i = paramInt1 - localc.d;
          }
          else
          {
            i = paramInt1;
            if (localc.a == 2) {
              i = paramInt1 + localc.d;
            }
          }
        }
        else if (paramInt2 == 1)
        {
          localc.b += 1;
          i = paramInt1;
        }
        else
        {
          i = paramInt1;
          if (paramInt2 == 2)
          {
            localc.b -= 1;
            i = paramInt1;
          }
        }
      }
    }
    paramInt2 = this.b.size() - 1;
    if (paramInt2 >= 0)
    {
      localc = (c)this.b.get(paramInt2);
      if (localc.a == 8) {
        if ((localc.d == localc.b) || (localc.d < 0))
        {
          this.b.remove(paramInt2);
          a(localc);
        }
      }
      for (;;)
      {
        paramInt2 -= 1;
        break;
        if (localc.d <= 0)
        {
          this.b.remove(paramInt2);
          a(localc);
        }
      }
    }
    return paramInt1;
  }
  
  private void d(c paramc)
  {
    int k = paramc.b;
    int i2 = paramc.b;
    int i3 = paramc.d;
    int i = paramc.b;
    int i1 = -1;
    int j = 0;
    if (i < i2 + i3)
    {
      int m;
      int n;
      if ((this.c.a(i) != null) || (d(i)))
      {
        m = j;
        n = k;
        if (i1 == 0)
        {
          e(a(4, k, j, paramc.c));
          m = 0;
          n = i;
        }
        k = n;
      }
      for (j = 1;; j = 0)
      {
        i += 1;
        m += 1;
        i1 = j;
        j = m;
        break;
        m = j;
        n = k;
        if (i1 == 1)
        {
          g(a(4, k, j, paramc.c));
          m = 0;
          n = i;
        }
        k = n;
      }
    }
    Object localObject = paramc;
    if (j != paramc.d)
    {
      localObject = paramc.c;
      a(paramc);
      localObject = a(4, k, j, localObject);
    }
    if (i1 == 0)
    {
      e((c)localObject);
      return;
    }
    g((c)localObject);
  }
  
  private boolean d(int paramInt)
  {
    int k = this.b.size();
    int i = 0;
    while (i < k)
    {
      c localc = (c)this.b.get(i);
      if (localc.a == 8)
      {
        if (a(localc.d, i + 1) == paramInt) {
          return true;
        }
      }
      else if (localc.a == 1)
      {
        int m = localc.b;
        int n = localc.d;
        int j = localc.b;
        while (j < m + n)
        {
          if (a(j, i + 1) == paramInt) {
            return true;
          }
          j += 1;
        }
      }
      i += 1;
    }
    return false;
  }
  
  private void e(c paramc)
  {
    if ((paramc.a == 1) || (paramc.a == 8)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i1 = d(paramc.b, paramc.a);
    int j = paramc.b;
    int k;
    int n;
    int m;
    label112:
    int i2;
    switch (paramc.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramc);
    case 4: 
      k = 1;
      n = 1;
      m = 1;
      if (m >= paramc.d) {
        break label299;
      }
      i2 = d(paramc.b + k * m, paramc.a);
      switch (paramc.a)
      {
      case 3: 
      default: 
        i = 0;
        label174:
        if (i == 0) {}
        break;
      }
      break;
    }
    for (int i = n + 1;; i = n)
    {
      m += 1;
      n = i;
      break label112;
      k = 0;
      break;
      if (i2 == i1 + 1)
      {
        i = 1;
        break label174;
      }
      i = 0;
      break label174;
      if (i2 == i1)
      {
        i = 1;
        break label174;
      }
      i = 0;
      break label174;
      localObject = a(paramc.a, i1, n, paramc.c);
      a((c)localObject, j);
      a((c)localObject);
      i = j;
      if (paramc.a == 4) {
        i = j + n;
      }
      n = 1;
      i1 = i2;
      j = i;
    }
    label299:
    Object localObject = paramc.c;
    a(paramc);
    if (n > 0)
    {
      paramc = a(paramc.a, i1, n, localObject);
      a(paramc, j);
      a(paramc);
    }
  }
  
  private void f(c paramc)
  {
    g(paramc);
  }
  
  private void g(c paramc)
  {
    this.b.add(paramc);
    switch (paramc.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramc);
    case 1: 
      this.c.c(paramc.b, paramc.d);
      return;
    case 8: 
      this.c.d(paramc.b, paramc.d);
      return;
    case 2: 
      this.c.b(paramc.b, paramc.d);
      return;
    }
    this.c.a(paramc.b, paramc.d, paramc.c);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int k = this.b.size();
    int j = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramInt2;
    c localc;
    if (j < k)
    {
      localc = (c)this.b.get(j);
      if (localc.a == 8) {
        if (localc.b == paramInt2) {
          paramInt1 = localc.d;
        }
      }
    }
    for (;;)
    {
      j += 1;
      paramInt2 = paramInt1;
      break;
      int i = paramInt2;
      if (localc.b < paramInt2) {
        i = paramInt2 - 1;
      }
      paramInt1 = i;
      if (localc.d <= i)
      {
        paramInt1 = i + 1;
        continue;
        paramInt1 = paramInt2;
        if (localc.b <= paramInt2) {
          if (localc.a == 2)
          {
            if (paramInt2 < localc.b + localc.d)
            {
              paramInt1 = -1;
              return paramInt1;
            }
            paramInt1 = paramInt2 - localc.d;
          }
          else
          {
            paramInt1 = paramInt2;
            if (localc.a == 1) {
              paramInt1 = paramInt2 + localc.d;
            }
          }
        }
      }
    }
  }
  
  public c a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    c localc = (c)this.g.a();
    if (localc == null) {
      return new c(paramInt1, paramInt2, paramInt3, paramObject);
    }
    localc.a = paramInt1;
    localc.b = paramInt2;
    localc.d = paramInt3;
    localc.c = paramObject;
    return localc;
  }
  
  void a()
  {
    a(this.a);
    a(this.b);
    this.h = 0;
  }
  
  public void a(c paramc)
  {
    if (!this.e)
    {
      paramc.c = null;
      this.g.a(paramc);
    }
  }
  
  void a(c paramc, int paramInt)
  {
    this.c.a(paramc);
    switch (paramc.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 2: 
      this.c.a(paramInt, paramc.d);
      return;
    }
    this.c.a(paramInt, paramc.d, paramc.c);
  }
  
  void a(List<c> paramList)
  {
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      a((c)paramList.get(i));
      i += 1;
    }
    paramList.clear();
  }
  
  boolean a(int paramInt)
  {
    return (this.h & paramInt) != 0;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    if (paramInt1 == paramInt2) {
      return false;
    }
    if (paramInt3 != 1) {
      throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }
    this.a.add(a(8, paramInt1, paramInt2, null));
    this.h |= 0x8;
    if (this.a.size() == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  boolean a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.add(a(4, paramInt1, paramInt2, paramObject));
    this.h |= 0x4;
    return this.a.size() == 1;
  }
  
  int b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  void b()
  {
    this.f.a(this.a);
    int j = this.a.size();
    int i = 0;
    if (i < j)
    {
      c localc = (c)this.a.get(i);
      switch (localc.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        i += 1;
        break;
        f(localc);
        continue;
        c(localc);
        continue;
        d(localc);
        continue;
        b(localc);
      }
    }
    this.a.clear();
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    this.a.add(a(1, paramInt1, paramInt2, null));
    this.h |= 0x1;
    return this.a.size() == 1;
  }
  
  public int c(int paramInt)
  {
    int m = this.a.size();
    int k = 0;
    int i = paramInt;
    paramInt = i;
    c localc;
    if (k < m)
    {
      localc = (c)this.a.get(k);
      switch (localc.a)
      {
      default: 
        paramInt = i;
      }
    }
    for (;;)
    {
      k += 1;
      i = paramInt;
      break;
      paramInt = i;
      if (localc.b <= i)
      {
        paramInt = i + localc.d;
        continue;
        paramInt = i;
        if (localc.b <= i)
        {
          if (localc.b + localc.d > i)
          {
            paramInt = -1;
            return paramInt;
          }
          paramInt = i - localc.d;
          continue;
          if (localc.b == i)
          {
            paramInt = localc.d;
          }
          else
          {
            int j = i;
            if (localc.b < i) {
              j = i - 1;
            }
            paramInt = j;
            if (localc.d <= j) {
              paramInt = j + 1;
            }
          }
        }
      }
    }
  }
  
  void c()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      this.c.b((c)this.b.get(i));
      i += 1;
    }
    a(this.b);
    this.h = 0;
  }
  
  boolean c(int paramInt1, int paramInt2)
  {
    this.a.add(a(2, paramInt1, paramInt2, null));
    this.h |= 0x2;
    return this.a.size() == 1;
  }
  
  boolean d()
  {
    return this.a.size() > 0;
  }
  
  void e()
  {
    c();
    int j = this.a.size();
    int i = 0;
    if (i < j)
    {
      c localc = (c)this.a.get(i);
      switch (localc.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        i += 1;
        break;
        this.c.b(localc);
        this.c.c(localc.b, localc.d);
        continue;
        this.c.b(localc);
        this.c.a(localc.b, localc.d);
        continue;
        this.c.b(localc);
        this.c.a(localc.b, localc.d, localc.c);
        continue;
        this.c.b(localc);
        this.c.d(localc.b, localc.d);
      }
    }
    a(this.a);
    this.h = 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */