package com.baidu.location.h;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class c
  implements LocationListener
{
  private c(a parama) {}
  
  public void onLocationChanged(Location paramLocation)
  {
    a.a(this.a, System.currentTimeMillis());
    a.a(this.a, true);
    a.b(this.a, paramLocation);
    a.b(this.a, false);
  }
  
  public void onProviderDisabled(String paramString)
  {
    a.b(this.a, null);
    a.a(this.a, false);
  }
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      a.b(this.a, null);
      a.a(this.a, false);
      return;
    case 1: 
      a.b(this.a, System.currentTimeMillis());
      a.b(this.a, true);
      a.a(this.a, false);
      return;
    }
    a.b(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */