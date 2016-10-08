package com.cairh.app.sjkh.ui;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.cairh.app.sjkh.common.WriteLogFile;

class FaceCameraActivity$4
  implements SurfaceHolder.Callback
{
  FaceCameraActivity$4(FaceCameraActivity paramFaceCameraActivity) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      FaceCameraActivity.access$1(this.this$0);
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      paramSurfaceHolder.printStackTrace();
      WriteLogFile.witeLog("相机初始化失败...");
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (this.this$0.camera != null)
    {
      if (this.this$0.isPreview) {
        this.this$0.camera.stopPreview();
      }
      this.this$0.camera.release();
      this.this$0.camera = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\FaceCameraActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */