package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.PopupWindow;
import java.util.ArrayList;

class bi
  implements AdapterView.OnItemClickListener
{
  bi(DropDownEditTextView paramDropDownEditTextView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (String)DropDownEditTextView.e(this.a).get(paramInt);
    DropDownEditTextView.f(this.a).setText(paramAdapterView);
    if (DropDownEditTextView.c(this.a) != null) {
      DropDownEditTextView.c(this.a).dismiss();
    }
    if ((this.a.c != null) && (paramInt != DropDownEditTextView.g(this.a))) {
      this.a.c.a(paramAdapterView, paramInt);
    }
    DropDownEditTextView.a(this.a, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */