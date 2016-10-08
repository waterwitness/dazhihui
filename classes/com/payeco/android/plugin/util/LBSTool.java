package com.payeco.android.plugin.util;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LBSTool
{
  private LocationData cj;
  private a ck;
  private b cl;
  private b cm;
  private Context mContext;
  private LocationManager u;
  private Looper v;
  
  public LBSTool(Context paramContext)
  {
    this.mContext = paramContext;
    this.u = ((LocationManager)this.mContext.getSystemService("location"));
  }
  
  public static String getAddress(Context paramContext, double paramDouble1, double paramDouble2)
  {
    paramContext = new Geocoder(paramContext, Locale.getDefault());
    try
    {
      Object localObject1 = paramContext.getFromLocation(paramDouble1, paramDouble2, 1);
      paramContext = new StringBuilder();
      if (((List)localObject1).size() > 0)
      {
        Object localObject2 = (Address)((List)localObject1).get(0);
        localObject1 = ((Address)localObject2).getAdminArea();
        localObject2 = ((Address)localObject2).getLocality();
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!TextUtils.isEmpty((CharSequence)localObject2))) {
          paramContext.append(((String)localObject1).substring(0, ((String)localObject1).length() - 1)).append(",").append(((String)localObject2).substring(0, ((String)localObject1).length() - 1));
        }
        paramContext = paramContext.toString();
        return paramContext;
      }
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public LocationData getLocation(long paramLong)
  {
    this.cj = null;
    this.ck = new a(this, (byte)0);
    this.ck.start();
    if (paramLong > 0L) {}
    synchronized (this.ck)
    {
      try
      {
        this.ck.wait(paramLong);
        this.ck = null;
        return this.cj;
        paramLong = 0L;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
  }
  
  public boolean isGPSEnabled()
  {
    return this.u.isProviderEnabled("gps");
  }
  
  public boolean isNetworkEnabled()
  {
    return (isWIFIEnabled()) || (isTelephonyEnabled());
  }
  
  public boolean isTelephonyEnabled()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)this.mContext.getSystemService("phone");
    return (localTelephonyManager != null) && (localTelephonyManager.getNetworkType() != 0);
  }
  
  public boolean isWIFIEnabled()
  {
    return ((WifiManager)this.mContext.getSystemService("wifi")).isWifiEnabled();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\LBSTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */