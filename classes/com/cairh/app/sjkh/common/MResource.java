package com.cairh.app.sjkh.common;

import android.content.Context;
import android.content.res.Resources;

public class MResource
{
  private static Context context;
  
  public static int getIdByName(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getResources().getIdentifier(paramString2, paramString1, paramContext.getPackageName());
  }
  
  public static int getIdByName(String paramString1, String paramString2)
  {
    return context.getResources().getIdentifier(paramString2, paramString1, context.getPackageName());
  }
  
  public static void setContext(Context paramContext)
  {
    context = paramContext;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\common\MResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */