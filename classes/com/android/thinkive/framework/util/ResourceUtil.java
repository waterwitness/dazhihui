package com.android.thinkive.framework.util;

import android.content.Context;
import android.content.res.Resources;

public class ResourceUtil
{
  public static int getResourceID(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getResources().getIdentifier(paramString2, paramString1, paramContext.getPackageName());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\ResourceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */