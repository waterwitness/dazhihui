package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class EditPhotoView$4
  implements View.OnTouchListener
{
  EditPhotoView$4(EditPhotoView paramEditPhotoView) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (EditPhotoView.b(this.a) != null) {}
    try
    {
      EditPhotoView.b(this.a).autoFocus(new EditPhotoView.4.1(this));
      return false;
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\EditPhotoView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */