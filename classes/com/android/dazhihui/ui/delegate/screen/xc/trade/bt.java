package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.a;
import com.android.dazhihui.ui.widget.gr;

class bt
  implements View.OnClickListener
{
  bt(ax paramax) {}
  
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
                                if (ax.o(this.a).d()) {
                                  ax.o(this.a).c();
                                }
                                ax.p(this.a);
                                return;
                              } while ((ax.b(this.a) == null) || (ax.q(this.a).getText().toString().equals("")) || (ax.n(this.a).getText().toString() == null) || (ax.n(this.a).getText().toString().equals("")));
                              d = a.d(ax.n(this.a).getText().toString());
                              if ((d > 0.001D) && (ax.r(this.a) == 3))
                              {
                                ax.n(this.a).setText(a.a(d - 0.001D, "0.000"));
                                return;
                              }
                              if ((d > 0.01D) && (ax.r(this.a) == 2))
                              {
                                ax.n(this.a).setText(a.a(d - 0.01D, "0.00"));
                                return;
                              }
                              ax.n(this.a).setText("0");
                              return;
                            } while ((ax.b(this.a) == null) || (ax.q(this.a).getText().toString().equals("")));
                            if ((ax.n(this.a).getText().toString() != null) && (!ax.n(this.a).getText().toString().equals("")))
                            {
                              d = a.d(ax.n(this.a).getText().toString());
                              if (ax.r(this.a) == 3)
                              {
                                ax.n(this.a).setText(a.a(d + 0.001D, "0.000"));
                                return;
                              }
                              ax.n(this.a).setText(a.a(d + 0.01D, "0.00"));
                              return;
                            }
                            if (ax.r(this.a) == 3)
                            {
                              ax.n(this.a).setText("0.001");
                              return;
                            }
                            ax.n(this.a).setText("0.01");
                            return;
                          } while (ax.s(this.a).getText().toString().equals("--"));
                          ax.n(this.a).setText(ax.s(this.a).getText().toString());
                          return;
                        } while (ax.t(this.a).getText().toString().equals("--"));
                        ax.n(this.a).setText(ax.t(this.a).getText().toString());
                        return;
                      } while (ax.u(this.a).getText().toString().equals("--"));
                      ax.n(this.a).setText(ax.u(this.a).getText().toString());
                      return;
                    } while (ax.v(this.a).getText().toString().equals("--"));
                    ax.n(this.a).setText(ax.v(this.a).getText().toString());
                    return;
                  } while (ax.w(this.a).getText().toString().equals("--"));
                  ax.n(this.a).setText(ax.w(this.a).getText().toString());
                  return;
                } while (ax.x(this.a).getText().toString().equals("--"));
                ax.n(this.a).setText(ax.x(this.a).getText().toString());
                return;
              } while (ax.y(this.a).getText().toString().equals("--"));
              ax.n(this.a).setText(ax.y(this.a).getText().toString());
              return;
            } while (ax.z(this.a).getText().toString().equals("--"));
            ax.n(this.a).setText(ax.z(this.a).getText().toString());
            return;
          } while (ax.A(this.a).getText().toString().equals("--"));
          ax.n(this.a).setText(ax.A(this.a).getText().toString());
          return;
        } while (ax.B(this.a).getText().toString().equals("--"));
        ax.n(this.a).setText(ax.B(this.a).getText().toString());
        return;
      } while (ax.C(this.a).getText().toString().equals("--"));
      ax.n(this.a).setText(ax.C(this.a).getText().toString());
      return;
    } while (ax.D(this.a).getText().toString().equals("--"));
    ax.n(this.a).setText(ax.D(this.a).getText().toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */