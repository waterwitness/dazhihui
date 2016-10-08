package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;

class ln
  implements View.OnClickListener
{
  ln(TabTextView paramTabTextView, View.OnClickListener paramOnClickListener) {}
  
  public void onClick(View paramView)
  {
    this.a.onClick(paramView);
    if ((TabTextView.a(this.b) != 0) && (TabTextView.b(this.b) != null)) {
      TabTextView.b(this.b).a((TabTextView)paramView, TabTextView.a(this.b), TabTextView.c(this.b));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */