package com.android.thinkive.framework.compatible;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;

class DialogFrame$12
  implements TimePickerDialog.OnTimeSetListener
{
  DialogFrame$12(DialogFrame paramDialogFrame, CallBack paramCallBack) {}
  
  public void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2)
  {
    this.val$listener.handler(new Object[] { DialogFrame.access$0(this.this$0), Integer.valueOf(-1), paramTimePicker, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\DialogFrame$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */