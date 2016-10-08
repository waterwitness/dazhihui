package com.android.thinkive.framework.util;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.widget.EditText;

public class WebViewDialogHelper
{
  private final Context context;
  private AlertDialog lastHandledDialog;
  
  public WebViewDialogHelper(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public void destroyLastDialog()
  {
    if (this.lastHandledDialog != null) {
      this.lastHandledDialog.cancel();
    }
  }
  
  public void showAlert(String paramString, WebViewDialogHelper.Result paramResult)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.context);
    localBuilder.setMessage(paramString);
    localBuilder.setTitle("Alert");
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton(17039370, new WebViewDialogHelper.1(this, paramResult));
    localBuilder.setOnCancelListener(new WebViewDialogHelper.2(this, paramResult));
    localBuilder.setOnKeyListener(new WebViewDialogHelper.3(this, paramResult));
    this.lastHandledDialog = localBuilder.show();
  }
  
  public void showConfirm(String paramString, WebViewDialogHelper.Result paramResult)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.context);
    localBuilder.setMessage(paramString);
    localBuilder.setTitle("Confirm");
    localBuilder.setCancelable(true);
    localBuilder.setPositiveButton(17039370, new WebViewDialogHelper.4(this, paramResult));
    localBuilder.setNegativeButton(17039360, new WebViewDialogHelper.5(this, paramResult));
    localBuilder.setOnCancelListener(new WebViewDialogHelper.6(this, paramResult));
    localBuilder.setOnKeyListener(new WebViewDialogHelper.7(this, paramResult));
    this.lastHandledDialog = localBuilder.show();
  }
  
  public void showPrompt(String paramString1, String paramString2, WebViewDialogHelper.Result paramResult)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.context);
    localBuilder.setMessage(paramString1);
    paramString1 = new EditText(this.context);
    if (paramString2 != null) {
      paramString1.setText(paramString2);
    }
    localBuilder.setView(paramString1);
    localBuilder.setCancelable(false);
    localBuilder.setPositiveButton(17039370, new WebViewDialogHelper.8(this, paramString1, paramResult));
    localBuilder.setNegativeButton(17039360, new WebViewDialogHelper.9(this, paramResult));
    this.lastHandledDialog = localBuilder.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\WebViewDialogHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */