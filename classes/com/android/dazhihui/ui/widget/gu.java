package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

class gu
  implements Runnable
{
  gu(gr paramgr) {}
  
  public void run()
  {
    int[] arrayOfInt1 = new int[2];
    gr.d(this.a).getLocationOnScreen(arrayOfInt1);
    int[] arrayOfInt2 = new int[2];
    gr.c(this.a).getLocationOnScreen(arrayOfInt2);
    int i = gr.c(this.a).getMeasuredHeight();
    this.a.a = (arrayOfInt2[1] + i - arrayOfInt1[1]);
    if ((this.a.a > 0) && (gr.e(this.a) != null)) {
      gr.e(this.a).offsetTopAndBottom(-this.a.a);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */