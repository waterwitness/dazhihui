package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class aj
  implements TextWatcher
{
  aj(EntrustNew paramEntrustNew) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (EntrustNew.c(this.a).getText().toString().length() == 0) {
      EntrustNew.q(this.a).removeMessages(0);
    }
    if (EntrustNew.b(this.a).getText().toString().length() == 6)
    {
      if (!"卖出".equals(this.a.a)) {
        break label89;
      }
      if (EntrustNew.r(this.a) == 0) {
        EntrustNew.q(this.a).sendEmptyMessage(0);
      }
    }
    return;
    label89:
    if (EntrustNew.r(this.a) == 0)
    {
      EntrustNew.q(this.a).sendEmptyMessage(0);
      return;
    }
    EntrustNew.q(this.a).removeMessages(0);
    EntrustNew.q(this.a).sendEmptyMessageDelayed(0, 2000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */