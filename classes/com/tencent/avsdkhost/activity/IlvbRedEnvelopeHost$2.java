package com.tencent.avsdkhost.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.avsdkhost.control.MessageControlHost;

class IlvbRedEnvelopeHost$2
  implements View.OnClickListener
{
  IlvbRedEnvelopeHost$2(IlvbRedEnvelopeHost paramIlvbRedEnvelopeHost) {}
  
  public void onClick(View paramView)
  {
    paramView = this.this$0.redEnvelopeNumberEdt.getText().toString();
    String str1 = this.this$0.huiNmberEdt.getText().toString();
    String str2 = this.this$0.explainEdt.getText().toString();
    MessageControlHost.getInstance().sendRedEnvelope(Integer.parseInt(str1), Integer.parseInt(paramView), str2);
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\IlvbRedEnvelopeHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */