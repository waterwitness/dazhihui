package com.payeco.android.plugin.http.async;

import android.app.Dialog;

public class AsyncTaskUtil
{
  public static void doAsync(AsyncCallable paramAsyncCallable, AsyncCallback paramAsyncCallback1, AsyncCallback paramAsyncCallback2, boolean paramBoolean, Dialog paramDialog)
  {
    new a(paramDialog, paramBoolean, paramAsyncCallable, paramAsyncCallback1, paramAsyncCallback2).execute(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\async\AsyncTaskUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */