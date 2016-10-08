package com.android.dazhihui.ui.delegate.screen.margin;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.bo;

class aj
  implements bo
{
  aj(aa paramaa) {}
  
  public void a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return;
    }
    if (paramInt == 0)
    {
      aa.g(this.a).setEnabled(true);
      EditText localEditText = aa.g(this.a);
      if ((aa.d(this.a) == 0) || (aa.d(this.a) == 2) || (aa.d(this.a) == 4)) {}
      for (paramString = "买入价";; paramString = "卖出价")
      {
        localEditText.setHint(paramString);
        aa.h(this.a).setEnabled(true);
        aa.i(this.a).setEnabled(true);
        aa.j(this.a).setEnabled(true);
        aa.k(this.a).setEnabled(true);
        aa.l(this.a).setEnabled(true);
        aa.m(this.a).setEnabled(true);
        aa.n(this.a).setEnabled(true);
        aa.o(this.a).setEnabled(true);
        aa.p(this.a).setEnabled(true);
        aa.q(this.a).setEnabled(true);
        aa.r(this.a).setEnabled(true);
        aa.s(this.a).setEnabled(true);
        aa.t(this.a).setEnabled(true);
        aa.u(this.a).setEnabled(true);
        this.a.d();
        return;
      }
    }
    aa.g(this.a).setEnabled(false);
    aa.g(this.a).setText("");
    aa.g(this.a).setHint("市价委托");
    aa.v(this.a).setText("--");
    aa.h(this.a).setEnabled(false);
    aa.i(this.a).setEnabled(false);
    aa.j(this.a).setEnabled(false);
    aa.k(this.a).setEnabled(false);
    aa.l(this.a).setEnabled(false);
    aa.m(this.a).setEnabled(false);
    aa.n(this.a).setEnabled(false);
    aa.o(this.a).setEnabled(false);
    aa.p(this.a).setEnabled(false);
    aa.q(this.a).setEnabled(false);
    aa.r(this.a).setEnabled(false);
    aa.s(this.a).setEnabled(false);
    aa.t(this.a).setEnabled(false);
    aa.u(this.a).setEnabled(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */