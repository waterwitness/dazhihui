package com.android.dazhihui.d;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.hardware.SensorManager;
import android.os.Handler;
import android.provider.Settings.System;

class ax
  extends ContentObserver
{
  public ax(av paramav, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void a()
  {
    av.f(this.a).registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this);
  }
  
  public void b()
  {
    av.f(this.a).unregisterContentObserver(this);
  }
  
  public void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    if (this.a.a(av.b(this.a)) == 1)
    {
      av.e(this.a).registerListener(av.c(this.a), av.d(this.a), 2);
      return;
    }
    av.e(this.a).unregisterListener(av.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */