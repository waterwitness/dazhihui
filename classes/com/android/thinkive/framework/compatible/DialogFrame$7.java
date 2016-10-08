package com.android.thinkive.framework.compatible;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class DialogFrame$7
  implements DialogInterface.OnClickListener
{
  DialogFrame$7(DialogFrame paramDialogFrame, CallBack paramCallBack) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.val$listener.handler(new Object[] { DialogFrame.access$0(this.this$0), Integer.valueOf(7974913), paramDialogInterface, Integer.valueOf(paramInt) });
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\DialogFrame$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */