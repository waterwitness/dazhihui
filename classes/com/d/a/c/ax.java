package com.d.a.c;

import com.d.a.a.e;
import com.d.a.af;
import com.d.a.ao;
import com.d.a.aw;
import com.d.a.bo;
import com.d.a.c.a.a;
import com.d.a.c.c.d;

public class ax
  extends bt
{
  public void a(q paramq)
  {
    bn localbn = bn.a(paramq.c);
    if ((localbn != null) && (localbn != bn.a) && (localbn != bn.b)) {}
    while (!(paramq.f.h_() instanceof d)) {
      return;
    }
    paramq.f.h_().a();
  }
  
  public boolean a(n paramn)
  {
    Object localObject1 = bn.a(paramn.c);
    if ((localObject1 != null) && (localObject1 != bn.a) && (localObject1 != bn.b)) {
      return super.a(paramn);
    }
    localObject1 = paramn.j;
    Object localObject2 = paramn.j.g();
    if (localObject2 != null)
    {
      if (((a)localObject2).b() < 0) {
        break label178;
      }
      ((u)localObject1).e().a("Content-Length", String.valueOf(((a)localObject2).b()));
      paramn.f.a(paramn.e);
    }
    for (;;)
    {
      localObject2 = ((u)localObject1).a().toString();
      localObject2 = ((u)localObject1).e().e((String)localObject2);
      ((u)localObject1).b("\n" + (String)localObject2);
      bo.a(paramn.e, ((String)localObject2).getBytes(), paramn.g);
      localObject1 = new ay(this, paramn);
      localObject2 = new aw();
      paramn.e.a((e)localObject2);
      ((aw)localObject2).a((com.d.a.ax)localObject1);
      return true;
      label178:
      if ("close".equals(((u)localObject1).e().a("Connection")))
      {
        paramn.f.a(paramn.e);
      }
      else
      {
        ((u)localObject1).e().a("Transfer-Encoding", "Chunked");
        paramn.f.a(new d(paramn.e));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */