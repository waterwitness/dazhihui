package com.android.dazhihui.ui.widget;

import android.inputmethodservice.KeyboardView;
import android.widget.EditText;
import android.widget.ScrollView;

class gp
  implements Runnable
{
  gp(gn paramgn) {}
  
  public void run()
  {
    int[] arrayOfInt1 = new int[2];
    gn.e(this.a).getLocationOnScreen(arrayOfInt1);
    int[] arrayOfInt2 = new int[2];
    gn.a(this.a).getLocationOnScreen(arrayOfInt2);
    int i = gn.a(this.a).getMeasuredHeight();
    this.a.c = (arrayOfInt2[1] + i + 6 - arrayOfInt1[1]);
    if ((this.a.c > 0) && (gn.h(this.a) != null)) {
      gn.h(this.a).offsetTopAndBottom(-this.a.c);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */