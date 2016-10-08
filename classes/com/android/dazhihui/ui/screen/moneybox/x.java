package com.android.dazhihui.ui.screen.moneybox;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.n;

class x
  implements View.OnClickListener
{
  x(FundSubscription paramFundSubscription) {}
  
  public void onClick(View paramView)
  {
    if (this.a.n.getText().length() == 0) {
      this.a.a(this.a, "提示", "请输入金额！", "确定", 0);
    }
    for (;;)
    {
      n.a("", 1168);
      return;
      paramView = "" + "申购产品：" + this.a.o.getText() + "\n";
      paramView = paramView + "金额  ( 元 )：" + this.a.n.getText() + "\n" + "\n";
      paramView = paramView + "确定交易吗？";
      this.a.a(this.a, "申购", paramView, 1);
      FundSubscription.a(this.a, this.a.n.getText().toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */