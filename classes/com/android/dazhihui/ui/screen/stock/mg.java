package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.BaseActivity;

class mg
  implements View.OnClickListener
{
  mg(mf parammf) {}
  
  public void onClick(View paramView)
  {
    MenuManager.getInstance().setMenuLoadListener(new mh(this));
    MenuManager.getInstance().loadMenuConfig((BaseActivity)this.a.getActivity());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */