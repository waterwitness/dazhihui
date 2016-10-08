package com.bairuitech.anychat;

import android.content.Context;
import android.view.OrientationEventListener;

class AnyChatOrientationEventListener
  extends OrientationEventListener
{
  public AnyChatOrientationEventListener(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public void onOrientationChanged(int paramInt)
  {
    int i = 1;
    if (paramInt == -1) {
      paramInt = i;
    }
    for (;;)
    {
      AnyChatCoreSDK.SetSDKOptionInt(97, paramInt);
      return;
      if ((paramInt > 325) || (paramInt <= 45)) {
        paramInt = 5;
      } else if ((paramInt > 45) && (paramInt <= 135)) {
        paramInt = 4;
      } else if ((paramInt > 135) && (paramInt < 225)) {
        paramInt = 6;
      } else {
        paramInt = 3;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatOrientationEventListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */