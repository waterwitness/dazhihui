package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

class ar
  implements TextWatcher
{
  ar(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      StructuredFundSplitOrMerge.a(this.a).setVisibility(8);
      StructuredFundSplitOrMerge.b(this.a).setVisibility(0);
      StructuredFundSplitOrMerge.b(this.a).setText(paramCharSequence.toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */