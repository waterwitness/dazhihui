package com.thinkive.mobile.account.tools;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import e;

final class IdentityPhotoView$3
  implements Camera.PictureCallback
{
  IdentityPhotoView$3(IdentityPhotoView paramIdentityPhotoView) {}
  
  public final void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    e.b();
    e.a(paramArrayOfByte);
    IdentityPhotoView.a(this.a).stopPreview();
    System.gc();
    paramArrayOfByte = new Intent();
    paramArrayOfByte.setAction("com.thinkive.mobile.takephoto");
    IdentityPhotoView.b(this.a).sendBroadcast(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\IdentityPhotoView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */