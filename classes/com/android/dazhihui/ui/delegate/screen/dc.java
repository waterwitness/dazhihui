package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.delegate.b.k;

class dc
  implements View.OnClickListener
{
  dc(ProtectorForm paramProtectorForm) {}
  
  public void onClick(View paramView)
  {
    int i = 0;
    paramView = this.a.a[ProtectorForm.a(this.a)];
    if (ProtectorForm.a(this.a) == 0) {}
    for (;;)
    {
      if (i != a.l)
      {
        a.l = i;
        ProtectorForm.b(this.a).a(20);
        ProtectorForm.b(this.a).close();
        k.a(this.a).c();
      }
      this.a.finish();
      return;
      try
      {
        int j = Integer.parseInt(paramView.substring(0, paramView.indexOf(" ")));
        i = j;
      }
      catch (Exception paramView) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */