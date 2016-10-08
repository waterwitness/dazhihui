package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class p
  implements View.OnClickListener
{
  p(ETFFundEntrust paramETFFundEntrust) {}
  
  public void onClick(View paramView)
  {
    if (ETFFundEntrust.c(this.a).getText().toString().length() < 6)
    {
      this.a.c("请输入完整代码");
      return;
    }
    if (ETFFundEntrust.d(this.a).getText().toString().equals(""))
    {
      this.a.c("请输入份额");
      return;
    }
    ETFFundEntrust.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */