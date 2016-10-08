package com.thinkive.mobile.account.activitys;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.thinkive.framework.ThinkiveInitializer;

final class FacePhotographActivity$10
  implements DialogInterface.OnClickListener
{
  FacePhotographActivity$10(FacePhotographActivity paramFacePhotographActivity) {}
  
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */