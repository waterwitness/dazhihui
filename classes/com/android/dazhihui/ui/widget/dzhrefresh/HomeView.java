package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.android.dazhihui.ui.widget.HomeListView;
import com.android.dazhihui.ui.widget.IndexTopLayout;
import com.android.dazhihui.ui.widget.SelfStockSortMenuLayout;
import com.android.dazhihui.ui.widget.adv.AdvertView;

public class HomeView
  extends RelativeLayout
{
  private IndexTopLayout a;
  private SelfStockSortMenuLayout b;
  private AdvertView c;
  private HomeListView d;
  
  public HomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    b(paramContext, paramAttributeSet);
    c(paramContext, paramAttributeSet);
    d(paramContext, paramAttributeSet);
    e(paramContext, paramAttributeSet);
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.a = new IndexTopLayout(paramContext, paramAttributeSet);
    this.a.setId(2131558409);
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(10);
    addView(this.a, paramContext);
  }
  
  private void c(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.b = new SelfStockSortMenuLayout(paramContext, paramAttributeSet);
    this.b.setId(2131558408);
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(3, 2131558409);
    addView(this.b, paramContext);
  }
  
  private void d(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.c = new AdvertView(paramContext, paramAttributeSet);
    this.c.setId(2131558406);
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(12);
    addView(this.c, paramContext);
    this.c.setVisibility(8);
  }
  
  private void e(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.d = new HomeListView(paramContext, paramAttributeSet);
    this.d.setId(2131558407);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(3, 2131558408);
    paramContext.addRule(2, 2131558406);
    addView(this.d, paramContext);
  }
  
  public AdvertView getAdv103()
  {
    return this.c;
  }
  
  public HomeListView getHomeListView()
  {
    return this.d;
  }
  
  public SelfStockSortMenuLayout getSortLayout()
  {
    return this.b;
  }
  
  public IndexTopLayout getTopLayout()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\HomeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */