package com.baidu.location;

import android.util.Log;
import com.baidu.location.d.a;

public abstract class e
{
  public double a = Double.MIN_VALUE;
  public double b = Double.MIN_VALUE;
  public float c = 0.0F;
  public float d = 0.0F;
  public String e = null;
  public double f = Double.MIN_VALUE;
  public double g = Double.MIN_VALUE;
  public int h = 0;
  public boolean i = false;
  public a j = null;
  
  public void a(BDLocation paramBDLocation, float paramFloat)
  {
    Log.d("baidu_location_service", "new location, not far from the destination..." + paramFloat);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */