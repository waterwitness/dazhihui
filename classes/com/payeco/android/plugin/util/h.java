package com.payeco.android.plugin.util;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

final class h
  implements View.OnClickListener
{
  h(PayecoKeyBoard paramPayecoKeyBoard) {}
  
  public final void onClick(View paramView)
  {
    this.cF.dismiss();
    PayecoKeyBoard.a(this.cF).setText(PayecoKeyBoard.b(this.cF).getText());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */