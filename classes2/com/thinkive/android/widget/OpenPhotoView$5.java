package com.thinkive.android.widget;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

final class OpenPhotoView$5
  implements SurfaceHolder.Callback
{
  OpenPhotoView$5(OpenPhotoView paramOpenPhotoView) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    OpenPhotoView.b(this.a);
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (OpenPhotoView.c(this.a))
    {
      this.a.a(OpenPhotoView.d(this.a));
      OpenPhotoView.a(this.a, false);
    }
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\widget\OpenPhotoView$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */