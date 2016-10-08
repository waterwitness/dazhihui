package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

final class IdentityPhotoView$4$1
  implements Camera.AutoFocusCallback
{
  IdentityPhotoView$4$1(IdentityPhotoView.4 param4) {}
  
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    if (paramBoolean) {
      IdentityPhotoView.a = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\IdentityPhotoView$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */