package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.LeftMenuItem;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.Map;

class tr
  implements View.OnClickListener
{
  tr(ti paramti, LeftMenuVo.LeftMenuItem paramLeftMenuItem) {}
  
  public void onClick(View paramView)
  {
    int i = this.a.getCountId();
    if (i != 0) {
      n.a("", i);
    }
    paramView = this.a.getCallurl();
    Object localObject1;
    Object localObject2;
    if ("133".equals(paramView))
    {
      ah.a().a(1164);
      if (this.a.isShowRed())
      {
        this.a.setIsShowRed(false);
        localObject1 = this.b.getActivity().getSharedPreferences(DzhPushService.h, 0);
        localObject2 = String.valueOf(this.a.getCountId());
        if (ah.e.containsKey(localObject2))
        {
          RedPointVo localRedPointVo = (RedPointVo)ah.e.get(localObject2);
          if (localRedPointVo != null) {
            ((SharedPreferences)localObject1).edit().putString((String)localObject2, localRedPointVo.getVs()).commit();
          }
          ah.e.remove(localObject2);
        }
        ah.a().b(10001);
      }
      if ("20".equals(paramView)) {
        ti.b(this.b);
      }
      if ("dzh_browser_url&goto=0&screen=177".equals(paramView))
      {
        ti.a(this.b, d.a());
        if (ti.c(this.b).b("new_reply_my_bbs", 0) == 1)
        {
          ah.a().a(16);
          ti.c(this.b).a("new_reply_my_bbs", 0);
        }
        ti.c(this.b).g();
      }
      if ("http://htg.yundzh.com/friend/dynamicInfo?DZHSPECIAL=285".equals(paramView))
      {
        ti.a(this.b, d.a());
        if (ti.c(this.b).b("circlepointflag", 0) == 1)
        {
          ah.a().a(18);
          ti.c(this.b).a("circlepointflag", 0);
        }
        ti.c(this.b).g();
      }
      i = this.a.getCalltype();
      if (i != 4) {
        break label433;
      }
      n.a(this.a.getApppackage(), this.a.getCallurl(), this.b.getActivity());
    }
    for (;;)
    {
      ti.d(this.b).notifyDataSetChanged();
      return;
      if (this.a.getMenuflag() != 3) {
        break;
      }
      localObject1 = ti.a(this.b).getVersion() + this.a.getCountId() + this.a.getMenuname();
      ah.a().b(10, (String)localObject1);
      break;
      label433:
      if (i == 5)
      {
        paramView = r.a(this.a.getCallurl(), "")[1];
        paramView = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector(paramView);
        localObject1 = new Intent();
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("nexturl", paramView);
        ((Bundle)localObject2).putBoolean("ISHUITOUGU", true);
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        ((Intent)localObject1).setClass(this.b.getActivity(), BrowserActivity.class);
        this.b.startActivity((Intent)localObject1);
      }
      else
      {
        r.a(this.a.getCallurl(), this.b.getActivity(), "", null);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */