package com.android.dazhihui.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.p;
import com.android.dazhihui.receiver.WakeUpServiceReciver;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.SynchroType;

public class DzhService
  extends Service
{
  private z a;
  private m b;
  private w c = new w(this, null);
  private boolean d = false;
  
  private void a()
  {
    this.d = false;
    this.a = new v(this);
  }
  
  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, DzhService.class);
    localIntent.setAction("com.android.dazhihui.service.DzhService.start");
    paramContext.startService(localIntent);
  }
  
  private void b()
  {
    boolean bool2 = false;
    Object localObject = this.b.b();
    this.b.c(false);
    this.b.d(false);
    this.b.e(false);
    this.b.f(false);
    this.b.g(true);
    this.b.h(true);
    d locald = d.a();
    String str = locald.b("dispatch_address");
    if (str != null) {
      com.android.dazhihui.g.a().a(str);
    }
    com.android.dazhihui.g.a().j(locald.b("NEEDTIPUPDATE", 0));
    com.android.dazhihui.g.a().h(locald.b("NEWVERSION"));
    this.b.h(locald.c("WARNING_ID"));
    ((SelfSelectedStockManager)localObject).setSelfStockVersion(locald.d("STOCK_VERSION"));
    this.b.g(1);
    locald.a("INFO_AUTO_SHOW", 1);
    ((SelfSelectedStockManager)localObject).setNeedSynchro(locald.b("SYNCHRO_AUTO", 2));
    ((SelfSelectedStockManager)localObject).setNeedSynchroType(SelfSelectedStockManager.SynchroType.get(locald.c("SYNCHRO_AUTO_TYPE")));
    int i = locald.b("TIME_RANK", 15);
    this.b.s(i);
    int j = locald.b("TIME_KLINE", 15);
    this.b.r(j);
    int k = locald.b("TIME_MINUTE", 15);
    this.b.q(k);
    int m = locald.b("TIME_STOCK_MINE", 5);
    this.b.a(m);
    locald.a("TIME_RANK", i);
    locald.a("TIME_MINUTE", k);
    locald.a("TIME_KLINE", j);
    locald.a("TIME_STOCK_MINE", m);
    localObject = com.android.dazhihui.g.a();
    if (locald.b("PUSH_ZIXUAN_STOCK_WARN_SETTING", 1) == 1)
    {
      bool1 = true;
      ((com.android.dazhihui.g)localObject).a(bool1);
      localObject = com.android.dazhihui.g.a();
      if (locald.b("PUSH_STOCK_WARN_SETTING", 1) != 1) {
        break label630;
      }
      bool1 = true;
      label317:
      ((com.android.dazhihui.g)localObject).b(bool1);
      localObject = com.android.dazhihui.g.a();
      if (locald.b("PUSH_SELF_STOCK_SETTING", 1) != 1) {
        break label636;
      }
      bool1 = true;
      label341:
      ((com.android.dazhihui.g)localObject).c(bool1);
      localObject = com.android.dazhihui.g.a();
      if (locald.b("PUSH_BULLET_SETTING", 1) != 1) {
        break label642;
      }
      bool1 = true;
      label365:
      ((com.android.dazhihui.g)localObject).d(bool1);
      localObject = com.android.dazhihui.g.a();
      if (locald.b("PUSH_LOTTERY_SETTING", 1) != 1) {
        break label648;
      }
      bool1 = true;
      label389:
      ((com.android.dazhihui.g)localObject).e(bool1);
      if (locald.e("MESSAGEBOX_CHOICE") == null) {
        this.b.a(new byte[3]);
      }
      j = locald.c("SMSMESSAGEBOX_CHOICE");
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.b.f(i);
      com.android.dazhihui.w.a().c(locald.b("NICK_NAME"));
      this.b.e(locald.c("MARK_NAME"));
      com.android.dazhihui.g.a().f(locald.c("AUTO_LOGIN"));
      j = locald.c("MINE_MSG_FLAG");
      i = j;
      if (j == 0) {
        i = 2;
      }
      this.b.d(i);
      localObject = this.b;
      if (locald.b("FIRST_WARN", 1) != 1) {
        break label654;
      }
      bool1 = true;
      label528:
      ((m)localObject).b(bool1);
      localObject = p.a();
      this.b.a(((p)localObject).a(getApplicationContext()));
      localObject = this.b;
      if (locald.c("IS_FIRST_IN_MINUTE") != 0) {
        break label660;
      }
    }
    label630:
    label636:
    label642:
    label648:
    label654:
    label660:
    for (boolean bool1 = true;; bool1 = false)
    {
      ((m)localObject).i(bool1);
      localObject = this.b;
      bool1 = bool2;
      if (locald.c("IS_FIRST_IN_HOME") == 0) {
        bool1 = true;
      }
      ((m)localObject).j(bool1);
      this.b.k(com.android.dazhihui.c.a.b.a().a("main_page_mask_flag", true));
      locald.g();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label317;
      bool1 = false;
      break label341;
      bool1 = false;
      break label365;
      bool1 = false;
      break label389;
      bool1 = false;
      break label528;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.a;
  }
  
  public void onCreate()
  {
    super.onCreate();
    a();
    com.android.dazhihui.a.g.a().a(this);
    com.android.dazhihui.g.a().a(this);
    com.android.dazhihui.b.b.a().a(this);
    this.b = m.a();
    new a(this).close();
    b();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    registerReceiver(this.c, localIntentFilter);
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.c);
    AlarmManager localAlarmManager = (AlarmManager)getSystemService("alarm");
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this, WakeUpServiceReciver.class), 0);
    localAlarmManager.set(0, System.currentTimeMillis() + 600000L, localPendingIntent);
    this.d = false;
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if ((paramIntent != null) && (paramIntent.getAction() != null))
    {
      if (paramIntent.getAction().equals("com.android.dazhihui.service.DzhService.stop"))
      {
        stopSelf();
        return 2;
      }
      if (!paramIntent.getAction().equals("com.android.dazhihui.service.DzhService.start")) {}
    }
    return super.onStartCommand(paramIntent, 1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\DzhService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */