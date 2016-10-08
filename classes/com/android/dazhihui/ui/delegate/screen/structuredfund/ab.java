package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.a;
import com.android.dazhihui.ui.widget.gr;

class ab
  implements View.OnClickListener
{
  ab(i parami) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            double d;
                            do
                            {
                              do
                              {
                                return;
                                if (i.l(this.a).d()) {
                                  i.l(this.a).c();
                                }
                                i.m(this.a);
                                return;
                              } while ((i.b(this.a) == null) || (i.n(this.a).getText().toString().equals("")) || (i.k(this.a).getText().toString() == null) || (i.k(this.a).getText().toString().equals("")));
                              d = a.d(i.k(this.a).getText().toString());
                              if ((d > 0.001D) && (i.o(this.a) == 3))
                              {
                                i.k(this.a).setText(a.a(d - 0.001D, "0.000"));
                                return;
                              }
                              if ((d > 0.01D) && (i.o(this.a) == 2))
                              {
                                i.k(this.a).setText(a.a(d - 0.01D, "0.00"));
                                return;
                              }
                              i.k(this.a).setText("0");
                              return;
                            } while ((i.b(this.a) == null) || (i.n(this.a).getText().toString().equals("")));
                            if ((i.k(this.a).getText().toString() != null) && (!i.k(this.a).getText().toString().equals("")))
                            {
                              d = a.d(i.k(this.a).getText().toString());
                              if (i.o(this.a) == 3)
                              {
                                i.k(this.a).setText(a.a(d + 0.001D, "0.000"));
                                return;
                              }
                              i.k(this.a).setText(a.a(d + 0.01D, "0.00"));
                              return;
                            }
                            if (i.o(this.a) == 3)
                            {
                              i.k(this.a).setText("0.001");
                              return;
                            }
                            i.k(this.a).setText("0.01");
                            return;
                          } while (i.p(this.a).getText().toString().equals("--"));
                          i.k(this.a).setText(i.p(this.a).getText().toString());
                          return;
                        } while (i.q(this.a).getText().toString().equals("--"));
                        i.k(this.a).setText(i.q(this.a).getText().toString());
                        return;
                      } while (i.r(this.a).getText().toString().equals("--"));
                      i.k(this.a).setText(i.r(this.a).getText().toString());
                      return;
                    } while (i.s(this.a).getText().toString().equals("--"));
                    i.k(this.a).setText(i.s(this.a).getText().toString());
                    return;
                  } while (i.t(this.a).getText().toString().equals("--"));
                  i.k(this.a).setText(i.t(this.a).getText().toString());
                  return;
                } while (i.u(this.a).getText().toString().equals("--"));
                i.k(this.a).setText(i.u(this.a).getText().toString());
                return;
              } while (i.v(this.a).getText().toString().equals("--"));
              i.k(this.a).setText(i.v(this.a).getText().toString());
              return;
            } while (i.w(this.a).getText().toString().equals("--"));
            i.k(this.a).setText(i.w(this.a).getText().toString());
            return;
          } while (i.x(this.a).getText().toString().equals("--"));
          i.k(this.a).setText(i.x(this.a).getText().toString());
          return;
        } while (i.y(this.a).getText().toString().equals("--"));
        i.k(this.a).setText(i.y(this.a).getText().toString());
        return;
      } while (i.z(this.a).getText().toString().equals("--"));
      i.k(this.a).setText(i.z(this.a).getText().toString());
      return;
    } while (i.A(this.a).getText().toString().equals("--"));
    i.k(this.a).setText(i.A(this.a).getText().toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */