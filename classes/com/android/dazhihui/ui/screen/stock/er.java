package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class er
  implements View.OnClickListener
{
  er(eq parameq, es parames) {}
  
  public void onClick(View paramView)
  {
    if ((this.a == null) || (es.b(this.a) == null))
    {
      this.b.a.showShortToast("联系人号码为空!");
      return;
    }
    paramView = "";
    int i = 0;
    if (i < es.b(this.a).size())
    {
      if (i == 0) {}
      for (paramView = (String)es.b(this.a).get(i);; paramView = paramView + "," + (String)es.b(this.a).get(i))
      {
        i += 1;
        break;
      }
    }
    paramView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + paramView));
    paramView.putExtra("sms_body", "加我好友吧，看我股票池！下载地址：http://wapgw.cn/gqhb【大智慧】");
    this.b.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */