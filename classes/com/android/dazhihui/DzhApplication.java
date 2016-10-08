package com.android.dazhihui;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.support.multidex.MultiDexApplication;
import android.util.Log;
import com.android.dazhihui.b.b;
import com.android.dazhihui.service.DzhService;
import com.android.dazhihui.service.x;
import com.android.dazhihui.ui.model.CrashHandler;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.iflytek.cloud.SpeechUtility;
import com.tencent.avsdk.UserilvbManager;

public class DzhApplication
  extends MultiDexApplication
{
  private static final String a = DzhApplication.class.getSimpleName();
  private static DzhApplication b = null;
  private Intent c;
  private ServiceConnection d;
  private x e;
  private Handler f = null;
  
  public static DzhApplication a()
  {
    return b;
  }
  
  public com.android.dazhihui.c.b.a b()
  {
    return com.android.dazhihui.c.b.a.a(this);
  }
  
  public void c()
  {
    this.c = new Intent(this, DzhService.class);
    this.c.setAction("com.android.dazhihui.service.DzhService.start");
    this.d = new a(this);
  }
  
  public void d()
  {
    try
    {
      unbindService(this.d);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Log.e(a, "Service wasn't bound!");
    }
  }
  
  public void e()
  {
    bindService(this.c, this.d, 1);
  }
  
  public void f()
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  public void g()
  {
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public Handler h()
  {
    try
    {
      if (this.f == null) {
        this.f = new Handler(getMainLooper());
      }
      Handler localHandler = this.f;
      return localHandler;
    }
    finally {}
  }
  
  public void i()
  {
    d();
    StockChartPager.b();
    b.a().e();
    g.a().f(false);
    RightTopManager.getInstance().clearData();
    com.android.dazhihui.a.g.a().c = false;
    UserilvbManager.getInstance().onExitApp();
  }
  
  public void onCreate()
  {
    super.onCreate();
    b = this;
    DzhService.a(this);
    c();
    e();
    if (!g.a().L()) {
      Thread.setDefaultUncaughtExceptionHandler(new CrashHandler(this));
    }
    ThinkiveInitializer.getInstance().initialze(this);
    SpeechUtility.createUtility(this, "appid=" + getString(2131165262));
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\DzhApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */