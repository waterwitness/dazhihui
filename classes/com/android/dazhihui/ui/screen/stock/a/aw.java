package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.NewsTitleVo;
import com.android.dazhihui.ui.model.stock.NewsTitleVo.NewsTitleItem;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;

class aw
  implements AdapterView.OnItemClickListener
{
  aw(au paramau) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (au.a(this.a) != null)
    {
      paramAdapterView = au.a(this.a).getNewsTitleList();
      if ((paramAdapterView != null) && (paramInt < paramAdapterView.size()))
      {
        paramAdapterView = (NewsTitleVo.NewsTitleItem)paramAdapterView.get(paramInt);
        paramAdapterView.getNavigationname();
        paramInt = paramAdapterView.getNavigationtype();
        if (paramAdapterView.getMenuflag() == 3)
        {
          paramView = paramView.getTag();
          if ((paramView != null) && ((paramView instanceof ay))) {
            ((ay)paramView).b.setVisibility(8);
          }
          paramView = au.a(this.a).getVersion() + paramAdapterView.getCountid() + paramAdapterView.getNavigationname();
          ah.a().b(14, paramView);
        }
        if ((paramInt != 4) && (paramInt != 5)) {
          break label289;
        }
        paramAdapterView = r.a(paramAdapterView.getLinkurl(), "");
        paramView = paramAdapterView[1];
        localBundle = paramAdapterView[0];
        paramAdapterView = paramView;
        if (paramInt == 5) {
          paramAdapterView = SelfSelectedStockManager.getInstance().appendSpecialBrowseStockVector(paramView);
        }
        if (!localBundle.equals("1")) {
          break label226;
        }
        paramView = new Intent();
        paramView.setAction("android.intent.action.VIEW");
        paramView.setData(Uri.parse(paramAdapterView));
        this.a.startActivity(paramView);
      }
    }
    return;
    label226:
    paramView = new Intent(this.a.getActivity(), BrowserActivity.class);
    Bundle localBundle = new Bundle();
    if (paramInt == 5) {
      localBundle.putBoolean("ISHUITOUGU", true);
    }
    localBundle.putString("nexturl", paramAdapterView);
    paramView.putExtras(localBundle);
    this.a.startActivity(paramView);
    return;
    label289:
    paramView = new Intent();
    paramView.setClass(this.a.getActivity(), MoreNewsListScreen.class);
    paramView.putExtra("name", paramAdapterView.getNavigationname());
    paramView.putExtra("type", paramAdapterView.getNavigationtype());
    paramView.putExtra("url", paramAdapterView.getLinkurl());
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */