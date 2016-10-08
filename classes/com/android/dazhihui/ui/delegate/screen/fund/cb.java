package com.android.dazhihui.ui.delegate.screen.fund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.PrintStream;

class cb
  implements TextWatcher
{
  cb(IFundAtone paramIFundAtone) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      IFundAtone.a(this.a, paramCharSequence.toString());
      System.out.println("code " + IFundAtone.a(this.a));
      this.a.a();
      return;
    }
    IFundAtone.b(this.a).setText("");
    IFundAtone.c(this.a).setText("");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */