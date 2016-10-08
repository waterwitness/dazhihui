package com.thinkive.android.widget;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import bu;

final class OpenPhotoView$3
  implements Camera.PictureCallback
{
  OpenPhotoView$3(OpenPhotoView paramOpenPhotoView) {}
  
  public final void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    this.a.a();
    if (OpenPhotoView.a(this.a) != null) {
      OpenPhotoView.a(this.a).a(paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\widget\OpenPhotoView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */