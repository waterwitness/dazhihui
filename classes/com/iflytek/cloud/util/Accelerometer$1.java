package com.iflytek.cloud.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class Accelerometer$1
  implements SensorEventListener
{
  Accelerometer$1(Accelerometer paramAccelerometer) {}
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f2;
    if (paramSensorEvent.sensor.getType() == 1)
    {
      float f1 = paramSensorEvent.values[0];
      f2 = paramSensorEvent.values[1];
      float f3 = paramSensorEvent.values[2];
      if ((Math.abs(f1) > 3.0F) || (Math.abs(f2) > 3.0F))
      {
        if (Math.abs(f1) <= Math.abs(f2)) {
          break label87;
        }
        if (f1 <= 0.0F) {
          break label79;
        }
        Accelerometer.a(Accelerometer.CLOCKWISE_ANGLE.Deg0);
      }
    }
    return;
    label79:
    Accelerometer.a(Accelerometer.CLOCKWISE_ANGLE.Deg180);
    return;
    label87:
    if (f2 > 0.0F)
    {
      Accelerometer.a(Accelerometer.CLOCKWISE_ANGLE.Deg90);
      return;
    }
    Accelerometer.a(Accelerometer.CLOCKWISE_ANGLE.Deg270);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\Accelerometer$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */