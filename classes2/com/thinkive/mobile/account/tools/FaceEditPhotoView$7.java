package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class FaceEditPhotoView$7
  implements Camera.AutoFocusCallback
{
  FaceEditPhotoView$7(FaceEditPhotoView paramFaceEditPhotoView) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    paramCamera.takePicture(FaceEditPhotoView.e(this.a), FaceEditPhotoView.f(this.a), FaceEditPhotoView.g(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\FaceEditPhotoView$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */