package com.payeco.android.plugin;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import com.payeco.android.plugin.http.async.AsyncCallable;
import com.payeco.android.plugin.http.async.AsyncCallback;
import com.payeco.android.plugin.http.async.AsyncTaskUtil;
import com.payeco.android.plugin.http.objects.PluginObject;

public class PayecoBasicActivity
  extends Activity
{
  public void doAsync(AsyncCallable paramAsyncCallable, AsyncCallback paramAsyncCallback1, AsyncCallback paramAsyncCallback2, boolean paramBoolean, Dialog paramDialog)
  {
    AsyncTaskUtil.doAsync(paramAsyncCallable, paramAsyncCallback1, paramAsyncCallback2, paramBoolean, paramDialog);
  }
  
  public void doCallBack(PluginObject paramPluginObject) {}
  
  public void doCallBack(Exception paramException) {}
  
  public void doCallBack(String paramString) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoBasicActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */