package com.cairh.app.sjkh.util;

import java.util.HashMap;

public class ErrorInfo
{
  public static String needReuploadIDCardErrorCodeList = "1100, 1101, 1102, 1103, 1200, 1201, 1300, 1301, 1302, 1303, 1304";
  public static HashMap<Integer, String> sysErrorMap = new HashMap();
  
  static
  {
    sysErrorMap.put(Integer.valueOf(5000), "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\ErrorInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */