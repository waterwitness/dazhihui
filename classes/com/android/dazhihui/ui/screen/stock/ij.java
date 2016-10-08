package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;
import java.util.Vector;

class ij
  implements mc
{
  ij(MarketListScreen paramMarketListScreen) {}
  
  public void a(int paramInt)
  {
    int i = MarketListScreen.b(this.a, paramInt);
    Object localObject;
    if (MarketListScreen.e(this.a) == i)
    {
      localObject = this.a;
      if (MarketListScreen.f(this.a) == 0)
      {
        i = 1;
        MarketListScreen.a((MarketListScreen)localObject, (byte)i);
        label44:
        localObject = MarketListScreen.b(this.a);
        if (MarketListScreen.f(this.a) != 0) {
          break label126;
        }
      }
    }
    label126:
    for (boolean bool = false;; bool = true)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      MarketListScreen.b(this.a).a();
      this.a.a(0, true);
      MarketListScreen.a(this.a, 0);
      return;
      i = 0;
      break;
      MarketListScreen.c(this.a, i);
      MarketListScreen.a(this.a, (byte)0);
      break label44;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    Object localObject2 = MarketListScreen.b(this.a).getDataModel();
    Object localObject1 = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < ((List)localObject2).size())
    {
      localmh = (mh)((List)localObject2).get(paramInt);
      if (localmh != parammh) {
        break label235;
      }
      i = paramInt;
    }
    label235:
    for (;;)
    {
      ((Vector)localObject1).add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
      paramInt += 1;
      break;
      parammh = new Bundle();
      localObject2 = (StockVo)((Vector)localObject1).get(i);
      if ((!TextUtils.isEmpty(((StockVo)localObject2).getCode())) && (((StockVo)localObject2).getCode().startsWith("BI")))
      {
        localObject1 = new MarketVo(((StockVo)localObject2).getName(), false, false, -1);
        parammh.putString("code", ((StockVo)localObject2).getCode());
        parammh.putParcelable("market_vo", (Parcelable)localObject1);
        localObject1 = new Intent();
        ((Intent)localObject1).putExtras(parammh);
        ((Intent)localObject1).setClass(this.a, PlateListScreen.class);
        this.a.startActivity((Intent)localObject1);
        return;
      }
      parammh.putParcelable("stock_vo", (Parcelable)localObject2);
      r.a(this.a, (Vector)localObject1, i, parammh);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */