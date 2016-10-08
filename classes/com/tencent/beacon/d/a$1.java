package com.tencent.beacon.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class a$1
  implements Runnable
{
  a$1(a parama) {}
  
  public final void run()
  {
    try
    {
      ((SharedPreferences)a.c(this.a).a()).edit().putLong("common_event_calls", ((Long)a.b(this.a).a()).longValue()).putLong("real_time_event_calls", ((Long)a.a(this.a).a()).longValue()).commit();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\d\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */