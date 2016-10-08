package com.android.thinkive.framework.compatible;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;

public class SystemBarTintManager$SystemBarConfig
{
  private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
  private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
  private static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
  private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
  private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
  private final int mActionBarHeight;
  private final boolean mHasNavigationBar;
  private final boolean mInPortrait;
  private final int mNavigationBarHeight;
  private final int mNavigationBarWidth;
  private final float mSmallestWidthDp;
  private final int mStatusBarHeight;
  private final boolean mTranslucentNavBar;
  private final boolean mTranslucentStatusBar;
  
  private SystemBarTintManager$SystemBarConfig(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = paramActivity.getResources();
    if (localResources.getConfiguration().orientation == 1)
    {
      bool1 = true;
      this.mInPortrait = bool1;
      this.mSmallestWidthDp = getSmallestWidthDp(paramActivity);
      this.mStatusBarHeight = getInternalDimensionSize(localResources, "status_bar_height");
      this.mActionBarHeight = getActionBarHeight(paramActivity);
      this.mNavigationBarHeight = getNavigationBarHeight(paramActivity);
      this.mNavigationBarWidth = getNavigationBarWidth(paramActivity);
      if (this.mNavigationBarHeight <= 0) {
        break label116;
      }
    }
    label116:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mHasNavigationBar = bool1;
      this.mTranslucentStatusBar = paramBoolean1;
      this.mTranslucentNavBar = paramBoolean2;
      return;
      bool1 = false;
      break;
    }
  }
  
  @TargetApi(14)
  private int getActionBarHeight(Context paramContext)
  {
    int i = 0;
    if (Build.VERSION.SDK_INT >= 14)
    {
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(16843499, localTypedValue, true);
      i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramContext.getResources().getDisplayMetrics());
    }
    return i;
  }
  
  private int getInternalDimensionSize(Resources paramResources, String paramString)
  {
    int i = 0;
    int j = paramResources.getIdentifier(paramString, "dimen", "android");
    if (j > 0) {
      i = paramResources.getDimensionPixelSize(j);
    }
    return i;
  }
  
  @TargetApi(14)
  private int getNavigationBarHeight(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = j;
      if (hasNavBar(paramContext)) {
        if (!this.mInPortrait) {
          break label49;
        }
      }
    }
    label49:
    for (paramContext = "navigation_bar_height";; paramContext = "navigation_bar_height_landscape")
    {
      i = getInternalDimensionSize(localResources, paramContext);
      return i;
    }
  }
  
  @TargetApi(14)
  private int getNavigationBarWidth(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT >= 14)
    {
      i = j;
      if (hasNavBar(paramContext)) {
        i = getInternalDimensionSize(localResources, "navigation_bar_width");
      }
    }
    return i;
  }
  
  @SuppressLint({"NewApi"})
  private float getSmallestWidthDp(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics(localDisplayMetrics);
    }
    for (;;)
    {
      return Math.min(localDisplayMetrics.widthPixels / localDisplayMetrics.density, localDisplayMetrics.heightPixels / localDisplayMetrics.density);
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    }
  }
  
  @TargetApi(14)
  private boolean hasNavBar(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
    boolean bool;
    if (i != 0)
    {
      bool = localResources.getBoolean(i);
      if (!"1".equals(SystemBarTintManager.access$0())) {}
    }
    while (ViewConfiguration.get(paramContext).hasPermanentMenuKey())
    {
      return false;
      if (!"0".equals(SystemBarTintManager.access$0())) {
        break;
      }
      return true;
    }
    return true;
    return bool;
  }
  
  public int getActionBarHeight()
  {
    return this.mActionBarHeight;
  }
  
  public int getNavigationBarHeight()
  {
    return this.mNavigationBarHeight;
  }
  
  public int getNavigationBarWidth()
  {
    return this.mNavigationBarWidth;
  }
  
  public int getPixelInsetBottom()
  {
    if ((this.mTranslucentNavBar) && (isNavigationAtBottom())) {
      return this.mNavigationBarHeight;
    }
    return 0;
  }
  
  public int getPixelInsetRight()
  {
    if ((this.mTranslucentNavBar) && (!isNavigationAtBottom())) {
      return this.mNavigationBarWidth;
    }
    return 0;
  }
  
  public int getPixelInsetTop(boolean paramBoolean)
  {
    int j = 0;
    if (this.mTranslucentStatusBar) {}
    for (int i = this.mStatusBarHeight;; i = 0)
    {
      if (paramBoolean) {
        j = this.mActionBarHeight;
      }
      return j + i;
    }
  }
  
  public int getStatusBarHeight()
  {
    return this.mStatusBarHeight;
  }
  
  public boolean hasNavigtionBar()
  {
    return this.mHasNavigationBar;
  }
  
  public boolean isNavigationAtBottom()
  {
    return (this.mSmallestWidthDp >= 600.0F) || (this.mInPortrait);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\SystemBarTintManager$SystemBarConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */