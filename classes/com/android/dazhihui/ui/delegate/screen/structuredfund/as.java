package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;

class as
  implements TextWatcher
{
  as(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      paramInt1 = 0;
      paramInt2 = 0;
      while (paramInt1 < StructuredFundSplitOrMerge.c(this.a).size())
      {
        if (paramCharSequence.toString().equals(((String[])StructuredFundSplitOrMerge.c(this.a).get(paramInt1))[StructuredFundSplitOrMerge.d(this.a)])) {
          paramInt2 = 1;
        }
        paramInt1 += 1;
      }
      if (paramInt2 != 0) {
        StructuredFundSplitOrMerge.a(this.a, true);
      }
    }
    else
    {
      if (paramCharSequence.length() == 0) {
        break label165;
      }
      StructuredFundSplitOrMerge.e(this.a).setBackgroundResource(2130837971);
      StructuredFundSplitOrMerge.b(this.a, false);
    }
    for (;;)
    {
      if (paramCharSequence.length() == 0) {
        StructuredFundSplitOrMerge.a(this.a).setVisibility(0);
      }
      return;
      StructuredFundSplitOrMerge.a(this.a).setVisibility(0);
      Toast.makeText(this.a.getApplicationContext(), "持仓不含有该母基金", 1).show();
      break;
      label165:
      StructuredFundSplitOrMerge.e(this.a).setBackgroundResource(2130837979);
      StructuredFundSplitOrMerge.b(this.a, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */