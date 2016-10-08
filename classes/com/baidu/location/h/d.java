package com.baidu.location.h;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import com.baidu.location.e.y;

class d
  implements LocationListener
{
  private long b = 0L;
  
  private d(a parama) {}
  
  public void onLocationChanged(Location paramLocation)
  {
    if (a.b(this.a)) {}
    while ((paramLocation == null) || (paramLocation.getProvider() != "gps") || (System.currentTimeMillis() - this.b < 10000L) || (!y.a(paramLocation, false))) {
      return;
    }
    this.b = System.currentTimeMillis();
    paramLocation = a.c(this.a).obtainMessage(4, paramLocation);
    a.c(this.a).sendMessage(paramLocation);
  }
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */