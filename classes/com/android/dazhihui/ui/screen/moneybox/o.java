package com.android.dazhihui.ui.screen.moneybox;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.d.n;

class o
  implements View.OnClickListener
{
  o(FundRedemption paramFundRedemption) {}
  
  public void onClick(View paramView)
  {
    if (this.a.i.getText().length() == 0) {
      this.a.a(this.a, "提示", "请输入金额！", "确定", 0);
    }
    for (;;)
    {
      n.a("", 1169);
      return;
      paramView = "" + "赎回产品：" + this.a.h.getText().toString() + "\n";
      paramView = paramView + "金额  ( 元 )：" + this.a.i.getText() + "\n" + "\n";
      paramView = paramView + "确定交易吗？";
      this.a.a(this.a, "赎回", paramView, 1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */