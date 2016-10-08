package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class EditPhotoView$7
  implements Camera.AutoFocusCallback
{
  EditPhotoView$7(EditPhotoView paramEditPhotoView) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    paramCamera.takePicture(EditPhotoView.e(this.a), EditPhotoView.f(this.a), EditPhotoView.g(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\EditPhotoView$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */