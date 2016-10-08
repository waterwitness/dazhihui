package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.DropDownEditTextView;

class w
  implements View.OnClickListener
{
  w(t paramt) {}
  
  public void onClick(View paramView)
  {
    if ((t.d(this.a) == null) || (t.e(this.a).getText().toString().equals("")))
    {
      this.a.a(0);
      return;
    }
    String str = "";
    paramView = str;
    if (t.f(this.a) != null)
    {
      paramView = str;
      if (!t.f(this.a).equals(""))
      {
        paramView = str;
        if (Integer.parseInt(t.e(this.a).getText().toString()) > Integer.parseInt(t.f(this.a)))
        {
          paramView = str;
          if (Integer.parseInt(t.e(this.a).getText().toString()) > Integer.parseInt(t.f(this.a))) {
            paramView = "划转数量大于最大可划转数量，划转可能不成功。\n";
          }
        }
      }
    }
    if (t.g(this.a) == t.c)
    {
      str = "担保品转入";
      if (bg.a()) {
        break label314;
      }
    }
    label314:
    for (paramView = "信用账号: " + t.h(this.a).getCurrentItem() + "\n" + "证券代码: " + t.d(this.a) + "\n" + "委托数量: " + t.e(this.a).getText().toString() + "\n" + paramView + "\n" + "是否交易？";; paramView = "信用账号: " + t.h(this.a).getCurrentItem() + "\n" + "普通账号: " + t.i(this.a).getCurrentItem() + "\n" + "证券代码: " + t.d(this.a) + "\n" + "委托数量: " + t.e(this.a).getText().toString() + "\n" + paramView + "\n" + "是否交易？")
    {
      new AlertDialog.Builder(this.a.getActivity()).setTitle(str).setMessage(paramView).setPositiveButton("划转", new y(this)).setNegativeButton("取消", new x(this)).create().show();
      return;
      str = "担保品转出";
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */