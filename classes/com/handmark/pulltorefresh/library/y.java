package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.handmark.pulltorefresh.library.a.a;

public class y
  extends ListView
  implements a
{
  private boolean b = false;
  
  public y(PullToRefreshListView paramPullToRefreshListView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    try
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    catch (IndexOutOfBoundsException paramCanvas)
    {
      paramCanvas.printStackTrace();
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IndexOutOfBoundsException paramMotionEvent)
    {
      paramMotionEvent.printStackTrace();
    }
    return false;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if ((PullToRefreshListView.a(this.a) != null) && (!this.b))
    {
      addFooterView(PullToRefreshListView.a(this.a), null, false);
      this.b = true;
    }
    super.setAdapter(paramListAdapter);
  }
  
  public void setEmptyView(View paramView)
  {
    this.a.setEmptyView(paramView);
  }
  
  public void setEmptyViewInternal(View paramView)
  {
    super.setEmptyView(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */