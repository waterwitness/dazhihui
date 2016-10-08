package com.android.dazhihui.ui.screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.KlineStockNewsAdapter;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import java.util.ArrayList;

public class StockAllNewsActivity
  extends BaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private NoScrollListView b;
  private KlineStockNewsAdapter c;
  private ArrayList<StockNewItem> d;
  private StockNewsVo e;
  private StockVo f;
  private String g;
  private int h;
  private String i = "http://mnews.gw.com.cn/wap/data/ipad/stock/";
  private String j = "list/1.json";
  private f k;
  private LinearLayout.LayoutParams l;
  private Bundle m;
  private String n;
  private LoadAndRefreshView o;
  
  private void a(String paramString)
  {
    this.k = new f();
    this.k.c(paramString);
    this.k.a(this);
    sendRequest(this.k);
  }
  
  private void a(String paramString1, String paramString2)
  {
    if (this.e == null) {
      this.e = new StockNewsVo();
    }
    this.e.setCurPage(paramString1);
    if (paramString2 != null)
    {
      this.e.decode(paramString2);
      if (this.e.getError() == 0)
      {
        this.d = this.e.getNews();
        DzhApplication.a().b().a(this.g, "dzhcahe", this.e);
      }
      this.c = new KlineStockNewsAdapter(this, this.d, this.e, false);
      this.b.setAdapter(this.c);
      this.c.refresh(false);
      int i1 = b();
      Log.e("BigStock", "listview height:" + i1);
      if ((this.d != null) && (this.d.size() != 0)) {
        break label166;
      }
    }
    label166:
    while ((this.e.getLastPage() == null) || (this.e.getLastPage().equals(this.e.getCurPage()))) {
      return;
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void a()
  {
    this.e = null;
    if (this.f != null) {}
    for (this.g = this.f.getCode();; this.g = this.n)
    {
      this.h = n.o(this.g);
      if (((!n.k(this.g)) && (this.h == 1)) || (this.h == 0)) {
        a(this.i + this.g.substring(0, 2) + "/" + this.g.substring(this.g.length() - 2) + "/" + this.g.substring(2) + "/" + this.j);
      }
      return;
    }
  }
  
  public int b()
  {
    int i3 = this.c.getCount();
    int i1 = 0;
    int i2 = 0;
    while (i1 < i3)
    {
      View localView = this.c.getView(i1, null, this.b);
      localView.measure(0, 0);
      i2 += localView.getMeasuredHeight() + this.b.getDividerHeight();
      i1 += 1;
    }
    this.l = new LinearLayout.LayoutParams(-1, -2);
    this.l.height = i2;
    return i2;
  }
  
  protected void changeLookFace(y paramy)
  {
    if (paramy == y.a) {
      this.o.setBackgroundColor(-15789289);
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.notifyDataSetChanged();
      }
      return;
      this.o.setBackgroundColor(getResources().getColor(2131493677));
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "个股资讯";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    do
    {
      do
      {
        return;
      } while (!(paramj instanceof g));
      paramj = (g)paramj;
    } while ((paramh == null) || (paramh != this.k));
    paramh = new String(paramj.a());
    a(this.k.o(), paramh);
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903433);
    this.a = ((DzhHeader)findViewById(2131558513));
    this.o = ((LoadAndRefreshView)findViewById(2131558779));
    this.o.a(true, true);
    this.o.setOnHeaderRefreshListener(new af(this));
    this.o.setOnFooterLoadListener(new ag(this));
    this.b = ((NoScrollListView)findViewById(2131560478));
    this.a.a(this, this);
    this.m = getIntent().getExtras();
    this.f = ((StockVo)this.m.getParcelable("stock_vo"));
    this.n = this.m.getString("stockCode");
    a();
    this.b.setDivider(getResources().getDrawable(2131493692));
    this.b.setDividerHeight(1);
    this.b.setOnItemClickListener(new ah(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\StockAllNewsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */