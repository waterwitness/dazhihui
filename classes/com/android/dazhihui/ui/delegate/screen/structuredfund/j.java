package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;

class j
  implements AdapterView.OnItemClickListener
{
  j(i parami) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((String[])i.a(this.a).get(paramInt))[i.g()];
    if ((paramAdapterView != null) && (paramAdapterView.length() == 6))
    {
      if (i.b(this.a) != null) {
        i.c(this.a);
      }
      i.d(this.a).setText(paramAdapterView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */