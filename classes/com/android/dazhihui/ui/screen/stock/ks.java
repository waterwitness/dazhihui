package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.km;

class ks
  implements View.OnClickListener
{
  ks(ju paramju) {}
  
  public void onClick(View paramView)
  {
    n.a("", 20089);
    this.a.d.setVisibility(0);
    this.a.j.setVisibility(0);
    this.a.a(Boolean.valueOf(false), this.a.c);
    if (ju.b(this.a) == null)
    {
      ju.a(this.a, new km(this.a.getActivity(), this.a.d));
      ju.b(this.a).a(new kt(this));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */