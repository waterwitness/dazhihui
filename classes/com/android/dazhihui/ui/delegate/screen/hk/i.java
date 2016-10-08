package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;

class i
  implements AdapterView.OnItemClickListener
{
  i(DropDownTextView paramDropDownTextView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    DropDownTextView.a(this.a, paramInt);
    paramAdapterView = (String)DropDownTextView.d(this.a).get(paramInt);
    DropDownTextView.e(this.a).setText(paramAdapterView);
    if (DropDownTextView.b(this.a) != null) {
      DropDownTextView.b(this.a).dismiss();
    }
    if (this.a.b != null) {
      this.a.b.a(paramAdapterView, paramInt);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */