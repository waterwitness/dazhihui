package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class fg
  implements View.OnClickListener
{
  fg(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    com.android.dazhihui.ui.delegate.b.o.r = false;
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putInt("entrustIndex", dy.n(this.a));
    paramView.putExtras(localBundle);
    paramView.setClass(this.a.getActivity(), RegionTable.class);
    this.a.startActivity(paramView);
    dy.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */