package com.android.dazhihui.service;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.v;
import com.android.dazhihui.w;

class k
  implements v
{
  k(DzhPushService paramDzhPushService) {}
  
  public void a(String paramString)
  {
    if (((!DzhPushService.a(this.a).equals(w.a().f())) && (w.a().l())) || (DzhPushService.b(this.a) != w.a().l()))
    {
      DzhPushService.a(this.a.getSharedPreferences("DzhPush", 0));
      DzhPushService.g().edit().putString("slotversion", "").commit();
      DzhPushService.g().edit().putString("propversion", "").commit();
      DzhPushService.H = "0";
      paramString = d.a();
      paramString.a("new_reply_my_bbs_vs", "0");
      paramString.g();
      this.a.b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */