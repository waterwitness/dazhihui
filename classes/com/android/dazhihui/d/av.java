package com.android.dazhihui.d;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;

public class av
{
  public static av a;
  public int b = 1000;
  private Activity c;
  private boolean d;
  private SensorManager e;
  private Sensor f;
  private ay g;
  private ax h;
  private ContentResolver i;
  private Handler j = new aw(this);
  
  private av(Context paramContext)
  {
    this.e = ((SensorManager)paramContext.getSystemService("sensor"));
    this.f = this.e.getDefaultSensor(1);
    this.g = new ay(this, this.j);
    this.i = paramContext.getContentResolver();
    this.h = new ax(this, this.j);
    this.h.a();
    this.i.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this.h);
    if (paramContext.getResources().getConfiguration().orientation == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
  
  public static av b(Context paramContext)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new av(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  public int a(Context paramContext)
  {
    try
    {
      int k = Settings.System.getInt(paramContext.getContentResolver(), "accelerometer_rotation");
      return k;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
    return 0;
  }
  
  public void a()
  {
    this.h.b();
    this.e.unregisterListener(this.g);
  }
  
  public void a(Activity paramActivity)
  {
    this.c = paramActivity;
    this.h.a();
    if (a(this.c) == 1)
    {
      this.e.registerListener(this.g, this.f, 2);
      return;
    }
    this.e.unregisterListener(this.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */