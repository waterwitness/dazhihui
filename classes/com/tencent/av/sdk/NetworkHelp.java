package com.tencent.av.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class NetworkHelp
{
  protected static NetworkHelp.APInfo getAPInfo(Context paramContext)
  {
    NetworkHelp.APInfo localAPInfo = new NetworkHelp.APInfo();
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {}
    switch (localNetworkInfo.getType())
    {
    default: 
      return localAPInfo;
    case 1: 
      localAPInfo.apType = NetworkHelp.APType.AP_WIFI.value();
      localAPInfo.apName = "AP_WIFI";
      return localAPInfo;
    }
    return getMobileAPInfo(paramContext, localNetworkInfo.getSubtype());
  }
  
  private static NetworkHelp.APInfo getMobileAPInfo(Context paramContext, int paramInt)
  {
    Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
    paramContext = NetworkHelp.MobileCarrier.UNKNOWN;
    localObject = ((TelephonyManager)localObject).getSubscriberId();
    if ((((String)localObject).startsWith("46000")) || (((String)localObject).startsWith("46002")) || (((String)localObject).startsWith("46007"))) {
      paramContext = NetworkHelp.MobileCarrier.CHINA_MOBILE;
    }
    label349:
    for (;;)
    {
      localObject = new NetworkHelp.APInfo();
      switch (paramInt)
      {
      }
      do
      {
        do
        {
          do
          {
            return (NetworkHelp.APInfo)localObject;
            if ((((String)localObject).startsWith("46001")) || (((String)localObject).startsWith("46006")))
            {
              paramContext = NetworkHelp.MobileCarrier.CHINA_UNICOM;
              break;
            }
            if ((!((String)localObject).startsWith("46003")) && (!((String)localObject).startsWith("46005"))) {
              break label349;
            }
            paramContext = NetworkHelp.MobileCarrier.CHINA_TELECOM;
            break;
            ((NetworkHelp.APInfo)localObject).apType = NetworkHelp.APType.AP_2G.value();
            if (NetworkHelp.MobileCarrier.CHINA_MOBILE == paramContext)
            {
              ((NetworkHelp.APInfo)localObject).apName = "AP_CMNET";
              return (NetworkHelp.APInfo)localObject;
            }
            if (NetworkHelp.MobileCarrier.CHINA_UNICOM == paramContext)
            {
              ((NetworkHelp.APInfo)localObject).apName = "AP_UNINET";
              return (NetworkHelp.APInfo)localObject;
            }
          } while (NetworkHelp.MobileCarrier.CHINA_TELECOM != paramContext);
          ((NetworkHelp.APInfo)localObject).apName = "AP_CTNET";
          return (NetworkHelp.APInfo)localObject;
          ((NetworkHelp.APInfo)localObject).apType = NetworkHelp.APType.AP_3G.value();
          if (NetworkHelp.MobileCarrier.CHINA_MOBILE == paramContext)
          {
            ((NetworkHelp.APInfo)localObject).apName = "AP_CM3G";
            return (NetworkHelp.APInfo)localObject;
          }
          if (NetworkHelp.MobileCarrier.CHINA_UNICOM == paramContext)
          {
            ((NetworkHelp.APInfo)localObject).apName = "AP_3GNET";
            return (NetworkHelp.APInfo)localObject;
          }
        } while (NetworkHelp.MobileCarrier.CHINA_TELECOM != paramContext);
        ((NetworkHelp.APInfo)localObject).apName = "AP_CTNET";
        return (NetworkHelp.APInfo)localObject;
        ((NetworkHelp.APInfo)localObject).apType = NetworkHelp.APType.AP_4G.value();
        if (NetworkHelp.MobileCarrier.CHINA_MOBILE == paramContext)
        {
          ((NetworkHelp.APInfo)localObject).apName = "AP_CMLTE";
          return (NetworkHelp.APInfo)localObject;
        }
        if (NetworkHelp.MobileCarrier.CHINA_UNICOM == paramContext)
        {
          ((NetworkHelp.APInfo)localObject).apName = "AP_UNLTE";
          return (NetworkHelp.APInfo)localObject;
        }
      } while (NetworkHelp.MobileCarrier.CHINA_TELECOM != paramContext);
      ((NetworkHelp.APInfo)localObject).apName = "AP_CTLTE";
      return (NetworkHelp.APInfo)localObject;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\NetworkHelp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */