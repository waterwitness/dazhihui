package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.TextView;

class kd
  implements Runnable
{
  kd(PullDownView paramPullDownView) {}
  
  public void run()
  {
    View localView1 = this.a.getChildAt(0);
    View localView2 = this.a.getChildAt(1);
    View localView3 = this.a.getChildAt(2);
    localView1.findViewById(2131560228).setVisibility(0);
    localView1.findViewById(2131560229).setVisibility(8);
    localView1.setVisibility(8);
    localView3.findViewById(2131560228).setVisibility(0);
    localView3.findViewById(2131560229).setVisibility(8);
    localView3.setVisibility(8);
    localView1.offsetTopAndBottom(-localView1.getTop() - PullDownView.a(this.a));
    localView2.offsetTopAndBottom(-localView2.getTop());
    localView3.offsetTopAndBottom(PullDownView.b(this.a) - localView3.getBottom() + PullDownView.a(this.a));
    PullDownView.c(this.a).setText(2131166373);
    PullDownView.d(this.a).setText(2131165296);
    PullDownView.a(this.a, 0);
    PullDownView.b(this.a, 0);
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */