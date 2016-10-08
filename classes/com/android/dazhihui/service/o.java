package com.android.dazhihui.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.aq;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.model.stock.RightTopManager;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.w;
import com.d.a.c.bu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

class o
  extends Handler
{
  WeakReference<DzhPushService> a;
  
  o(DzhPushService paramDzhPushService)
  {
    this.a = new WeakReference(paramDzhPushService);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = (DzhPushService)this.a.get();
    if (localObject1 == null) {}
    do
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              return;
              if (paramMessage.what == DzhPushService.l)
              {
                ((DzhPushService)localObject1).c();
                return;
              }
              if (paramMessage.what == DzhPushService.m)
              {
                DzhPushService.c((DzhPushService)localObject1);
                return;
              }
              if (paramMessage.what == DzhPushService.o)
              {
                ((DzhPushService)localObject1).b();
                return;
              }
              int i;
              if (paramMessage.what == DzhPushService.n)
              {
                localObject2 = (s)paramMessage.obj;
                i = paramMessage.arg1;
                if (localObject2 != null)
                {
                  if (i == 0)
                  {
                    a.c().a((Context)localObject1, ((s)localObject2).a(), false);
                    return;
                  }
                  a.c().a((Context)localObject1, ((s)localObject2).a(), true);
                }
              }
              else
              {
                if (paramMessage.what == DzhPushService.q)
                {
                  localObject2 = (String)paramMessage.obj;
                  paramMessage = d.a();
                  String str = paramMessage.b("new_reply_my_bbs_vs");
                  if ((localObject2 == null) || ((str != null) && (localObject2 != null) && (Long.parseLong(str) >= Long.parseLong((String)localObject2))))
                  {
                    paramMessage.g();
                    return;
                  }
                  paramMessage.a("new_reply_my_bbs", 1);
                  paramMessage.a("new_reply_my_bbs_vs", (String)localObject2);
                  paramMessage.g();
                  paramMessage = "";
                  if (w.a().l()) {
                    paramMessage = w.a().f();
                  }
                  localObject1 = ((DzhPushService)localObject1).getSharedPreferences("DzhPush", 0);
                  i = ((SharedPreferences)localObject1).getInt("MY_BBS" + paramMessage, 0);
                  ((SharedPreferences)localObject1).edit().putInt("MY_BBS" + paramMessage, i + 1).commit();
                  ah.a().a(16, (String)localObject2);
                  return;
                }
                if (paramMessage.what != DzhPushService.r) {
                  break;
                }
                localObject1 = (String)paramMessage.obj;
                i = paramMessage.arg1;
                paramMessage = DzhPushService.h().iterator();
                while (paramMessage.hasNext()) {
                  ((t)paramMessage.next()).a((String)localObject1, 0, i);
                }
              }
            }
            if (paramMessage.what != DzhPushService.s) {
              break;
            }
          } while (DzhPushService.D == null);
          DzhPushService.D.a(null, 1, DzhPushService.P);
          return;
          if (paramMessage.what != DzhPushService.p) {
            break;
          }
          if (DzhPushService.a == null)
          {
            DzhPushService.c((DzhPushService)localObject1);
            return;
          }
          paramMessage = (String)paramMessage.obj;
          Object localObject2 = DzhPushService.a((DzhPushService)localObject1, 1, paramMessage);
          if (localObject2 != null) {
            DzhPushService.a.a((String)localObject2);
          }
          paramMessage = DzhPushService.a((DzhPushService)localObject1, 0, paramMessage);
        } while (paramMessage == null);
        DzhPushService.a.a(paramMessage);
        return;
        if (paramMessage.what == DzhPushService.t)
        {
          paramMessage = (String)paramMessage.obj;
          localObject1 = d.a();
          ((d)localObject1).a("circlepointflag", 1);
          ((d)localObject1).g();
          ah.a().a(18, paramMessage);
          return;
        }
        if (paramMessage.what == DzhPushService.u)
        {
          aq.a((Context)localObject1, (String)paramMessage.obj);
          return;
        }
        if (paramMessage.what == DzhPushService.v)
        {
          paramMessage = (HotVideoVo)paramMessage.obj;
          RightTopManager.getInstance().setData(paramMessage);
          return;
        }
        if (paramMessage.what != DzhPushService.x) {
          break;
        }
        paramMessage = (HotVideoVo)paramMessage.obj;
      } while (DzhPushService.E == null);
      DzhPushService.E.a(paramMessage);
      return;
      if (paramMessage.what == DzhPushService.w)
      {
        n.f("pushService", "name --------->");
        ((DzhPushService)localObject1).a((ArrayList)paramMessage.obj);
        return;
      }
      if (paramMessage.what == DzhPushService.y)
      {
        DzhPushService.h((DzhPushService)localObject1, (String)paramMessage.obj);
        return;
      }
    } while (paramMessage.what != DzhPushService.z);
    DzhPushService.i((DzhPushService)localObject1, (String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */