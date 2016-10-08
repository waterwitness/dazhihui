package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;
import java.util.Vector;

class ay
  implements mc
{
  ay(CorrelationStockScreen paramCorrelationStockScreen) {}
  
  public void a(int paramInt)
  {
    boolean bool = false;
    Object localObject;
    int i;
    if (CorrelationStockScreen.d(this.a) == paramInt)
    {
      localObject = this.a;
      if (CorrelationStockScreen.e(this.a) == 0)
      {
        i = 1;
        CorrelationStockScreen.a((CorrelationStockScreen)localObject, (byte)i);
        label38:
        localObject = CorrelationStockScreen.b(this.a);
        if (CorrelationStockScreen.e(this.a) != 0) {
          break label97;
        }
      }
    }
    for (;;)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      CorrelationStockScreen.f(this.a);
      return;
      i = 0;
      break;
      CorrelationStockScreen.a(this.a, paramInt);
      CorrelationStockScreen.a(this.a, (byte)0);
      break label38;
      label97:
      bool = true;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    CorrelationStockScreen.g(this.a).w();
    List localList = CorrelationStockScreen.b(this.a).getDataModel();
    Vector localVector = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < localList.size())
    {
      localmh = (mh)localList.get(paramInt);
      if (localmh != parammh) {
        break label149;
      }
      i = paramInt;
    }
    label149:
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */