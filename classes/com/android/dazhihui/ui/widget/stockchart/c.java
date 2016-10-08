package com.android.dazhihui.ui.widget.stockchart;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;

class c
  implements TextWatcher
{
  c(FastDealsView paramFastDealsView) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = paramEditable.toString();
    try
    {
      Message localMessage = FastDealsView.i(this.a).obtainMessage();
      localMessage.what = FastDealsView.a;
      localMessage.obj = paramEditable;
      FastDealsView.i(this.a).sendMessageDelayed(localMessage, 50L);
      return;
    }
    catch (NumberFormatException paramEditable) {}
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */