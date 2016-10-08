package com.thinkive.mobile.account.tools;

import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class IdentityPhotoView$4
  implements View.OnTouchListener
{
  IdentityPhotoView$4(IdentityPhotoView paramIdentityPhotoView) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (IdentityPhotoView.a(this.a) != null) {}
    try
    {
      IdentityPhotoView.a(this.a).autoFocus(new IdentityPhotoView.4.1(this));
      return false;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\IdentityPhotoView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */