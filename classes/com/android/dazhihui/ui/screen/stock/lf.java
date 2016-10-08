package com.android.dazhihui.ui.screen.stock;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.jm;
import com.android.dazhihui.ui.widget.kp;

class lf
  implements kp
{
  lf(kz paramkz) {}
  
  public void a()
  {
    KeyEvent localKeyEvent = new KeyEvent(0L, 0L, 0, 67, 0, 0, 0, 0, 6);
    this.a.k.dispatchKeyEvent(localKeyEvent);
  }
  
  public void a(SpannableString paramSpannableString)
  {
    if (paramSpannableString != null)
    {
      paramSpannableString = jm.a(paramSpannableString, this.a.s);
      this.a.k.append(paramSpannableString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */