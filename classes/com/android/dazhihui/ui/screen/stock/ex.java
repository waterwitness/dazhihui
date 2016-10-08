package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.AdvertUpPullData;
import com.android.dazhihui.w;

class ex
  implements View.OnClickListener
{
  ex(eu parameu, AdvertUpPullVo.AdvertUpPullData paramAdvertUpPullData) {}
  
  public void onClick(View paramView)
  {
    int j = -100;
    int i = j;
    try
    {
      if (!TextUtils.isEmpty(this.a.countid)) {
        i = Integer.parseInt(this.a.countid);
      }
      n.a("", i);
      paramView = r.a(this.a.urlPage, "");
      str = paramView[1];
      if (String.valueOf(false).equals(paramView[2]))
      {
        eu.a(this.b, str);
        return;
      }
    }
    catch (NumberFormatException paramView)
    {
      String str;
      for (;;)
      {
        paramView.printStackTrace();
        i = j;
      }
      if (!w.a().l())
      {
        paramView = new Intent(this.b.getActivity(), LoginMainScreen.class);
        paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        this.b.startActivity(paramView);
        return;
      }
      eu.a(this.b, str);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */