package com.android.dazhihui.service;

import com.android.dazhihui.d.n;
import com.d.a.c.bu;
import com.d.a.c.j;

class f
  implements j
{
  f(DzhPushService paramDzhPushService) {}
  
  public void a(Exception paramException, bu parambu, int paramInt)
  {
    if (DzhPushService.a != null) {
      DzhPushService.a.d();
    }
    DzhPushService.a = parambu;
    if ((paramException != null) || (DzhPushService.a == null))
    {
      i = DzhPushService.m;
      if (paramException != null)
      {
        n.e("pushService", "Exception --------->" + paramException.getMessage());
        paramException.printStackTrace();
        if (paramInt == 401) {
          i = DzhPushService.o;
        }
        this.a.S.removeCallbacks(this.a.R);
        this.a.S.removeMessages(DzhPushService.l);
        this.a.S.removeMessages(DzhPushService.m);
        this.a.S.removeMessages(DzhPushService.o);
        this.a.S.removeMessages(DzhPushService.u);
        this.a.S.sendEmptyMessageDelayed(i, DzhPushService.d(this.a));
      }
    }
    while (DzhPushService.a == null) {
      for (;;)
      {
        int i;
        return;
        n.e("pushService", "Exception --------->mWebSocket == nullresposeCode:" + paramInt);
      }
    }
    paramException = DzhPushService.a(this.a, 0, "DzhAdPush");
    n.e("pushService", "mess --------->" + paramException);
    DzhPushService.a.a(paramException);
    paramException = DzhPushService.a(this.a, 0, "DzhRedPoint");
    DzhPushService.a.a(paramException);
    paramException = DzhPushService.a(this.a, 0, "DzhRpcircle");
    DzhPushService.a.a(paramException);
    paramException = DzhPushService.a(this.a, 0, "DzhHotsVideo");
    n.e("pushService", "messRedhot --------->" + paramException);
    if ((com.android.dazhihui.g.a().h()) && (!this.a.O)) {
      DzhPushService.d();
    }
    paramException = DzhPushService.a(this.a, 0, DzhPushService.h);
    DzhPushService.a.a(paramException);
    n.e("pushService", "messRedhot --------->" + paramException);
    paramException = DzhPushService.a(this.a, 0, DzhPushService.j);
    n.e("pushService", "roomOnline --------->" + paramException);
    DzhPushService.a.a(paramException);
    DzhPushService.a.a(new g(this));
    DzhPushService.a.a(new h(this));
    DzhPushService.a.a(new i(this));
    this.a.A = true;
    this.a.S.sendMessage(this.a.S.obtainMessage(DzhPushService.l));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */