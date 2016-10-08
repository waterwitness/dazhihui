package com.kwlopen.sdk.activity;

import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.io.IOException;

public class CameraPreview
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  private Camera mCamera;
  private SurfaceHolder mHolder;
  
  public CameraPreview(Context paramContext)
  {
    super(paramContext);
  }
  
  public CameraPreview(Context paramContext, Camera paramCamera)
  {
    super(paramContext);
    this.mCamera = paramCamera;
    this.mHolder = getHolder();
    this.mHolder.addCallback(this);
    this.mHolder.setFormat(-2);
    this.mHolder.setType(3);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mHolder.getSurface() == null) {
      return;
    }
    try
    {
      this.mCamera.startPreview();
      return;
    }
    catch (Exception paramSurfaceHolder) {}
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      this.mCamera.setPreviewDisplay(paramSurfaceHolder);
      return;
    }
    catch (IOException paramSurfaceHolder)
    {
      Log.d("视频加载错误", "Error setting camera preview: " + paramSurfaceHolder.getMessage());
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      this.mCamera.stopPreview();
      return;
    }
    catch (Exception paramSurfaceHolder) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CameraPreview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */