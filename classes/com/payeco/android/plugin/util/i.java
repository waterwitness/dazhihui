package com.payeco.android.plugin.util;

import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

final class i
  implements RadioGroup.OnCheckedChangeListener
{
  i(PayecoKeyBoard paramPayecoKeyBoard, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (paramInt == this.cG) {
      PayecoKeyBoard.c(this.cF);
    }
    while ((paramInt == this.cH) || (paramInt == this.cI)) {
      return;
    }
    this.cF.dismiss();
    PayecoKeyBoard.a(this.cF).setText(PayecoKeyBoard.b(this.cF).getText());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */