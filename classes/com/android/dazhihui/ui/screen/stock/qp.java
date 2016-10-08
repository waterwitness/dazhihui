package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.EditText;

class qp
  extends Handler
{
  qp(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 286335522) {
      if (SearchHuiFragment.e(this.a) == 1)
      {
        SearchHuiFragment.a(this.a, 0);
        this.a.a(this.a.d.getText().toString());
      }
    }
    while (paramMessage.what != 572671044)
    {
      return;
      SearchHuiFragment.f(this.a);
      return;
    }
    if (SearchHuiFragment.g(this.a) == 1)
    {
      SearchHuiFragment.b(this.a, 0);
      SearchHuiFragment.a(this.a, paramMessage.obj.toString(), 0, null);
      return;
    }
    SearchHuiFragment.h(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */