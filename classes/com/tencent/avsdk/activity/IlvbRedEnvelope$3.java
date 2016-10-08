package com.tencent.avsdk.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

class IlvbRedEnvelope$3
  implements TextWatcher
{
  IlvbRedEnvelope$3(IlvbRedEnvelope paramIlvbRedEnvelope) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$0.huiTotal.setText(paramCharSequence + " 币");
    IlvbRedEnvelope.access$000(this.this$0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbRedEnvelope$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */