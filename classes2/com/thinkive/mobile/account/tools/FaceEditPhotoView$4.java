package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class FaceEditPhotoView$4
  implements View.OnTouchListener
{
  FaceEditPhotoView$4(FaceEditPhotoView paramFaceEditPhotoView) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (FaceEditPhotoView.b(this.a) != null) {}
    try
    {
      FaceEditPhotoView.b(this.a).autoFocus(new FaceEditPhotoView.4.1(this));
      return false;
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\FaceEditPhotoView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */