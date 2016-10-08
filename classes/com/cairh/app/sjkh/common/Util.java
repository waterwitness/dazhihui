package com.cairh.app.sjkh.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util
{
  public static boolean checkMobileNumber(String paramString)
  {
    try
    {
      boolean bool = Pattern.compile("^(1[34578])\\d{9}$").matcher(paramString.trim()).matches();
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static Map<String, String> getNetInfo(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    localHashMap.put("type", String.valueOf(paramContext.getType()));
    localHashMap.put("extraInfo", paramContext.getExtraInfo());
    localHashMap.put("typeName", paramContext.getTypeName());
    localHashMap.put("state", paramContext.getState().toString());
    localHashMap.put("isConnectedOrConnecting", String.valueOf(paramContext.isConnectedOrConnecting()));
    localHashMap.put("isAvailable", String.valueOf(paramContext.isAvailable()));
    return localHashMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\common\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */