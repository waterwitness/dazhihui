package com.thinkive.mobile.account.tools;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.widget.Button;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.mobile.account.activitys.PhotographActivity;
import e;

final class EditPhotoView$3
  implements Camera.PictureCallback
{
  EditPhotoView$3(EditPhotoView paramEditPhotoView) {}
  
  public final void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    paramCamera = (Button)((Activity)EditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(EditPhotoView.a(this.a), "id", "btn_photo_ok"));
    Button localButton1 = (Button)((Activity)EditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(EditPhotoView.a(this.a), "id", "btn_photo_cancel"));
    Button localButton2 = (Button)((Activity)EditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(EditPhotoView.a(this.a), "id", "btn_get_photo"));
    localButton2.setVisibility(4);
    localButton2.setEnabled(true);
    paramCamera.setVisibility(0);
    localButton1.setVisibility(0);
    if (!PhotographActivity.a.equals("3"))
    {
      paramCamera.setBackgroundResource(ResourceUtil.getResourceID(EditPhotoView.a(this.a), "drawable", "fxc_kh_ok_land_draw"));
      localButton1.setBackgroundResource(ResourceUtil.getResourceID(EditPhotoView.a(this.a), "drawable", "fxc_kh_cancel_land_draw_selector"));
    }
    e.b();
    e.a(paramArrayOfByte);
    EditPhotoView.b(this.a).stopPreview();
    System.gc();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\EditPhotoView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */