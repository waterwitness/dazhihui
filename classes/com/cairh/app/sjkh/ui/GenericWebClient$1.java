package com.cairh.app.sjkh.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.WebView;
import com.cairh.app.sjkh.MainActivity;

class GenericWebClient$1
  implements DialogInterface.OnClickListener
{
  GenericWebClient$1(GenericWebClient paramGenericWebClient) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      GenericWebClient.access$0(this.this$0).finish();
      return;
    }
    GenericWebClient.access$0(this.this$0).showProgressDialog("正在加载，请稍等...");
    GenericWebClient.access$1(this.this$0).reload();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\GenericWebClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */