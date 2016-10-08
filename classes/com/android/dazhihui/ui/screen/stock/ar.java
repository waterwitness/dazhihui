package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

class ar
  implements View.OnClickListener
{
  ar(BulletScreen paramBulletScreen) {}
  
  public void onClick(View paramView)
  {
    if (BulletScreen.a(this.a) != null) {
      BulletScreen.a(this.a).dismiss();
    }
    BulletScreen.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */