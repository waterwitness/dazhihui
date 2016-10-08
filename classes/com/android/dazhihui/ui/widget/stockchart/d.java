package com.android.dazhihui.ui.widget.stockchart;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;

class d
  implements TextWatcher
{
  d(FastDealsView paramFastDealsView) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = paramEditable.toString().trim();
    Message localMessage = FastDealsView.i(this.a).obtainMessage();
    localMessage.what = FastDealsView.b;
    localMessage.obj = paramEditable;
    FastDealsView.i(this.a).sendMessageDelayed(localMessage, 1000L);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */