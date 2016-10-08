package com.thinkive.mobile.account.tools;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.widget.Button;
import android.widget.TextView;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.mobile.account.activitys.FacePhotographActivity;
import e;

final class FaceEditPhotoView$3
  implements Camera.PictureCallback
{
  FaceEditPhotoView$3(FaceEditPhotoView paramFaceEditPhotoView) {}
  
  public final void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    paramCamera = (TextView)((Activity)FaceEditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(FaceEditPhotoView.a(this.a), "id", "btn_photo_ok"));
    TextView localTextView = (TextView)((Activity)FaceEditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(FaceEditPhotoView.a(this.a), "id", "btn_photo_cancel"));
    Button localButton = (Button)((Activity)FaceEditPhotoView.a(this.a)).findViewById(ResourceUtil.getResourceID(FaceEditPhotoView.a(this.a), "id", "btn_get_photo"));
    localButton.setVisibility(4);
    localButton.setEnabled(true);
    paramCamera.setVisibility(0);
    localTextView.setText("重拍");
    localTextView.setVisibility(0);
    if (!FacePhotographActivity.c.equals("3"))
    {
      paramCamera.setBackgroundResource(ResourceUtil.getResourceID(FaceEditPhotoView.a(this.a), "drawable", "fxc_kh_ok_land_draw"));
      localTextView.setBackgroundResource(ResourceUtil.getResourceID(FaceEditPhotoView.a(this.a), "drawable", "fxc_kh_cancel_land_draw_selector"));
    }
    FacePhotographActivity.e = true;
    e.b();
    e.a(paramArrayOfByte);
    FaceEditPhotoView.b(this.a).stopPreview();
    System.gc();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\FaceEditPhotoView$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */