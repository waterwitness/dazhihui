package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class MyScrollView
  extends ScrollView
{
  private i a;
  private int b;
  private Handler c = new h(this);
  
  public MyScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MyScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a != null)
    {
      i locali = this.a;
      int i = getScrollY();
      this.b = i;
      locali.a(i);
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.c.sendMessageDelayed(this.c.obtainMessage(), 5L);
    }
  }
  
  public void setOnScrollListener(i parami)
  {
    this.a = parami;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\MyScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */