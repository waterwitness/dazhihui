package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class oo
  implements mc
{
  oo(PlateListScreen paramPlateListScreen) {}
  
  public void a(int paramInt)
  {
    int i = PlateListScreen.b(this.a, paramInt);
    Object localObject;
    if (PlateListScreen.a(this.a) == i)
    {
      localObject = this.a;
      if (PlateListScreen.b(this.a) == 0)
      {
        i = 1;
        PlateListScreen.a((PlateListScreen)localObject, (byte)i);
        label44:
        localObject = PlateListScreen.c(this.a);
        if (PlateListScreen.b(this.a) != 0) {
          break label126;
        }
      }
    }
    label126:
    for (boolean bool = false;; bool = true)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      PlateListScreen.c(this.a).a();
      PlateListScreen.a(this.a, 0, true);
      PlateListScreen.a(this.a, 0);
      return;
      i = 0;
      break;
      PlateListScreen.c(this.a, i);
      PlateListScreen.a(this.a, (byte)0);
      break label44;
    }
  }
  
  public void a(mh parammh)
  {
    Vector localVector = new Vector();
    localVector.add(new StockVo(parammh.a[0], (String)parammh.k[0], parammh.g, false));
    parammh = PlateListScreen.c(this.a).getDataModel().iterator();
    while (parammh.hasNext())
    {
      mh localmh = (mh)parammh.next();
      localVector.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
    }
    parammh = new Bundle();
    parammh.putParcelable("stock_vo", (Parcelable)localVector.get(0));
    r.a(this.a, localVector, 0, parammh);
  }
  
  public void a(mh parammh, int paramInt)
  {
    List localList = PlateListScreen.c(this.a).getDataModel();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */