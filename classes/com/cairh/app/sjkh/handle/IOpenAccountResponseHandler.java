package com.cairh.app.sjkh.handle;

import android.content.Context;
import java.util.HashMap;

public abstract interface IOpenAccountResponseHandler
{
  public abstract void faultHandler(Context paramContext, HashMap<String, Object> paramHashMap);
  
  public abstract void resultHandler(Context paramContext, HashMap<String, Object> paramHashMap);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\handle\IOpenAccountResponseHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */