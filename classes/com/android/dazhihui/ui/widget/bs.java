package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.PopupWindow;
import java.util.ArrayList;

class bs
  implements AdapterView.OnItemClickListener
{
  bs(DropDownEditTextView2 paramDropDownEditTextView2) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (String)DropDownEditTextView2.e(this.a).get(paramInt);
    DropDownEditTextView2.f(this.a).setText(paramAdapterView);
    if (DropDownEditTextView2.c(this.a) != null) {
      DropDownEditTextView2.c(this.a).dismiss();
    }
    if ((this.a.c != null) && (paramInt != DropDownEditTextView2.g(this.a))) {
      this.a.c.a(paramAdapterView, paramInt);
    }
    DropDownEditTextView2.a(this.a, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */