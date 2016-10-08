package com.cairh.app.sjkh.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

public abstract class BaseFileUploadCallbackActivity
  extends Activity
{
  public ProgressDialog progressDialog;
  
  protected void createProgressDialog(Context paramContext)
  {
    this.progressDialog = new ProgressDialog(paramContext);
    this.progressDialog.setProgressStyle(0);
    this.progressDialog.setCancelable(false);
  }
  
  public void dismissProgressDialog()
  {
    if ((this.progressDialog != null) && (this.progressDialog.isShowing()) && (!isFinishing())) {
      this.progressDialog.dismiss();
    }
  }
  
  public void failDo(int paramInt, String paramString) {}
  
  public void failDo(String paramString) {}
  
  public void showProgressDialog(Context paramContext, String paramString)
  {
    if (this.progressDialog == null) {
      createProgressDialog(paramContext);
    }
    this.progressDialog.setMessage(paramString);
    if (!this.progressDialog.isShowing()) {
      this.progressDialog.show();
    }
  }
  
  public void successDo(int paramInt, String paramString) {}
  
  public void successDo(String paramString) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\base\BaseFileUploadCallbackActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */