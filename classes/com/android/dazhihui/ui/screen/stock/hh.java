package com.android.dazhihui.ui.screen.stock;

import android.util.Log;
import com.android.dazhihui.service.DownloadService;

class hh
  implements Runnable
{
  hh(hg paramhg) {}
  
  public void run()
  {
    Log.i("GUH", "MainScreen backgroud update by receiver mUpdateHandle=" + MainScreen.a(this.a.a));
    if ((MainScreen.c(this.a.a).Q()) && (!MainScreen.a(this.a.a)) && (com.android.dazhihui.a.g.a().o()) && (com.android.dazhihui.a.g.a().q() == 1) && (DownloadService.a(this.a.a, MainScreen.c(this.a.a).P(), true, true)))
    {
      Log.i("GUH", "MainScreen backgroud update by receiver startDownloadService");
      MainScreen.a(this.a.a, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */