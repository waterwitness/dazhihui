package com.payeco.android.plugin;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import com.payeco.android.plugin.util.PayecoKeyBoard;

final class x
  implements View.OnClickListener
{
  x(PayecoRiskControlActivity paramPayecoRiskControlActivity, ScrollView paramScrollView) {}
  
  public final void onClick(View paramView)
  {
    paramView.setPressed(true);
    if (this.bc.mKeyboard != null)
    {
      this.bc.mKeyboard.dismiss();
      this.bc.mKeyboard = null;
    }
    this.bc.mKeyboard = PayecoKeyBoard.popPayecoKeyboard(PayecoRiskControlActivity.e(this.bc), this.bf, PayecoRiskControlActivity.q(this.bc), 1, 3);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */