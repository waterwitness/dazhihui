package com.android.dazhihui.ui.delegate.screen.newstock;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

class i
  implements TextWatcher
{
  int a;
  
  i(NewStockBatchEntrust paramNewStockBatchEntrust) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    ((n)NewStockBatchEntrust.a(this.b).get(this.a)).e = paramEditable.toString();
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */