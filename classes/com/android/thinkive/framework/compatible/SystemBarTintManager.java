package com.android.thinkive.framework.compatible;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

public class SystemBarTintManager
{
  public static final int DEFAULT_TINT_COLOR = -1728053248;
  private static String sNavBarOverride;
  private final SystemBarTintManager.SystemBarConfig mConfig;
  private boolean mNavBarAvailable;
  private boolean mNavBarTintEnabled;
  private View mNavBarTintView;
  private boolean mStatusBarAvailable;
  private boolean mStatusBarTintEnabled;
  private View mStatusBarTintView;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      sNavBarOverride = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      sNavBarOverride = null;
    }
  }
  
  @TargetApi(19)
  public SystemBarTintManager(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)localWindow.getDecorView();
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19) {
      localObject = paramActivity.obtainStyledAttributes(new int[] { 16843759, 16843760 });
    }
    try
    {
      this.mStatusBarAvailable = ((TypedArray)localObject).getBoolean(0, false);
      this.mNavBarAvailable = ((TypedArray)localObject).getBoolean(1, false);
      ((TypedArray)localObject).recycle();
      localObject = localWindow.getAttributes();
      if ((0x4000000 & ((WindowManager.LayoutParams)localObject).flags) != 0) {
        this.mStatusBarAvailable = true;
      }
      if ((((WindowManager.LayoutParams)localObject).flags & 0x8000000) != 0) {
        this.mNavBarAvailable = true;
      }
      this.mConfig = new SystemBarTintManager.SystemBarConfig(paramActivity, this.mStatusBarAvailable, this.mNavBarAvailable, null);
      if (!this.mConfig.hasNavigtionBar()) {
        this.mNavBarAvailable = false;
      }
      if (this.mStatusBarAvailable) {
        setupStatusBarView(paramActivity, localViewGroup);
      }
      if (this.mNavBarAvailable) {
        setupNavBarView(paramActivity, localViewGroup);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject).recycle();
    }
  }
  
  private void setupNavBarView(Context paramContext, ViewGroup paramViewGroup)
  {
    this.mNavBarTintView = new View(paramContext);
    if (this.mConfig.isNavigationAtBottom()) {
      paramContext = new FrameLayout.LayoutParams(-1, this.mConfig.getNavigationBarHeight());
    }
    for (paramContext.gravity = 80;; paramContext.gravity = 5)
    {
      this.mNavBarTintView.setLayoutParams(paramContext);
      this.mNavBarTintView.setBackgroundColor(-1728053248);
      this.mNavBarTintView.setVisibility(8);
      paramViewGroup.addView(this.mNavBarTintView);
      return;
      paramContext = new FrameLayout.LayoutParams(this.mConfig.getNavigationBarWidth(), -1);
    }
  }
  
  private void setupStatusBarView(Context paramContext, ViewGroup paramViewGroup)
  {
    this.mStatusBarTintView = new View(paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, this.mConfig.getStatusBarHeight());
    paramContext.gravity = 48;
    if ((this.mNavBarAvailable) && (!this.mConfig.isNavigationAtBottom())) {
      paramContext.rightMargin = this.mConfig.getNavigationBarWidth();
    }
    this.mStatusBarTintView.setLayoutParams(paramContext);
    this.mStatusBarTintView.setBackgroundColor(-1728053248);
    this.mStatusBarTintView.setVisibility(8);
    paramViewGroup.addView(this.mStatusBarTintView);
  }
  
  public SystemBarTintManager.SystemBarConfig getConfig()
  {
    return this.mConfig;
  }
  
  public boolean isNavBarTintEnabled()
  {
    return this.mNavBarTintEnabled;
  }
  
  public boolean isStatusBarTintEnabled()
  {
    return this.mStatusBarTintEnabled;
  }
  
  @TargetApi(11)
  public void setNavigationBarAlpha(float paramFloat)
  {
    if ((this.mNavBarAvailable) && (Build.VERSION.SDK_INT >= 11)) {
      this.mNavBarTintView.setAlpha(paramFloat);
    }
  }
  
  public void setNavigationBarTintColor(int paramInt)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundColor(paramInt);
    }
  }
  
  public void setNavigationBarTintDrawable(Drawable paramDrawable)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setNavigationBarTintEnabled(boolean paramBoolean)
  {
    this.mNavBarTintEnabled = paramBoolean;
    View localView;
    if (this.mNavBarAvailable)
    {
      localView = this.mNavBarTintView;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void setNavigationBarTintResource(int paramInt)
  {
    if (this.mNavBarAvailable) {
      this.mNavBarTintView.setBackgroundResource(paramInt);
    }
  }
  
  @TargetApi(11)
  public void setStatusBarAlpha(float paramFloat)
  {
    if ((this.mStatusBarAvailable) && (Build.VERSION.SDK_INT >= 11)) {
      this.mStatusBarTintView.setAlpha(paramFloat);
    }
  }
  
  public void setStatusBarTintColor(int paramInt)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundColor(paramInt);
    }
  }
  
  public void setStatusBarTintDrawable(Drawable paramDrawable)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setStatusBarTintEnabled(boolean paramBoolean)
  {
    this.mStatusBarTintEnabled = paramBoolean;
    View localView;
    if (this.mStatusBarAvailable)
    {
      localView = this.mStatusBarTintView;
      if (!paramBoolean) {
        break label29;
      }
    }
    label29:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void setStatusBarTintResource(int paramInt)
  {
    if (this.mStatusBarAvailable) {
      this.mStatusBarTintView.setBackgroundResource(paramInt);
    }
  }
  
  public void setTintAlpha(float paramFloat)
  {
    setStatusBarAlpha(paramFloat);
    setNavigationBarAlpha(paramFloat);
  }
  
  public void setTintColor(int paramInt)
  {
    setStatusBarTintColor(paramInt);
    setNavigationBarTintColor(paramInt);
  }
  
  public void setTintDrawable(Drawable paramDrawable)
  {
    setStatusBarTintDrawable(paramDrawable);
    setNavigationBarTintDrawable(paramDrawable);
  }
  
  public void setTintResource(int paramInt)
  {
    setStatusBarTintResource(paramInt);
    setNavigationBarTintResource(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\SystemBarTintManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */