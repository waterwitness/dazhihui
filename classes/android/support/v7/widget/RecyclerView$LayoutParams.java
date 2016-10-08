package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class RecyclerView$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  bk a;
  final Rect b = new Rect();
  boolean c = true;
  boolean d = false;
  
  public RecyclerView$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public RecyclerView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RecyclerView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public RecyclerView$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public RecyclerView$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public boolean c()
  {
    return this.a.isRemoved();
  }
  
  public boolean d()
  {
    return this.a.isUpdated();
  }
  
  public int e()
  {
    return this.a.getLayoutPosition();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView$LayoutParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */