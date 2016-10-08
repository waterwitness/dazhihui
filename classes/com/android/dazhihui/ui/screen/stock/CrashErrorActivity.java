package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.dazhihui.ui.screen.BaseActivity;

public class CrashErrorActivity
  extends BaseActivity
{
  AlertDialog a;
  
  protected void init(Bundle paramBundle)
  {
    paramBundle = new View(this);
    paramBundle.setBackgroundColor(getResources().getColor(17170444));
    setContentView(paramBundle);
    for (;;)
    {
      try
      {
        i = getPackageManager().getApplicationInfo(getPackageName(), 0).flags;
        if ((i & 0x2) == 0) {
          continue;
        }
        i = 1;
      }
      catch (Exception paramBundle)
      {
        Intent localIntent;
        paramBundle.printStackTrace();
        int i = 0;
        continue;
      }
      localIntent = getIntent();
      paramBundle = null;
      if (localIntent != null) {
        paramBundle = localIntent.getStringExtra("errorMsg");
      }
      if ((TextUtils.isEmpty(paramBundle)) || (i == 0)) {
        paramBundle = "程序出错了,软件将重启!";
      }
      paramBundle = new AlertDialog.Builder(this).setTitle("提示信息").setCancelable(false).setMessage(paramBundle).setNeutralButton("我知道了", new bb(this));
      if (i != 0) {
        paramBundle.setPositiveButton("复制错误信息", new bc(this));
      }
      this.a = paramBundle.show();
      return;
      i = 0;
    }
  }
  
  protected void onFinish() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\CrashErrorActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */