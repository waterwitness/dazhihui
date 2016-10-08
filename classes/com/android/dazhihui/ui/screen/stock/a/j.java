package com.android.dazhihui.ui.screen.stock.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class j
  implements mc
{
  j(f paramf) {}
  
  public void a(int paramInt)
  {
    boolean bool = false;
    Object localObject;
    if (paramInt == 0)
    {
      if ((f.a(this.a) != null) && (f.a(this.a).isMenu()) && (this.a.getActivity() != null) && ((this.a.getActivity() instanceof MainScreen)))
      {
        paramInt = f.a(this.a).getCurrentChild();
        f.a(this.a, MarketManager.get().getChildList(f.a(this.a).getName()));
        if ((f.b(this.a) != null) && (paramInt < f.b(this.a).size()))
        {
          if (this.a.c.isShowing()) {
            this.a.c.dismiss();
          }
          localObject = new int[2];
          f.c(this.a).getLocationOnScreen((int[])localObject);
          paramInt = (int)this.a.getResources().getDimension(2131230820);
          this.a.c.showAtLocation(f.d(this.a), 51, 0, localObject[1] + paramInt);
        }
      }
      return;
    }
    int i = f.b(this.a, paramInt);
    if (f.e(this.a) == i)
    {
      localObject = this.a;
      if (f.f(this.a) == 0)
      {
        i = 1;
        f.a((f)localObject, (byte)i);
        label234:
        localObject = f.c(this.a);
        if (f.f(this.a) != 0) {
          break label303;
        }
      }
    }
    for (;;)
    {
      ((TableLayoutGroup)localObject).a(paramInt, bool);
      f.c(this.a).a();
      this.a.refresh();
      return;
      i = 0;
      break;
      f.c(this.a, i);
      f.a(this.a, (byte)0);
      break label234;
      label303:
      bool = true;
    }
  }
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    Object localObject = f.c(this.a).getDataModel();
    Vector localVector = new Vector();
    paramInt = 0;
    int i = 0;
    mh localmh;
    if (paramInt < ((List)localObject).size())
    {
      localmh = (mh)((List)localObject).get(paramInt);
      if (localmh != parammh) {
        break label202;
      }
      i = paramInt;
    }
    label202:
    for (;;)
    {
      localVector.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h, localmh.a[1], localmh.a[2], localmh.a[3]));
      paramInt += 1;
      break;
      parammh = new Bundle();
      localObject = (mh)((List)localObject).get(i);
      parammh.putParcelable("stock_vo", new StockVo(localObject.a[0], (String)localObject.k[0], ((mh)localObject).g, ((mh)localObject).h));
      r.a(this.a.getActivity(), localVector, i, parammh);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */