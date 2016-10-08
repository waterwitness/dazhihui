package com.payeco.android.plugin.http.async;

import android.app.Dialog;
import android.os.AsyncTask;
import android.util.Log;

final class a
  extends AsyncTask
{
  private Exception bx = null;
  
  a(Dialog paramDialog, boolean paramBoolean, AsyncCallable paramAsyncCallable, AsyncCallback paramAsyncCallback1, AsyncCallback paramAsyncCallback2) {}
  
  private Object j()
  {
    try
    {
      Object localObject = this.bz.call();
      return localObject;
    }
    catch (Exception localException)
    {
      this.bx = localException;
    }
    return null;
  }
  
  public final void onPostExecute(Object paramObject)
  {
    try
    {
      if (this.be != null) {
        this.be.dismiss();
      }
      if (isCancelled()) {
        this.bx = new Exception("cancel http request");
      }
      if (this.bx == null)
      {
        this.bA.onCallback(paramObject);
        super.onPostExecute(paramObject);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("Error", localException.toString());
        continue;
        if (this.bB == null)
        {
          if (this.bx != null) {
            Log.e("Error", this.bx.toString());
          }
        }
        else
        {
          Log.e("Error", this.bx.toString());
          this.bB.onCallback(this.bx);
        }
      }
    }
  }
  
  public final void onPreExecute()
  {
    if (this.be != null) {
      this.be.show();
    }
    if ((this.by) && (this.be != null)) {
      this.be.setOnCancelListener(new b(this, this.bB));
    }
    super.onPreExecute();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\async\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */