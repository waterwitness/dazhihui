package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public abstract class av
{
  @Deprecated
  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, bh parambh)
  {
    a(paramCanvas, paramRecyclerView);
  }
  
  @Deprecated
  public void a(Rect paramRect, int paramInt, RecyclerView paramRecyclerView)
  {
    paramRect.set(0, 0, 0, 0);
  }
  
  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, bh parambh)
  {
    a(paramRect, ((RecyclerView.LayoutParams)paramView.getLayoutParams()).e(), paramRecyclerView);
  }
  
  @Deprecated
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, bh parambh)
  {
    b(paramCanvas, paramRecyclerView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */