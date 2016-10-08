package com.kwlopen.sdk.camera;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

class MaskSurfaceView$MSurfaceView
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  private SurfaceHolder holder = getHolder();
  
  public MaskSurfaceView$MSurfaceView(MaskSurfaceView paramMaskSurfaceView, Context paramContext)
  {
    super(paramContext);
    this.holder.setFormat(-2);
    this.holder.setType(3);
    this.holder.addCallback(this);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    CameraHelper.getInstance().openCamera(this, paramSurfaceHolder, MaskSurfaceView.access$3(this.this$0), MaskSurfaceView.access$4(this.this$0), MaskSurfaceView.access$3(this.this$0), MaskSurfaceView.access$4(this.this$0));
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    CameraHelper.getInstance().releaseCamera();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\MaskSurfaceView$MSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */