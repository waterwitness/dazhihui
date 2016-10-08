package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  private long a = -1L;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private final Runnable e = new c(this);
  private final Runnable f = new d(this);
  
  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private void a()
  {
    removeCallbacks(this.e);
    removeCallbacks(this.f);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\ContentLoadingProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */