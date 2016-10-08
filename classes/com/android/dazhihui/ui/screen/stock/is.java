package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.android.dazhihui.c.a.d;

class is
  implements View.OnClickListener
{
  is(MaxNineScreen paramMaxNineScreen) {}
  
  public void onClick(View paramView)
  {
    paramView = d.a();
    paramView.g("dispatch_address");
    paramView.g();
    paramView = this.a.getResources().getString(2131166244);
    com.android.dazhihui.g.a().a(null);
    com.android.dazhihui.g.a().e(null);
    com.android.dazhihui.g.a().g(-1);
    com.android.dazhihui.a.g.a().x();
    Toast.makeText(this.a, paramView, 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */