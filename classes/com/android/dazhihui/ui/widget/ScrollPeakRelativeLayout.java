package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.dazhihui.ui.widget.dzhrefresh.d;

public class ScrollPeakRelativeLayout
  extends RelativeLayout
  implements d
{
  private d a;
  
  public ScrollPeakRelativeLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public ScrollPeakRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ScrollPeakRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int getHeaderHeight()
  {
    if (this.a != null) {
      return this.a.getHeaderHeight();
    }
    return 0;
  }
  
  public int getHeaderHidden()
  {
    if (this.a != null) {
      return this.a.getHeaderHidden();
    }
    return 0;
  }
  
  public boolean isScrollBottom()
  {
    if (this.a != null) {
      return this.a.isScrollBottom();
    }
    return false;
  }
  
  public boolean isScrollTop()
  {
    if (this.a != null) {
      return this.a.isScrollTop();
    }
    return false;
  }
  
  public void moveContent(int paramInt)
  {
    if (this.a != null) {
      this.a.moveContent(paramInt);
    }
  }
  
  public void moveHeader(int paramInt)
  {
    if (this.a != null) {
      this.a.moveHeader(paramInt);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() == 2)
    {
      View localView1 = getChildAt(0);
      View localView2 = getChildAt(1);
      if (localView1.getVisibility() == 8)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      localView1.layout(0, 0, localView1.getMeasuredWidth(), localView1.getMeasuredHeight());
      localView2.layout(0, localView1.getMeasuredHeight(), localView2.getMeasuredWidth(), localView1.getMeasuredHeight() + localView2.getMeasuredHeight());
      return;
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      return true;
    } while (getChildCount() != 0);
    return false;
  }
  
  public void setScrollPeakListener(d paramd)
  {
    this.a = paramd;
  }
  
  public int upToLoad(int paramInt, boolean paramBoolean)
  {
    if (this.a != null) {
      return this.a.upToLoad(paramInt, paramBoolean);
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ScrollPeakRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */