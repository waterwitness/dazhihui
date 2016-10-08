package com.android.dazhihui.ui.screen.stock;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.jm;
import com.android.dazhihui.ui.widget.kp;

class kt
  implements kp
{
  kt(ks paramks) {}
  
  public void a()
  {
    KeyEvent localKeyEvent = new KeyEvent(0L, 0L, 0, 67, 0, 0, 0, 0, 6);
    this.a.a.c.dispatchKeyEvent(localKeyEvent);
  }
  
  public void a(SpannableString paramSpannableString)
  {
    if (paramSpannableString != null)
    {
      paramSpannableString = jm.a(paramSpannableString, this.a.a.getActivity());
      this.a.a.c.append(paramSpannableString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */