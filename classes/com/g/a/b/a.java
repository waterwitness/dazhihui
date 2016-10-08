package com.g.a.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.g.a.b.b.d;
import com.g.a.c.e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a
{
  @TargetApi(11)
  private static int a(ActivityManager paramActivityManager)
  {
    return paramActivityManager.getLargeMemoryClass();
  }
  
  public static com.g.a.a.a.a a(Context paramContext, com.g.a.a.a.b.a parama, long paramLong, int paramInt)
  {
    File localFile = b(paramContext);
    if ((paramLong > 0L) || (paramInt > 0))
    {
      Object localObject = com.g.a.c.h.b(paramContext);
      try
      {
        localObject = new com.g.a.a.a.a.a.h((File)localObject, localFile, parama, paramLong, paramInt);
        return (com.g.a.a.a.a)localObject;
      }
      catch (IOException localIOException)
      {
        e.a(localIOException);
      }
    }
    return new com.g.a.a.a.a.b(com.g.a.c.h.a(paramContext), localFile, parama);
  }
  
  public static com.g.a.a.b.b a(Context paramContext, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0)
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      paramInt = localActivityManager.getMemoryClass();
      if ((!d()) || (!c(paramContext))) {
        break label56;
      }
      paramInt = a(localActivityManager);
    }
    label56:
    for (;;)
    {
      i = paramInt * 1048576 / 8;
      return new com.g.a.a.b.a.b(i);
    }
  }
  
  public static d a(boolean paramBoolean)
  {
    return new com.g.a.b.b.a(paramBoolean);
  }
  
  public static com.g.a.b.d.c a(Context paramContext)
  {
    return new com.g.a.b.d.a(paramContext);
  }
  
  public static Executor a()
  {
    return Executors.newCachedThreadPool(a(5, "uil-pool-d-"));
  }
  
  public static Executor a(int paramInt1, int paramInt2, com.g.a.b.a.h paramh)
  {
    int i;
    if (paramh == com.g.a.b.a.h.b)
    {
      i = 1;
      if (i == 0) {
        break label52;
      }
    }
    label52:
    for (paramh = new com.g.a.b.a.a.c();; paramh = new LinkedBlockingQueue())
    {
      paramh = (BlockingQueue)paramh;
      return new ThreadPoolExecutor(paramInt1, paramInt1, 0L, TimeUnit.MILLISECONDS, paramh, a(paramInt2, "uil-pool-"));
      i = 0;
      break;
    }
  }
  
  private static ThreadFactory a(int paramInt, String paramString)
  {
    return new b(paramInt, paramString);
  }
  
  public static com.g.a.a.a.b.a b()
  {
    return new com.g.a.a.a.b.b();
  }
  
  private static File b(Context paramContext)
  {
    paramContext = com.g.a.c.h.a(paramContext, false);
    File localFile = new File(paramContext, "uil-images");
    if ((localFile.exists()) || (localFile.mkdir())) {
      paramContext = localFile;
    }
    return paramContext;
  }
  
  public static com.g.a.b.c.a c()
  {
    return new com.g.a.b.c.b();
  }
  
  @TargetApi(11)
  private static boolean c(Context paramContext)
  {
    return (paramContext.getApplicationInfo().flags & 0x100000) != 0;
  }
  
  private static boolean d()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */