package com.payeco.android.plugin;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.payeco.android.plugin.util.LBSTool;

final class g
  implements LocationListener
{
  private g(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void onLocationChanged(Location paramLocation)
  {
    PayecoOrderDetailActivity.f(this.J);
    try
    {
      synchronized (PayecoOrderDetailActivity.g(this.J))
      {
        double d1 = paramLocation.getLatitude();
        double d2 = paramLocation.getLongitude();
        String str = LBSTool.getAddress(PayecoOrderDetailActivity.h(this.J), d1, d2);
        paramLocation = str;
        if (TextUtils.isEmpty(str))
        {
          paramLocation = this.J;
          paramLocation = PayecoOrderDetailActivity.b(d1, d2);
        }
        if (paramLocation != null)
        {
          PayecoOrderDetailActivity.a(this.J, new i(this.J));
          PayecoOrderDetailActivity.i(this.J).K = d1;
          PayecoOrderDetailActivity.i(this.J).L = d2;
          PayecoOrderDetailActivity.i(this.J).M = paramLocation;
          PayecoOrderDetailActivity.j(this.J).quit();
          PayecoOrderDetailActivity.g(this.J).notify();
          return;
        }
        Log.e("payeco", "---GPS出错");
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */