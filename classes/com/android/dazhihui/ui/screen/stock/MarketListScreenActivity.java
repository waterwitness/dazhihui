package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.text.TextUtils;
import android.view.View;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.a.l;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.hd;
import java.util.ArrayList;

public class MarketListScreenActivity
  extends BaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private MarketVo b;
  private l c;
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      startActivity(new Intent(this, SearchStockScreen.class));
      continue;
      this.c.refresh();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (in.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    MarketManager localMarketManager = MarketManager.get();
    if ((this.b != null) && (this.b.isMenu()) && (localMarketManager.getChildList(this.b.getName()) != null) && (localMarketManager.getChildList(this.b.getName()).size() > 1))
    {
      paramct.a = 8776;
      paramct.d = this.b.getName();
      paramct.i = new hd(paramContext, localMarketManager.getChildList(this.b.getName()));
      paramct.j = new im(this);
    }
    for (;;)
    {
      return;
      paramct.a = 10280;
      paramct.k = paramContext.getResources().getDrawable(2130838123);
      if (this.b != null) {
        if ((this.b.getId() != 20296) && (this.b.getId() != 20297)) {
          break label190;
        }
      }
      label190:
      for (paramct.d = getResources().getString(2131166024); TextUtils.isEmpty(paramct.d); paramct.d = this.b.getName())
      {
        paramct.d = "市场列表";
        return;
      }
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903276);
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (this.b == null)) {
      this.b = ((MarketVo)paramBundle.getParcelable("market_vo"));
    }
    if (this.b == null)
    {
      finish();
      return;
    }
    this.c = MarketManager.get().createFragment(paramBundle, this.b);
    getSupportFragmentManager().a().a(2131559106, this.c, "MarketBaseFragment").b();
    this.a = ((DzhHeader)findViewById(2131559836));
    this.a.setOnHeaderButtonClickListener(this);
    this.a.a(this, this);
    this.c.getTitle(this.a);
    changeLookFace(this.mLookFace);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.c != null) {
      this.c.refresh();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MarketListScreenActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */