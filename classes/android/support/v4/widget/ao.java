package android.support.v4.widget;

import android.support.v4.view.bn;
import android.view.View;
import java.util.ArrayList;

class ao
  implements Runnable
{
  final View a;
  
  ao(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }
  
  public void run()
  {
    if (this.a.getParent() == this.b)
    {
      bn.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.g(this.b).remove(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */