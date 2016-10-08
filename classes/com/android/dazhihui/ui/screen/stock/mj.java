package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.df;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.SecondMenuItem;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.widget.NewsTabPageIndicator;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;
import java.util.Map;

class mj
  implements df
{
  mj(mf parammf) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    if ((mf.f(this.a) == null) || (mf.f(this.a).size() == 0) || (mf.f(this.a).size() <= paramInt)) {
      return;
    }
    n.a("", ((MenuConfigVo.SecondMenuItem)mf.f(this.a).get(paramInt)).countid);
    Object localObject2 = (MenuConfigVo.SecondMenuItem)mf.f(this.a).get(paramInt);
    String str = String.valueOf(((MenuConfigVo.SecondMenuItem)localObject2).countid);
    Object localObject1;
    if (ah.d.containsKey(str))
    {
      localObject1 = this.a.getActivity().getSharedPreferences(DzhPushService.h, 0);
      RedPointVo localRedPointVo = (RedPointVo)ah.d.get(str);
      if (localRedPointVo != null) {
        ((SharedPreferences)localObject1).edit().putString(str, localRedPointVo.getVs()).commit();
      }
      ah.d.remove(str);
      this.a.a(mf.f(this.a));
    }
    if ((((MenuConfigVo.SecondMenuItem)localObject2).type == 4) || (((MenuConfigVo.SecondMenuItem)localObject2).type == 5))
    {
      localObject1 = r.a(((MenuConfigVo.SecondMenuItem)localObject2).urlPath, "");
      str = localObject1[1];
      localObject1 = localObject1[0];
      if (((MenuConfigVo.SecondMenuItem)localObject2).type == 5) {
        str = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector(str);
      }
    }
    for (;;)
    {
      if (((String)localObject1).equals("0"))
      {
        localObject1 = new Intent(this.a.getActivity(), BrowserActivity.class);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("nexturl", str);
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        this.a.startActivity((Intent)localObject1);
        mf.c(this.a).postDelayed(new mk(this), 500L);
        return;
        if ((((MenuConfigVo.SecondMenuItem)localObject2).type == 4) && (((MenuConfigVo.SecondMenuItem)localObject2).name.equals("新股"))) {
          if (str.contains("?")) {
            str = str + "&kjsg=1";
          } else {
            str = str + "?kjsg=1";
          }
        }
      }
      else
      {
        if (((String)localObject1).equals("1"))
        {
          localObject1 = new Intent();
          ((Intent)localObject1).setAction("android.intent.action.VIEW");
          ((Intent)localObject1).setData(Uri.parse(str));
          this.a.startActivity((Intent)localObject1);
          mf.c(this.a).postDelayed(new ml(this), 500L);
          return;
        }
        mf.a(this.a, paramInt);
        return;
        mf.a(this.a, paramInt);
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */