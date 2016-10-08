package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.screen.ggt.CustomTextView;

class ap
  implements TextWatcher
{
  ap(HKEntrust paramHKEntrust) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (HKEntrust.f(this.a).getText().toString().length() == 0) {
      HKEntrust.g(this.a).removeMessages(1);
    }
    if (!HKEntrust.h(this.a).getText().equals(""))
    {
      if ((!HKEntrust.i(this.a)) && (!HKEntrust.j(this.a).equals(HKEntrust.f(this.a).getText().toString()))) {
        HKEntrust.b(this.a, true);
      }
      HKEntrust.b(this.a, HKEntrust.f(this.a).getText().toString());
      if (HKEntrust.k(this.a) != 1) {
        break label229;
      }
      HKEntrust.a(this.a, 0);
      if (!HKEntrust.m(this.a).equals("0")) {
        break label288;
      }
      HKEntrust.n(this.a).setText("");
      HKEntrust.n(this.a).setVisibility(8);
      HKEntrust.o(this.a).setText("");
      HKEntrust.o(this.a).setVisibility(8);
      label196:
      if (HKEntrust.p(this.a) != 0) {
        break label404;
      }
      if (HKEntrust.q(this.a) != null) {
        break label347;
      }
      HKEntrust.g(this.a).sendEmptyMessage(0);
    }
    label229:
    label288:
    label347:
    label404:
    while (HKEntrust.p(this.a) != 1)
    {
      return;
      if (HKEntrust.k(this.a) == 2)
      {
        HKEntrust.c(this.a, HKEntrust.d(this.a, bk.a(HKEntrust.l(this.a))));
        break;
      }
      HKEntrust.c(this.a, HKEntrust.d(this.a, "0.01"));
      break;
      HKEntrust.n(this.a).setText(HKEntrust.m(this.a));
      HKEntrust.n(this.a).setVisibility(0);
      HKEntrust.o(this.a).setText(HKEntrust.m(this.a));
      HKEntrust.o(this.a).setVisibility(0);
      break label196;
      String str = HKEntrust.a(this.a, 1, true);
      paramEditable = str;
      if (TextUtils.isEmpty(str)) {
        paramEditable = "0";
      }
      HKEntrust.r(this.a).setHint("可买" + paramEditable + "股");
      return;
    }
    if (HKEntrust.s(this.a))
    {
      HKEntrust.g(this.a).sendEmptyMessage(1);
      HKEntrust.c(this.a, false);
      return;
    }
    HKEntrust.g(this.a).removeMessages(1);
    HKEntrust.g(this.a).sendEmptyMessageDelayed(1, 2000L);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */