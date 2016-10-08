package com.payeco.android.plugin.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Looper;

final class b
  implements LocationListener
{
  private b(LBSTool paramLBSTool) {}
  
  public final void onLocationChanged(Location paramLocation)
  {
    LBSTool.b(this.cn);
    try
    {
      synchronized (LBSTool.c(this.cn))
      {
        LBSTool.a(this.cn, paramLocation.getLatitude(), paramLocation.getLongitude());
        LBSTool.d(this.cn).quit();
        LBSTool.c(this.cn).notify();
        return;
      }
      return;
    }
    catch (Exception paramLocation)
    {
      paramLocation.printStackTrace();
    }
  }
  
  public final void onProviderDisabled(String paramString) {}
  
  public final void onProviderEnabled(String paramString) {}
  
  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */