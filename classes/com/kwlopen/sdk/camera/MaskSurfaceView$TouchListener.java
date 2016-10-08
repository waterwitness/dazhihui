package com.kwlopen.sdk.camera;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class MaskSurfaceView$TouchListener
  implements View.OnTouchListener
{
  private static final int MODE_INIT = 0;
  private static final int MODE_ZOOM = 1;
  private int mode = 0;
  private float startDis;
  
  private MaskSurfaceView$TouchListener(MaskSurfaceView paramMaskSurfaceView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    do
    {
      return true;
      this.mode = 0;
      return true;
      this.mode = 1;
      this.startDis = MaskSurfaceView.access$1(this.this$0, paramMotionEvent);
      return true;
    } while (this.mode == 1);
    paramView = new Point((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    CameraHelper.getInstance().onFocus(paramView, MaskSurfaceView.access$2(this.this$0));
    MaskSurfaceView.access$0(this.this$0).startFocus(paramView);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\MaskSurfaceView$TouchListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */