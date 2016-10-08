package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.delegate.b.o;

class ci
  implements View.OnClickListener
{
  ci(IFundEntrust paramIFundEntrust) {}
  
  public void onClick(View paramView)
  {
    paramView = IFundEntrust.c(this.a).getText().toString();
    String str = IFundEntrust.d(this.a).getText().toString();
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
    StringBuilder localStringBuilder;
    if (IFundEntrust.e(this.a) == 2)
    {
      paramView = "场内基金认购";
      localStringBuilder = new StringBuilder().append("\t基金代码：").append(IFundEntrust.c(this.a).getText().toString()).append("\n\t基金名称：").append(IFundEntrust.b(this.a).getText().toString());
      if (IFundEntrust.e(this.a) != 2) {
        break label263;
      }
      str = "\n\t认购金额：";
      label169:
      localStringBuilder = localStringBuilder.append(str).append(IFundEntrust.d(this.a).getText().toString());
      if (IFundEntrust.e(this.a) != 2) {
        break label269;
      }
    }
    label263:
    label269:
    for (str = "\n\t\t是否确定认购？";; str = "\n\t\t是否确定申购？")
    {
      str = str;
      new AlertDialog.Builder(this.a).setTitle(paramView).setMessage(str).setPositiveButton("确定", new cj(this)).setNegativeButton("取消", null).show();
      return;
      paramView = "场内基金申购";
      break;
      str = "\n\t申购金额：";
      break label169;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */