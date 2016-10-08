package com.tencent.beacon.upload;

import android.content.Context;
import com.tencent.beacon.a.b.c;
import com.tencent.beacon.a.b.e;
import com.tencent.beacon.a.f;

public final class d
  extends a
{
  private Context f = null;
  private com.tencent.beacon.c.a.b g = null;
  
  public d(Context paramContext)
  {
    super(paramContext, 0, 102);
    this.f = paramContext;
  }
  
  public final com.tencent.beacon.c.a.b a()
  {
    int i = 1;
    com.tencent.beacon.e.b.b("QIMEIUploadDatas.getUploadRequestPackage() start", new Object[0]);
    if (this.g != null) {
      return this.g;
    }
    com.tencent.beacon.b.a locala;
    try
    {
      locala = com.tencent.beacon.b.a.a(this.f);
      if (locala == null)
      {
        com.tencent.beacon.e.b.c("QIMEIInfo instance is null, return", new Object[0]);
        return null;
      }
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    for (;;)
    {
      return this.g;
      if (locala == null) {}
      int j;
      for (Object localObject1 = null;; localObject1 = localObject2)
      {
        Object localObject3 = c.a(this.c).d();
        j = 2;
        localObject2 = "*^@K#K@!";
        if (localObject3 != null)
        {
          i = ((e)localObject3).k();
          j = ((e)localObject3).l();
          localObject2 = ((e)localObject3).m();
        }
        localObject1 = com.tencent.beacon.b.a.a(((com.tencent.beacon.c.c.a)localObject1).a(), j, i, (String)localObject2);
        if (localObject1 != null) {
          break;
        }
        com.tencent.beacon.e.b.d("encodeDatasByZipAndEncry failed!", new Object[0]);
        return null;
        localObject2 = new com.tencent.beacon.c.c.a();
        localObject3 = locala.c();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).b = ((String)localObject1);
        localObject3 = locala.e();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).d = ((String)localObject1);
        localObject3 = locala.d();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).c = ((String)localObject1);
        localObject3 = locala.f();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).e = ((String)localObject1);
        localObject3 = locala.a();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).a = ((String)localObject1);
        localObject3 = locala.m();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).f = ((String)localObject1);
        localObject3 = locala.q();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).g = ((String)localObject1);
        localObject3 = locala.r();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).h = ((String)localObject1);
        localObject3 = locala.g();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).i = ((String)localObject1);
        ((com.tencent.beacon.c.c.a)localObject2).j = locala.h();
        ((com.tencent.beacon.c.c.a)localObject2).k = true;
        localObject3 = locala.p();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).l = ((String)localObject1);
        localObject3 = locala.i();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).m = ((String)localObject1);
        localObject3 = locala.j();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).n = ((String)localObject1);
        localObject3 = locala.m();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).o = ((String)localObject1);
        localObject3 = locala.k();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).p = ((String)localObject1);
        localObject3 = locala.n();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).q = ((String)localObject1);
        localObject3 = locala.l();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).r = ((String)localObject1);
        localObject3 = locala.o();
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = "";
        }
        ((com.tencent.beacon.c.c.a)localObject2).s = ((String)localObject1);
      }
      Object localObject2 = f.m();
      this.g = com.tencent.beacon.b.a.a(this.a, (f)localObject2, (byte[])localObject1, j, i);
    }
  }
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */