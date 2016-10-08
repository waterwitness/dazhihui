package com.android.dazhihui.ui.widget.adv;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class g
  implements View.OnClickListener
{
  g(AdvertUpPullLayout paramAdvertUpPullLayout) {}
  
  public void onClick(View paramView)
  {
    if ((AdvertUpPullLayout.b(this.a) != null) && (AdvertUpPullLayout.b(this.a).isShowing())) {
      AdvertUpPullLayout.b(this.a).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */