package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.dazhihui.g;
import com.android.dazhihui.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;

public class StockChartScreen
  extends AdvertBaseActivity
{
  private long a = SystemClock.uptimeMillis();
  private View b;
  private com.android.dazhihui.d.av c;
  private uv d;
  
  private void d()
  {
    long l = SystemClock.uptimeMillis() - this.a;
    this.a = SystemClock.uptimeMillis();
    if (l > 0L) {
      g.a().a(m.f, l);
    }
  }
  
  public uv a()
  {
    return this.d;
  }
  
  public void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      setRequestedOrientation(1);
      this.c.a();
      return;
    }
    setRequestedOrientation(-1);
    this.c.a(this);
  }
  
  public void b()
  {
    getWindow().addFlags(1024);
  }
  
  public void c()
  {
    getWindow().clearFlags(1024);
  }
  
  protected void init(Bundle paramBundle)
  {
    if (getResources().getConfiguration().orientation == 2) {
      b();
    }
    for (;;)
    {
      if (SelfSelectedStockManager.getInstance().getSelfStockVectorSize() <= 0) {
        SelfSelectedStockManager.getInstance().loadDataFromLocal();
      }
      this.b = new FrameLayout(this);
      this.b.setId(Integer.MAX_VALUE);
      setContentView(this.b);
      if (paramBundle == null)
      {
        this.d = new uv();
        if (getIntent() != null)
        {
          paramBundle = getIntent().getExtras();
          this.d.setBundle(paramBundle);
        }
        getSupportFragmentManager().a().a(this.b.getId(), this.d).b();
      }
      this.c = com.android.dazhihui.d.av.b(this);
      return;
      c();
    }
  }
  
  public void onBackPressed()
  {
    if ((this.d != null) && (this.d.f() != null))
    {
      StockChartContainer localStockChartContainer = this.d.f();
      if (((localStockChartContainer.getStockType() == vr.c) || (localStockChartContainer.getStockType() == vr.f)) && (localStockChartContainer.getSwitchType() == com.android.dazhihui.ui.widget.stockchart.av.f))
      {
        localStockChartContainer.a(com.android.dazhihui.ui.widget.stockchart.av.a);
        return;
      }
      super.onBackPressed();
      return;
    }
    super.onBackPressed();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2)
    {
      b();
      return;
    }
    c();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.c.a();
    setRequestedOrientation(1);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getExtras();
      this.d.a(paramIntent);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    d();
    this.c.a();
  }
  
  public void onResume()
  {
    super.onResume();
    this.a = SystemClock.uptimeMillis();
    this.c.a(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\StockChartScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */