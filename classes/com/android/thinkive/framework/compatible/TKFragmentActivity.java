package com.android.thinkive.framework.compatible;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.ConfigManager;

public abstract class TKFragmentActivity
  extends AppCompatActivity
{
  private TaskScheduler getTaskScheduler()
  {
    return ThinkiveInitializer.getInstance().getScheduler();
  }
  
  private void initSystemBar()
  {
    String str = ConfigManager.getInstance().getSystemConfigValue("STATUS_BAR_COLOR");
    SystemBarTintManager localSystemBarTintManager;
    if ((Build.VERSION.SDK_INT >= 19) && ((!TextUtils.isEmpty(str)) || (initStatusBarColor() != -1)))
    {
      getWindow().setFlags(67108864, 67108864);
      localSystemBarTintManager = new SystemBarTintManager(this);
      localSystemBarTintManager.setStatusBarTintEnabled(true);
      if (!TextUtils.isEmpty(str)) {
        break label81;
      }
      if (initStatusBarColor() != -1) {
        localSystemBarTintManager.setStatusBarTintResource(initStatusBarColor());
      }
    }
    return;
    label81:
    localSystemBarTintManager.setStatusBarTintColor(Color.parseColor(str));
  }
  
  protected boolean enableStatusBarColor()
  {
    return true;
  }
  
  protected abstract void findViews();
  
  protected abstract void initData();
  
  protected int initStatusBarColor()
  {
    return -1;
  }
  
  protected abstract void initViews();
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((Build.VERSION.SDK_INT >= 19) && (enableStatusBarColor())) {
      initSystemBar();
    }
    ThinkiveInitializer.getInstance().pushActivity(getClass().getName(), this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    ThinkiveInitializer.getInstance().popActivity(getClass().getName());
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public void registerListener(int paramInt, View paramView, ListenerController paramListenerController)
  {
    paramListenerController.setTaskScheduler(getTaskScheduler());
    paramListenerController.register(paramInt, paramView);
    paramListenerController.setContext(this);
  }
  
  protected abstract void setListeners();
  
  public void startTask(CallBack.SchedulerCallBack paramSchedulerCallBack)
  {
    getTaskScheduler().start(paramSchedulerCallBack);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\TKFragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */