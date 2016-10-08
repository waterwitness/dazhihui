package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.HomeViewAdapter;
import java.util.List;
import java.util.Vector;

class su
  implements ExpandableListView.OnChildClickListener
{
  su(sk paramsk) {}
  
  public boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    paramExpandableListView = paramView.getTag();
    if ((paramExpandableListView != null) && ((paramExpandableListView instanceof SelfStock)))
    {
      paramExpandableListView = (SelfStock)paramExpandableListView;
      sk.c(this.a).w();
      if (paramExpandableListView.getSelfType() != 0) {
        break label180;
      }
      paramExpandableListView = sk.d(this.a).getSelfStockVector();
      if ((paramExpandableListView == null) || (paramExpandableListView.size() <= 0)) {
        break label320;
      }
    }
    label180:
    label194:
    label320:
    for (paramView = (SelfStock)paramExpandableListView.get(paramInt2);; paramView = null)
    {
      Object localObject;
      if ((paramView != null) && (!TextUtils.isEmpty(paramView.getCode())))
      {
        localObject = paramView.getCode();
        if (!((String)localObject).contains("BI")) {
          break label194;
        }
        paramView = new MarketVo(paramView.getName(), false, false, -1);
        paramExpandableListView = new Bundle();
        paramExpandableListView.putString("code", (String)localObject);
        paramExpandableListView.putParcelable("market_vo", paramView);
        paramView = new Intent();
        paramView.putExtras(paramExpandableListView);
        paramView.setClass(this.a.getActivity(), PlateListScreen.class);
        this.a.startActivity(paramView);
      }
      for (;;)
      {
        return true;
        paramExpandableListView = sk.e(this.a).getBrowseStockVector();
        break;
        paramView = new Vector();
        paramInt1 = 0;
        while (paramInt1 < paramExpandableListView.size())
        {
          localObject = (SelfStock)paramExpandableListView.get(paramInt1);
          paramView.add(new StockVo(((SelfStock)localObject).getName(), ((SelfStock)localObject).getCode(), ((SelfStock)localObject).getType(), ((SelfStock)localObject).isLoan(), ((SelfStock)localObject).getSelfLatestPrice(), ((SelfStock)localObject).getSelfGrowthRate(), ((SelfStock)localObject).getSelfUpDown()));
          paramInt1 += 1;
        }
        paramExpandableListView = new Bundle();
        paramExpandableListView.putParcelable("stock_vo", (Parcelable)paramView.get(paramInt2));
        r.a(this.a.getActivity(), paramView, paramInt2, paramExpandableListView);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */