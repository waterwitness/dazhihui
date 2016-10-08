package com.android.dazhihui.ui.delegate.screen.hk;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.gr;
import java.math.BigDecimal;

class az
  implements View.OnClickListener
{
  az(HKEntrust paramHKEntrust) {}
  
  public void onClick(View paramView)
  {
    long l2 = 0L;
    long l1;
    switch (paramView.getId())
    {
    case 2131559145: 
    case 2131559147: 
    case 2131559148: 
    case 2131559149: 
    case 2131559151: 
    default: 
    case 2131559144: 
    case 2131559146: 
    case 2131559150: 
    case 2131559152: 
      label497:
      do
      {
        do
        {
          do
          {
            do
            {
              return;
            } while ((HKEntrust.m(this.b).equals("0")) || (HKEntrust.y(this.b).equals("0")) || (TextUtils.isEmpty(HKEntrust.b(this.b).getText())));
            if (HKEntrust.f(this.b).getText().toString().equals("")) {}
            for (paramView = "0";; paramView = HKEntrust.f(this.b).getText().toString())
            {
              if (HKEntrust.k(this.b) == 1) {
                HKEntrust.a(this.b, 2);
              }
              String str = bk.d(paramView, HKEntrust.y(this.b)).toString();
              paramView = str;
              if (Float.parseFloat(str) < 0.0F) {
                paramView = "0";
              }
              HKEntrust.f(this.b).setText(paramView);
              return;
            }
          } while ((HKEntrust.m(this.b).equals("0")) || (HKEntrust.y(this.b).equals("0")) || (TextUtils.isEmpty(HKEntrust.b(this.b).getText())));
          if (HKEntrust.f(this.b).getText().toString().equals("")) {}
          for (paramView = "0";; paramView = HKEntrust.f(this.b).getText().toString())
          {
            if (HKEntrust.k(this.b) == 1) {
              HKEntrust.a(this.b, 1);
            }
            paramView = bk.c(paramView, HKEntrust.y(this.b)).toString();
            HKEntrust.f(this.b).setText(paramView + "");
            return;
          }
        } while (HKEntrust.z(this.b).getText().toString().equals(""));
        if (HKEntrust.r(this.b).getText().toString().equals(""))
        {
          l1 = 0L;
          l1 -= Long.parseLong(HKEntrust.z(this.b).getText().toString());
          if (l1 > 0L) {
            break label497;
          }
          HKEntrust.r(this.b).setText("0");
        }
        for (;;)
        {
          Selection.setSelection(HKEntrust.r(this.b).getText(), HKEntrust.r(this.b).getText().length());
          return;
          l1 = Long.parseLong(HKEntrust.r(this.b).getText().toString());
          break;
          HKEntrust.r(this.b).setText(l1 + "");
        }
      } while (HKEntrust.z(this.b).getText().toString().equals(""));
      if (HKEntrust.r(this.b).getText().toString().equals(""))
      {
        l1 = 0L;
        l1 += Long.parseLong(HKEntrust.z(this.b).getText().toString());
        if (l1 >= 0L) {
          break label722;
        }
        l1 = l2;
      }
      break;
    }
    label722:
    for (;;)
    {
      HKEntrust.r(this.b).setText(l1 + "");
      Selection.setSelection(HKEntrust.r(this.b).getText(), HKEntrust.r(this.b).getText().length());
      return;
      l1 = Long.parseLong(HKEntrust.r(this.b).getText().toString());
      break;
      HKEntrust.A(this.b);
      return;
      if (HKEntrust.t(this.b).d()) {
        HKEntrust.t(this.b).c();
      }
      HKEntrust.B(this.b);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */