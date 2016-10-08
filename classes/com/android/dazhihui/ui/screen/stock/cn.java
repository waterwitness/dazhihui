package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.model.stock.KLineDataLayVo;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import com.android.dazhihui.ui.widget.stockchart.KlineDataLay;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import java.io.UnsupportedEncodingException;

public class cn
  extends e
{
  protected String a;
  protected String b;
  private PartScrollView c;
  private KlineDataLay d;
  private RelativeLayout e;
  private PageLoadTip f;
  private View g;
  private f h;
  private StockChartContainer i;
  
  public String a()
  {
    String str1 = this.a.trim();
    String str2 = str1.substring(0, 2);
    str2 = str2 + "/" + str1.substring(str1.length() - 2) + "/";
    return str2 + str1.substring(2);
  }
  
  public void a(StockChartContainer paramStockChartContainer)
  {
    this.i = paramStockChartContainer;
  }
  
  public void a(boolean paramBoolean)
  {
    String str = "http://mnews.gw.com.cn//wap/data/ipad/stock/" + a() + "/f10/F10_Sjm.json";
    this.h = new f();
    this.h.c(str);
    this.h.a(this);
    com.android.dazhihui.a.g.a().a(this.h);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (cp.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.d == null);
      this.d.a(paramy);
      return;
    } while (this.d == null);
    this.d.a(paramy);
  }
  
  public View getScroolView()
  {
    return this.c;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {}
    do
    {
      do
      {
        return;
      } while (!(paramj instanceof com.android.dazhihui.a.b.g));
      paramj = (com.android.dazhihui.a.b.g)paramj;
    } while (paramh != this.h);
    paramh = new KLineDataLayVo();
    try
    {
      paramh.decode(new String(paramj.a(), "UTF-8"));
      this.d.a(paramh, this);
      this.f.setVisibility(8);
      this.d.setVisibility(0);
      return;
    }
    catch (UnsupportedEncodingException paramh)
    {
      this.f.setShowType(2);
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.d.setParetView(this.g.getParent());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.a = paramBundle.getString("code");
    this.b = paramBundle.getString("name");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.g = paramLayoutInflater.inflate(2130903120, paramViewGroup, false);
    this.c = ((PartScrollView)this.g.findViewById(2131558939));
    this.e = ((RelativeLayout)this.g.findViewById(2131558940));
    this.d = ((KlineDataLay)this.g.findViewById(2131558941));
    this.d.a(this.a, this.b);
    this.d.setTag(this.i);
    this.f = ((PageLoadTip)this.g.findViewById(2131558942));
    this.f.setOnClickListener(new co(this));
    if (!com.android.dazhihui.a.g.a().o())
    {
      this.f.setVisibility(0);
      this.f.setShowType(2);
    }
    for (;;)
    {
      changeLookFace(this.mLookFace);
      return this.g;
      if (!this.d.a())
      {
        a(true);
        this.f.setShowType(0);
        this.f.setVisibility(0);
        this.d.setVisibility(8);
      }
      else
      {
        this.f.setVisibility(8);
        this.d.setVisibility(0);
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.mLookFace == y.b) {
      this.g.setBackgroundColor(getResources().getColor(2131493677));
    }
  }
  
  public void refresh()
  {
    if (isVisible()) {
      a(true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */