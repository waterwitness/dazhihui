package com.baidu.location.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.baidu.location.BDLocation;
import com.baidu.location.b.b;
import com.baidu.location.b.q;
import com.baidu.location.f;
import com.baidu.location.h.n;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class i
{
  static final String a = "http://loc.map.baidu.com/offline_loc";
  static final String b = "com.baidu.lbs.offlinelocationprovider";
  private static Context c;
  private static i d;
  private final File e;
  private final ad f;
  private final a g;
  private final v h;
  private final s i;
  
  private i()
  {
    for (;;)
    {
      File localFile3;
      try
      {
        localFile3 = new File(c.getFilesDir(), "ofld");
        localFile1 = localFile3;
      }
      catch (Exception localException1)
      {
        File localFile1;
        Object localObject = null;
        continue;
      }
      try
      {
        if (!localFile3.exists())
        {
          localFile3.mkdir();
          localFile1 = localFile3;
        }
      }
      catch (Exception localException2)
      {
        File localFile2 = localFile3;
      }
    }
    this.e = localFile1;
    this.g = new a(this);
    this.f = new ad(this.g.a());
    this.i = new s(this, this.g.a());
    this.h = new v(this, this.g.a(), this.i.n());
  }
  
  private BDLocation a(String[] paramArrayOfString)
  {
    new BDLocation();
    ExecutorService localExecutorService = Executors.newSingleThreadExecutor();
    paramArrayOfString = (FutureTask)localExecutorService.submit(new r(this, paramArrayOfString));
    try
    {
      BDLocation localBDLocation = (BDLocation)paramArrayOfString.get(2000L, TimeUnit.MILLISECONDS);
      return localBDLocation;
    }
    catch (InterruptedException localInterruptedException)
    {
      paramArrayOfString.cancel(true);
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      paramArrayOfString.cancel(true);
      return null;
    }
    catch (TimeoutException localTimeoutException)
    {
      q.a().a("offlineLocation Timeout Exception!");
      paramArrayOfString.cancel(true);
      return null;
    }
    finally
    {
      localExecutorService.shutdown();
    }
  }
  
  public static i a()
  {
    if (d == null) {}
    try
    {
      if (d == null)
      {
        if (c == null) {
          a(f.b());
        }
        d = new i();
      }
      d.q();
      return d;
    }
    finally {}
  }
  
  public static void a(Context paramContext)
  {
    if (c == null)
    {
      c = paramContext;
      b.a().a(c);
    }
  }
  
  private static final Uri c(String paramString)
  {
    return Uri.parse(String.format("content://%s/", new Object[] { paramString }));
  }
  
  private void q()
  {
    this.i.g();
  }
  
  private boolean r()
  {
    boolean bool = false;
    String str = c.getPackageName();
    ProviderInfo localProviderInfo = c.getPackageManager().resolveContentProvider(b, 0);
    int j;
    if (localProviderInfo == null)
    {
      String[] arrayOfString = this.i.o();
      j = 0;
      if (j < arrayOfString.length)
      {
        localProviderInfo = c.getPackageManager().resolveContentProvider(arrayOfString[j], 0);
        if (localProviderInfo == null) {
          break label75;
        }
      }
    }
    for (;;)
    {
      if (localProviderInfo == null) {
        bool = true;
      }
      label75:
      while (!str.equals(localProviderInfo.packageName))
      {
        return bool;
        j += 1;
        break;
      }
      return true;
    }
  }
  
  public long a(String paramString)
  {
    return this.i.a(paramString);
  }
  
  public BDLocation a(n paramn, com.baidu.location.h.l paraml, BDLocation paramBDLocation, l paraml1, k paramk)
  {
    int j;
    if (paraml1 == l.a)
    {
      j = this.i.a();
      paraml1 = b.a().d() + "&mixMode=1";
      if (paramk != k.a) {
        break label119;
      }
    }
    label119:
    for (paramk = Boolean.valueOf(true);; paramk = Boolean.valueOf(false))
    {
      paraml = p.a(paramn, paraml, paramBDLocation, paraml1, paramk.booleanValue(), j);
      paramn = null;
      if (paraml.length > 0)
      {
        paraml = a(paraml);
        paramn = paraml;
        if (paraml != null)
        {
          paramn = paraml;
          if (paraml.h() == 67) {}
        }
      }
      return paramn;
      paraml1 = b.a().d();
      j = 0;
      break;
    }
  }
  
  public Context b()
  {
    return c;
  }
  
  File c()
  {
    return this.e;
  }
  
  public boolean d()
  {
    return this.i.h();
  }
  
  public boolean e()
  {
    return this.i.i();
  }
  
  public boolean f()
  {
    return this.i.j();
  }
  
  public boolean g()
  {
    return this.i.k();
  }
  
  public boolean h()
  {
    return this.i.m();
  }
  
  public void i()
  {
    this.f.a();
  }
  
  ad j()
  {
    return this.f;
  }
  
  v k()
  {
    return this.h;
  }
  
  s l()
  {
    return this.i;
  }
  
  public void m()
  {
    if (r()) {
      this.g.b();
    }
  }
  
  public void n() {}
  
  public double o()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
    j localj2 = j.a;
    j localj1 = localj2;
    int j;
    if (localNetworkInfo != null)
    {
      localj1 = localj2;
      if (localNetworkInfo.isConnected())
      {
        if (localNetworkInfo.getType() == 1) {
          localj2 = j.b;
        }
        localj1 = localj2;
        if (localNetworkInfo.getType() == 0)
        {
          j = localNetworkInfo.getSubtype();
          if ((j != 1) && (j != 2) && (j != 4) && (j != 7) && (j != 11)) {
            break label113;
          }
          localj1 = j.c;
        }
      }
    }
    while (localj1 == j.a)
    {
      return this.i.b();
      label113:
      if ((j == 3) || (j == 5) || (j == 6) || (j == 8) || (j == 9) || (j == 10) || (j == 12) || (j == 14) || (j == 15))
      {
        localj1 = j.d;
      }
      else
      {
        localj1 = localj2;
        if (j == 13) {
          localj1 = j.e;
        }
      }
    }
    if (localj1 == j.b) {
      return this.i.c();
    }
    if (localj1 == j.c) {
      return this.i.d();
    }
    if (localj1 == j.d) {
      return this.i.e();
    }
    if (localj1 == j.e) {
      return this.i.f();
    }
    return 0.0D;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */