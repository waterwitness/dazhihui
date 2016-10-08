package com.iflytek.speech.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ApkInstaller
{
  private Activity mActivity;
  
  public ApkInstaller(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  private boolean processInstall(Context paramContext, String paramString1, String paramString2)
  {
    paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString1)));
    return true;
  }
  
  public void install()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mActivity);
    localBuilder.setMessage("检测到您未安装语记！\n是否前往下载语记？");
    localBuilder.setTitle("下载提示");
    localBuilder.setPositiveButton("确认前往", new ApkInstaller.1(this));
    localBuilder.setNegativeButton("残忍拒绝", new ApkInstaller.2(this));
    localBuilder.create().show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\util\ApkInstaller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */