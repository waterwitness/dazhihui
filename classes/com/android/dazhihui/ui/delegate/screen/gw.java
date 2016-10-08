package com.android.dazhihui.ui.delegate.screen;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

class gw
  implements View.OnClickListener
{
  gw(Transfer paramTransfer) {}
  
  public void onClick(View paramView)
  {
    if (((Transfer.e(this.a) != 3100) && (Transfer.f(this.a).getText().length() == 0)) || ((Transfer.g(this.a) != null) && ((Transfer.g(this.a).equals("1")) || (Transfer.g(this.a).equals("3"))) && (Transfer.h(this.a).getText().length() == 0)) || ((Transfer.g(this.a) != null) && ((Transfer.g(this.a).equals("2")) || (Transfer.g(this.a).equals("3"))) && (Transfer.i(this.a).getText().length() == 0)))
    {
      this.a.a();
      return;
    }
    if (!Transfer.j(this.a))
    {
      paramView = Toast.makeText(this.a, "　　没能获取可用的银行列表信息，请重试。", 0);
      paramView.setGravity(17, 0, 0);
      paramView.show();
      return;
    }
    if (Transfer.e(this.a) == 3100)
    {
      this.a.c();
      return;
    }
    this.a.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */