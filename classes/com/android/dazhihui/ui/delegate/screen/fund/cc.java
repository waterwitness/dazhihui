package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.delegate.b.o;

class cc
  implements View.OnClickListener
{
  cc(IFundAtone paramIFundAtone) {}
  
  public void onClick(View paramView)
  {
    paramView = IFundAtone.d(this.a).getText().toString();
    String str = IFundAtone.e(this.a).getText().toString();
    if ((paramView.length() == 0) || (str.length() == 0))
    {
      this.a.b(0);
      return;
    }
    if (paramView.length() != 6)
    {
      this.a.b(1);
      return;
    }
    if ((o.z == null) || (o.z.length == 0))
    {
      this.a.b(2);
      return;
    }
    paramView = "\t基金代码：" + IFundAtone.d(this.a).getText().toString() + "\n\t基金名称：" + IFundAtone.c(this.a).getText().toString() + "\n\t赎回份额：" + IFundAtone.e(this.a).getText().toString() + "\n\t\t是否确定赎回？";
    new AlertDialog.Builder(this.a).setTitle("场内基金赎回").setMessage(paramView).setPositiveButton("确定", new cd(this)).setNegativeButton("取消", null).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */