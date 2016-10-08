package com.iflytek.cloud.util;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class Accelerometer
{
  private static Accelerometer.CLOCKWISE_ANGLE c;
  private SensorManager a = null;
  private boolean b = false;
  private SensorEventListener d = new Accelerometer.1(this);
  
  public Accelerometer(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    c = Accelerometer.CLOCKWISE_ANGLE.Deg0;
  }
  
  public static int getDirection()
  {
    return c.getValue();
  }
  
  public void start()
  {
    if (this.b) {
      return;
    }
    this.b = true;
    c = Accelerometer.CLOCKWISE_ANGLE.Deg0;
    this.a.registerListener(this.d, this.a.getDefaultSensor(1), 3);
  }
  
  public void stop()
  {
    if (!this.b) {
      return;
    }
    this.b = false;
    this.a.unregisterListener(this.d);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\Accelerometer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */