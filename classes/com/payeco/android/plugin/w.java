package com.payeco.android.plugin;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ScrollView;
import com.payeco.android.plugin.util.PayecoKeyBoard;

final class w
  implements View.OnFocusChangeListener
{
  w(PayecoRiskControlActivity paramPayecoRiskControlActivity, ScrollView paramScrollView) {}
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.bc.mKeyboard != null)
      {
        this.bc.mKeyboard.dismiss();
        this.bc.mKeyboard = null;
      }
      this.bc.mKeyboard = PayecoKeyBoard.popPayecoKeyboard(PayecoRiskControlActivity.e(this.bc), this.bf, PayecoRiskControlActivity.q(this.bc), 1, 3);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */