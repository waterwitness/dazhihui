package com.android.thinkive.framework.compatible;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class DialogFrame$6
  implements DialogInterface.OnMultiChoiceClickListener
{
  DialogFrame$6(DialogFrame paramDialogFrame, CallBack paramCallBack) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean)
  {
    this.val$listener.handler(new Object[] { DialogFrame.access$0(this.this$0), Integer.valueOf(7974916), paramDialogInterface, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\DialogFrame$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */