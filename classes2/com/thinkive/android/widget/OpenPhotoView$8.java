package com.thinkive.android.widget;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class OpenPhotoView$8
  implements Camera.AutoFocusCallback
{
  OpenPhotoView$8(OpenPhotoView paramOpenPhotoView) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    paramCamera.takePicture(OpenPhotoView.e(this.a), OpenPhotoView.f(this.a), OpenPhotoView.g(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\widget\OpenPhotoView$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */