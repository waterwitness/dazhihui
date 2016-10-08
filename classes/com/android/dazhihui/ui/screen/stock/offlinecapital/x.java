package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import java.io.PrintStream;
import java.util.Vector;

class x
  implements View.OnClickListener
{
  x(OfflineCapitalMine paramOfflineCapitalMine) {}
  
  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560157: 
      System.out.println("点击同步");
      com.android.dazhihui.d.n.a("", 20118);
      OfflineCapitalMine.a(this.a, ((n)OfflineCapitalMine.a(this.a).get(i)).c().split("_"));
      if ((o.r()) && (OfflineCapitalMine.e(this.a) != null) && (OfflineCapitalMine.f(this.a)[0].equals(OfflineCapitalMine.e(this.a).c())) && (((n)OfflineCapitalMine.a(this.a).get(i)).b().equals(OfflineCapitalMine.e(this.a).d())))
      {
        System.out.println("点击同步     登陆了");
        if (o.l()) {
          this.a.j();
        }
        for (;;)
        {
          OfflineCapitalMine.a(this.a, true);
          OfflineCapitalMine.a(this.a, i);
          return;
          if (o.m())
          {
            OfflineCapitalMine.a(this.a, o.p);
            this.a.a(o.g);
          }
          else
          {
            this.a.h();
          }
        }
      }
      System.out.println("点击同步    未 登陆了");
      o.r = true;
      o.s = OfflineCapitalMine.f(this.a)[0];
      o.u();
      paramView = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putInt("TAB_ID", 805306368);
      localBundle.putInt("fragment_index", 0);
      paramView.setClass(this.a.getApplicationContext(), MainScreen.class);
      paramView.putExtras(localBundle);
      paramView.addFlags(67108864);
      this.a.startActivity(paramView);
      return;
    }
    paramView = new Intent();
    paramView.putExtra("entrustName", ((n)OfflineCapitalMine.a(this.a).get(i)).c());
    paramView.setClass(this.a.getApplicationContext(), OfflineCapitalDetailActivity.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */