package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class e
  implements View.OnClickListener
{
  e(AbstractQuirys paramAbstractQuirys) {}
  
  public void onClick(View paramView)
  {
    if ((AbstractQuirys.b(this.a).getText().toString().length() == 0) || (AbstractQuirys.c(this.a).getText().toString().length() == 0))
    {
      this.a.c("为输入起始日期或结束日期");
      return;
    }
    if ((AbstractQuirys.b(this.a).getText().toString().length() != 8) || (AbstractQuirys.c(this.a).getText().toString().length() != 8))
    {
      this.a.c("起始日期或结束日期格式不对");
      return;
    }
    if (AbstractQuirys.b(this.a).getText().toString().compareTo(AbstractQuirys.c(this.a).getText().toString()) > 0)
    {
      this.a.c("起始日期不能晚于结束日期");
      return;
    }
    AbstractQuirys.a(this.a, true);
    AbstractQuirys.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */