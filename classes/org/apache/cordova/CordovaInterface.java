package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import java.util.concurrent.ExecutorService;

public abstract interface CordovaInterface
{
  public abstract Activity getActivity();
  
  public abstract ExecutorService getThreadPool();
  
  public abstract Object onMessage(String paramString, Object paramObject);
  
  public abstract void setActivityResultCallback(CordovaPlugin paramCordovaPlugin);
  
  public abstract void startActivityForResult(CordovaPlugin paramCordovaPlugin, Intent paramIntent, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\CordovaInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */