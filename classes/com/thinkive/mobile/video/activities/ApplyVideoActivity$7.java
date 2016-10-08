package com.thinkive.mobile.video.activities;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.widget.Toast;

final class ApplyVideoActivity$7
  implements Runnable
{
  ApplyVideoActivity$7(ApplyVideoActivity paramApplyVideoActivity) {}
  
  public final void run()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= Camera.getNumberOfCameras())
        {
          if (ApplyVideoActivity.k(this.a) == null) {
            break;
          }
          ApplyVideoActivity.k(this.a).setDisplayOrientation(90);
          localObject = ApplyVideoActivity.k(this.a).getParameters();
          ApplyVideoActivity.k(this.a).setParameters((Camera.Parameters)localObject);
          ApplyVideoActivity.k(this.a).setPreviewDisplay(ApplyVideoActivity.l(this.a));
          ApplyVideoActivity.k(this.a).startPreview();
          return;
        }
        Object localObject = new Camera.CameraInfo();
        Camera.getCameraInfo(i, (Camera.CameraInfo)localObject);
        if (((Camera.CameraInfo)localObject).facing == 1) {
          ApplyVideoActivity.a(this.a, Camera.open(i));
        } else {
          i += 1;
        }
      }
      catch (Exception localException)
      {
        ApplyVideoActivity.m(this.a);
        Toast.makeText(this.a, "无法启动相机服务，请您检测下相机状态和相机权限！", 0).show();
        this.a.finish();
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */