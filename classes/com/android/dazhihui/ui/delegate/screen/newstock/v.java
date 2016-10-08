package com.android.dazhihui.ui.delegate.screen.newstock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import java.math.BigDecimal;

class v
  implements View.OnClickListener
{
  v(p paramp) {}
  
  public void onClick(View paramView)
  {
    String str = "";
    if ((p.m(this.a) == null) || (p.f(this.a).getText().toString().equals("")) || (p.h(this.a).getText().toString().equals("")))
    {
      this.a.a(0);
      return;
    }
    int i = o.z.length - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (!o.z[i][0].equals(p.n(this.a))) {
          break label159;
        }
        if (o.z[i][2].equals("1")) {
          p.a(this.a, o.z[i][1]);
        }
      }
      else
      {
        if (p.o(this.a) != null) {
          break;
        }
        this.a.a(1);
        return;
      }
      p.a(this.a, o.z[i][1]);
      label159:
      i -= 1;
    }
    paramView = str;
    if (p.g(this.a) != null)
    {
      paramView = str;
      if (!p.g(this.a).equals(""))
      {
        paramView = str;
        if (!p.g(this.a).equals("-"))
        {
          paramView = str;
          if (n.i(p.h(this.a).getText().toString(), p.g(this.a)).intValue() > 0) {
            paramView = "申购数量大于可申购上限，申购可能不成功。\n";
          }
        }
      }
    }
    paramView = "股东账号: " + p.o(this.a) + "\n" + "申购代码: " + p.m(this.a) + "\n" + "股票名称: " + p.e(this.a).getText().toString() + "\n" + "委托数量: " + p.h(this.a).getText().toString() + "\n" + "委托价格: " + p.f(this.a).getText().toString() + "\n" + paramView + "是否交易？";
    new AlertDialog.Builder(this.a.getActivity()).setTitle("申购").setMessage(paramView).setPositiveButton("申购", new x(this)).setNegativeButton("取消", new w(this)).create().show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */