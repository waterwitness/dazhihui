package com.android.dazhihui.ui.delegate.screen;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.bo;

class fh
  implements bo
{
  fh(dy paramdy) {}
  
  public void a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return;
    }
    if (o.t(paramString))
    {
      dy.o(this.a).setVisibility(8);
      dy.p(this.a).setVisibility(0);
      String[] arrayOfString = o.u(paramString);
      if (arrayOfString == null) {}
      for (paramString = "尊敬的用户：\n        即日起，您可以点击下方按钮直接打开“" + paramString + "”进行委托交易，给您带来不便深表歉意，敬请谅解！";; paramString = arrayOfString[0])
      {
        dy.q(this.a).setText(paramString);
        dy.r(this.a).setText("打开委托");
        return;
      }
    }
    if (com.android.dazhihui.c.a.a.E != null)
    {
      paramInt = 0;
      if (paramInt < com.android.dazhihui.c.a.a.E.length) {
        if (!com.android.dazhihui.c.a.a.E[paramInt][0].equals(paramString)) {}
      }
    }
    for (paramInt = 1;; paramInt = 0)
    {
      if (paramInt == 0)
      {
        dy.o(this.a).setVisibility(8);
        dy.p(this.a).setVisibility(0);
        dy.q(this.a).setText("        即日起，“" + paramString + "”调用模式由外挂模式调整为内嵌模式，之前给您带来的不便敬请谅解！\n" + "         亲们仍然可以从平台中选择“" + paramString + "”进行委托交易；\n");
        dy.r(this.a).setText("进入交易");
        return;
        paramInt += 1;
        break;
      }
      dy.o(this.a).setVisibility(0);
      dy.p(this.a).setVisibility(8);
      dy.r(this.a).setText("登录");
      if ((o.s != null) && (!o.s.equals(paramString))) {
        o.r = false;
      }
      dy.a(this.a, false);
      com.android.dazhihui.ui.delegate.a.a().a("");
      com.android.dazhihui.ui.delegate.a.a().b("");
      dy.c(this.a, paramString);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */