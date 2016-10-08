package com.thinkive.android.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import android.widget.Toast;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.WebViewManager;
import com.android.thinkive.framework.keyboard.KeyboardManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.module.IModule;
import com.android.thinkive.framework.module.ModuleManager;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.android.widget.BaseViewPager;

@SuppressLint({"NewApi"})
public class OpenMainActivity
  extends FragmentActivity
  implements IModule
{
  private BaseViewPager a;
  private OpenMainActivity.FragmentAdapter b;
  private long c = 0L;
  
  public void onBackPressed()
  {
    if ((KeyboardManager.getInstance() != null) && (KeyboardManager.getInstance().isShowing()))
    {
      KeyboardManager.getInstance().dismiss();
      return;
    }
    long l = System.currentTimeMillis();
    if (l - this.c > 2000L)
    {
      Toast.makeText(this, "再按一次退出开户流程", 0).show();
      this.c = l;
      return;
    }
    this.c = 0L;
    ThinkiveInitializer.getInstance().clearActivityStack();
    WebViewManager.getInstance().release();
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_activity_main"));
    if (Build.VERSION.SDK_INT >= 19) {
      WebView.setWebContentsDebuggingEnabled(true);
    }
    ModuleManager.getInstance().registerModule(this);
    this.a = ((BaseViewPager)findViewById(ResourceUtil.getResourceID(this, "id", "viewpager")));
    this.b = new OpenMainActivity.FragmentAdapter(this, getSupportFragmentManager());
    paramBundle = new OpenWebFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("url", getIntent().getStringExtra("url"));
    paramBundle.setArguments(localBundle);
    this.b.a(paramBundle);
    this.a.setAdapter(this.b);
    ThinkiveInitializer.getInstance().pushActivity(getClass().getName(), this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    ThinkiveInitializer.getInstance().popActivity(getClass().getName());
  }
  
  public String onMessageReceive(AppMessage paramAppMessage)
  {
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\ui\OpenMainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */