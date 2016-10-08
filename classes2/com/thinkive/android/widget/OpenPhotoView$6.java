package com.thinkive.android.widget;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class OpenPhotoView$6
  implements Camera.AutoFocusCallback
{
  OpenPhotoView$6(OpenPhotoView paramOpenPhotoView) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    if (paramBoolean)
    {
      OpenPhotoView.c = true;
      paramCamera.cancelAutoFocus();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\widget\OpenPhotoView$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */