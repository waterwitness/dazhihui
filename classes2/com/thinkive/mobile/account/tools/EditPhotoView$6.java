package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class EditPhotoView$6
  implements Camera.AutoFocusCallback
{
  EditPhotoView$6(EditPhotoView paramEditPhotoView) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    if (paramBoolean) {
      EditPhotoView.a = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\EditPhotoView$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */