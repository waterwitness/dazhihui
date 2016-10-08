package com.android.dazhihui.d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Message;

public class ay
  implements SensorEventListener
{
  private Handler b;
  
  public ay(av paramav, Handler paramHandler)
  {
    this.b = paramHandler;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    paramSensorEvent = paramSensorEvent.values;
    int j = -1;
    float f1 = -paramSensorEvent[0];
    float f2 = -paramSensorEvent[1];
    float f3 = -paramSensorEvent[2];
    if ((f1 * f1 + f2 * f2) * 4.0F >= f3 * f3)
    {
      j = 90 - Math.round(57.29578F * (float)Math.atan2(-f2, f1));
      int i;
      for (;;)
      {
        i = j;
        if (j < 360) {
          break;
        }
        j -= 360;
      }
      for (;;)
      {
        j = i;
        if (i >= 0) {
          break;
        }
        i += 360;
      }
    }
    if (this.b != null) {
      this.b.obtainMessage(this.a.b, j, 0).sendToTarget();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */