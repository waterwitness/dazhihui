package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.ax;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class au
  implements ax
{
  au(at paramat) {}
  
  public void a(String paramString1, String paramString2)
  {
    Object localObject = m.a().v();
    ((Vector)localObject).clear();
    m.a().u(0);
    paramString2 = new StockVo(paramString2, paramString1, 1, false);
    ((Vector)localObject).add(paramString2);
    paramString1 = new Bundle();
    paramString1.putParcelable("stock_vo", paramString2);
    paramString2 = at.a(this.a).getSupportFragmentManager().d().iterator();
    while (paramString2.hasNext())
    {
      localObject = (Fragment)paramString2.next();
      if ((localObject instanceof uv)) {
        ((uv)localObject).a(paramString1);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */