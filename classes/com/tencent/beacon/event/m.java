package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m
  extends com.tencent.beacon.upload.a
{
  private com.tencent.beacon.c.a.b f;
  private List<k> g;
  
  public static com.tencent.beacon.c.a.b a(Context paramContext, int paramInt, List<k> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {}
    for (;;)
    {
      return null;
      try
      {
        com.tencent.beacon.e.b.b(" current size:" + paramList.size(), new Object[0]);
        paramList = b(paramList);
        if (paramList != null)
        {
          paramList = paramList.a();
          if (paramList != null)
          {
            paramContext = a(paramContext, paramInt, paramList);
            return paramContext;
          }
        }
      }
      catch (Throwable paramContext)
      {
        paramContext.printStackTrace();
        com.tencent.beacon.e.b.d(" RealTimeRecordUploadDatas.encode2EventRecordPackage error}", new Object[0]);
      }
    }
    return null;
  }
  
  private void a(com.tencent.beacon.c.a.b paramb)
  {
    try
    {
      this.f = paramb;
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  private void a(List<k> paramList)
  {
    try
    {
      this.g = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  private static com.tencent.beacon.c.b.b b(List<k> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      return null;
    }
    com.tencent.beacon.c.b.b localb;
    try
    {
      localb = new com.tencent.beacon.c.b.b();
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        com.tencent.beacon.c.b.a locala = b.e((k)paramList.next());
        if (locala != null) {
          localArrayList.add(locala);
        }
      }
      localb.a = localArrayList;
    }
    catch (Throwable paramList)
    {
      paramList.printStackTrace();
      return null;
    }
    com.tencent.beacon.e.b.b(" RealTimeRecordUploadDatas.encode2EventRecordPackage() end}", new Object[0]);
    return localb;
  }
  
  private List<k> g()
  {
    try
    {
      List localList = this.g;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.beacon.c.a.b a()
  {
    return null;
  }
  
  public final void b(boolean paramBoolean)
  {
    a(null);
    List localList = g();
    a(null);
    if (localList != null)
    {
      if (!paramBoolean)
      {
        com.tencent.beacon.e.b.b(" isHandled false , record to db}", new Object[0]);
        h.a(null, localList);
      }
      localList.clear();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */