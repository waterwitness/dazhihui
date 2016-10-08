package com.payeco.android.plugin.util;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class g
  implements View.OnKeyListener
{
  g(PayecoKeyBoard paramPayecoKeyBoard) {}
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 0) && (paramInt == 4)) {
      this.cF.dismiss();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */