package com.android.dazhihui.ui.delegate.screen;

import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.au;
import com.android.dazhihui.ui.widget.bo;

class ee
  implements bo
{
  ee(dy paramdy) {}
  
  public void a(String paramString, int paramInt)
  {
    if (paramString == null) {}
    while (this.a.b == null) {
      return;
    }
    if (this.a.b[paramInt].equals("b"))
    {
      dy.u(this.a).setVisibility(0);
      dy.b(this.a, new au().a());
      dy.u(this.a).setText(String.valueOf(dy.v(this.a)));
    }
    while (this.a.b[paramInt].equals("n"))
    {
      dy.w(this.a).setEnabled(false);
      return;
      dy.u(this.a).setVisibility(8);
    }
    dy.w(this.a).setEnabled(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */