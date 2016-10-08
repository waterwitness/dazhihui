package com.kwlopen.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.kwl.common.utils.LogUtil;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;

public class CordovaContext
  extends ContextWrapper
  implements CordovaInterface
{
  CordovaInterface cordova;
  
  public CordovaContext(Context paramContext, CordovaInterface paramCordovaInterface)
  {
    super(paramContext);
    this.cordova = paramCordovaInterface;
  }
  
  public Activity getActivity()
  {
    return this.cordova.getActivity();
  }
  
  public ExecutorService getThreadPool()
  {
    return this.cordova.getThreadPool();
  }
  
  public Object onMessage(String paramString, Object paramObject)
  {
    return this.cordova.onMessage(paramString, paramObject);
  }
  
  public void setActivityResultCallback(CordovaPlugin paramCordovaPlugin)
  {
    this.cordova.setActivityResultCallback(paramCordovaPlugin);
  }
  
  public void startActivityForResult(CordovaPlugin paramCordovaPlugin, Intent paramIntent, int paramInt)
  {
    LogUtil.writeLog("startActivityForResult CordovaContext");
    this.cordova.startActivityForResult(paramCordovaPlugin, paramIntent, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\CordovaContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */