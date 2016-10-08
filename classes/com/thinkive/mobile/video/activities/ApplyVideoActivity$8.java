package com.thinkive.mobile.video.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.thinkive.framework.ThinkiveInitializer;

final class ApplyVideoActivity$8
  implements DialogInterface.OnClickListener
{
  ApplyVideoActivity$8(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      ThinkiveInitializer.getInstance().exit();
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */