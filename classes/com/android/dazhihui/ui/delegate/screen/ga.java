package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.android.dazhihui.ui.widget.gn;

class ga
  implements View.OnFocusChangeListener
{
  ga(fi paramfi) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      fi.l(this.a).a(fi.j(this.a));
      fi.l(this.a).b();
      fi.l(this.a).a(new gb(this));
      return;
    }
    fi.l(this.a).c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */