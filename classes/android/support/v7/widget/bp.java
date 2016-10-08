package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

class bp
  extends aa
{
  bp(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, Context paramContext)
  {
    super(paramContext);
  }
  
  public PointF a(int paramInt)
  {
    paramInt = StaggeredGridLayoutManager.a(this.a, paramInt);
    if (paramInt == 0) {
      return null;
    }
    if (StaggeredGridLayoutManager.a(this.a) == 0) {
      return new PointF(paramInt, 0.0F);
    }
    return new PointF(0.0F, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */