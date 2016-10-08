package com.thinkive.mobile.account.tools;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.thinkive.mobile.account.activitys.FacePhotographActivity;

final class FaceEditPhotoView$5
  implements SurfaceHolder.Callback
{
  FaceEditPhotoView$5(FaceEditPhotoView paramFaceEditPhotoView) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (FacePhotographActivity.c.equals("3"))
    {
      this.a.a(FaceEditPhotoView.c(this.a));
      return;
    }
    this.a.a(FaceEditPhotoView.d(this.a));
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\FaceEditPhotoView$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */