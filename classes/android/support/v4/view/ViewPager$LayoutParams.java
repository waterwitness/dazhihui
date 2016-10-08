package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ViewPager$LayoutParams
  extends ViewGroup.LayoutParams
{
  public boolean a;
  public int b;
  float c = 0.0F;
  boolean d;
  int e;
  int f;
  
  public ViewPager$LayoutParams()
  {
    super(-1, -1);
  }
  
  public ViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.access$400());
    this.b = paramContext.getInteger(0, 48);
    paramContext.recycle();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ViewPager$LayoutParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */