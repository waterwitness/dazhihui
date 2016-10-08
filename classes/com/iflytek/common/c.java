package com.iflytek.common;

import android.util.Log;
import com.iflytek.thirdparty.aJ;

final class c
{
  static aJ a;
  
  protected static aJ a()
  {
    if (a != null) {
      return a;
    }
    try
    {
      aJ localaJ = (aJ)Class.forName("com.iflytek.common.push.impl.PushImpl").newInstance();
      a = localaJ;
      if (localaJ != null)
      {
        localaJ = a;
        return localaJ;
      }
    }
    catch (Exception localException)
    {
      Log.e("PushFactory", "getPushInstance not found push instance.");
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\common\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */