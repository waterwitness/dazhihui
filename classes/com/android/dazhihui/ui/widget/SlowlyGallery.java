package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class SlowlyGallery
  extends Gallery
{
  public SlowlyGallery(Context paramContext)
  {
    super(paramContext);
  }
  
  public SlowlyGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SlowlyGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    return paramMotionEvent2.getX() > paramMotionEvent1.getX();
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (a(paramMotionEvent1, paramMotionEvent2)) {}
    for (int i = 21;; i = 22)
    {
      onKeyDown(i, null);
      return true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SlowlyGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */