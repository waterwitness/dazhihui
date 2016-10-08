package com.android.dazhihui.ui.delegate.screen.hk;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.gv;

class at
  implements gv
{
  at(HKEntrust paramHKEntrust) {}
  
  public void a()
  {
    HKEntrust.r(this.a).setText(HKEntrust.a(this.a, 4, false));
    Selection.setSelection(HKEntrust.r(this.a).getText(), HKEntrust.r(this.a).getText().length());
  }
  
  public void b()
  {
    HKEntrust.r(this.a).setText(HKEntrust.a(this.a, 3, false));
    Selection.setSelection(HKEntrust.r(this.a).getText(), HKEntrust.r(this.a).getText().length());
  }
  
  public void c()
  {
    HKEntrust.r(this.a).setText(HKEntrust.a(this.a, 2, false));
    Selection.setSelection(HKEntrust.r(this.a).getText(), HKEntrust.r(this.a).getText().length());
  }
  
  public void d()
  {
    HKEntrust.r(this.a).setText(HKEntrust.a(this.a, 1, false));
    Selection.setSelection(HKEntrust.r(this.a).getText(), HKEntrust.r(this.a).getText().length());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */