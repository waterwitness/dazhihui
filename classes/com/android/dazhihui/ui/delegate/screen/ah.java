package com.android.dazhihui.ui.delegate.screen;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.android.dazhihui.d.a;

class ah
  implements TextView.OnEditorActionListener
{
  ah(EntrustNew paramEntrustNew) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 6) && (EntrustNew.h(this.a).getText().toString() != null) && (!EntrustNew.h(this.a).getText().toString().equals("")) && (EntrustNew.i(this.a) > 0.0D) && (a.d(EntrustNew.c(this.a).getText().toString()) > 0.0D)) {
      EntrustNew.j(this.a).setText((EntrustNew.i(this.a) / a.d(EntrustNew.c(this.a).getText().toString()) / 100.0D) * 100L + "股");
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */