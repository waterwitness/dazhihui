package com.android.dazhihui.ui.delegate.screen.ggt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.d.n;
import java.math.BigDecimal;

class p
  implements View.OnClickListener
{
  p(GgtEntrust paramGgtEntrust) {}
  
  public void onClick(View paramView)
  {
    int i = 0;
    int j = 0;
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
      do
      {
        do
        {
          do
          {
            return;
          } while ((GgtEntrust.h(this.a).equals("0")) || (GgtEntrust.n(this.a).equals("0")));
          if (GgtEntrust.c(this.a).getText().toString().equals("")) {}
          for (paramView = "0";; paramView = GgtEntrust.c(this.a).getText().toString())
          {
            GgtEntrust.a(this.a, 2);
            String str = this.a.b(paramView, GgtEntrust.n(this.a)).toString();
            paramView = str;
            if (n.w(str) < 0.0F) {
              paramView = "0";
            }
            GgtEntrust.c(this.a).setText(paramView);
            return;
          }
        } while ((GgtEntrust.h(this.a).equals("0")) || (GgtEntrust.n(this.a).equals("0")));
        if (GgtEntrust.c(this.a).getText().toString().equals("")) {}
        for (paramView = "0";; paramView = GgtEntrust.c(this.a).getText().toString())
        {
          GgtEntrust.a(this.a, 1);
          paramView = this.a.a(paramView, GgtEntrust.n(this.a)).toString();
          GgtEntrust.c(this.a).setText(paramView + "");
          return;
        }
      } while (GgtEntrust.o(this.a).getText().toString().equals(""));
      if (GgtEntrust.p(this.a).getText().toString().equals(""))
      {
        i = 0;
        label367:
        i -= n.x(GgtEntrust.o(this.a).getText().toString());
        if (i >= 0) {
          break label578;
        }
        i = j;
      }
      break;
    }
    label578:
    for (;;)
    {
      GgtEntrust.p(this.a).setText(i + "");
      return;
      i = n.x(GgtEntrust.p(this.a).getText().toString());
      break label367;
      if (GgtEntrust.o(this.a).getText().toString().equals("")) {
        break;
      }
      if (GgtEntrust.p(this.a).getText().toString().equals("")) {}
      for (;;)
      {
        j = n.x(GgtEntrust.o(this.a).getText().toString());
        GgtEntrust.p(this.a).setText(j + i + "");
        return;
        i = n.x(GgtEntrust.p(this.a).getText().toString());
      }
      GgtEntrust.q(this.a);
      return;
      GgtEntrust.r(this.a);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */