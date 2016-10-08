package com.baidu.location.a;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.baidu.location.e.f;
import com.baidu.location.e.l;
import com.baidu.location.e.n;
import com.baidu.location.e.u;
import com.baidu.location.e.x;
import com.baidu.location.e.y;
import com.baidu.location.h.m;
import com.baidu.location.h.p;
import com.baidu.location.h.q;
import com.baidu.location.h.r;

public class a
  extends Service
  implements com.baidu.location.g
{
  static b a = null;
  private static long f = 0L;
  Messenger b = null;
  private Looper c;
  private HandlerThread d;
  private boolean e = false;
  
  private void a(Message paramMessage)
  {
    Log.d("baidu_location_service", "baidu location service register ...");
    f.a().a(paramMessage);
    com.baidu.location.c.i.a();
    com.baidu.location.e.i.a().c();
    com.baidu.location.e.h.b().c();
  }
  
  private void b()
  {
    com.baidu.location.h.g.a().b();
    r.a().b();
    com.baidu.location.b.b.a();
    u.b().c();
    com.baidu.location.c.e.a().b();
    com.baidu.location.e.e.a().b();
  }
  
  private void b(Message paramMessage)
  {
    f.a().b(paramMessage);
  }
  
  private void c()
  {
    com.baidu.location.h.g.a().c();
    u.b().d();
    y.e();
    f.a().b();
    l.a().b();
    if (!this.e) {
      Process.killProcess(Process.myPid());
    }
  }
  
  private void c(Message paramMessage)
  {
    f.a().c(paramMessage);
  }
  
  public double a()
  {
    return 6.119999885559082D;
  }
  
  public void a(Context paramContext)
  {
    f = System.currentTimeMillis();
    this.d = x.a();
    this.c = this.d.getLooper();
    a = new b(this, this.c);
    this.b = new Messenger(a);
    a.sendEmptyMessage(0);
    Log.d("baidu_location_service", "baidu location service start1 ..." + Process.myPid());
  }
  
  public boolean a(Intent paramIntent)
  {
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null)
    {
      com.baidu.location.b.b.f = paramIntent.getString("key");
      com.baidu.location.b.b.e = paramIntent.getString("sign");
      this.e = paramIntent.getBoolean("kill_process");
    }
    return this.b.getBinder();
  }
  
  public void onDestroy()
  {
    r.a().c();
    n.a().c();
    com.baidu.location.c.i.a().n();
    com.baidu.location.e.i.a().b();
    com.baidu.location.h.h.a().e();
    com.baidu.location.e.e.a().c();
    a.sendEmptyMessage(1);
    Log.d("baidu_location_service", "baidu location service stop ...");
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */