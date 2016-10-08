package com.cairh.app.sjkh.util;

import android.app.Activity;
import android.app.ProgressDialog;

public class ViewUtil
{
  private Activity mContext;
  public ProgressDialog progressDialog;
  
  public ViewUtil(Activity paramActivity)
  {
    this.mContext = paramActivity;
    createProgressDialog();
  }
  
  protected void createProgressDialog()
  {
    dismissProgressDialog();
    this.progressDialog = new ProgressDialog(this.mContext);
    this.progressDialog.setProgressStyle(0);
    this.progressDialog.setMessage("请稍等...");
    this.progressDialog.setCancelable(false);
  }
  
  public void dismissProgressDialog()
  {
    if ((this.progressDialog != null) && (this.progressDialog.isShowing()) && (!this.mContext.isFinishing())) {
      this.progressDialog.dismiss();
    }
  }
  
  public void showProgressDialog(String paramString)
  {
    showProgressDialog(paramString, false);
  }
  
  public void showProgressDialog(String paramString, boolean paramBoolean)
  {
    if (this.progressDialog == null) {
      createProgressDialog();
    }
    this.progressDialog.setMessage(paramString);
    this.progressDialog.setCancelable(paramBoolean);
    if ((!this.mContext.isFinishing()) && (!this.progressDialog.isShowing())) {
      this.progressDialog.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\ViewUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */