package com.android.thinkive.framework.compatible;

import android.content.Context;
import android.os.Bundle;

public abstract class ResponseAction
  implements CallBack.MessageCallBack
{
  public static final short RESULT_INTERNAL_ERROR = 4;
  public static final short RESULT_NET_ERROR = 2;
  public static final short RESULT_OK = 1;
  public static final short RESULT_SERVER_ERROR = 3;
  
  public void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      onOK(paramContext, paramBundle);
      return;
    case 4: 
      onInternalError(paramContext, paramBundle);
      return;
    case 2: 
      onNetError(paramContext, paramBundle);
      return;
    }
    onServerError(paramContext, paramBundle);
  }
  
  protected abstract void onInternalError(Context paramContext, Bundle paramBundle);
  
  protected abstract void onNetError(Context paramContext, Bundle paramBundle);
  
  protected abstract void onOK(Context paramContext, Bundle paramBundle);
  
  protected abstract void onServerError(Context paramContext, Bundle paramBundle);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\ResponseAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */