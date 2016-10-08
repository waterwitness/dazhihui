package com.android.dazhihui.ui.delegate.screen;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.android.dazhihui.ui.widget.DropDownEditTextView;

class fd
  implements RadioGroup.OnCheckedChangeListener
{
  fd(dy paramdy) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    dy.g(this.a).setText("");
    dy localdy = this.a;
    if (paramInt == dy.h(this.a).getId()) {}
    for (paramRadioGroup = "0";; paramRadioGroup = "1")
    {
      dy.a(localdy, paramRadioGroup);
      if ((!dy.i(this.a)) || (!dy.j(this.a).booleanValue())) {
        dy.b(this.a, dy.k(this.a).getCurrentItem());
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */