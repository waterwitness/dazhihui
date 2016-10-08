package com.android.dazhihui.d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class az
  implements SensorEventListener
{
  private SensorManager a = null;
  private ba b = null;
  
  public az(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
  }
  
  public void a()
  {
    this.a.registerListener(this, this.a.getDefaultSensor(1), 3);
  }
  
  public void a(ba paramba)
  {
    this.b = paramba;
  }
  
  public void b()
  {
    this.a.unregisterListener(this);
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    int i = paramSensorEvent.sensor.getType();
    paramSensorEvent = paramSensorEvent.values;
    if ((i == 1) && ((Math.abs(paramSensorEvent[0]) > 15.0F) || (Math.abs(paramSensorEvent[1]) > 15.0F) || (Math.abs(paramSensorEvent[2]) > 15.0F)) && (this.b != null)) {
      this.b.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */