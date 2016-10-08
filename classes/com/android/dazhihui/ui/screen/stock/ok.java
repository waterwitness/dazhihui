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

class ok
  implements mc
{
  ok(oh paramoh) {}
  
  public void a(int paramInt)
  {
    boolean bool = true;
    int i = oh.b(this.a, paramInt);
    Object localObject;
    if (oh.c(this.a) == i)
    {
      localObject = this.a;
      if (oh.d(this.a) == 0)
      {
        i = 1;
        oh.a((oh)localObject, (byte)i);
      }
    }
    for (;;)
    {
      localObject = oh.b(this.a);
      if (oh.d(this.a) == 0) {
        bool = false;
      }
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      oh.b(this.a).a();
      if (oh.a(this.a) != 0) {
        break label131;
      }
      this.a.a(0, false);
      return;
      i = 0;
      break;
      oh.c(this.a, i);
      oh.a(this.a, (byte)0);
    }
    label131:
    this.a.a(false);
  }
  
  public void a(mh parammh)
  {
    Vector localVector = new Vector();
    localVector.add(new StockVo(parammh.a[0], (String)parammh.k[0], parammh.g, false));
    parammh = oh.b(this.a).getDataModel().iterator();
    while (parammh.hasNext())
    {
      mh localmh = (mh)parammh.next();
      localVector.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
    }
    parammh = new Bundle();
    parammh.putParcelable("stock_vo", (Parcelable)localVector.get(0));
    r.a(this.a.getActivity(), localVector, 0, parammh);
  }
  
  public void a(mh parammh, int paramInt)
  {
    List localList = oh.b(this.a).getDataModel();
    Vector localVector = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < localList.size())
    {
      localmh = (mh)localList.get(paramInt);
      if (localmh != parammh) {
        break label142;
      }
      i = paramInt;
    }
    label142:
    for (;;)
    {
      localVector.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
      paramInt += 1;
      break;
      parammh = new Bundle();
      parammh.putParcelable("stock_vo", (Parcelable)localVector.get(i));
      r.a(this.a.getActivity(), localVector, i, parammh);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */