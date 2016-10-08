package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.PopupListAdpater;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;
import java.util.Vector;

class te
  implements mc
{
  te(SelfStockLandScapeScreen paramSelfStockLandScapeScreen) {}
  
  public void a(int paramInt)
  {
    boolean bool = false;
    Object localObject;
    if (paramInt == 0)
    {
      localObject = (LinearLayout)LayoutInflater.from(this.a).inflate(2130903573, null);
      ListView localListView = (ListView)((LinearLayout)localObject).findViewById(2131561263);
      ((LinearLayout)localObject).setGravity(17);
      if ((SelfStockLandScapeScreen.d(this.a) == null) || (SelfStockLandScapeScreen.d(this.a).length != 4)) {
        SelfStockLandScapeScreen.a(this.a, this.a.getResources().getStringArray(2131361852));
      }
      if ((SelfStockLandScapeScreen.e(this.a) == null) || (SelfStockLandScapeScreen.e(this.a).length != 4)) {
        SelfStockLandScapeScreen.a(this.a, new int[] { 101, 106, 107, 109 });
      }
      localListView.setAdapter(new PopupListAdpater(this.a, SelfStockLandScapeScreen.e(this.a), SelfStockLandScapeScreen.d(this.a)));
      localListView.setOnItemClickListener(this.a);
      SelfStockLandScapeScreen.f(this.a).setContentView((View)localObject);
      localObject = new int[2];
      SelfStockLandScapeScreen.b(this.a).getLocationOnScreen((int[])localObject);
      SelfStockLandScapeScreen.f(this.a).showAtLocation(SelfStockLandScapeScreen.b(this.a), 0, 0, localObject[1] + SelfStockLandScapeScreen.b(this.a).getHeaderHeight());
      return;
    }
    int i;
    if (SelfStockLandScapeScreen.g(this.a) == paramInt)
    {
      localObject = this.a;
      if (SelfStockLandScapeScreen.h(this.a) == 0)
      {
        i = 1;
        SelfStockLandScapeScreen.a((SelfStockLandScapeScreen)localObject, (byte)i);
        label269:
        localObject = SelfStockLandScapeScreen.b(this.a);
        if (SelfStockLandScapeScreen.h(this.a) != 0) {
          break label329;
        }
      }
    }
    for (;;)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      SelfStockLandScapeScreen.i(this.a);
      return;
      i = 0;
      break;
      SelfStockLandScapeScreen.a(this.a, paramInt);
      SelfStockLandScapeScreen.a(this.a, (byte)0);
      break label269;
      label329:
      bool = true;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    List localList = SelfStockLandScapeScreen.b(this.a).getDataModel();
    Vector localVector = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < localList.size())
    {
      localmh = (mh)localList.get(paramInt);
      if (localmh != parammh) {
        break label139;
      }
      i = paramInt;
    }
    label139:
    for (;;)
    {
      localVector.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
      paramInt += 1;
      break;
      parammh = new Bundle();
      parammh.putParcelable("stock_vo", (Parcelable)localVector.get(i));
      r.a(this.a, localVector, i, parammh);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\te.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */