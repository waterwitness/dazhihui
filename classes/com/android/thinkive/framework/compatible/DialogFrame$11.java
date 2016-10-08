package com.android.thinkive.framework.compatible;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class DialogFrame$11
  implements DatePickerDialog.OnDateSetListener
{
  DialogFrame$11(DialogFrame paramDialogFrame, CallBack paramCallBack) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    this.val$listener.handler(new Object[] { DialogFrame.access$0(this.this$0), Integer.valueOf(-1), paramDatePicker, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\DialogFrame$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */