package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.delegate.b.o;

class bj
  implements AdapterView.OnItemClickListener
{
  bj(ax paramax) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (o.i) {}
    for (paramAdapterView = ((String[])ax.g(this.a).get(paramInt))[9];; paramAdapterView = ((String[])ax.g(this.a).get(paramInt))[4])
    {
      if ((paramAdapterView != null) && (paramAdapterView.length() == 6))
      {
        if (ax.b(this.a) != null) {
          ax.c(this.a);
        }
        if ((ax.d(this.a) == 1) && (!o.i)) {
          ax.a(this.a, ((String[])ax.g(this.a).get(paramInt))[9]);
        }
        ax.f(this.a).setText(paramAdapterView);
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */