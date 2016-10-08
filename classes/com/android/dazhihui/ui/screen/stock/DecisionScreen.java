package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.ArrayList;

public class DecisionScreen
  extends AdvertBaseActivity
  implements View.OnClickListener, cs
{
  private View a = null;
  private View b = null;
  private View c = null;
  private View d = null;
  private View e = null;
  private View f = null;
  private View g = null;
  private View h = null;
  private View i = null;
  private DzhHeader j;
  private MyWebView k;
  
  private void a()
  {
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (bf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.j == null);
      this.j.a(paramy);
      return;
    } while (this.j == null);
    this.j.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8488;
    paramct.d = paramContext.getString(2131166339);
    paramct.p = new be(this);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903091);
    this.a = findViewById(2131558789);
    this.b = findViewById(2131558792);
    this.c = findViewById(2131558795);
    this.d = findViewById(2131558798);
    this.e = findViewById(2131558801);
    this.f = findViewById(2131558804);
    this.g = findViewById(2131558807);
    this.h = findViewById(2131558810);
    this.i = findViewById(2131558813);
    this.j = ((DzhHeader)findViewById(2131558788));
    this.j.a(this, this);
    a();
    this.k = ((MyWebView)findViewById(2131558816));
    this.k.setFocusable(false);
    this.k.getSettings().setBuiltInZoomControls(false);
    this.k.setHorizontalFadingEdgeEnabled(false);
    this.k.setHorizontalScrollBarEnabled(false);
    this.k.setHorizontalScrollbarOverlay(false);
    this.k.setVerticalFadingEdgeEnabled(false);
    this.k.setVerticalScrollBarEnabled(false);
    this.k.setVerticalScrollbarOverlay(false);
    this.k.setBackgroundColor(0);
    this.k.setStatisticsCountId(1420);
    this.k.setWebViewLoadListener(new bd(this));
    this.k.setLayerType(2, null);
    this.k.loadUrl(f.K);
    this.k.requestLayout();
    this.k.postInvalidate();
    changeLookFace(this.mLookFace);
  }
  
  public void onClick(View paramView)
  {
    Bundle localBundle = new Bundle();
    Object localObject = null;
    ArrayList localArrayList = MarketManager.get().getChildList("决策");
    switch (paramView.getId())
    {
    default: 
      paramView = (View)localObject;
    }
    for (;;)
    {
      paramView.putExtras(localBundle);
      startActivity(paramView);
      return;
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(0));
      paramView = new Intent(this, MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "DDE决策");
      continue;
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(1));
      paramView = new Intent(this, MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "个股资金");
      continue;
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(2));
      paramView = new Intent(this, MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "板块资金");
      continue;
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(3));
      paramView = new Intent(this, MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "5分钟涨幅");
      continue;
      paramView = new Intent(this, ProfitExpectedScreen.class);
      MarketManager.get().setStatisticsUserAction("", "盈利预期");
      continue;
      paramView = new Intent(this, MessageWarnScreen.class);
      MarketManager.get().setStatisticsUserAction("", "股价预警");
      continue;
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(6));
      paramView = new Intent(this, MarketListScreenActivity.class);
      MarketManager.get().setStatisticsUserAction("", "阶段统计");
      continue;
      paramView = new Intent(this, MarketFocusScreen.class);
      localBundle.putParcelable("market_vo", (MarketVo)localArrayList.get(7));
      paramView.putExtras(localBundle);
      MarketManager.get().setStatisticsUserAction("", "交易关注");
      continue;
      paramView = new Intent(this, MorningPostScreen.class);
      MarketManager.get().setStatisticsUserAction("", "异动主题");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\DecisionScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */