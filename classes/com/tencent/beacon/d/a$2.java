package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;

final class a$2
  implements Runnable
{
  a$2(a parama) {}
  
  public final void run()
  {
    a.d(this.a).getSharedPreferences("DENGTA_UP_QUA_META", 0);
    a.c(this.a).a(a.d(this.a).getSharedPreferences("DENGTA_UP_QUA_META", 0));
    a.b(this.a).a(Long.valueOf(((SharedPreferences)a.c(this.a).b()).getLong("common_event_calls", 0L)));
    a.a(this.a).a(Long.valueOf(((SharedPreferences)a.c(this.a).b()).getLong("real_time_event_calls", 0L)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\d\a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */