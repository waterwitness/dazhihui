package com.baidu.location.e;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class t
  implements SensorEventListener
{
  private static t d;
  private float[] a;
  private float[] b;
  private SensorManager c;
  private float e;
  private double f = Double.MIN_VALUE;
  private boolean g;
  private boolean h = false;
  private boolean i = false;
  
  public static t a()
  {
    if (d == null) {
      d = new t();
    }
    return d;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/baidu/location/e/t:i	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   18: ifnonnull +18 -> 36
    //   21: aload_0
    //   22: invokestatic 48	com/baidu/location/f:b	()Landroid/content/Context;
    //   25: ldc 50
    //   27: invokevirtual 56	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   30: checkcast 58	android/hardware/SensorManager
    //   33: putfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   36: aload_0
    //   37: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   40: ifnull +67 -> 107
    //   43: aload_0
    //   44: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   47: bipush 11
    //   49: invokevirtual 62	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   52: astore_1
    //   53: aload_1
    //   54: ifnull +21 -> 75
    //   57: aload_0
    //   58: getfield 41	com/baidu/location/e/t:g	Z
    //   61: ifeq +14 -> 75
    //   64: aload_0
    //   65: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   68: aload_0
    //   69: aload_1
    //   70: iconst_3
    //   71: invokevirtual 66	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   74: pop
    //   75: aload_0
    //   76: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   79: bipush 6
    //   81: invokevirtual 62	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull +21 -> 107
    //   89: aload_0
    //   90: getfield 31	com/baidu/location/e/t:h	Z
    //   93: ifeq +14 -> 107
    //   96: aload_0
    //   97: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   100: aload_0
    //   101: aload_1
    //   102: iconst_3
    //   103: invokevirtual 66	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   106: pop
    //   107: aload_0
    //   108: iconst_1
    //   109: putfield 33	com/baidu/location/e/t:i	Z
    //   112: goto -101 -> 11
    //   115: astore_1
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	t
    //   52	50	1	localSensor	Sensor
    //   115	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	115	finally
    //   14	36	115	finally
    //   36	53	115	finally
    //   57	75	115	finally
    //   75	85	115	finally
    //   89	107	115	finally
    //   107	112	115	finally
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/baidu/location/e/t:i	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   18: ifnull +16 -> 34
    //   21: aload_0
    //   22: getfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   25: aload_0
    //   26: invokevirtual 70	android/hardware/SensorManager:unregisterListener	(Landroid/hardware/SensorEventListener;)V
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 43	com/baidu/location/e/t:c	Landroid/hardware/SensorManager;
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 33	com/baidu/location/e/t:i	Z
    //   39: goto -28 -> 11
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	t
    //   42	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	42	finally
    //   14	34	42	finally
    //   34	39	42	finally
  }
  
  public boolean d()
  {
    return this.g;
  }
  
  public boolean e()
  {
    return this.h;
  }
  
  public float f()
  {
    return this.e;
  }
  
  public double g()
  {
    return this.f;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    switch (paramSensorEvent.sensor.getType())
    {
    default: 
    case 11: 
      do
      {
        return;
        this.a = ((float[])paramSensorEvent.values.clone());
      } while (this.a == null);
      paramSensorEvent = new float[9];
      SensorManager.getRotationMatrixFromVector(paramSensorEvent, this.a);
      float[] arrayOfFloat = new float[3];
      SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
      this.e = ((float)Math.toDegrees(arrayOfFloat[0]));
      if (this.e >= 0.0F) {}
      for (double d1 = this.e;; d1 = this.e + 360.0F)
      {
        this.e = ((float)Math.floor(d1));
        return;
      }
    }
    this.b = ((float[])paramSensorEvent.values.clone());
    this.f = SensorManager.getAltitude(1013.25F, this.b[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */