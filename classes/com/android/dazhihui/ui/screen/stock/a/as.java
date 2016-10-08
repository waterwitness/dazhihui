package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.PlateListScreen;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class as
  implements mc
{
  as(ao paramao) {}
  
  public void a(int paramInt)
  {
    boolean bool = false;
    Object localObject;
    if (paramInt == 0)
    {
      if ((ao.d(this.a) != null) && (ao.d(this.a).isMenu()) && (this.a.getActivity() != null) && ((this.a.getActivity() instanceof MainScreen)))
      {
        paramInt = ao.d(this.a).getCurrentChild();
        ao.a(this.a, MarketManager.get().getChildList(ao.d(this.a).getName()));
        if ((ao.e(this.a) != null) && (paramInt < ao.e(this.a).size()))
        {
          if (this.a.S.isShowing()) {
            this.a.S.dismiss();
          }
          localObject = new int[2];
          ao.b(this.a).getLocationOnScreen((int[])localObject);
          paramInt = (int)this.a.getResources().getDimension(2131230820);
          this.a.S.showAtLocation(ao.f(this.a), 51, 0, localObject[1] + paramInt);
        }
      }
      return;
    }
    int i = ao.b(this.a, paramInt);
    if (ao.g(this.a) == i)
    {
      localObject = this.a;
      if (ao.h(this.a) == 0)
      {
        i = 1;
        ao.a((ao)localObject, (byte)i);
        label234:
        localObject = ao.b(this.a);
        if (ao.h(this.a) != 0) {
          break label303;
        }
      }
    }
    for (;;)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      ao.b(this.a).a();
      this.a.refresh();
      return;
      i = 0;
      break;
      ao.c(this.a, i);
      ao.a(this.a, (byte)0);
      break label234;
      label303:
      bool = true;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    Object localObject2 = ao.b(this.a).getDataModel();
    Object localObject1 = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < ((List)localObject2).size())
    {
      localmh = (mh)((List)localObject2).get(paramInt);
      if (localmh != parammh) {
        break label241;
      }
      i = paramInt;
    }
    label241:
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
        ((Intent)localObject1).setClass(this.a.getActivity(), PlateListScreen.class);
        this.a.startActivity((Intent)localObject1);
        return;
      }
      parammh.putParcelable("stock_vo", (Parcelable)localObject2);
      r.a(this.a.getActivity(), (Vector)localObject1, i, parammh);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */