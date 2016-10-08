package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;
import java.util.Vector;

class nu
  implements mc
{
  nu(OptionListActivity paramOptionListActivity) {}
  
  public void a(int paramInt)
  {
    boolean bool = true;
    int i = this.a.a(paramInt);
    Object localObject;
    if (OptionListActivity.d(this.a) == i)
    {
      localObject = this.a;
      if (OptionListActivity.e(this.a) == 0)
      {
        i = 1;
        OptionListActivity.a((OptionListActivity)localObject, (byte)i);
      }
    }
    for (;;)
    {
      localObject = OptionListActivity.f(this.a);
      if (OptionListActivity.e(this.a) == 0) {
        bool = false;
      }
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      OptionListActivity.f(this.a).a();
      OptionListActivity.a(this.a, 0, OptionListActivity.c(this.a));
      return;
      i = 0;
      break;
      OptionListActivity.b(this.a, i);
      OptionListActivity.a(this.a, (byte)0);
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    Vector localVector = new Vector();
    List localList = OptionListActivity.f(this.a).getDataModel();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */