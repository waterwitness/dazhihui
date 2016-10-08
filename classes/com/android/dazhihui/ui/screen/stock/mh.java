package com.android.dazhihui.ui.screen.stock;

import android.support.v4.view.ax;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.widget.MyViewPager;
import com.android.dazhihui.ui.widget.NewsTabPageIndicator;
import com.android.dazhihui.ui.widget.PageLoadTip;
import java.util.List;

class mh
  implements Runnable
{
  mh(mg parammg) {}
  
  public void run()
  {
    try
    {
      mf.a(this.a.a, MenuManager.getInstance().getNewsMenu());
      mf.b(this.a.a, ((MenuConfigVo.FirstMenuItem)mf.a(this.a.a).get(0)).subnames);
      mf.b(this.a.a).getAdapter().notifyDataSetChanged();
      mf.c(this.a.a).b();
      mf.c(this.a.a).setVisibility(0);
      mf.d(this.a.a).a();
      mf.e(this.a.a);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */