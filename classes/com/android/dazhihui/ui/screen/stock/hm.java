package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.dazhihui.service.DownloadService;

class hm
  implements Runnable
{
  hm(MainScreen paramMainScreen) {}
  
  public void run()
  {
    if (MainScreen.c(this.a).Q())
    {
      Log.i("GUH", "MainScreen mNotifyTask  mUpdateHandle=" + MainScreen.a(this.a) + " mRemindUpdateAgain=" + MainScreen.c(this.a).T());
      if (MainScreen.a(this.a)) {}
      do
      {
        return;
        if (DownloadService.b(this.a, MainScreen.c(this.a).P()))
        {
          MainScreen.a(this.a, true);
          Intent localIntent = new Intent();
          Bundle localBundle = new Bundle();
          localBundle.putInt("screenId", 11);
          localBundle.putString("title", "大智慧更新");
          localBundle.putString("message", "\n大智慧更新包下载完成.\n");
          localBundle.putString("save_path", DownloadService.a());
          localIntent.setClass(this.a, DialogActivity.class);
          localIntent.setFlags(268435456);
          localIntent.putExtras(localBundle);
          this.a.startActivity(localIntent);
          this.a.overridePendingTransition(0, 0);
          return;
        }
        if ((com.android.dazhihui.a.g.a().o()) && (com.android.dazhihui.a.g.a().q() == 1) && (DownloadService.a(this.a, MainScreen.c(this.a).P(), true, true)))
        {
          Log.i("GUH", "MainScreen backgroud update by mNotifyTask startDownloadService");
          MainScreen.a(this.a, true);
          return;
        }
      } while (MainScreen.c(this.a).T() != 0);
      MainScreen.e(this.a);
      MainScreen.a(this.a, true);
      return;
    }
    MainScreen.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */