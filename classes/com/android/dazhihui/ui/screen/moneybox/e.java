package com.android.dazhihui.ui.screen.moneybox;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;

class e
  implements View.OnClickListener
{
  e(FundHome paramFundHome) {}
  
  public void onClick(View paramView)
  {
    if (o.r())
    {
      this.a.d.setText("同步中…");
      FundHome.a(this.a).setDuration(3000L);
      FundHome.a(this.a).setRepeatCount(-1);
      FundHome.b(this.a).setAnimation(FundHome.a(this.a));
      FundHome.a(this.a).startNow();
      this.a.c();
      return;
    }
    this.a.a(this.a, "提示", "请登录券商委托后同步数据！", 1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */