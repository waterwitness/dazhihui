package com.android.thinkive.framework.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtil
{
  public static float dpToPx(Context paramContext, float paramFloat)
  {
    if (paramContext == null) {
      return -1.0F;
    }
    return paramContext.getResources().getDisplayMetrics().density * paramFloat;
  }
  
  public static DisplayMetrics getDisplayMetrics(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static float getScreenHeight(Context paramContext)
  {
    paramContext = (WindowManager)paramContext.getSystemService("window");
    Point localPoint = new Point();
    paramContext.getDefaultDisplay().getSize(localPoint);
    return localPoint.y;
  }
  
  public static float getScreenWidth(Context paramContext)
  {
    paramContext = (WindowManager)paramContext.getSystemService("window");
    Point localPoint = new Point();
    paramContext.getDefaultDisplay().getSize(localPoint);
    return localPoint.x;
  }
  
  public static float pxToDp(Context paramContext, float paramFloat)
  {
    if (paramContext == null) {
      return -1.0F;
    }
    return paramFloat / paramContext.getResources().getDisplayMetrics().density;
  }
  
  public static float pxToSp(Context paramContext, float paramFloat)
  {
    if (paramContext == null) {
      return -1.0F;
    }
    return paramFloat / paramContext.getResources().getDisplayMetrics().scaledDensity + 0.5F;
  }
  
  public static float spToPx(Context paramContext, float paramFloat)
  {
    if (paramContext == null) {
      return -1.0F;
    }
    return paramContext.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\ScreenUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */