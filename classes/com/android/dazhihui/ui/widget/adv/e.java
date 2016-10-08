package com.android.dazhihui.ui.widget.adv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.AdvertUpPullVo.AdvertUpPullData;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.w;

class e
  implements View.OnClickListener
{
  e(AdvertUpPullLayout paramAdvertUpPullLayout, AdvertUpPullVo.AdvertUpPullData paramAdvertUpPullData) {}
  
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
      if ("2".equals(this.a.view)) {
        if ((AdvertUpPullLayout.a(this.b) instanceof Activity))
        {
          r.a(this.a.urlPage, AdvertUpPullLayout.a(this.b), null, null);
          return;
        }
      }
    }
    catch (NumberFormatException paramView)
    {
      do
      {
        for (;;)
        {
          paramView.printStackTrace();
          i = j;
        }
        paramView = this.b.getRootView();
      } while (paramView == null);
      paramView = paramView.getContext();
      r.a(this.a.urlPage, paramView, null, null);
      return;
    }
    paramView = r.a(this.a.urlPage, "");
    String str = paramView[1];
    if (String.valueOf(false).equals(paramView[2]))
    {
      AdvertUpPullLayout.a(this.b, str);
      return;
    }
    if (!w.a().l())
    {
      paramView = new Intent(AdvertUpPullLayout.a(this.b), LoginMainScreen.class);
      paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
      AdvertUpPullLayout.a(this.b).startActivity(paramView);
      return;
    }
    AdvertUpPullLayout.a(this.b, str);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */