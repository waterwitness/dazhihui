package com.android.dazhihui.ui.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class jp
  extends GestureDetector.SimpleOnGestureListener
{
  private jp(PartScrollView paramPartScrollView) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat2) >= Math.abs(paramFloat1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */