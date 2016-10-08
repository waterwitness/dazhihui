package com.tencent.avsdkhost.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

class IlvbRedEnvelopeHost$3
  implements TextWatcher
{
  IlvbRedEnvelopeHost$3(IlvbRedEnvelopeHost paramIlvbRedEnvelopeHost) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$0.huiTotal.setText(paramCharSequence + " 币");
    IlvbRedEnvelopeHost.access$000(this.this$0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\IlvbRedEnvelopeHost$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */